package com.kalix.educational.arrangement.biz;

import com.kalix.educational.arrangement.api.biz.ISchoolCalendarBeanService;
import com.kalix.educational.arrangement.api.dao.ISchoolCalendarBeanDao;
import com.kalix.educational.arrangement.entities.SchoolCalendarBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class SchoolCalendarBeanServiceImpl extends ShiroGenericBizServiceImpl<ISchoolCalendarBeanDao, SchoolCalendarBean> implements ISchoolCalendarBeanService {
}
