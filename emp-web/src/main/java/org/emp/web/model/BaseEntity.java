package org.emp.web.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author yyhua
 * @Description 所有实体的父类，抽象出ID属性
 * @since 2015-07-15
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fId;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseEntity) {
            return this.getfId() == ((BaseEntity) obj).getfId();
        }
        return false;
    }

}
