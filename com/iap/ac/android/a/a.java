package com.iap.ac.android.a;

import com.iap.ac.android.common.log.ACLog;

public class a {
    public static StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void a(String str, Throwable th, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(th);
        ACLog.e(str2, sb.toString());
    }
}
