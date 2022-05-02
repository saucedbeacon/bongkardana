package com.alipay.multigateway.sdk.decision.condition.matcher.impl;

import android.text.TextUtils;
import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;

public final class TextEqualsMatcher implements Matcher<String> {
    public final boolean isMatch(String str, String str2) {
        return TextUtils.equals(str2, str);
    }
}
