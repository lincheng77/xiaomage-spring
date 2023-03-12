package edkso.cn.ioc.overview.repository;

import edkso.cn.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;

import java.util.Collection;

/**
 * 用户信息仓库
 * @author dingmengdi
 */
public class UserRepository {
    private Collection<User> users;

    private BeanFactory beanFactory;

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("正在注入--setBeanFactory");
        this.beanFactory = beanFactory;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        System.out.println("正在注入--setUsers");
        this.users = users;
    }


}
