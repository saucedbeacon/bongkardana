package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzg implements DynamiteModule.VersionPolicy {
    zzg() {
    }

    public final DynamiteModule.VersionPolicy.zza zza(Context context, String str, DynamiteModule.VersionPolicy.zzb zzb) throws DynamiteModule.LoadingException {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-619669981, oncanceled);
                onCancelLoad.getMin(-619669981, oncanceled);
            }
        }
        DynamiteModule.VersionPolicy.zza zza = new DynamiteModule.VersionPolicy.zza();
        zza.zza = zzb.zza(context, str);
        if (zza.zza != 0) {
            zza.zzb = zzb.zza(context, str, false);
        } else {
            zza.zzb = zzb.zza(context, str, true);
        }
        if (zza.zza == 0 && zza.zzb == 0) {
            zza.zzc = 0;
        } else if (zza.zzb >= zza.zza) {
            zza.zzc = 1;
        } else {
            zza.zzc = -1;
        }
        return zza;
    }
}
