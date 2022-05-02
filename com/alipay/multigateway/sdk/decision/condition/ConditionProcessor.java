package com.alipay.multigateway.sdk.decision.condition;

import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.decision.condition.matcher.Matcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberBetweenMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberEqualsMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberGtMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberGteMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberLtMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.NumberLteMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.RegexMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.TextEqualsMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.TextHasMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.TextInMatcher;
import com.alipay.multigateway.sdk.decision.condition.matcher.impl.TextStartWithMatcher;
import java.util.HashMap;
import java.util.Map;

public class ConditionProcessor {
    private static Map<String, Matcher> sMatcherMap;

    static {
        HashMap hashMap = new HashMap();
        sMatcherMap = hashMap;
        hashMap.put("Number:Between", new NumberBetweenMatcher());
        sMatcherMap.put("Number:Eq", new NumberEqualsMatcher());
        sMatcherMap.put("Number:GT", new NumberGtMatcher());
        sMatcherMap.put("Number:GTE", new NumberGteMatcher());
        sMatcherMap.put("Number:LT", new NumberLtMatcher());
        sMatcherMap.put("Number:LTE", new NumberLteMatcher());
        sMatcherMap.put("Text:Eq", new TextEqualsMatcher());
        sMatcherMap.put("Text:Has", new TextHasMatcher());
        sMatcherMap.put("Text:In", new TextInMatcher());
        sMatcherMap.put("Text:StartWith", new TextStartWithMatcher());
        sMatcherMap.put("Text:REGEXP", new RegexMatcher());
    }

    public boolean isMatch(@NonNull Condition condition, @NonNull Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(condition.valueType);
        sb.append(":");
        sb.append(condition.matchType);
        Matcher matcher = sMatcherMap.get(sb.toString());
        if (matcher == null) {
            return false;
        }
        try {
            return matcher.isMatch(condition.targetValue, obj);
        } catch (Throwable unused) {
            return false;
        }
    }
}
