package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 供书单位
 * Created by zangyanming on 2018/8/3.
 */
@Entity
@Table(name = "edu_textbook_basic_provider")
public class ProviderBean extends PersistentEntity {
    private String code;//单位代码
    private String fullName;//单位名称
    private String abbrName;//简称
    private String telNo1;//电话
    private String contact;//联系人
    private String fax;//传真
    private String zipCode;//邮编
    private String email;//电子信箱
    private String bankName;//开户行
    private String account;//账号
    private String taxNo;//税号
    private String address;//地址
    private String flag;//是否为印刷厂

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public String getTelNo1() {
        return telNo1;
    }

    public void setTelNo1(String telNo1) {
        this.telNo1 = telNo1;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
