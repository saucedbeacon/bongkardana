package com.alipay.iap.android.aplog.util;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public class DeviceHWInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
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
    };
    public static final int DEVICEINFO_NO_INIT = -100;
    public static final int DEVICEINFO_UNKNOWN = -1;
    public static final String TAG = "DeviceHWInfo";
    static int sCoreNum = -100;
    static String sCpuName = "-100";
    static int sFrequency = -100;
    static long sRamSize = -100;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        sCoreNum = -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getNumberOfCPUCores() {
        /*
            int r0 = sCoreNum
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return r0
        L_0x0006:
            r2 = -100
            if (r0 != r2) goto L_0x003c
            java.lang.Class<com.alipay.iap.android.aplog.util.DeviceHWInfo> r0 = com.alipay.iap.android.aplog.util.DeviceHWInfo.class
            monitor-enter(r0)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0039 }
            r3 = 10
            if (r2 > r3) goto L_0x0018
            r1 = 1
            sCoreNum = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0018:
            java.lang.String r2 = "/sys/devices/system/cpu/possible"
            int r2 = getCoresFromFileInfo(r2)     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x002a
            java.lang.String r2 = "/sys/devices/system/cpu/present"
            int r2 = getCoresFromFileInfo(r2)     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
        L_0x002a:
            int r2 = sCoreNum     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0037
            int r2 = getCoresFromCPUFileList()     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            sCoreNum = r1     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x003c:
            int r0 = sCoreNum
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.DeviceHWInfo.getNumberOfCPUCores():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC, Splitter:B:21:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            java.lang.String r2 = r2.readLine()     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            int r2 = getCoresFromFileString(r2)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r1.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            return r2
        L_0x001c:
            r2 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001f:
            r0 = r1
            goto L_0x0029
        L_0x0021:
            r2 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r2
        L_0x0028:
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.DeviceHWInfo.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (sFrequency != -100) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r2 = new java.io.FileInputStream("/proc/cpuinfo");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3 = parseFileForValue("cpu MHz", r2) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if (r3 <= sFrequency) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        sFrequency = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0098 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCPUMaxFreqKHz() {
        /*
            int r0 = sFrequency
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return r0
        L_0x0006:
            r2 = -100
            if (r0 != r2) goto L_0x009e
            java.lang.Class<com.alipay.iap.android.aplog.util.DeviceHWInfo> r0 = com.alipay.iap.android.aplog.util.DeviceHWInfo.class
            monitor-enter(r0)
            r3 = 0
            r4 = 0
        L_0x000f:
            int r5 = getNumberOfCPUCores()     // Catch:{ IOException -> 0x0098 }
            if (r4 >= r5) goto L_0x0074
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0098 }
            java.lang.String r6 = "/sys/devices/system/cpu/cpu"
            r5.<init>(r6)     // Catch:{ IOException -> 0x0098 }
            r5.append(r4)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r6 = "/cpufreq/cpuinfo_max_freq"
            r5.append(r6)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0098 }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0098 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0098 }
            boolean r5 = r6.exists()     // Catch:{ IOException -> 0x0098 }
            if (r5 == 0) goto L_0x0071
            r5 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r5]     // Catch:{ IOException -> 0x0098 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0098 }
            r8.<init>(r6)     // Catch:{ IOException -> 0x0098 }
            r8.read(r7)     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            r6 = 0
        L_0x0040:
            byte r9 = r7[r6]     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            boolean r9 = java.lang.Character.isDigit(r9)     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            if (r9 == 0) goto L_0x004d
            if (r6 >= r5) goto L_0x004d
            int r6 = r6 + 1
            goto L_0x0040
        L_0x004d:
            java.lang.String r5 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            r5.<init>(r7, r3, r6)     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            int r6 = r5.intValue()     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            int r7 = sFrequency     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            if (r6 <= r7) goto L_0x0068
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
            sFrequency = r5     // Catch:{ NumberFormatException -> 0x0068, all -> 0x006c }
        L_0x0068:
            r8.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0071
        L_0x006c:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r2     // Catch:{ IOException -> 0x0098 }
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0074:
            int r3 = sFrequency     // Catch:{ IOException -> 0x0098 }
            if (r3 != r2) goto L_0x009a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0098 }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r3 = "cpu MHz"
            int r3 = parseFileForValue(r3, r2)     // Catch:{ all -> 0x0091 }
            int r3 = r3 * 1000
            int r4 = sFrequency     // Catch:{ all -> 0x0091 }
            if (r3 <= r4) goto L_0x008d
            sFrequency = r3     // Catch:{ all -> 0x0091 }
        L_0x008d:
            r2.close()     // Catch:{ all -> 0x009a }
            goto L_0x009a
        L_0x0091:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            throw r3     // Catch:{ IOException -> 0x0098 }
        L_0x0096:
            r1 = move-exception
            goto L_0x009c
        L_0x0098:
            sFrequency = r1     // Catch:{ all -> 0x0096 }
        L_0x009a:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x009e
        L_0x009c:
            monitor-exit(r0)
            throw r1
        L_0x009e:
            int r0 = sFrequency
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.DeviceHWInfo.getCPUMaxFreqKHz():int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(8:11|12|13|14|15|16|17|18)|26|27|28|29) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x004c */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getTotalMemory(android.content.Context r8) {
        /*
            long r0 = sRamSize
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0009
            return r0
        L_0x0009:
            r4 = -100
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0053
            java.lang.Class<com.alipay.iap.android.aplog.util.DeviceHWInfo> r0 = com.alipay.iap.android.aplog.util.DeviceHWInfo.class
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x004c }
            r4 = 16
            if (r1 < r4) goto L_0x002d
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "activity"
            java.lang.Object r8 = r8.getSystemService(r4)     // Catch:{ all -> 0x004c }
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch:{ all -> 0x004c }
            r8.getMemoryInfo(r1)     // Catch:{ all -> 0x004c }
            long r4 = r1.totalMem     // Catch:{ all -> 0x004c }
            sRamSize = r4     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x002d:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0048 }
            java.lang.String r1 = "/proc/meminfo"
            r8.<init>(r1)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r1 = "MemTotal"
            int r1 = parseFileForValue(r1, r8)     // Catch:{ all -> 0x0043 }
            long r4 = (long) r1
            r6 = 1024(0x400, double:5.06E-321)
            long r4 = r4 * r6
            r8.close()     // Catch:{ all -> 0x0049 }
            goto L_0x0049
        L_0x0043:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r1     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            r4 = r2
        L_0x0049:
            sRamSize = r4     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x004c:
            sRamSize = r2     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0053:
            long r0 = sRamSize
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.DeviceHWInfo.getTotalMemory(android.content.Context):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(3:9|10|(7:11|12|13|14|(2:18|(1:20))|21|22))|23|24|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r3 == null) goto L_0x006b;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x006b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x007a */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063 A[SYNTHETIC, Splitter:B:35:0x0063] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x007a=Splitter:B:49:0x007a, B:39:0x006b=Splitter:B:39:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCpuName() {
        /*
            java.lang.String r0 = sCpuName
            java.lang.String r1 = "-1"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = sCpuName
            return r0
        L_0x000d:
            java.lang.String r0 = sCpuName
            java.lang.String r1 = "-100"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x007e
            java.lang.Class<com.alipay.iap.android.aplog.util.DeviceHWInfo> r0 = com.alipay.iap.android.aplog.util.DeviceHWInfo.class
            monitor-enter(r0)
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ all -> 0x005c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0059 }
            r3.<init>(r2)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = ":\\s+"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)     // Catch:{ all -> 0x005a }
            r4 = 1
            r1 = r1[r4]     // Catch:{ all -> 0x005a }
            sCpuName = r1     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "0"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0052
            java.lang.String r6 = ":\\s+"
            java.lang.String[] r1 = r1.split(r6, r5)     // Catch:{ all -> 0x005a }
            int r5 = r1.length     // Catch:{ all -> 0x005a }
            if (r5 <= r4) goto L_0x0052
            r1 = r1[r4]     // Catch:{ all -> 0x005a }
            sCpuName = r1     // Catch:{ all -> 0x005a }
        L_0x0052:
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r3.close()     // Catch:{ all -> 0x006b }
            goto L_0x006b
        L_0x0059:
            r3 = r1
        L_0x005a:
            r1 = r2
            goto L_0x005d
        L_0x005c:
            r3 = r1
        L_0x005d:
            java.lang.String r2 = "-1"
            sCpuName = r2     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ all -> 0x0067 }
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            if (r3 == 0) goto L_0x006b
            goto L_0x0055
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007e
        L_0x006d:
            r2 = move-exception
            if (r1 == 0) goto L_0x0075
            r1.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            if (r3 == 0) goto L_0x007a
            r3.close()     // Catch:{ all -> 0x007a }
        L_0x007a:
            throw r2     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x007e:
            java.lang.String r0 = sCpuName
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.DeviceHWInfo.getCpuName():java.lang.String");
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
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
                            return extractValue(bArr, i2);
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

    private static int extractValue(byte[] bArr, int i) {
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

    public static String getBrandName() {
        String str;
        try {
            str = Build.BRAND.toLowerCase();
        } catch (Throwable unused) {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }
}
