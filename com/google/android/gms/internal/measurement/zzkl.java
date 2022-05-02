package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public final class zzkl {
    private static char getMax = '\u0000';
    private static int getMin = 0;
    private static char[] length = null;
    private static int setMin = 1;
    static final Charset zza = Charset.forName(setMin(new char[]{1, 2, 0, 5, 168}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (byte) (112 - Color.alpha(0))).intern());
    static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzjg zze;

    static {
        length();
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzc;
        int length2 = bArr2.length;
        zzjf zzjf = new zzjf(bArr2, 0, 0, false, (zzje) null);
        try {
            zzjf.zza(0);
            int i = setMin + 113;
            getMin = i % 128;
            int i2 = i % 2;
            int i3 = getMin + 89;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            zze = zzjf;
            int i5 = setMin + 11;
            getMin = i5 % 128;
            int i6 = i5 % 2;
        } catch (zzkn e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void length() {
        getMax = 3;
        length = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static <T> T zza(T t) {
        Throwable th = null;
        if (t == null) {
            int i = setMin + 121;
            getMin = i % 128;
            int i2 = i % 2;
            throw th;
        }
        int i3 = setMin + 125;
        getMin = i3 % 128;
        if ((i3 % 2 != 0 ? Typography.dollar : '9') == '9') {
            return t;
        }
        super.hashCode();
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r2 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        if (r2 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        throw new java.lang.NullPointerException(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T zzb(T r2, java.lang.String r3) {
        /*
            int r0 = setMin     // Catch:{ Exception -> 0x0030 }
            int r0 = r0 + 37
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0030 }
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == r1) goto L_0x0015
            if (r2 == 0) goto L_0x0028
            goto L_0x001b
        L_0x0015:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0028
        L_0x001b:
            int r3 = getMin     // Catch:{ Exception -> 0x0030 }
            int r3 = r3 + 47
            int r0 = r3 % 128
            setMin = r0     // Catch:{ Exception -> 0x0026 }
            int r3 = r3 % 2
            return r2
        L_0x0026:
            r2 = move-exception
            throw r2
        L_0x0028:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r3)
            throw r2
        L_0x002e:
            r2 = move-exception
            throw r2
        L_0x0030:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkl.zzb(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static boolean zzc(byte[] bArr) {
        boolean z;
        int i = setMin + 47;
        getMin = i % 128;
        boolean z2 = true;
        Object obj = null;
        if (i % 2 != 0) {
            z = zzmw.zza(bArr);
            super.hashCode();
        } else {
            z = zzmw.zza(bArr);
        }
        int i2 = getMin + 3;
        setMin = i2 % 128;
        if (i2 % 2 == 0) {
            z2 = false;
        }
        if (z2) {
            return z;
        }
        super.hashCode();
        return z;
    }

    public static String zzd(byte[] bArr) {
        String str = new String(bArr, zza);
        try {
            int i = getMin + 39;
            try {
                setMin = i % 128;
                if (i % 2 != 0) {
                    return str;
                }
                int i2 = 96 / 0;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int zze(long j) {
        int i = getMin + 73;
        setMin = i % 128;
        int i2 = (int) (i % 2 != 0 ? j ^ (j >>> 32) : j | (j >>> 86));
        int i3 = getMin + 1;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    public static int zzf(boolean z) {
        int i = getMin + 17;
        setMin = i % 128;
        int i2 = i % 2;
        boolean z2 = false;
        if (!z) {
            return 1237;
        }
        int i3 = setMin + 83;
        getMin = i3 % 128;
        if (i3 % 2 == 0) {
            z2 = true;
        }
        return z2 ? 1231 : 23416;
    }

    public static int zzg(byte[] bArr) {
        int length2 = bArr.length;
        boolean z = false;
        int zzh = zzh(length2, bArr, 0, length2);
        if (zzh != 0) {
            return zzh;
        }
        int i = setMin + 105;
        getMin = i % 128;
        int i2 = i % 2;
        int i3 = setMin + 41;
        getMin = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return 1;
        }
        Object obj = null;
        super.hashCode();
        return 1;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = setMin + 125;
        getMin = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            if ((i4 < i3 ? 20 : ' ') == ' ') {
                return i;
            }
            int i7 = getMin + 105;
            setMin = i7 % 128;
            int i8 = i7 % 2;
            i = (i * 31) + bArr[i4];
            i4++;
        }
    }

    static Object zzi(Object obj, Object obj2) {
        try {
            int i = getMin + 119;
            setMin = i % 128;
            int i2 = i % 2;
            try {
                zzli zzaD = ((zzli) obj).zzbG().zzau((zzli) obj2).zzaD();
                int i3 = setMin + 43;
                getMin = i3 % 128;
                if (i3 % 2 == 0) {
                    return zzaD;
                }
                Object obj3 = null;
                super.hashCode();
                return zzaD;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMin(char[] cArr, int i, byte b) {
        char[] cArr2 = length;
        char c = getMax;
        char[] cArr3 = new char[i];
        char c2 = 'I';
        if (!(i % 2 == 0)) {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
            int i2 = getMin + 73;
            setMin = i2 % 128;
            int i3 = i2 % 2;
        }
        if (i > 1) {
            c2 = 'Z';
        }
        if (c2 == 'Z') {
            int i4 = setMin + 9;
            getMin = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < i; i6 += 2) {
                char c3 = cArr[i6];
                int i7 = i6 + 1;
                char c4 = cArr[i7];
                if (c3 == c4) {
                    cArr3[i6] = (char) (c3 - b);
                    cArr3[i7] = (char) (c4 - b);
                } else {
                    int min = onActivityPreStopped.setMin(c3, c);
                    int length2 = onActivityPreStopped.length(c3, c);
                    int min2 = onActivityPreStopped.setMin(c4, c);
                    int length3 = onActivityPreStopped.length(c4, c);
                    if (length2 == length3) {
                        int i8 = setMin + 1;
                        getMin = i8 % 128;
                        int i9 = i8 % 2;
                        int max = onActivityPreStopped.setMax(min, c);
                        int max2 = onActivityPreStopped.setMax(min2, c);
                        int max3 = onActivityPreStopped.getMax(max, length2, c);
                        int max4 = onActivityPreStopped.getMax(max2, length3, c);
                        cArr3[i6] = cArr2[max3];
                        cArr3[i7] = cArr2[max4];
                    } else if (min == min2) {
                        int i10 = setMin + 97;
                        getMin = i10 % 128;
                        int i11 = i10 % 2;
                        int max5 = onActivityPreStopped.setMax(length2, c);
                        int max6 = onActivityPreStopped.setMax(length3, c);
                        int max7 = onActivityPreStopped.getMax(min, max5, c);
                        int max8 = onActivityPreStopped.getMax(min2, max6, c);
                        cArr3[i6] = cArr2[max7];
                        cArr3[i7] = cArr2[max8];
                    } else {
                        int max9 = onActivityPreStopped.getMax(min, length3, c);
                        int max10 = onActivityPreStopped.getMax(min2, length2, c);
                        cArr3[i6] = cArr2[max9];
                        cArr3[i7] = cArr2[max10];
                        int i12 = setMin + 79;
                        getMin = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
            }
        }
        return new String(cArr3);
    }
}
