package com.uc.crashsdk;

import com.alibaba.ariver.kernel.RVParams;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.uc.crashsdk.a.c;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.a.i;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

public final class b {
    private static Runnable A = new c();
    private static long B = 0;
    private static Object C = new Object();
    private static long D = 0;
    private static boolean E = false;
    private static boolean F = false;
    private static boolean G = false;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9878a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static String j = null;
    private static String k = null;
    private static String l = null;
    private static boolean m = false;
    private static boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    private static volatile boolean f9879o = false;
    private static boolean p = false;
    private static boolean q = false;
    private static boolean r = false;
    private static Object s = new Object();
    private static String t = null;
    private static int u = 0;
    private static RandomAccessFile v = null;
    /* access modifiers changed from: private */
    public static boolean w = false;
    private static Object x = new Object();
    private static String y = null;
    private static volatile Object[] z = null;

    public static String a() {
        String str = t;
        if (str != null) {
            return str;
        }
        String d2 = f.d();
        if (h.a(d2)) {
            t = "LLUN";
        } else {
            int i2 = 0;
            if (d2.length() > 48) {
                d2 = d2.substring(0, 48);
                i2 = d2.length() - 48;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = d2.getBytes();
            for (int length = bytes.length - 1; length >= 0; length--) {
                byte b2 = bytes[length];
                if (b2 == 46) {
                    sb.append('0');
                } else if (b2 == 58) {
                    sb.append('1');
                } else if (b2 >= 97 && b2 <= 122) {
                    sb.append((char) ((b2 + 65) - 97));
                } else if (b2 >= 65 && b2 <= 90) {
                    sb.append((char) b2);
                } else if (b2 < 48 || b2 > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b2);
                }
            }
            if (i2 > 0) {
                sb.append(String.valueOf(i2));
            }
            t = sb.toString();
        }
        return t;
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append(a());
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public static String z() {
        if (f == null) {
            f = a("ss");
        }
        return f;
    }

    public static String b() {
        if (g == null) {
            g = a("ct");
        }
        return g;
    }

    public static String c() {
        if (h == null) {
            h = a(RVParams.SHOW_TITLEBAR);
        }
        return h;
    }

    public static String d() {
        if (i == null) {
            i = a(RVParams.READ_TITLE);
        }
        return i;
    }

    public static String e() {
        if (l == null) {
            l = a("lgsuf");
        }
        return l;
    }

    public static String f() {
        if (j == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(p.N());
            sb.append("up");
            j = sb.toString();
        }
        return j;
    }

    public static String g() {
        if (k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(p.N());
            sb.append("ver");
            k = sb.toString();
        }
        return k;
    }

    public static String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append("bvu");
        return sb.toString();
    }

    static String i() {
        return com.uc.crashsdk.a.b.a(new File(z()), 8, false);
    }

    private static void A() {
        if (!f9879o && !n) {
            synchronized (s) {
                if (!f9879o) {
                    b(p.N());
                    String i2 = i();
                    File file = new File(b());
                    p = "f".equals(i2);
                    q = "b".equals(i2);
                    boolean exists = file.exists();
                    r = exists;
                    if (exists) {
                        try {
                            file.delete();
                        } catch (Exception e2) {
                            com.uc.crashsdk.a.a.a(e2, false);
                        }
                    }
                    D();
                    f9879o = true;
                }
            }
        }
    }

    public static boolean j() {
        A();
        return p;
    }

    public static boolean k() {
        A();
        return q;
    }

    private static boolean B() {
        A();
        return r;
    }

    public static boolean l() {
        return m;
    }

