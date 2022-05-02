package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.text.Typography;

public abstract class zzhd {
    private static long getMax = 7217668766473315850L;
    private static int getMin = 1;
    private static int setMax;

    public abstract zzhc zza(OutputStream outputStream, Charset charset) throws IOException;

    public abstract zzhh zza(InputStream inputStream) throws IOException;

    public abstract zzhh zza(InputStream inputStream, Charset charset) throws IOException;

    public abstract zzhh zzak(String str) throws IOException;

    public final String toString(Object obj) throws IOException {
        int i = setMax + 73;
        getMin = i % 128;
        String zza = zza(obj, (i % 2 == 0 ? 'H' : 'U') != 'U');
        int i2 = setMax + 47;
        getMin = i2 % 128;
        if ((i2 % 2 == 0 ? Typography.quote : ',') != '\"') {
            return zza;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return zza;
    }

    public final String zzd(Object obj) throws IOException {
        int i = setMax + 101;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = true;
        String zza = zza(obj, true);
        int i3 = setMax + 35;
        getMin = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return zza;
        }
        Object obj2 = null;
        super.hashCode();
        return zza;
    }

    private final String zza(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzhc zza = zza((OutputStream) byteArrayOutputStream, zzhy.UTF_8);
        boolean z2 = true;
        if (!(!z)) {
            int i = getMin + 121;
            setMax = i % 128;
            if (i % 2 == 0) {
                z2 = false;
            }
            if (z2) {
                zza.zzgm();
                int i2 = 73 / 0;
            } else {
                zza.zzgm();
            }
        }
        zza.zzc(obj);
        zza.flush();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(getMin(new char[]{64109, 7218, 4740, 2315, 3987, 531}).intern());
        int i3 = setMax + 65;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return byteArrayOutputStream2;
    }

    private static String getMin(char[] cArr) {
        char c = cArr[0];
        int i = 1;
        char[] cArr2 = new char[(cArr.length - 1)];
        while (true) {
            if ((i < cArr.length ? '!' : 'P') == 'P') {
                return new String(cArr2);
            }
            int i2 = getMin + 99;
            setMax = i2 % 128;
            int i3 = i2 % 2;
            cArr2[i - 1] = (char) ((int) (((long) (cArr[i] ^ (i * c))) ^ getMax));
            i++;
            int i4 = setMax + 63;
            getMin = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
