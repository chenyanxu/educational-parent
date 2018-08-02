package com.kalix.educational.teachingplan.biz;


import com.kalix.admin.core.api.biz.IOrganizationBeanService;
import com.kalix.admin.core.entities.OrganizationBean;
import com.kalix.educational.teachingplan.api.biz.ILessonInfoBeanService;
import com.kalix.educational.teachingplan.api.biz.IPracticeInfoBeanService;
import com.kalix.educational.teachingplan.api.dao.ILessonInfoBeanDao;
import com.kalix.educational.teachingplan.api.dao.IPracticeInfoBeanDao;
import com.kalix.educational.teachingplan.entities.LessonInfoBean;
import com.kalix.educational.teachingplan.entities.PracticeInfoBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;


/**
 * Created by fj on 2017-8-17.
 */
public class PracticeInfoBeanServiceImpl extends ShiroGenericBizServiceImpl<IPracticeInfoBeanDao, PracticeInfoBean> implements IPracticeInfoBeanService {


    private IOrganizationBeanService organizationBeanServiceImpl;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            PracticeInfoBean practiceInfoBean = (PracticeInfoBean) jsonData.getData().get(i);
            OrganizationBean organizationBean = organizationBeanServiceImpl.getEntity(practiceInfoBean.getCddw());
            practiceInfoBean.setCddwmc(organizationBean.getName());
        }
        return jsonData;
    }

    public void setOrganizationBeanServiceImpl(IOrganizationBeanService organizationBeanServiceImpl) {
        this.organizationBeanServiceImpl = organizationBeanServiceImpl;
    }


}
