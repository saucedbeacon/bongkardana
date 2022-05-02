package com.iap.ac.config.lite.endcomputing.audience;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAudienceSets extends BaseAudience {
    protected List<BaseAudience> subAudiences;

    public void addSubAudience(BaseAudience baseAudience) {
        if (this.subAudiences == null) {
            this.subAudiences = new ArrayList();
        }
        this.subAudiences.add(baseAudience);
    }

    public List<BaseAudience> getSubAudiences() {
        return this.subAudiences;
    }
}
