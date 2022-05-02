package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;
import java.util.regex.Pattern;

public final class RegexMatcher implements Matcher<String> {
    public final boolean isMatch(String str, String str2) {
        return Pattern.matches(str, str2);
    }
}
