package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzhf implements zzis {
    private final zzhd zzzb;
    private final Set<String> zzzg;

    protected zzhf(zzhe zzhe) {
        this.zzzb = zzhe.zzzb;
        this.zzzg = new HashSet(zzhe.zzzf);
    }

    public final <T> T zza(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        zzhh zza = this.zzzb.zza(inputStream, charset);
        if (!this.zzzg.isEmpty()) {
            try {
                boolean z = (zza.zza(this.zzzg) == null || zza.zzgr() == zzhj.END_OBJECT) ? false : true;
                Object[] objArr = {this.zzzg};
                if (!z) {
                    throw new IllegalArgumentException(zzlx.zzb("wrapper key(s) not found: %s", objArr));
                }
            } catch (Throwable th) {
                zza.close();
                throw th;
            }
        }
        return zza.zza(cls, true, (zzhb) null);
    }

    public final zzhd zzfc() {
        return this.zzzb;
    }

    public final Set<String> zzgo() {
        return Collections.unmodifiableSet(this.zzzg);
    }
}
