package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StatFs;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class DeviceUtil {
    public static int getProcessorNum() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r0 == null) goto L_0x003e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getMemorySize() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0033 }
            r4.<init>(r0)     // Catch:{ all -> 0x0033 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0030 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x0031 }
            r5 = 1
            r1 = r1[r5]     // Catch:{ all -> 0x0031 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x0031 }
            r5 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r5
            r2 = r1
        L_0x0029:
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0.close()     // Catch:{ all -> 0x003e }
            goto L_0x003e
        L_0x0030:
            r0 = r1
        L_0x0031:
            r1 = r4
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ all -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            goto L_0x002c
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.DeviceUtil.getMemorySize():long");
    }

    public static long getTotalStorageSize(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long getAvailableStorageSize(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean isDebug(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getUtdid(Context context) {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception unused) {
            return "";
        }
    }
}
