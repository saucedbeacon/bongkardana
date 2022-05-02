package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzb implements DynamiteModule.VersionPolicy.zzb {
    zzb() {
    }

    public final int zza(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.zza(context, str, z);
    }

    public final int zza(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(715994706, oncanceled);
                onCancelLoad.getMin(715994706, oncanceled);
            }
        }
        return DynamiteModule.getLocalVersion(context, str);
    }
}
