package com.alibaba.wireless.security.framework.utils;

public class b {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC, Splitter:B:19:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC, Splitter:B:26:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x003d
            boolean r1 = r3.exists()
            if (r1 != 0) goto L_0x000a
            goto L_0x003d
        L_0x000a:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r3.<init>()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
        L_0x0019:
            java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            if (r2 == 0) goto L_0x0023
            r3.append(r2)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            goto L_0x0019
        L_0x0023:
            r1.close()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            goto L_0x003d
        L_0x002b:
            r3 = move-exception
            r0 = r1
            goto L_0x0031
        L_0x002e:
            goto L_0x0038
        L_0x0030:
            r3 = move-exception
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r3
        L_0x0037:
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.b.a(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c A[SYNTHETIC, Splitter:B:20:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[SYNTHETIC, Splitter:B:25:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0055
            if (r6 != 0) goto L_0x0006
            goto L_0x0055
        L_0x0006:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = ".tmp"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = 0
            boolean r3 = r1.exists()     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            if (r3 != 0) goto L_0x002a
            r1.createNewFile()     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
        L_0x002a:
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            r4.<init>(r1, r0)     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            r3.write(r6)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r3.flush()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r3.close()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            boolean r0 = r1.renameTo(r5)     // Catch:{ Exception -> 0x0042, all -> 0x0049 }
            goto L_0x0055
        L_0x0042:
            goto L_0x0050
        L_0x0044:
            r5 = move-exception
            r2 = r3
            goto L_0x004a
        L_0x0047:
            r2 = r3
            goto L_0x0050
        L_0x0049:
            r5 = move-exception
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r5
        L_0x0050:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.b.a(java.io.File, java.lang.String):boolean");
    }

    public static boolean a(String str) {
        return !str.contains("..") && !str.contains("\\") && !str.contains("%");
    }
}
