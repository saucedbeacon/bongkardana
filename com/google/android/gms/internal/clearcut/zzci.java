package com.google.android.gms.internal.clearcut;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzci {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName(length(AndroidCharacter.getMirror('0') + 164, 5 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{17, 16, 2, 65513, 65524}, !TextUtils.isEmpty(""), 5 - KeyEvent.keyCodeFromString("")).intern());
    private static int getMax = 1;
    private static int length;
    private static int setMin;
    public static final byte[] zzkt;
    private static final ByteBuffer zzku;
    private static final zzbk zzkv;

    static {
        setMin();
        byte[] bArr = new byte[0];
        zzkt = bArr;
        zzku = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzkt;
        zzkv = zzbk.zza(bArr2, 0, bArr2.length, false);
        int i = getMax + 63;
        setMin = i % 128;
        if ((i % 2 != 0 ? '.' : '+') == '.') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T checkNotNull(T r3) {
        /*
            int r0 = getMax
            int r0 = r0 + 55
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 41
            if (r0 == 0) goto L_0x0011
            r0 = 83
            goto L_0x0013
        L_0x0011:
            r0 = 41
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001c
            int r0 = r2.length     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x003b
            goto L_0x001e
        L_0x001a:
            r3 = move-exception
            throw r3
        L_0x001c:
            if (r3 == 0) goto L_0x003b
        L_0x001e:
            int r0 = getMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 45
            if (r0 == 0) goto L_0x002f
            r0 = 78
            goto L_0x0031
        L_0x002f:
            r0 = 45
        L_0x0031:
            if (r0 == r1) goto L_0x003a
            r0 = 74
            int r0 = r0 / 0
            return r3
        L_0x0038:
            r3 = move-exception
            throw r3
        L_0x003a:
            return r3
        L_0x003b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzci.checkNotNull(java.lang.Object):java.lang.Object");
    }

    public static int hashCode(byte[] bArr) {
        try {
            int i = setMin + 57;
            getMax = i % 128;
            int i2 = i % 2;
            int length2 = bArr.length;
            boolean z = false;
            int zza = zza(length2, bArr, 0, length2);
            if (zza != 0) {
                z = true;
            }
            if (z) {
                return zza;
            }
            int i3 = getMax + 23;
            setMin = i3 % 128;
            if (i3 % 2 != 0) {
            }
            return 1;
        } catch (Exception e) {
            throw e;
        }
    }

    static void setMin() {
        length = 144;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        try {
            int i4 = getMax + 85;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2;
            while (true) {
                if ((i6 < i2 + i3 ? '.' : 23) != '.') {
                    return i;
                }
                i = (i * 31) + bArr[i6];
                i6++;
                int i7 = getMax + 81;
                setMin = i7 % 128;
                int i8 = i7 % 2;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    static Object zza(Object obj, Object obj2) {
        zzdo zzdo;
        int i = getMax + 45;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            try {
                try {
                    zzdo = ((zzdo) obj).zzbc().zza((zzdo) obj2).zzbi();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            zzdo = ((zzdo) obj).zzbc().zza((zzdo) obj2).zzbi();
            Object obj3 = null;
            super.hashCode();
        }
        int i2 = getMax + 75;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        return zzdo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        throw new java.lang.NullPointerException(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T zza(T r3, java.lang.String r4) {
        /*
            int r0 = getMax     // Catch:{ Exception -> 0x0040 }
            int r0 = r0 + 5
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0040 }
            int r0 = r0 % 2
            r1 = 21
            if (r0 == 0) goto L_0x0011
            r0 = 17
            goto L_0x0013
        L_0x0011:
            r0 = 21
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001e
            super.hashCode()     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x003a
            goto L_0x0020
        L_0x001c:
            r3 = move-exception
            throw r3
        L_0x001e:
            if (r3 == 0) goto L_0x003a
        L_0x0020:
            int r4 = getMax
            int r4 = r4 + 109
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            r0 = 63
            if (r4 == 0) goto L_0x0031
            r4 = 63
            goto L_0x0033
        L_0x0031:
            r4 = 44
        L_0x0033:
            if (r4 == r0) goto L_0x0036
            return r3
        L_0x0036:
            int r4 = r2.length     // Catch:{ all -> 0x0038 }
            return r3
        L_0x0038:
            r3 = move-exception
            throw r3
        L_0x003a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>(r4)
            throw r3
        L_0x0040:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzci.zza(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static int zzc(boolean z) {
        int i = setMin + 39;
        getMax = i % 128;
        int i2 = i % 2;
        if ((z ? 'F' : 5) != 'F') {
            return 1237;
        }
        try {
            int i3 = getMax + 7;
            setMin = i3 % 128;
            return !(i3 % 2 != 0) ? 1231 : 24657;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean zze(byte[] bArr) {
        try {
            int i = getMax + 99;
            setMin = i % 128;
            int i2 = i % 2;
            boolean zze = zzff.zze(bArr);
            int i3 = getMax + 17;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return zze;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String zzf(byte[] bArr) {
        String str = new String(bArr, UTF_8);
        int i = setMin + 103;
        getMax = i % 128;
        int i2 = i % 2;
        return str;
    }

    static boolean zzf(zzdo zzdo) {
        int i = setMin + 11;
        getMax = i % 128;
        return !(i % 2 != 0);
    }

    public static int zzl(long j) {
        int i = setMin + 67;
        getMax = i % 128;
        return (int) (j ^ (i % 2 == 0 ? j >> 99 : j >>> 32));
    }

    private static String length(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = setMin + 35;
            getMax = i5 % 128;
            if (i5 % 2 == 0) {
                cArr2[i4] = (char) (i >> cArr[i4]);
                cArr2[i4] = (char) (cArr2[i4] << length);
                i4 += 55;
            } else {
                cArr2[i4] = (char) (cArr[i4] + i);
                cArr2[i4] = (char) (cArr2[i4] - length);
                i4++;
            }
            int i6 = getMax + 67;
            setMin = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!(i2 <= 0)) {
            int i8 = getMax + 113;
            setMin = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i10 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i10, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i10);
        }
        if ((z ? 'A' : '/') == 'A') {
            char[] cArr4 = new char[i3];
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = setMin + 9;
                getMax = i12 % 128;
                int i13 = i12 % 2;
                cArr4[i11] = cArr2[(i3 - i11) - 1];
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
