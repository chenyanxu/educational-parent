package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 书架
 * Created by zangyanming on 2018/8/6.
 */
@Entity
@Table(name = "edu_textbook_basic_bookshelf")
public class BookShelfBean extends PersistentEntity {
    private String code;//代码
    private String sarea;//所属校区
    private String rcode;//所属库房
    private String bcname;//
    private String user_code;//书架号

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSarea() {
        return sarea;
    }

    public void setSarea(String sarea) {
        this.sarea = sarea;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getBcname() {
        return bcname;
    }

    public void setBcname(String bcname) {
        this.bcname = bcname;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }
}
