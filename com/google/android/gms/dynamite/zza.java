package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zza implements DynamiteModule.VersionPolicy {
    zza() {
    }

    public final DynamiteModule.VersionPolicy.zza zza(Context context, String str, DynamiteModule.VersionPolicy.zzb zzb) throws DynamiteModule.LoadingException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-881638895, oncanceled);
            onCancelLoad.getMin(-881638895, oncanceled);
        }
        DynamiteModule.VersionPolicy.zza zza = new DynamiteModule.VersionPolicy.zza();
        zza.zzb = zzb.zza(context, str, true);
        if (zza.zzb != 0) {
            zza.zzc = 1;
        } else {
            zza.zza = zzb.zza(context, str);
            if (zza.zza != 0) {
                zza.zzc = -1;
            }
        }
        return zza;
    }
}
