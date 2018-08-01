package com.kalix.educational.teachingplan.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator_ on 2018/6/13.
 */

@Entity
@Table(name = "educational_lesson_info")
public class LessonInfoBean extends PersistentEntity {


    private String kcdm; // 课程代码
    private String zwmc; // 中文名称
    private String ywmc; // 英文名称
    private Double zxf; // 总学分
    private Double zxs; // 总学时
    private Integer syxs; // 课内实践
    private Integer jsxs; // 理论学时
    private Integer kclb; //课程类别
    private Integer sjxs; // 课外学时
    private Integer qtxs; // 其他学时
    private String jxdg; // 教学大纲
    private Integer cddw; // 承担单位

    public Integer getCddw() {
        return cddw;
    }

    public void setCddw(Integer cddw) {
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

    public Integer getSyxs() {
        return syxs;
    }

    public void setSyxs(Integer syxs) {
        this.syxs = syxs;
    }

    public Integer getJsxs() {
        return jsxs;
    }

    public void setJsxs(Integer jsxs) {
        this.jsxs = jsxs;
    }

    public Integer getKclb() {
        return kclb;
    }

    public void setKclb(Integer kclb) {
        this.kclb = kclb;
    }

    public Integer getSjxs() {
        return sjxs;
    }

    public void setSjxs(Integer sjxs) {
        this.sjxs = sjxs;
    }

    public Integer getQtxs() {
        return qtxs;
    }

    public void setQtxs(Integer qtxs) {
        this.qtxs = qtxs;
    }


}
