package com.kalix.educational.information.biz;

import com.kalix.educational.information.api.biz.IEduSchoolBuildBeanService;
import com.kalix.educational.information.api.biz.IEduSchoolInfoBeanService;
import com.kalix.educational.information.api.biz.IEduSchoolZoneBeanService;
import com.kalix.educational.information.api.dao.IEduSchoolBuildBeanDao;
import com.kalix.educational.information.api.dao.IEduSchoolInfoBeanDao;
import com.kalix.educational.information.entities.EduSchoolBuildBean;
import com.kalix.educational.information.entities.EduSchoolInfoBean;
import com.kalix.educational.information.entities.EduSchoolZoneBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class EduSchoolBuildBeanServiceImpl extends ShiroGenericBizServiceImpl<IEduSchoolBuildBeanDao, EduSchoolBuildBean> implements IEduSchoolBuildBeanService {
    private IEduSchoolZoneBeanService eduSchoolZoneBeanServiceImpl;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i=0; i<jsonData.getData().size(); i++) {
            EduSchoolBuildBean eduSchoolBuildBean = (EduSchoolBuildBean) jsonData.getData().get(i);
            EduSchoolZoneBean eduSchoolZoneBean = eduSchoolZoneBeanServiceImpl.getEntity(eduSchoolBuildBean.getSzxq());
            eduSchoolBuildBean.setXqmc(eduSchoolZoneBean.getZwmc());
        }
        return jsonData;
    }

    public void setEduSchoolZoneBeanService(IEduSchoolZoneBeanService eduSchoolZoneBeanService) {
        this.eduSchoolZoneBeanServiceImpl = eduSchoolZoneBeanService;
    }
}
