package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class zzed implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzee zza;

    zzed(zzee zzee) {
        this.zza = zzee;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zza.zzS(new zzdw(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzS(new zzec(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzS(new zzdz(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.zza.zzS(new zzdy(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbz = new zzbz();
        this.zza.zzS(new zzeb(this, activity, zzbz));
        Bundle zzd = zzbz.zzd(50);
        if (zzd != null) {
            bundle.putAll(zzd);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.zza.zzS(new zzdx(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.zza.zzS(new zzea(this, activity));
    }
}
