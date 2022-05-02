package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class AppMeasurementService extends Service implements zzjp {
    private zzjq<AppMeasurementService> zza;

    private final zzjq<AppMeasurementService> zzd() {
        if (this.zza == null) {
            this.zza = new zzjq<>(this);
        }
        return this.zza;
    }

    @MainThread
    @NonNull
    public final IBinder onBind(@NonNull Intent intent) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1507246225, oncanceled);
            onCancelLoad.getMin(1507246225, oncanceled);
        }
        return zzd().zze(intent);
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

    @MainThread
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(155416981, oncanceled);
            onCancelLoad.getMin(155416981, oncanceled);
        }
        zzd().zzc(intent, i, i2);
        return 2;
    }

    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(903865941, oncanceled);
            onCancelLoad.getMin(903865941, oncanceled);
        }
        zzd().zzf(intent);
        return true;
    }

    public final boolean zza(int i) {
        int min;
        int length;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length, 4);
            onCancelLoad.setMax(-1405753941, oncanceled);
            onCancelLoad.getMin(-1405753941, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1405753941, oncanceled2);
            onCancelLoad.getMin(-1405753941, oncanceled2);
        }
        return stopSelfResult(i);
    }

    public final void zzb(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void zzc(@NonNull Intent intent) {
        AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
