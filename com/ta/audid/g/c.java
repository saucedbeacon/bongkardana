package com.ta.audid.g;

import android.text.TextUtils;
import java.io.File;

public class c {
    public static void h(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC, Splitter:B:21:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[SYNTHETIC, Splitter:B:28:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0044, all -> 0x0036 }
            r6 = 100
            char[] r6 = new char[r6]     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
        L_0x0017:
            int r4 = r3.read(r6)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r5 = -1
            if (r4 == r5) goto L_0x0022
            r2.append(r6, r1, r4)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            goto L_0x0017
        L_0x0022:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r3.close()     // Catch:{ Exception -> 0x002a }
            goto L_0x0030
        L_0x002a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.ta.audid.g.m.e(r0, r2, r1)
        L_0x0030:
            return r6
        L_0x0031:
            r6 = move-exception
            r2 = r3
            goto L_0x0037
        L_0x0034:
            r2 = r3
            goto L_0x0044
        L_0x0036:
            r6 = move-exception
        L_0x0037:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0043
        L_0x003d:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.ta.audid.g.m.e(r0, r2, r1)
        L_0x0043:
            throw r6
        L_0x0044:
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.ta.audid.g.m.e(r0, r6, r1)
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.c.f(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[SYNTHETIC, Splitter:B:28:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[SYNTHETIC, Splitter:B:33:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[SYNTHETIC, Splitter:B:40:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0069 A[SYNTHETIC, Splitter:B:45:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g(java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002e, all -> 0x0029 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x002e, all -> 0x0029 }
            java.lang.String r1 = r6.readLine()     // Catch:{ Exception -> 0x0027 }
            r6.close()     // Catch:{ Exception -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r6 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r4)
        L_0x001c:
            r3.close()     // Catch:{ Exception -> 0x0020 }
            goto L_0x0026
        L_0x0020:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r2)
        L_0x0026:
            return r1
        L_0x0027:
            r1 = move-exception
            goto L_0x003c
        L_0x0029:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x005b
        L_0x002e:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x003c
        L_0x0033:
            r6 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L_0x005b
        L_0x0038:
            r6 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
        L_0x003c:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x005a }
            com.ta.audid.g.m.e(r0, r1, r4)     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004d
            r6.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r1)
        L_0x004d:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r1)
        L_0x0059:
            return r0
        L_0x005a:
            r1 = move-exception
        L_0x005b:
            if (r6 == 0) goto L_0x0067
            r6.close()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r6 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r4)
        L_0x0067:
            if (r3 == 0) goto L_0x0073
            r3.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x0073
        L_0x006d:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r6, r2)
        L_0x0073:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.c.g(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[SYNTHETIC, Splitter:B:27:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A[SYNTHETIC, Splitter:B:32:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005d A[SYNTHETIC, Splitter:B:39:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0069 A[SYNTHETIC, Splitter:B:44:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0035 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0035 }
            r5.write(r6)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r5.flush()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r5.close()     // Catch:{ Exception -> 0x001d }
            goto L_0x0023
        L_0x001d:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r6)
        L_0x0023:
            r3.close()     // Catch:{ Exception -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r6)
        L_0x002d:
            r5 = 1
            return r5
        L_0x002f:
            r6 = move-exception
            r1 = r5
            goto L_0x005b
        L_0x0032:
            r6 = move-exception
            r1 = r5
            goto L_0x003c
        L_0x0035:
            r6 = move-exception
            goto L_0x003c
        L_0x0037:
            r6 = move-exception
            r3 = r1
            goto L_0x005b
        L_0x003a:
            r6 = move-exception
            r3 = r1
        L_0x003c:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x005a }
            com.ta.audid.g.m.e(r0, r6, r5)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r6)
        L_0x004d:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r6)
        L_0x0059:
            return r2
        L_0x005a:
            r6 = move-exception
        L_0x005b:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r1)
        L_0x0067:
            if (r3 == 0) goto L_0x0073
            r3.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x0073
        L_0x006d:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.ta.audid.g.m.e(r0, r5, r1)
        L_0x0073:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.g.c.b(java.lang.String, java.lang.String):boolean");
    }
}
