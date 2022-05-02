package com.uc.crashsdk;

import android.util.SparseArray;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.c;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.b;
import java.io.File;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static Object f9893a = new Object();
    private static SparseArray<String> b = new SparseArray<>();
    private static boolean c = false;
    private static volatile Object d = new Object();

    public static void a(int i) {
        a(i, 1);
    }

    public static void a(int i, int i2) {
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder("Add stat for type ");
            sb.append(i);
            sb.append(" with count 0!");
            c.c(sb.toString());
            return;
        }
        String c2 = b.c();
        a(c2, (b.a) new l(c2, i, i2));
    }

    /* access modifiers changed from: private */
    public static boolean c(int i, int i2) {
        try {
            b.m();
        } catch (Throwable th) {
            a.a(th, false);
        }
        try {
            String b2 = b(i);
            if (b2 == null) {
                c.a("crashsdk", "Stat type not exists: ".concat(String.valueOf(i)));
                return false;
            }
            File file = new File(b.c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                a.a(th2, false);
            }
            StringBuffer a2 = a(file);
            if (h.a(a2)) {
                if (a2 == null) {
                    a2 = new StringBuffer();
                }
                StringBuilder sb = new StringBuilder("[");
                sb.append(f.d());
                sb.append("]\n");
                a2.append(sb.toString());
            }
            a(a2, b2, a(a2, b2) + i2);
            return a(file, a2);
        } catch (Exception e) {
            a.a(e, false);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004c A[SYNTHETIC, Splitter:B:33:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.StringBuffer a(java.io.File r5) {
        /*
            boolean r0 = r5.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = d()
            if (r0 != 0) goto L_0x0016
            java.lang.String r5 = "readCrashStatData alloc buffer failed!"
            java.lang.String r0 = "crashsdk"
            com.uc.crashsdk.a.c.a(r0, r5)
            return r1
        L_0x0016:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x003b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x003b }
            int r5 = r4.read(r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r5 <= 0) goto L_0x002a
            r2.append(r0, r3, r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x002a:
            r4.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x0049
        L_0x002e:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r3)
            goto L_0x0049
        L_0x0033:
            r5 = move-exception
            r1 = r4
            goto L_0x004a
        L_0x0036:
            r5 = move-exception
            r1 = r4
            goto L_0x003c
        L_0x0039:
            r5 = move-exception
            goto L_0x004a
        L_0x003b:
            r5 = move-exception
        L_0x003c:
            com.uc.crashsdk.a.a.a(r5, r3)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r3)
        L_0x0049:
            return r2
        L_0x004a:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r3)
        L_0x0054:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.k.a(java.io.File):java.lang.StringBuffer");
    }

    private static int a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf(SimpleComparison.EQUAL_TO_OPERATION, indexOf + str.length());
        if (indexOf2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" line not contain '='!");
            c.c(sb.toString());
            return 0;
        }
        int i = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            a.a(e, false);
            return 0;
        }
    }

    private static void a(StringBuffer stringBuffer, String str, int i) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf >= 0) {
            int indexOf2 = stringBuffer.indexOf("\n", indexOf);
            if (indexOf2 < 0) {
                indexOf2 = stringBuffer.length();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(String.valueOf(i));
            stringBuffer.replace(indexOf, indexOf2, sb.toString());
        } else if (i > 0) {
            stringBuffer.append(str);
            stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuffer.append(i);
            stringBuffer.append("\n");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[SYNTHETIC, Splitter:B:20:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0036 A[SYNTHETIC, Splitter:B:25:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r3, java.lang.StringBuffer r4) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ Exception -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3 = 1
            r2.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r4 = move-exception
            com.uc.crashsdk.a.a.a(r4, r0)
        L_0x001b:
            r0 = 1
            goto L_0x0033
        L_0x001d:
            r3 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x0020:
            r3 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0023:
            r3 = move-exception
            goto L_0x0034
        L_0x0025:
            r3 = move-exception
        L_0x0026:
            com.uc.crashsdk.a.a.a(r3, r0)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            com.uc.crashsdk.a.a.a(r3, r0)
        L_0x0033:
            return r0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r4 = move-exception
            com.uc.crashsdk.a.a.a(r4, r0)
        L_0x003e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.k.a(java.io.File, java.lang.StringBuffer):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ all -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(java.lang.String r11) {
        /*
            e()
            android.util.SparseArray<java.lang.String> r0 = b
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0093 }
            r1.<init>(r11)     // Catch:{ all -> 0x0093 }
            java.lang.StringBuffer r11 = a((java.io.File) r1)     // Catch:{ all -> 0x0093 }
            boolean r2 = com.uc.crashsdk.a.h.a((java.lang.StringBuffer) r11)     // Catch:{ all -> 0x0093 }
            r3 = 0
            if (r2 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x0018:
            java.lang.String r2 = "["
            int r2 = r11.indexOf(r2)     // Catch:{ all -> 0x0093 }
            if (r2 >= 0) goto L_0x0029
            java.lang.String r11 = "Can not found process name start!"
            java.lang.String r1 = "crashsdk"
            com.uc.crashsdk.a.c.a(r1, r11)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x0029:
            r4 = 1
            int r2 = r2 + r4
            java.lang.String r5 = "]"
            int r5 = r11.indexOf(r5, r2)     // Catch:{ all -> 0x0093 }
            if (r5 >= 0) goto L_0x003c
            java.lang.String r11 = "Can not found process name end!"
            java.lang.String r1 = "crashsdk"
            com.uc.crashsdk.a.c.a(r1, r11)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r3
        L_0x003c:
            java.lang.String r2 = r11.substring(r2, r5)     // Catch:{ all -> 0x0093 }
            r5 = 0
            r6 = 0
        L_0x0042:
            android.util.SparseArray<java.lang.String> r7 = b     // Catch:{ all -> 0x008b }
            int r7 = r7.size()     // Catch:{ all -> 0x008b }
            if (r5 >= r7) goto L_0x0084
            android.util.SparseArray<java.lang.String> r7 = b     // Catch:{ all -> 0x008b }
            int r7 = r7.keyAt(r5)     // Catch:{ all -> 0x008b }
            android.util.SparseArray<java.lang.String> r8 = b     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x008b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x008b }
            int r9 = a((java.lang.StringBuffer) r11, (java.lang.String) r8)     // Catch:{ all -> 0x008b }
            if (r9 <= 0) goto L_0x0081
            boolean r10 = com.uc.crashsdk.d.a(r2, r7, r9)     // Catch:{ all -> 0x008b }
            com.uc.crashsdk.a.k.a((java.lang.String) r2, (int) r7, (int) r9)     // Catch:{ all -> 0x008b }
            if (r10 != 0) goto L_0x006d
            boolean r9 = com.uc.crashsdk.p.I()     // Catch:{ all -> 0x008b }
            if (r9 == 0) goto L_0x0081
        L_0x006d:
            a(r11, r8, r3)     // Catch:{ all -> 0x007f }
            java.lang.String r6 = "Clear stat item: "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x007f }
            com.uc.crashsdk.a.c.b(r6)     // Catch:{ all -> 0x007f }
            r6 = 1
            goto L_0x0081
        L_0x007f:
            r2 = move-exception
            goto L_0x008d
        L_0x0081:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0084:
            if (r6 == 0) goto L_0x0089
            a((java.io.File) r1, (java.lang.StringBuffer) r11)     // Catch:{ all -> 0x0093 }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return r4
        L_0x008b:
            r2 = move-exception
            r4 = r6
        L_0x008d:
            if (r4 == 0) goto L_0x0092
            a((java.io.File) r1, (java.lang.StringBuffer) r11)     // Catch:{ all -> 0x0093 }
        L_0x0092:
            throw r2     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x0097
        L_0x0096:
            throw r11
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.k.d(java.lang.String):boolean");
    }

    private static char[] d() {
        char[] cArr = null;
        int i = 1024;
        while (cArr == null && i > 0) {
            try {
                cArr = new char[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    private static boolean a(String str, b.a aVar) {
        return b.a(f9893a, str, aVar);
    }

    public static boolean a(String str) {
        return a(str, (b.a) new m(str));
    }

    private static String b(int i) {
        String str;
        e();
        synchronized (b) {
            str = b.get(i);
        }
        return str;
    }

    private static void e() {
        synchronized (b) {
            if (b.size() == 0) {
                b.put(100, "start_pv");
                b.put(1, "all_all");
                b.put(2, "all_fg");
                b.put(3, "java_fg");
                b.put(4, "java_bg");
                b.put(7, "native_fg");
                b.put(8, "native_bg");
                b.put(27, "native_anr_fg");
                b.put(28, "native_anr_bg");
                b.put(9, "native_ok");
                b.put(10, "unexp_anr");
                b.put(29, "unexp_lowmem");
                b.put(30, "unexp_killed");
                b.put(31, "unexp_exit");
                b.put(11, "unexp_fg");
                b.put(12, "unexp_bg");
                b.put(13, "log_up_succ");
                b.put(14, "log_up_fail");
                b.put(15, "log_empty");
                b.put(16, "log_abd_all");
                b.put(22, "log_abd_crash");
                b.put(23, "log_abd_custom");
                b.put(17, "log_large");
                b.put(18, "log_up_all");
                b.put(19, "log_up_bytes");
                b.put(20, "log_up_crash");
                b.put(21, "log_up_custom");
                b.put(24, "log_zipped");
                b.put(25, "log_renamed");
                b.put(26, "log_safe_skip");
            }
        }
    }

    private static File[] f() {
        return new File(p.N()).listFiles(new n());
    }

    public static int a() {
        File[] f = f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File absolutePath : f) {
            if (a(absolutePath.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    public static boolean b(String str) {
        return a(str, (b.a) new o(str));
    }

    public static int b() {
        File[] f = f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File absolutePath : f) {
            if (b(absolutePath.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    public static void c() {
        if (!c) {
            synchronized (d) {
                if (!c) {
                    c = true;
                    if (b.j() || b.k()) {
                        a(1, 1);
                        if (b.j()) {
                            a(2, 1);
                        }
                    }
                    a(100, 1);
                }
            }
        }
    }
}
