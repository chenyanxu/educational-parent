package com.kalix.educational.teachingplan.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator_ on 2018/6/13.
 */

@Entity
@Table(name = "educational_practice_info")
public class PracticeInfoBean extends PersistentEntity {


    private String kcdm;
    private String zwmc;
    private String ywmc;
    private Double zxf;
    private Double zxs;
    private Long kclb;
    private String jxdg;
    private String cddw;

    public String getCddw() {
        return cddw;
    }

    public void setCddw(String cddw) {
        this.cddw = cddw;
    }

    public String getJxdg() {
        return jxdg;
    }

    public void setJxdg(String jxdg) {
        this.jxdg = jxdg;
    }

    public String getKcdm() {
        return kcdm;
    }

    public void setKcdm(String kcdm) {
        this.kcdm = kcdm;
    }

    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc;
    }

    public String getYwmc() {
        return ywmc;
    }

    public void setYwmc(String ywmc) {
        this.ywmc = ywmc;
    }

    public Double getZxf() {
        return zxf;
    }

    public void setZxf(Double zxf) {
        this.zxf = zxf;
    }

    public Double getZxs() {
        return zxs;
    }

    public void setZxs(Double zxs) {
        this.zxs = zxs;
    }

    public Long getKclb() {
        return kclb;
    }

    public void setKclb(Long kclb) {
        this.kclb = kclb;
    }
}
