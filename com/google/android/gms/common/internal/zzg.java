package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.GmsClientSupervisor;

final class zzg implements Handler.Callback {
    private final /* synthetic */ zzf zza;

    private zzg(zzf zzf) {
        this.zza = zzf;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.zza.zza) {
                GmsClientSupervisor.zza zza2 = (GmsClientSupervisor.zza) message.obj;
                zzh zzh = (zzh) this.zza.zza.get(zza2);
                if (zzh != null && zzh.zzc()) {
                    if (zzh.zza()) {
                        zzh.zzb("GmsClientSupervisor");
                    }
                    this.zza.zza.remove(zza2);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.zza.zza) {
                GmsClientSupervisor.zza zza3 = (GmsClientSupervisor.zza) message.obj;
                zzh zzh2 = (zzh) this.zza.zza.get(zza3);
                if (zzh2 != null && zzh2.zzb() == 3) {
                    String valueOf = String.valueOf(zza3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName zze = zzh2.zze();
                    if (zze == null) {
                        zze = zza3.zzb();
                    }
                    if (zze == null) {
                        zze = new ComponentName((String) Preconditions.checkNotNull(zza3.zza()), "unknown");
                    }
                    zzh2.onServiceDisconnected(zze);
                }
            }
            return true;
        }
    }
}
