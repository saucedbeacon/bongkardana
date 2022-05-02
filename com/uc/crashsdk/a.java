package com.uc.crashsdk;

import android.util.SparseArray;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.google.common.base.Ascii;
import com.uc.crashsdk.a.c;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.a.i;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

public class a {
    private static SparseArray<e> A = new SparseArray<>();
    private static List<Integer> B = new ArrayList();
    private static HashMap<String, C0039a> C = new HashMap<>();
    private static List<String> D = new ArrayList();
    private static int E = 0;
    private static int F = 0;
    private static Runnable G = new d(1);
    private static boolean H = false;
    private static boolean I = false;

    /* renamed from: a  reason: collision with root package name */
    public static String f9861a = "";
    public static String b = "";
    public static int c = 10;
    public static int d = 8;
    public static int e = 6;
    public static int f = 2;
    public static int g = 6;
    public static int h = 8;
    public static int i = 2048;
    static final /* synthetic */ boolean j = (!a.class.desiredAssertionStatus());
    private static Map<String, String> k = new HashMap();
    private static List<String> l = new ArrayList();
    private static String m = "";
    private static String n = null;

    /* renamed from: o  reason: collision with root package name */
    private static HashMap<String, c> f9862o = new HashMap<>();
    private static List<String> p = new ArrayList();
    private static int q = 0;
    private static int r = 0;
    private static int s = 0;
    private static HashMap<String, b> t = new HashMap<>();
    private static List<String> u = new ArrayList();
    private static int v = 0;
    private static int w = 0;
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;

