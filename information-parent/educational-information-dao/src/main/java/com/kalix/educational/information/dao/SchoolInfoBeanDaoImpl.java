package com.kalix.educational.information.dao;

import com.kalix.educational.information.api.dao.ISchoolInfoBeanDao;
import com.kalix.educational.information.entities.SchoolInfoBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by Administrator on 2017/3/3.
 */
public class SchoolInfoBeanDaoImpl extends BaseAdminDao<SchoolInfoBean, Long> implements ISchoolInfoBeanDao {

    @Override
    @PersistenceContext(unitName = "educational-information-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
