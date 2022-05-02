package com.iap.ac.android.loglite.utils;

public class DeviceUtil {
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0097 */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a() {
        /*
            int r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.b
            r1 = -1
            if (r0 == r1) goto L_0x009f
            r2 = -100
            if (r0 != r2) goto L_0x009d
            java.lang.Class<com.iap.ac.android.loglite.utils.DeviceHWInfo> r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.class
            monitor-enter(r0)
            r3 = 0
            r4 = 0
        L_0x000e:
            int r5 = com.iap.ac.android.loglite.utils.DeviceHWInfo.a()     // Catch:{ IOException -> 0x0097 }
            if (r4 >= r5) goto L_0x0073
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0097 }
            java.lang.String r6 = "/sys/devices/system/cpu/cpu"
            r5.<init>(r6)     // Catch:{ IOException -> 0x0097 }
            r5.append(r4)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r6 = "/cpufreq/cpuinfo_max_freq"
            r5.append(r6)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0097 }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0097 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0097 }
            boolean r5 = r6.exists()     // Catch:{ IOException -> 0x0097 }
            if (r5 == 0) goto L_0x0070
            r5 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r5]     // Catch:{ IOException -> 0x0097 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0097 }
            r8.<init>(r6)     // Catch:{ IOException -> 0x0097 }
            r8.read(r7)     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            r6 = 0
        L_0x003f:
            byte r9 = r7[r6]     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            boolean r9 = java.lang.Character.isDigit(r9)     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            if (r9 == 0) goto L_0x004c
            if (r6 >= r5) goto L_0x004c
            int r6 = r6 + 1
            goto L_0x003f
        L_0x004c:
            java.lang.String r5 = new java.lang.String     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            r5.<init>(r7, r3, r6)     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            int r6 = r5.intValue()     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            int r7 = com.iap.ac.android.loglite.utils.DeviceHWInfo.b     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            if (r6 <= r7) goto L_0x006d
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            com.iap.ac.android.loglite.utils.DeviceHWInfo.b = r5     // Catch:{ NumberFormatException -> 0x006d, all -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r2     // Catch:{ IOException -> 0x0097 }
        L_0x006d:
            r8.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0073:
            int r3 = com.iap.ac.android.loglite.utils.DeviceHWInfo.b     // Catch:{ IOException -> 0x0097 }
            if (r3 != r2) goto L_0x0099
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0097 }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r3 = "cpu MHz"
            int r3 = com.iap.ac.android.loglite.utils.DeviceHWInfo.a((java.lang.String) r3, (java.io.FileInputStream) r2)     // Catch:{ all -> 0x0090 }
            int r3 = r3 * 1000
            int r4 = com.iap.ac.android.loglite.utils.DeviceHWInfo.b     // Catch:{ all -> 0x0090 }
            if (r3 <= r4) goto L_0x008c
            com.iap.ac.android.loglite.utils.DeviceHWInfo.b = r3     // Catch:{ all -> 0x0090 }
        L_0x008c:
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x0099
        L_0x0090:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r3     // Catch:{ IOException -> 0x0097 }
        L_0x0095:
            r1 = move-exception
            goto L_0x009b
        L_0x0097:
            com.iap.ac.android.loglite.utils.DeviceHWInfo.b = r1     // Catch:{ all -> 0x0095 }
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x009d
        L_0x009b:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            throw r1
        L_0x009d:
            int r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.b
        L_0x009f:
            if (r0 > 0) goto L_0x00a2
            return r1
        L_0x00a2:
            int r0 = r0 / 1000
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.DeviceUtil.a():int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(8:10|11|12|13|14|15|16|17)|25|26|27|28) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.content.Context r8) {
        /*
            long r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            r4 = -100
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0052
            java.lang.Class<com.iap.ac.android.loglite.utils.DeviceHWInfo> r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.class
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x004b }
            r4 = 16
            if (r1 < r4) goto L_0x002c
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x004b }
            r1.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r4 = "activity"
            java.lang.Object r8 = r8.getSystemService(r4)     // Catch:{ all -> 0x004b }
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch:{ all -> 0x004b }
            r8.getMemoryInfo(r1)     // Catch:{ all -> 0x004b }
            long r4 = r1.totalMem     // Catch:{ all -> 0x004b }
            com.iap.ac.android.loglite.utils.DeviceHWInfo.c = r4     // Catch:{ all -> 0x004b }
            goto L_0x004d
        L_0x002c:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047 }
            java.lang.String r1 = "/proc/meminfo"
            r8.<init>(r1)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r1 = "MemTotal"
            int r1 = com.iap.ac.android.loglite.utils.DeviceHWInfo.a((java.lang.String) r1, (java.io.FileInputStream) r8)     // Catch:{ all -> 0x0042 }
            long r4 = (long) r1
            r6 = 1024(0x400, double:5.06E-321)
            long r4 = r4 * r6
            r8.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0048
        L_0x0042:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r1     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r4 = r2
        L_0x0048:
            com.iap.ac.android.loglite.utils.DeviceHWInfo.c = r4     // Catch:{ all -> 0x004b }
            goto L_0x004d
        L_0x004b:
            com.iap.ac.android.loglite.utils.DeviceHWInfo.c = r2     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0052
        L_0x004f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0052:
            long r0 = com.iap.ac.android.loglite.utils.DeviceHWInfo.c
        L_0x0054:
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x005b
            return r2
        L_0x005b:
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 / r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.DeviceUtil.a(android.content.Context):long");
    }
}
