package com.alipay.imobile.network.quake.util;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;

public class a {
    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            String str2 = Quake.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found.");
            LoggerWrapper.i(str2, sb.toString());
            return null;
        }
    }
}
