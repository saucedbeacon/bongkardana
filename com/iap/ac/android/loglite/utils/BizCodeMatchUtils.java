package com.iap.ac.android.loglite.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.loglite.c.a;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.getTabbarModel;

public class BizCodeMatchUtils {

    /* renamed from: a  reason: collision with root package name */
    public static String f9741a;
    public static String b;
    public static long c;
    public static String d;

    public static String a(int i) {
        String valueOf;
        String str;
        if (i < 10) {
            valueOf = String.valueOf(i);
            str = "0";
        } else {
            valueOf = String.valueOf(i);
            str = "";
        }
        return str.concat(valueOf);
    }

    public static String b(String str, String str2, String str3) {
        f9741a = str2;
        b = str3;
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(a(f9741a).getBytes(), "AES"), new IvParameterSpec(a(b).getBytes()));
            return a.a(instance.doFinal(str.getBytes(getTabbarModel.ENC)));
        } catch (Exception e) {
            LoggerWrapper.w("ColorUtil", (Throwable) e);
            return null;
        }
    }

    public static boolean a(String str, String str2) {
        String[] split = str.split("\\*");
        if (split.length <= 0 || !str.contains("*")) {
            return false;
        }
        return str2.startsWith(split[0]);
    }

    public static String a(String str, String str2, String str3) {
        f9741a = str2;
        b = str3;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(a(str2).getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(a(b).getBytes()));
            return new String(instance.doFinal(a.a(str)), getTabbarModel.ENC);
        } catch (Exception e) {
            LoggerWrapper.w("ColorUtil", (Throwable) e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r7) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = c
            long r2 = r0 - r2
            r4 = 5000(0x1388, double:2.4703E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0094
            r2 = 0
            if (r7 != 0) goto L_0x0013
        L_0x0011:
            r7 = r2
            goto L_0x001f
        L_0x0013:
            java.lang.String r3 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r3)     // Catch:{ all -> 0x0011 }
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch:{ all -> 0x0011 }
            android.net.NetworkInfo r7 = r7.getActiveNetworkInfo()     // Catch:{ all -> 0x0011 }
        L_0x001f:
            java.lang.String r3 = "WIFI"
            if (r7 != 0) goto L_0x0025
            goto L_0x0090
        L_0x0025:
            java.lang.String r4 = r7.getTypeName()
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0031
            r2 = r3
            goto L_0x0090
        L_0x0031:
            java.lang.String r3 = r7.getSubtypeName()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0040
            java.lang.String r2 = r7.getSubtypeName()
            goto L_0x006b
        L_0x0040:
            int r3 = r7.getSubtype()
            r4 = 16
            if (r3 != r4) goto L_0x004b
            java.lang.String r2 = "GSM"
            goto L_0x006b
        L_0x004b:
            int r3 = r7.getSubtype()
            r4 = 17
            if (r3 != r4) goto L_0x0056
            java.lang.String r2 = "TD-CDMA"
            goto L_0x006b
        L_0x0056:
            int r3 = r7.getSubtype()
            r4 = 18
            if (r3 != r4) goto L_0x0061
            java.lang.String r2 = "TDS-HSDPSA"
            goto L_0x006b
        L_0x0061:
            int r3 = r7.getSubtype()
            r4 = 19
            if (r3 != r4) goto L_0x006b
            java.lang.String r2 = "TDS-HSUPA"
        L_0x006b:
            if (r2 == 0) goto L_0x0090
            java.lang.String r3 = r7.getExtraInfo()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0090
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "|"
            r3.append(r2)
            java.lang.String r7 = r7.getExtraInfo()
            r3.append(r7)
            java.lang.String r2 = r3.toString()
        L_0x0090:
            d = r2
            c = r0
        L_0x0094:
            java.lang.String r7 = d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.BizCodeMatchUtils.a(android.content.Context):java.lang.String");
    }

    public static String a(@NonNull String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ 136);
        }
        return String.valueOf(charArray);
    }
}
