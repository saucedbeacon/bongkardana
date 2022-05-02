package com.uc.crashsdk.a;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.common.base.Ascii;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.uc.crashsdk.a;
import com.uc.crashsdk.p;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9871a = true;
    /* access modifiers changed from: private */
    public static final Object b = new Object();
    private static boolean c = false;
    private static String d = "hsdk";
    private static String e = "alid ";
    /* access modifiers changed from: private */
    public static String f = null;

    public static void a() {
        i.a(0, new g(), 55000);
    }

    public static String b() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("inv");
            sb.append(e);
            sb.append("cras");
            sb.append(d);
            return sb.toString();
        } catch (Throwable th) {
            a.a(th, true);
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(boolean r15) {
        /*
            boolean r0 = c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = r15 ^ 1
            c = r0
            java.lang.String r0 = com.uc.crashsdk.a.b
            java.lang.String r2 = "2.0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r0 = com.uc.crashsdk.b.b((int) r0)
            if (r0 == 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r0 = com.uc.crashsdk.b.h()
            java.lang.String r2 = com.uc.crashsdk.a.d.a((java.lang.String) r0)
            r3 = 0
            r4 = 0
            boolean r6 = com.uc.crashsdk.a.h.b(r2)
            r7 = 2
            r8 = 3
            r9 = 1
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = " "
            java.lang.String[] r2 = r2.split(r6)
            int r6 = r2.length
            if (r6 != r8) goto L_0x004a
            r3 = r2[r1]
            r4 = r2[r9]
            long r4 = com.uc.crashsdk.a.h.c(r4)
            r2 = r2[r7]
            long r10 = com.uc.crashsdk.a.h.c(r2)
            int r2 = (int) r10
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            f9871a = r9
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r4
            r4 = 259200000(0xf731400, double:1.280618154E-315)
            java.lang.String r6 = "2"
            java.lang.String r12 = "o"
            java.lang.String r13 = "1"
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0078
            boolean r4 = r12.equals(r3)
            if (r4 == 0) goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0079
        L_0x0067:
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x0070
            f9871a = r1
            goto L_0x0065
        L_0x0070:
            boolean r4 = r13.equals(r3)
            if (r4 == 0) goto L_0x0078
            f9871a = r1
        L_0x0078:
            r4 = 1
        L_0x0079:
            if (r4 == 0) goto L_0x00e9
            if (r15 == 0) goto L_0x007e
            goto L_0x00e9
        L_0x007e:
            int r15 = android.os.Process.myPid()
            if (r2 != r15) goto L_0x0085
            return r1
        L_0x0085:
            java.lang.String r15 = "per"
            f = r15
            java.lang.String r15 = h()
            if (r15 == 0) goto L_0x00dd
            java.lang.String r2 = "retcode="
            boolean r2 = r15.contains(r2)
            if (r2 == 0) goto L_0x00dd
            java.lang.String r2 = "retcode=0"
            boolean r15 = r15.contains(r2)
            if (r15 == 0) goto L_0x00a7
            f9871a = r9
            java.lang.String r15 = "aus"
            f = r15
            r6 = r12
            goto L_0x00b9
        L_0x00a7:
            f9871a = r1
            boolean r15 = r13.equals(r3)
            if (r15 == 0) goto L_0x00b4
            java.lang.String r15 = "auf2"
            f = r15
            goto L_0x00b9
        L_0x00b4:
            java.lang.String r15 = "auf1"
            f = r15
            r6 = r13
        L_0x00b9:
            java.util.Locale r15 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r1] = r6
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2[r9] = r1
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r7] = r1
            java.lang.String r1 = "%s %d %d"
            java.lang.String r15 = java.lang.String.format(r15, r1, r2)
            com.uc.crashsdk.a.d.a((java.lang.String) r0, (java.lang.String) r15)
            return r9
        L_0x00dd:
            if (r15 != 0) goto L_0x00e4
            java.lang.String r15 = "ner"
            f = r15
            goto L_0x00e8
        L_0x00e4:
            java.lang.String r15 = "ser"
            f = r15
        L_0x00e8:
            return r1
        L_0x00e9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.f.b(boolean):boolean");
    }

    public static byte[] c() {
        return new byte[]{6, 0, Ascii.ETB, 8};
    }

    private static String h() {
        byte[] bArr;
        byte[] a2;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        a(sb, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM, p.e());
        a(sb, "pkgname", a.f9861a);
        a(sb, "process", com.uc.crashsdk.f.d());
        a(sb, "version", a.a());
        a(sb, H5GetLogInfoBridge.RESULT_OS, "android");
        String obj = sb.toString();
        byte[] bArr3 = new byte[16];
        e.a(bArr3, 0, k.d());
        e.a(bArr3, 4, e.c());
        e.a(bArr3, 8, c());
        e.a(bArr3, 12, a.c());
        try {
            bArr = e.a(obj.getBytes(), bArr3, true);
        } catch (Throwable th) {
            a.a(th, false);
            bArr = null;
        }
        if (bArr == null || (a2 = e.a("https://woodpecker.uc.cn/api/crashsdk/validate", bArr)) == null) {
            return null;
        }
        try {
            bArr2 = e.a(a2, bArr3, false);
        } catch (Throwable th2) {
            a.a(th2, false);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return new String(bArr2);
        }
        return null;
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(str2);
        return sb;
    }

    public static boolean d() {
        try {
            b(true);
        } catch (Throwable unused) {
        }
        return f9871a;
    }
}
