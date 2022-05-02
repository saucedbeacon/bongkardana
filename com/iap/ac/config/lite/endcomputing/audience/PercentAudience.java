package com.iap.ac.config.lite.endcomputing.audience;

import com.iap.ac.config.lite.endcomputing.evaluator.GrayScaleUtils;
import java.util.Map;

public class PercentAudience extends BaseAudience {
    private int percentage;
    private String variable;

    public boolean evaluate(Map<String, Object> map) {
        String str;
        if (map == null || this.percentage <= 0 || (str = this.variable) == null) {
            return false;
        }
        Object obj = map.get(str);
        return GrayScaleUtils.isDeviceHitted(Integer.valueOf(this.percentage), obj == null ? null : obj.toString());
    }
}
