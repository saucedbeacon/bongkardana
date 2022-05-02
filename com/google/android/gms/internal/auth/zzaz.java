package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzaz extends FastSafeParcelableJsonResponse {
    private static int length = 1;
    private static int setMax;
    private static long setMin;
    private static String zzem = "AUTH";

    static void setMin() {
        setMin = 7380820614179844132L;
    }

    public byte[] toByteArray() {
        byte[] bArr;
        int i = setMax + 49;
        length = i % 128;
        byte[] bArr2 = null;
        if ((i % 2 == 0 ? 29 : '7') != '7') {
            try {
                bArr = toString().getBytes(setMax(new char[]{55733, 10692, 17178, 32125, 38621, 45205}).intern());
                try {
                    super.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (UnsupportedEncodingException e) {
                Log.e(zzem, "Error serializing object.", e);
                return bArr2;
            }
        } else {
            bArr = toString().getBytes(setMax(new char[]{55733, 10692, 17178, 32125, 38621, 45205}).intern());
        }
        int i2 = length + 17;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    static {
        setMin();
        try {
            int i = length + 37;
            try {
                setMax = i % 128;
                if ((i % 2 != 0 ? (char) 14 : 18) == 14) {
                    int i2 = 18 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMax(char[] cArr) {
        int i = setMax + 21;
        length = i % 128;
        int i2 = i % 2;
        char c = cArr[0];
        char[] cArr2 = new char[(cArr.length - 1)];
        int i3 = setMax + 99;
        length = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 1;
        while (true) {
            if (i5 >= cArr.length) {
                return new String(cArr2);
            }
            cArr2[i5 - 1] = (char) ((int) (((long) (cArr[i5] ^ (i5 * c))) ^ setMin));
            i5++;
        }
    }
}
