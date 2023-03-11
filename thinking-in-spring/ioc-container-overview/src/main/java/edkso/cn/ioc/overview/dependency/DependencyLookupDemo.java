package edkso.cn.ioc.overview.dependency;

import edkso.cn.ioc.overview.annotation.Super;
import edkso.cn.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @author dingmengdi
 */
public class DependencyLookupDemo {

    public static void main(String[] args) throws InterruptedException {
        //配置XML配置文件
        //启动 Spring 应用上下文

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-demo.xml");
        Thread.sleep(1000*3);
        lookInRealTime(beanFactory);
        lookInLazy(beanFactory);
        lookByType(beanFactory);
        lookCollectionByType(beanFactory);
        lookByAnnotationType(beanFactory);
    }

    private static void lookByAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = (Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("通过注解查找集合：" + users);
        }
    }

    private static void lookCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("通过类型查找集合：" + users);
        }
    }

    private static void lookByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("通过类型查找：" + user);
    }

    private static void lookInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延迟查找：" + user);
    }

    private static void lookInRealTime(BeanFactory beanFactory) {
        User user = (User) beanFactory.getBean("user");
        System.out.println("实时查找：" + user);
    }
}
