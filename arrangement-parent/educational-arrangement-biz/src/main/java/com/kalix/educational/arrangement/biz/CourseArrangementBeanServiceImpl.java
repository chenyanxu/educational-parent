package com.kalix.educational.arrangement.biz;

import com.kalix.educational.arrangement.api.biz.ICourseArrangementBeanService;
import com.kalix.educational.arrangement.api.dao.ICourseArrangementBeanDao;
import com.kalix.educational.arrangement.entities.CourseArrangementBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class CourseArrangementBeanServiceImpl extends ShiroGenericBizServiceImpl<ICourseArrangementBeanDao, CourseArrangementBean> implements ICourseArrangementBeanService {
}
