package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

public final class zzkc extends zzke {
    private final AlarmManager zza = ((AlarmManager) this.zzs.zzax().getSystemService("alarm"));
    private zzal zzb;
    private Integer zzc;

    protected zzkc(zzkn zzkn) {
        super(zzkn);
    }

    private final zzal zzf() {
        if (this.zzb == null) {
            this.zzb = new zzkb(this, this.zzf.zzN());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzh() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzax().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            String valueOf = String.valueOf(this.zzs.zzax().getPackageName());
            this.zzc = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzj() {
        Context zzax = this.zzs.zzax();
        return zzbs.zza(zzax, 0, new Intent().setClassName(zzax, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    /* access modifiers changed from: protected */
    public final boolean zzaA() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzh();
        return false;
    }

    public final void zzc(long j) {
        zzZ();
        this.zzs.zzat();
        Context zzax = this.zzs.zzax();
        if (!zzku.zzam(zzax)) {
            this.zzs.zzau().zzj().zza("Receiver not registered/enabled");
        }
        if (!zzku.zzP(zzax, false)) {
            this.zzs.zzau().zzj().zza("Service not registered/enabled");
        }
        zzd();
        this.zzs.zzau().zzk().zzb("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.zzs.zzay().elapsedRealtime() + j;
        this.zzs.zzc();
        if (j < Math.max(0, zzea.zzw.zzb(null).longValue()) && !zzf().zzc()) {
            zzf().zzb(j);
        }
        this.zzs.zzat();
        if (Build.VERSION.SDK_INT >= 24) {
            Context zzax2 = this.zzs.zzax();
            ComponentName componentName = new ComponentName(zzax2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int zzi = zzi();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzbt.zza(zzax2, new JobInfo.Builder(zzi, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            this.zzs.zzc();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(zzea.zzr.zzb(null).longValue(), j), zzj());
        }
    }

    public final void zzd() {
        zzZ();
        this.zzs.zzau().zzk().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzf().zzd();
        if (Build.VERSION.SDK_INT >= 24) {
            zzh();
        }
    }
}