    static /* synthetic */ void i() {
        c.b("Begin update unexp info ...");
        long currentTimeMillis = System.currentTimeMillis();
        if (b.d) {
            JNIBridge.nativeUpdateUnexpInfo(p.C());
        }
        StringBuilder sb = new StringBuilder("Update unexp info took ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
        c.b(sb.toString());
        a(false);
    }

    static /* synthetic */ void j() {
        String format = String.format("%s/%s/%s", new Object[]{p.K(), p.L(), p.M()});
        m = g();
        if (b.d) {
            JNIBridge.nativeSyncStatus("ver", m, 0);
        }
        d.a(b.g(), format);
        String str = m;
        if ((str == null || !str.equals(format)) && p.t()) {
            c.b(String.format("Is new version ('%s' -> '%s'), deleting old stats data!", new Object[]{m, format}));
            b.a(true);
        }
    }

    public static String a() {
        String str = n;
        if (str != null) {
            return str;
        }
        try {
            String str2 = e.a().getPackageManager().getPackageInfo(f9861a, 0).versionName;
            n = str2;
            return str2;
        } catch (Exception e2) {
            com.uc.crashsdk.a.a.a(e2, true);
            return "";
        }
    }

    public static void a(String str, String str2) {
        synchronized (k) {
            if (!k.containsKey(str)) {
                l.add(str);
            }
            k.put(str, str2);
            if (b.d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
        }
    }

    public static void b() {
        if (j || b.d) {
            synchronized (k) {
                for (String next : l) {
                    JNIBridge.nativeAddHeaderInfo(next, k.get(next));
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void a(OutputStream outputStream, String str) {
        synchronized (k) {
            for (String next : l) {
                try {
                    outputStream.write(next.getBytes(str));
                    outputStream.write(": ".getBytes(str));
                    String str2 = k.get(next);
                    if (str2 != null) {
                        outputStream.write(str2.getBytes(str));
                    }
                    outputStream.write("\n".getBytes(str));
                } catch (Throwable th) {
                    f.a(th, outputStream);
                }
            }
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f9865a;
        public String b;
        public boolean c;
        public boolean d;
        public boolean e;

        public c(int i, String str, boolean z, boolean z2, boolean z3) {
            this.f9865a = i;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }

    public static byte[] c() {
        return new byte[]{Ascii.CAN, 99, 121, 60};
    }

    public static int a(String str, String str2, boolean z2, boolean z3, int i2, boolean z4) {
        int i3;
        int i4;
        int i5;
        boolean z5 = false;
        if (str == null || str2 == null) {
            return 0;
        }
        synchronized (f9862o) {
            if (f9862o.containsKey(str)) {
                i4 = f9862o.get(str).f9865a;
                i3 = LogType.addType(i4, i2);
            } else {
                i3 = i2;
                i4 = 0;
            }
            if (LogType.isForJava(i3) && !LogType.isForJava(i4)) {
                if (q >= c) {
                    i3 = LogType.removeType(i3, 16);
                } else {
                    q++;
                }
            }
            if (LogType.isForNative(i3) && !LogType.isForNative(i4)) {
                if (r >= c) {
                    i3 = LogType.removeType(i3, 1);
                } else {
                    r++;
                }
            }
            if (LogType.isForUnexp(i3) && !LogType.isForUnexp(i4)) {
                if (s >= c) {
                    i3 = LogType.removeType(i3, 256);
                } else {
                    s++;
                }
            }
            i5 = i3;
            if ((i5 & LZMA_Base.kMatchMaxLen) != 0) {
                if (i4 == 0) {
                    p.add(str);
                }
                z5 = true;
            }
            if (z5) {
                if (b.d && (LogType.isForNative(i2) || LogType.isForUnexp(i2))) {
                    int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z2, z3, LogType.isForNative(i2), LogType.isForUnexp(i2), z4);
                    if (!LogType.isForNative(nativeAddDumpFile)) {
                        i5 = LogType.removeType(i5, 1);
                    }
                    if (!LogType.isForUnexp(nativeAddDumpFile)) {
                        i5 = LogType.removeType(i5, 256);
                    }
                }
                f9862o.put(str, new c(i5, str2, z2, z3, z4));
            }
        }
        return i5;
    }

    public static void d() {
        if (j || b.d) {
            synchronized (f9862o) {
                for (String next : p) {
                    c cVar = f9862o.get(next);
                    int i2 = cVar.f9865a;
                    if (LogType.isForNative(i2) || LogType.isForUnexp(i2)) {
                        JNIBridge.nativeAddDumpFile(next, cVar.b, cVar.c, cVar.d, LogType.isForNative(i2), LogType.isForUnexp(i2), cVar.e);
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void a(OutputStream outputStream, String str, ArrayList<String> arrayList) {
        boolean z2 = arrayList == null;
        synchronized (f9862o) {
            for (String next : p) {
                try {
                    c cVar = f9862o.get(next);
                    if (arrayList == null) {
                        if (!LogType.isForJava(cVar.f9865a)) {
                        }
                    } else if (!a(arrayList, next)) {
                    }
                    if (cVar.d) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(next);
                        sb.append("\n");
                        outputStream.write(sb.toString().getBytes(str));
                    }
                    if (cVar.c) {
                        f.a(outputStream, cVar.b);
                    } else {
                        f.b(outputStream, cVar.b);
                    }
                    if (cVar.e && z2) {
                        File file = new File(cVar.b);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                } catch (Throwable th) {
                    f.a(th, outputStream);
                }
            }
        }
    }

    private static boolean a(ArrayList<String> arrayList, String str) {
        if (h.a(str)) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9864a;
        public Callable<String> b;
        public long c;

        public b(int i, Callable<String> callable, long j) {
            this.f9864a = i;
            this.b = callable;
            this.c = j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0130, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r10, int r11, java.util.concurrent.Callable<java.lang.String> r12, long r13) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.HashMap<java.lang.String, com.uc.crashsdk.a$b> r1 = t
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.uc.crashsdk.a$b> r2 = t     // Catch:{ all -> 0x0131 }
            boolean r2 = r2.containsKey(r10)     // Catch:{ all -> 0x0131 }
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.String, com.uc.crashsdk.a$b> r2 = t     // Catch:{ all -> 0x0131 }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0131 }
            com.uc.crashsdk.a$b r2 = (com.uc.crashsdk.a.b) r2     // Catch:{ all -> 0x0131 }
            int r2 = r2.f9864a     // Catch:{ all -> 0x0131 }
            int r3 = com.uc.crashsdk.export.LogType.addType(r2, r11)     // Catch:{ all -> 0x0131 }
            if (r2 != r3) goto L_0x0023
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            return r2
        L_0x0021:
            r3 = r11
            r2 = 0
        L_0x0023:
            boolean r4 = com.uc.crashsdk.export.LogType.isForJava(r3)     // Catch:{ all -> 0x0131 }
            r5 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0064
            boolean r4 = com.uc.crashsdk.export.LogType.isForJava(r2)     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x0064
            int r4 = d     // Catch:{ all -> 0x0131 }
            int r8 = f     // Catch:{ all -> 0x0131 }
            int r4 = r4 - r8
            int r8 = v     // Catch:{ all -> 0x0131 }
            int r9 = d     // Catch:{ all -> 0x0131 }
            if (r8 < r9) goto L_0x003f
        L_0x003d:
            r4 = 1
            goto L_0x005c
        L_0x003f:
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x004e
            int r8 = y     // Catch:{ all -> 0x0131 }
            if (r8 < r4) goto L_0x0048
            goto L_0x003d
        L_0x0048:
            int r4 = y     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            y = r4     // Catch:{ all -> 0x0131 }
            goto L_0x0056
        L_0x004e:
            int r8 = v     // Catch:{ all -> 0x0131 }
            int r9 = y     // Catch:{ all -> 0x0131 }
            int r8 = r8 - r9
            if (r8 < r4) goto L_0x0056
            goto L_0x003d
        L_0x0056:
            int r4 = v     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            v = r4     // Catch:{ all -> 0x0131 }
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x0064
            r4 = 16
            int r3 = com.uc.crashsdk.export.LogType.removeType(r3, r4)     // Catch:{ all -> 0x0131 }
        L_0x0064:
            boolean r4 = com.uc.crashsdk.export.LogType.isForNative(r3)     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x00ad
            boolean r4 = com.uc.crashsdk.export.LogType.isForNative(r2)     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x00ad
            int r4 = e     // Catch:{ all -> 0x0131 }
            int r8 = f     // Catch:{ all -> 0x0131 }
            int r4 = r4 - r8
            int r8 = w     // Catch:{ all -> 0x0131 }
            int r9 = e     // Catch:{ all -> 0x0131 }
            if (r8 < r9) goto L_0x007f
        L_0x007b:
            r4 = 1
            r5 = 0
        L_0x007d:
            r6 = 0
            goto L_0x00a6
        L_0x007f:
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0096
            int r5 = z     // Catch:{ all -> 0x0131 }
            if (r5 < r4) goto L_0x0088
            goto L_0x007b
        L_0x0088:
            int r4 = z     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            z = r4     // Catch:{ all -> 0x0131 }
            int r4 = w     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            w = r4     // Catch:{ all -> 0x0131 }
            r4 = 0
            r5 = 1
            r6 = 1
            goto L_0x00a6
        L_0x0096:
            int r5 = w     // Catch:{ all -> 0x0131 }
            int r6 = z     // Catch:{ all -> 0x0131 }
            int r5 = r5 - r6
            if (r5 < r4) goto L_0x009e
            goto L_0x007b
        L_0x009e:
            int r4 = w     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            w = r4     // Catch:{ all -> 0x0131 }
            r4 = 0
            r5 = 1
            goto L_0x007d
        L_0x00a6:
            if (r4 == 0) goto L_0x00af
            int r3 = com.uc.crashsdk.export.LogType.removeType(r3, r7)     // Catch:{ all -> 0x0131 }
            goto L_0x00af
        L_0x00ad:
            r5 = 0
            r6 = 0
        L_0x00af:
            boolean r4 = com.uc.crashsdk.export.LogType.isForUnexp(r3)     // Catch:{ all -> 0x0131 }
            r8 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x00cf
            boolean r4 = com.uc.crashsdk.export.LogType.isForUnexp(r2)     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x00cf
            int r4 = x     // Catch:{ all -> 0x0131 }
            int r9 = g     // Catch:{ all -> 0x0131 }
            if (r4 < r9) goto L_0x00c8
            int r3 = com.uc.crashsdk.export.LogType.removeType(r3, r8)     // Catch:{ all -> 0x0131 }
            goto L_0x00cf
        L_0x00c8:
            int r4 = x     // Catch:{ all -> 0x0131 }
            int r4 = r4 + r7
            x = r4     // Catch:{ all -> 0x0131 }
            r4 = 1
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            r9 = r3 & 273(0x111, float:3.83E-43)
            if (r9 != 0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            if (r2 != 0) goto L_0x00dc
            java.util.List<java.lang.String> r0 = u     // Catch:{ all -> 0x0131 }
            r0.add(r10)     // Catch:{ all -> 0x0131 }
        L_0x00dc:
            r0 = 1
        L_0x00dd:
            if (r0 == 0) goto L_0x012f
            boolean r0 = com.uc.crashsdk.b.d     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0125
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r11)     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = com.uc.crashsdk.export.LogType.isForUnexp(r11)     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0125
        L_0x00ef:
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r11)     // Catch:{ all -> 0x0131 }
            boolean r11 = com.uc.crashsdk.export.LogType.isForUnexp(r11)     // Catch:{ all -> 0x0131 }
            int r11 = com.uc.crashsdk.JNIBridge.nativeAddCallbackInfo(r10, r0, r11, r13)     // Catch:{ all -> 0x0131 }
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r11)     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0113
            int r3 = com.uc.crashsdk.export.LogType.removeType(r3, r7)     // Catch:{ all -> 0x0131 }
            if (r5 == 0) goto L_0x010c
            int r0 = w     // Catch:{ all -> 0x0131 }
            int r0 = r0 - r7
            w = r0     // Catch:{ all -> 0x0131 }
        L_0x010c:
            if (r6 == 0) goto L_0x0113
            int r0 = z     // Catch:{ all -> 0x0131 }
            int r0 = r0 - r7
            z = r0     // Catch:{ all -> 0x0131 }
        L_0x0113:
            boolean r11 = com.uc.crashsdk.export.LogType.isForUnexp(r11)     // Catch:{ all -> 0x0131 }
            if (r11 != 0) goto L_0x0125
            int r11 = com.uc.crashsdk.export.LogType.removeType(r3, r8)     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0124
            int r0 = x     // Catch:{ all -> 0x0131 }
            int r0 = r0 - r7
            x = r0     // Catch:{ all -> 0x0131 }
        L_0x0124:
            r3 = r11
        L_0x0125:
            java.util.HashMap<java.lang.String, com.uc.crashsdk.a$b> r11 = t     // Catch:{ all -> 0x0131 }
            com.uc.crashsdk.a$b r0 = new com.uc.crashsdk.a$b     // Catch:{ all -> 0x0131 }
            r0.<init>(r3, r12, r13)     // Catch:{ all -> 0x0131 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0131 }
        L_0x012f:
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            return r3
        L_0x0131:
            r10 = move-exception
            monitor-exit(r1)
            goto L_0x0135
        L_0x0134:
            throw r10
        L_0x0135:
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.lang.String, int, java.util.concurrent.Callable, long):int");
    }

    public static void e() {
        if (j || b.d) {
            synchronized (t) {
                for (String next : u) {
                    b bVar = t.get(next);
                    int i2 = bVar.f9864a;
                    if (LogType.isForNative(i2) || LogType.isForUnexp(i2)) {
                        JNIBridge.nativeAddCallbackInfo(next, LogType.isForNative(i2), LogType.isForUnexp(i2), bVar.c);
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void a(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        String str3;
        synchronized (t) {
            for (String next : u) {
                try {
                    b bVar = t.get(next);
                    int i2 = bVar.f9864a;
                    if (arrayList == null) {
                        if (!LogType.isForJava(i2)) {
                        }
                    } else if (!a(arrayList, next)) {
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(next);
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                    if (bVar.c != 0) {
                        str3 = JNIBridge.nativeGetCallbackInfo(next, bVar.c);
                    } else {
                        str3 = c(next).toString();
                    }
                    if (str3 == null || str3.length() <= 0) {
                        outputStream.write("(data is null)\n".getBytes(str));
                    } else {
                        outputStream.write(str3.getBytes(str));
                    }
                } catch (Throwable th) {
                    f.a(th, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th2) {
                    f.a(th2, outputStream);
                }
            }
        }
        return;
    }

    public static String a(String str) {
        String obj;
        synchronized (t) {
            obj = c(str).toString();
        }
        return obj;
    }

    private static StringBuilder c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        try {
            b bVar = t.get(str);
            if (bVar == null) {
                str2 = "Unknown callback: ".concat(String.valueOf(str));
            } else if (bVar.b != null) {
                str2 = bVar.b.call();
            } else {
                str2 = d.a(str);
            }
            if (str2 != null) {
                sb.append(str2);
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.a.a(th2, false);
        }
        return sb;
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<Thread> f9868a;
        public String b;

        public e(Thread thread, String str) {
            this.f9868a = new WeakReference<>(thread);
            this.b = str;
        }
    }

    private static boolean a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        synchronized (A) {
            int id2 = (int) thread.getId();
            if (A.get(id2) == null) {
                B.add(Integer.valueOf(id2));
            }
            A.put(id2, new e(thread, str));
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ all -> 0x00f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.OutputStream r12, java.lang.String r13, java.lang.String r14) {
        /*
            android.util.SparseArray<com.uc.crashsdk.a$e> r0 = A
            monitor-enter(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0111 }
            java.util.List<java.lang.Integer> r2 = B     // Catch:{ all -> 0x0111 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0111 }
        L_0x000d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0111 }
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0111 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0111 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0111 }
            r4 = 0
            android.util.SparseArray<com.uc.crashsdk.a$e> r5 = A     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0059 }
            com.uc.crashsdk.a$e r5 = (com.uc.crashsdk.a.e) r5     // Catch:{ all -> 0x0059 }
            if (r5 != 0) goto L_0x0029
            goto L_0x000d
        L_0x0029:
            java.lang.ref.WeakReference<java.lang.Thread> r6 = r5.f9868a     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0059 }
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r5.b     // Catch:{ all -> 0x0057 }
            if (r6 != 0) goto L_0x0054
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = "Thread ("
            r5.<init>(r7)     // Catch:{ all -> 0x0057 }
            r5.append(r4)     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = ", "
            r5.append(r7)     // Catch:{ all -> 0x0057 }
            r5.append(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = ") has exited!"
            r5.append(r7)     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0057 }
            com.uc.crashsdk.a.c.c(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x000d
        L_0x0054:
            if (r1 == r6) goto L_0x000d
            goto L_0x005e
        L_0x0057:
            r5 = move-exception
            goto L_0x005b
        L_0x0059:
            r5 = move-exception
            r6 = r4
        L_0x005b:
            com.uc.crashsdk.f.a((java.lang.Throwable) r5, (java.io.OutputStream) r12)     // Catch:{ all -> 0x0111 }
        L_0x005e:
            r5 = 0
            r7 = 1
            java.lang.String r8 = "Thread Name: '%s'\n"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x00b4 }
            r9[r5] = r4     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x00b4 }
            byte[] r4 = r4.getBytes(r13)     // Catch:{ all -> 0x00b4 }
            r12.write(r4)     // Catch:{ all -> 0x00b4 }
            boolean r4 = r6.isDaemon()     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = " daemon"
            goto L_0x007c
        L_0x007a:
            java.lang.String r4 = ""
        L_0x007c:
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = "\"%s\"%s prio=%d tid=%d %s\n"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x00b4 }
            java.lang.String r11 = r6.getName()     // Catch:{ all -> 0x00b4 }
            r10[r5] = r11     // Catch:{ all -> 0x00b4 }
            r10[r7] = r4     // Catch:{ all -> 0x00b4 }
            r4 = 2
            int r11 = r6.getPriority()     // Catch:{ all -> 0x00b4 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00b4 }
            r10[r4] = r11     // Catch:{ all -> 0x00b4 }
            r4 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b4 }
            r10[r4] = r3     // Catch:{ all -> 0x00b4 }
            r3 = 4
            java.lang.Thread$State r4 = r6.getState()     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b4 }
            r10[r3] = r4     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = java.lang.String.format(r8, r9, r10)     // Catch:{ all -> 0x00b4 }
            byte[] r3 = r3.getBytes(r13)     // Catch:{ all -> 0x00b4 }
            r12.write(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r3 = move-exception
            com.uc.crashsdk.f.a((java.lang.Throwable) r3, (java.io.OutputStream) r12)     // Catch:{ all -> 0x0111 }
        L_0x00b8:
            java.lang.StackTraceElement[] r3 = r6.getStackTrace()     // Catch:{ all -> 0x00f3 }
            int r4 = r3.length     // Catch:{ all -> 0x00f3 }
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = "  (no stack frames)"
            byte[] r4 = r4.getBytes(r13)     // Catch:{ all -> 0x00f3 }
            r12.write(r4)     // Catch:{ all -> 0x00f3 }
        L_0x00c8:
            int r4 = r3.length     // Catch:{ all -> 0x00f3 }
            r6 = 0
            r8 = 1
        L_0x00cb:
            if (r6 >= r4) goto L_0x00f7
            r9 = r3[r6]     // Catch:{ all -> 0x00f3 }
            if (r8 != 0) goto L_0x00da
            java.lang.String r8 = "\n"
            byte[] r8 = r8.getBytes(r13)     // Catch:{ all -> 0x00f3 }
            r12.write(r8)     // Catch:{ all -> 0x00f3 }
        L_0x00da:
            java.lang.String r8 = "  at %s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f3 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00f3 }
            r10[r5] = r9     // Catch:{ all -> 0x00f3 }
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ all -> 0x00f3 }
            byte[] r8 = r8.getBytes(r13)     // Catch:{ all -> 0x00f3 }
            r12.write(r8)     // Catch:{ all -> 0x00f3 }
            int r6 = r6 + 1
            r8 = 0
            goto L_0x00cb
        L_0x00f3:
            r3 = move-exception
            com.uc.crashsdk.f.a((java.lang.Throwable) r3, (java.io.OutputStream) r12)     // Catch:{ all -> 0x0111 }
        L_0x00f7:
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r13)     // Catch:{ all -> 0x0109 }
            r12.write(r3)     // Catch:{ all -> 0x0109 }
            byte[] r3 = r14.getBytes(r13)     // Catch:{ all -> 0x0109 }
            r12.write(r3)     // Catch:{ all -> 0x0109 }
            goto L_0x000d
        L_0x0109:
            r3 = move-exception
            com.uc.crashsdk.f.a((java.lang.Throwable) r3, (java.io.OutputStream) r12)     // Catch:{ all -> 0x0111 }
            goto L_0x000d
        L_0x010f:
            monitor-exit(r0)     // Catch:{ all -> 0x0111 }
            return
        L_0x0111:
            r12 = move-exception
            monitor-exit(r0)
            goto L_0x0115
        L_0x0114:
            throw r12
        L_0x0115:
            goto L_0x0114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: com.uc.crashsdk.a$a  reason: collision with other inner class name */
    static class C0039a {

        /* renamed from: a  reason: collision with root package name */
        int f9863a;
        int b;
        List<String> c = new ArrayList();

        public C0039a(int i, int i2) {
            this.f9863a = i;
            this.b = i2;
        }
    }

    public static int a(String str, int i2, int i3) {
        int i4;
        int i5;
        boolean z2 = false;
        if (str == null || i2 <= 0) {
            return 0;
        }
        synchronized (C) {
            if (C.containsKey(str)) {
                i5 = C.get(str).b;
                i4 = LogType.addType(i5, i3);
            } else {
                i4 = i3;
                i5 = 0;
            }
            if (LogType.isForJava(i4) && !LogType.isForJava(i5)) {
                if (E >= h) {
                    i4 = LogType.removeType(i4, 16);
                } else {
                    E++;
                }
            }
            if (LogType.isForNative(i4) && !LogType.isForNative(i5)) {
                if (F >= h) {
                    i4 = LogType.removeType(i4, 1);
                } else {
                    F++;
                }
            }
            if ((i4 & LZMA_Base.kMatchMaxLen) != 0) {
                if (i5 == 0) {
                    D.add(str);
                }
                z2 = true;
            }
            if (z2) {
                if (b.d && LogType.isForNative(i3) && !JNIBridge.nativeCreateCachedInfo(str, i2)) {
                    i4 = LogType.removeType(i4, 1);
                }
                C.put(str, new C0039a(i2, i4));
            }
        }
        return i4;
    }

    public static int b(String str, String str2) {
        int i2 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        int length = str2.length();
        int i3 = i;
        if (length > i3) {
            str2 = str2.substring(0, i3);
        }
        synchronized (C) {
            C0039a aVar = C.get(str);
            if (aVar != null) {
                if (aVar.c.size() >= aVar.f9863a) {
                    aVar.c.remove(0);
                }
                aVar.c.add(str2);
                i2 = LogType.addType(0, 16);
                if (!b.d && LogType.isForNative(aVar.b)) {
                    i2 = LogType.addType(i2, 1);
                }
            }
            if (b.d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                i2 = LogType.addType(i2, 1);
            }
        }
        return i2;
    }

    public static void f() {
        if (j || b.d) {
            synchronized (C) {
                for (String next : D) {
                    C0039a aVar = C.get(next);
                    if (LogType.isForNative(aVar.b) && JNIBridge.nativeCreateCachedInfo(next, aVar.f9863a)) {
                        Iterator<String> it = aVar.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!JNIBridge.nativeAddCachedInfo(next, it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static void b(OutputStream outputStream, String str, String str2, ArrayList<String> arrayList) {
        synchronized (C) {
            for (String next : D) {
                C0039a aVar = C.get(next);
                int i2 = aVar.b;
                if (arrayList == null) {
                    if (!LogType.isForJava(i2)) {
                    }
                } else if (!a(arrayList, next)) {
                    continue;
                }
                try {
                    outputStream.write(String.format(Locale.US, "%s (%d/%d)\n", new Object[]{next, Integer.valueOf(aVar.c.size()), Integer.valueOf(aVar.f9863a)}).getBytes(str));
                } catch (Throwable th) {
                    f.a(th, outputStream);
                }
                try {
                    for (String bytes : aVar.c) {
                        outputStream.write(bytes.getBytes(str));
                        outputStream.write("\n".getBytes(str));
                    }
                } catch (Throwable th2) {
                    f.a(th2, outputStream);
                }
                try {
                    outputStream.write("\n".getBytes(str));
                    outputStream.write(str2.getBytes(str));
                } catch (Throwable th3) {
                    f.a(th3, outputStream);
                }
            }
        }
        return;
    }

    public static int a(int i2, String str) {
        if (h.a(str)) {
            str = Thread.currentThread().getName();
        }
        int i3 = 0;
        if (LogType.isForNative(i2)) {
            if (b.d) {
                synchronized (A) {
                    JNIBridge.nativeRegisterCurrentThread(str);
                }
                i3 = 1;
            } else {
                c.a("crashsdk", "crashsdk so has not loaded!");
            }
        }
        if (!LogType.isForJava(i2)) {
            return i3;
        }
        a(str, Thread.currentThread());
        return i3 | 16;
    }

    public static boolean a(boolean z2) {
        int i2;
        if (!b.c || !b.q()) {
            c.b("Unexp log or unexp stats not enabled, skip update unexp info!");
            return false;
        }
        if (z2) {
            i.a(G);
            i2 = 0;
        } else if (!b.o()) {
            c.b("Stop update unexp info in background!");
            return false;
        } else if (p.C() <= 0) {
            return false;
        } else {
            if (i.b(G)) {
                return true;
            }
            i2 = p.C() * 1000;
        }
        i.a(0, G, (long) i2);
        return true;
    }

    public static ArrayList<String> b(String str) {
        if (h.a(str)) {
            return null;
        }
        String[] split = str.split(";");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!h.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static String g() {
        if (!H) {
            String a2 = d.a(b.g());
            m = a2;
            H = true;
            if (a2 == null) {
                m = "";
            }
        }
        return m;
    }

    public static void h() {
        if (!I) {
            I = true;
            i.a(0, new d(2));
        } else if (b.d) {
            JNIBridge.nativeSyncStatus("ver", m, 0);
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f9866a = (!a.class.desiredAssertionStatus());
        private int b = 0;

        d(int i) {
            this.b = i;
        }

        public final void run() {
            int i = this.b;
            if (i == 1) {
                a.i();
            } else if (i == 2) {
                a.j();
            } else if (!f9866a) {
                throw new AssertionError();
            }
        }
    }
}
