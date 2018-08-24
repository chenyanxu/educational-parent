package com.kalix.educational.teachingevaluation.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator_ on 2018/8/20.
 */
@Entity
@Table(name = "edu_evaluation_indexgrade")
public class IndexGradeBean  extends PersistentEntity {

    private String code;   //代码
    private String Name; //名称

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
