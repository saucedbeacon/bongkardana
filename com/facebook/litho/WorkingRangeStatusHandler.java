package com.facebook.litho;

import java.util.HashMap;
import java.util.Map;
import o.isStopped;

public final class WorkingRangeStatusHandler {
    final Map<String, Integer> getMin = new HashMap();

    public @interface WorkingRangeStatus {
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(String str, isStopped isstopped) {
        String str2 = isstopped.toFloatRange;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String obj = sb.toString();
        if ((this.getMin.containsKey(obj) ? this.getMin.get(obj).intValue() : 0) == 1) {
            return true;
        }
        return false;
    }
}
