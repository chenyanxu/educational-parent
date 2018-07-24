package com.kalix.educational.information.biz;

import com.kalix.educational.information.api.biz.IEduSchoolInfoBeanService;
import com.kalix.educational.information.api.biz.IEduSchoolZoneBeanService;
import com.kalix.educational.information.api.dao.IEduSchoolInfoBeanDao;
import com.kalix.educational.information.api.dao.IEduSchoolZoneBeanDao;
import com.kalix.educational.information.entities.EduSchoolInfoBean;
import com.kalix.educational.information.entities.EduSchoolZoneBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class EduSchoolZoneBeanServiceImpl extends ShiroGenericBizServiceImpl<IEduSchoolZoneBeanDao, EduSchoolZoneBean> implements IEduSchoolZoneBeanService {

}
