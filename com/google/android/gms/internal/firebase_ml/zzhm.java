package com.google.android.gms.internal.firebase_ml;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

public final class zzhm extends zzhd {
    public static zzhm zzhg() {
        return zzhl.zzzx;
    }

    public final zzhh zza(InputStream inputStream) {
        return zza((Reader) new InputStreamReader(inputStream, zzhy.UTF_8));
    }

    public final zzhh zza(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return zza(inputStream);
        }
        return zza((Reader) new InputStreamReader(inputStream, charset));
    }

    public final zzhh zzak(String str) {
        return zza((Reader) new StringReader(str));
    }

    private final zzhh zza(Reader reader) {
        return new zzhn(this, new zzrh(reader));
    }

    public final zzhc zza(OutputStream outputStream, Charset charset) {
        return new zzho(this, new zzrm(new OutputStreamWriter(outputStream, charset)));
    }
}
