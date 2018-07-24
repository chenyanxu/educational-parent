package com.kalix.educational.information.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 角色用户关联实体类
 * @author majian <br/>
 *         date:2015-7-24
 * @version 1.0.0
 */
@Entity
@Table(name = "educational_school_zone")
public class EduSchoolZoneBean extends PersistentEntity {

    private String xqdm;
    private String zwmc;
    private String zwjc;
    private String dz;
    private String yb;
    private String hcz;

    public String getXqdm() {
        return xqdm;
    }

    public void setXqdm(String xqdm) {
        this.xqdm = xqdm;
    }

    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc;
    }

    public String getZwjc() {
        return zwjc;
    }

    public void setZwjc(String zwjc) {
        this.zwjc = zwjc;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getYb() {
        return yb;
    }

    public void setYb(String yb) {
        this.yb = yb;
    }

    public String getHcz() {
        return hcz;
    }

    public void setHcz(String hcz) {
        this.hcz = hcz;
    }
}
