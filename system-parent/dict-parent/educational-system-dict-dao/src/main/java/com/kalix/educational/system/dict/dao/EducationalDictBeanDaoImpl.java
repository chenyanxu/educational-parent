package com.kalix.educational.system.dict.dao;

import com.kalix.educational.system.dict.api.dao.IEducationalDictBeanDao;
import com.kalix.educational.system.dict.entities.EducationalDictBean;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EducationalDictBeanDaoImpl extends GenericDao<EducationalDictBean, Long> implements IEducationalDictBeanDao {
    @Override
    @PersistenceContext(unitName = "educational-system-dict-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
