package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzjp {
    static final zzjp zza = new zzjp(true);
    private static volatile boolean zzb = false;
    private static volatile zzjp zzc;
    private static volatile zzjp zzd;
    private final Map<zzjo, zzkb<?, ?>> zze;

    zzjp() {
        this.zze = new HashMap();
    }

    public static zzjp zza() {
        zzjp zzjp = zzc;
        if (zzjp == null) {
            synchronized (zzjp.class) {
                zzjp = zzc;
                if (zzjp == null) {
                    zzjp = zza;
                    zzc = zzjp;
                }
            }
        }
        return zzjp;
    }

    public final <ContainingType extends zzli> zzkb<ContainingType, ?> zzc(ContainingType containingtype, int i) {
        return this.zze.get(new zzjo(containingtype, i));
    }

    zzjp(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzjp zzb() {
        Class<zzjp> cls = zzjp.class;
        zzjp zzjp = zzd;
        if (zzjp != null) {
            return zzjp;
        }
        synchronized (cls) {
            zzjp zzjp2 = zzd;
            if (zzjp2 != null) {
                return zzjp2;
            }
            zzjp zzb2 = zzjx.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }
}
