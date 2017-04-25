package org.emp.web.model;

import javax.persistence.Entity;

/**
 *
 */
@Entity
public class Sample extends BaseAuditEntity {

    private static final long serialVersionUID = -4075606447345640202L;

    private String name;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
