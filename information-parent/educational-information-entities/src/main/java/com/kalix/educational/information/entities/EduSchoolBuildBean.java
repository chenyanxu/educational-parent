package com.kalix.educational.information.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 角色用户关联实体类
 * @author majian <br/>
 *         date:2015-7-24
 * @version 1.0.0
 */
@Entity
@Table(name = "edu_school_build")
public class EduSchoolBuildBean extends PersistentEntity {

    private String name;
    private Long szxq;
    @Transient
    private String xqmc;
    private String type;
    private String lcs;
    private Long zt;

    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSzxq() {
        return szxq;
    }

    public void setSzxq(Long szxq) {
        this.szxq = szxq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLcs() {
        return lcs;
    }

    public void setLcs(String lcs) {
        this.lcs = lcs;
    }

    public Long getZt() {
        return zt;
    }

    public void setZt(Long zt) {
        this.zt = zt;
    }
}
