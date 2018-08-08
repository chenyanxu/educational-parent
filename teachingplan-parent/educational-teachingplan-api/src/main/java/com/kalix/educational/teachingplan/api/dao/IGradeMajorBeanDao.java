package com.kalix.educational.teachingplan.api.dao;

import com.kalix.educational.teachingplan.entities.GradeMajorBean;
import com.kalix.framework.core.api.dao.IGenericDao;

/**
 * 年级专业关联DAO接口
 *
 * @author hqj <br/>
 *         date:2018-8-7
 * @version 1.0.0
 */
public interface IGradeMajorBeanDao extends IGenericDao<GradeMajorBean, Long> {
    void deleteByGradeId(Long id);
}
