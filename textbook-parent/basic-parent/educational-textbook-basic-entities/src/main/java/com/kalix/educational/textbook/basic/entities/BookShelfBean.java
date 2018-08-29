package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 书架
 * Created by zangyanming on 2018/8/6.
 */
@Entity
@Table(name = "edu_textbook_basic_bookshelf")
public class BookShelfBean extends PersistentEntity {
    private String code;//代码
    private Long sarea;//所属校区
    @Transient
    private String sareaName;//所属校区
    private Long rcode;//所属库房
    @Transient
    private String rcodeName;//所属库房
    private String bcname;//
    private String user_code;//书架号

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getSarea() {
        return sarea;
    }

    public void setSarea(Long sarea) {
        this.sarea = sarea;
    }

    public String getSareaName() {
        return sareaName;
    }

    public void setSareaName(String sareaName) {
        this.sareaName = sareaName;
    }

    public Long getRcode() {
        return rcode;
    }

    public void setRcode(Long rcode) {
        this.rcode = rcode;
    }

    public String getRcodeName() {
        return rcodeName;
    }

    public void setRcodeName(String rcodeName) {
        this.rcodeName = rcodeName;
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
