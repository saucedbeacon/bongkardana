package com.ta.audid.d;

import android.content.Context;

public class d {
    public static boolean h(Context context) {
        return a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean i(Context context) {
        return a(context, "android.permission.READ_PHONE_STATE");
    }

    public static boolean j(Context context) {
        return a(context, "android.permission.ACCESS_WIFI_STATE");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = com.ta.audid.g.a.b(r5)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 1
            if (r2 < r3) goto L_0x0020
            if (r1 < r3) goto L_0x0019
            int r5 = r5.checkSelfPermission(r6)
            if (r5 != 0) goto L_0x0027
        L_0x0017:
            r0 = 1
            goto L_0x0027
        L_0x0019:
            int r5 = com.ta.audid.d.c.a(r5, r6)
            if (r5 != 0) goto L_0x0027
            goto L_0x0017
        L_0x0020:
            int r5 = com.ta.audid.d.c.a(r5, r6)
            if (r5 != 0) goto L_0x0027
            goto L_0x0017
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.d.d.a(android.content.Context, java.lang.String):boolean");
    }
}
