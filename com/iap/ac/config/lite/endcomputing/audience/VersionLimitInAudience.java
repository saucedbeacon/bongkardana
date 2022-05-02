package com.iap.ac.config.lite.endcomputing.audience;

import com.iap.ac.config.lite.endcomputing.evaluator.GrayScaleUtils;
import java.util.Map;

public class VersionLimitInAudience extends BaseAudience {
    private String left;
    private String right;
    private String variable;

    public boolean evaluate(Map<String, Object> map) {
        String str;
        if (map == null || (str = this.variable) == null) {
            return false;
        }
        Object obj = map.get(str);
        return GrayScaleUtils.limitIn(this.left, this.right, obj == null ? null : obj.toString());
    }
}
