package com.iap.ac.config.lite.endcomputing.model;

import com.iap.ac.config.lite.endcomputing.audience.AndAudience;
import com.iap.ac.config.lite.endcomputing.audience.NotAudience;
import com.iap.ac.config.lite.endcomputing.audience.OrAudience;
import com.j256.ormlite.stmt.query.ManyClause;

public enum AudienceType {
    AND(ManyClause.AND_OPERATION, AndAudience.class),
    OR(ManyClause.OR_OPERATION, OrAudience.class),
    NOT("NOT", NotAudience.class);
    
    private Class<?> clazz;
    private String type;

    private AudienceType(String str, Class<?> cls) {
        this.type = str;
        this.clazz = cls;
    }

    public final Class<?> getClazz() {
        return this.clazz;
    }

    public final String getType() {
        return this.type;
    }
}
