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
@Table(name = "T_ZY_Schoolinfo")
public class SchoolInfoBean extends PersistentEntity {

    private String DM;
    private String ZWMC;
    private String ZWJC;
    private String YWMC;
    private String YWJC;
    private String XXXZ_ID;
    private String XXLB_ID;
    private String ZGBM;
    private String XZ;
    private String SJ;
    private String LXR;
    private String DH;
    private String CZ;
    private String DZYJ;
    private String WZ;
    private String DZ;
    private String YB;
    private String Jxgl_flag;
    private String PZWH;
    private String user_dm;
    private String railwaystation;

    public String getDM() {
        return DM;
    }

    public void setDM(String DM) {
        this.DM = DM;
    }

    public String getZWMC() {
        return ZWMC;
    }

    public void setZWMC(String ZWMC) {
        this.ZWMC = ZWMC;
    }

    public String getZWJC() {
        return ZWJC;
    }

    public void setZWJC(String ZWJC) {
        this.ZWJC = ZWJC;
    }

    public String getYWMC() {
        return YWMC;
    }

    public void setYWMC(String YWMC) {
        this.YWMC = YWMC;
    }

    public String getYWJC() {
        return YWJC;
    }

    public void setYWJC(String YWJC) {
        this.YWJC = YWJC;
    }

    public String getXXXZ_ID() {
        return XXXZ_ID;
    }

    public void setXXXZ_ID(String XXXZ_ID) {
        this.XXXZ_ID = XXXZ_ID;
    }

    public String getXXLB_ID() {
        return XXLB_ID;
    }

    public void setXXLB_ID(String XXLB_ID) {
        this.XXLB_ID = XXLB_ID;
    }

    public String getZGBM() {
        return ZGBM;
    }

    public void setZGBM(String ZGBM) {
        this.ZGBM = ZGBM;
    }

    public String getXZ() {
        return XZ;
    }

    public void setXZ(String XZ) {
        this.XZ = XZ;
    }

    public String getSJ() {
        return SJ;
    }

    public void setSJ(String SJ) {
        this.SJ = SJ;
    }

    public String getLXR() {
        return LXR;
    }

    public void setLXR(String LXR) {
        this.LXR = LXR;
    }

    public String getDH() {
        return DH;
    }

    public void setDH(String DH) {
        this.DH = DH;
    }

    public String getCZ() {
        return CZ;
    }

    public void setCZ(String CZ) {
        this.CZ = CZ;
    }

    public String getDZYJ() {
        return DZYJ;
    }

    public void setDZYJ(String DZYJ) {
        this.DZYJ = DZYJ;
    }

    public String getWZ() {
        return WZ;
    }

    public void setWZ(String WZ) {
        this.WZ = WZ;
    }

    public String getDZ() {
        return DZ;
    }

    public void setDZ(String DZ) {
        this.DZ = DZ;
    }

    public String getYB() {
        return YB;
    }

    public void setYB(String YB) {
        this.YB = YB;
    }

    public String getJxgl_flag() {
        return Jxgl_flag;
    }

    public void setJxgl_flag(String jxgl_flag) {
        Jxgl_flag = jxgl_flag;
    }

    public String getPZWH() {
        return PZWH;
    }

    public void setPZWH(String PZWH) {
        this.PZWH = PZWH;
    }

    public String getUser_dm() {
        return user_dm;
    }

    public void setUser_dm(String user_dm) {
        this.user_dm = user_dm;
    }

    public String getRailwaystation() {
        return railwaystation;
    }

    public void setRailwaystation(String railwaystation) {
        this.railwaystation = railwaystation;
    }
}
