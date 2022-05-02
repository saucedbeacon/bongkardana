package com.iap.ac.config.lite.endcomputing.audience;

import java.util.List;
import java.util.Map;

public class AndAudience extends BaseAudienceSets {
    public boolean evaluate(Map<String, Object> map) {
        List<BaseAudience> list = this.subAudiences;
        if (list != null && !list.isEmpty()) {
            for (BaseAudience next : this.subAudiences) {
                if (next != null && !next.evaluate(map)) {
                    return false;
                }
            }
        }
        return true;
    }
}
