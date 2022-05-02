package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import o.onActivityPreCreated;

public final class zzjr {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    protected static final Charset UTF_8 = Charset.forName(setMin(new char[]{59886, 59835, 58521, 31060, 20355, 12174, 50103, 49776, 17595}).intern());
    private static int length = 1;
    private static int setMax;
    private static long setMin;
    public static final Object zzado = new Object();

    static void getMin() {
        setMin = -2662434031910671538L;
    }

    public static void zza(zzjn zzjn, zzjn zzjn2) {
        int i = length + 125;
        setMax = i % 128;
        int i2 = i % 2;
        if ((zzjn.zzadg != null ? '2' : '#') == '2') {
            zzjn2.zzadg = (zzjp) zzjn.zzadg.clone();
        }
        int i3 = setMax + 95;
        length = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        getMin();
        int i = setMax + 67;
        length = i % 128;
        if ((i % 2 == 0 ? 'C' : 'J') == 'C') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    private static String setMin(char[] cArr) {
        int i = setMax + 101;
        length = i % 128;
        int i2 = i % 2;
        char[] length2 = onActivityPreCreated.length(setMin, cArr);
        int i3 = setMax + 33;
        length = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 4;
        while (true) {
            if (!(i5 < length2.length)) {
                return new String(length2, 4, length2.length - 4);
            }
            length2[i5] = (char) ((int) (((long) (length2[i5] ^ length2[i5 % 4])) ^ (((long) (i5 - 4)) * setMin)));
            i5++;
        }
    }
}
