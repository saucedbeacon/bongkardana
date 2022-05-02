package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzc implements DynamiteModule.VersionPolicy {
    zzc() {
    }

    public final DynamiteModule.VersionPolicy.zza zza(Context context, String str, DynamiteModule.VersionPolicy.zzb zzb) throws DynamiteModule.LoadingException {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(-1514540721, oncanceled);
                onCancelLoad.getMin(-1514540721, oncanceled);
            }
        }
        DynamiteModule.VersionPolicy.zza zza = new DynamiteModule.VersionPolicy.zza();
        zza.zzb = zzb.zza(context, str, false);
        if (zza.zzb == 0) {
            zza.zzc = 0;
        } else {
            zza.zzc = 1;
        }
        return zza;
    }
}
