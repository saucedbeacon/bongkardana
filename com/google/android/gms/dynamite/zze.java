package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zze implements DynamiteModule.VersionPolicy {
    zze() {
    }

    public final DynamiteModule.VersionPolicy.zza zza(Context context, String str, DynamiteModule.VersionPolicy.zzb zzb) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zza zza = new DynamiteModule.VersionPolicy.zza();
        zza.zza = zzb.zza(context, str);
        if (zza.zza != 0) {
            zza.zzb = zzb.zza(context, str, false);
        } else {
            zza.zzb = zzb.zza(context, str, true);
        }
        if (zza.zza == 0 && zza.zzb == 0) {
            zza.zzc = 0;
        } else if (zza.zza >= zza.zzb) {
            zza.zzc = -1;
        } else {
            zza.zzc = 1;
        }
        return zza;
    }
}
