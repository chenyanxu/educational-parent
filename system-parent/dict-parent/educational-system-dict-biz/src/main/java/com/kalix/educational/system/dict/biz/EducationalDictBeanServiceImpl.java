package com.kalix.educational.system.dict.biz;

import com.kalix.educational.system.dict.api.biz.IEducationalDictBeanService;
import com.kalix.educational.system.dict.api.dao.IEducationalDictBeanDao;
import com.kalix.educational.system.dict.entities.EducationalDictBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.system.BaseDictServiceImpl;


public class EducationalDictBeanServiceImpl extends BaseDictServiceImpl<IEducationalDictBeanDao, EducationalDictBean> implements IEducationalDictBeanService {
    @Override
    public JsonStatus saveEntity(EducationalDictBean entity) {
        Integer maxValue = dao.getFieldMaxValue("value","type='"+entity.getType()+"'");

        maxValue=maxValue+1;

        entity.setValue(maxValue);

        return super.saveEntity(entity);
    }
}
