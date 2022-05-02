package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import java.util.HashMap;
import java.util.Map;

final class zzh implements ServiceConnection, zzj {
    private final Map<ServiceConnection, ServiceConnection> zza = new HashMap();
    private int zzb = 2;
    private boolean zzc;
    @Nullable
    private IBinder zzd;
    private final GmsClientSupervisor.zza zze;
    private ComponentName zzf;
    private final /* synthetic */ zzf zzg;

    public zzh(zzf zzf2, GmsClientSupervisor.zza zza2) {
        this.zzg = zzf2;
        this.zze = zza2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zzg.zza) {
            this.zzg.zzc.removeMessages(1, this.zze);
            this.zzd = iBinder;
            this.zzf = componentName;
            for (ServiceConnection onServiceConnected : this.zza.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.zzb = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zzg.zza) {
            this.zzg.zzc.removeMessages(1, this.zze);
            this.zzd = null;
            this.zzf = componentName;
            for (ServiceConnection onServiceDisconnected : this.zza.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.zzb = 2;
        }
    }

    public final void zza(String str) {
        this.zzb = 3;
        boolean zza2 = this.zzg.zzd.zza(this.zzg.zzb, str, this.zze.zza(this.zzg.zzb), this, this.zze.zzc());
        this.zzc = zza2;
        if (zza2) {
            this.zzg.zzc.sendMessageDelayed(this.zzg.zzc.obtainMessage(1, this.zze), this.zzg.zzf);
            return;
        }
        this.zzb = 2;
        try {
            this.zzg.zzd.unbindService(this.zzg.zzb, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void zzb(String str) {
        this.zzg.zzc.removeMessages(1, this.zze);
        this.zzg.zzd.unbindService(this.zzg.zzb, this);
        this.zzc = false;
        this.zzb = 2;
    }

    public final void zza(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zza.put(serviceConnection, serviceConnection2);
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
        this.zza.remove(serviceConnection);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final boolean zza(ServiceConnection serviceConnection) {
        return this.zza.containsKey(serviceConnection);
    }

    public final boolean zzc() {
        return this.zza.isEmpty();
    }

    @Nullable
    public final IBinder zzd() {
        return this.zzd;
    }

    public final ComponentName zze() {
        return this.zzf;
    }
}
