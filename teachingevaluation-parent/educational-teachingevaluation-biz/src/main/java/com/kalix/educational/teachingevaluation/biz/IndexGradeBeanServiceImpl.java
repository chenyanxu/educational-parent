package com.kalix.educational.teachingevaluation.biz;

import com.kalix.admin.core.api.biz.IOrganizationBeanService;
import com.kalix.admin.core.entities.OrganizationBean;
import com.kalix.educational.teachingevaluation.api.biz.IIndexGradeBeanService;
import com.kalix.educational.teachingevaluation.api.dao.IIndexGradeBeanDao;
import com.kalix.educational.teachingevaluation.entities.IndexGradeBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * Created by fj on 2017-8-17.
 */
public class IndexGradeBeanServiceImpl extends ShiroGenericBizServiceImpl<IIndexGradeBeanDao, IndexGradeBean> implements IIndexGradeBeanService {

//    private IOrganizationBeanService organizationBeanServiceImpl;
//
//    @Override
//    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
//        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
//        for (int i = 0; i < jsonData.getData().size(); i++) {
//            LessonInfoBean lessonInfoBean = (LessonInfoBean) jsonData.getData().get(i);
//            OrganizationBean organizationBean = organizationBeanServiceImpl.getEntity(lessonInfoBean.getCddw());
//            lessonInfoBean.setCddwmc(organizationBean.getName());
//        }
//        return jsonData;
//    }
//
//    public void setOrganizationBeanServiceImpl(IOrganizationBeanService organizationBeanServiceImpl) {
//        this.organizationBeanServiceImpl = organizationBeanServiceImpl;
//    }
}
