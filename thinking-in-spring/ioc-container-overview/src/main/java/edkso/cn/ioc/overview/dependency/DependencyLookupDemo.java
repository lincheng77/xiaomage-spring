package edkso.cn.ioc.overview.dependency;

import edkso.cn.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dingmengdi
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        //配置XML配置文件
        //启动 Spring 应用上下文

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-demo.xml");
        User user = (User) beanFactory.getBean("user");

        System.out.println(user);
    }
}
