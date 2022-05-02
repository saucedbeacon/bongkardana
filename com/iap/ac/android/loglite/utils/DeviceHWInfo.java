package com.iap.ac.android.loglite.utils;

import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public class DeviceHWInfo {

    /* renamed from: a  reason: collision with root package name */
    public static final FileFilter f9743a = new a();
    public static int b = -100;
    public static long c = -100;
    public static int d = -100;

    public static class a implements FileFilter {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        d = -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a() {
        /*
            int r0 = d
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return r0
        L_0x0006:
            r2 = -100
            if (r0 != r2) goto L_0x0046
            java.lang.Class<com.iap.ac.android.loglite.utils.DeviceHWInfo> r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.class
            monitor-enter(r0)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0043 }
            r3 = 10
            if (r2 > r3) goto L_0x0018
            r1 = 1
            d = r1     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return r1
        L_0x0018:
            java.lang.String r2 = "/sys/devices/system/cpu/possible"
            int r2 = a(r2)     // Catch:{ all -> 0x003f }
            d = r2     // Catch:{ all -> 0x003f }
            if (r2 != r1) goto L_0x002a
            java.lang.String r2 = "/sys/devices/system/cpu/present"
            int r2 = a(r2)     // Catch:{ all -> 0x003f }
            d = r2     // Catch:{ all -> 0x003f }
        L_0x002a:
            int r2 = d     // Catch:{ all -> 0x003f }
            if (r2 != r1) goto L_0x0041
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "/sys/devices/system/cpu/"
            r2.<init>(r3)     // Catch:{ all -> 0x003f }
            java.io.FileFilter r3 = f9743a     // Catch:{ all -> 0x003f }
            java.io.File[] r2 = r2.listFiles(r3)     // Catch:{ all -> 0x003f }
            int r2 = r2.length     // Catch:{ all -> 0x003f }
            d = r2     // Catch:{ all -> 0x003f }
            goto L_0x0041
        L_0x003f:
            d = r1     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0046:
            int r0 = d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.DeviceHWInfo.a():int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|(2:10|11)|12|13|14|15|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0031 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0044 A[SYNTHETIC, Splitter:B:28:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004b A[SYNTHETIC, Splitter:B:32:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0052 A[SYNTHETIC, Splitter:B:39:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0059 A[SYNTHETIC, Splitter:B:43:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r4) {
        /*
            r0 = -1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, all -> 0x003f }
            r2.<init>(r4)     // Catch:{ IOException -> 0x004f, all -> 0x003f }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r3.<init>(r2)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            r4.<init>(r3)     // Catch:{ IOException -> 0x003d, all -> 0x003a }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r1 == 0) goto L_0x002e
            java.lang.String r3 = "0-[\\d]+$"
            boolean r3 = r1.matches(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r3 == 0) goto L_0x002e
            r3 = 2
            java.lang.String r1 = r1.substring(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            int r0 = r1.intValue()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            int r0 = r0 + 1
        L_0x002e:
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r0
        L_0x0035:
            r0 = move-exception
            r1 = r4
            goto L_0x0042
        L_0x0038:
            r1 = r4
            goto L_0x0050
        L_0x003a:
            r4 = move-exception
            r0 = r4
            goto L_0x0042
        L_0x003d:
            goto L_0x0050
        L_0x003f:
            r4 = move-exception
            r0 = r4
            r2 = r1
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
            r2 = r1
        L_0x0050:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.DeviceHWInfo.a(java.lang.String):int");
    }

    @VisibleForTesting
    public static int a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            return a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    public static int a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
