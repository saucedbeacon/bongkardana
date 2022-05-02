package com.alipay.mobile.rome.syncservice.d;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9474a = b.class.getSimpleName();

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(str, str2);
        }
        return true;
    }

    public static long a(String str) {
        try {
            return new SimpleDateFormat("yyyyMMddHHmmssSSS").parse(str).getTime();
        } catch (ParseException unused) {
            String str2 = f9474a;
            StringBuilder sb = new StringBuilder("dateString2Long ParseException[data:");
            sb.append(str);
            sb.append("]");
            c.d(str2, sb.toString());
            return 0;
        }
    }

    public static String a(long j) {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(j));
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            c.a(f9474a, "string2long = ".concat(String.valueOf(str)));
            return -1;
        }
    }
}
