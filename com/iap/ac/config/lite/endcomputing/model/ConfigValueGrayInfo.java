package com.iap.ac.config.lite.endcomputing.model;

import com.iap.ac.config.lite.endcomputing.audience.BaseAudience;
import java.io.Serializable;

public class ConfigValueGrayInfo implements Serializable {
    private BaseAudience audiences;
    private long lastModifiedTime;
    private Object value;

    public BaseAudience getAudiences() {
        return this.audiences;
    }

    public long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Object getValue() {
        return this.value;
    }

    public void setAudiences(BaseAudience baseAudience) {
        this.audiences = baseAudience;
    }

    public void setLastModifiedTime(long j) {
        this.lastModifiedTime = j;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }
}
