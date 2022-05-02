package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

public final class zzg implements zza {
    /* access modifiers changed from: private */
    public final AnalyticsConnector.AnalyticsConnectorListener zza;
    private final AppMeasurementSdk zzb;
    private final zzf zzc;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = appMeasurementSdk;
        zzf zzf = new zzf(this);
        this.zzc = zzf;
        this.zzb.registerOnMeasurementEventListener(zzf);
    }

    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    public final void zzb(Set<String> set) {
    }

    public final void zzc() {
    }
}
