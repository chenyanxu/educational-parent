package com.kalix.educational.information.biz;

import com.kalix.educational.information.api.biz.IEduSchoolBuildBeanService;
import com.kalix.educational.information.api.biz.IEduTeachSpaceBeanService;
import com.kalix.educational.information.api.dao.IEduTeachSpaceBeanDao;
import com.kalix.educational.information.entities.EduSchoolBuildBean;
import com.kalix.educational.information.entities.EduTeachSpaceBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.general.org.api.biz.ISchoolZoneBeanService;
import com.kalix.general.org.entities.SchoolZoneBean;

/**
 * Created by fj on 2017-8-17.
 */
public class EduTeachSpaceBeanServiceImpl extends ShiroGenericBizServiceImpl<IEduTeachSpaceBeanDao, EduTeachSpaceBean> implements IEduTeachSpaceBeanService {
    private ISchoolZoneBeanService eduSchoolZoneBeanServiceImpl;
    private IEduSchoolBuildBeanService eduSchoolBuildBeanServiceImpl;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            EduTeachSpaceBean eduTeachSpaceBean = (EduTeachSpaceBean) jsonData.getData().get(i);
            SchoolZoneBean eduSchoolZoneBean = eduSchoolZoneBeanServiceImpl.getEntity(eduTeachSpaceBean.getSzxqid());
            EduSchoolBuildBean eduSchoolBuildBean = eduSchoolBuildBeanServiceImpl.getEntity(eduTeachSpaceBean.getLoufang());
            eduTeachSpaceBean.setSzxqname(eduSchoolZoneBean.getZwmc());
            eduTeachSpaceBean.setLoufangname(eduSchoolBuildBean.getName());
        }
        return jsonData;
    }

    public void setEduSchoolBuildBeanServiceImpl(IEduSchoolBuildBeanService eduSchoolBuildBeanServiceImpl) {
        this.eduSchoolBuildBeanServiceImpl = eduSchoolBuildBeanServiceImpl;
    }

    public void setEduSchoolZoneBeanService(ISchoolZoneBeanService eduSchoolZoneBeanService) {
        this.eduSchoolZoneBeanServiceImpl = eduSchoolZoneBeanService;
    }
}
