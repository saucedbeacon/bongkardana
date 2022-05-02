package com.iap.ac.config.lite.endcomputing.audience;

import java.util.Map;

public class InvalidAudience extends BaseAudience {
    public boolean evaluate(Map<String, Object> map) {
        return false;
    }
}
