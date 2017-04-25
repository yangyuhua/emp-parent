package org.emp.web.util;


import org.hibernate.dialect.SQLServerDialect;
import org.hibernate.type.StandardBasicTypes;

import java.sql.Types;

public class SQLServer2008Dialect extends SQLServerDialect {

    public SQLServer2008Dialect() {
        super();
        registerHibernateType(Types.NVARCHAR, StandardBasicTypes.STRING.getName());
    }

}
