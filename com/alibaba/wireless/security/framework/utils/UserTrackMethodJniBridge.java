package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.text.Typography;

public class UserTrackMethodJniBridge {

    /* renamed from: a  reason: collision with root package name */
    private static Context f9215a = null;
    private static String b = null;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int equals = 1;
    private static int f = 0;
    private static Class g = null;
    private static int getMax;
    private static short[] getMin;
    private static Class h = null;
    private static Class i = null;
    private static Constructor j = null;
    private static Method k = null;
    private static Method l = null;
    private static int length;
    private static Method m = null;
    private static Method n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final char[] f9216o = "0123456789abcdef".toCharArray();
    private static byte[] setMax;
    private static int setMin;
    private static int toIntRange;

    static {
        getMax();
        try {
            int i2 = toIntRange + 109;
            equals = i2 % 128;
            if (!(i2 % 2 != 0)) {
                int i3 = 37 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        if ((r1 == 0 ? 'B' : 17) != 'B') goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String a() {
        /*
            java.lang.Class<com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge> r0 = com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.class
            monitor-enter(r0)
            java.lang.String r1 = b     // Catch:{ Exception -> 0x006f }
            r2 = 90
            if (r1 == 0) goto L_0x000c
            r1 = 9
            goto L_0x000e
        L_0x000c:
            r1 = 90
        L_0x000e:
            r3 = 17
            r4 = 0
            if (r1 == r2) goto L_0x004e
            int r1 = equals     // Catch:{ all -> 0x006d }
            int r1 = r1 + 107
            int r2 = r1 % 128
            toIntRange = r2     // Catch:{ all -> 0x006d }
            int r1 = r1 % 2
            r2 = 87
            if (r1 == 0) goto L_0x0024
            r1 = 87
            goto L_0x0025
        L_0x0024:
            r1 = 7
        L_0x0025:
            if (r1 == r2) goto L_0x0038
            java.lang.String r1 = b     // Catch:{ all -> 0x006d }
            int r1 = r1.length()     // Catch:{ all -> 0x006d }
            r2 = 89
            if (r1 != 0) goto L_0x0034
            r1 = 89
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == r2) goto L_0x004e
            goto L_0x0054
        L_0x0038:
            java.lang.String r1 = b     // Catch:{ all -> 0x006d }
            int r1 = r1.length()     // Catch:{ all -> 0x006d }
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x004c }
            r2 = 66
            if (r1 != 0) goto L_0x0047
            r1 = 66
            goto L_0x0049
        L_0x0047:
            r1 = 17
        L_0x0049:
            if (r1 == r2) goto L_0x004e
            goto L_0x0054
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x004e:
            java.lang.String r1 = b()     // Catch:{ all -> 0x006d }
            b = r1     // Catch:{ all -> 0x006d }
        L_0x0054:
            java.lang.String r1 = b     // Catch:{ all -> 0x006d }
            java.lang.String r2 = b     // Catch:{ all -> 0x006d }
            int r2 = r2.length()     // Catch:{ all -> 0x006d }
            int r2 = r2 / 8
            java.lang.String r1 = r1.substring(r4, r2)     // Catch:{ all -> 0x006d }
            int r2 = toIntRange     // Catch:{ all -> 0x006d }
            int r2 = r2 + r3
            int r3 = r2 % 128
            equals = r3     // Catch:{ all -> 0x006d }
            int r2 = r2 % 2
            monitor-exit(r0)
            return r1
        L_0x006d:
            r1 = move-exception
            goto L_0x0071
        L_0x006f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x0071:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.a():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(4:2|3|4|(1:6))(1:(1:11))|13|(3:15|16|17)|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != true) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != true) goto L_0x0021;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r8) {
        /*
            int r0 = equals
            int r0 = r0 + 99
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = ""
            r3 = 1
            if (r0 == 0) goto L_0x001b
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0019 }
            if (r8 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 == r3) goto L_0x0062
            goto L_0x0021
        L_0x0019:
            r8 = move-exception
            throw r8
        L_0x001b:
            if (r8 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            if (r1 == r3) goto L_0x0062
        L_0x0021:
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0062
            r0 = 207646735(0xc60700f, float:1.7290054E-31)
            int r1 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            int r1 = r1 >> 8
            int r0 = r0 - r1
            int r1 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            int r1 = r1 >> 16
            int r1 = r1 + -27
            short r1 = (short) r1     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            float r3 = android.media.AudioTrack.getMinVolume()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            int r3 = -41 - r3
            r5 = 0
            int r5 = android.widget.ExpandableListView.getPackedPositionGroup(r5)     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            int r5 = r5 + -42
            byte r5 = (byte) r5     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            r6 = -2101099396(0xffffffff82c3c47c, float:-2.8765451E-37)
            float r7 = android.media.AudioTrack.getMinVolume()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r4 = r4 + r6
            java.lang.String r0 = length(r0, r1, r3, r5, r4)     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            java.lang.String r0 = r0.intern()     // Catch:{ UnsupportedEncodingException -> 0x0062 }
            java.lang.String r2 = java.net.URLEncoder.encode(r8, r0)     // Catch:{ UnsupportedEncodingException -> 0x0062 }
        L_0x0062:
            int r8 = equals     // Catch:{ Exception -> 0x006d }
            int r8 = r8 + 87
            int r0 = r8 % 128
            toIntRange = r0     // Catch:{ Exception -> 0x006d }
            int r8 = r8 % 2
            return r2
        L_0x006d:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r3 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if ((com.alibaba.wireless.security.framework.utils.f.c(f9215a)) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int addUtRecord(java.lang.String r10, int r11, int r12, java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            int r0 = utAvaiable()     // Catch:{ Exception -> 0x0163 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r0 = 0
            goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            if (r0 == r1) goto L_0x0162
            r0 = 15
            r3 = 19
            if (r10 == 0) goto L_0x0016
            r4 = 15
            goto L_0x0018
        L_0x0016:
            r4 = 19
        L_0x0018:
            if (r4 == r0) goto L_0x001c
            goto L_0x0162
        L_0x001c:
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = "Page_SecurityGuardSDK"
            if (r13 == 0) goto L_0x0028
            r4 = r13
            goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            int r5 = r11 % 100
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0162 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0162 }
            r6.<init>()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r7 = "plugin"
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0162 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r7 = "pid"
            int r8 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0162 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r7 = "tid"
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0162 }
            long r8 = r8.getId()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0162 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r7 = "time"
            java.lang.String r8 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0162 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0162 }
            int r7 = d     // Catch:{ Exception -> 0x0162 }
            r8 = 38
            if (r7 != 0) goto L_0x0070
            r7 = 79
            goto L_0x0072
        L_0x0070:
            r7 = 38
        L_0x0072:
            r9 = 2
            if (r7 == r8) goto L_0x00ae
            int r7 = equals
            int r7 = r7 + r3
            int r3 = r7 % 128
            toIntRange = r3
            int r7 = r7 % r9
            if (r7 == 0) goto L_0x008d
            android.content.Context r3 = f9215a     // Catch:{ Exception -> 0x0162 }
            boolean r3 = com.alibaba.wireless.security.framework.utils.f.c(r3)     // Catch:{ Exception -> 0x0162 }
            r7 = 0
            int r7 = r7.length     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x009c
            goto L_0x009a
        L_0x008a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x008d:
            android.content.Context r3 = f9215a     // Catch:{ Exception -> 0x0162 }
            boolean r3 = com.alibaba.wireless.security.framework.utils.f.c(r3)     // Catch:{ Exception -> 0x0162 }
            if (r3 == 0) goto L_0x0097
            r3 = 1
            goto L_0x0098
        L_0x0097:
            r3 = 0
        L_0x0098:
            if (r3 == 0) goto L_0x009c
        L_0x009a:
            r3 = 1
            goto L_0x009d
        L_0x009c:
            r3 = 0
        L_0x009d:
            c = r3     // Catch:{ Exception -> 0x0162 }
            d = r1     // Catch:{ Exception -> 0x0162 }
            int r3 = equals     // Catch:{ Exception -> 0x00ab }
            int r3 = r3 + 125
            int r7 = r3 % 128
            toIntRange = r7     // Catch:{ Exception -> 0x0163 }
            int r3 = r3 % r9
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ae:
            java.lang.String r3 = "ui"
            int r7 = c     // Catch:{ Exception -> 0x0162 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "sid"
            java.lang.String r7 = a()     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "uuid"
            java.lang.String r7 = b()     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "msg"
            java.lang.String r7 = a(r16)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "rsv1"
            java.lang.String r7 = a(r17)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "rsv2"
            java.lang.String r7 = a(r18)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "rsv3"
            java.lang.String r7 = a(r19)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r3 = "rsv4"
            java.lang.String r7 = a(r20)     // Catch:{ Exception -> 0x0162 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x0162 }
            java.lang.reflect.Constructor r3 = j     // Catch:{ Exception -> 0x0162 }
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0162 }
            r7[r2] = r0     // Catch:{ Exception -> 0x0162 }
            r0 = 19999(0x4e1f, float:2.8025E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0162 }
            r7[r1] = r0     // Catch:{ Exception -> 0x0162 }
            r7[r9] = r10     // Catch:{ Exception -> 0x0162 }
            r0 = 3
            r7[r0] = r4     // Catch:{ Exception -> 0x0162 }
            r0 = 4
            r7[r0] = r5     // Catch:{ Exception -> 0x0162 }
            r0 = 5
            r7[r0] = r6     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r0 = r3.newInstance(r7)     // Catch:{ Exception -> 0x0162 }
            if (r0 != 0) goto L_0x011c
            goto L_0x0162
        L_0x011c:
            java.lang.reflect.Method r3 = k     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r0 = r3.invoke(r0, r4)     // Catch:{ Exception -> 0x0162 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0162
            int r3 = toIntRange
            int r3 = r3 + 105
            int r4 = r3 % 128
            equals = r4
            int r3 = r3 % r9
            int r3 = r0.size()     // Catch:{ Exception -> 0x0162 }
            if (r3 != 0) goto L_0x0138
            goto L_0x0162
        L_0x0138:
            java.lang.reflect.Method r3 = l     // Catch:{ Exception -> 0x0162 }
            java.lang.Class r4 = h     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0162 }
            if (r3 != 0) goto L_0x0145
            goto L_0x0162
        L_0x0145:
            java.lang.reflect.Method r4 = m     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch:{ Exception -> 0x0162 }
            if (r3 != 0) goto L_0x0159
            int r0 = toIntRange     // Catch:{ Exception -> 0x0163 }
            int r0 = r0 + 67
            int r1 = r0 % 128
            equals = r1     // Catch:{ Exception -> 0x0163 }
            int r0 = r0 % r9
            goto L_0x0162
        L_0x0159:
            java.lang.reflect.Method r4 = n     // Catch:{ Exception -> 0x0162 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0162 }
            r1[r2] = r0     // Catch:{ Exception -> 0x0162 }
            r4.invoke(r3, r1)     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            return r2
        L_0x0163:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.addUtRecord(java.lang.String, int, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    private static String b() {
        try {
            String obj = UUID.randomUUID().toString();
            String valueOf = String.valueOf(System.nanoTime());
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(valueOf);
            String bytesToHex = bytesToHex(instance.digest(sb.toString().getBytes(length((ViewConfiguration.getLongPressTimeout() >> 16) + 207646735, (short) (-27 - Color.blue(0)), -16777257 - Color.rgb(0, 0, 0), (byte) (-43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) - 2101099396).intern())));
            try {
                int i2 = equals + 31;
                toIntRange = i2 % 128;
                int i3 = i2 % 2;
                return bytesToHex;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static String bytesToHex(byte[] bArr) {
        try {
            int i2 = toIntRange + 73;
            try {
                equals = i2 % 128;
                int i3 = i2 % 2;
                char[] cArr = new char[(bArr.length * 2)];
                int i4 = equals + 107;
                toIntRange = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (true) {
                    if (i6 >= bArr.length) {
                        return new String(cArr);
                    }
                    byte b2 = bArr[i6] & 255;
                    int i7 = i6 * 2;
                    char[] cArr2 = f9216o;
                    cArr[i7] = cArr2[b2 >>> 4];
                    cArr[i7 + 1] = cArr2[b2 & Ascii.SI];
                    i6++;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    static void getMax() {
        setMin = -207646650;
        getMax = 2101099396;
        setMax = new byte[]{-8, 76, 63, 68, 0};
        length = 46;
    }

    public static String getStackTrace(int i2, int i3) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace != null) {
            int i4 = equals + 81;
            toIntRange = i4 % 128;
            int i5 = i4 % 2;
            if (stackTrace.length > 0) {
                if ((i2 > 0 ? 'K' : '(') != '(' && i3 > 0) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = equals + 95;
                    toIntRange = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < stackTrace.length && i9 < i3) {
                        int i10 = equals + 33;
                        toIntRange = i10 % 128;
                        if (!(i10 % 2 != 0)) {
                            if (sb.length() >= i2) {
                                break;
                            }
                        } else {
                            int length2 = sb.length();
                            Object[] objArr = null;
                            int length3 = objArr.length;
                            if (!(length2 < i2)) {
                                break;
                            }
                        }
                        if (i8 > 1) {
                            i9++;
                            StackTraceElement stackTraceElement = stackTrace[i8];
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                sb2.append(stackTraceElement.getClassName());
                                sb2.append(".");
                                sb2.append(stackTraceElement.getMethodName());
                                sb.append(sb2.toString());
                                if ((i8 < stackTrace.length - 1 ? Typography.less : '\\') != '\\') {
                                    sb.append("#");
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        i8++;
                    }
                    return sb.toString();
                }
            }
        }
        return "";
    }

    public static void init(Context context) {
        int i2 = equals + 15;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        if ((context != null ? (char) 22 : 31) == 22) {
            int i4 = toIntRange + 37;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                f9215a = context;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int utAvaiable() {
        /*
            int r0 = f
            if (r0 != 0) goto L_0x0089
            java.lang.Class<com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge> r0 = com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.class
            monitor-enter(r0)
            int r1 = f     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0084
            r1 = 1
            java.lang.String r2 = "com.ut.mini.internal.UTOriginalCustomHitBuilder"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0082 }
            g = r2     // Catch:{ ClassNotFoundException -> 0x0082 }
            java.lang.String r2 = "com.ut.mini.UTAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0082 }
            h = r2     // Catch:{ ClassNotFoundException -> 0x0082 }
            java.lang.String r2 = "com.ut.mini.UTTracker"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0082 }
            i = r2     // Catch:{ ClassNotFoundException -> 0x0082 }
            java.lang.Class r2 = g     // Catch:{  }
            r3 = 6
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{  }
            r3[r1] = r4     // Catch:{  }
            r4 = 2
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3[r4] = r6     // Catch:{  }
            r4 = 3
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3[r4] = r6     // Catch:{  }
            r4 = 4
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3[r4] = r6     // Catch:{  }
            r4 = 5
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r3[r4] = r6     // Catch:{  }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch:{  }
            j = r2     // Catch:{  }
            java.lang.Class r2 = g     // Catch:{  }
            java.lang.String r3 = "build"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{  }
            k = r2     // Catch:{  }
            java.lang.Class r2 = h     // Catch:{  }
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{  }
            l = r2     // Catch:{  }
            java.lang.Class r2 = h     // Catch:{  }
            java.lang.String r3 = "getDefaultTracker"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{  }
            m = r2     // Catch:{  }
            java.lang.Class r2 = i     // Catch:{  }
            java.lang.String r3 = "send"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{  }
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r4[r5] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{  }
            n = r2     // Catch:{  }
            e = r1     // Catch:{ all -> 0x0086 }
        L_0x0082:
            f = r1     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0089
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0089:
            int r0 = e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.utAvaiable():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if ((r1 ? 11 : '\\') != 11) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r1 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r6, short r7, int r8, byte r9, int r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = length     // Catch:{ Exception -> 0x009b }
            int r8 = r8 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r8 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0014
            r4 = 0
            goto L_0x0015
        L_0x0014:
            r4 = 1
        L_0x0015:
            if (r4 == r3) goto L_0x0030
            byte[] r8 = setMax
            if (r8 == 0) goto L_0x0025
            int r4 = getMax     // Catch:{ Exception -> 0x009b }
            int r4 = r4 + r10
            byte r8 = r8[r4]     // Catch:{ Exception -> 0x009b }
            int r4 = length     // Catch:{ Exception -> 0x009b }
            int r8 = r8 + r4
            byte r8 = (byte) r8
            goto L_0x0030
        L_0x0025:
            short[] r8 = getMin
            int r4 = getMax
            int r4 = r4 + r10
            short r8 = r8[r4]
            int r4 = length
            int r8 = r8 + r4
            short r8 = (short) r8
        L_0x0030:
            if (r8 <= 0) goto L_0x0096
            int r4 = toIntRange
            int r4 = r4 + 101
            int r5 = r4 % 128
            equals = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0051
            int r10 = r10 * r8
            int r10 = r10 >> 4
            int r4 = getMax
            int r10 = r10 >>> r4
            r4 = 11
            if (r1 == 0) goto L_0x004c
            r1 = 11
            goto L_0x004e
        L_0x004c:
            r1 = 92
        L_0x004e:
            if (r1 == r4) goto L_0x0059
            goto L_0x005b
        L_0x0051:
            int r10 = r10 + r8
            int r10 = r10 + -2
            int r4 = getMax     // Catch:{ Exception -> 0x009b }
            int r10 = r10 + r4
            if (r1 == 0) goto L_0x005b
        L_0x0059:
            r1 = 1
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            int r10 = r10 + r1
            int r1 = setMin
            int r6 = r6 + r1
            char r6 = (char) r6
            r0.append(r6)
            r1 = 1
        L_0x0065:
            if (r1 >= r8) goto L_0x0096
            int r4 = toIntRange
            int r4 = r4 + 67
            int r5 = r4 % 128
            equals = r5
            int r4 = r4 % 2
            byte[] r4 = setMax
            if (r4 == 0) goto L_0x0077
            r4 = 1
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            if (r4 == r3) goto L_0x0087
            short[] r4 = getMin
            int r5 = r10 + -1
            short r10 = r4[r10]
            int r10 = r10 + r7
            short r10 = (short) r10
        L_0x0082:
            r10 = r10 ^ r9
            int r6 = r6 + r10
            char r6 = (char) r6
            r10 = r5
            goto L_0x0090
        L_0x0087:
            byte[] r4 = setMax
            int r5 = r10 + -1
            byte r10 = r4[r10]
            int r10 = r10 + r7
            byte r10 = (byte) r10
            goto L_0x0082
        L_0x0090:
            r0.append(r6)
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0096:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x009b:
            r6 = move-exception
            goto L_0x009e
        L_0x009d:
            throw r6
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge.length(int, short, int, byte, int):java.lang.String");
    }
}
