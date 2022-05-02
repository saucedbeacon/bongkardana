package com.uc.crashsdk.a;

import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.alipay.mobile.security.bio.workspace.Env;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.appsflyer.share.Constants;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.base.Ascii;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.uc.crashsdk.f;
import com.uc.crashsdk.p;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import o.getTabbarModel;

public class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9875a = new Object();
    private static Map<String, String> b = new HashMap();
    private static int c = 0;
    private static Map<String, b> d = new HashMap();
    private static Object e = new Object();
    private static SparseArray<String> f = new SparseArray<>();
    private static boolean g = false;
    private static boolean h = false;
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static /* synthetic */ boolean c(String str) {
        if (h) {
            return false;
        }
        h = true;
        File file = new File(str);
        ArrayList<b> a2 = a(file, "crp", 100);
        b bVar = new b("crp", false, false);
        bVar.a("et", String.valueOf(com.uc.crashsdk.b.u()));
        bVar.a("prc", f.d());
        bVar.a("imp", com.uc.crashsdk.b.t() ? "1" : "0");
        a(bVar);
        a2.add(0, bVar);
        boolean b2 = b(f.j(), a((Iterable<b>) a2, true, false).toString());
        b.a(file);
        if (!b2) {
            b.a(file, a((Iterable<b>) a2, false, true).toString());
        }
        return true;
    }

    static /* synthetic */ boolean d(String str) {
        File file = new File(str);
        Iterator<b> it = a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            b next = it.next();
            String a2 = next.a("prc");
            if (!h.a(a2)) {
                b bVar = d.get(a2);
                if (bVar != null) {
                    bVar.a(next);
                } else {
                    d.put(a2, next);
                }
            }
        }
        boolean b2 = b(f.j(), a((Iterable<b>) d.values(), true, false).toString());
        b.a(file);
        if (!b2) {
            b.a(file, a((Iterable<b>) d.values(), false, true).toString());
        }
        return true;
    }

    static /* synthetic */ void f() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append("cr.wa");
        String obj = sb.toString();
        com.uc.crashsdk.b.a(f9875a, obj, new l(obj, obj));
    }

    static /* synthetic */ boolean h() {
        if (g) {
            return false;
        }
        g = true;
        if (com.uc.crashsdk.a.b.equals(BlobStatic.BLOB_VERSION) && com.uc.crashsdk.b.b(268435456)) {
            return false;
        }
        File file = new File(j());
        String b2 = b.b(file);
        b bVar = new b("pv", true, true);
        if (!h.a(b2)) {
            bVar.b(b2);
        }
        if (bVar.b == Process.myPid()) {
            return false;
        }
        bVar.a("pv", 1);
        bVar.a("fjv", 1);
        String j = f.j();
        long j2 = bVar.f9877a;
        if ((j2 == 0 || System.currentTimeMillis() - j2 >= 28800000) ? b(j, bVar.a(true, true, false)) : false) {
            bVar.c = new HashMap();
            bVar.f9877a = System.currentTimeMillis();
            bVar.b = Process.myPid();
        }
        b.a(file, bVar.a(false, false, true));
        return true;
    }

    static /* synthetic */ void i() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append("dt.wa");
        String obj = sb.toString();
        com.uc.crashsdk.b.a(e, obj, new m(obj, obj));
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        long f9877a = 0;
        int b = 0;
        Map<String, String> c = new HashMap();
        private String d;
        private boolean e = false;
        private boolean f = false;

        b(String str, boolean z, boolean z2) {
            this.d = str;
            this.e = z;
            this.f = z2;
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, String str2) {
            this.c.put(str, str2);
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, long j) {
            a(str, String.valueOf(c(str) + j));
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b bVar) {
            if (!this.f) {
                c.a("crashsdk", String.format("WaItem '%s' is not mergable!", new Object[]{this.d}));
                return false;
            }
            for (String next : bVar.c.keySet()) {
                if (next.startsWith("c_")) {
                    a(next, bVar.a(next));
                } else {
                    long c2 = bVar.c(next);
                    if (c2 != 0) {
                        a(next, c2);
                    } else {
                        a(next, bVar.a(next));
                    }
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final String a(String str) {
            return this.c.get(str);
        }

        private long c(String str) {
            return h.c(a(str));
        }

        /* access modifiers changed from: package-private */
        public final String a(boolean z, boolean z2, boolean z3) {
            String str;
            if (this.d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                try {
                    str = Build.HARDWARE;
                } catch (Throwable th) {
                    a.a(th, false);
                    str = "-";
                }
                k.b(sb, "lt", "uc");
                k.b(sb, Env.NAME_PRE, p.e());
                k.b(sb, "pkg", com.uc.crashsdk.a.f9861a);
                k.b(sb, "rom", Build.VERSION.RELEASE);
                k.b(sb, H5GetLogInfoBridge.RESULT_MODEL, Build.MODEL);
                k.b(sb, "sdk", String.valueOf((long) Build.VERSION.SDK_INT));
                k.b(sb, "cpu", Build.CPU_ABI);
                k.b(sb, "hdw", str);
                k.b(sb, "ram", String.valueOf((long) k.k()));
                k.b(sb, "cver", "2.0.0.4");
                k.b(sb, "cseq", "170706161743");
                k.b(sb, "aver", com.uc.crashsdk.a.a());
                k.b(sb, "ver", p.K());
                k.b(sb, "sver", p.L());
                k.b(sb, "seq", p.M());
                k.b(sb, H5GetLogInfoBridge.RESULT_OS, "android");
                sb.append("\n");
            }
            k.b(sb, "lt", this.d);
            k.a(sb, this.c);
            if (this.e && !z2) {
                long j = this.f9877a;
                if (j != 0) {
                    k.b(sb, "up", String.valueOf(j));
                }
                if (z3) {
                    k.b(sb, Constants.URL_MEDIA_SOURCE, String.format(Locale.US, TimeModel.NUMBER_FORMAT, new Object[]{Integer.valueOf(Process.myPid())}));
                } else if (this.b != 0) {
                    k.b(sb, Constants.URL_MEDIA_SOURCE, String.format(Locale.US, TimeModel.NUMBER_FORMAT, new Object[]{Integer.valueOf(this.b)}));
                }
            }
            sb.append("\n");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final boolean b(String str) {
            if (h.a(str)) {
                return false;
            }
            String str2 = null;
            long j = 0;
            HashMap hashMap = new HashMap();
            Map<String, String> a2 = k.a(str);
            int i = 0;
            for (String next : a2.keySet()) {
                String str3 = a2.get(next);
                if (next.equals("lt")) {
                    str2 = str3;
                } else if (this.e && next.equals("up")) {
                    j = h.c(str3);
                } else if (!this.e || !next.equals(Constants.URL_MEDIA_SOURCE)) {
                    hashMap.put(next, str3);
                } else {
                    i = (int) h.c(str3);
                }
            }
            String str4 = this.d;
            if (str4 != null && !str4.equals(str2)) {
                return false;
            }
            this.f9877a = j;
            this.b = i;
            this.d = str2;
            this.c = hashMap;
            return true;
        }
    }

    public static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] split = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    public static void a(StringBuilder sb, Map<String, String> map) {
        for (String next : map.keySet()) {
            b(sb, next, map.get(next));
        }
    }

    /* access modifiers changed from: private */
    public static void b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(str2);
        sb.append("`");
    }

    public static void b(String str) {
        synchronized (f9875a) {
            File file = new File(j());
            b bVar = new b("pv", true, true);
            String b2 = b.b(file);
            if (!h.a(b2)) {
                bVar.b(b2);
            }
            bVar.a(str, 1);
            bVar.a("aujv", 1);
            b.a(file, bVar.a(false, false, false));
        }
    }

    public static void a() {
        if (com.uc.crashsdk.b.t()) {
            i.a(0, new a(2), 36000);
        }
    }

    public static boolean a(String str, String str2) {
        String str3;
        try {
            StringBuilder sb = new StringBuilder("c_");
            sb.append(str.replaceAll("[^0-9a-zA-Z-_]", "-"));
            String obj = sb.toString();
            if (h.a(str2)) {
                str3 = "";
            } else {
                str3 = str2.replaceAll("[`=]", "-");
            }
            synchronized (b) {
                if (b.get(obj) == null) {
                    if (c >= 20) {
                        return false;
                    }
                    c++;
                }
                b.put(obj, str3);
                return true;
            }
        } catch (Throwable th) {
            a.a(th, false);
            return false;
        }
    }

    private static void a(b bVar) {
        synchronized (b) {
            for (String next : b.keySet()) {
                bVar.a(next, b.get(next));
            }
        }
    }

    public static void b() {
        if (p.I()) {
            i.a(1, new a(1), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f9876a = (!k.class.desiredAssertionStatus());
        private int b = 0;

        a(int i) {
            this.b = i;
        }

        public final void run() {
            int i = this.b;
            if (i == 1) {
                k.f();
            } else if (i == 2) {
                synchronized (k.f9875a) {
                    k.h();
                }
            } else if (i == 3) {
                k.i();
            } else if (!f9876a) {
                throw new AssertionError();
            }
        }
    }

    private static StringBuilder a(Iterable<b> iterable, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        boolean z3 = true;
        for (b next : iterable) {
            if (z3) {
                sb.append(next.a(z, z, z2));
                z3 = false;
            } else {
                sb.append(next.a(false, z, z2));
            }
        }
        return sb;
    }

    public static void a(String str, int i2, int i3) {
        if (p.I()) {
            synchronized (e) {
                b bVar = d.get(str);
                if (bVar == null) {
                    bVar = new b("cst", false, true);
                    d.put(str, bVar);
                    a(bVar);
                }
                synchronized (f) {
                    if (f.size() == 0) {
                        a(100, "pv");
                        a(1, "all");
                        a(2, "afg");
                        a(3, "jfg");
                        a(4, "jbg");
                        a(7, "nfg");
                        a(8, "nbg");
                        a(27, "nafg");
                        a(28, "nabg");
                        a(9, "nho");
                        a(10, "uar");
                        a(29, "ulm");
                        a(30, "ukt");
                        a(31, "uet");
                        a(11, "ufg");
                        a(12, "ubg");
                        a(13, "lup");
                        a(14, "luf");
                        a(15, "lef");
                        a(16, "laf");
                        a(22, "lac");
                        a(23, "lau");
                        a(17, "llf");
                        a(18, "lul");
                        a(19, "lub");
                        a(20, "luc");
                        a(21, "luu");
                        a(24, "lzc");
                        a(25, "lrc");
                        a(26, "lss");
                    }
                }
                String str2 = f.get(i2);
                if (str2 == null) {
                    c.a("crashsdk", "map key is not set with: ".concat(String.valueOf(i2)));
                }
                bVar.a("prc", str);
                if (str2 != null) {
                    bVar.a(str2, String.valueOf(i3));
                }
            }
        }
    }

    public static void c() {
        if (p.I()) {
            i.a(1, new a(3));
        }
    }

    private static void a(int i2, String str) {
        f.put(i2, str);
    }

    private static ArrayList<b> a(File file, String str, int i2) {
        ArrayList<String> a2 = b.a(file, i2);
        ArrayList<b> arrayList = new ArrayList<>();
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            b bVar = new b(str, false, false);
            if (bVar.b(it.next())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private static String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append("pv.wa");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = com.uc.crashsdk.a.h.a((java.lang.String) r10)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r10 = r10.getBytes()
            r0 = 16
            r2 = 8
            r3 = 0
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x003b }
            byte[] r4 = com.uc.crashsdk.a.e.c()     // Catch:{ all -> 0x003b }
            com.uc.crashsdk.a.e.a((byte[]) r0, (int) r3, (byte[]) r4)     // Catch:{ all -> 0x003b }
            r4 = 4
            byte[] r5 = d()     // Catch:{ all -> 0x003b }
            com.uc.crashsdk.a.e.a((byte[]) r0, (int) r4, (byte[]) r5)     // Catch:{ all -> 0x003b }
            byte[] r4 = com.uc.crashsdk.a.c()     // Catch:{ all -> 0x003b }
            com.uc.crashsdk.a.e.a((byte[]) r0, (int) r2, (byte[]) r4)     // Catch:{ all -> 0x003b }
            r4 = 12
            byte[] r5 = com.uc.crashsdk.a.f.c()     // Catch:{ all -> 0x003b }
            com.uc.crashsdk.a.e.a((byte[]) r0, (int) r4, (byte[]) r5)     // Catch:{ all -> 0x003b }
            byte[] r0 = com.uc.crashsdk.a.e.a((byte[]) r10, (byte[]) r0)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003f
            r10 = r0
            r0 = 1
            goto L_0x0040
        L_0x003b:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r3)
        L_0x003f:
            r0 = 0
        L_0x0040:
            boolean r4 = com.uc.crashsdk.p.J()
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = "4ea4e41a3993"
            goto L_0x004b
        L_0x0049:
            java.lang.String r4 = "28ef1713347d"
        L_0x004b:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r7 = "AppChk#2014"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = e(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            boolean r8 = com.uc.crashsdk.p.J()
            if (r8 == 0) goto L_0x007c
            java.lang.String r8 = "https://gjapplog.uc.cn/collect?chk="
            goto L_0x007e
        L_0x007c:
            java.lang.String r8 = "https://applog.uc.cn/collect?chk="
        L_0x007e:
            r7.append(r8)
            int r8 = r6.length()
            int r8 = r8 - r2
            int r2 = r6.length()
            java.lang.String r2 = r6.substring(r8, r2)
            r7.append(r2)
            java.lang.String r2 = "&vno="
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = "&uuid="
            r7.append(r2)
            r7.append(r9)
            java.lang.String r9 = "&app="
            r7.append(r9)
            r7.append(r4)
            if (r0 == 0) goto L_0x00b0
            java.lang.String r9 = "&enc=aes"
            r7.append(r9)
        L_0x00b0:
            java.lang.String r9 = r7.toString()
            byte[] r9 = com.uc.crashsdk.a.e.a((java.lang.String) r9, (byte[]) r10)
            if (r9 != 0) goto L_0x00bb
            return r3
        L_0x00bb:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            java.lang.String r9 = "retcode=0"
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x00c9
            return r1
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.k.b(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public static int k() {
        Iterator<String> it = b.a(new File("/proc/meminfo"), 2).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.indexOf("MemTotal:") >= 0) {
                try {
                    return Integer.parseInt(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e2) {
                    a.a(e2, false);
                    return 0;
                }
            }
        }
        return 0;
    }

    public static byte[] d() {
        return new byte[]{Byte.MAX_VALUE, 100, 110, Ascii.US};
    }

    private static String e(String str) {
        try {
            byte[] bytes = str.getBytes(getTabbarModel.ENC);
            MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
            instance.update(bytes);
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i2 = length + 0;
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = digest[i3];
                char c2 = i[(b2 & 240) >> 4];
                char c3 = i[b2 & Ascii.SI];
                sb.append(c2);
                sb.append(c3);
            }
            return sb.toString();
        } catch (Exception unused) {
            p.G();
            return null;
        }
    }
}
