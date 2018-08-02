package com.kalix.educational.textbook.basic.dao;

import com.kalix.framework.core.api.persistence.PersistentEntity;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by zangyanming on 2018/8/2.
 */
public abstract class BasicDao<T extends PersistentEntity, PK extends Serializable> extends GenericDao<T, PK> {
    @Override
    @PersistenceContext(unitName = "educational-textbook-basic-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
