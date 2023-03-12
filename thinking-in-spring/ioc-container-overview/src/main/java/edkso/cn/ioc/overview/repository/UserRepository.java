package edkso.cn.ioc.overview.repository;

import edkso.cn.ioc.overview.domain.User;

import java.util.Collection;

/**
 * 用户信息仓库
 * @author dingmengdi
 */
public class UserRepository {
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }


}
