package com.alibaba.griver.base.common.utils;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.io.File;

public class AOMPDeviceUtils {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9054a;

    public static boolean isRooted() {
        Boolean bool = f9054a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Object obj = null;
        boolean z = false;
        boolean z2 = true;
        try {
            obj = Class.forName("android.os.SystemProperties").getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.secure"});
        } catch (Throwable unused) {
        }
        if ((obj == null || !"1".equals(obj)) && obj != null && "0".equals(obj)) {
            z = true;
        }
        if (z || (!new File("/system/bin/su").exists() && !new File("/system/xbin/su").exists())) {
            z2 = z;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        f9054a = valueOf;
        return valueOf.booleanValue();
    }

    public static String formatFileSize(long j) {
        String str;
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " KB";
        } else {
            str = " B";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " MB";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " GB";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " TB";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " PB";
        }
        String str2 = "%.2f";
        if (f >= 1.0f && f >= 10.0f && f >= 100.0f) {
            str2 = "%.0f";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(str2, new Object[]{Float.valueOf(f)}));
        sb.append(str);
        return sb.toString();
    }
}
