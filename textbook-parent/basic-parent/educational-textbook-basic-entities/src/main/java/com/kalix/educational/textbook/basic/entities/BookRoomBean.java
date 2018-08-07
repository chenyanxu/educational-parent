package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 库房
 * Created by zangyanming on 2018/8/6.
 */
@Entity
@Table(name = "edu_textbook_basic_bookroom")
public class BookRoomBean extends PersistentEntity {
    private String code;//代码
    private String name;//名称
    private String sarea;//所属校区
    private String agent;//联系人
    private String tel;//电话
    private String fax;//传真
    private String email;//电子信箱

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSarea() {
        return sarea;
    }

    public void setSarea(String sarea) {
        this.sarea = sarea;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
