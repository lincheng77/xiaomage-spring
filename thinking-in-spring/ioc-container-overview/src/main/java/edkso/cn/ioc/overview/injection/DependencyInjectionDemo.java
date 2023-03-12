package edkso.cn.ioc.overview.injection;

import edkso.cn.ioc.overview.annotation.Super;
import edkso.cn.ioc.overview.domain.User;
import edkso.cn.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;
import java.util.Map;

/**
 * @author dingmengdi
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) throws InterruptedException {
        //配置XML配置文件
        //启动 Spring 应用上下文

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-demo.xml");
        UserRepository userRepository = (UserRepository) beanFactory.getBean("userRepository");
        System.out.println(userRepository.getUsers());
    }




}
