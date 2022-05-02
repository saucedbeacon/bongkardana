package com.uc.crashsdk;

import android.app.ActivityManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.a.i;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.LogType;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Typography;

public class f implements Thread.UncaughtExceptionHandler {
    private static boolean A = false;
    private static Runnable B = null;
    private static Object C = new Object();

    /* renamed from: a  reason: collision with root package name */
    static String f9884a = null;
    static final /* synthetic */ boolean b;
    private static long c = 0;
    private static volatile boolean d = false;
    private static boolean e = false;
    private static boolean g = true;
    private static int getMax = 0;
    private static char[] getMin = null;
    private static String h = null;
    private static int i = 8;
    private static int j = 128;
    private static boolean k = false;
    private static String l = null;
    private static Object m = new Object();
    private static Object n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static Object f9885o = new Object();
    private static Object p = new Object();
    private static ArrayList<String> q = new ArrayList<>();
    private static int r = 0;
    private static String s = null;
    private static int setMax = 1;
    private static char setMin;
    private static boolean t = false;
    private static String u;
    private static String v;
    private static String w;
    private static Object x = new Object();
    private static Thread.UncaughtExceptionHandler y;
    private static Throwable z;
    private final List<FileInputStream> f = new ArrayList();

    static void setMax() {
        setMin = 3;
        getMin = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static /* synthetic */ void a(Throwable th) {
        int i2 = getMax + 33;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        com.uc.crashsdk.a.a.a(th, false);
        int i4 = setMax + 27;
        getMax = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void e(String str) {
        try {
            File file = new File(b.e());
            try {
                boolean z2 = false;
                if (!k) {
                    int i2 = setMax + 51;
                    getMax = i2 % 128;
                    int i3 = i2 % 2;
                    k = true;
                    String str2 = null;
                    if (file.exists()) {
                        int i4 = setMax + 111;
                        getMax = i4 % 128;
                        str2 = (i4 % 2 != 0 ? 'Q' : '.') != '.' ? a(com.uc.crashsdk.a.b.a(file, j, false)) : a(com.uc.crashsdk.a.b.a(file, j, true));
                    }
                    JNIBridge.nativeSyncInfo("mLogTypeSuffix", str2, 1, 0);
                }
                if (h.a(str)) {
                    z2 = true;
                }
                if (z2) {
                    com.uc.crashsdk.a.b.a(file);
                } else {
                    com.uc.crashsdk.a.b.a(file, str.getBytes());
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    static /* synthetic */ boolean q() {
        int i2 = setMax + 105;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = g;
        int i4 = getMax + 11;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r0 % 2 != 0) != true) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void r() {
        /*
            com.uc.crashsdk.export.CrashApi r0 = com.uc.crashsdk.export.CrashApi.getInstance()
            int r0 = r0.getLastExitType()
            r1 = 3
            r2 = 5
            if (r0 != r2) goto L_0x000f
            r0 = 93
            goto L_0x0010
        L_0x000f:
            r0 = 3
        L_0x0010:
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L_0x0025
            int r0 = setMax
            int r0 = r0 + r2
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == r3) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.uc.crashsdk.JNIBridge.nativePrepareUnexpInfos(r3)     // Catch:{ Exception -> 0x0041 }
            com.uc.crashsdk.a.a((boolean) r4)     // Catch:{ Exception -> 0x003f }
            int r0 = setMax     // Catch:{ Exception -> 0x003f }
            int r0 = r0 + 117
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x003f }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003e
            r0 = 89
            int r0 = r0 / r4
            return
        L_0x003c:
            r0 = move-exception
            throw r0
        L_0x003e:
            return
        L_0x003f:
            r0 = move-exception
            throw r0
        L_0x0041:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.r():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0 == 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        com.uc.crashsdk.k.a(11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 != 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        com.uc.crashsdk.k.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r0 != 3) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r0 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r0 != 4) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r0 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r0 != 5) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r0 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        r0 = C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = com.uc.crashsdk.JNIBridge.nativeGenerateUnexpLog((long) com.uc.crashsdk.p.o());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void s() {
        /*
            java.lang.Object r0 = C
            monitor-enter(r0)
            java.lang.Runnable r1 = B     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0009:
            r1 = 1
            A = r1     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            int r0 = com.uc.crashsdk.p.o()
            long r2 = (long) r0
            int r0 = com.uc.crashsdk.JNIBridge.nativeGenerateUnexpLog(r2)
            if (r0 == 0) goto L_0x003b
            r2 = 11
            com.uc.crashsdk.k.a((int) r2)
            r2 = 2
            if (r0 != r2) goto L_0x0026
            r0 = 10
        L_0x0022:
            com.uc.crashsdk.k.a((int) r0)
            goto L_0x0038
        L_0x0026:
            r2 = 3
            if (r0 != r2) goto L_0x002c
            r0 = 29
            goto L_0x0022
        L_0x002c:
            r2 = 4
            if (r0 != r2) goto L_0x0032
            r0 = 30
            goto L_0x0022
        L_0x0032:
            r2 = 5
            if (r0 != r2) goto L_0x0038
            r0 = 31
            goto L_0x0022
        L_0x0038:
            c((boolean) r1)
        L_0x003b:
            java.lang.Object r0 = C
            monitor-enter(r0)
            r1 = 0
            B = r1     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x004a
        L_0x0049:
            throw r1
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.s():void");
    }

    static /* synthetic */ void t() {
        try {
            int i2 = getMax + 97;
            try {
                setMax = i2 % 128;
                char c2 = i2 % 2 == 0 ? 'D' : 'A';
                B();
                if (c2 != 'A') {
                    int i3 = 3 / 0;
                }
                int i4 = getMax + 65;
                setMax = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    static /* synthetic */ Object u() {
        int i2 = getMax + 43;
        setMax = i2 % 128;
        if ((i2 % 2 == 0 ? 1 : Typography.dollar) == '$') {
            return m;
        }
        try {
            int i3 = 47 / 0;
            return m;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public f() {
        try {
            v();
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
        }
    }

    private void v() {
        int i2 = getMax + 63;
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
        }
        int D = p.D();
        int i3 = 0;
        while (i3 < D) {
            try {
                this.f.add(new FileInputStream("/dev/null"));
                int i4 = setMax + 15;
                getMax = i4 % 128;
                i3 = !(i4 % 2 == 0) ? i3 + 97 : i3 + 1;
            } catch (Exception e2) {
                com.uc.crashsdk.a.a.a(e2, false);
                return;
            }
        }
    }

    static class b extends OutputStream {
        private static int getMin = 0;
        private static int length = 1;
        private static long setMax = -5574753319041837409L;
        private static char[] setMin = {6390, 52840, 46555, 39763, 17127};

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f9887a;
        private int b;
        private int c;
        private boolean d;

        public b(OutputStream outputStream) {
            try {
                this.b = 0;
                this.c = 0;
                this.d = false;
                this.f9887a = outputStream;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int a(byte[] r5, int r6, int r7) {
            /*
                r4 = this;
                int r0 = r4.c
                int r0 = r0 + r7
                r4.c = r0
                boolean r0 = r4.d
                r1 = 0
                if (r0 == 0) goto L_0x0015
                int r5 = getMin
                int r5 = r5 + 55
                int r6 = r5 % 128
                length = r6
                int r5 = r5 % 2
                return r1
            L_0x0015:
                int r0 = com.uc.crashsdk.p.w()
                r2 = 4
                if (r0 <= 0) goto L_0x001e
                r3 = 4
                goto L_0x0020
            L_0x001e:
                r3 = 85
            L_0x0020:
                if (r3 == r2) goto L_0x0023
                goto L_0x0035
            L_0x0023:
                int r2 = r4.b
                int r3 = r2 + r7
                if (r3 <= r0) goto L_0x0035
                int r0 = r0 - r2
                int r2 = length
                int r2 = r2 + 123
                int r3 = r2 % 128
                getMin = r3
                int r2 = r2 % 2
                goto L_0x0036
            L_0x0035:
                r0 = r7
            L_0x0036:
                int r2 = r4.b
                int r2 = r2 + r0
                r4.b = r2
                java.io.OutputStream r2 = r4.f9887a
                r2.write(r5, r6, r0)
                r5 = 1
                if (r0 >= r7) goto L_0x0044
                r1 = 1
            L_0x0044:
                if (r1 == r5) goto L_0x0047
                goto L_0x0049
            L_0x0047:
                r4.d = r5
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.b.a(byte[], int, int):int");
        }

        public final void a() {
            int i = getMin + 31;
            length = i % 128;
            int i2 = i % 2;
            try {
                if ((this.c - this.b > 0 ? '0' : 29) != 29) {
                    try {
                        int i3 = getMin + 27;
                        length = i3 % 128;
                        int i4 = i3 % 2;
                        a("\n".getBytes(setMin(TextUtils.lastIndexOf("", '0', 0) + 1, (char) (6307 - TextUtils.indexOf("", "")), (ViewConfiguration.getTapTimeout() >> 16) + 5).intern()));
                        a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes(setMin(1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 6307), 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))).intern()));
                    } catch (Exception e) {
                        throw e;
                    }
                }
                a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(p.w()), Integer.valueOf(this.c - this.b)}).getBytes(setMin(TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6307), 5 - View.MeasureSpec.getMode(0)).intern()));
            } catch (Throwable th) {
                com.uc.crashsdk.a.a.a(th, false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
            if ((com.uc.crashsdk.f.q() ? (char) 20 : 18) != 18) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r2 != true) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(byte[] r4) {
            /*
                r3 = this;
                int r0 = length
                int r0 = r0 + 125
                int r1 = r0 % 128
                getMin = r1
                int r0 = r0 % 2
                if (r0 == 0) goto L_0x001d
                boolean r0 = com.uc.crashsdk.f.q()
                r1 = 55
                r2 = 0
                int r1 = r1 / r2
                r1 = 1
                if (r0 == 0) goto L_0x0018
                r2 = 1
            L_0x0018:
                if (r2 == r1) goto L_0x002c
                goto L_0x0053
            L_0x001b:
                r4 = move-exception
                throw r4
            L_0x001d:
                boolean r0 = com.uc.crashsdk.f.q()
                r1 = 18
                if (r0 == 0) goto L_0x0028
                r0 = 20
                goto L_0x002a
            L_0x0028:
                r0 = 18
            L_0x002a:
                if (r0 == r1) goto L_0x0053
            L_0x002c:
                int r0 = length
                int r0 = r0 + 37
                int r1 = r0 % 128
                getMin = r1
                int r0 = r0 % 2
                boolean r0 = com.uc.crashsdk.p.G()     // Catch:{ Exception -> 0x0051 }
                if (r0 == 0) goto L_0x0053
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4)
                java.lang.String r1 = "DEBUG"
                com.uc.crashsdk.a.c.a(r1, r0)
                int r0 = length
                int r0 = r0 + 83
                int r1 = r0 % 128
                getMin = r1
                int r0 = r0 % 2
                goto L_0x0053
            L_0x0051:
                r4 = move-exception
                throw r4
            L_0x0053:
                java.io.OutputStream r0 = r3.f9887a     // Catch:{ Exception -> 0x0059 }
                r0.write(r4)     // Catch:{ Exception -> 0x0059 }
                return
            L_0x0059:
                r4 = move-exception
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.b.a(byte[]):void");
        }

        public final void write(int i) {
            if (f.q()) {
                int i2 = getMin + 7;
                length = i2 % 128;
                int i3 = i2 % 2;
                if ((p.G() ? '=' : '?') != '?') {
                    int i4 = length + 49;
                    getMin = i4 % 128;
                    com.uc.crashsdk.a.c.a("DEBUG", i4 % 2 != 0 ? String.format("%c", new Object[]{Integer.valueOf(i)}) : String.format("%c", new Object[]{Integer.valueOf(i)}));
                    int i5 = getMin + 97;
                    length = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            this.f9887a.write(i);
            this.b++;
            this.c++;
        }

        public final void write(byte[] bArr, int i, int i2) {
            int i3 = length + 83;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            if ((f.q() ? 'A' : 18) != 18) {
                try {
                    int i5 = length + 93;
                    try {
                        getMin = i5 % 128;
                        int i6 = i5 % 2;
                        if (p.G()) {
                            byte[] bArr2 = new byte[i2];
                            System.arraycopy(bArr, i, bArr2, 0, i2);
                            com.uc.crashsdk.a.c.a("DEBUG", new String(bArr2));
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            a(bArr, i, i2);
        }

        public final void write(byte[] bArr) {
            boolean z = false;
            if ((f.q() ? 'M' : 25) != 25) {
                if (p.G()) {
                    try {
                        int i = length + 125;
                        getMin = i % 128;
                        int i2 = i % 2;
                        if (!((bArr.length == 1) && bArr[0] == 10)) {
                            com.uc.crashsdk.a.c.a("DEBUG", new String(bArr));
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            a(bArr, 0, bArr.length);
            int i3 = length + 83;
            getMin = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (!z) {
                Object obj = null;
                super.hashCode();
            }
        }

        private static String setMin(int i, char c2, int i2) {
            char[] cArr;
            int i3 = length + 85;
            getMin = i3 % 128;
            int i4 = 0;
            if (i3 % 2 != 0) {
                cArr = new char[i2];
                i4 = 1;
            } else {
                cArr = new char[i2];
            }
            while (true) {
                if ((i4 < i2 ? 'T' : 'N') != 'T') {
                    return new String(cArr);
                }
                int i5 = getMin + 53;
                length = i5 % 128;
                int i6 = i5 % 2;
                try {
                    cArr[i4] = (char) ((int) ((((long) setMin[i + i4]) ^ (((long) i4) * setMax)) ^ ((long) c2)));
                    i4++;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    private static String f(String str) {
        String str2;
        int i2 = getMax + 105;
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                str2 = str.replaceAll("[^0-9a-zA-Z-.]", "-");
                Object obj = null;
                super.hashCode();
            } catch (Throwable unused) {
                str2 = "unknown";
            }
        } else {
            str2 = str.replaceAll("[^0-9a-zA-Z-.]", "-");
        }
        int i3 = setMax + 101;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private static String w() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.e());
        sb.append("_");
        String obj = sb.toString();
        int i2 = getMax + 121;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    public static void a() {
        int i2 = setMax + 77;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        h = null;
        try {
            int i4 = getMax + 31;
            setMax = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.String] */
    public static String b() {
        int i2 = setMax + 77;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = false;
        if (h != null) {
            int i4 = setMax + 13;
            getMax = i4 % 128;
            if ((i4 % 2 != 0 ? '_' : 25) != 25) {
                try {
                    int i5 = 23 / 0;
                    return h;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                try {
                    return h;
                } catch (Exception e3) {
                    throw e3;
                }
            }
        } else {
            ? r0 = 0;
            String g2 = g((String) r0);
            h = g2;
            int i6 = getMax + 7;
            setMax = i6 % 128;
            if (i6 % 2 != 0) {
                z2 = true;
            }
            if (z2) {
                return g2;
            }
            int length = r0.length;
            return g2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r6 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r6 == null) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String g(java.lang.String r6) {
        /*
            int r0 = setMax
            int r0 = r0 + 27
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0032
            goto L_0x0021
        L_0x001b:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0065 }
            if (r6 != 0) goto L_0x0032
        L_0x0021:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r0 = setMax
            int r0 = r0 + 7
            int r4 = r0 % 128
            getMax = r4
            int r0 = r0 % r1
        L_0x0032:
            java.util.Locale r0 = java.util.Locale.US
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = w()
            r4[r2] = r5
            java.lang.String r2 = com.uc.crashsdk.p.K()
            r4[r3] = r2
            java.lang.String r2 = com.uc.crashsdk.p.M()
            r4[r1] = r2
            r1 = 3
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r2 = f((java.lang.String) r2)
            r4[r1] = r2
            r1 = 4
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r2 = f((java.lang.String) r2)
            r4[r1] = r2
            r1 = 5
            r4[r1] = r6
            java.lang.String r6 = "%s%s_%s_%s_%s_%s_"
            java.lang.String r6 = java.lang.String.format(r0, r6, r4)
            return r6
        L_0x0065:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.g(java.lang.String):java.lang.String");
    }

    private static String x() {
        int i2 = setMax + 27;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((b.o() ? '/' : '!') != '/') {
                return "bg";
            }
            int i4 = setMax + 77;
            try {
                getMax = i4 % 128;
                int i5 = i4 % 2;
                return "fg";
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private static byte[] y() {
        int i2 = 1024;
        int i3 = getMax + 31;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = null;
        byte[] bArr2 = bArr;
        while (bArr2 == null) {
            try {
                int i5 = setMax + 57;
                try {
                    getMax = i5 % 128;
                    boolean z2 = false;
                    if (i5 % 2 == 0) {
                        if (i2 <= 0) {
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        super.hashCode();
                        if (i2 > 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    int i6 = getMax + 115;
                    setMax = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        bArr2 = new byte[i2];
                    } catch (Throwable unused) {
                        i2 /= 2;
                        if (i2 < 16) {
                            break;
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        return bArr2;
    }

    private static String h(String str) {
        int i2 = getMax + 35;
        setMax = i2 % 128;
        if (!(i2 % 2 != 0)) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            objArr[1] = b();
            objArr[1] = g();
            objArr[2] = x();
            objArr[5] = str;
            objArr[4] = a(p.H());
            return String.format(locale, "%s%s_%s_%s%s.log", objArr);
        }
        try {
            Locale locale2 = Locale.US;
            try {
                Object[] objArr2 = new Object[5];
                objArr2[0] = b();
                objArr2[1] = g();
                objArr2[2] = x();
                objArr2[3] = str;
                objArr2[4] = a(p.H());
                return String.format(locale2, "%s%s_%s_%s%s.log", objArr2);
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    static String a(String str) {
        boolean z2 = false;
        if (!(h.a(str))) {
            int length = str.length();
            int i2 = j;
            if (length > i2) {
                str = str.substring(0, i2);
            }
            String f2 = f(str);
            if (f2.startsWith(".")) {
                z2 = true;
            }
            if (!z2) {
                try {
                    return ".".concat(String.valueOf(f2));
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                int i3 = getMax + 17;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                return f2;
            }
        } else {
            int i5 = getMax + 89;
            setMax = i5 % 128;
            if ((i5 % 2 == 0 ? 'O' : 'Z') == 'Z') {
                return "";
            }
            Object obj = null;
            super.hashCode();
            return "";
        }
    }

    static void b(String str) {
        i.a(0, new d(str));
        try {
            int i2 = setMax + 87;
            getMax = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f9888a = (!f.class.desiredAssertionStatus());
        private int b;
        private String c;

        d(int i) {
            this.b = 0;
            this.c = null;
            this.b = i;
        }

        d(String str) {
            this.b = 0;
            this.c = null;
            this.b = 4;
            this.c = str;
        }

        public final void run() {
            int i = this.b;
            if (i == 1) {
                f.r();
            } else if (i == 2) {
                f.s();
            } else if (i == 3) {
                f.t();
            } else if (i == 4) {
                f.e(this.c);
            } else if (!f9888a) {
                throw new AssertionError();
            }
        }
    }

    private static String z() {
        int i2 = getMax + 37;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if ((b.s() ? '?' : 18) == 18) {
            return LogType.JAVA_TYPE;
        }
        int i4 = getMax + 121;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return !(!e) ? LogType.JAVA_TYPE : "ucebujava";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
        if (r9 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010c, code lost:
        if (r4 > 0) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0145 A[Catch:{ all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014c A[Catch:{ all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0136 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac A[SYNTHETIC, Splitter:B:60:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0134 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(boolean r11) {
        /*
            int r0 = getMax     // Catch:{ Exception -> 0x0157 }
            int r0 = r0 + 49
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x0157 }
            int r0 = r0 % 2
            r0 = 0
            boolean r1 = com.uc.crashsdk.b.n()     // Catch:{ all -> 0x0152 }
            r2 = 1
            if (r1 != 0) goto L_0x002a
            int r11 = setMax
            int r11 = r11 + 33
            int r1 = r11 % 128
            getMax = r1
            int r11 = r11 % 2
            if (r11 == 0) goto L_0x0020
            r11 = 1
            goto L_0x0021
        L_0x0020:
            r11 = 0
        L_0x0021:
            if (r11 == r2) goto L_0x0024
            return
        L_0x0024:
            r11 = 43
            int r11 = r11 / r0
            return
        L_0x0028:
            r11 = move-exception
            throw r11
        L_0x002a:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = com.uc.crashsdk.p.O()     // Catch:{ all -> 0x0152 }
            r1.<init>(r3)     // Catch:{ all -> 0x0152 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ all -> 0x0152 }
            if (r1 != 0) goto L_0x003a
            return
        L_0x003a:
            int r3 = com.uc.crashsdk.p.l()     // Catch:{ all -> 0x0152 }
            int r4 = com.uc.crashsdk.p.m()     // Catch:{ all -> 0x0152 }
            int r5 = r1.length     // Catch:{ all -> 0x0152 }
            int r6 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x0152 }
            if (r5 >= r6) goto L_0x004a
            return
        L_0x004a:
            int r5 = r1.length     // Catch:{ all -> 0x0152 }
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x004e:
            if (r6 >= r5) goto L_0x0069
            r9 = r1[r6]     // Catch:{ all -> 0x0152 }
            boolean r9 = b((java.io.File) r9)     // Catch:{ all -> 0x0152 }
            r10 = 21
            if (r9 == 0) goto L_0x005d
            r9 = 59
            goto L_0x005f
        L_0x005d:
            r9 = 21
        L_0x005f:
            if (r9 == r10) goto L_0x0064
            int r7 = r7 + 1
            goto L_0x0066
        L_0x0064:
            int r8 = r8 + 1
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0069:
            if (r11 == 0) goto L_0x0076
            if (r7 < r3) goto L_0x006f
            r5 = 0
            goto L_0x0070
        L_0x006f:
            r5 = 1
        L_0x0070:
            if (r5 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            int r7 = r7 - r3
            int r7 = r7 + r2
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r11 != 0) goto L_0x008e
            int r11 = getMax
            int r11 = r11 + 83
            int r3 = r11 % 128
            setMax = r3
            int r11 = r11 % 2
            if (r8 < r4) goto L_0x0087
            r11 = 1
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            if (r11 == r2) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            int r8 = r8 - r4
            int r8 = r8 + r2
            goto L_0x008f
        L_0x008e:
            r8 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x009e
            int r11 = getMax
            int r11 = r11 + 91
            int r3 = r11 % 128
            setMax = r3
            int r11 = r11 % 2
            if (r8 != 0) goto L_0x009e
            return
        L_0x009e:
            com.uc.crashsdk.f$c r11 = new com.uc.crashsdk.f$c     // Catch:{ all -> 0x0152 }
            r11.<init>(r0)     // Catch:{ all -> 0x0152 }
            java.util.Arrays.sort(r1, r11)     // Catch:{ all -> 0x0152 }
            r3 = r7
            r4 = r8
            r11 = 0
        L_0x00a9:
            int r5 = r1.length     // Catch:{ all -> 0x0152 }
            if (r11 >= r5) goto L_0x013c
            int r5 = getMax     // Catch:{ Exception -> 0x013a }
            int r5 = r5 + 57
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r6 = 0
            if (r5 != 0) goto L_0x00ca
            r5 = r1[r11]     // Catch:{ all -> 0x0152 }
            boolean r9 = b((java.io.File) r5)     // Catch:{ all -> 0x0152 }
            super.hashCode()     // Catch:{ all -> 0x0152 }
            if (r9 == 0) goto L_0x00c6
            r10 = 1
            goto L_0x00c7
        L_0x00c6:
            r10 = 0
        L_0x00c7:
            if (r10 == r2) goto L_0x00d2
            goto L_0x00ef
        L_0x00ca:
            r5 = r1[r11]     // Catch:{ all -> 0x0152 }
            boolean r9 = b((java.io.File) r5)     // Catch:{ all -> 0x0152 }
            if (r9 == 0) goto L_0x00ef
        L_0x00d2:
            if (r3 <= 0) goto L_0x00ef
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            java.lang.String r9 = "Delete oldest crash log: "
            r6.<init>(r9)     // Catch:{ all -> 0x0152 }
            java.lang.String r9 = r5.getPath()     // Catch:{ all -> 0x0152 }
            r6.append(r9)     // Catch:{ all -> 0x0152 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0152 }
            com.uc.crashsdk.a.c.b(r6)     // Catch:{ all -> 0x0152 }
            r5.delete()     // Catch:{ all -> 0x0152 }
            int r3 = r3 + -1
            goto L_0x0132
        L_0x00ef:
            if (r9 != 0) goto L_0x0132
            int r9 = setMax
            int r9 = r9 + 19
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % 2
            r10 = 98
            if (r9 == 0) goto L_0x0102
            r9 = 47
            goto L_0x0104
        L_0x0102:
            r9 = 98
        L_0x0104:
            if (r9 == r10) goto L_0x010c
            super.hashCode()     // Catch:{ all -> 0x0152 }
            if (r4 <= 0) goto L_0x0132
            goto L_0x010e
        L_0x010c:
            if (r4 <= 0) goto L_0x0132
        L_0x010e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            java.lang.String r9 = "Delete oldest custom log: "
            r6.<init>(r9)     // Catch:{ all -> 0x0152 }
            java.lang.String r9 = r5.getPath()     // Catch:{ all -> 0x0152 }
            r6.append(r9)     // Catch:{ all -> 0x0152 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0152 }
            com.uc.crashsdk.a.c.b(r6)     // Catch:{ all -> 0x0152 }
            r5.delete()     // Catch:{ all -> 0x0152 }
            int r4 = r4 + -1
            int r5 = getMax     // Catch:{ Exception -> 0x013a }
            int r5 = r5 + 53
            int r6 = r5 % 128
            setMax = r6     // Catch:{ Exception -> 0x0157 }
            int r5 = r5 % 2
        L_0x0132:
            if (r3 != 0) goto L_0x0136
            if (r4 == 0) goto L_0x013c
        L_0x0136:
            int r11 = r11 + 1
            goto L_0x00a9
        L_0x013a:
            r11 = move-exception
            throw r11
        L_0x013c:
            r11 = 16
            int r1 = r7 + r8
            com.uc.crashsdk.k.a((int) r11, (int) r1)     // Catch:{ all -> 0x0152 }
            if (r7 <= 0) goto L_0x014a
            r11 = 22
            com.uc.crashsdk.k.a((int) r11, (int) r7)     // Catch:{ all -> 0x0152 }
        L_0x014a:
            if (r8 <= 0) goto L_0x0151
            r11 = 23
            com.uc.crashsdk.k.a((int) r11, (int) r8)     // Catch:{ all -> 0x0152 }
        L_0x0151:
            return
        L_0x0152:
            r11 = move-exception
            com.uc.crashsdk.a.a.a(r11, r0)
            return
        L_0x0157:
            r11 = move-exception
            goto L_0x015a
        L_0x0159:
            throw r11
        L_0x015a:
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.c(boolean):void");
    }

    static class c implements Comparator<File> {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() < file2.lastModified() ? -1 : 0;
        }
    }

    private static void a(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        int i2 = setMax + 33;
        getMax = i2 % 128;
        if ((i2 % 2 != 0 ? 16 : '1') != '1') {
            str3 = getMax(new char[]{1, 2, 0, 5, '|'}, 5 >> (ViewConfiguration.getPressedStateDuration() % 40), (byte) (127 / (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)))).intern();
            try {
                outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes(str3));
            } catch (Throwable th) {
                a(th, outputStream);
            }
        } else {
            str3 = getMax(new char[]{1, 2, 0, 5, '|'}, 5 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 68)).intern();
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes(str3));
        }
        boolean z2 = false;
        try {
            str4 = Build.HARDWARE;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.a.a(th2, false);
            str4 = "-";
        }
        try {
            outputStream.write(String.format(Locale.US, "Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", new Object[]{Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), g(), Build.CPU_ABI, str4}).getBytes(str3));
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        try {
            outputStream.write(String.format(Locale.US, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", new Object[]{Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)}).getBytes(str3));
            StringBuilder sb = new StringBuilder("Build fingerprint: '");
            sb.append(Build.FINGERPRINT);
            sb.append("'\n");
            outputStream.write(sb.toString().getBytes(str3));
            outputStream.write(String.format("Runtime Information: 'start: %s/maxheap: %s'\n", new Object[]{a(new Date(c)), Long.valueOf(Runtime.getRuntime().maxMemory())}).getBytes(str3));
        } catch (Throwable th4) {
            a(th4, outputStream);
        }
        try {
            outputStream.write(String.format("Application Information: 'version: %s/subversion: %s/buildseq: %s'\n", new Object[]{p.K(), p.L(), p.M()}).getBytes(str3));
            String str5 = "0";
            if (b.d) {
                str5 = JNIBridge.nativeGetNativeBuildseq();
            }
            outputStream.write(String.format("CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/target: %s'\n", new Object[]{"2.0.0.4", str5, "170706161743", "release"}).getBytes(str3));
            if (str == null) {
                z2 = true;
            }
            if (z2) {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder("Report Name: ");
            sb2.append(str.substring(str.lastIndexOf(47) + 1));
            sb2.append("\n");
            outputStream.write(sb2.toString().getBytes(str3));
        } catch (Throwable th5) {
            a(th5, outputStream);
        }
        try {
            StringBuilder sb3 = new StringBuilder("UUID: ");
            sb3.append(f9884a);
            sb3.append("\n");
            outputStream.write(sb3.toString().getBytes(str3));
            StringBuilder sb4 = new StringBuilder("Log Type: ");
            sb4.append(str2);
            sb4.append("\n");
            outputStream.write(sb4.toString().getBytes(str3));
        } catch (Throwable th6) {
            a(th6, outputStream);
        }
        a(outputStream);
        try {
            a.a(outputStream, str3);
        } catch (Throwable th7) {
            a(th7, outputStream);
        }
        a(outputStream);
        int i3 = getMax + 99;
        setMax = i3 % 128;
        int i4 = i3 % 2;
    }

    public static String c() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / ConvertUtils.KB);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / ConvertUtils.KB);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / ConvertUtils.KB);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / ConvertUtils.KB);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / ConvertUtils.KB);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / ConvertUtils.KB);
            sb.append(" kB\n");
            ActivityManager activityManager = (ActivityManager) e.a().getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                sb.append("\n");
                sb.append("availMem:   ");
                sb.append(memoryInfo.availMem / ConvertUtils.KB);
                sb.append(" kB\n");
                sb.append("threshold:  ");
                sb.append(memoryInfo.threshold / ConvertUtils.KB);
                sb.append(" kB\n");
                sb.append("lowMemory:  ");
                sb.append(memoryInfo.lowMemory);
                sb.append("\n");
            }
            try {
                int i2 = getMax + 123;
                setMax = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
            return "exception exists.";
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r6.indexOf(r22) >= 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r6.indexOf(46) <= 0) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x002c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r21, java.lang.String r22) {
        /*
            r0 = r21
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x012f }
            java.lang.String r3 = "ps"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ all -> 0x012f }
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ all -> 0x012f }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x012f }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x012f }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x012f }
            r4.<init>(r2)     // Catch:{ all -> 0x012f }
            r3.<init>(r4)     // Catch:{ all -> 0x012f }
            boolean r2 = com.uc.crashsdk.a.h.b(r21)     // Catch:{ all -> 0x012f }
            boolean r4 = com.uc.crashsdk.a.h.b(r22)     // Catch:{ all -> 0x012f }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x012f }
            r5.<init>()     // Catch:{ all -> 0x012f }
        L_0x002c:
            java.lang.String r6 = r3.readLine()     // Catch:{ all -> 0x012f }
            r7 = 124(0x7c, float:1.74E-43)
            r10 = 4
            r11 = 3
            r12 = 5
            r13 = 2
            r14 = 1
            if (r6 == 0) goto L_0x0104
            int r15 = setMax
            int r15 = r15 + 83
            int r8 = r15 % 128
            getMax = r8
            int r15 = r15 % r13
            r8 = 6
            if (r2 == 0) goto L_0x0068
            int r9 = setMax
            int r9 = r9 + 21
            int r15 = r9 % 128
            getMax = r15
            int r9 = r9 % r13
            if (r9 == 0) goto L_0x005e
            int r9 = r6.indexOf(r0)     // Catch:{ all -> 0x012f }
            r15 = 0
            int r15 = r15.length     // Catch:{ all -> 0x012f }
            if (r9 >= 0) goto L_0x005a
            r9 = 6
            goto L_0x005b
        L_0x005a:
            r9 = 3
        L_0x005b:
            if (r9 == r8) goto L_0x0068
            goto L_0x0065
        L_0x005e:
            int r9 = r6.indexOf(r0)     // Catch:{ all -> 0x012f }
            if (r9 >= 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            r9 = r22
            goto L_0x007a
        L_0x0068:
            if (r4 == 0) goto L_0x006c
            r9 = 1
            goto L_0x006d
        L_0x006c:
            r9 = 0
        L_0x006d:
            if (r9 == r14) goto L_0x0072
            r9 = r22
            goto L_0x007c
        L_0x0072:
            r9 = r22
            int r15 = r6.indexOf(r9)     // Catch:{ all -> 0x012f }
            if (r15 < 0) goto L_0x007c
        L_0x007a:
            r8 = 1
            goto L_0x00a0
        L_0x007c:
            r15 = 47
            int r15 = r6.indexOf(r15)     // Catch:{ all -> 0x012f }
            r8 = 84
            if (r15 >= 0) goto L_0x0089
            r15 = 84
            goto L_0x008b
        L_0x0089:
            r15 = 76
        L_0x008b:
            if (r15 == r8) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            int r8 = setMax
            int r8 = r8 + 121
            int r15 = r8 % 128
            getMax = r15
            int r8 = r8 % r13
            r8 = 46
            int r8 = r6.indexOf(r8)     // Catch:{ all -> 0x012f }
            if (r8 > 0) goto L_0x007a
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r8 == 0) goto L_0x002c
            char[] r8 = new char[r12]     // Catch:{ all -> 0x012f }
            r8[r1] = r14     // Catch:{ all -> 0x012f }
            r8[r14] = r13     // Catch:{ all -> 0x012f }
            r8[r13] = r1     // Catch:{ all -> 0x012f }
            r8[r11] = r12     // Catch:{ all -> 0x012f }
            r8[r10] = r7     // Catch:{ all -> 0x012f }
            int r15 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x012f }
            int r15 = r15 + 20
            r18 = 6
            int r15 = r15 >> 6
            int r15 = r15 + r12
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x012f }
            r16 = 0
            int r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            int r7 = 69 - r20
            byte r7 = (byte) r7     // Catch:{ all -> 0x012f }
            java.lang.String r7 = getMax(r8, r15, r7)     // Catch:{ all -> 0x012f }
            java.lang.String r7 = r7.intern()     // Catch:{ all -> 0x012f }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ all -> 0x012f }
            r5.write(r6)     // Catch:{ all -> 0x012f }
            java.lang.String r6 = "\n"
            char[] r7 = new char[r12]     // Catch:{ all -> 0x012f }
            r7[r1] = r14     // Catch:{ all -> 0x012f }
            r7[r14] = r13     // Catch:{ all -> 0x012f }
            r7[r13] = r1     // Catch:{ all -> 0x012f }
            r7[r11] = r12     // Catch:{ all -> 0x012f }
            r8 = 124(0x7c, float:1.74E-43)
            r7[r10] = r8     // Catch:{ all -> 0x012f }
            r10 = 0
            int r8 = android.widget.ExpandableListView.getPackedPositionType(r10)     // Catch:{ all -> 0x012f }
            int r12 = r12 - r8
            int r8 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x012f }
            int r8 = r8 >> 16
            int r8 = r8 + 68
            byte r8 = (byte) r8     // Catch:{ all -> 0x012f }
            java.lang.String r7 = getMax(r7, r12, r8)     // Catch:{ all -> 0x012f }
            java.lang.String r7 = r7.intern()     // Catch:{ all -> 0x012f }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ all -> 0x012f }
            r5.write(r6)     // Catch:{ all -> 0x012f }
            goto L_0x002c
        L_0x0104:
            char[] r0 = new char[r12]     // Catch:{ all -> 0x012f }
            r0[r1] = r14     // Catch:{ all -> 0x012f }
            r0[r14] = r13     // Catch:{ all -> 0x012f }
            r0[r13] = r1     // Catch:{ all -> 0x012f }
            r0[r11] = r12     // Catch:{ all -> 0x012f }
            r2 = 124(0x7c, float:1.74E-43)
            r0[r10] = r2     // Catch:{ all -> 0x012f }
            r2 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionChild(r2)     // Catch:{ all -> 0x012f }
            int r10 = r10 - r4
            long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ all -> 0x012f }
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r2 = 69 - r4
            byte r2 = (byte) r2     // Catch:{ all -> 0x012f }
            java.lang.String r0 = getMax(r0, r10, r2)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r5.toString(r0)     // Catch:{ all -> 0x012f }
            return r0
        L_0x012f:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r1)
            java.lang.String r0 = "exception exists."
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
        int i2 = getMax + 29;
        setMax = i2 % 128;
        BufferedReader bufferedReader = null;
        int i3 = i2 % 2 == 0 ? 14549 : 8192;
        while (true) {
            if (!(bufferedReader == null) || i3 <= 0) {
                break;
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader, i3);
                int i4 = setMax + 55;
                getMax = i4 % 128;
                int i5 = i4 % 2;
                bufferedReader = bufferedReader2;
            } catch (Throwable unused) {
                i3 /= 2;
                if (i3 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    private static void a(OutputStream outputStream) {
        int i2 = setMax + 93;
        getMax = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 5 << KeyEvent.keyCodeFromString(""), (byte) (60 >> (SystemClock.uptimeMillis() > 1 ? 1 : (SystemClock.uptimeMillis() == 1 ? 0 : -1)))).intern()));
            } catch (Throwable th) {
                a(th, outputStream);
                return;
            }
        } else {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, KeyEvent.keyCodeFromString("") + 5, (byte) (69 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)))).intern()));
        }
        int i3 = getMax + 33;
        setMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016b A[SYNTHETIC, Splitter:B:80:0x016b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.io.OutputStream r14) {
        /*
            java.lang.String r0 = "-b"
            r1 = 5
            char[] r2 = new char[r1]
            r2 = {1, 2, 0, 5, 124} // fill-array
            r3 = 0
            int r4 = android.graphics.ImageFormat.getBitsPerPixel(r3)
            r5 = 6
            int r4 = r4 + r5
            int r6 = android.graphics.Color.green(r3)
            r7 = 68
            int r6 = 68 - r6
            byte r6 = (byte) r6
            java.lang.String r2 = getMax(r2, r4, r6)
            java.lang.String r2 = r2.intern()
            r4 = 0
            r6 = 1
            java.lang.String r8 = "logcat: \n"
            byte[] r8 = r8.getBytes(r2)     // Catch:{ all -> 0x0163 }
            r14.write(r8)     // Catch:{ all -> 0x0163 }
            int r8 = com.uc.crashsdk.p.n()     // Catch:{ all -> 0x0163 }
            r9 = 78
            if (r8 > 0) goto L_0x0036
            r8 = 66
            goto L_0x0038
        L_0x0036:
            r8 = 78
        L_0x0038:
            r10 = 74
            r11 = 2
            if (r8 == r9) goto L_0x007f
            int r0 = setMax
            int r0 = r0 + 103
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r11
            if (r0 == 0) goto L_0x004b
            r0 = 77
            goto L_0x004d
        L_0x004b:
            r0 = 74
        L_0x004d:
            java.lang.String r1 = "[DEBUG] custom java logcat lines count is 0!\n"
            if (r0 == r10) goto L_0x005a
            byte[] r0 = r1.getBytes(r2)     // Catch:{ all -> 0x0062 }
            r14.write(r0)     // Catch:{ all -> 0x0062 }
            int r7 = r7 / r3
            goto L_0x0066
        L_0x005a:
            byte[] r0 = r1.getBytes(r2)     // Catch:{ all -> 0x0062 }
            r14.write(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r14)     // Catch:{ all -> 0x0163 }
        L_0x0066:
            a((java.io.OutputStream) r14)     // Catch:{ all -> 0x0163 }
            int r14 = setMax
            int r14 = r14 + 49
            int r0 = r14 % 128
            getMax = r0
            int r14 = r14 % r11
            if (r14 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            if (r3 == 0) goto L_0x0079
            return
        L_0x0079:
            super.hashCode()     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r14 = move-exception
            throw r14
        L_0x007f:
            int r7 = com.uc.crashsdk.p.n()     // Catch:{ all -> 0x0163 }
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0163 }
            r9 = 10
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0163 }
            java.lang.String r12 = "logcat"
            r9[r3] = r12     // Catch:{ all -> 0x0163 }
            java.lang.String r12 = "-d"
            r9[r6] = r12     // Catch:{ all -> 0x0163 }
            r9[r11] = r0     // Catch:{ all -> 0x0163 }
            java.lang.String r12 = "events"
            r13 = 3
            r9[r13] = r12     // Catch:{ all -> 0x0163 }
            r12 = 4
            r9[r12] = r0     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "main"
            r9[r1] = r0     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "-v"
            r9[r5] = r0     // Catch:{ all -> 0x0163 }
            r0 = 7
            java.lang.String r1 = "threadtime"
            r9[r0] = r1     // Catch:{ all -> 0x0163 }
            r0 = 8
            java.lang.String r1 = "-t"
            r9[r0] = r1     // Catch:{ all -> 0x0163 }
            r0 = 9
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0163 }
            r9[r0] = r1     // Catch:{ all -> 0x0163 }
            java.lang.Process r0 = r8.exec(r9)     // Catch:{ all -> 0x0163 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0163 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0163 }
            r1.<init>(r0)     // Catch:{ all -> 0x0163 }
            java.io.BufferedReader r0 = a((java.io.InputStreamReader) r1)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x00cf
            r1 = 74
            goto L_0x00d1
        L_0x00cf:
            r1 = 48
        L_0x00d1:
            if (r1 == r10) goto L_0x0147
            g = r3     // Catch:{ all -> 0x0143 }
            r1 = 0
            r5 = 0
        L_0x00d7:
            java.lang.String r8 = r0.readLine()     // Catch:{ all -> 0x0143 }
            if (r8 == 0) goto L_0x0106
            int r9 = setMax
            int r9 = r9 + 105
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % r11
            int r5 = r5 + 1
            if (r1 >= r7) goto L_0x00d7
            byte[] r8 = r8.getBytes(r2)     // Catch:{ all -> 0x0143 }
            r14.write(r8)     // Catch:{ all -> 0x0143 }
            java.lang.String r8 = "\n"
            byte[] r8 = r8.getBytes(r2)     // Catch:{ all -> 0x0143 }
            r14.write(r8)     // Catch:{ all -> 0x0143 }
            int r1 = r1 + 1
            int r8 = setMax
            int r8 = r8 + 59
            int r9 = r8 % 128
            getMax = r9
            int r8 = r8 % r11
            goto L_0x00d7
        L_0x0106:
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0124 }
            java.lang.String r8 = "[DEBUG] Read %d lines, wrote %d lines.\n"
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ all -> 0x0124 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0124 }
            r9[r3] = r5     // Catch:{ all -> 0x0124 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0124 }
            r9[r6] = r1     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = java.lang.String.format(r7, r8, r9)     // Catch:{ all -> 0x0124 }
            byte[] r1 = r1.getBytes(r2)     // Catch:{ all -> 0x0124 }
            r14.write(r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0128
        L_0x0124:
            r1 = move-exception
            a((java.lang.Throwable) r1, (java.io.OutputStream) r14)     // Catch:{ all -> 0x0143 }
        L_0x0128:
            g = r6     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0173
            int r1 = getMax
            int r1 = r1 + r13
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % r11
            if (r1 != 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r3 = 1
        L_0x0138:
            if (r3 == 0) goto L_0x013e
            r0.close()     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x013e:
            r0.close()     // Catch:{ all -> 0x016f }
            int r0 = r4.length     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x0143:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L_0x0164
        L_0x0147:
            java.lang.String r1 = "[DEBUG] alloc buffer failed!\n"
            byte[] r1 = r1.getBytes(r2)     // Catch:{ all -> 0x0151 }
            r14.write(r1)     // Catch:{ all -> 0x0151 }
            goto L_0x0155
        L_0x0151:
            r1 = move-exception
            a((java.lang.Throwable) r1, (java.io.OutputStream) r14)     // Catch:{ all -> 0x0143 }
        L_0x0155:
            a((java.io.OutputStream) r14)     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0162
            r0.close()     // Catch:{ all -> 0x015e }
            return
        L_0x015e:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r14)
        L_0x0162:
            return
        L_0x0163:
            r0 = move-exception
        L_0x0164:
            g = r6     // Catch:{ all -> 0x0177 }
            a((java.lang.Throwable) r0, (java.io.OutputStream) r14)     // Catch:{ all -> 0x0177 }
            if (r4 == 0) goto L_0x0173
            r4.close()     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x016f:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r14)
        L_0x0173:
            a((java.io.OutputStream) r14)
            return
        L_0x0177:
            r0 = move-exception
            if (r4 == 0) goto L_0x0182
            r4.close()     // Catch:{ all -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r1 = move-exception
            a((java.lang.Throwable) r1, (java.io.OutputStream) r14)
        L_0x0182:
            goto L_0x0184
        L_0x0183:
            throw r0
        L_0x0184:
            goto L_0x0183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.b(java.io.OutputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(java.io.OutputStream r10) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "disk info:\n"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x003a }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x003a }
            r4 = 5
            char[] r5 = new char[r4]     // Catch:{ all -> 0x003a }
            r5[r2] = r1     // Catch:{ all -> 0x003a }
            r5[r1] = r0     // Catch:{ all -> 0x003a }
            r5[r0] = r2     // Catch:{ all -> 0x003a }
            r6 = 3
            r5[r6] = r4     // Catch:{ all -> 0x003a }
            r6 = 4
            r7 = 124(0x7c, float:1.74E-43)
            r5[r6] = r7     // Catch:{ all -> 0x003a }
            int r6 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x003a }
            int r6 = r6 >> 16
            int r4 = r4 - r6
            int r6 = android.view.View.MeasureSpec.getMode(r2)     // Catch:{ all -> 0x003a }
            int r6 = r6 + 68
            byte r6 = (byte) r6     // Catch:{ all -> 0x003a }
            java.lang.String r4 = getMax(r5, r4, r6)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x003a }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ all -> 0x003a }
            r10.write(r3)     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            a((java.lang.Throwable) r3, (java.io.OutputStream) r10)
        L_0x003e:
            r3 = 0
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0055 }
            r4.<init>()     // Catch:{ all -> 0x0055 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0053 }
            java.lang.String r5 = com.uc.crashsdk.e.f9882a     // Catch:{ all -> 0x0053 }
            r3.<init>(r5)     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = a((java.io.File) r3)     // Catch:{ all -> 0x0053 }
            a((java.io.OutputStream) r10, (java.lang.String) r3, (java.util.Set<java.lang.String>) r4)     // Catch:{ all -> 0x0053 }
            goto L_0x005c
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r4 = move-exception
            r9 = r4
            r4 = r3
            r3 = r9
        L_0x0059:
            a((java.lang.Throwable) r3, (java.io.OutputStream) r10)
        L_0x005c:
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = a((java.io.File) r3)     // Catch:{ all -> 0x00b7 }
            a((java.io.OutputStream) r10, (java.lang.String) r3, (java.util.Set<java.lang.String>) r4)     // Catch:{ all -> 0x00b7 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00b7 }
            java.lang.String r5 = "/storage"
            r3.<init>(r5)     // Catch:{ all -> 0x00b7 }
            boolean r5 = r3.exists()     // Catch:{ all -> 0x00b7 }
            if (r5 == 0) goto L_0x00ad
            int r5 = getMax
            int r5 = r5 + 95
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % r0
            java.io.File[] r3 = r3.listFiles()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 == r1) goto L_0x0089
            goto L_0x00ad
        L_0x0089:
            int r5 = r3.length     // Catch:{ all -> 0x00b7 }
            r6 = 0
        L_0x008b:
            if (r6 >= r5) goto L_0x008f
            r7 = 0
            goto L_0x0090
        L_0x008f:
            r7 = 1
        L_0x0090:
            if (r7 == r1) goto L_0x00ad
            r7 = r3[r6]     // Catch:{ all -> 0x00b7 }
            boolean r8 = r7.isDirectory()     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x00a1
            java.lang.String r7 = a((java.io.File) r7)     // Catch:{ all -> 0x00b7 }
            a((java.io.OutputStream) r10, (java.lang.String) r7, (java.util.Set<java.lang.String>) r4)     // Catch:{ all -> 0x00b7 }
        L_0x00a1:
            int r6 = r6 + 1
            int r7 = getMax
            int r7 = r7 + 43
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % r0
            goto L_0x008b
        L_0x00ad:
            int r1 = getMax
            int r1 = r1 + 33
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % r0
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r10)
        L_0x00bb:
            a((java.io.OutputStream) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.c(java.io.OutputStream):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.File r4) {
        /*
            int r0 = setMax
            int r0 = r0 + 103
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r0 = 0
            java.lang.String r1 = r4.getCanonicalPath()     // Catch:{ all -> 0x0010 }
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            boolean r2 = com.uc.crashsdk.a.h.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0044 }
            r3 = 20
            if (r2 == 0) goto L_0x001c
            r2 = 39
            goto L_0x001e
        L_0x001c:
            r2 = 20
        L_0x001e:
            if (r2 == r3) goto L_0x0043
            int r1 = getMax
            int r1 = r1 + 65
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 41
            if (r1 != 0) goto L_0x0031
            r1 = 41
            goto L_0x0033
        L_0x0031:
            r1 = 69
        L_0x0033:
            if (r1 == r2) goto L_0x003b
            java.lang.String r4 = r4.getPath()
        L_0x0039:
            r1 = r4
            goto L_0x0043
        L_0x003b:
            java.lang.String r4 = r4.getPath()
            int r0 = r0.length     // Catch:{ all -> 0x0041 }
            goto L_0x0039
        L_0x0041:
            r4 = move-exception
            throw r4
        L_0x0043:
            return r1
        L_0x0044:
            r4 = move-exception
            goto L_0x0047
        L_0x0046:
            throw r4
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.io.File):java.lang.String");
    }

    private static void a(OutputStream outputStream, String str, Set<String> set) {
        OutputStream outputStream2 = outputStream;
        String str2 = str;
        Set<String> set2 = set;
        int i2 = getMax + 53;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        String intern = getMax(new char[]{1, 2, 0, 5, '|'}, 5 - View.combineMeasuredStates(0, 0), (byte) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 67)).intern();
        if (!h.a(str)) {
            int i4 = getMax + 101;
            setMax = i4 % 128;
            if (i4 % 2 == 0) {
                boolean contains = set2.contains(str2);
                Object obj = null;
                try {
                    super.hashCode();
                    if (contains) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if ((!set2.contains(str2) ? (char) 13 : 7) != 13) {
                    return;
                }
            }
            if (!str2.equals("/storage/emulated")) {
                set2.add(str2);
                try {
                    StatFs statFs = new StatFs(str2);
                    int i5 = setMax + 87;
                    getMax = i5 % 128;
                    int i6 = i5 % 2;
                    long a2 = a(statFs, "getBlockCountLong", "getBlockCount");
                    long a3 = a(statFs, "getBlockSizeLong", "getBlockSize");
                    if ((a2 / ConvertUtils.KB) * a3 >= 10240) {
                        long a4 = a(statFs, "getAvailableBlocksLong", "getAvailableBlocks");
                        long a5 = a(statFs, "getFreeBlocksLong", "getFreeBlocks");
                        try {
                            outputStream2.write(String.format("%s:\n", new Object[]{str2}).getBytes(intern));
                            Object[] objArr = new Object[1];
                            double d2 = (double) a2;
                            Double.isNaN(d2);
                            long j2 = a4;
                            double d3 = (double) a3;
                            Double.isNaN(d3);
                            objArr[0] = Long.valueOf((long) (((d2 * 1.0d) * d3) / 1024.0d));
                            outputStream2.write(String.format("  total:      %d kB\n", objArr).getBytes(intern));
                            Object[] objArr2 = new Object[1];
                            double d4 = (double) j2;
                            Double.isNaN(d4);
                            Double.isNaN(d3);
                            objArr2[0] = Long.valueOf((long) (((d4 * 1.0d) * d3) / 1024.0d));
                            outputStream2.write(String.format("  available:  %d kB\n", objArr2).getBytes(intern));
                            Object[] objArr3 = new Object[1];
                            double d5 = (double) a5;
                            Double.isNaN(d5);
                            Double.isNaN(d3);
                            objArr3[0] = Long.valueOf((long) (((d5 * 1.0d) * d3) / 1024.0d));
                            outputStream2.write(String.format("  free:       %d kB\n", objArr3).getBytes(intern));
                            outputStream2.write(String.format("  block size: %d B\n\n", new Object[]{Long.valueOf(a3)}).getBytes(intern));
                        } catch (Throwable th2) {
                            a(th2, outputStream2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if ((r6 instanceof java.lang.Long) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(android.os.StatFs r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = setMax
            int r0 = r0 + 21
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r0 = 1
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005b }
            r3 = 18
            r4 = 90
            if (r2 < r3) goto L_0x0017
            r2 = 16
            goto L_0x0019
        L_0x0017:
            r2 = 90
        L_0x0019:
            if (r2 == r4) goto L_0x005b
            java.lang.Class<android.os.StatFs> r2 = android.os.StatFs.class
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r6 = r2.getDeclaredMethod(r6, r3)     // Catch:{ all -> 0x005b }
            r6.setAccessible(r0)     // Catch:{ all -> 0x005b }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.invoke(r5, r2)     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x005b
            int r2 = setMax
            int r2 = r2 + 115
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            r3 = 82
            r4 = 52
            if (r2 == 0) goto L_0x0041
            r2 = 82
            goto L_0x0043
        L_0x0041:
            r2 = 52
        L_0x0043:
            if (r2 == r3) goto L_0x004f
            boolean r2 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x004b
            r2 = 0
            goto L_0x004c
        L_0x004b:
            r2 = 1
        L_0x004c:
            if (r2 == 0) goto L_0x0054
            goto L_0x005b
        L_0x004f:
            boolean r2 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x005b }
            int r4 = r4 / r1
            if (r2 == 0) goto L_0x005b
        L_0x0054:
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x005b }
            long r5 = r6.longValue()     // Catch:{ all -> 0x005b }
            return r5
        L_0x005b:
            java.lang.Class<android.os.StatFs> r6 = android.os.StatFs.class
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x00ab }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r2)     // Catch:{ all -> 0x00ab }
            r6.setAccessible(r0)     // Catch:{ all -> 0x00ab }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ab }
            java.lang.Object r5 = r6.invoke(r5, r7)     // Catch:{ all -> 0x00ab }
            r6 = 70
            if (r5 == 0) goto L_0x0073
            r7 = 14
            goto L_0x0075
        L_0x0073:
            r7 = 70
        L_0x0075:
            if (r7 == r6) goto L_0x009e
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ all -> 0x00ab }
            r7 = 3
            if (r6 == 0) goto L_0x007e
            r6 = 3
            goto L_0x0080
        L_0x007e:
            r6 = 87
        L_0x0080:
            if (r6 == r7) goto L_0x0083
            goto L_0x009e
        L_0x0083:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x00ab }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00ab }
            long r5 = (long) r5
            int r7 = setMax
            int r7 = r7 + 117
            int r0 = r7 % 128
            getMax = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x009d
            r7 = 0
            super.hashCode()     // Catch:{ all -> 0x009b }
            return r5
        L_0x009b:
            r5 = move-exception
            throw r5
        L_0x009d:
            return r5
        L_0x009e:
            int r5 = setMax     // Catch:{ Exception -> 0x00a9 }
            int r5 = r5 + 61
            int r6 = r5 % 128
            getMax = r6     // Catch:{ Exception -> 0x00a9 }
            int r5 = r5 % 2
            goto L_0x00af
        L_0x00a9:
            r5 = move-exception
            throw r5
        L_0x00ab:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)
        L_0x00af:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(android.os.StatFs, java.lang.String, java.lang.String):long");
    }

    private static void d(OutputStream outputStream) {
        OutputStream outputStream2 = outputStream;
        File[] fileArr = null;
        int i2 = SecExceptionCode.SEC_ERROR_UMID_VALID;
        char c2 = '0';
        try {
            i2 = p.E();
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                outputStream2.write(String.format(Locale.US, "opened file count: %d, write limit: %d.\n", new Object[]{Integer.valueOf(fileArr.length), Integer.valueOf(i2)}).getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, Color.rgb(0, 0, 0) + 16777221, (byte) (TextUtils.indexOf("", '0') + 69)).intern()));
            } else {
                outputStream2.write("[DEBUG] listFiles failed!\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 5 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ('t' - AndroidCharacter.getMirror('0'))).intern()));
                int i3 = setMax + 45;
                getMax = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Throwable th) {
            a(th, outputStream2);
        }
        if (fileArr == null) {
            c2 = 'E';
        }
        if (c2 != 'E') {
            try {
                if (fileArr.length >= i2) {
                    outputStream2.write("opened files:\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, MotionEvent.axisFromString("") + 6, (byte) (68 - (ViewConfiguration.getTapTimeout() >> 16))).intern()));
                    StringBuilder sb = new StringBuilder();
                    int i5 = setMax + 51;
                    getMax = i5 % 128;
                    int i6 = i5 % 2;
                    for (File file : fileArr) {
                        int i7 = getMax + 83;
                        setMax = i7 % 128;
                        int i8 = i7 % 2;
                        sb.append(file.getName());
                        sb.append(" -> ");
                        sb.append(file.getCanonicalPath());
                        sb.append("\n");
                    }
                    int i9 = getMax + 41;
                    setMax = i9 % 128;
                    int i10 = i9 % 2;
                    outputStream2.write(sb.toString().getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, Color.green(0) + 5, (byte) (68 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern()));
                }
            } catch (Throwable th2) {
                a(th2, outputStream2);
            }
        }
        a(outputStream);
    }

    private static void e(OutputStream outputStream) {
        int i2;
        OutputStream outputStream2 = outputStream;
        File[] fileArr = null;
        int i3 = 300;
        try {
            i3 = p.F();
            fileArr = new File("/proc/self/task").listFiles();
            if (fileArr == null) {
                int i4 = getMax + 121;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            i2 = fileArr.length;
            if (i2 < i3) {
                return;
            }
            if (fileArr != null) {
                try {
                    outputStream2.write("threads info:\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, (ViewConfiguration.getTouchSlop() >> 8) + 5, (byte) (67 - TextUtils.lastIndexOf("", '0'))).intern()));
                    outputStream2.write(String.format(Locale.US, "threads count: %d, dump limit: %d.\n", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}).getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 4 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 69)).intern()));
                    outputStream2.write(" tid     name\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 68)).intern()));
                    for (File file : fileArr) {
                        outputStream2.write(String.format(Locale.US, "%5s %s\n", new Object[]{file.getName(), i(com.uc.crashsdk.a.b.a(new File(file.getPath(), "comm"), 128, true))}).getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, View.resolveSize(0, 0) + 5, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 68)).intern()));
                    }
                } catch (Throwable th) {
                    a(th, outputStream2);
                }
                a(outputStream);
                int i6 = getMax + 51;
                setMax = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.a.a(th2, false);
            i2 = 0;
        }
    }

    private static void a(b bVar) {
        int i2 = setMax + 65;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = true;
        try {
            bVar.a(String.format("log end: %s\n", new Object[]{g()}).getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, Color.argb(0, 0, 0, 0) + 5, (byte) (68 - View.getDefaultSize(0, 0))).intern()));
            int i4 = getMax + 113;
            setMax = i4 % 128;
            if (i4 % 2 != 0) {
                z2 = false;
            }
            if (z2) {
                int i5 = 3 / 0;
            }
        } catch (Throwable th) {
            a(th, (OutputStream) bVar);
        }
    }

    public static void a(OutputStream outputStream, String str) {
        int i2 = setMax + 103;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        if ((str == null ? (char) 25 : 20) != 25) {
            try {
                String a2 = com.uc.crashsdk.a.d.a(str);
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder("file: '");
                    sb.append(str);
                    sb.append("' not found or decode failed!");
                    a2 = sb.toString();
                }
                outputStream.write(a2.getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 4 - MotionEvent.axisFromString(""), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 68)).intern()));
                outputStream.write("\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, TextUtils.getCapsMode("", 0, 0) + 5, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 68)).intern()));
                int i4 = setMax + 75;
                getMax = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                a(th, outputStream);
            }
            a(outputStream);
            return;
        }
        a(outputStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100 A[SYNTHETIC, Splitter:B:42:0x0100] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.OutputStream r14, java.lang.String r15) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00fa }
            r3.<init>(r15)     // Catch:{ all -> 0x00fa }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x00fa }
            r5 = 35
            if (r4 == 0) goto L_0x0013
            r4 = 21
            goto L_0x0015
        L_0x0013:
            r4 = 35
        L_0x0015:
            r6 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 4
            r10 = 3
            r11 = 5
            r12 = 1
            if (r4 == r5) goto L_0x0084
            int r15 = getMax
            int r15 = r15 + r10
            int r4 = r15 % 128
            setMax = r4
            int r15 = r15 % r1
            byte[] r15 = y()     // Catch:{ all -> 0x00fa }
            if (r15 != 0) goto L_0x0064
            int r15 = setMax
            int r15 = r15 + r12
            int r3 = r15 % 128
            getMax = r3
            int r15 = r15 % r1
            java.lang.String r15 = "[DEBUG] alloc buffer failed!\n"
            char[] r3 = new char[r11]     // Catch:{ all -> 0x00fa }
            r3[r2] = r12     // Catch:{ all -> 0x00fa }
            r3[r12] = r1     // Catch:{ all -> 0x00fa }
            r3[r1] = r2     // Catch:{ all -> 0x00fa }
            r3[r10] = r11     // Catch:{ all -> 0x00fa }
            r3[r9] = r8     // Catch:{ all -> 0x00fa }
            r4 = 48
            int r4 = android.text.AndroidCharacter.getEastAsianWidth(r4)     // Catch:{ all -> 0x00fa }
            int r4 = r4 + r12
            r5 = 0
            float r6 = android.graphics.PointF.length(r5, r5)     // Catch:{ all -> 0x00fa }
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            int r5 = 68 - r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = getMax(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x00fa }
            byte[] r15 = r15.getBytes(r3)     // Catch:{ all -> 0x00fa }
            r14.write(r15)     // Catch:{ all -> 0x00fa }
            return
        L_0x0064:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ all -> 0x00fa }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x00fa }
            r5.<init>(r3)     // Catch:{ all -> 0x00fa }
            r4.<init>(r5)     // Catch:{ all -> 0x00fa }
        L_0x006e:
            int r0 = r4.read(r15)     // Catch:{ all -> 0x0080 }
            r3 = -1
            if (r0 == r3) goto L_0x0077
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 == r12) goto L_0x007e
            r14.write(r15, r2, r0)     // Catch:{ all -> 0x0080 }
            goto L_0x006e
        L_0x007e:
            r0 = r4
            goto L_0x00c0
        L_0x0080:
            r15 = move-exception
            r0 = r4
            goto L_0x00fb
        L_0x0084:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "file: '"
            r3.<init>(r4)     // Catch:{ all -> 0x00fa }
            r3.append(r15)     // Catch:{ all -> 0x00fa }
            java.lang.String r15 = "' not exists!\n"
            r3.append(r15)     // Catch:{ all -> 0x00fa }
            java.lang.String r15 = r3.toString()     // Catch:{ all -> 0x00fa }
            char[] r3 = new char[r11]     // Catch:{ all -> 0x00fa }
            r3[r2] = r12     // Catch:{ all -> 0x00fa }
            r3[r12] = r1     // Catch:{ all -> 0x00fa }
            r3[r1] = r2     // Catch:{ all -> 0x00fa }
            r3[r10] = r11     // Catch:{ all -> 0x00fa }
            r3[r9] = r8     // Catch:{ all -> 0x00fa }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00fa }
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r13 = r13 + r9
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r6)     // Catch:{ all -> 0x00fa }
            int r4 = r4 + 68
            byte r4 = (byte) r4     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = getMax(r3, r13, r4)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x00fa }
            byte[] r15 = r15.getBytes(r3)     // Catch:{ all -> 0x00fa }
            r14.write(r15)     // Catch:{ all -> 0x00fa }
        L_0x00c0:
            java.lang.String r15 = "\n"
            char[] r3 = new char[r11]     // Catch:{ all -> 0x00fa }
            r3[r2] = r12     // Catch:{ all -> 0x00fa }
            r3[r12] = r1     // Catch:{ all -> 0x00fa }
            r3[r1] = r2     // Catch:{ all -> 0x00fa }
            r3[r10] = r11     // Catch:{ all -> 0x00fa }
            r3[r9] = r8     // Catch:{ all -> 0x00fa }
            int r4 = android.view.KeyEvent.normalizeMetaState(r2)     // Catch:{ all -> 0x00fa }
            int r4 = r4 + r11
            long r8 = android.os.Process.getElapsedCpuTime()     // Catch:{ all -> 0x00fa }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            int r5 = r5 + 67
            byte r5 = (byte) r5     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = getMax(r3, r4, r5)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x00fa }
            byte[] r15 = r15.getBytes(r3)     // Catch:{ all -> 0x00fa }
            r14.write(r15)     // Catch:{ all -> 0x00fa }
            r15 = 56
            if (r0 == 0) goto L_0x00f2
            r1 = 11
            goto L_0x00f4
        L_0x00f2:
            r1 = 56
        L_0x00f4:
            if (r1 == r15) goto L_0x0108
            r0.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x00fa:
            r15 = move-exception
        L_0x00fb:
            a((java.lang.Throwable) r15, (java.io.OutputStream) r14)     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0108
            r0.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r15 = move-exception
            com.uc.crashsdk.a.a.a(r15, r2)
        L_0x0108:
            a((java.io.OutputStream) r14)
            return
        L_0x010c:
            r14 = move-exception
            if (r0 == 0) goto L_0x0120
            r0.close()     // Catch:{ all -> 0x011c }
            int r15 = getMax
            int r15 = r15 + 93
            int r0 = r15 % 128
            setMax = r0
            int r15 = r15 % r1
            goto L_0x0120
        L_0x011c:
            r15 = move-exception
            com.uc.crashsdk.a.a.a(r15, r2)
        L_0x0120:
            goto L_0x0122
        L_0x0121:
            throw r14
        L_0x0122:
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.b(java.io.OutputStream, java.lang.String):void");
    }

    private static void f(OutputStream outputStream) {
        OutputStream outputStream2 = outputStream;
        int i2 = getMax + 49;
        setMax = i2 % 128;
        if ((i2 % 2 == 0 ? 12 : 'Z') != 'Z') {
            try {
                outputStream2.write("meminfo:\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 5 << TextUtils.lastIndexOf("", 'd'), (byte) (55 >>> TextUtils.lastIndexOf("", 6, 0, 0))).intern()));
            } catch (Throwable th) {
                a(th, outputStream2);
            }
        } else {
            outputStream2.write("meminfo:\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, 4 - TextUtils.lastIndexOf("", '0'), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 69)).intern()));
        }
        b(outputStream2, "/proc/meminfo");
        try {
            String format = String.format(Locale.US, "/proc/%d/status", new Object[]{Integer.valueOf(Process.myPid())});
            outputStream2.write("status:\n".getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, Color.rgb(0, 0, 0) + 16777221, (byte) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 67)).intern()));
            b(outputStream2, format);
        } catch (Throwable th2) {
            a(th2, outputStream2);
        }
        try {
            StringBuilder sb = new StringBuilder("Dalvik:\nMaxMemory: ");
            sb.append(Runtime.getRuntime().maxMemory());
            sb.append(" TotalMemory: ");
            sb.append(Runtime.getRuntime().totalMemory());
            sb.append(" FreeMemory: ");
            sb.append(Runtime.getRuntime().freeMemory());
            sb.append("\n");
            outputStream2.write(sb.toString().getBytes(getMax(new char[]{1, 2, 0, 5, '|'}, Color.rgb(0, 0, 0) + 16777221, (byte) (68 - Color.alpha(0))).intern()));
            int i3 = setMax + 37;
            getMax = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th3) {
            a(th3, outputStream2);
        }
        a(outputStream);
    }

    public static String a(int i2) {
        try {
            boolean z2 = true;
            String a2 = com.uc.crashsdk.a.b.a(new File(String.format(Locale.US, "/proc/%d/cmdline", new Object[]{Integer.valueOf(i2)})), 128, true);
            if (h.b(a2)) {
                int i3 = getMax + 35;
                setMax = i3 % 128;
                if (i3 % 2 == 0) {
                    z2 = false;
                }
                if (z2) {
                    return i(a2);
                }
                String i4 = i(a2);
                Object obj = null;
                super.hashCode();
                return i4;
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
        }
        int i5 = getMax + 63;
        setMax = i5 % 128;
        if ((i5 % 2 == 0 ? 'K' : 9) != 'K') {
            return "unknown";
        }
        int i6 = 68 / 0;
        return "unknown";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 >= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if ((r0 >= 0 ? '=' : 'K') != '=') goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String i(java.lang.String r4) {
        /*
            int r0 = setMax
            int r0 = r0 + 95
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            boolean r0 = com.uc.crashsdk.a.h.b(r4)
            r1 = 48
            if (r0 == 0) goto L_0x0015
            r0 = 48
            goto L_0x0017
        L_0x0015:
            r0 = 28
        L_0x0017:
            if (r0 == r1) goto L_0x001a
            return r4
        L_0x001a:
            int r0 = setMax
            int r0 = r0 + 73
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 32
            if (r0 == 0) goto L_0x002b
            r0 = 63
            goto L_0x002d
        L_0x002b:
            r0 = 32
        L_0x002d:
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r0 = 1
            int r0 = r4.indexOf(r0)
            if (r0 < 0) goto L_0x0060
            goto L_0x0048
        L_0x0038:
            int r0 = r4.indexOf(r2)
            r1 = 61
            if (r0 < 0) goto L_0x0043
            r3 = 61
            goto L_0x0045
        L_0x0043:
            r3 = 75
        L_0x0045:
            if (r3 == r1) goto L_0x0048
            goto L_0x0060
        L_0x0048:
            int r1 = getMax     // Catch:{ Exception -> 0x0065 }
            int r1 = r1 + 49
            int r3 = r1 % 128
            setMax = r3     // Catch:{ Exception -> 0x0065 }
            int r1 = r1 % 2
            java.lang.String r4 = r4.substring(r2, r0)     // Catch:{ Exception -> 0x0065 }
            int r0 = setMax
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
        L_0x0060:
            java.lang.String r4 = r4.trim()
            return r4
        L_0x0065:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.i(java.lang.String):java.lang.String");
    }

    public static String d() {
        int i2 = getMax + 61;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if (!(l != null)) {
            String a2 = a(Process.myPid());
            l = a2;
            try {
                int i4 = getMax + 125;
                setMax = i4 % 128;
                if (!(i4 % 2 == 0)) {
                    return a2;
                }
                int i5 = 50 / 0;
                return a2;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            String str = l;
            int i6 = getMax + 3;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
    }

    private static boolean a(String str, String str2, int i2) {
        int i3 = getMax + 123;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        if (!b.d) {
            return false;
        }
        boolean nativeSyncStatus = JNIBridge.nativeSyncStatus(str, str2, i2);
        int i5 = getMax + 11;
        setMax = i5 % 128;
        int i6 = i5 % 2;
        return nativeSyncStatus;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ec A[SYNTHETIC, Splitter:B:143:0x01ec] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[Catch:{ all -> 0x0081, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077 A[Catch:{ all -> 0x0081, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[Catch:{ all -> 0x0081, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x0081, all -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0175 A[SYNTHETIC, Splitter:B:86:0x0175] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.Throwable r10, boolean r11) {
        /*
            java.lang.String r0 = "'\n"
            java.lang.String r1 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            int r2 = getMax
            int r2 = r2 + 93
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % 2
            r2 = 5
            char[] r3 = new char[r2]
            r3 = {1, 2, 0, 5, 124} // fill-array
            r4 = 0
            int r5 = android.view.View.resolveSizeAndState(r4, r4, r4)
            int r5 = 5 - r5
            r6 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionType(r6)
            int r6 = r6 + 68
            byte r6 = (byte) r6
            java.lang.String r3 = getMax(r3, r5, r6)
            java.lang.String r3 = r3.intern()
            r5 = 1
            r6 = 0
            c((boolean) r5)     // Catch:{ all -> 0x01e5 }
            java.lang.String r7 = com.uc.crashsdk.p.g()     // Catch:{ all -> 0x01e5 }
            if (r7 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = 30
        L_0x003b:
            if (r8 == 0) goto L_0x003e
            goto L_0x004c
        L_0x003e:
            java.lang.String r8 = ""
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x01e5 }
            if (r8 == 0) goto L_0x0048
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            if (r8 == r5) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            java.lang.String r7 = z()     // Catch:{ all -> 0x01e5 }
            java.lang.String r7 = h(r7)     // Catch:{ all -> 0x01e5 }
        L_0x0054:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r8.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r9 = com.uc.crashsdk.p.O()     // Catch:{ all -> 0x01e5 }
            r8.append(r9)     // Catch:{ all -> 0x01e5 }
            r8.append(r7)     // Catch:{ all -> 0x01e5 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x01e5 }
            com.uc.crashsdk.f$b r8 = new com.uc.crashsdk.f$b     // Catch:{ all -> 0x01e3 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x01e3 }
            r9.<init>(r7)     // Catch:{ all -> 0x01e3 }
            r8.<init>(r9)     // Catch:{ all -> 0x01e3 }
            boolean r9 = com.uc.crashsdk.b.d     // Catch:{ all -> 0x0081 }
            if (r9 == 0) goto L_0x0077
            r9 = 0
            goto L_0x0078
        L_0x0077:
            r9 = 1
        L_0x0078:
            if (r9 == 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            java.lang.String r9 = "logj"
            a((java.lang.String) r9, (java.lang.String) r7, (int) r4)     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r9 = move-exception
            com.uc.crashsdk.a.a.a(r9, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0085:
            java.lang.String r9 = z()     // Catch:{ all -> 0x01e0 }
            a((java.io.OutputStream) r8, (java.lang.String) r7, (java.lang.String) r9)     // Catch:{ all -> 0x01e0 }
            if (r11 == 0) goto L_0x009f
            int r9 = getMax
            int r9 = r9 + r2
            int r2 = r9 % 128
            setMax = r2
            int r9 = r9 % 2
            r8.flush()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r2 = move-exception
            com.uc.crashsdk.a.a.a(r2, r4)     // Catch:{ all -> 0x01e0 }
        L_0x009f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = "Process Name: '"
            r2.<init>(r9)     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = d()     // Catch:{ all -> 0x00dc }
            r2.append(r9)     // Catch:{ all -> 0x00dc }
            r2.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00dc }
            byte[] r2 = r2.getBytes(r3)     // Catch:{ all -> 0x00dc }
            r8.write(r2)     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = "Thread Name: '"
            r2.<init>(r9)     // Catch:{ all -> 0x00dc }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00dc }
            r2.append(r9)     // Catch:{ all -> 0x00dc }
            r2.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00dc }
            byte[] r0 = r0.getBytes(r3)     // Catch:{ all -> 0x00dc }
            r8.write(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00e0
        L_0x00dc:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r4)     // Catch:{ all -> 0x01e0 }
        L_0x00e0:
            java.lang.String r0 = "Back traces starts.\n"
            byte[] r0 = r0.getBytes(r3)     // Catch:{ all -> 0x0141 }
            r8.write(r0)     // Catch:{ all -> 0x0141 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r2 = "detailMessage"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ all -> 0x0112 }
            r0.setAccessible(r5)     // Catch:{ all -> 0x0112 }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0116
            int r5 = getMax
            int r5 = r5 + 59
            int r9 = r5 % 128
            setMax = r9
            int r5 = r5 % 2
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "\n\t"
            java.lang.String r9 = "\n->  "
            java.lang.String r2 = r2.replaceAll(r5, r9)     // Catch:{ all -> 0x0112 }
            r0.set(r10, r2)     // Catch:{ all -> 0x0112 }
            goto L_0x0116
        L_0x0112:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r4)     // Catch:{ all -> 0x0141 }
        L_0x0116:
            java.lang.String r0 = r10.getMessage()     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0145
            java.lang.String r2 = r10.getLocalizedMessage()     // Catch:{ all -> 0x0141 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0145
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = "Message: "
            r2.<init>(r5)     // Catch:{ all -> 0x0141 }
            r2.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0141 }
            byte[] r0 = r0.getBytes(r3)     // Catch:{ all -> 0x0141 }
            r8.write(r0)     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0145:
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ all -> 0x014e }
            r0.<init>(r8)     // Catch:{ all -> 0x014e }
            r10.printStackTrace(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0152
        L_0x014e:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0152:
            java.lang.String r10 = "Back traces ends.\n"
            byte[] r10 = r10.getBytes(r3)     // Catch:{ all -> 0x015c }
            r8.write(r10)     // Catch:{ all -> 0x015c }
            goto L_0x0160
        L_0x015c:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0160:
            a((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            r8.flush()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x016b:
            com.uc.crashsdk.a.a((java.io.OutputStream) r8, (java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x016f:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x0173:
            if (r11 == 0) goto L_0x017d
            r8.flush()     // Catch:{ all -> 0x0179 }
            goto L_0x017d
        L_0x0179:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x017d:
            f((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            g((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            com.uc.crashsdk.a.a((java.io.OutputStream) r8, (java.lang.String) r3, (java.util.ArrayList<java.lang.String>) r6)     // Catch:{ all -> 0x0187 }
            goto L_0x018b
        L_0x0187:
            r10 = move-exception
            a((java.lang.Throwable) r10, (java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
        L_0x018b:
            r8.flush()     // Catch:{ all -> 0x0199 }
            int r10 = setMax
            int r10 = r10 + 23
            int r11 = r10 % 128
            getMax = r11
            int r10 = r10 % 2
            goto L_0x019d
        L_0x0199:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x019d:
            b((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            r8.flush()     // Catch:{ all -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x01a8:
            c((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            d((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            e((java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
            com.uc.crashsdk.a.b(r8, r3, r1, r6)     // Catch:{ all -> 0x01b5 }
            goto L_0x01b9
        L_0x01b5:
            r10 = move-exception
            a((java.lang.Throwable) r10, (java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
        L_0x01b9:
            r8.flush()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x01c1:
            com.uc.crashsdk.a.a((java.io.OutputStream) r8, (java.lang.String) r3, (java.lang.String) r1, (java.util.ArrayList<java.lang.String>) r6)     // Catch:{ all -> 0x01c5 }
            goto L_0x01c9
        L_0x01c5:
            r10 = move-exception
            a((java.lang.Throwable) r10, (java.io.OutputStream) r8)     // Catch:{ all -> 0x01e0 }
        L_0x01c9:
            r8.a()     // Catch:{ all -> 0x01e0 }
            a((com.uc.crashsdk.f.b) r8)     // Catch:{ all -> 0x01e0 }
            r8.flush()     // Catch:{ all -> 0x01d3 }
            goto L_0x01d7
        L_0x01d3:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)     // Catch:{ all -> 0x01e0 }
        L_0x01d7:
            r8.close()     // Catch:{ all -> 0x01db }
            goto L_0x01f9
        L_0x01db:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)
            goto L_0x01f9
        L_0x01e0:
            r10 = move-exception
            r6 = r8
            goto L_0x01e7
        L_0x01e3:
            r10 = move-exception
            goto L_0x01e7
        L_0x01e5:
            r10 = move-exception
            r7 = r6
        L_0x01e7:
            a((java.lang.Throwable) r10, (java.io.OutputStream) r6)     // Catch:{ all -> 0x020b }
            if (r6 == 0) goto L_0x01f9
            r6.close()     // Catch:{ all -> 0x01db }
            int r10 = setMax
            int r10 = r10 + 67
            int r11 = r10 % 128
            getMax = r11
            int r10 = r10 % 2
        L_0x01f9:
            m(r7)
            java.lang.String r10 = j(r7)     // Catch:{ all -> 0x0206 }
            java.lang.String r11 = "java"
            b((java.lang.String) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0206 }
            goto L_0x020a
        L_0x0206:
            r10 = move-exception
            com.uc.crashsdk.a.a.a(r10, r4)
        L_0x020a:
            return r7
        L_0x020b:
            r10 = move-exception
            if (r6 == 0) goto L_0x0216
            r6.close()     // Catch:{ all -> 0x0212 }
            goto L_0x0216
        L_0x0212:
            r11 = move-exception
            com.uc.crashsdk.a.a.a(r11, r4)
        L_0x0216:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.Throwable, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        a(r0, r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void g(java.io.OutputStream r8) {
        /*
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {1, 2, 0, 5, 124} // fill-array
            java.lang.String r1 = ""
            int r1 = android.os.Process.getGidForName(r1)
            int r1 = r1 + 6
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r6 = r6 + 67
            byte r2 = (byte) r6
            java.lang.String r0 = getMax(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            java.lang.String r1 = "Recent Status:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch:{ all -> 0x002b }
            r8.write(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            a((java.lang.Throwable) r1, (java.io.OutputStream) r8)
        L_0x002f:
            r1 = 0
            r2 = 1
            java.lang.String r3 = com.uc.crashsdk.a.g()     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "last version: '%s'\n"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0047 }
            r5[r1] = r3     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0047 }
            byte[] r3 = r3.getBytes(r0)     // Catch:{ all -> 0x0047 }
            r8.write(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r3 = move-exception
            a((java.lang.Throwable) r3, (java.io.OutputStream) r8)
        L_0x004b:
            java.util.ArrayList<java.lang.String> r3 = q     // Catch:{ all -> 0x00e5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = s     // Catch:{ all -> 0x00e2 }
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = "generating log: %s\n"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = s     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00e2 }
            r5[r1] = r6     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x00e2 }
            byte[] r4 = r4.getBytes(r0)     // Catch:{ all -> 0x00e2 }
            r8.write(r4)     // Catch:{ all -> 0x00e2 }
        L_0x0069:
            int r4 = r     // Catch:{ all -> 0x00e2 }
            if (r4 > 0) goto L_0x0075
            java.util.ArrayList<java.lang.String> r4 = q     // Catch:{ all -> 0x00e2 }
            int r4 = r4.size()     // Catch:{ all -> 0x00e2 }
            if (r4 <= 0) goto L_0x00b2
        L_0x0075:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = "generated %d logs, recent are:\n"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            int r7 = r     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00e2 }
            r6[r1] = r7     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = java.lang.String.format(r4, r5, r6)     // Catch:{ all -> 0x00e2 }
            byte[] r4 = r4.getBytes(r0)     // Catch:{ all -> 0x00e2 }
            r8.write(r4)     // Catch:{ all -> 0x00e2 }
            java.util.ArrayList<java.lang.String> r4 = q     // Catch:{ all -> 0x00e2 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x0094:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = "* %s\n"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            r7[r1] = r5     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00e2 }
            byte[] r5 = r5.getBytes(r0)     // Catch:{ all -> 0x00e2 }
            r8.write(r5)     // Catch:{ all -> 0x00e2 }
            goto L_0x0094
        L_0x00b2:
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            java.lang.String r3 = "dumping all threads: %s\n"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e5 }
            boolean r5 = t     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00e5 }
            r4[r1] = r5     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x00e5 }
            byte[] r3 = r3.getBytes(r0)     // Catch:{ all -> 0x00e5 }
            r8.write(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = u     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x00e9
            java.lang.String r3 = "dumping threads: %s\n"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = u     // Catch:{ all -> 0x00e5 }
            r2[r1] = r4     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x00e5 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x00e5 }
            r8.write(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r8)
        L_0x00e9:
            a((java.io.OutputStream) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.g(java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r6.equals(r0) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String j(java.lang.String r6) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x006a }
            int r0 = r0 + 75
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x006a }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x0027
            java.lang.String r0 = com.uc.crashsdk.p.v()
            boolean r4 = com.uc.crashsdk.p.u()
            java.lang.String r0 = com.uc.crashsdk.a.d.a(r6, r0, r4)
            boolean r4 = r6.equals(r0)
            if (r4 != 0) goto L_0x0051
            goto L_0x003a
        L_0x0027:
            java.lang.String r0 = com.uc.crashsdk.p.v()
            boolean r4 = com.uc.crashsdk.p.u()
            java.lang.String r0 = com.uc.crashsdk.a.d.a(r6, r0, r4)
            boolean r4 = r6.equals(r0)
            int r5 = r3.length     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x0051
        L_0x003a:
            java.io.File r4 = new java.io.File
            r4.<init>(r6)
            boolean r6 = r4.exists()
            r5 = 82
            if (r6 == 0) goto L_0x004a
            r6 = 32
            goto L_0x004c
        L_0x004a:
            r6 = 82
        L_0x004c:
            if (r6 == r5) goto L_0x0051
            r4.delete()
        L_0x0051:
            int r6 = getMax
            int r6 = r6 + 93
            int r4 = r6 % 128
            setMax = r4
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            if (r1 == 0) goto L_0x0062
            return r0
        L_0x0062:
            super.hashCode()     // Catch:{ all -> 0x0066 }
            return r0
        L_0x0066:
            r6 = move-exception
            throw r6
        L_0x0068:
            r6 = move-exception
            throw r6
        L_0x006a:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.j(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r12 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r12 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Throwable r11, java.io.OutputStream r12) {
        /*
            int r0 = getMax
            int r0 = r0 + 113
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 82
            if (r0 != 0) goto L_0x0011
            r0 = 82
            goto L_0x0013
        L_0x0011:
            r0 = 74
        L_0x0013:
            r3 = 0
            if (r0 == r2) goto L_0x0019
            if (r12 == 0) goto L_0x0096
            goto L_0x001e
        L_0x0019:
            r0 = 79
            int r0 = r0 / r3
            if (r12 == 0) goto L_0x0096
        L_0x001e:
            java.lang.String r0 = "[DEBUG] CrashHandler occurred new exception:\n"
            r2 = 5
            char[] r4 = new char[r2]     // Catch:{ all -> 0x0092 }
            r5 = 1
            r4[r3] = r5     // Catch:{ all -> 0x0092 }
            r4[r5] = r1     // Catch:{ all -> 0x0092 }
            r4[r1] = r3     // Catch:{ all -> 0x0092 }
            r6 = 3
            r4[r6] = r2     // Catch:{ all -> 0x0092 }
            r7 = 124(0x7c, float:1.74E-43)
            r8 = 4
            r4[r8] = r7     // Catch:{ all -> 0x0092 }
            int r9 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x0092 }
            int r9 = r9 >> 16
            int r9 = r9 + r2
            int r10 = android.os.Process.getThreadPriority(r3)     // Catch:{ all -> 0x0092 }
            int r10 = r10 + 20
            int r10 = r10 >> 6
            int r10 = 68 - r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = getMax(r4, r9, r10)     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x0092 }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ all -> 0x0092 }
            r12.write(r0)     // Catch:{ all -> 0x0092 }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ all -> 0x0092 }
            r0.<init>(r12)     // Catch:{ all -> 0x0092 }
            r11.printStackTrace(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "\n\n"
            char[] r4 = new char[r2]     // Catch:{ all -> 0x0092 }
            r4[r3] = r5     // Catch:{ all -> 0x0092 }
            r4[r5] = r1     // Catch:{ all -> 0x0092 }
            r4[r1] = r3     // Catch:{ all -> 0x0092 }
            r4[r6] = r2     // Catch:{ all -> 0x0092 }
            r4[r8] = r7     // Catch:{ all -> 0x0092 }
            int r5 = android.view.KeyEvent.getMaxKeyCode()     // Catch:{ all -> 0x0092 }
            int r5 = r5 >> 16
            int r5 = r5 + r2
            int r2 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x0092 }
            int r2 = r2 >> 16
            int r2 = 68 - r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = getMax(r4, r5, r2)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r2.intern()     // Catch:{ all -> 0x0092 }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ all -> 0x0092 }
            r12.write(r0)     // Catch:{ all -> 0x0092 }
            int r12 = getMax
            int r12 = r12 + 35
            int r0 = r12 % 128
            setMax = r0
            int r12 = r12 % r1
            goto L_0x0096
        L_0x0092:
            r12 = move-exception
            com.uc.crashsdk.a.a.a(r12, r3)
        L_0x0096:
            com.uc.crashsdk.a.a.a(r11, r3)
            return
        L_0x009a:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.Throwable, java.io.OutputStream):void");
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f9886a;
        private boolean b;
        private boolean c;

        /* synthetic */ a(String str, boolean z, boolean z2, byte b2) {
            this(str, z, z2);
        }

        private a(String str, boolean z, boolean z2) {
            this.b = true;
            this.c = false;
            this.f9886a = str;
            this.b = z;
            this.c = z2;
        }

        public final void run() {
            Object u;
            com.uc.crashsdk.a.c.b("CrashHandler uploading logs");
            synchronized (f.u()) {
                try {
                    if (h.b(this.f9886a)) {
                        f.a(this.f9886a, this.b, false);
                    } else {
                        com.uc.crashsdk.a.c.b("CrashHandler url is empty!");
                    }
                    if (this.c) {
                        u = f.u();
                        u.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b6, code lost:
        if ((r1.b & r0.length()) > r4) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c4, code lost:
        if ((r1.b + r0.length()) > r4) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r30, boolean r31, boolean r32) {
        /*
            java.lang.String r0 = com.uc.crashsdk.p.O()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x001d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Folder not exist: "
            java.lang.String r0 = r1.concat(r0)
            com.uc.crashsdk.a.c.b(r0)
            return
        L_0x001d:
            java.io.File[] r1 = r1.listFiles()
            r2 = 0
            r3 = 2
            if (r1 != 0) goto L_0x0053
            int r1 = getMax
            int r1 = r1 + 39
            int r4 = r1 % 128
            setMax = r4
            int r1 = r1 % r3
            java.lang.String r3 = "List folder failed: "
            if (r1 != 0) goto L_0x0044
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.concat(r0)
            com.uc.crashsdk.a.c.c(r0)
            super.hashCode()     // Catch:{ all -> 0x0041 }
            goto L_0x004f
        L_0x0041:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0044:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ Exception -> 0x0050 }
            com.uc.crashsdk.a.c.c(r0)     // Catch:{ Exception -> 0x0050 }
        L_0x004f:
            return
        L_0x0050:
            r0 = move-exception
            goto L_0x04ac
        L_0x0053:
            int r4 = r1.length
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x005e:
            if (r6 >= r4) goto L_0x0446
            r5 = r1[r6]
            boolean r0 = r5.isFile()
            if (r0 != 0) goto L_0x006a
            r0 = 0
            goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            if (r0 == 0) goto L_0x042c
            if (r32 == 0) goto L_0x0086
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = "ucebu"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x007d
            goto L_0x0086
        L_0x007d:
            r16 = 0
            r20 = 2
            r24 = r1
            r22 = r4
            goto L_0x009d
        L_0x0086:
            long r20 = r5.length()
            r22 = r4
            r3 = 0
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            int r7 = r7 + 1
            com.uc.crashsdk.a.b.a((java.io.File) r5)
        L_0x0097:
            r16 = 0
            r20 = 2
            r24 = r1
        L_0x009d:
            r27 = r8
        L_0x009f:
            r8 = r30
            goto L_0x043b
        L_0x00a3:
            if (r31 == 0) goto L_0x0133
            int r0 = setMax
            int r0 = r0 + 51
            int r2 = r0 % 128
            getMax = r2
            r2 = 2
            int r0 = r0 % r2
            long r23 = java.lang.System.currentTimeMillis()
            long r25 = r5.lastModified()
            long r23 = r23 - r25
            r25 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 / r25
            int r0 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0106
            r25 = 2
            int r0 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            int r0 = setMax
            int r0 = r0 + 111
            int r2 = r0 % 128
            getMax = r2
            r2 = 2
            int r0 = r0 % r2
        L_0x00d1:
            r0 = 0
            goto L_0x0107
        L_0x00d3:
            r25 = 5
            int r0 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            int r0 = setMax
            r19 = 25
            int r0 = r0 + 25
            int r2 = r0 % 128
            getMax = r2
            r2 = 2
            int r0 = r0 % r2
            java.lang.String r0 = r5.getName()
            java.lang.String r2 = ".log"
            boolean r0 = r0.endsWith(r2)
            r2 = 50
            if (r0 == 0) goto L_0x00f6
            r0 = 50
            goto L_0x00f8
        L_0x00f6:
            r0 = 8
        L_0x00f8:
            if (r0 == r2) goto L_0x00fb
            goto L_0x0106
        L_0x00fb:
            int r0 = setMax
            int r0 = r0 + 7
            int r2 = r0 % 128
            getMax = r2
            r2 = 2
            int r0 = r0 % r2
            goto L_0x00d1
        L_0x0106:
            r0 = 1
        L_0x0107:
            java.util.Locale r2 = java.util.Locale.US
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r5.getName()
            r17 = 0
            r4[r17] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            r18 = 1
            r4[r18] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r20 = 2
            r4[r20] = r3
            java.lang.String r3 = "file: %s, modify interval: %d s, safe upload: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3, r4)
            com.uc.crashsdk.a.c.a(r2)
            if (r0 != 0) goto L_0x0133
            int r8 = r8 + 1
            goto L_0x0097
        L_0x0133:
            r2 = 5
            boolean r0 = com.uc.crashsdk.p.k()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x01d6 }
            java.lang.String r3 = "([^_]+)_([^_]+)_([^_]+)\\.crashsdk"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ all -> 0x01d6 }
            java.util.regex.Matcher r0 = r3.matcher(r0)     // Catch:{ all -> 0x01d6 }
            boolean r3 = r0.matches()     // Catch:{ all -> 0x01d6 }
            if (r3 == 0) goto L_0x01cb
            r3 = 1
            java.lang.String r4 = r0.group(r3)     // Catch:{ all -> 0x01d6 }
            r3 = 2
            java.lang.String r20 = r0.group(r3)     // Catch:{ all -> 0x01d6 }
            r3 = 3
            java.lang.String r0 = r0.group(r3)     // Catch:{ all -> 0x01d6 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x01d6 }
            r24 = r1
            java.lang.String r1 = "%s%s_%s_%s.%s"
            r27 = r8
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c7 }
            java.lang.String r20 = g((java.lang.String) r20)     // Catch:{ all -> 0x01c7 }
            r17 = 0
            r8[r17] = r20     // Catch:{ all -> 0x01c7 }
            java.lang.String r20 = g()     // Catch:{ all -> 0x01c7 }
            r18 = 1
            r8[r18] = r20     // Catch:{ all -> 0x01c7 }
            java.lang.String r20 = x()     // Catch:{ all -> 0x01c7 }
            r23 = 2
            r8[r23] = r20     // Catch:{ all -> 0x01c7 }
            r21 = 3
            r8[r21] = r4     // Catch:{ all -> 0x01c7 }
            r4 = 4
            r8[r4] = r0     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = java.lang.String.format(r3, r1, r8)     // Catch:{ all -> 0x01c7 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r3.<init>()     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = com.uc.crashsdk.p.O()     // Catch:{ all -> 0x01c7 }
            r3.append(r4)     // Catch:{ all -> 0x01c7 }
            r3.append(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = "File "
            r0.<init>(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = r5.getPath()     // Catch:{ all -> 0x01c7 }
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = " matches, rename to "
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = r1.getPath()     // Catch:{ all -> 0x01c7 }
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01c7 }
            com.uc.crashsdk.a.c.b(r0)     // Catch:{ all -> 0x01c7 }
            r5.renameTo(r1)     // Catch:{ all -> 0x01c7 }
            goto L_0x01d0
        L_0x01c7:
            r0 = move-exception
            goto L_0x01db
        L_0x01c9:
            r0 = move-exception
            goto L_0x01d9
        L_0x01cb:
            r24 = r1
            r27 = r8
            r1 = r5
        L_0x01d0:
            if (r1 == r5) goto L_0x01d4
            int r10 = r10 + 1
        L_0x01d4:
            r5 = r1
            goto L_0x01df
        L_0x01d6:
            r0 = move-exception
            r24 = r1
        L_0x01d9:
            r27 = r8
        L_0x01db:
            r1 = 0
            com.uc.crashsdk.a.a.a(r0, r1)
        L_0x01df:
            java.lang.String r0 = r5.getPath()
            java.lang.String r1 = k(r0)
            if (r0 == r1) goto L_0x01f0
            int r11 = r11 + 1
            java.io.File r5 = new java.io.File
            r5.<init>(r1)
        L_0x01f0:
            java.io.File r0 = com.uc.crashsdk.d.a((java.io.File) r5)
            if (r0 != 0) goto L_0x0202
            int r0 = getMax
            int r0 = r0 + r2
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
        L_0x0200:
            r3 = 0
            goto L_0x0233
        L_0x0202:
            if (r5 == r0) goto L_0x0200
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r0.getName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0200
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x0200
            int r2 = setMax
            int r2 = r2 + 43
            int r3 = r2 % 128
            getMax = r3
            r1 = 2
            int r2 = r2 % r1
            if (r2 == 0) goto L_0x022f
            r5.delete()
            r2 = 13
            r3 = 0
            int r2 = r2 / r3
            goto L_0x0233
        L_0x022c:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x022f:
            r3 = 0
            r5.delete()
        L_0x0233:
            if (r0 != 0) goto L_0x0250
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onBeforeUploadLog return null, skip upload: "
            r0.<init>(r2)
            java.lang.String r2 = r5.getAbsolutePath()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.uc.crashsdk.a.c.c(r0)
        L_0x024a:
            r16 = 0
            r20 = 2
            goto L_0x009f
        L_0x0250:
            int r2 = com.uc.crashsdk.p.x()
            if (r2 <= 0) goto L_0x0265
            long r4 = r0.length()
            long r1 = (long) r2
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x0265
            int r9 = r9 + 1
            com.uc.crashsdk.a.b.a((java.io.File) r0)
            goto L_0x024a
        L_0x0265:
            com.uc.crashsdk.f$e r1 = new com.uc.crashsdk.f$e
            r1.<init>()
            r4 = 0
            r1.b = r4
            long r4 = java.lang.System.currentTimeMillis()
            r1.f9889a = r4
            java.lang.String r2 = A()
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x028b
            com.uc.crashsdk.g r5 = new com.uc.crashsdk.g
            r5.<init>(r2, r1, r4)
            a((java.lang.String) r2, (com.uc.crashsdk.f.C0040f) r5)
        L_0x028b:
            long r4 = com.uc.crashsdk.p.y()
            int r2 = com.uc.crashsdk.p.z()
            int r8 = com.uc.crashsdk.p.A()
            r25 = 0
            int r23 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r23 < 0) goto L_0x02d8
            int r23 = getMax
            int r3 = r23 + 33
            r23 = r10
            int r10 = r3 % 128
            setMax = r10
            r10 = 2
            int r3 = r3 % r10
            if (r3 != 0) goto L_0x02b9
            r3 = r11
            long r10 = r1.b
            long r28 = r0.length()
            long r10 = r10 & r28
            int r26 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r26 <= 0) goto L_0x02db
            goto L_0x02c6
        L_0x02b9:
            r3 = r11
            long r10 = r1.b
            long r28 = r0.length()
            long r10 = r10 + r28
            int r26 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r26 <= 0) goto L_0x02db
        L_0x02c6:
            r2 = 1
            r1.e = r2
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Reach max upload bytes: "
            java.lang.String r2 = r4.concat(r2)
            com.uc.crashsdk.a.c.c(r2)
            goto L_0x0347
        L_0x02d8:
            r23 = r10
            r3 = r11
        L_0x02db:
            boolean r4 = com.uc.crashsdk.p.f()
            if (r4 != 0) goto L_0x0347
            boolean r4 = b((java.io.File) r0)
            if (r4 == 0) goto L_0x032a
            if (r2 < 0) goto L_0x0347
            int r4 = setMax
            int r4 = r4 + 109
            int r5 = r4 % 128
            getMax = r5
            r20 = 2
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x030a
            int r4 = r1.c
            r16 = 0
            super.hashCode()     // Catch:{ all -> 0x0307 }
            if (r4 < r2) goto L_0x0304
            r4 = 1
            r5 = 98
            goto L_0x031a
        L_0x0304:
            r5 = 98
            goto L_0x034d
        L_0x0307:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x030a:
            r16 = 0
            int r4 = r1.c
            if (r4 < r2) goto L_0x0313
            r4 = 86
            goto L_0x0315
        L_0x0313:
            r4 = 98
        L_0x0315:
            r5 = 98
            if (r4 == r5) goto L_0x034d
            r4 = 1
        L_0x031a:
            r1.g = r4
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Reach max upload crash log count: "
            java.lang.String r2 = r4.concat(r2)
            com.uc.crashsdk.a.c.c(r2)
            goto L_0x034d
        L_0x032a:
            r5 = 98
            r16 = 0
            r20 = 2
            if (r8 < 0) goto L_0x034d
            int r2 = r1.d
            if (r2 < r8) goto L_0x034d
            r2 = 1
            r1.f = r2
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "Reach max upload custom log count: "
            java.lang.String r2 = r4.concat(r2)
            com.uc.crashsdk.a.c.c(r2)
            goto L_0x034d
        L_0x0347:
            r5 = 98
            r16 = 0
            r20 = 2
        L_0x034d:
            boolean r2 = r1.e
            if (r2 == 0) goto L_0x0359
            r8 = r30
            r11 = r3
            r10 = r23
            r12 = 1
            goto L_0x043b
        L_0x0359:
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x0371
            int r0 = setMax     // Catch:{ Exception -> 0x036f }
            int r0 = r0 + 55
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x036f }
            int r0 = r0 % 2
            r8 = r30
            r11 = r3
            r10 = r23
            r13 = 1
            goto L_0x043b
        L_0x036f:
            r0 = move-exception
            throw r0
        L_0x0371:
            boolean r2 = r1.f
            if (r2 == 0) goto L_0x037d
            r8 = r30
            r11 = r3
            r10 = r23
            r14 = 1
            goto L_0x043b
        L_0x037d:
            java.lang.String r2 = r0.getName()
            java.lang.String r4 = w()
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x039a
            java.lang.String r4 = "_"
            java.lang.String[] r2 = r2.split(r4)
            int r4 = r2.length
            r8 = 9
            if (r4 != r8) goto L_0x039a
            r4 = 1
            r2 = r2[r4]
            goto L_0x039c
        L_0x039a:
            r2 = r16
        L_0x039c:
            if (r2 == 0) goto L_0x03aa
            java.lang.String r4 = com.uc.crashsdk.p.K()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x03aa
            r2 = 1
            goto L_0x03ab
        L_0x03aa:
            r2 = 0
        L_0x03ab:
            java.lang.String r4 = r0.getName()
            r8 = r30
            boolean r4 = com.uc.crashsdk.q.a((java.io.File) r0, (java.lang.String) r4, (java.lang.String) r8)
            java.lang.String r10 = "crashsdk"
            if (r4 == 0) goto L_0x0413
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r11 = "Uploaded log: "
            r4.<init>(r11)
            java.lang.String r11 = r0.getName()
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.uc.crashsdk.a.c.a(r10, r4)
            if (r2 == 0) goto L_0x03d5
            r2 = 19
            r5 = 19
            goto L_0x03d7
        L_0x03d5:
            r2 = 19
        L_0x03d7:
            if (r5 == r2) goto L_0x03da
            goto L_0x03df
        L_0x03da:
            r2 = 13
            com.uc.crashsdk.k.a((int) r2)
        L_0x03df:
            long r4 = r1.b
            long r25 = r0.length()
            long r4 = r4 + r25
            r1.b = r4
            boolean r2 = b((java.io.File) r0)
            if (r2 == 0) goto L_0x03f1
            r2 = 0
            goto L_0x03f2
        L_0x03f1:
            r2 = 1
        L_0x03f2:
            if (r2 == 0) goto L_0x03fb
            int r2 = r1.d
            r4 = 1
            int r2 = r2 + r4
            r1.d = r2
            goto L_0x0401
        L_0x03fb:
            r4 = 1
            int r2 = r1.c
            int r2 = r2 + r4
            r1.c = r2
        L_0x0401:
            java.lang.String r2 = A()
            com.uc.crashsdk.h r4 = new com.uc.crashsdk.h
            r4.<init>(r2, r1)
            a((java.lang.String) r2, (com.uc.crashsdk.f.C0040f) r4)
            r0.delete()
            r1 = 3
            r15 = 0
            goto L_0x041d
        L_0x0413:
            int r15 = r15 + 1
            if (r2 == 0) goto L_0x041c
            r0 = 14
            com.uc.crashsdk.k.a((int) r0)
        L_0x041c:
            r1 = 3
        L_0x041d:
            if (r15 < r1) goto L_0x0428
            java.lang.String r0 = "Upload failed 3 times continuously, abort upload!"
            com.uc.crashsdk.a.c.a(r10, r0)
            r11 = r3
            r10 = r23
            goto L_0x0448
        L_0x0428:
            r11 = r3
            r10 = r23
            goto L_0x043b
        L_0x042c:
            r16 = 0
            r20 = 2
            r24 = r1
            r22 = r4
            r27 = r8
            r8 = r30
            com.uc.crashsdk.a.b.a((java.io.File) r5)
        L_0x043b:
            int r6 = r6 + 1
            r4 = r22
            r1 = r24
            r8 = r27
            r3 = 2
            goto L_0x005e
        L_0x0446:
            r27 = r8
        L_0x0448:
            if (r7 <= 0) goto L_0x044c
            r0 = 1
            goto L_0x044d
        L_0x044c:
            r0 = 0
        L_0x044d:
            r1 = 1
            if (r0 == r1) goto L_0x0451
            goto L_0x0456
        L_0x0451:
            r0 = 15
            com.uc.crashsdk.k.a((int) r0, (int) r7)
        L_0x0456:
            if (r9 <= 0) goto L_0x045d
            r0 = 17
            com.uc.crashsdk.k.a((int) r0, (int) r9)
        L_0x045d:
            if (r12 == 0) goto L_0x0464
            r1 = 19
            com.uc.crashsdk.k.a((int) r1)
        L_0x0464:
            if (r13 == 0) goto L_0x046b
            r0 = 20
            com.uc.crashsdk.k.a((int) r0)
        L_0x046b:
            if (r14 == 0) goto L_0x0472
            r0 = 21
            com.uc.crashsdk.k.a((int) r0)
        L_0x0472:
            r0 = 68
            if (r12 != 0) goto L_0x0479
            r1 = 97
            goto L_0x047b
        L_0x0479:
            r1 = 68
        L_0x047b:
            if (r1 == r0) goto L_0x0481
            if (r13 != 0) goto L_0x0481
            if (r14 == 0) goto L_0x0486
        L_0x0481:
            r0 = 18
            com.uc.crashsdk.k.a((int) r0)
        L_0x0486:
            if (r11 <= 0) goto L_0x048a
            r0 = 1
            goto L_0x048b
        L_0x048a:
            r0 = 0
        L_0x048b:
            r1 = 1
            if (r0 == r1) goto L_0x048f
            goto L_0x0494
        L_0x048f:
            r0 = 24
            com.uc.crashsdk.k.a((int) r0, (int) r11)
        L_0x0494:
            if (r10 <= 0) goto L_0x049b
            r1 = 25
            com.uc.crashsdk.k.a((int) r1, (int) r10)
        L_0x049b:
            if (r27 <= 0) goto L_0x04a0
            r1 = 1
            r5 = 0
            goto L_0x04a2
        L_0x04a0:
            r1 = 1
            r5 = 1
        L_0x04a2:
            if (r5 == r1) goto L_0x04ad
            r0 = 26
            r5 = r27
            com.uc.crashsdk.k.a((int) r0, (int) r5)     // Catch:{ Exception -> 0x0050 }
            goto L_0x04ad
        L_0x04ac:
            throw r0
        L_0x04ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.String, boolean, boolean):void");
    }

    public static boolean e() {
        int i2 = getMax + 73;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean z2 = e;
            try {
                int i4 = getMax + 119;
                setMax = i4 % 128;
                if ((i4 % 2 == 0 ? 'Z' : 18) != 'Z') {
                    return z2;
                }
                Object obj = null;
                super.hashCode();
                return z2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public static boolean a(boolean z2) {
        if (z2) {
            e = true;
            if (b.d) {
                JNIBridge.nativeSetCrashLogFilesUploaded();
            }
        }
        try {
            String f2 = f();
            if (h.a(f2)) {
                com.uc.crashsdk.a.c.b("CrashHandler url is empty!");
                return false;
            }
            synchronized (m) {
                boolean z3 = !z2;
                if (i.a(z2 ^ true ? 1 : 0, new a(f2, z2, z3, (byte) 0)) && z3) {
                    try {
                        m.wait();
                    } catch (InterruptedException e2) {
                        com.uc.crashsdk.a.a.a(e2, false);
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
            return false;
        }
    }

    public static void b(boolean z2) {
        boolean z3 = false;
        try {
            if (p.r() && a.f9861a.equals(d()) && !b.s()) {
                int i2 = getMax + 115;
                setMax = i2 % 128;
                int i3 = i2 % 2;
                if (!(!e)) {
                    return;
                }
                if (z2) {
                    String f2 = f();
                    if (!h.a(f2)) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
                        new a(f2, false, false, (byte) 0).run();
                    }
                    int i4 = setMax + 93;
                    getMax = i4 % 128;
                    if (i4 % 2 != 0) {
                        z3 = true;
                    }
                    if (z3) {
                        Object[] objArr = null;
                        int length = objArr.length;
                        return;
                    }
                    return;
                }
                a(false);
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.a.a(th, false);
        }
    }

    private static String A() {
        StringBuilder sb = new StringBuilder();
        sb.append(p.N());
        sb.append("bytes");
        String obj = sb.toString();
        int i2 = getMax + 21;
        setMax = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        return obj;
    }

    /* renamed from: com.uc.crashsdk.f$f  reason: collision with other inner class name */
    static abstract class C0040f {
        protected String b;
        protected e c;

        public abstract boolean a();

        public C0040f(String str, e eVar) {
            this.b = str;
            this.c = eVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.uc.crashsdk.a.a.a(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0076 A[SYNTHETIC, Splitter:B:64:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r5, com.uc.crashsdk.f.C0040f r6) {
        /*
            java.lang.Object r0 = n
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007f }
            r1.<init>(r5)     // Catch:{ all -> 0x007f }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x007f }
            r2 = 0
            if (r5 != 0) goto L_0x0017
            r1.createNewFile()     // Catch:{ Exception -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ all -> 0x007f }
        L_0x0017:
            r5 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r6 = move-exception
            goto L_0x0074
        L_0x0026:
            r1 = move-exception
            com.uc.crashsdk.a.a.a(r1, r2)     // Catch:{ Exception -> 0x0061, all -> 0x0024 }
            r1 = r5
        L_0x002b:
            if (r1 == 0) goto L_0x0039
            java.nio.channels.FileLock r5 = r1.lock()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            r3 = move-exception
            com.uc.crashsdk.a.a.a(r3, r2)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            goto L_0x0064
        L_0x0039:
            boolean r6 = r6.a()     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.release()     // Catch:{ Exception -> 0x0043 }
            goto L_0x004a
        L_0x0043:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ Exception -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r5 = move-exception
            goto L_0x0065
        L_0x004a:
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0070
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ all -> 0x007f }
            goto L_0x0070
        L_0x0055:
            r6 = move-exception
            if (r5 == 0) goto L_0x0060
            r5.release()     // Catch:{ Exception -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ Exception -> 0x0037 }
        L_0x0060:
            throw r6     // Catch:{ Exception -> 0x0037 }
        L_0x0061:
            r6 = move-exception
            r1 = r5
            r5 = r6
        L_0x0064:
            r6 = 0
        L_0x0065:
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ Exception -> 0x006e }
            goto L_0x0070
        L_0x006e:
            r5 = move-exception
            goto L_0x0051
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return r6
        L_0x0072:
            r6 = move-exception
            r5 = r1
        L_0x0074:
            if (r5 == 0) goto L_0x007e
            r5.close()     // Catch:{ Exception -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r2)     // Catch:{ all -> 0x007f }
        L_0x007e:
            throw r6     // Catch:{ all -> 0x007f }
        L_0x007f:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0083
        L_0x0082:
            throw r5
        L_0x0083:
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.String, com.uc.crashsdk.f$f):boolean");
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        long f9889a = 0;
        long b = 0;
        int c = 0;
        int d = 0;
        boolean e = false;
        boolean f = false;
        boolean g = false;

        e() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r0 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if ((!com.uc.crashsdk.export.LogType.NATIVE_TYPE.equals(r6) ? ',' : 31) != ',') goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.io.File r6) {
        /*
            java.lang.String r6 = r6.getName()
            r0 = 95
            int r0 = r6.lastIndexOf(r0)
            r1 = 0
            if (r0 > 0) goto L_0x000e
            return r1
        L_0x000e:
            r2 = 46
            int r2 = r6.indexOf(r2, r0)
            r3 = 81
            if (r2 > 0) goto L_0x001b
            r4 = 75
            goto L_0x001d
        L_0x001b:
            r4 = 81
        L_0x001d:
            r5 = 1
            if (r4 == r3) goto L_0x002e
            int r6 = setMax
            int r6 = r6 + 37
            int r0 = r6 % 128
            getMax = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x002d
            r1 = 1
        L_0x002d:
            return r1
        L_0x002e:
            int r0 = r0 + r5
            java.lang.String r6 = r6.substring(r0, r2)
            java.lang.String r0 = "java"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "ucebujava"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x008a
            int r0 = getMax     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 + 99
            int r2 = r0 % 128
            setMax = r2     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 % 2
            java.lang.String r2 = "jni"
            if (r0 != 0) goto L_0x005f
            boolean r0 = r2.equals(r6)     // Catch:{ Exception -> 0x0088 }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x008a
            goto L_0x006f
        L_0x005d:
            r6 = move-exception
            throw r6
        L_0x005f:
            boolean r0 = r2.equals(r6)
            r2 = 44
            if (r0 != 0) goto L_0x006a
            r0 = 44
            goto L_0x006c
        L_0x006a:
            r0 = 31
        L_0x006c:
            if (r0 == r2) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            java.lang.String r0 = "ucebujni"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "unexp"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            return r1
        L_0x0088:
            r6 = move-exception
            throw r6
        L_0x008a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.b(java.io.File):boolean");
    }

    private static String k(String str) {
        int i2;
        Object obj = null;
        boolean z2 = true;
        if (!p.u()) {
            int i3 = getMax + 93;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                z2 = false;
            }
            if (!z2) {
                return str;
            }
            super.hashCode();
            return str;
        } else if (h.a(p.v())) {
            int i4 = getMax + 65;
            setMax = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            super.hashCode();
            return str;
        } else {
            int lastIndexOf = str.lastIndexOf(".log");
            if (lastIndexOf <= 0 || lastIndexOf + 4 != str.length()) {
                return str;
            }
            int lastIndexOf2 = str.lastIndexOf(File.separatorChar);
            if (lastIndexOf2 < 0) {
                lastIndexOf2 = 0;
            }
            int i5 = 0;
            do {
                i2 = str.indexOf(95, i2);
                if (i2 >= 0) {
                    i5++;
                    i2++;
                    continue;
                }
            } while (i2 >= 0);
            try {
                if (i5 != i) {
                    int i6 = setMax + 15;
                    getMax = i6 % 128;
                    if (i6 % 2 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        return str;
                    }
                    int i7 = 56 / 0;
                    return str;
                }
                int lastIndexOf3 = str.lastIndexOf(95);
                if ((!b) && lastIndexOf3 <= 0) {
                    throw new AssertionError();
                } else if (str.indexOf(".log", lastIndexOf3) != lastIndexOf) {
                    return str;
                } else {
                    try {
                        return j(str);
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.a.a(th, false);
                        return str;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public static boolean a(StringBuffer stringBuffer, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        String a2;
        String str3 = str;
        if (d) {
            com.uc.crashsdk.a.c.c("Processing java crash, skip generate custom log: ".concat(String.valueOf(str)));
            return false;
        } else if (!com.uc.crashsdk.a.f.d()) {
            com.uc.crashsdk.a.c.b("DEBUG", com.uc.crashsdk.a.f.b());
            return false;
        } else if (b.d && JNIBridge.nativeIsCrashing()) {
            com.uc.crashsdk.a.c.c("Processing native crash, skip generate custom log: ".concat(String.valueOf(str)));
            return false;
        } else if (stringBuffer == null || str3 == null) {
            return false;
        } else {
            if (l(str)) {
                com.uc.crashsdk.a.c.c(String.format("Custom log '%s' has reach max count!", new Object[]{str3}));
                return false;
            }
            c(false);
            synchronized (f9885o) {
                a2 = a(stringBuffer, str, z2, z3, z4, z5, arrayList, arrayList2, arrayList3, str2);
            }
            if (a2 == null || a2.length() == 0) {
                return false;
            }
            m(a2);
            b(j(a2), str);
            if (z6) {
                try {
                    a(false);
                } catch (Throwable th) {
                    com.uc.crashsdk.a.a.a(th, false);
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r11 = java.lang.Long.parseLong(r10.group(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if ((r5 - r11) >= 86400000) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = java.lang.Integer.parseInt(r10.group(3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.uc.crashsdk.a.a.a(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r13 = com.uc.crashsdk.p.B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r13 < 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r7.replace(r10.start(), r10.end(), java.lang.String.format(java.util.Locale.US, "%s %d %d", new java.lang.Object[]{r1, java.lang.Long.valueOf(r11), java.lang.Integer.valueOf(r0 + 1)}));
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef A[SYNTHETIC, Splitter:B:51:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa A[SYNTHETIC, Splitter:B:59:0x00fa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean l(java.lang.String r17) {
        /*
            r1 = r17
            java.lang.Object r2 = p
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
            r0.<init>()     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = com.uc.crashsdk.p.N()     // Catch:{ all -> 0x0104 }
            r0.append(r3)     // Catch:{ all -> 0x0104 }
            java.lang.String r3 = "customlog"
            r0.append(r3)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0104 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0104 }
            r3.<init>(r0)     // Catch:{ all -> 0x0104 }
            r0 = 1024(0x400, float:1.435E-42)
            r4 = 1
            java.lang.String r0 = com.uc.crashsdk.a.b.a((java.io.File) r3, (int) r0, (boolean) r4)     // Catch:{ all -> 0x0104 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0104 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ all -> 0x0104 }
            r7.<init>()     // Catch:{ all -> 0x0104 }
            r8 = 2
            r9 = 0
            if (r0 == 0) goto L_0x00aa
            r7.append(r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "([^\\n\\r\\t\\s]+) (\\d+) (\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0104 }
            java.util.regex.Matcher r10 = r0.matcher(r7)     // Catch:{ all -> 0x0104 }
            r0 = 0
        L_0x0041:
            boolean r0 = r10.find(r0)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r10.group(r4)     // Catch:{ all -> 0x0104 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0056
            int r0 = r10.end()     // Catch:{ all -> 0x0104 }
            goto L_0x0041
        L_0x0056:
            java.lang.String r0 = r10.group(r8)     // Catch:{ all -> 0x0104 }
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0104 }
            long r13 = r5 - r11
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            r8 = 3
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            java.lang.String r0 = r10.group(r8)     // Catch:{ Exception -> 0x0071 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x0104 }
            goto L_0x0077
        L_0x0076:
            r11 = r5
        L_0x0077:
            r0 = 0
        L_0x0078:
            int r13 = com.uc.crashsdk.p.B()     // Catch:{ all -> 0x0104 }
            if (r13 < 0) goto L_0x0082
            if (r0 < r13) goto L_0x0082
            r13 = 1
            goto L_0x0083
        L_0x0082:
            r13 = 0
        L_0x0083:
            int r0 = r0 + r4
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ all -> 0x0104 }
            java.lang.String r15 = "%s %d %d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0104 }
            r8[r9] = r1     // Catch:{ all -> 0x0104 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0104 }
            r8[r4] = r11     // Catch:{ all -> 0x0104 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0104 }
            r11 = 2
            r8[r11] = r0     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = java.lang.String.format(r14, r15, r8)     // Catch:{ all -> 0x0104 }
            int r8 = r10.start()     // Catch:{ all -> 0x0104 }
            int r10 = r10.end()     // Catch:{ all -> 0x0104 }
            r7.replace(r8, r10, r0)     // Catch:{ all -> 0x0104 }
            r0 = 1
            goto L_0x00ac
        L_0x00aa:
            r0 = 0
            r13 = 0
        L_0x00ac:
            if (r0 != 0) goto L_0x00c4
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0104 }
            java.lang.String r8 = "%s %d 1\n"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0104 }
            r10[r9] = r1     // Catch:{ all -> 0x0104 }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0104 }
            r10[r4] = r1     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = java.lang.String.format(r0, r8, r10)     // Catch:{ all -> 0x0104 }
            r7.append(r0)     // Catch:{ all -> 0x0104 }
        L_0x00c4:
            r1 = 0
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x00e9 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x00e3, all -> 0x00df }
            int r1 = r0.length()     // Catch:{ Exception -> 0x00e3, all -> 0x00df }
            r4.write(r0, r9, r1)     // Catch:{ Exception -> 0x00e3, all -> 0x00df }
            r4.close()     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00f6
        L_0x00d9:
            r0 = move-exception
            r1 = r0
        L_0x00db:
            com.uc.crashsdk.a.a.a(r1, r9)     // Catch:{ all -> 0x0104 }
            goto L_0x00f6
        L_0x00df:
            r0 = move-exception
            r3 = r0
            r1 = r4
            goto L_0x00f8
        L_0x00e3:
            r0 = move-exception
            r1 = r4
            goto L_0x00ea
        L_0x00e6:
            r0 = move-exception
            r3 = r0
            goto L_0x00f8
        L_0x00e9:
            r0 = move-exception
        L_0x00ea:
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00f6
            r1.close()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f6
        L_0x00f3:
            r0 = move-exception
            r1 = r0
            goto L_0x00db
        L_0x00f6:
            monitor-exit(r2)     // Catch:{ all -> 0x0104 }
            return r13
        L_0x00f8:
            if (r1 == 0) goto L_0x0103
            r1.close()     // Catch:{ Exception -> 0x00fe }
            goto L_0x0103
        L_0x00fe:
            r0 = move-exception
            r1 = r0
            com.uc.crashsdk.a.a.a(r1, r9)     // Catch:{ all -> 0x0104 }
        L_0x0103:
            throw r3     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0108
        L_0x0107:
            throw r0
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.l(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r12 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r12 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.uc.crashsdk.f.b r11, java.lang.String r12) {
        /*
            boolean r0 = com.uc.crashsdk.b.d
            r1 = 45
            if (r0 == 0) goto L_0x0009
            r0 = 45
            goto L_0x000b
        L_0x0009:
            r0 = 64
        L_0x000b:
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x0014
            java.lang.String r12 = "Native not initialized, skip dump!"
            goto L_0x0072
        L_0x0014:
            int r0 = setMax
            int r0 = r0 + 103
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x002b
            java.lang.String r12 = com.uc.crashsdk.JNIBridge.nativeDumpThreads(r12)
            r0 = 11
            int r0 = r0 / r5
            if (r12 == 0) goto L_0x0070
            goto L_0x0031
        L_0x0029:
            r11 = move-exception
            throw r11
        L_0x002b:
            java.lang.String r12 = com.uc.crashsdk.JNIBridge.nativeDumpThreads(r12)
            if (r12 == 0) goto L_0x0070
        L_0x0031:
            int r0 = r12.length()
            r1 = 512(0x200, float:7.175E-43)
            if (r0 >= r1) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            if (r0 == r3) goto L_0x0070
            java.lang.String r0 = "/"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 10
            int r0 = r12.indexOf(r0)
            if (r0 >= 0) goto L_0x0070
            java.io.File r0 = new java.io.File
            r0.<init>(r12)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Can not found "
            java.lang.String r2 = r1.concat(r0)
        L_0x0063:
            int r0 = setMax
            int r0 = r0 + 91
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r4
            r10 = r2
            r2 = r12
            r12 = r10
            goto L_0x0072
        L_0x0070:
            r2 = r12
            r12 = r2
        L_0x0072:
            if (r12 == 0) goto L_0x00d9
            r0 = 5
            char[] r1 = new char[r0]     // Catch:{ all -> 0x00d1 }
            r1[r5] = r3     // Catch:{ all -> 0x00d1 }
            r1[r3] = r4     // Catch:{ all -> 0x00d1 }
            r1[r4] = r5     // Catch:{ all -> 0x00d1 }
            r2 = 3
            r1[r2] = r0     // Catch:{ all -> 0x00d1 }
            r6 = 124(0x7c, float:1.74E-43)
            r7 = 4
            r1[r7] = r6     // Catch:{ all -> 0x00d1 }
            int r8 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x00d1 }
            int r8 = r8 >> 16
            int r8 = 5 - r8
            int r9 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch:{ all -> 0x00d1 }
            int r9 = r9 >> 24
            int r9 = 68 - r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = getMax(r1, r8, r9)     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = r1.intern()     // Catch:{ all -> 0x00d1 }
            byte[] r12 = r12.getBytes(r1)     // Catch:{ all -> 0x00d1 }
            r11.write(r12)     // Catch:{ all -> 0x00d1 }
            java.lang.String r12 = "\n"
            char[] r1 = new char[r0]     // Catch:{ all -> 0x00d1 }
            r1[r5] = r3     // Catch:{ all -> 0x00d1 }
            r1[r3] = r4     // Catch:{ all -> 0x00d1 }
            r1[r4] = r5     // Catch:{ all -> 0x00d1 }
            r1[r2] = r0     // Catch:{ all -> 0x00d1 }
            r1[r7] = r6     // Catch:{ all -> 0x00d1 }
            int r2 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x00d1 }
            int r2 = r2 >> 16
            int r2 = r2 + r0
            int r0 = android.graphics.Color.argb(r5, r5, r5, r5)     // Catch:{ all -> 0x00d1 }
            int r0 = 68 - r0
            byte r0 = (byte) r0     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = getMax(r1, r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x00d1 }
            byte[] r12 = r12.getBytes(r0)     // Catch:{ all -> 0x00d1 }
            r11.write(r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r12 = move-exception
            com.uc.crashsdk.a.a.a(r12, r5)
        L_0x00d5:
            a((java.io.OutputStream) r11)
            goto L_0x00f6
        L_0x00d9:
            if (r2 == 0) goto L_0x00f6
            b((java.io.OutputStream) r11, (java.lang.String) r2)
            java.io.File r12 = new java.io.File
            r12.<init>(r2)
            boolean r0 = r12.exists()
            r1 = 81
            if (r0 == 0) goto L_0x00ee
            r0 = 81
            goto L_0x00f0
        L_0x00ee:
            r0 = 29
        L_0x00f0:
            if (r0 == r1) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            r12.delete()
        L_0x00f6:
            r11.flush()     // Catch:{ all -> 0x00fa }
            return
        L_0x00fa:
            r11 = move-exception
            com.uc.crashsdk.a.a.a(r11, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(com.uc.crashsdk.f$b, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.StringBuffer r12, java.lang.String r13, boolean r14, boolean r15, boolean r16, boolean r17, java.util.ArrayList<java.lang.String> r18, java.util.ArrayList<java.lang.String> r19, java.util.ArrayList<java.lang.String> r20, java.lang.String r21) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r0 = 5
            char[] r5 = new char[r0]
            r5 = {1, 2, 0, 5, 124} // fill-array
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + r0
            r7 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            int r0 = r0 + 68
            byte r0 = (byte) r0
            java.lang.String r0 = getMax(r5, r6, r0)
            java.lang.String r5 = r0.intern()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = com.uc.crashsdk.p.O()
            r0.append(r6)
            java.lang.String r6 = h(r13)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r8 = 0
            com.uc.crashsdk.f$b r9 = new com.uc.crashsdk.f$b     // Catch:{ all -> 0x0058 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0058 }
            r0.<init>(r6)     // Catch:{ all -> 0x0058 }
            r9.<init>(r0)     // Catch:{ all -> 0x0058 }
            java.util.ArrayList<java.lang.String> r10 = q     // Catch:{ all -> 0x0056 }
            monitor-enter(r10)     // Catch:{ all -> 0x0056 }
            s = r6     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "logb"
            a((java.lang.String) r0, (java.lang.String) r6, (int) r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r10)     // Catch:{ all -> 0x0053 }
            goto L_0x005d
        L_0x0053:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            goto L_0x005a
        L_0x0058:
            r0 = move-exception
            r9 = r8
        L_0x005a:
            com.uc.crashsdk.a.a.a(r0, r7)
        L_0x005d:
            if (r9 != 0) goto L_0x0060
            return r8
        L_0x0060:
            r10 = 1
            if (r14 == 0) goto L_0x006b
            r11 = r13
            a((java.io.OutputStream) r9, (java.lang.String) r6, (java.lang.String) r13)     // Catch:{ all -> 0x0068 }
            goto L_0x006b
        L_0x0068:
            r0 = move-exception
            goto L_0x011b
        L_0x006b:
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0083 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0083 }
            r9.write(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "\n"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ all -> 0x0083 }
            r9.write(r0)     // Catch:{ all -> 0x0083 }
            r9.flush()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x0087:
            a((java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
            if (r16 == 0) goto L_0x0098
            b((java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
            r9.flush()     // Catch:{ all -> 0x0093 }
            goto L_0x0098
        L_0x0093:
            r0 = move-exception
            r11 = r0
            com.uc.crashsdk.a.a.a(r11, r7)     // Catch:{ all -> 0x0068 }
        L_0x0098:
            if (r1 == 0) goto L_0x00a3
            int r0 = r18.size()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x00a3
            com.uc.crashsdk.a.a((java.io.OutputStream) r9, (java.lang.String) r5, (java.util.ArrayList<java.lang.String>) r1)     // Catch:{ all -> 0x0068 }
        L_0x00a3:
            if (r2 == 0) goto L_0x00b0
            int r0 = r19.size()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x00b0
            java.lang.String r0 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            com.uc.crashsdk.a.a((java.io.OutputStream) r9, (java.lang.String) r5, (java.lang.String) r0, (java.util.ArrayList<java.lang.String>) r2)     // Catch:{ all -> 0x0068 }
        L_0x00b0:
            if (r3 == 0) goto L_0x00bd
            int r0 = r20.size()     // Catch:{ all -> 0x0068 }
            if (r0 <= 0) goto L_0x00bd
            java.lang.String r0 = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"
            com.uc.crashsdk.a.b(r9, r5, r0, r3)     // Catch:{ all -> 0x0068 }
        L_0x00bd:
            if (r4 == 0) goto L_0x00e8
            r9.flush()     // Catch:{ all -> 0x00c3 }
            goto L_0x00c8
        L_0x00c3:
            r0 = move-exception
            r1 = r0
            a((java.lang.Throwable) r1, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x00c8:
            java.lang.String r0 = "threads dump:\n"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ all -> 0x00d3 }
            r9.write(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x00d7:
            g = r7     // Catch:{ all -> 0x0068 }
            u = r4     // Catch:{ all -> 0x0068 }
            a((com.uc.crashsdk.f.b) r9, (java.lang.String) r4)     // Catch:{ all -> 0x00df }
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            r1 = r0
            a((java.lang.Throwable) r1, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x00e4:
            u = r8     // Catch:{ all -> 0x0068 }
            g = r10     // Catch:{ all -> 0x0068 }
        L_0x00e8:
            if (r17 == 0) goto L_0x010f
            r9.flush()     // Catch:{ all -> 0x00ee }
            goto L_0x00f3
        L_0x00ee:
            r0 = move-exception
            r1 = r0
            a((java.lang.Throwable) r1, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x00f3:
            java.lang.String r0 = "all threads dump:\n"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ all -> 0x00fd }
            r9.write(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x0101:
            t = r10     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "all"
            a((com.uc.crashsdk.f.b) r9, (java.lang.String) r0)     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            a((java.lang.Throwable) r0, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0068 }
        L_0x010d:
            t = r7     // Catch:{ all -> 0x0068 }
        L_0x010f:
            if (r15 == 0) goto L_0x0117
            r9.a()     // Catch:{ all -> 0x0068 }
            a((com.uc.crashsdk.f.b) r9)     // Catch:{ all -> 0x0068 }
        L_0x0117:
            r9.close()     // Catch:{ all -> 0x0122 }
            goto L_0x0127
        L_0x011b:
            a((java.lang.Throwable) r0, (java.io.OutputStream) r9)     // Catch:{ all -> 0x0166 }
            r9.close()     // Catch:{ all -> 0x0122 }
            goto L_0x0127
        L_0x0122:
            r0 = move-exception
            r1 = r0
            com.uc.crashsdk.a.a.a(r1, r7)
        L_0x0127:
            java.util.ArrayList<java.lang.String> r1 = q     // Catch:{ all -> 0x0161 }
            monitor-enter(r1)     // Catch:{ all -> 0x0161 }
            int r0 = r     // Catch:{ all -> 0x015e }
            int r0 = r0 + r10
            r = r0     // Catch:{ all -> 0x015e }
            java.lang.String r0 = s     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0155
            java.util.ArrayList<java.lang.String> r0 = q     // Catch:{ all -> 0x015e }
            java.lang.String r2 = s     // Catch:{ all -> 0x015e }
            r0.add(r2)     // Catch:{ all -> 0x015e }
            java.util.ArrayList<java.lang.String> r0 = q     // Catch:{ all -> 0x015e }
            int r0 = r0.size()     // Catch:{ all -> 0x015e }
            r2 = 3
            if (r0 <= r2) goto L_0x0148
            java.util.ArrayList<java.lang.String> r0 = q     // Catch:{ all -> 0x015e }
            r0.remove(r7)     // Catch:{ all -> 0x015e }
        L_0x0148:
            java.lang.String r0 = "loge"
            java.lang.String r2 = s     // Catch:{ all -> 0x015e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015e }
            a((java.lang.String) r0, (java.lang.String) r2, (int) r7)     // Catch:{ all -> 0x015e }
            s = r8     // Catch:{ all -> 0x015e }
        L_0x0155:
            java.lang.String r0 = "logct"
            int r2 = r     // Catch:{ all -> 0x015e }
            a((java.lang.String) r0, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x015e }
            monitor-exit(r1)     // Catch:{ all -> 0x015e }
            goto L_0x0165
        L_0x015e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r7)
        L_0x0165:
            return r6
        L_0x0166:
            r0 = move-exception
            r1 = r0
            r9.close()     // Catch:{ all -> 0x016c }
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            r2 = r0
            com.uc.crashsdk.a.a.a(r2, r7)
        L_0x0171:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.StringBuffer, java.lang.String, boolean, boolean, boolean, boolean, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):java.lang.String");
    }

    public static String f() {
        String str = v;
        if (str != null && str.length() > 0) {
            return v;
        }
        synchronized (x) {
            String str2 = null;
            if (new File(b.f()).exists()) {
                String a2 = com.uc.crashsdk.a.d.a(b.f());
                if (a2 != null) {
                    a2 = a2.trim();
                    if (a2.length() != 0) {
                        if (!a2.toLowerCase().startsWith("http")) {
                            return null;
                        }
                    }
                }
                str2 = a2;
            }
            if (str2 == null) {
                str2 = w;
            }
            v = str2;
            return str2;
        }
    }

    public static void a(String str, boolean z2) {
        if (z2) {
            w = str;
            return;
        }
        v = str;
        synchronized (x) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            com.uc.crashsdk.a.d.a(b.f(), sb.toString());
        }
    }

    public static String g() {
        String a2 = a(new Date());
        try {
            int i2 = setMax + 85;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return a2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String a(Date date) {
        try {
            int i2 = setMax + 107;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            try {
                Locale locale = Locale.US;
                boolean z2 = true;
                String format = String.format(locale, "%d%02d%02d%02d%02d%02d", new Object[]{Integer.valueOf(date.getYear() + SecExceptionCode.SEC_ERROR_AVMP), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds())});
                int i4 = setMax + 31;
                getMax = i4 % 128;
                if (i4 % 2 != 0) {
                    z2 = false;
                }
                if (z2) {
                    return format;
                }
                int i5 = 11 / 0;
                return format;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public static void h() {
        int i2 = setMax + 103;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        c = System.currentTimeMillis();
        int i4 = getMax + 119;
        setMax = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m(String str) {
        try {
            if (p.p()) {
                try {
                    B();
                } catch (Throwable th) {
                    com.uc.crashsdk.a.a.a(th, false);
                }
                if ((str != null) && !"".equals(str)) {
                    try {
                        File file = new File(p.P());
                        if ((!file.exists() ? 'I' : 12) != 12) {
                            file.mkdirs();
                            int i2 = setMax + 29;
                            getMax = i2 % 128;
                            int i3 = i2 % 2;
                        }
                        com.uc.crashsdk.a.c.b("copy log to: ".concat(String.valueOf(file)));
                        com.uc.crashsdk.a.b.a(new File(str), file, new byte[1048576]);
                        int i4 = getMax + 95;
                        setMax = i4 % 128;
                        if (!(i4 % 2 != 0)) {
                            int i5 = 0 / 0;
                        }
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.a.a(th2, false);
                    }
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void b(String str, String str2) {
        int i2 = setMax + 35;
        getMax = i2 % 128;
        if ((i2 % 2 != 0 ? '#' : 24) != '#') {
            try {
                d.a(str, str2);
            } catch (Throwable th) {
                com.uc.crashsdk.a.a.a(th, false);
                return;
            }
        } else {
            d.a(str, str2);
            int i3 = 57 / 0;
        }
        int i4 = setMax + 103;
        getMax = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r3 == false) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i() {
        /*
            java.lang.String r0 = f9884a
            boolean r0 = com.uc.crashsdk.a.h.a((java.lang.String) r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r3.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = com.uc.crashsdk.p.N()     // Catch:{ all -> 0x00a5 }
            r3.append(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = "unique"
            r3.append(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a5 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00a5 }
            r4 = 1
            if (r3 == 0) goto L_0x0064
            r3 = 48
            java.lang.String r3 = com.uc.crashsdk.a.b.a((java.io.File) r2, (int) r3, (boolean) r4)     // Catch:{ all -> 0x00a5 }
            r5 = 49
            if (r3 == 0) goto L_0x003a
            r6 = 86
            goto L_0x003c
        L_0x003a:
            r6 = 49
        L_0x003c:
            if (r6 == r5) goto L_0x0065
            int r5 = r3.length()     // Catch:{ Exception -> 0x005f }
            r6 = 36
            if (r5 == r6) goto L_0x0048
            r5 = 0
            goto L_0x0049
        L_0x0048:
            r5 = 1
        L_0x0049:
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = "[^0-9a-zA-Z-]"
            java.lang.String r6 = "-"
            java.lang.String r3 = r3.replaceAll(r5, r6)     // Catch:{ Exception -> 0x005f }
            goto L_0x0065
        L_0x0054:
            int r3 = setMax
            int r3 = r3 + 115
            int r5 = r3 % 128
            getMax = r5
            int r3 = r3 % 2
            goto L_0x0064
        L_0x005f:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)     // Catch:{ all -> 0x00a3 }
            goto L_0x0065
        L_0x0064:
            r3 = r0
        L_0x0065:
            boolean r5 = com.uc.crashsdk.a.h.a((java.lang.String) r3)     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            if (r4 == 0) goto L_0x00ab
            int r4 = getMax
            int r4 = r4 + 97
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x008c
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a3 }
            boolean r4 = com.uc.crashsdk.a.h.a((java.lang.String) r3)     // Catch:{ all -> 0x00a3 }
            int r0 = r0.length     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x00ab
            r0 = r3
            goto L_0x009a
        L_0x008c:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a3 }
            boolean r3 = com.uc.crashsdk.a.h.a((java.lang.String) r0)     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x00a1
        L_0x009a:
            byte[] r3 = r0.getBytes()     // Catch:{ all -> 0x00a5 }
            com.uc.crashsdk.a.b.a((java.io.File) r2, (byte[]) r3)     // Catch:{ all -> 0x00a5 }
        L_0x00a1:
            r3 = r0
            goto L_0x00ab
        L_0x00a3:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a5:
            r2 = move-exception
            r3 = r0
            r0 = r2
        L_0x00a8:
            com.uc.crashsdk.a.a.a(r0, r1)
        L_0x00ab:
            f9884a = r3     // Catch:{ Exception -> 0x00c8 }
            int r0 = getMax
            int r0 = r0 + 59
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            r2 = 38
            if (r0 != 0) goto L_0x00be
            r0 = 38
            goto L_0x00bf
        L_0x00be:
            r0 = 3
        L_0x00bf:
            if (r0 == r2) goto L_0x00c2
            return
        L_0x00c2:
            r0 = 87
            int r0 = r0 / r1
            return
        L_0x00c6:
            r0 = move-exception
            throw r0
        L_0x00c8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.i():void");
    }

    public static String j() {
        int i2 = setMax + 9;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        String str = f9884a;
        int i4 = getMax + 81;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static void k() {
        y = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new f());
        int i2 = getMax + 103;
        setMax = i2 % 128;
        if (!(i2 % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public static void l() {
        try {
            int i2 = getMax + 53;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            Thread.setDefaultUncaughtExceptionHandler(y);
            int i4 = setMax + 93;
            getMax = i4 % 128;
            if (!(i4 % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            int i2 = getMax + 95;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            a(thread, th, false);
            int i4 = setMax + 19;
            getMax = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 76 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:330:0x03e8, code lost:
        if (y != null) goto L_0x03ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01ae A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01bc A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01cf A[Catch:{ all -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02ab A[Catch:{ all -> 0x02e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x030f A[SYNTHETIC, Splitter:B:253:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x032e A[Catch:{ all -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x032f A[Catch:{ all -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x03bf A[Catch:{ all -> 0x0386, all -> 0x03ae, all -> 0x03fd, all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x03c1 A[Catch:{ all -> 0x0386, all -> 0x03ae, all -> 0x03fd, all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x03c4 A[Catch:{ all -> 0x0386, all -> 0x03ae, all -> 0x03fd, all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x03c5 A[Catch:{ all -> 0x0386, all -> 0x03ae, all -> 0x03fd, all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x03f5 A[Catch:{ all -> 0x0386, all -> 0x03ae, all -> 0x03fd, all -> 0x03ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:346:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0098 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dc A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ea A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00ff A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r17, java.lang.Throwable r18, boolean r19) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = "Call java default handler: "
            r4 = 13
            r5 = 85
            r6 = 59
            r7 = 2
            r8 = 1
            r9 = 0
            boolean r0 = d     // Catch:{ all -> 0x0306 }
            if (r0 == 0) goto L_0x00a8
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0306 }
            r10 = 19
            if (r0 <= 0) goto L_0x001e
            r0 = 63
            goto L_0x0020
        L_0x001e:
            r0 = 19
        L_0x0020:
            if (r0 == r10) goto L_0x00a8
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0306 }
            android.os.Process.killProcess(r0)     // Catch:{ all -> 0x0306 }
            if (r19 == 0) goto L_0x003f
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x003f
            a((boolean) r9)     // Catch:{ all -> 0x0036 }
            r4 = 1
            goto L_0x0040
        L_0x0036:
            r0 = move-exception
            r4 = 1
            goto L_0x003b
        L_0x0039:
            r0 = move-exception
            r4 = 0
        L_0x003b:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x0082 }
            boolean r5 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x0082 }
            r7 = 81
            if (r5 != 0) goto L_0x004f
            r5 = 81
            goto L_0x0051
        L_0x004f:
            r5 = 58
        L_0x0051:
            if (r5 == r7) goto L_0x0054
            r8 = r0
        L_0x0054:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0082 }
            com.uc.crashsdk.a.c.b(r0)     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0074
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x0082 }
            r3 = 23
            if (r0 == 0) goto L_0x006a
            r0 = 23
            goto L_0x006c
        L_0x006a:
            r0 = 64
        L_0x006c:
            if (r0 == r3) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x0082 }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0082 }
        L_0x0074:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0086
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x0082 }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x0086:
            if (r4 != 0) goto L_0x008b
            r0 = 40
            goto L_0x008d
        L_0x008b:
            r0 = 59
        L_0x008d:
            if (r0 == r6) goto L_0x0092
            b((boolean) r9)
        L_0x0092:
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00a6 }
            if (r0 <= 0) goto L_0x00a5
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00a6 }
            android.os.Process.killProcess(r0)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r0 = move-exception
            r11 = r16
            goto L_0x0248
        L_0x00a5:
            return
        L_0x00a6:
            r0 = move-exception
            throw r0
        L_0x00a8:
            d = r8     // Catch:{ all -> 0x0306 }
            z = r2     // Catch:{ all -> 0x0306 }
            boolean r0 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x0306 }
            java.lang.String r10 = "DEBUG"
            if (r0 != 0) goto L_0x0136
            java.lang.String r0 = com.uc.crashsdk.a.f.b()     // Catch:{ all -> 0x0306 }
            com.uc.crashsdk.a.c.b(r10, r0)     // Catch:{ all -> 0x0306 }
            if (r19 == 0) goto L_0x00d1
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00d1
            a((boolean) r9)     // Catch:{ all -> 0x00c8 }
            r4 = 1
            goto L_0x00d2
        L_0x00c8:
            r0 = move-exception
            r4 = 1
            goto L_0x00cd
        L_0x00cb:
            r0 = move-exception
            r4 = 0
        L_0x00cd:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x00d2
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x0107 }
            boolean r5 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x0107 }
            if (r5 != 0) goto L_0x00dd
            r0 = 1
        L_0x00dd:
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r3.concat(r5)     // Catch:{ all -> 0x0107 }
            com.uc.crashsdk.a.c.b(r3)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00f9
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00f0
            r0 = 1
            goto L_0x00f1
        L_0x00f0:
            r0 = 0
        L_0x00f1:
            if (r0 == r8) goto L_0x00f4
            goto L_0x00f9
        L_0x00f4:
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x0107 }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x0107 }
        L_0x00f9:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x010b
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x0107 }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x010b:
            if (r4 != 0) goto L_0x011f
            int r0 = setMax
            int r0 = r0 + 91
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x011c
            b((boolean) r9)
            goto L_0x011f
        L_0x011c:
            b((boolean) r9)
        L_0x011f:
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0135
            int r0 = getMax
            int r0 = r0 + 57
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r7
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0135:
            return
        L_0x0136:
            java.lang.String r0 = "begin to generate java report"
            com.uc.crashsdk.a.c.c(r10, r0)     // Catch:{ all -> 0x0306 }
            r11 = r16
            java.util.List<java.io.FileInputStream> r0 = r11.f     // Catch:{ all -> 0x0159 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0159 }
        L_0x0143:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0159 }
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch:{ all -> 0x0159 }
            r0.close()     // Catch:{ Exception -> 0x0153 }
            goto L_0x0143
        L_0x0153:
            r0 = move-exception
            r13 = r0
            com.uc.crashsdk.a.a.a(r13, r9)     // Catch:{ all -> 0x0159 }
            goto L_0x0143
        L_0x0159:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x0304 }
        L_0x015d:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0168
            r0 = 3
            com.uc.crashsdk.k.a((int) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0171
        L_0x0168:
            r0 = 4
            com.uc.crashsdk.k.a((int) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x017e }
        L_0x0171:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x017e }
            java.lang.String r12 = com.uc.crashsdk.b.b()     // Catch:{ all -> 0x017e }
            r0.<init>(r12)     // Catch:{ all -> 0x017e }
            r0.createNewFile()     // Catch:{ all -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x0304 }
        L_0x0182:
            boolean r0 = com.uc.crashsdk.p.s()     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x0207
            java.lang.String r0 = "omit java crash"
            com.uc.crashsdk.a.c.c(r10, r0)     // Catch:{ all -> 0x0304 }
            if (r19 == 0) goto L_0x01a3
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x01a3
            a((boolean) r9)     // Catch:{ all -> 0x019a }
            r4 = 1
            goto L_0x01a4
        L_0x019a:
            r0 = move-exception
            r4 = 1
            goto L_0x019f
        L_0x019d:
            r0 = move-exception
            r4 = 0
        L_0x019f:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x01a4
        L_0x01a3:
            r4 = 0
        L_0x01a4:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x01d7 }
            boolean r5 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x01d7 }
            if (r5 != 0) goto L_0x01af
            r0 = 1
        L_0x01af:
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = r3.concat(r5)     // Catch:{ all -> 0x01d7 }
            com.uc.crashsdk.a.c.b(r3)     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01c9
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r8 = 0
        L_0x01c2:
            if (r8 == 0) goto L_0x01c9
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x01d7 }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x01d7 }
        L_0x01c9:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x01db
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x01d7 }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x01d7 }
            goto L_0x01db
        L_0x01d7:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x01db:
            if (r4 != 0) goto L_0x01e0
            b((boolean) r9)
        L_0x01e0:
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0206
            int r0 = setMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x01ff
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 90
            int r0 = r0 / r9
            goto L_0x0206
        L_0x01fc:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01ff:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0206:
            return
        L_0x0207:
            boolean r0 = r2 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = a((java.lang.Throwable) r2, (boolean) r0)     // Catch:{ all -> 0x0304 }
            java.lang.String r13 = "generate java report finished"
            com.uc.crashsdk.a.c.c(r10, r13)     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x028a
            boolean r0 = com.uc.crashsdk.p.j()     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x028a
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0304 }
            r0.<init>(r12)     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = com.uc.crashsdk.p.P()     // Catch:{ all -> 0x0304 }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x0304 }
            r13.<init>(r12)     // Catch:{ all -> 0x0304 }
            boolean r14 = r13.exists()     // Catch:{ all -> 0x0304 }
            if (r14 != 0) goto L_0x0249
            int r14 = getMax     // Catch:{ Exception -> 0x0247 }
            int r14 = r14 + 37
            int r15 = r14 % 128
            setMax = r15     // Catch:{ Exception -> 0x0247 }
            int r14 = r14 % r7
            if (r14 != 0) goto L_0x0243
            r13.mkdirs()     // Catch:{ all -> 0x0304 }
            r13 = 2
            int r13 = r13 / r9
            goto L_0x0249
        L_0x0243:
            r13.mkdirs()     // Catch:{ all -> 0x0304 }
            goto L_0x0249
        L_0x0247:
            r0 = move-exception
        L_0x0248:
            throw r0
        L_0x0249:
            java.lang.String r13 = "%s%s.hprof"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0304 }
            r14[r9] = r12     // Catch:{ all -> 0x0304 }
            r14[r8] = r0     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = java.lang.String.format(r13, r14)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = "begin dump hprof: "
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x0304 }
            com.uc.crashsdk.a.c.c(r10, r12)     // Catch:{ all -> 0x0304 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0304 }
            android.os.Debug.dumpHprofData(r0)     // Catch:{ all -> 0x026a }
            goto L_0x026f
        L_0x026a:
            r0 = move-exception
            r14 = r0
            com.uc.crashsdk.a.a.a(r14, r9)     // Catch:{ all -> 0x0304 }
        L_0x026f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r14 = "end dump hprof, use "
            r0.<init>(r14)     // Catch:{ all -> 0x0304 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0304 }
            long r14 = r14 - r12
            r0.append(r14)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = " ms"
            r0.append(r12)     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0304 }
            com.uc.crashsdk.a.c.c(r10, r0)     // Catch:{ all -> 0x0304 }
        L_0x028a:
            if (r19 == 0) goto L_0x02a0
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x02a0
            a((boolean) r9)     // Catch:{ all -> 0x0297 }
            r6 = 1
            goto L_0x02a1
        L_0x0297:
            r0 = move-exception
            r6 = 1
            goto L_0x029c
        L_0x029a:
            r0 = move-exception
            r6 = 0
        L_0x029c:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x02a1
        L_0x02a0:
            r6 = 0
        L_0x02a1:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x02e5 }
            boolean r10 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x02e5 }
            if (r10 != 0) goto L_0x02ac
            r0 = 1
        L_0x02ac:
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e5 }
            java.lang.String r3 = r3.concat(r10)     // Catch:{ all -> 0x02e5 }
            com.uc.crashsdk.a.c.b(r3)     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x02c2
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x02c2
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x02e5 }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x02e5 }
        L_0x02c2:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x02e5 }
            if (r0 == 0) goto L_0x02c9
            r8 = 0
        L_0x02c9:
            if (r8 == 0) goto L_0x02cc
            goto L_0x02db
        L_0x02cc:
            int r0 = setMax
            int r0 = r0 + r5
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x02e5 }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x02e5 }
        L_0x02db:
            int r0 = setMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            goto L_0x02e9
        L_0x02e5:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x02e9:
            if (r6 != 0) goto L_0x02ee
            b((boolean) r9)
        L_0x02ee:
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0303
            int r0 = setMax
            int r0 = r0 + r4
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0303:
            return
        L_0x0304:
            r0 = move-exception
            goto L_0x0309
        L_0x0306:
            r0 = move-exception
            r11 = r16
        L_0x0309:
            r10 = 0
            com.uc.crashsdk.a.a.a(r0, r9)     // Catch:{ all -> 0x0386 }
            if (r19 == 0) goto L_0x0323
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0323
            a((boolean) r9)     // Catch:{ all -> 0x031a }
            r4 = 1
            goto L_0x0324
        L_0x031a:
            r0 = move-exception
            r4 = 1
            goto L_0x031f
        L_0x031d:
            r0 = move-exception
            r4 = 0
        L_0x031f:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x0324
        L_0x0323:
            r4 = 0
        L_0x0324:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x036f }
            boolean r12 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x036f }
            if (r12 != 0) goto L_0x032f
            goto L_0x0330
        L_0x032f:
            r8 = r0
        L_0x0330:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x036f }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x036f }
            com.uc.crashsdk.a.c.b(r0)     // Catch:{ all -> 0x036f }
            if (r8 == 0) goto L_0x0346
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x036f }
            if (r0 == 0) goto L_0x0346
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x036f }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x036f }
        L_0x0346:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x036f }
            if (r0 == 0) goto L_0x034d
            goto L_0x034f
        L_0x034d:
            r6 = 85
        L_0x034f:
            if (r6 == r5) goto L_0x0373
            int r0 = setMax
            int r0 = r0 + 99
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x0367
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x036f }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x036f }
            super.hashCode()     // Catch:{ all -> 0x036f }
            goto L_0x0373
        L_0x0367:
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x036f }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x036f }
            goto L_0x0373
        L_0x036f:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x0373:
            if (r4 != 0) goto L_0x0378
            b((boolean) r9)
        L_0x0378:
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0385
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0385:
            return
        L_0x0386:
            r0 = move-exception
            r5 = r0
            if (r19 == 0) goto L_0x03b4
            boolean r0 = com.uc.crashsdk.p.q()     // Catch:{ all -> 0x03ae }
            r6 = 88
            if (r0 == 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r4 = 88
        L_0x0395:
            if (r4 == r6) goto L_0x03b4
            int r0 = setMax
            int r0 = r0 + 61
            int r4 = r0 % 128
            getMax = r4
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x03a6
            a((boolean) r8)     // Catch:{ all -> 0x03ae }
            goto L_0x03b4
        L_0x03a6:
            a((boolean) r9)     // Catch:{ all -> 0x03ab }
            r4 = 1
            goto L_0x03b5
        L_0x03ab:
            r0 = move-exception
            r4 = 1
            goto L_0x03b0
        L_0x03ae:
            r0 = move-exception
            r4 = 0
        L_0x03b0:
            com.uc.crashsdk.a.a.a(r0, r9)
            goto L_0x03b5
        L_0x03b4:
            r4 = 0
        L_0x03b5:
            boolean r0 = com.uc.crashsdk.p.i()     // Catch:{ all -> 0x03fd }
            boolean r6 = com.uc.crashsdk.a.f.d()     // Catch:{ all -> 0x03fd }
            if (r6 != 0) goto L_0x03c1
            r6 = 0
            goto L_0x03c2
        L_0x03c1:
            r6 = 1
        L_0x03c2:
            if (r6 == r8) goto L_0x03c5
            goto L_0x03c6
        L_0x03c5:
            r8 = r0
        L_0x03c6:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x03fd }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x03fd }
            com.uc.crashsdk.a.c.b(r0)     // Catch:{ all -> 0x03fd }
            if (r8 == 0) goto L_0x03ef
            int r0 = setMax
            int r0 = r0 + 41
            int r3 = r0 % 128
            getMax = r3
            int r0 = r0 % r7
            if (r0 == 0) goto L_0x03e6
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x03fd }
            super.hashCode()     // Catch:{ all -> 0x03fd }
            if (r0 == 0) goto L_0x03ef
            goto L_0x03ea
        L_0x03e6:
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x03fd }
            if (r0 == 0) goto L_0x03ef
        L_0x03ea:
            java.lang.Thread$UncaughtExceptionHandler r0 = y     // Catch:{ all -> 0x03fd }
            r0.uncaughtException(r1, r2)     // Catch:{ all -> 0x03fd }
        L_0x03ef:
            boolean r0 = com.uc.crashsdk.b.o()     // Catch:{ all -> 0x03fd }
            if (r0 == 0) goto L_0x0401
            android.content.Context r0 = com.uc.crashsdk.e.a()     // Catch:{ all -> 0x03fd }
            com.uc.crashsdk.r.a(r0)     // Catch:{ all -> 0x03fd }
            goto L_0x0401
        L_0x03fd:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r9)
        L_0x0401:
            if (r4 != 0) goto L_0x0406
            b((boolean) r9)
        L_0x0406:
            int r0 = android.os.Process.myPid()
            if (r0 <= 0) goto L_0x0413
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
        L_0x0413:
            goto L_0x0415
        L_0x0414:
            throw r5
        L_0x0415:
            goto L_0x0414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    public static Throwable m() {
        int i2 = setMax + 21;
        getMax = i2 % 128;
        if ((i2 % 2 != 0 ? 'P' : Typography.less) != 'P') {
            try {
                return z;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            Throwable th = z;
            Object[] objArr = null;
            int length = objArr.length;
            return th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable, java.lang.Thread$UncaughtExceptionHandler, java.lang.Object, java.lang.String, java.lang.Runnable] */
    static {
        boolean z2;
        setMax();
        if (f.class.desiredAssertionStatus()) {
            z2 = false;
        } else {
            int i2 = getMax + 123;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            int i4 = getMax + 79;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        }
        b = z2;
        ? r0 = 0;
        l = r0;
        s = r0;
        u = r0;
        v = r0;
        w = r0;
        f9884a = r0;
        y = r0;
        z = r0;
        B = r0;
        int i6 = getMax + 93;
        setMax = i6 % 128;
        if ((i6 % 2 == 0 ? 1 : 'X') == 1) {
            super.hashCode();
        }
    }

    public static void n() {
        boolean z2;
        try {
            long o2 = (long) p.o();
            if (o2 < 0) {
                try {
                    int i2 = getMax + 119;
                    setMax = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else if (b.q()) {
                if ((CrashApi.getInstance().getLastExitType() == 5 ? '_' : 'B') != 'B') {
                    int i3 = getMax + 83;
                    setMax = i3 % 128;
                    if (i3 % 2 == 0) {
                    }
                    z2 = true;
                } else {
                    int i4 = setMax + 51;
                    getMax = i4 % 128;
                    int i5 = i4 % 2;
                    z2 = false;
                }
                i.a(0, new d(1));
                if (z2) {
                    d dVar = new d(2);
                    B = dVar;
                    i.a(0, dVar, o2);
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o() {
        /*
            java.lang.Object r0 = C
            monitor-enter(r0)
            java.lang.Runnable r1 = B     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0016
            boolean r1 = A     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0016
            java.lang.Runnable r1 = B     // Catch:{ all -> 0x0019 }
            com.uc.crashsdk.a.i.a(r1)     // Catch:{ all -> 0x0019 }
            r1 = 0
            B = r1     // Catch:{ all -> 0x0019 }
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x0016:
            monitor-exit(r0)
            r0 = 0
            return r0
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.o():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC, Splitter:B:14:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            r5 = 1
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0016 }
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0016 }
            java.lang.System.load(r2)     // Catch:{ Exception -> 0x0016 }
            r2 = 1
            goto L_0x001b
        L_0x0016:
            r2 = move-exception
            com.uc.crashsdk.a.a.a(r2, r1)
        L_0x001a:
            r2 = 0
        L_0x001b:
            r3 = 69
            if (r2 != 0) goto L_0x0022
            r4 = 17
            goto L_0x0024
        L_0x0022:
            r4 = 69
        L_0x0024:
            if (r4 == r3) goto L_0x0067
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0062 }
            boolean r3 = com.uc.crashsdk.a.h.b(r0)     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = "lib"
            boolean r3 = r0.startsWith(r3)     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0067
            int r3 = getMax
            int r3 = r3 + 103
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            java.lang.String r3 = ".so"
            boolean r3 = r0.endsWith(r3)     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x0067
            int r3 = r0.length()     // Catch:{ Exception -> 0x0062 }
            r4 = 3
            int r3 = r3 - r4
            java.lang.String r0 = r0.substring(r4, r3)     // Catch:{ Exception -> 0x0062 }
            java.lang.System.loadLibrary(r0)     // Catch:{ Exception -> 0x0062 }
            int r0 = getMax
            int r0 = r0 + 89
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            goto L_0x0068
        L_0x0062:
            r5 = move-exception
            com.uc.crashsdk.a.a.a(r5, r1)
            goto L_0x0069
        L_0x0067:
            r5 = r2
        L_0x0068:
            r2 = r5
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.c(java.lang.String):boolean");
    }

    private static void B() {
        int i2;
        int i3;
        String P = p.P();
        File file = new File(P);
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 150) {
                    Arrays.sort(listFiles, new c((byte) 0));
                    int length = listFiles.length - 150;
                    if ((length < 0 ? 'L' : 'X') != 'X') {
                        try {
                            int i4 = setMax + 33;
                            try {
                                getMax = i4 % 128;
                                int i5 = i4 % 2;
                                i2 = 0;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } catch (Exception e3) {
                            throw e3;
                        }
                    } else {
                        i2 = length;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    int i6 = 0;
                    int i7 = 0;
                    i3 = 0;
                    while (true) {
                        if (i6 < listFiles.length) {
                            File file2 = listFiles[i6];
                            boolean z2 = i6 < i2;
                            if (!z2) {
                                int i8 = setMax + 105;
                                getMax = i8 % 128;
                                int i9 = i8 % 2;
                                if (currentTimeMillis - file2.lastModified() >= 432000000) {
                                    z2 = true;
                                }
                            }
                            if ((z2 ? 'X' : 21) == 21) {
                                break;
                            }
                            file2.delete();
                            i7++;
                            i3 = 0;
                            if (i3 >= 3) {
                                break;
                            }
                            i6++;
                        } else {
                            break;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Removed ");
                    sb.append(i7);
                    sb.append(" logs in ");
                    sb.append(P);
                    com.uc.crashsdk.a.c.a(sb.toString());
                }
            } catch (Exception e4) {
                i3++;
                com.uc.crashsdk.a.a.a(e4, false);
            } catch (Throwable th) {
                com.uc.crashsdk.a.a.a(th, false);
            }
        }
    }

    public static void p() {
        int i2 = getMax + 1;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if (!p.p()) {
            int i4 = getMax + 17;
            setMax = i4 % 128;
            if ((i4 % 2 == 0 ? 30 : 'N') != 'N') {
                Object obj = null;
                super.hashCode();
                return;
            }
            return;
        }
        try {
            i.a(0, new d(3), 10000);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (stackTraceElementArr != null) {
            int i3 = setMax + 67;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            if (stackTraceElementArr.length > 0) {
                int i5 = getMax + 105;
                setMax = i5 % 128;
                int i6 = i5 % 2;
                boolean z2 = str == null;
                int length = stackTraceElementArr.length;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if ((i7 < length ? 'V' : '?') == '?') {
                        i2 = i8;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i7];
                    i8++;
                    sb.append("  at ");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                    if (!z2) {
                        int i9 = getMax + 53;
                        setMax = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 10 / 0;
                            if (!(stackTraceElement.getMethodName().indexOf(str) >= 0)) {
                            }
                        } else {
                            if ((stackTraceElement.getMethodName().indexOf(str) >= 0 ? 'X' : 'P') == 'P') {
                            }
                        }
                        try {
                            sb.delete(0, sb.length());
                            z2 = true;
                            i8 = 0;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    i7++;
                }
            }
        }
        if ((i2 == 0 ? 'U' : '@') == 'U') {
            sb.append("  (no java stack)\n");
        }
        int i11 = getMax + 79;
        setMax = i11 % 128;
        int i12 = i11 % 2;
        return sb;
    }

    public static StringBuilder d(String str) {
        int i2 = getMax + 93;
        setMax = i2 % 128;
        if ((i2 % 2 == 0 ? '!' : 18) != '!') {
            return a(Thread.currentThread().getStackTrace(), str);
        }
        StringBuilder a2 = a(Thread.currentThread().getStackTrace(), str);
        Object obj = null;
        super.hashCode();
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r13 << 3) != 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ((r13 % 2) != 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(char[] r12, int r13, byte r14) {
        /*
            int r0 = getMax
            int r0 = r0 + 83
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0019
            char[] r0 = getMin     // Catch:{ Exception -> 0x0017 }
            char r1 = setMin     // Catch:{ Exception -> 0x0017 }
            char[] r2 = new char[r13]     // Catch:{ Exception -> 0x0017 }
            int r3 = r13 << 3
            if (r3 == 0) goto L_0x0035
            goto L_0x0023
        L_0x0017:
            r12 = move-exception
            throw r12
        L_0x0019:
            char[] r0 = getMin
            char r1 = setMin
            char[] r2 = new char[r13]
            int r3 = r13 % 2
            if (r3 == 0) goto L_0x0035
        L_0x0023:
            int r3 = setMax
            int r3 = r3 + 121
            int r4 = r3 % 128
            getMax = r4
            int r3 = r3 % 2
            int r13 = r13 + -1
            char r3 = r12[r13]
            int r3 = r3 - r14
            char r3 = (char) r3
            r2[r13] = r3
        L_0x0035:
            r3 = 0
            r4 = 1
            if (r13 <= r4) goto L_0x003b
            r5 = 0
            goto L_0x003c
        L_0x003b:
            r5 = 1
        L_0x003c:
            if (r5 == r4) goto L_0x00c5
            int r5 = getMax
            int r5 = r5 + 107
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r5 = 0
        L_0x0049:
            r6 = 86
            if (r5 >= r13) goto L_0x0050
            r7 = 86
            goto L_0x0052
        L_0x0050:
            r7 = 94
        L_0x0052:
            if (r7 == r6) goto L_0x0056
            goto L_0x00c5
        L_0x0056:
            char r6 = r12[r5]
            int r7 = r5 + 1
            char r8 = r12[r7]
            if (r6 != r8) goto L_0x0067
            int r6 = r6 - r14
            char r6 = (char) r6
            r2[r5] = r6
            int r8 = r8 - r14
            char r6 = (char) r8
            r2[r7] = r6
            goto L_0x00c2
        L_0x0067:
            int r9 = o.onActivityPreStopped.setMin(r6, r1)
            int r6 = o.onActivityPreStopped.length(r6, r1)
            int r10 = o.onActivityPreStopped.setMin(r8, r1)
            int r8 = o.onActivityPreStopped.length(r8, r1)
            if (r6 != r8) goto L_0x0092
            int r9 = o.onActivityPreStopped.setMax(r9, r1)
            int r10 = o.onActivityPreStopped.setMax(r10, r1)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            char r6 = r0[r8]
            r2[r7] = r6
            goto L_0x00c2
        L_0x0092:
            if (r9 != r10) goto L_0x0096
            r11 = 1
            goto L_0x0097
        L_0x0096:
            r11 = 0
        L_0x0097:
            if (r11 == 0) goto L_0x00b2
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            char r6 = r0[r8]
            r2[r7] = r6
            goto L_0x00c2
        L_0x00b2:
            int r8 = o.onActivityPreStopped.getMax(r9, r8, r1)
            int r6 = o.onActivityPreStopped.getMax(r10, r6, r1)
            char r8 = r0[r8]
            r2[r5] = r8
            char r6 = r0[r6]
            r2[r7] = r6
        L_0x00c2:
            int r5 = r5 + 2
            goto L_0x0049
        L_0x00c5:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.getMax(char[], int, byte):java.lang.String");
    }
}
