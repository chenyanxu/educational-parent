package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * Created by zangyanming on 2018/8/2.
 */
@Entity
@Table(name = "educational_textbook_basic_publisher")
public class PublisherBean extends PersistentEntity {
    private String pressCode;//代码
    private String fullName;//名称
    private String abbrName;//简称

    public String getPressCode() {
        return pressCode;
    }

    public void setPressCode(String pressCode) {
        this.pressCode = pressCode;
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
}
