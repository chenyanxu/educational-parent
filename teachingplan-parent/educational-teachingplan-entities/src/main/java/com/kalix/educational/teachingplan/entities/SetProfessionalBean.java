package com.kalix.educational.teachingplan.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Administrator_ on 2018/7/26.
 */

@Entity
@Table(name = "educational_setProfessional_info")
public class SetProfessionalBean extends PersistentEntity {

    private Integer zydm;
    private String nj;
    private Integer cddw;

    public Integer getZydm() {
        return zydm;
    }

    public void setZydm(Integer zydm) {
        this.zydm = zydm;
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    public Integer getCddw() {
        return cddw;
    }

    public void setCddw(Integer cddw) {
        this.cddw = cddw;
    }
}
