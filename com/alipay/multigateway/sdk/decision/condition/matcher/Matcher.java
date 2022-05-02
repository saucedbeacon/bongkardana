package com.alipay.multigateway.sdk.decision.condition.matcher;

public interface Matcher<V> {
    boolean isMatch(String str, V v);
}