    public static void a(boolean z2) {
        boolean z3;
        if (!m) {
            b(p.N());
            if (z2) {
                n = true;
                p = false;
                q = false;
                r = false;
                String[] strArr = {".st", ".wa", ".callback", ".threads", ".ct", ".signal", ".ff", ".bb"};
                String[] strArr2 = {"up"};
                File[] listFiles = new File(p.N()).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 8) {
                                z3 = false;
                                break;
                            } else if (name.endsWith(strArr[i2])) {
                                z3 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (!z3) {
                            int i3 = 0;
                            while (true) {
                                if (i3 > 0) {
                                    break;
                                } else if (name.equals(strArr2[0])) {
                                    z3 = true;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        if (z3) {
                            StringBuilder sb = new StringBuilder("delete file: ");
                            sb.append(file.getPath());
                            c.b(sb.toString());
                            com.uc.crashsdk.a.b.a(file);
                        }
                    }
                }
            } else {
                m = true;
                C();
            }
            D();
        }
    }

    private static void C() {
        if (d) {
            JNIBridge.nativeSyncStatus(HummerConstants.EXIT_H5_PAGE, (String) null, m ? 1 : 0);
        }
    }

    private static void D() {
        Object[] F2 = F();
        if (F2[0].equals(y) || z != null) {
            e = true;
            E();
            return;
        }
        b(F2);
    }

    private static void E() {
        if (!i.b(A)) {
            i.a(1, A);
            return;
        }
        Object[] objArr = z;
        if (objArr == null || !F()[0].equals(objArr[0])) {
            i.a(A);
            i.a(1, A);
        }
    }

    /* access modifiers changed from: private */
    public static void b(Object[] objArr) {
        z = objArr;
        synchronized (x) {
            String str = objArr[0];
            long longValue = objArr[1].longValue();
            if (longValue < B) {
                c.b("crashsdk", String.format("Update state generation %d, last is: %d", new Object[]{Long.valueOf(longValue), Long.valueOf(B)}));
                return;
            }
            B = longValue;
            String z2 = z();
            if (d) {
                if (v != null) {
                    com.uc.crashsdk.a.b.a((Closeable) v);
                    v = null;
                }
                boolean nativeChangeState = JNIBridge.nativeChangeState(z2, str, w);
                w = false;
                if (!nativeChangeState) {
                    c.c("write state failed: ".concat(String.valueOf(str)));
                }
            } else {
                if (v == null || w) {
                    if (v != null) {
                        com.uc.crashsdk.a.b.a((Closeable) v);
                        v = null;
                    }
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(z2, "rw");
                        v = randomAccessFile;
                        randomAccessFile.seek(0);
                        w = false;
                    } catch (Exception e2) {
                        com.uc.crashsdk.a.a.a(e2, false);
                    }
                }
                try {
                    v.write(str.getBytes());
                    v.seek(0);
                } catch (Exception e3) {
                    com.uc.crashsdk.a.a.a(e3, false);
                }
            }
            y = str;
            z = null;
            return;
        }
    }

    /* access modifiers changed from: private */
    public static Object[] F() {
        synchronized (C) {
            long j2 = D + 1;
            D = j2;
            if (m) {
                Object[] objArr = {"e", Long.valueOf(j2)};
                return objArr;
            } else if (E) {
                Object[] objArr2 = {"f", Long.valueOf(j2)};
                return objArr2;
            } else {
                Object[] objArr3 = {"b", Long.valueOf(j2)};
                return objArr3;
            }
        }
    }

    public static boolean m() {
        return b(p.N());
    }

    public static boolean n() {
        return b(p.O());
    }

    private static boolean b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        c.a("crashsdk", "Crash log directory was placed by a file!!!");
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public static void b(boolean z2) {
        if (z2 && m) {
            p.G();
            m = false;
            C();
        }
        if (!m) {
            A();
            E = z2;
            if (d) {
                JNIBridge.nativeSetForeground(z2);
            }
            D();
            if (z2) {
                a.a(false);
            }
            if (!w) {
                E();
            }
        }
    }

    public static boolean o() {
        return E;
    }

    public static void p() {
        F = true;
    }

    public static boolean q() {
        return F;
    }

    public static void r() {
        G = true;
    }

    public static boolean s() {
        return G;
    }

    public static boolean t() {
        if (!G) {
            return !h.a(a.f9861a) && a.f9861a.equals(f.d());
        }
        return true;
    }

    public static int u() {
        boolean B2 = B();
        return k() ? B2 ? 3 : 6 : j() ? B2 ? 2 : 5 : B2 ? 4 : 1;
    }

    public static void a(int i2) {
        u = i2;
        v();
    }

