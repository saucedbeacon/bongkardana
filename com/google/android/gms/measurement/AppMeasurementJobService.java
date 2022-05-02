package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzjp {
    private zzjq<AppMeasurementJobService> zza;

    private final zzjq<AppMeasurementJobService> zzd() {
        if (this.zza == null) {
            this.zza = new zzjq<>(this);
        }
        return this.zza;
    }

    @MainThread
    public final void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @MainThread
    public final void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @MainThread
    public final void onRebind(@NonNull Intent intent) {
        zzd().zzh(intent);
    }

    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        zzd().zzg(jobParameters);
        return true;
    }

    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 296688528 == (max = dispatchOnCancelled.getMax(applicationContext, 296688528)))) {
            onCanceled oncanceled = new onCanceled(296688528, max, 512);
            onCancelLoad.setMax(296688528, oncanceled);
            onCancelLoad.getMin(296688528, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(296688528, oncanceled2);
            onCancelLoad.getMin(296688528, oncanceled2);
        }
        zzd().zzf(intent);
        return true;
    }

    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void zzb(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final void zzc(@NonNull Intent intent) {
    }
}
