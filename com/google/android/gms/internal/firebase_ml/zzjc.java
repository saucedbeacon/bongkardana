package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class zzjc {
    private static char[] getMax = null;
    private static long getMin = 0;
    private static int length = 0;
    private static int setMin = 1;
    private static final zzjb zzadg = new zzje("-_.*", true);
    private static final zzjb zzadh = new zzje("-_.!~*'()@:$&,;=", false);
    private static final zzjb zzadi = new zzje("-_.!~*'()@:$&,;=+/?", false);
    private static final zzjb zzadj = new zzje("-_.!~*'():$&,;=", false);
    private static final zzjb zzadk = new zzje("-_.!~*'()@:$,;/?:", false);

    static void length() {
        getMax = new char[]{49008, 42389, 35499, 61348, 54413};
        getMin = -2856591803825055004L;
    }

    public static String zzao(String str) {
        try {
            int i = length + 57;
            setMin = i % 128;
            int i2 = i % 2;
            try {
                String zzan = zzadg.zzan(str);
                int i3 = length + 89;
                setMin = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return zzan;
                }
                Object obj = null;
                super.hashCode();
                return zzan;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String zzap(String str) {
        int i = setMin + 23;
        length = i % 128;
        int i2 = i % 2;
        try {
            String decode = URLDecoder.decode(str, setMin(TextUtils.indexOf("", '0') + 1, (char) (48934 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), TextUtils.indexOf("", "", 0) + 5).intern());
            int i3 = length + 113;
            setMin = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return decode;
            }
            int i4 = 6 / 0;
            return decode;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String zzaq(String str) {
        try {
            int i = length + 21;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                String zzan = zzadh.zzan(str);
                int i3 = setMin + 27;
                length = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return zzan;
                }
                int i4 = 42 / 0;
                return zzan;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String zzar(String str) {
        try {
            int i = length + 59;
            setMin = i % 128;
            int i2 = i % 2;
            String zzan = zzadi.zzan(str);
            try {
                int i3 = length + 105;
                setMin = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return zzan;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return zzan;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String zzas(String str) {
        int i = setMin + 55;
        length = i % 128;
        int i2 = i % 2;
        try {
            String zzan = zzadj.zzan(str);
            int i3 = length + 117;
            setMin = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return zzan;
            }
            int i4 = 95 / 0;
            return zzan;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String zzat(String str) {
        int i = length + 43;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            String zzan = zzadk.zzan(str);
            int i3 = setMin + 83;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                return zzan;
            }
            Object obj = null;
            super.hashCode();
            return zzan;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        length();
        int i = setMin + 45;
        length = i % 128;
        if ((i % 2 != 0 ? 'V' : 24) == 'V') {
            int i2 = 52 / 0;
        }
    }

    private static String setMin(int i, char c, int i2) {
        int i3 = setMin + 73;
        length = i3 % 128;
        if (i3 % 2 != 0) {
        }
        int i4 = 0;
        char[] cArr = new char[i2];
        while (true) {
            if ((i4 < i2 ? '!' : '\\') != '!') {
                String str = new String(cArr);
                try {
                    int i5 = length + 85;
                    setMin = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    int i7 = length + 1;
                    setMin = i7 % 128;
                    int i8 = i7 % 2;
                    cArr[i4] = (char) ((int) ((((long) getMax[i + i4]) ^ (((long) i4) * getMin)) ^ ((long) c)));
                    i4++;
                    int i9 = setMin + 39;
                    length = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }
}
