package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

final class zzhh implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhw zzb;

    zzhh(zzhw zzhw, Bundle bundle) {
        this.zzb = zzhw;
        this.zza = bundle;
    }

    public final void run() {
        zzkq zzkq;
        zzhw zzhw = this.zzb;
        Bundle bundle = this.zza;
        zzhw.zzg();
        zzhw.zzb();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        if (zzhw.zzs.zzF()) {
            if (zzhw.zzs.zzc().zzn((String) null, zzea.zzax)) {
                zzkq = new zzkq(bundle.getString("name"), 0, (Object) null, "");
            } else {
                zzkq = new zzkq(bundle.getString("name"), 0, (Object) null, (String) null);
            }
            try {
                zzhw.zzs.zzy().zzm(new zzaa(bundle.getString("app_id"), bundle.getString("origin"), zzkq, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzas) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzas) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhw.zzs.zzl().zzV(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false)));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            zzhw.zzs.zzau().zzk().zza("Conditional property not cleared since app measurement is disabled");
        }
    }
}