    public static void v() {
        if (d) {
            JNIBridge.nativeSyncStatus("logType", "12", u);
        }
    }

    public static boolean b(int i2) {
        return (i2 & u) != 0;
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        protected String f9880a;

        public abstract boolean a();

        public a(String str) {
            this.f9880a = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.uc.crashsdk.a.a.a(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0062, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:36:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00b0 A[SYNTHETIC, Splitter:B:89:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.Object r4, java.lang.String r5, com.uc.crashsdk.b.a r6) {
        /*
            monitor-enter(r4)
            boolean r0 = d     // Catch:{ all -> 0x00b9 }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            int r0 = com.uc.crashsdk.JNIBridge.nativeOpenFile(r5)     // Catch:{ all -> 0x00b9 }
            if (r0 >= 0) goto L_0x001d
            java.lang.String r6 = "Can not open file: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = r6.concat(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "crashsdk"
            com.uc.crashsdk.a.c.a(r6, r5)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b9 }
            return r1
        L_0x001d:
            r5 = 1
            boolean r5 = com.uc.crashsdk.JNIBridge.nativeLockFile(r0, r5)     // Catch:{ all -> 0x0037 }
            boolean r6 = r6.a()     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x002b
            com.uc.crashsdk.JNIBridge.nativeLockFile(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x002b:
            com.uc.crashsdk.JNIBridge.nativeCloseFile(r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x00aa
        L_0x0030:
            r6 = move-exception
            if (r5 == 0) goto L_0x0036
            com.uc.crashsdk.JNIBridge.nativeLockFile(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x0036:
            throw r6     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r5 = move-exception
            com.uc.crashsdk.JNIBridge.nativeCloseFile(r0)     // Catch:{ all -> 0x00b9 }
            throw r5     // Catch:{ all -> 0x00b9 }
        L_0x003c:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00b9 }
            r0.<init>(r5)     // Catch:{ all -> 0x00b9 }
            boolean r5 = r0.exists()     // Catch:{ all -> 0x00b9 }
            if (r5 != 0) goto L_0x004f
            r0.createNewFile()     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00b9 }
        L_0x004f:
            r5 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x005e, all -> 0x005c }
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005c }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ Exception -> 0x005e, all -> 0x005c }
            goto L_0x0063
        L_0x005c:
            r6 = move-exception
            goto L_0x00ae
        L_0x005e:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r1)     // Catch:{ Exception -> 0x0099, all -> 0x005c }
            r0 = r5
        L_0x0063:
            if (r0 == 0) goto L_0x0071
            java.nio.channels.FileLock r5 = r0.lock()     // Catch:{ Exception -> 0x006a }
            goto L_0x0071
        L_0x006a:
            r2 = move-exception
            com.uc.crashsdk.a.a.a(r2, r1)     // Catch:{ Exception -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r5 = move-exception
            goto L_0x009c
        L_0x0071:
            boolean r6 = r6.a()     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0082
            r5.release()     // Catch:{ Exception -> 0x007b }
            goto L_0x0082
        L_0x007b:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0082
        L_0x0080:
            r5 = move-exception
            goto L_0x009d
        L_0x0082:
            if (r0 == 0) goto L_0x00aa
            r0.close()     // Catch:{ Exception -> 0x0088 }
            goto L_0x00aa
        L_0x0088:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x00aa
        L_0x008d:
            r6 = move-exception
            if (r5 == 0) goto L_0x0098
            r5.release()     // Catch:{ Exception -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ Exception -> 0x006f }
        L_0x0098:
            throw r6     // Catch:{ Exception -> 0x006f }
        L_0x0099:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x009c:
            r6 = 0
        L_0x009d:
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00aa
            r0.close()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00b9 }
        L_0x00aa:
            monitor-exit(r4)     // Catch:{ all -> 0x00b9 }
            return r6
        L_0x00ac:
            r6 = move-exception
            r5 = r0
        L_0x00ae:
            if (r5 == 0) goto L_0x00b8
            r5.close()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00b9 }
        L_0x00b8:
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.b.a(java.lang.Object, java.lang.String, com.uc.crashsdk.b$a):boolean");
    }
}
