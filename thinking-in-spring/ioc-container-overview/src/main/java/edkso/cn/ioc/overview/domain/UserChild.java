package edkso.cn.ioc.overview.domain;

import edkso.cn.ioc.overview.annotation.Super;

/**
 * @author dingmengdi
 */

@Super
public class UserChild extends User{

    private String parent;

    @Override
    public String toString() {
        return "UserChild{" +
                "parent='" + parent + '\'' +
                '}';
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
