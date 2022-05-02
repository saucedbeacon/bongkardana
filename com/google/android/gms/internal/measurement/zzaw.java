package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class zzaw {
    final List<zzbl> zza = new ArrayList();

    protected zzaw() {
    }

    public abstract zzap zza(String str, zzg zzg, List<zzap> list);

    /* access modifiers changed from: package-private */
    public final zzap zzb(String str) {
        if (this.zza.contains(zzh.zze(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
