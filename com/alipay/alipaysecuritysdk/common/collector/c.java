package com.alipay.alipaysecuritysdk.common.collector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.alipaysecuritysdk.common.c.b;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f9273a = new c();

    public static String a() {
        return "android";
    }

    private c() {
    }

    public static boolean b() {
        String[] strArr = {"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/su/bin/su", "/su/xbin/su", "/sbin/su", "/usr/bin/su", "/vendor/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        int i = 0;
        while (i < 14) {
            try {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
                i++;
            } catch (Exception e) {
                b.a("SEC_SDK-tool", (Throwable) e);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[Catch:{ Exception -> 0x006e }, RETURN] */
    @android.annotation.SuppressLint({"MissingPermission", "HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7) {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "goldfish"
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x006e }
            r2 = 1
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ Exception -> 0x006e }
            java.lang.String r3 = "sdk"
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x006e }
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch:{ Exception -> 0x006e }
            java.lang.String r3 = "generic"
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x006e }
            if (r1 == 0) goto L_0x0021
            goto L_0x006d
        L_0x0021:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.d.b(r7, r1)     // Catch:{ Exception -> 0x006e }
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x006e }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x006e }
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = r1.getDeviceId()     // Catch:{ Exception -> 0x006e }
            if (r1 == 0) goto L_0x005a
            int r3 = r1.length()     // Catch:{ Exception -> 0x006e }
            if (r3 != 0) goto L_0x0040
            goto L_0x005a
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 >= r3) goto L_0x005a
            char r5 = r1.charAt(r4)     // Catch:{ Exception -> 0x006e }
            boolean r5 = java.lang.Character.isWhitespace(r5)     // Catch:{ Exception -> 0x006e }
            if (r5 != 0) goto L_0x0057
            char r5 = r1.charAt(r4)     // Catch:{ Exception -> 0x006e }
            r6 = 48
            if (r5 == r6) goto L_0x0057
            r1 = 0
            goto L_0x005b
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x005a:
            r1 = 1
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            return r2
        L_0x005e:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x006e }
            java.lang.String r1 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r1)     // Catch:{ Exception -> 0x006e }
            boolean r7 = com.alipay.alipaysecuritysdk.common.e.e.c(r7)     // Catch:{ Exception -> 0x006e }
            return r7
        L_0x006d:
            return r2
        L_0x006e:
            r7 = move-exception
            java.lang.String r1 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r1, (java.lang.Throwable) r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.c.a(android.content.Context):boolean");
    }

    public static String c() {
        return Build.BOARD;
    }

    public static String d() {
        return Build.BRAND;
    }

    public static String e() {
        return Build.DEVICE;
    }

    public static String f() {
        return Build.DISPLAY;
    }

    public static String g() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String h() {
        return Build.MANUFACTURER;
    }

    public static String i() {
        return Build.MODEL;
    }

    public static String j() {
        return Build.PRODUCT;
    }

    public static String k() {
        return Build.VERSION.RELEASE;
    }

    public static String l() {
        return Build.VERSION.SDK;
    }

    public static String m() {
        return Build.TAGS;
    }

    public static String n() {
        return a("ro.kernel.qemu", "0");
    }

    public static String o() {
        return a("gsm.sim.state", "");
    }

    public static String p() {
        return a("gsm.sim.state.2", "");
    }

    public static String q() {
        return a("wifi.interface", "");
    }

    public static String r() {
        return a("sys.usb.state", "");
    }

    @SuppressLint({"MissingPermission"})
    public static String b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return "";
            }
            String typeName = connectivityManager.getActiveNetworkInfo().getTypeName();
            if (typeName == null ? false : typeName.equalsIgnoreCase("WIFI")) {
                return "WIFI";
            }
            return connectivityManager.getActiveNetworkInfo().getExtraInfo();
        } catch (Exception e) {
            b.a("SEC_SDK-tool", (Throwable) e);
            return "";
        }
    }

    public static String s() {
        String str = "";
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] split = bufferedReader.readLine().split(":\\s+", 2);
            if (split.length > 1) {
                str = split[1];
            }
            fileReader.close();
            bufferedReader.close();
            return str;
        } catch (Throwable th) {
            b.a("SEC_SDK-tool", th);
            return str;
        }
    }

    private static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            b.a("SEC_SDK-tool", (Throwable) e);
            return str2;
        }
    }
}
