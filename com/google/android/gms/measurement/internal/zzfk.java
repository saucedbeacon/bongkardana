package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

final class zzfk implements zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfl zzb;

    zzfk(zzfl zzfl, String str) {
        this.zzb = zzfl;
        this.zza = str;
    }

    public final String zza(String str) {
        Map map = (Map) this.zzb.zzc.get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
