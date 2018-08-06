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
@Table(name = "edu_teach_space")
public class EduTeachSpaceBean extends PersistentEntity {

    private Long szxqid;  // 所在校区
    @Transient
    private String szxqname;  // 所在校区
    private Long loufang; //楼房
    @Transient
    private String loufangname; //楼房
    private String lc      ;//楼层
    private String mph     ;//门牌号
    private String mc      ;//名称
    private Integer type    ;//类型
    private String rl      ;//容量
    private Long zt       ;//状态
    private Long sydw    ;//使用单位
    private String symj    ;//使用面积
    private String mrgcrl  ;//默认考场容量
    private String bz      ;//备注
    private String sys     ;//实验室
    private String zdmj    ;//占地面积
    private String yxbm    ;//院（系）/部
    private Long cdlx     ;//场地类型
    private String jzmj   ;//建筑面积

    public String getJzmj() {
        return jzmj;
    }

    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getZdmj() {
        return zdmj;
    }

    public void setZdmj(String zdmj) {
        this.zdmj = zdmj;
    }

    public String getYxbm() {
        return yxbm;
    }

    public void setYxbm(String yxbm) {
        this.yxbm = yxbm;
    }

    public Long getCdlx() {
        return cdlx;
    }

    public void setCdlx(Long cdlx) {
        this.cdlx = cdlx;
    }

    public String getSzxqname() {
        return szxqname;
    }

    public void setSzxqname(String szxqname) {
        this.szxqname = szxqname;
    }

    public String getLoufangname() {
        return loufangname;
    }

    public void setLoufangname(String loufangname) {
        this.loufangname = loufangname;
    }

    public Long getSzxqid() {
        return szxqid;
    }

    public void setSzxqid(Long szxqid) {
        this.szxqid = szxqid;
    }

    public Long getLoufang() {
        return loufang;
    }

    public void setLoufang(Long loufang) {
        this.loufang = loufang;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }


    public String getRl() {
        return rl;
    }

    public void setRl(String rl) {
        this.rl = rl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getZt() {
        return zt;
    }

    public void setZt(Long zt) {
        this.zt = zt;
    }

    public Long getSydw() {
        return sydw;
    }

    public void setSydw(Long sydw) {
        this.sydw = sydw;
    }

    public String getSymj() {
        return symj;
    }

    public void setSymj(String symj) {
        this.symj = symj;
    }

    public String getMrgcrl() {
        return mrgcrl;
    }

    public void setMrgcrl(String mrgcrl) {
        this.mrgcrl = mrgcrl;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
