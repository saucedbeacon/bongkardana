package com.alipay.iap.android.aplog.monitor;

import android.text.TextUtils;

public class AnrTraceProcessor {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("\n");
        boolean z = false;
        int a2 = a(split, "\"main\"", (String) null, (String) null, 0);
        if (a2 >= 0) {
            for (int i = a2 + 5; i < split.length; i++) {
                String str2 = split[i];
                if (!str2.startsWith("  at ")) {
                    if ((z && !str2.startsWith("  - waiting on ") && !str2.startsWith("  - locked ") && !str2.startsWith("  - sleeping on ") && !str2.startsWith("  - waiting to lock ") && !str2.startsWith("  ... repeated ")) || TextUtils.isEmpty(str2) || str2.contains("sysTid") || str2.contains("(no managed stack frames)") || str2.contains("--- --- --- --- ---")) {
                        break;
                    }
                } else {
                    sb.append(str2.trim());
                    sb.append("\n");
                    z = true;
                }
            }
        }
        return sb.toString();
    }

    private static int a(String[] strArr, String str, String str2, String str3, int i) {
        if (strArr != null && i <= strArr.length - 1) {
            boolean z = !TextUtils.isEmpty(str);
            boolean z2 = !TextUtils.isEmpty(str2);
            boolean z3 = !TextUtils.isEmpty(str3);
            while (i < strArr.length) {
                if (strArr[i] != null) {
                    boolean z4 = false;
                    boolean z5 = !z || strArr[i].startsWith(str);
                    if (z2 && !strArr[i].endsWith(str2)) {
                        z5 = false;
                    }
                    if (!z3 || strArr[i].contains(str3)) {
                        z4 = z5;
                    }
                    if (z4) {
                        return i;
                    }
                }
                i++;
            }
        }
        return -1;
    }
}
