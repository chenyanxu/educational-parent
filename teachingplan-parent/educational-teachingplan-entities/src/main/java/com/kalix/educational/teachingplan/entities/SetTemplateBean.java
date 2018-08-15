package com.kalix.educational.teachingplan.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by Administrator_ on 2018/6/13.
 * 理论课程实体类
 */

@Entity
@Table(name = "edu_set_template_info")
public class SetTemplateBean extends PersistentEntity {
    private String mbdm;   // 模板代码
    private String mbmc;   // 模板名称
    private Integer kchj;   // 课程环节
    private Integer kclb1; // 课程类别1，字典[课程类别1]
    private Integer kclb2; // 课程类别2，字典[课程类别2]
    private Integer kclb3; // 课程类别3，字典[课程类别3]
    private Integer zt;  //   状态
    private Integer zxfx;  // 主修辅修
    private String bz  ;   // 备注

    public String getMbdm() {
        return mbdm;
    }

    public void setMbdm(String mbdm) {
        this.mbdm = mbdm;
    }

    public String getMbmc() {
        return mbmc;
    }

    public void setMbmc(String mbmc) {
        this.mbmc = mbmc;
    }

    public Integer getKchj() {
        return kchj;
    }

    public void setKchj(Integer kchj) {
        this.kchj = kchj;
    }

    public Integer getKclb1() {
        return kclb1;
    }

    public void setKclb1(Integer kclb1) {
        this.kclb1 = kclb1;
    }

    public Integer getKclb2() {
        return kclb2;
    }

    public void setKclb2(Integer kclb2) {
        this.kclb2 = kclb2;
    }

    public Integer getKclb3() {
        return kclb3;
    }

    public void setKclb3(Integer kclb3) {
        this.kclb3 = kclb3;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Integer getZxfx() {
        return zxfx;
    }

    public void setZxfx(Integer zxfx) {
        this.zxfx = zxfx;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
