package com.alibaba.griver.image.framework.utils;

public class StringUtils {
    public static final String EMPTY = "";
    public static final String NULL = "null";

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static boolean isEmptyOrNullStr(String str) {
        return isEmpty(str) || "null".equalsIgnoreCase(str);
    }
}
