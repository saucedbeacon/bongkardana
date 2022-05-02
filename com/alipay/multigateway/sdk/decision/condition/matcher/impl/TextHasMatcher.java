package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;

public final class TextHasMatcher implements Matcher<String> {
    public final boolean isMatch(String str, String str2) {
        return str2.contains(str);
    }
}
