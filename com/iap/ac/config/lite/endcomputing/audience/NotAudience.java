package com.iap.ac.config.lite.endcomputing.audience;

import java.util.List;
import java.util.Map;

public class NotAudience extends BaseAudienceSets {
    public boolean evaluate(Map<String, Object> map) {
        List<BaseAudience> list = this.subAudiences;
        if (list == null || list.isEmpty() || this.subAudiences.get(0) == null) {
            return false;
        }
        return !this.subAudiences.get(0).evaluate(map);
    }
}
