package com.kalix.educational.textbook.basic.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 经办人
 * Created by zangyanming on 2018/8/6.
 */
@Entity
@Table(name = "edu_textbook_basic_handman")
public class HandmanBean extends PersistentEntity {
    private String code;//代码
    private String name;//姓名
    private String memo;//备注

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
