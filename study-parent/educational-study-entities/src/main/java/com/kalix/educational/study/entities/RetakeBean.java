package com.kalix.educational.study.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by Administrator_ on 2018/6/13.
 * 重修实体类
 */

@Entity
@Table(name = "edu_study_retake")
public class RetakeBean extends PersistentEntity {

}
