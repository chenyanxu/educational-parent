package com.kalix.educational.teachingplan.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * Created by Administrator_ on 2018/7/26.
 * 年级专业设置实体类
 */

@Entity
@Table(name = "edu_set_professional")
public class SetProfessionalBean extends PersistentEntity {
    private Long majorId; // 专业id
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date grade;   // 年级

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Date getGrade() {
        return grade;
    }

    public void setGrade(Date grade) {
        this.grade = grade;
    }
}
