package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzjp;

public final class zzjq<T extends Context & zzjp> {
    private final T zza;

    public zzjq(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    private final zzem zzk() {
        return zzfu.zzC(this.zza, (zzcl) null, (Long) null).zzau();
    }

    @MainThread
    public final void zza() {
        zzfu zzC = zzfu.zzC(this.zza, (zzcl) null, (Long) null);
        zzem zzau = zzC.zzau();
        zzC.zzat();
        zzau.zzk().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzb() {
        zzfu zzC = zzfu.zzC(this.zza, (zzcl) null, (Long) null);
        zzem zzau = zzC.zzau();
        zzC.zzat();
        zzau.zzk().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final int zzc(Intent intent, int i, int i2) {
        zzfu zzC = zzfu.zzC(this.zza, (zzcl) null, (Long) null);
        zzem zzau = zzC.zzau();
        if (intent == null) {
            zzau.zze().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzC.zzat();
        zzau.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzd(new zzjm(this, i2, zzau, intent));
        }
        return 2;
    }

    public final void zzd(Runnable runnable) {
        zzkn zza2 = zzkn.zza(this.zza);
        zza2.zzav().zzh(new zzjo(this, zza2, runnable));
    }

    @MainThread
    public final IBinder zze(Intent intent) {
        if (intent == null) {
            zzk().zzb().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgm(zzkn.zza(this.zza), (String) null);
        }
        zzk().zze().zzb("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final boolean zzf(Intent intent) {
        if (intent == null) {
            zzk().zzb().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzk().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzg(JobParameters jobParameters) {
        zzfu zzC = zzfu.zzC(this.zza, (zzcl) null, (Long) null);
        zzem zzau = zzC.zzau();
        String string = jobParameters.getExtras().getString("action");
        zzC.zzat();
        zzau.zzk().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzd(new zzjn(this, zzau, jobParameters));
        return true;
    }

    @MainThread
    public final void zzh(Intent intent) {
        if (intent == null) {
            zzk().zzb().zza("onRebind called with null intent");
            return;
        }
        zzk().zzk().zzb("onRebind called. action", intent.getAction());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzem zzem, JobParameters jobParameters) {
        zzem.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((zzjp) this.zza).zzb(jobParameters, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, zzem zzem, Intent intent) {
        if (((zzjp) this.zza).zza(i)) {
            zzem.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzk().zzk().zza("Completed wakeful intent.");
            ((zzjp) this.zza).zzc(intent);
        }
    }
}
