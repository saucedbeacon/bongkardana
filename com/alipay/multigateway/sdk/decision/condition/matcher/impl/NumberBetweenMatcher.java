package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;
import com.alipay.multigateway.sdk.util.ParseUtil;

public final class NumberBetweenMatcher implements Matcher<Float> {
    public final boolean isMatch(String str, Float f) {
        float[] parseFloatArray = ParseUtil.parseFloatArray(str);
        if (parseFloatArray != null && f.floatValue() > parseFloatArray[0] && f.floatValue() < parseFloatArray[1]) {
            return true;
        }
        return false;
    }
}
