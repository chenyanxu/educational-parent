package com.kalix.educational.teachingplan.biz;

import com.kalix.educational.teachingplan.api.biz.IGradeBeanService;
import com.kalix.educational.teachingplan.api.dao.IGradeBeanDao;
import com.kalix.educational.teachingplan.entities.GradeBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class GradeBeanServiceImpl extends ShiroGenericBizServiceImpl<IGradeBeanDao, GradeBean> implements IGradeBeanService {
}
