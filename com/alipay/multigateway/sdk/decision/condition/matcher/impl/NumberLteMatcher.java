package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;
import com.alipay.multigateway.sdk.util.ParseUtil;

public final class NumberLteMatcher implements Matcher<Float> {
    public final boolean isMatch(String str, Float f) {
        return ParseUtil.parseFloat(str) <= f.floatValue();
    }
}
