package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzil extends ByteArrayOutputStream {
    private static int getMax = 1;
    private static long getMin = 8269719828393071277L;
    private static int setMax;
    private boolean closed;
    private final Logger logger;
    private int zzacy;
    private final int zzacz;
    private final Level zzada;

    public zzil(Logger logger2, Level level, int i) {
        boolean z;
        try {
            this.logger = (Logger) zzlp.checkNotNull(logger2);
            this.zzada = (Level) zzlp.checkNotNull(level);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
                int i2 = setMax + 83;
                getMax = i2 % 128;
                int i3 = i2 % 2;
            }
            zzlp.checkArgument(z);
            this.zzacz = i;
            int i4 = getMax + 91;
            setMax = i4 % 128;
            if ((i4 % 2 != 0 ? 30 : 'J') == 30) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final synchronized void write(int i) {
        boolean z;
        int i2 = getMax + 73;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if ((!this.closed ? '+' : '\'') != '\'') {
            int i4 = getMax + 1;
            setMax = i4 % 128;
            if (i4 % 2 != 0) {
            }
            z = true;
        } else {
            int i5 = getMax + 119;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        try {
            zzlp.checkArgument(z);
            this.zzacy++;
            if (this.count < this.zzacz) {
                int i7 = setMax + 125;
                getMax = i7 % 128;
                if (i7 % 2 == 0) {
                    super.write(i);
                    int i8 = 50 / 0;
                } else {
                    super.write(i);
                }
            }
            int i9 = getMax + 117;
            setMax = i9 % 128;
            int i10 = i9 % 2;
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r0 > r5.zzacz) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r0 > r5.zzacz) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void write(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.closed     // Catch:{ Exception -> 0x0074 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            int r0 = setMax     // Catch:{ all -> 0x0072 }
            int r0 = r0 + 115
            int r3 = r0 % 128
            getMax = r3     // Catch:{ all -> 0x0072 }
            int r0 = r0 % 2
            int r0 = setMax     // Catch:{ all -> 0x0072 }
            int r0 = r0 + 63
            int r3 = r0 % 128
            getMax = r3     // Catch:{ all -> 0x0072 }
            int r0 = r0 % 2
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            com.google.android.gms.internal.firebase_ml.zzlp.checkArgument(r0)     // Catch:{ all -> 0x0072 }
            int r0 = r5.zzacy     // Catch:{ all -> 0x0072 }
            int r0 = r0 + r8
            r5.zzacy = r0     // Catch:{ all -> 0x0072 }
            int r0 = r5.count     // Catch:{ all -> 0x0072 }
            int r3 = r5.zzacz     // Catch:{ all -> 0x0072 }
            r4 = 96
            if (r0 >= r3) goto L_0x0031
            r0 = 96
            goto L_0x0033
        L_0x0031:
            r0 = 79
        L_0x0033:
            if (r0 == r4) goto L_0x0036
            goto L_0x005c
        L_0x0036:
            int r0 = setMax     // Catch:{ Exception -> 0x0070 }
            int r0 = r0 + 57
            int r3 = r0 % 128
            getMax = r3     // Catch:{ Exception -> 0x0070 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 == 0) goto L_0x004e
            int r0 = r5.count     // Catch:{ Exception -> 0x0070 }
            int r0 = r0 >> r8
            int r1 = r5.zzacz     // Catch:{ Exception -> 0x0070 }
            if (r0 <= r1) goto L_0x0059
            goto L_0x0055
        L_0x004e:
            int r0 = r5.count     // Catch:{ all -> 0x0072 }
            int r0 = r0 + r8
            int r1 = r5.zzacz     // Catch:{ all -> 0x0072 }
            if (r0 <= r1) goto L_0x0059
        L_0x0055:
            int r1 = r5.zzacz     // Catch:{ all -> 0x0072 }
            int r1 = r1 - r0
            int r8 = r8 + r1
        L_0x0059:
            super.write(r6, r7, r8)     // Catch:{ all -> 0x0072 }
        L_0x005c:
            int r6 = setMax     // Catch:{ all -> 0x0072 }
            int r6 = r6 + 7
            int r7 = r6 % 128
            getMax = r7     // Catch:{ all -> 0x0072 }
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x006e
            r6 = 0
            int r6 = r6.length     // Catch:{ all -> 0x006c }
            monitor-exit(r5)
            return
        L_0x006c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0072 }
        L_0x006e:
            monitor-exit(r5)
            return
        L_0x0070:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r6 = move-exception
            goto L_0x0076
        L_0x0074:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0072 }
        L_0x0076:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzil.write(byte[], int, int):void");
    }

    public final synchronized void close() throws IOException {
        synchronized (this) {
            int i = setMax + 21;
            getMax = i % 128;
            int i2 = i % 2;
            boolean z = false;
            if (!(this.closed)) {
                if (this.zzacy != 0) {
                    StringBuilder sb = new StringBuilder("Total: ");
                    zza(sb, this.zzacy);
                    if (!(this.count == 0)) {
                        if (this.count < this.zzacy) {
                            sb.append(" (logging first ");
                            zza(sb, this.count);
                            sb.append(")");
                            int i3 = getMax + 25;
                            setMax = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                    this.logger.logp(Level.CONFIG, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", sb.toString());
                    if (this.count != 0) {
                        int i5 = setMax + 75;
                        getMax = i5 % 128;
                        if (i5 % 2 != 0) {
                            this.logger.logp(this.zzada, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString(getMin(new char[]{12781, 41749, 61731, 1836, 21812, 27444}).intern()).replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                        } else {
                            this.logger.logp(this.zzada, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString(getMin(new char[]{12781, 41749, 61731, 1836, 21812, 27444}).intern()).replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                            try {
                                int i6 = 82 / 0;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                this.closed = true;
                int i7 = getMax + 69;
                setMax = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = setMax + 117;
            getMax = i9 % 128;
            if (i9 % 2 != 0) {
                z = true;
            }
            if (!z) {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
    }

    private static void zza(StringBuilder sb, int i) {
        int i2 = setMax + 75;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        if (!(i == 1)) {
            try {
                try {
                    sb.append(NumberFormat.getInstance().format((long) i));
                    sb.append(" bytes");
                    int i4 = setMax + 15;
                    getMax = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i6 = getMax + 115;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            sb.append("1 byte");
            int i8 = setMax + 15;
            getMax = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
            if (!z) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        }
    }

    private static String getMin(char[] cArr) {
        try {
            int i = getMax + 79;
            try {
                setMax = i % 128;
                int i2 = i % 2;
                char c = cArr[0];
                int i3 = 1;
                char[] cArr2 = new char[(cArr.length - 1)];
                int i4 = setMax + 39;
                getMax = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    if ((i3 < cArr.length ? 'c' : 'Q') == 'Q') {
                        return new String(cArr2);
                    }
                    cArr2[i3 - 1] = (char) ((int) (((long) (cArr[i3] ^ (i3 * c))) ^ getMin));
                    i3++;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
