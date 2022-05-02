package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class zzf extends GmsClientSupervisor {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")
    public final HashMap<GmsClientSupervisor.zza, zzh> zza = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final Handler zzc;
    /* access modifiers changed from: private */
    public final ConnectionTracker zzd;
    private final long zze;
    /* access modifiers changed from: private */
    public final long zzf;

    zzf(Context context) {
        this.zzb = context.getApplicationContext();
        this.zzc = new zzi(context.getMainLooper(), new zzg(this));
        this.zzd = ConnectionTracker.getInstance();
        this.zze = 5000;
        this.zzf = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(GmsClientSupervisor.zza zza2, ServiceConnection serviceConnection, String str) {
        boolean zza3;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zza) {
            zzh zzh = this.zza.get(zza2);
            if (zzh == null) {
                zzh = new zzh(this, zza2);
                zzh.zza(serviceConnection, serviceConnection, str);
                zzh.zza(str);
                this.zza.put(zza2, zzh);
            } else {
                this.zzc.removeMessages(0, zza2);
                if (!zzh.zza(serviceConnection)) {
                    zzh.zza(serviceConnection, serviceConnection, str);
                    int zzb2 = zzh.zzb();
                    if (zzb2 == 1) {
                        serviceConnection.onServiceConnected(zzh.zze(), zzh.zzd());
                    } else if (zzb2 == 2) {
                        zzh.zza(str);
                    }
                } else {
                    String valueOf = String.valueOf(zza2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            zza3 = zzh.zza();
        }
        return zza3;
    }

    /* access modifiers changed from: protected */
    public final void zzb(GmsClientSupervisor.zza zza2, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zza) {
            zzh zzh = this.zza.get(zza2);
            if (zzh == null) {
                String valueOf = String.valueOf(zza2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (zzh.zza(serviceConnection)) {
                zzh.zza(serviceConnection, str);
                if (zzh.zzc()) {
                    this.zzc.sendMessageDelayed(this.zzc.obtainMessage(0, zza2), this.zze);
                }
            } else {
                String valueOf2 = String.valueOf(zza2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
