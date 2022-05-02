package com.alibaba.ariver.engine.common.worker;

import android.text.TextUtils;

public class WorkerUtils {
    public static boolean startsWithIgnoreCase(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            return false;
        }
        if (length == length2) {
            return str.equalsIgnoreCase(str2);
        }
        return str.substring(0, length2).equalsIgnoreCase(str2);
    }

    public static boolean isDevSession(String str) {
        return !TextUtils.isEmpty(str) && str.contains("68687029");
    }
}
