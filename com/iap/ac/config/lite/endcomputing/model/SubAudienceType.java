package com.iap.ac.config.lite.endcomputing.model;

import com.iap.ac.config.lite.endcomputing.audience.EqualsIgnoreCaseAudience;
import com.iap.ac.config.lite.endcomputing.audience.ExpiredAudience;
import com.iap.ac.config.lite.endcomputing.audience.InvalidAudience;
import com.iap.ac.config.lite.endcomputing.audience.PercentAudience;
import com.iap.ac.config.lite.endcomputing.audience.StartTimeAudience;
import com.iap.ac.config.lite.endcomputing.audience.VersionLimitInAudience;
import com.iap.ac.config.lite.endcomputing.audience.WhitelistAudience;

public enum SubAudienceType {
    WHITELIST("WHITELIST", WhitelistAudience.class),
    EQUALS_IGNORE_CASE("EQUALS_IGNORE_CASE", EqualsIgnoreCaseAudience.class),
    VERSION_LIMIT_IN("VERSION_LIMIT_IN", VersionLimitInAudience.class),
    TRAFFIC("TRAFFIC", PercentAudience.class),
    EXPIRED_TIME("EXPIRED_TIME", ExpiredAudience.class),
    START_TIME("START_TIME", StartTimeAudience.class),
    INVALID("INVALID", InvalidAudience.class);
    
    private Class<?> clazz;
    private String type;

    private SubAudienceType(String str, Class<?> cls) {
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
