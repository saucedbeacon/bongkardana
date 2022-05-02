package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;

public final class TextInMatcher implements Matcher<String> {
    public final boolean isMatch(String str, String str2) {
        for (String equals : str.split(",")) {
            if (equals.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
