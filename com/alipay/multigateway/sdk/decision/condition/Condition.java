package com.alipay.multigateway.sdk.decision.condition;

import androidx.annotation.NonNull;
import java.util.List;

public class Condition {
    public static final String MATCH_TYPE_BETWEEN = "Between";
    public static final String MATCH_TYPE_EQUALS = "Eq";
    public static final String MATCH_TYPE_GREATER_THAN = "GT";
    public static final String MATCH_TYPE_GREATER_THAN_EQUALS = "GTE";
    public static final String MATCH_TYPE_HAS = "Has";
    public static final String MATCH_TYPE_IN = "In";
    public static final String MATCH_TYPE_LESS_THAN = "LT";
    public static final String MATCH_TYPE_LESS_THAN_EQUALS = "LTE";
    public static final String MATCH_TYPE_REGEXP = "REGEXP";
    public static final String MATCH_TYPE_START_WITH = "StartWith";
    public static final String TYPE_NETWORK_TYPE = "NetworkType";
    public static final String TYPE_OPERATION_TYPE = "OperationType";
    public static final String TYPE_REMOTE_INTERFACE_NAME = "RemoteInterfaceName";
    public static final String VALUE_TYPE_NUMBER = "Number";
    public static final String VALUE_TYPE_TEXT = "Text";
    public String matchType;
    public String targetValue;
    public String type;
    public String valueType;

    public Condition() {
    }

    public Condition(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.type = str;
        this.matchType = str2;
        this.valueType = str3;
        this.targetValue = str4;
    }

    @NonNull
    public static Condition operationTypeStartWith(@NonNull String str) {
        return new Condition(TYPE_OPERATION_TYPE, MATCH_TYPE_START_WITH, VALUE_TYPE_TEXT, str);
    }

    @NonNull
    public static Condition operationTypeEquals(@NonNull String str) {
        return new Condition(TYPE_OPERATION_TYPE, MATCH_TYPE_EQUALS, VALUE_TYPE_TEXT, str);
    }

    @NonNull
    public static Condition operationTypeIn(@NonNull List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
            sb.append(',');
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        return new Condition(TYPE_OPERATION_TYPE, MATCH_TYPE_IN, VALUE_TYPE_TEXT, sb.toString());
    }
}
