package com.facebook.stetho.common;

import android.graphics.Color;
import android.widget.ExpandableListView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.onActivityPreStopped;

public class Util {
    private static int getMax = 1;
    private static char getMin = '\u0003';
    private static int length;
    private static char[] setMax = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r3 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r3 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T throwIfNull(T r3) {
        /*
            int r0 = length
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r2 = 0
            if (r0 == r1) goto L_0x001b
            super.hashCode()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x002a
            goto L_0x001d
        L_0x0019:
            r3 = move-exception
            throw r3
        L_0x001b:
            if (r3 == 0) goto L_0x002a
        L_0x001d:
            int r0 = length     // Catch:{ Exception -> 0x0028 }
            int r0 = r0 + 115
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x0028 }
            int r0 = r0 % 2
            return r3
        L_0x0028:
            r3 = move-exception
            throw r3
        L_0x002a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.throwIfNull(java.lang.Object):java.lang.Object");
    }

    public static <T1, T2> void throwIfNull(T1 t1, T2 t2) {
        int i = length + 23;
        getMax = i % 128;
        if (!(i % 2 != 0)) {
            throwIfNull(t1);
            throwIfNull(t2);
            int i2 = 95 / 0;
        } else {
            throwIfNull(t1);
            throwIfNull(t2);
        }
        int i3 = getMax + 23;
        length = i3 % 128;
        int i4 = i3 % 2;
    }

    public static <T1, T2, T3> void throwIfNull(T1 t1, T2 t2, T3 t3) {
        try {
            int i = length + 81;
            getMax = i % 128;
            int i2 = i % 2;
            throwIfNull(t1);
            throwIfNull(t2);
            throwIfNull(t3);
            int i3 = getMax + 53;
            try {
                length = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        if (r3 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void throwIfNotNull(java.lang.Object r3) {
        /*
            int r0 = getMax     // Catch:{ Exception -> 0x003e }
            int r0 = r0 + 7
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x003e }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r1) goto L_0x0016
            if (r3 != 0) goto L_0x0036
            goto L_0x001b
        L_0x0016:
            r0 = 27
            int r0 = r0 / r2
            if (r3 != 0) goto L_0x0036
        L_0x001b:
            int r3 = getMax     // Catch:{ Exception -> 0x003e }
            int r3 = r3 + 19
            int r0 = r3 % 128
            length = r0     // Catch:{ Exception -> 0x003e }
            int r3 = r3 % 2
            r0 = 66
            if (r3 == 0) goto L_0x002c
            r3 = 20
            goto L_0x002e
        L_0x002c:
            r3 = 66
        L_0x002e:
            if (r3 == r0) goto L_0x0035
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r3 = move-exception
            throw r3
        L_0x0035:
            return
        L_0x0036:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x003c:
            r3 = move-exception
            throw r3
        L_0x003e:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.throwIfNotNull(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void throwIf(boolean r2) {
        /*
            int r0 = getMax
            int r0 = r0 + 73
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 83
            if (r0 == 0) goto L_0x0011
            r0 = 96
            goto L_0x0013
        L_0x0011:
            r0 = 83
        L_0x0013:
            if (r0 == r1) goto L_0x001c
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x003b
            goto L_0x001e
        L_0x001a:
            r2 = move-exception
            throw r2
        L_0x001c:
            if (r2 != 0) goto L_0x003b
        L_0x001e:
            int r2 = getMax
            int r2 = r2 + 9
            int r0 = r2 % 128
            length = r0
            int r2 = r2 % 2
            r0 = 40
            if (r2 == 0) goto L_0x002f
            r2 = 42
            goto L_0x0031
        L_0x002f:
            r2 = 40
        L_0x0031:
            if (r2 == r0) goto L_0x003a
            r2 = 29
            int r2 = r2 / 0
            return
        L_0x0038:
            r2 = move-exception
            throw r2
        L_0x003a:
            return
        L_0x003b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.throwIf(boolean):void");
    }

    public static void throwIfNot(boolean z) {
        int i = length + 21;
        getMax = i % 128;
        int i2 = i % 2;
        if (z) {
            try {
                int i3 = getMax + 121;
                length = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r4 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r4 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format(r5, r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void throwIfNot(boolean r4, java.lang.String r5, java.lang.Object... r6) {
        /*
            int r0 = length     // Catch:{ Exception -> 0x003c }
            int r0 = r0 + 59
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x003c }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x0017
            if (r4 == 0) goto L_0x0030
            goto L_0x001c
        L_0x0017:
            super.hashCode()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0030
        L_0x001c:
            int r4 = getMax
            int r4 = r4 + 105
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0029
            r1 = 1
        L_0x0029:
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            int r4 = r3.length     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r4 = move-exception
            throw r4
        L_0x0030:
            java.lang.String r4 = java.lang.String.format(r5, r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        L_0x003a:
            r4 = move-exception
            throw r4
        L_0x003c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.throwIfNot(boolean, java.lang.String, java.lang.Object[]):void");
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if ((read != -1 ? 'Y' : 31) == 'Y') {
                try {
                    int i = length + 73;
                    try {
                        getMax = i % 128;
                        int i2 = i % 2;
                        outputStream.write(bArr, 0, read);
                        int i3 = length + 87;
                        getMax = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r3 ? 25 : 'S') != 'S') goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if ((r3 ? 18 : '%') != '%') goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void close(java.io.Closeable r2, boolean r3) throws java.io.IOException {
        /*
            r0 = 67
            if (r2 == 0) goto L_0x0007
            r1 = 8
            goto L_0x0009
        L_0x0007:
            r1 = 67
        L_0x0009:
            if (r1 == r0) goto L_0x004f
            int r0 = length
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0029
            r0 = 48
            int r0 = r0 / 0
            r0 = 83
            if (r3 == 0) goto L_0x0022
            r3 = 25
            goto L_0x0024
        L_0x0022:
            r3 = 83
        L_0x0024:
            if (r3 == r0) goto L_0x0049
            goto L_0x0034
        L_0x0027:
            r2 = move-exception
            throw r2
        L_0x0029:
            r0 = 37
            if (r3 == 0) goto L_0x0030
            r3 = 18
            goto L_0x0032
        L_0x0030:
            r3 = 37
        L_0x0032:
            if (r3 == r0) goto L_0x0049
        L_0x0034:
            int r3 = getMax
            int r3 = r3 + 27
            int r0 = r3 % 128
            length = r0
            int r3 = r3 % 2
            r2.close()     // Catch:{ IOException -> 0x0042 }
            return
        L_0x0042:
            r2 = move-exception
            java.lang.String r3 = "Hiding IOException because another is pending"
            com.facebook.stetho.common.LogUtil.e((java.lang.Throwable) r2, (java.lang.String) r3)
            return
        L_0x0049:
            r2.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r2 = move-exception
            throw r2
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.close(java.io.Closeable, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void sleepUninterruptibly(long r5) {
        /*
            int r0 = length
            int r0 = r0 + 53
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0043 }
            int r2 = length
            int r2 = r2 + 123
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
        L_0x0018:
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x001c }
            return
        L_0x001c:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r5 = r5 - r2
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0018
            int r5 = length     // Catch:{ Exception -> 0x0041 }
            int r5 = r5 + 51
            int r6 = r5 % 128
            getMax = r6     // Catch:{ Exception -> 0x0041 }
            int r5 = r5 % 2
            r6 = 0
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x0040
            r5 = 24
            int r5 = r5 / r6
            return
        L_0x003e:
            r5 = move-exception
            throw r5
        L_0x0040:
            return
        L_0x0041:
            r5 = move-exception
            throw r5
        L_0x0043:
            r5 = move-exception
            goto L_0x0046
        L_0x0045:
            throw r5
        L_0x0046:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.sleepUninterruptibly(long):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:0|1|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void joinUninterruptibly(java.lang.Thread r1) {
        /*
        L_0x0000:
            r1.join()     // Catch:{ InterruptedException -> 0x0000 }
            int r1 = length
            int r1 = r1 + 65
            int r0 = r1 % 128
            getMax = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.joinUninterruptibly(java.lang.Thread):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|4|2|3) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch r1) {
        /*
        L_0x0000:
            r1.await()     // Catch:{ InterruptedException -> 0x0000 }
            int r1 = length
            int r1 = r1 + 59
            int r0 = r1 % 128
            getMax = r0
            int r1 = r1 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.awaitUninterruptibly(java.util.concurrent.CountDownLatch):void");
    }

    public static <T> T getUninterruptibly(Future<T> future, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        long j2;
        long j3;
        int i = length + 119;
        getMax = i % 128;
        if ((i % 2 == 0 ? 9 : '4') != 9) {
            j2 = timeUnit.toMillis(j);
            j3 = System.currentTimeMillis();
        } else {
            j2 = timeUnit.toMillis(j);
            j3 = System.currentTimeMillis();
            int i2 = 0 / 0;
        }
        while (true) {
            try {
                T t = future.get(j2, TimeUnit.MILLISECONDS);
                try {
                    int i3 = length + 125;
                    try {
                        getMax = i3 % 128;
                        int i4 = i3 % 2;
                        return t;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (InterruptedException unused) {
                j2 -= System.currentTimeMillis() - j3;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:0|1|(8:2|3|4|5|6|7|(1:9)(1:10)|(1:12)(4:13|14|15|16))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getUninterruptibly(java.util.concurrent.Future<T> r2) throws java.util.concurrent.ExecutionException {
        /*
        L_0x0000:
            java.lang.Object r2 = r2.get()     // Catch:{ InterruptedException -> 0x0000 }
            int r0 = length     // Catch:{ Exception -> 0x001d }
            int r0 = r0 + 61
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x001d }
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0013
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            return r2
        L_0x0017:
            r0 = 69
            int r0 = r0 / r1
            return r2
        L_0x001b:
            r2 = move-exception
            throw r2
        L_0x001d:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.Util.getUninterruptibly(java.util.concurrent.Future):java.lang.Object");
    }

    public static String readAsUTF8(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream, new byte[1024]);
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(setMax(new char[]{1, 2, 0, 5, 'v'}, 5 - Color.green(0), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 62)).intern());
        int i = getMax + 89;
        length = i % 128;
        if (i % 2 == 0) {
            return byteArrayOutputStream2;
        }
        int i2 = 1 / 0;
        return byteArrayOutputStream2;
    }

    private static String setMax(char[] cArr, int i, byte b) {
        char c;
        char c2;
        char[] cArr2 = setMax;
        char c3 = getMin;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
        }
        if ((i > 1 ? 25 : '1') == 25) {
            int i2 = getMax + 17;
            length = i2 % 128;
            int i3 = (i2 % 2 != 0 ? 'G' : 'L') != 'G' ? 0 : 1;
            while (true) {
                if (!(i3 < i)) {
                    break;
                }
                try {
                    int i4 = length + 65;
                    getMax = i4 % 128;
                    if (i4 % 2 != 0 ? (c2 = cArr[i3]) != (c = cArr[i3 + 1]) : (c2 = cArr[i3]) != (c = cArr[i3 << 0])) {
                        int min = onActivityPreStopped.setMin(c2, c3);
                        int length2 = onActivityPreStopped.length(c2, c3);
                        int min2 = onActivityPreStopped.setMin(c, c3);
                        int length3 = onActivityPreStopped.length(c, c3);
                        if (length2 == length3) {
                            int max = onActivityPreStopped.setMax(min, c3);
                            int max2 = onActivityPreStopped.setMax(min2, c3);
                            int max3 = onActivityPreStopped.getMax(max, length2, c3);
                            int max4 = onActivityPreStopped.getMax(max2, length3, c3);
                            cArr3[i3] = cArr2[max3];
                            cArr3[i3 + 1] = cArr2[max4];
                        } else if (min == min2) {
                            try {
                                int max5 = onActivityPreStopped.setMax(length2, c3);
                                int max6 = onActivityPreStopped.setMax(length3, c3);
                                int max7 = onActivityPreStopped.getMax(min, max5, c3);
                                int max8 = onActivityPreStopped.getMax(min2, max6, c3);
                                cArr3[i3] = cArr2[max7];
                                cArr3[i3 + 1] = cArr2[max8];
                            } catch (Exception e) {
                                throw e;
                            }
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length3, c3);
                            int max10 = onActivityPreStopped.getMax(min2, length2, c3);
                            cArr3[i3] = cArr2[max9];
                            cArr3[i3 + 1] = cArr2[max10];
                            int i5 = getMax + 99;
                            length = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    } else {
                        cArr3[i3] = (char) (c2 - b);
                        cArr3[i3 + 1] = (char) (c - b);
                    }
                    i3 += 2;
                    int i7 = length + 123;
                    getMax = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return new String(cArr3);
    }
}
