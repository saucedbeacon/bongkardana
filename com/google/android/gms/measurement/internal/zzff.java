package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;

public final class zzff {
    private final zza zza;

    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzff(zza zza2) {
        Preconditions.checkNotNull(zza2);
        this.zza = zza2;
    }

    @MainThread
    public final void zza(Context context, Intent intent) {
        zzfu zzC = zzfu.zzC(context, (zzcl) null, (Long) null);
        zzem zzau = zzC.zzau();
        if (intent == null) {
            zzau.zze().zza("Receiver called with null intent");
            return;
        }
        zzC.zzat();
        String action = intent.getAction();
        zzau.zzk().zzb("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzau.zzk().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzau.zze().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}
