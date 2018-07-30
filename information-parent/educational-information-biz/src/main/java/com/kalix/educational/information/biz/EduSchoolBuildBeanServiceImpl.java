package com.kalix.educational.information.biz;

import com.kalix.educational.information.api.biz.IEduSchoolBuildBeanService;
import com.kalix.educational.information.api.dao.IEduSchoolBuildBeanDao;
import com.kalix.educational.information.entities.EduSchoolBuildBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.general.org.api.biz.ISchoolZoneBeanService;
import com.kalix.general.org.entities.SchoolZoneBean;

/**
 * Created by fj on 2017-8-17.
 */
public class EduSchoolBuildBeanServiceImpl extends ShiroGenericBizServiceImpl<IEduSchoolBuildBeanDao, EduSchoolBuildBean> implements IEduSchoolBuildBeanService {
    private ISchoolZoneBeanService eduSchoolZoneBeanServiceImpl;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            EduSchoolBuildBean eduSchoolBuildBean = (EduSchoolBuildBean) jsonData.getData().get(i);
            SchoolZoneBean eduSchoolZoneBean = eduSchoolZoneBeanServiceImpl.getEntity(eduSchoolBuildBean.getSzxq());
            eduSchoolBuildBean.setXqmc(eduSchoolZoneBean.getZwmc());
        }
        return jsonData;
    }

    public void setEduSchoolZoneBeanService(ISchoolZoneBeanService eduSchoolZoneBeanService) {
        this.eduSchoolZoneBeanServiceImpl = eduSchoolZoneBeanService;
    }
}
