package o;

import android.telephony.PhoneNumberUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.text.Typography;
import o.Draft_75;

public final class initCloseCode {
    private static final printConnMonitorLog FastBitmap$CoordinateSystem = printConnMonitorLog.decodeHex("0000ffff");
    private static final Method Grayscale$Algorithm;
    public static final TimeZone IsOverlapping = TimeZone.getTimeZone("GMT");
    private static final Charset Mean$Arithmetic = Charset.forName("UTF-32BE");
    private static int create = 0;
    private static final printConnMonitorLog equals = printConnMonitorLog.decodeHex("feff");
    private static int getCause = 1;
    public static final NotSendableException getMax;
    public static final String[] getMin = new String[0];
    private static final printConnMonitorLog hashCode = printConnMonitorLog.decodeHex("fffe");
    private static final Pattern invoke = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    private static final Charset invokeSuspend = Charset.forName("UTF-32LE");
    public static final Comparator<String> isInside = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };
    public static final byte[] length;
    public static final Charset setMax = Charset.forName(setMin(265 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, new char[]{65524, 17, 16, 2, 65513}, !PhoneNumberUtils.isReallyDialable('0'), View.resolveSizeAndState(0, 0, 0) + 5).intern());
    public static final getPart setMin = getPart.length(length);
    private static final printConnMonitorLog toDoubleRange = printConnMonitorLog.decodeHex("ffff0000");
    public static final Charset toFloatRange = Charset.forName("ISO-8859-1");
    private static final printConnMonitorLog toIntRange = printConnMonitorLog.decodeHex("efbbbf");
    private static final Charset toString = Charset.forName("UTF-16BE");
    private static int valueOf;
    private static final Charset values = Charset.forName("UTF-16LE");

    static void length() {
        valueOf = 197;
    }

    public static void getMin(Throwable th, Throwable th2) {
        int i = getCause + 59;
        create = i % 128;
        if ((i % 2 != 0 ? ' ' : 15) != ' ') {
            try {
                if (Grayscale$Algorithm == null) {
                    return;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            Method method = Grayscale$Algorithm;
            Object[] objArr = null;
            int length2 = objArr.length;
            if (method == null) {
                return;
            }
        }
        int i2 = create + 95;
        getCause = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                Method method2 = Grayscale$Algorithm;
                Object[] objArr2 = new Object[0];
                objArr2[1] = th2;
                method2.invoke(th, objArr2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            Grayscale$Algorithm.invoke(th, new Object[]{th2});
        }
    }

    static {
        Method method;
        length();
        byte[] bArr = new byte[0];
        length = bArr;
        getMax = NotSendableException.getMin(bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
            int i = create + 47;
            getCause = i % 128;
            int i2 = i % 2;
        } catch (Exception unused) {
            method = null;
        }
        Grayscale$Algorithm = method;
        int i3 = getCause + 115;
        create = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (1 <= r6) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((0 <= r6 ? 7 : '.') == 7) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMin(long r6, long r8) {
        /*
            int r0 = create
            int r0 = r0 + 29
            int r1 = r0 % 128
            getCause = r1
            int r0 = r0 % 2
            r0 = 0
            long r2 = r8 | r0
            r4 = 1
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0015
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            if (r2 == r4) goto L_0x0050
            int r2 = getCause     // Catch:{ Exception -> 0x004e }
            int r2 = r2 + 3
            int r3 = r2 % 128
            create = r3     // Catch:{ Exception -> 0x004e }
            int r2 = r2 % 2
            r3 = 1
            if (r2 == 0) goto L_0x002b
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            goto L_0x0036
        L_0x002b:
            r2 = 7
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0032
            r5 = 7
            goto L_0x0034
        L_0x0032:
            r5 = 46
        L_0x0034:
            if (r5 != r2) goto L_0x0050
        L_0x0036:
            int r2 = create
            int r2 = r2 + 113
            int r5 = r2 % 128
            getCause = r5
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0048
            long r6 = r6 / r3
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            goto L_0x004d
        L_0x0048:
            long r6 = r6 - r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
        L_0x004d:
            return
        L_0x004e:
            r6 = move-exception
            throw r6
        L_0x0050:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.setMin(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if ((r4 != r5) != true) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4 != r5) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean setMin(java.lang.Object r4, java.lang.Object r5) {
        /*
            int r0 = create     // Catch:{ Exception -> 0x005b }
            int r0 = r0 + 57
            int r1 = r0 % 128
            getCause = r1     // Catch:{ Exception -> 0x005b }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001b
            if (r4 == r5) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == r2) goto L_0x0020
            goto L_0x0058
        L_0x001b:
            r0 = 61
            int r0 = r0 / r1
            if (r4 == r5) goto L_0x0058
        L_0x0020:
            r0 = 50
            if (r4 == 0) goto L_0x0027
            r3 = 54
            goto L_0x0029
        L_0x0027:
            r3 = 50
        L_0x0029:
            if (r3 == r0) goto L_0x0057
            int r0 = getCause     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 + 31
            int r3 = r0 % 128
            create = r3     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0049
            boolean r4 = r4.equals(r5)
            r5 = 0
            super.hashCode()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0047:
            r4 = move-exception
            throw r4
        L_0x0049:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = 1
        L_0x0052:
            if (r4 == 0) goto L_0x0058
            goto L_0x0057
        L_0x0055:
            r4 = move-exception
            throw r4
        L_0x0057:
            return r1
        L_0x0058:
            return r2
        L_0x0059:
            r4 = move-exception
            throw r4
        L_0x005b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.setMin(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((r3 != null ? 'C' : 'T') != 'C') goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if ((r3 == null) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getMin(java.io.Closeable r3) {
        /*
            int r0 = create     // Catch:{ Exception -> 0x0047 }
            r1 = 67
            int r0 = r0 + r1
            int r2 = r0 % 128
            getCause = r2     // Catch:{ Exception -> 0x0047 }
            int r0 = r0 % 2
            r2 = 60
            if (r0 != 0) goto L_0x0012
            r0 = 60
            goto L_0x0014
        L_0x0012:
            r0 = 59
        L_0x0014:
            if (r0 == r2) goto L_0x0020
            if (r3 == 0) goto L_0x001b
            r0 = 67
            goto L_0x001d
        L_0x001b:
            r0 = 84
        L_0x001d:
            if (r0 == r1) goto L_0x002a
            goto L_0x0038
        L_0x0020:
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x002a
            goto L_0x0038
        L_0x002a:
            r3.close()     // Catch:{ RuntimeException -> 0x0043, Exception -> 0x0038 }
            int r3 = create
            int r3 = r3 + 19
            int r0 = r3 % 128
            getCause = r0
            int r3 = r3 % 2
            return
        L_0x0038:
            int r3 = getCause
            int r3 = r3 + 61
            int r0 = r3 % 128
            create = r0
            int r3 = r3 % 2
            return
        L_0x0043:
            r3 = move-exception
            throw r3
        L_0x0045:
            r3 = move-exception
            throw r3
        L_0x0047:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.getMin(java.io.Closeable):void");
    }

    public static void getMax(Socket socket) {
        int i = getCause + 91;
        create = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (!(socket == null)) {
            try {
                int i3 = getCause + 79;
                try {
                    create = i3 % 128;
                    if (i3 % 2 != 0) {
                        z = true;
                    }
                    if (!z) {
                        try {
                            socket.close();
                        } catch (AssertionError e) {
                            if (!getMax(e)) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused) {
                        }
                    } else {
                        socket.close();
                        Object obj = null;
                        super.hashCode();
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                throw e4;
            }
        }
    }

    public static boolean setMin(recordWsHsTime recordwshstime, TimeUnit timeUnit) {
        boolean z;
        int i = create + 99;
        getCause = i % 128;
        if (!(i % 2 == 0)) {
            try {
                z = setMin(recordwshstime, 100, timeUnit);
            } catch (IOException unused) {
                return false;
            }
        } else {
            z = setMin(recordwshstime, 24, timeUnit);
        }
        int i2 = getCause + 119;
        create = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public static boolean setMin(recordWsHsTime recordwshstime, int i, TimeUnit timeUnit) throws IOException {
        long j;
        long nanoTime = System.nanoTime();
        if ((recordwshstime.getMin().E_() ? 19 : 'N') != 'N') {
            int i2 = create + 73;
            getCause = i2 % 128;
            int i3 = i2 % 2;
            j = recordwshstime.getMin().F_() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        recordwshstime.getMin().setMax(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            submitLazy submitlazy = new submitLazy();
            while (true) {
                if ((recordwshstime.a_(submitlazy, 8192) != -1 ? '?' : '8') == '8') {
                    break;
                }
                submitlazy.isInside(submitlazy.setMax);
            }
            if (j == Long.MAX_VALUE) {
                recordwshstime.getMin().H_();
                return true;
            }
            try {
                recordwshstime.getMin().setMax(nanoTime + j);
                int i4 = getCause + 11;
                create = i4 % 128;
                int i5 = i4 % 2;
                return true;
            } catch (Exception e) {
                throw e;
            }
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                recordwshstime.getMin().H_();
                return false;
            }
            recordwshstime.getMin().setMax(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                recordwshstime.getMin().H_();
            } else {
                recordwshstime.getMin().setMax(nanoTime + j);
            }
            throw th;
        }
    }

    public static <T> List<T> setMin(List<T> list) {
        try {
            List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            int i = getCause + 73;
            create = i % 128;
            if (!(i % 2 != 0)) {
                return unmodifiableList;
            }
            int i2 = 49 / 0;
            return unmodifiableList;
        } catch (Exception e) {
            throw e;
        }
    }

    public static <K, V> Map<K, V> setMin(Map<K, V> map) {
        if ((map.isEmpty() ? 1 : '?') != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        int i = getCause + 63;
        create = i % 128;
        int i2 = i % 2;
        Map<K, V> emptyMap = Collections.emptyMap();
        int i3 = create + 89;
        getCause = i3 % 128;
        int i4 = i3 % 2;
        return emptyMap;
    }

    public static <T> List<T> setMin(T... tArr) {
        int i = getCause + 101;
        create = i % 128;
        if (i % 2 == 0) {
            try {
                return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
            } catch (Exception e) {
                throw e;
            }
        } else {
            List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
            Object[] objArr = null;
            int length2 = objArr.length;
            return unmodifiableList;
        }
    }

    public static ThreadFactory getMax(final String str, final boolean z) {
        AnonymousClass1 r0 = new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
        try {
            int i = getCause + 39;
            create = i % 128;
            int i2 = i % 2;
            return r0;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r0.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = create + 103;
        getCause = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getMin(java.util.Comparator<? super java.lang.String> r10, java.lang.String[] r11, java.lang.String[] r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x005c
            r4 = r11[r3]
            int r5 = r12.length
            int r6 = create
            int r6 = r6 + 29
            int r7 = r6 % 128
            getCause = r7
            int r6 = r6 % 2
            r6 = 0
        L_0x0018:
            if (r6 >= r5) goto L_0x0059
            int r7 = create
            int r7 = r7 + 69
            int r8 = r7 % 128
            getCause = r8
            int r7 = r7 % 2
            r8 = 1
            if (r7 != 0) goto L_0x0029
            r7 = 1
            goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            if (r7 == r8) goto L_0x0035
            r7 = r12[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0035:
            r7 = r12[r6]
            int r7 = r10.compare(r4, r7)     // Catch:{ Exception -> 0x0057 }
            r9 = 0
            int r9 = r9.length     // Catch:{ all -> 0x0055 }
            if (r7 != 0) goto L_0x0040
            r8 = 0
        L_0x0040:
            if (r8 == 0) goto L_0x0045
        L_0x0042:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0045:
            r0.add(r4)
            int r4 = create     // Catch:{ Exception -> 0x0053 }
            int r4 = r4 + 103
            int r5 = r4 % 128
            getCause = r5     // Catch:{ Exception -> 0x0053 }
            int r4 = r4 % 2
            goto L_0x0059
        L_0x0053:
            r10 = move-exception
            throw r10
        L_0x0055:
            r10 = move-exception
            throw r10
        L_0x0057:
            r10 = move-exception
            throw r10
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x005c:
            int r10 = r0.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r10 = r0.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.getMin(java.util.Comparator, java.lang.String[], java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((r1 == 0 ? 20 : 'G') != 'G') goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r11.length == 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean setMin(java.util.Comparator<java.lang.String> r9, java.lang.String[] r10, java.lang.String[] r11) {
        /*
            int r0 = create
            int r0 = r0 + 91
            int r1 = r0 % 128
            getCause = r1
            int r0 = r0 % 2
            r0 = 0
            if (r10 == 0) goto L_0x007c
            int r1 = getCause
            int r1 = r1 + 27
            int r2 = r1 % 128
            create = r2
            int r1 = r1 % 2
            if (r11 == 0) goto L_0x007c
            int r1 = r10.length
            if (r1 == 0) goto L_0x007c
            int r1 = getCause
            int r1 = r1 + 73
            int r2 = r1 % 128
            create = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0039
            int r1 = r11.length
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x0037 }
            r2 = 71
            if (r1 != 0) goto L_0x0032
            r1 = 20
            goto L_0x0034
        L_0x0032:
            r1 = 71
        L_0x0034:
            if (r1 == r2) goto L_0x003d
            goto L_0x007c
        L_0x0037:
            r9 = move-exception
            throw r9
        L_0x0039:
            int r1 = r11.length
            if (r1 != 0) goto L_0x003d
            goto L_0x007c
        L_0x003d:
            int r1 = r10.length
            r2 = 0
        L_0x003f:
            r3 = 1
            if (r2 >= r1) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == r3) goto L_0x0048
            return r0
        L_0x0048:
            int r4 = create
            int r4 = r4 + 67
            int r5 = r4 % 128
            getCause = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0059
            r4 = r10[r2]
            int r5 = r11.length
            r6 = 1
            goto L_0x005d
        L_0x0059:
            r4 = r10[r2]
            int r5 = r11.length
            r6 = 0
        L_0x005d:
            if (r6 >= r5) goto L_0x0061
            r7 = 1
            goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            if (r7 == 0) goto L_0x0079
            r7 = r11[r6]
            int r7 = r9.compare(r4, r7)
            r8 = 54
            if (r7 != 0) goto L_0x0071
            r7 = 54
            goto L_0x0073
        L_0x0071:
            r7 = 26
        L_0x0073:
            if (r7 == r8) goto L_0x0078
            int r6 = r6 + 1
            goto L_0x005d
        L_0x0078:
            return r3
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.setMin(java.util.Comparator, java.lang.String[], java.lang.String[]):boolean");
    }

    public static boolean getMax(AssertionError assertionError) {
        if ((assertionError.getCause() != null ? 15 : '%') != '%') {
            int i = create + 29;
            getCause = i % 128;
            int i2 = i % 2;
            if (assertionError.getMessage() != null) {
                try {
                    try {
                        if (assertionError.getMessage().contains("getsockname failed")) {
                            int i3 = create + 99;
                            getCause = i3 % 128;
                            return (i3 % 2 == 0 ? 12 : '/') != 12;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return false;
    }

    public static int getMin(Comparator<String> comparator, String[] strArr, String str) {
        int i = 0;
        int length2 = strArr.length;
        try {
            int i2 = getCause + 123;
            create = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if ((i < length2 ? ')' : 14) == 14) {
                    return -1;
                }
                int i4 = getCause + 67;
                create = i4 % 128;
                int i5 = i4 % 2;
                if (comparator.compare(strArr[i], str) == 0) {
                    return i;
                }
                i++;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static String[] getMin(String[] strArr, String str) {
        int i = getCause + 77;
        create = i % 128;
        if (!(i % 2 != 0)) {
            int length2 = strArr.length + 1;
            String[] strArr2 = new String[length2];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length2 - 1] = str;
            return strArr2;
        }
        int length3 = strArr.length + 1;
        String[] strArr3 = new String[length3];
        System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
        strArr3[length3 + 1] = str;
        return strArr3;
    }

    public static int length(String str, int i, int i2) {
        while (true) {
            if ((i < i2 ? '#' : 31) != '#') {
                return i2;
            }
            int i3 = create + 17;
            getCause = i3 % 128;
            int i4 = i3 % 2;
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            int i5 = getCause + 71;
            create = i5 % 128;
            int i6 = i5 % 2;
            i++;
        }
    }

    public static int getMin(String str, int i, int i2) {
        while (true) {
            i2--;
            if ((i2 >= i ? '1' : Typography.dollar) == '$') {
                return i;
            }
            int i3 = create + 55;
            getCause = i3 % 128;
            int i4 = i3 % 2;
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2 + 1;
            }
            int i5 = create + 47;
            getCause = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getCause + 47;
            create = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static String getMax(String str, int i, int i2) {
        int i3 = getCause + 75;
        create = i3 % 128;
        int i4 = i3 % 2;
        int length2 = length(str, i, i2);
        String substring = str.substring(length2, getMin(str, length2, i2));
        int i5 = create + 21;
        getCause = i5 % 128;
        if ((i5 % 2 == 0 ? 'W' : Typography.less) == '<') {
            return substring;
        }
        Object[] objArr = null;
        int length3 = objArr.length;
        return substring;
    }

    public static int length(String str, int i, int i2, String str2) {
        while (true) {
            if (!(i < i2)) {
                int i3 = getCause + 23;
                create = i3 % 128;
                int i4 = i3 % 2;
                return i2;
            }
            if ((str2.indexOf(str.charAt(i)) != -1 ? '6' : '.') != '.') {
                int i5 = getCause + 67;
                create = i5 % 128;
                int i6 = i5 % 2;
                return i;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r3 == true) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = 24 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = getCause + 47;
        create = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((r3 % 2) == 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMax(java.lang.String r3, int r4, int r5, char r6) {
        /*
        L_0x0000:
            r0 = 0
            r1 = 1
            if (r4 >= r5) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            if (r2 == r1) goto L_0x0023
            int r3 = getCause     // Catch:{ Exception -> 0x0021 }
            int r3 = r3 + 47
            int r4 = r3 % 128
            create = r4     // Catch:{ Exception -> 0x0021 }
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0017
            r3 = 0
            goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            if (r3 == r1) goto L_0x0020
            r3 = 24
            int r3 = r3 / r0
            return r5
        L_0x001e:
            r3 = move-exception
            throw r3
        L_0x0020:
            return r5
        L_0x0021:
            r3 = move-exception
            goto L_0x0041
        L_0x0023:
            int r0 = getCause
            int r0 = r0 + 77
            int r1 = r0 % 128
            create = r1
            int r0 = r0 % 2
            char r0 = r3.charAt(r4)     // Catch:{ Exception -> 0x0021 }
            if (r0 != r6) goto L_0x003e
            int r3 = create
            int r3 = r3 + 47
            int r5 = r3 % 128
            getCause = r5
            int r3 = r3 % 2
            return r4
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x0000
        L_0x0041:
            goto L_0x0043
        L_0x0042:
            throw r3
        L_0x0043:
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.getMax(java.lang.String, int, int, char):int");
    }

    public static String getMin(String str) {
        InetAddress inetAddress;
        int i;
        int i2;
        String str2 = null;
        if (str.contains(":")) {
            int i3 = 0;
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = setMax(str, 0, str.length());
            } else {
                int i4 = create + 11;
                getCause = i4 % 128;
                int i5 = i4 % 2;
                inetAddress = setMax(str, 1, str.length() - 1);
            }
            if ((inetAddress == null ? '+' : 'R') == '+') {
                return str2;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i6 = getCause + 1;
                create = i6 % 128;
                int i7 = -1;
                if (i6 % 2 != 0) {
                    i = 1;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                while (i < address.length) {
                    int i8 = i;
                    while (i8 < 16) {
                        if (address[i8] != 0) {
                            break;
                        }
                        if ((address[i8 + 1] == 0 ? 5 : JSONLexer.EOI) != 5) {
                            break;
                        }
                        int i9 = getCause + 107;
                        create = i9 % 128;
                        int i10 = i9 % 2;
                        i8 += 2;
                    }
                    int i11 = i8 - i;
                    if (!(i11 <= i2) && i11 >= 4) {
                        i7 = i;
                        i2 = i11;
                    }
                    i = i8 + 2;
                }
                submitLazy submitlazy = new submitLazy();
                while (i3 < address.length) {
                    int i12 = create + 87;
                    getCause = i12 % 128;
                    int i13 = i12 % 2;
                    if (i3 == i7) {
                        submitlazy.equals(58);
                        i3 += i2;
                        if (i3 == 16) {
                            submitlazy.equals(58);
                            int i14 = create + 101;
                            getCause = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    } else {
                        if (i3 > 0) {
                            int i16 = create + 111;
                            getCause = i16 % 128;
                            if (i16 % 2 == 0) {
                                submitlazy.equals(48);
                            } else {
                                submitlazy.equals(58);
                            }
                        }
                        try {
                            submitlazy.hashCode((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                            i3 += 2;
                            int i17 = getCause + 37;
                            create = i17 % 128;
                            int i18 = i17 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
                return submitlazy.invokeSuspend();
            }
            StringBuilder sb = new StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return str2;
            }
            if (!setMin(lowerCase)) {
                return lowerCase;
            }
            int i19 = create + 59;
            try {
                getCause = i19 % 128;
                if (i19 % 2 != 0) {
                    return str2;
                }
                super.hashCode();
                return str2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (IllegalArgumentException unused) {
            return str2;
        }
    }

    private static boolean setMin(String str) {
        int i = getCause + 107;
        create = i % 128;
        int i2 = i % 2;
        int i3 = create + 43;
        getCause = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (charAt > 31) {
                int i6 = create + 55;
                getCause = i6 % 128;
                int i7 = i6 % 2;
                if ((charAt >= 127 ? '.' : 7) != '.') {
                    try {
                        if ((" #%/:?@[\\]".indexOf(charAt) != -1 ? 'S' : '\\') != '\\') {
                            int i8 = getCause + 13;
                            create = i8 % 128;
                            int i9 = i8 % 2;
                            return true;
                        }
                        i5++;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static int length(String str) {
        try {
            int i = getCause + 123;
            create = i % 128;
            int i2 = i % 2;
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length2) {
                int i4 = getCause + 83;
                create = i4 % 128;
                int i5 = i4 % 2;
                char charAt = str.charAt(i3);
                if (!(charAt <= 31)) {
                    if ((charAt >= 127 ? 'G' : 4) == 4) {
                        i3++;
                        int i6 = getCause + 49;
                        create = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
                return i3;
            }
            return -1;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean setMax(String str) {
        int i = getCause + 15;
        create = i % 128;
        if ((i % 2 != 0 ? 19 : 'T') == 'T') {
            return invoke.matcher(str).matches();
        }
        try {
            int i2 = 6 / 0;
            return invoke.matcher(str).matches();
        } catch (Exception e) {
            throw e;
        }
    }

    public static String length(String str, Object... objArr) {
        String str2;
        int i = getCause + 41;
        create = i % 128;
        if ((i % 2 != 0 ? 2 : JSONLexer.EOI) != 2) {
            str2 = String.format(Locale.US, str, objArr);
        } else {
            str2 = String.format(Locale.US, str, objArr);
            int i2 = 71 / 0;
        }
        int i3 = getCause + 101;
        create = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    public static Charset getMax(schedule schedule, Charset charset) throws IOException {
        int i = getCause + 101;
        create = i % 128;
        int i2 = i % 2;
        if (schedule.setMax(toIntRange)) {
            try {
                try {
                    schedule.isInside((long) toIntRange.size());
                    return setMax;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            if ((schedule.setMax(equals) ? 'C' : '4') != 'C') {
                if ((schedule.setMax(hashCode) ? 27 : '^') != '^') {
                    int i3 = getCause + 25;
                    create = i3 % 128;
                    int i4 = i3 % 2;
                    schedule.isInside((long) hashCode.size());
                    return values;
                }
                if ((schedule.setMax(FastBitmap$CoordinateSystem) ? (char) 24 : 20) == 24) {
                    schedule.isInside((long) FastBitmap$CoordinateSystem.size());
                    return Mean$Arithmetic;
                } else if (!schedule.setMax(toDoubleRange)) {
                    return charset;
                } else {
                    schedule.isInside((long) toDoubleRange.size());
                    return invokeSuspend;
                }
            } else {
                schedule.isInside((long) equals.size());
                return toString;
            }
        }
    }

    public static int getMax(String str, long j, TimeUnit timeUnit) {
        int i = create + 117;
        getCause = i % 128;
        if ((i % 2 == 0 ? 'F' : '_') == '_' ? j < 0 : j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (!(millis != 0)) {
                    int i2 = create + 87;
                    getCause = i2 % 128;
                    if ((i2 % 2 == 0 ? Typography.greater : 19) == '>' ? j > 1 : j > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" too small.");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                return (int) millis;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" too large.");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.AssertionError length(java.lang.String r1, java.lang.Exception r2) {
        /*
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            r0.initCause(r2)     // Catch:{ IllegalStateException -> 0x0008 }
        L_0x0008:
            int r1 = create     // Catch:{ Exception -> 0x0015 }
            int r1 = r1 + 53
            int r2 = r1 % 128
            getCause = r2     // Catch:{ Exception -> 0x0013 }
            int r1 = r1 % 2
            return r0
        L_0x0013:
            r1 = move-exception
            throw r1
        L_0x0015:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.length(java.lang.String, java.lang.Exception):java.lang.AssertionError");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3 <= 'f') goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int length(char r3) {
        /*
            r0 = 41
            r1 = 48
            if (r3 < r1) goto L_0x0009
            r2 = 41
            goto L_0x000b
        L_0x0009:
            r2 = 58
        L_0x000b:
            if (r2 == r0) goto L_0x000e
            goto L_0x0036
        L_0x000e:
            int r0 = getCause
            int r0 = r0 + 23
            int r2 = r0 % 128
            create = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001f
            r0 = 50
            if (r3 > r0) goto L_0x0036
            goto L_0x0023
        L_0x001f:
            r0 = 57
            if (r3 > r0) goto L_0x0036
        L_0x0023:
            int r0 = getCause     // Catch:{ Exception -> 0x0034 }
            int r0 = r0 + 63
            int r2 = r0 % 128
            create = r2     // Catch:{ Exception -> 0x0034 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0032
            int r3 = r3 >>> 106
            goto L_0x0033
        L_0x0032:
            int r3 = r3 - r1
        L_0x0033:
            return r3
        L_0x0034:
            r3 = move-exception
            throw r3
        L_0x0036:
            r0 = 97
            if (r3 < r0) goto L_0x004c
            int r1 = create
            int r1 = r1 + 17
            int r2 = r1 % 128
            getCause = r2
            int r1 = r1 % 2
            r1 = 102(0x66, float:1.43E-43)
            if (r3 > r1) goto L_0x004c
        L_0x0048:
            int r3 = r3 - r0
            int r3 = r3 + 10
            return r3
        L_0x004c:
            r0 = 65
            if (r3 < r0) goto L_0x005a
            r1 = 70
            r2 = 1
            if (r3 > r1) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 == r2) goto L_0x0048
        L_0x005a:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.length(char):int");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.net.InetAddress] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bb, code lost:
        return r11;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress setMax(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            int r4 = getCause     // Catch:{ Exception -> 0x0108 }
            int r4 = r4 + 43
            int r5 = r4 % 128
            create = r5     // Catch:{ Exception -> 0x0108 }
            r5 = 2
            int r4 = r4 % r5
            r4 = -1
            r6 = 0
            r7 = r17
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x0019:
            r11 = 0
            r12 = 1
            if (r7 >= r1) goto L_0x00d6
            if (r8 != r2) goto L_0x0020
            return r11
        L_0x0020:
            int r13 = r7 + 2
            if (r13 > r1) goto L_0x0045
            java.lang.String r14 = "::"
            boolean r14 = r0.regionMatches(r7, r14, r6, r5)
            if (r14 == 0) goto L_0x0045
            int r7 = getCause     // Catch:{ Exception -> 0x0108 }
            int r7 = r7 + 5
            int r10 = r7 % 128
            create = r10     // Catch:{ Exception -> 0x0042 }
            int r7 = r7 % 2
            if (r9 == r4) goto L_0x0039
            return r11
        L_0x0039:
            int r8 = r8 + 2
            r9 = r8
            if (r13 != r1) goto L_0x0040
            goto L_0x00d6
        L_0x0040:
            r10 = r13
            goto L_0x007f
        L_0x0042:
            r0 = move-exception
            goto L_0x00d5
        L_0x0045:
            if (r8 == 0) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r13 == 0) goto L_0x007e
            java.lang.String r13 = ":"
            boolean r13 = r0.regionMatches(r7, r13, r6, r12)
            r14 = 85
            if (r13 == 0) goto L_0x0059
            r13 = 86
            goto L_0x005b
        L_0x0059:
            r13 = 85
        L_0x005b:
            if (r13 == r14) goto L_0x0060
            int r7 = r7 + 1
            goto L_0x007e
        L_0x0060:
            java.lang.String r13 = "."
            boolean r7 = r0.regionMatches(r7, r13, r6, r12)
            if (r7 == 0) goto L_0x007d
            int r7 = r8 + -2
            boolean r0 = getMin(r0, r10, r1, r3, r7)
            if (r0 != 0) goto L_0x007a
            int r0 = getCause
            int r0 = r0 + 83
            int r1 = r0 % 128
            create = r1
            int r0 = r0 % r5
            return r11
        L_0x007a:
            int r8 = r8 + 2
            goto L_0x00d6
        L_0x007d:
            return r11
        L_0x007e:
            r10 = r7
        L_0x007f:
            r7 = r10
            r13 = 0
        L_0x0081:
            if (r7 >= r1) goto L_0x0085
            r14 = 1
            goto L_0x0086
        L_0x0085:
            r14 = 0
        L_0x0086:
            if (r14 == r12) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            char r14 = r0.charAt(r7)     // Catch:{ Exception -> 0x0042 }
            int r14 = length((char) r14)
            if (r14 == r4) goto L_0x0095
            r15 = 1
            goto L_0x0096
        L_0x0095:
            r15 = 0
        L_0x0096:
            if (r15 == r12) goto L_0x00bc
        L_0x0098:
            int r12 = r7 - r10
            if (r12 == 0) goto L_0x00bb
            r14 = 24
            r15 = 4
            if (r12 <= r15) goto L_0x00a4
            r12 = 38
            goto L_0x00a6
        L_0x00a4:
            r12 = 24
        L_0x00a6:
            if (r12 == r14) goto L_0x00a9
            goto L_0x00bb
        L_0x00a9:
            int r11 = r8 + 1
            int r12 = r13 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12
            r3[r8] = r12
            int r8 = r11 + 1
            r12 = r13 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12
            r3[r11] = r12
            goto L_0x0019
        L_0x00bb:
            return r11
        L_0x00bc:
            int r15 = create
            int r15 = r15 + 41
            int r6 = r15 % 128
            getCause = r6
            int r15 = r15 % r5
            if (r15 != 0) goto L_0x00cd
            int r13 = r13 + -4
            int r13 = r13 / r14
            int r7 = r7 + 111
            goto L_0x00d3
        L_0x00cd:
            int r6 = r13 << 4
            int r13 = r6 + r14
            int r7 = r7 + 1
        L_0x00d3:
            r6 = 0
            goto L_0x0081
        L_0x00d5:
            throw r0
        L_0x00d6:
            if (r8 == r2) goto L_0x00da
            r0 = 0
            goto L_0x00db
        L_0x00da:
            r0 = 1
        L_0x00db:
            if (r0 == r12) goto L_0x00fd
            if (r9 != r4) goto L_0x00f0
            int r0 = getCause
            int r0 = r0 + 63
            int r1 = r0 % 128
            create = r1
            int r0 = r0 % r5
            if (r0 == 0) goto L_0x00ef
            int r0 = r11.length     // Catch:{ all -> 0x00ec }
            return r11
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ef:
            return r11
        L_0x00f0:
            int r0 = r8 - r9
            int r1 = 16 - r0
            java.lang.System.arraycopy(r3, r9, r3, r1, r0)
            int r2 = r2 - r8
            int r2 = r2 + r9
            r0 = 0
            java.util.Arrays.fill(r3, r9, r2, r0)
        L_0x00fd:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x0102 }
            return r0
        L_0x0102:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0108:
            r0 = move-exception
            goto L_0x010b
        L_0x010a:
            throw r0
        L_0x010b:
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.setMax(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ab, code lost:
        if (r0 == (r13 + 4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ad, code lost:
        r9 = getCause + 61;
        create = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b6, code lost:
        if ((r9 % 2) == 0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bb, code lost:
        r9 = create + 77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        getCause = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c1, code lost:
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c3, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMin(java.lang.String r9, int r10, int r11, byte[] r12, int r13) {
        /*
            r0 = r13
        L_0x0001:
            r1 = 46
            r2 = 61
            if (r10 >= r11) goto L_0x000a
            r3 = 46
            goto L_0x000c
        L_0x000a:
            r3 = 61
        L_0x000c:
            r4 = 1
            r5 = 0
            if (r3 == r2) goto L_0x00a9
            r2 = 16
            if (r0 != r2) goto L_0x0015
            return r5
        L_0x0015:
            if (r0 == r13) goto L_0x003a
            int r2 = getCause
            int r2 = r2 + 35
            int r3 = r2 % 128
            create = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == r4) goto L_0x002f
            char r2 = r9.charAt(r10)
            if (r2 == r1) goto L_0x0038
            goto L_0x0037
        L_0x002f:
            char r1 = r9.charAt(r10)
            r2 = 32
            if (r1 == r2) goto L_0x0038
        L_0x0037:
            return r5
        L_0x0038:
            int r10 = r10 + 1
        L_0x003a:
            r1 = r10
            r2 = 0
        L_0x003c:
            if (r1 >= r11) goto L_0x0089
            int r3 = create
            int r3 = r3 + 53
            int r6 = r3 % 128
            getCause = r6
            int r3 = r3 % 2
            r6 = 48
            if (r3 != 0) goto L_0x0055
            char r3 = r9.charAt(r1)
            r7 = 59
            if (r3 < r7) goto L_0x0089
            goto L_0x005b
        L_0x0055:
            char r3 = r9.charAt(r1)
            if (r3 < r6) goto L_0x0089
        L_0x005b:
            r7 = 57
            if (r3 > r7) goto L_0x0061
            r7 = 0
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            if (r7 == 0) goto L_0x0065
            goto L_0x0089
        L_0x0065:
            r7 = 84
            if (r2 != 0) goto L_0x006c
            r8 = 93
            goto L_0x006e
        L_0x006c:
            r8 = 84
        L_0x006e:
            if (r8 == r7) goto L_0x007d
            if (r10 == r1) goto L_0x007d
            int r9 = create     // Catch:{ Exception -> 0x00c6 }
            int r9 = r9 + 5
            int r10 = r9 % 128
            getCause = r10     // Catch:{ Exception -> 0x00c4 }
            int r9 = r9 % 2
            return r5
        L_0x007d:
            int r2 = r2 * 10
            int r2 = r2 + r3
            int r2 = r2 - r6
            r3 = 255(0xff, float:3.57E-43)
            if (r2 <= r3) goto L_0x0086
            return r5
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0089:
            int r10 = r1 - r10
            if (r10 != 0) goto L_0x00a0
            int r9 = getCause
            int r9 = r9 + 65
            int r10 = r9 % 128
            create = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x009f
            r9 = 30
            int r9 = r9 / r5
            return r5
        L_0x009d:
            r9 = move-exception
            throw r9
        L_0x009f:
            return r5
        L_0x00a0:
            int r10 = r0 + 1
            byte r2 = (byte) r2
            r12[r0] = r2
            r0 = r10
            r10 = r1
            goto L_0x0001
        L_0x00a9:
            int r13 = r13 + 4
            if (r0 == r13) goto L_0x00b9
            int r9 = getCause
            int r9 = r9 + r2
            int r10 = r9 % 128
            create = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x00b8
        L_0x00b8:
            return r5
        L_0x00b9:
            int r9 = create     // Catch:{ Exception -> 0x00c6 }
            int r9 = r9 + 77
            int r10 = r9 % 128
            getCause = r10     // Catch:{ Exception -> 0x00c4 }
            int r9 = r9 % 2
            return r4
        L_0x00c4:
            r9 = move-exception
            throw r9
        L_0x00c6:
            r9 = move-exception
            goto L_0x00c9
        L_0x00c8:
            throw r9
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initCloseCode.getMin(java.lang.String, int, int, byte[], int):boolean");
    }

    public static X509TrustManager setMin() {
        int i = getCause + 115;
        create = i % 128;
        int i2 = i % 2;
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (!(trustManagers.length != 1)) {
                int i3 = getCause + 85;
                create = i3 % 128;
                int i4 = i3 % 2;
                if (trustManagers[0] instanceof X509TrustManager) {
                    return (X509TrustManager) trustManagers[0];
                }
            }
            StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw length("No System TLS", (Exception) e);
        }
    }

    public static Draft_75 length(List<setHttpStatus> list) {
        Draft_75.length length2 = new Draft_75.length();
        Iterator<setHttpStatus> it = list.iterator();
        int i = getCause + 17;
        create = i % 128;
        int i2 = i % 2;
        while (true) {
            if ((it.hasNext() ? '4' : '!') != '4') {
                Draft_75 draft_75 = new Draft_75(length2);
                try {
                    int i3 = create + 87;
                    getCause = i3 % 128;
                    int i4 = i3 % 2;
                    return draft_75;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                setHttpStatus next = it.next();
                LimitExedeedException.length.length(length2, next.toIntRange.utf8(), next.IsOverlapping.utf8());
            }
        }
    }

    public static String getMin(Draft_76 draft_76, boolean z) {
        String str;
        if (draft_76.getMin.contains(":")) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(draft_76.getMin);
            sb.append("]");
            str = sb.toString();
            int i = getCause + 103;
            create = i % 128;
            int i2 = i % 2;
        } else {
            try {
                str = draft_76.getMin;
            } catch (Exception e) {
                throw e;
            }
        }
        if (!(z)) {
            try {
                int i3 = create + 27;
                getCause = i3 % 128;
                int i4 = i3 % 2;
                if (draft_76.setMax == Draft_76.getMax(draft_76.setMin)) {
                    return str;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        sb2.append(draft_76.setMax);
        return sb2.toString();
    }

    private static String setMin(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = create + 83;
            getCause = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[i5] = (char) (i << cArr[i5]);
                try {
                    cArr2[i5] = (char) (cArr2[i5] << valueOf);
                    i5 += 65;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                cArr2[i5] = (char) (cArr[i5] + i);
                cArr2[i5] = (char) (cArr2[i5] - valueOf);
                i5++;
            }
        }
        if ((i2 > 0 ? 'L' : 2) == 'L') {
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i7 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i7, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i7);
        }
        if (z) {
            int i8 = getCause + 45;
            create = i8 % 128;
            if (i8 % 2 != 0) {
            }
            char[] cArr4 = new char[i3];
            while (i4 < i3) {
                cArr4[i4] = cArr2[(i3 - i4) - 1];
                i4++;
                int i9 = getCause + 103;
                create = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = create + 113;
            getCause = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        try {
            int i13 = getCause + 19;
            create = i13 % 128;
            int i14 = i13 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
