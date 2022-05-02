package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class zzfd implements ServiceConnection {
    final /* synthetic */ zzfe zza;
    /* access modifiers changed from: private */
    public final String zzb;

    zzfd(zzfe zzfe, String str) {
        this.zza = zzfe;
        this.zzb = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr zzb2 = zzbq.zzb(iBinder);
                if (zzb2 == null) {
                    this.zza.zza.zzau().zze().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzau().zzk().zza("Install Referrer Service connected");
                this.zza.zza.zzav().zzh(new zzfc(this, zzb2, this));
            } catch (RuntimeException e) {
                this.zza.zza.zzau().zze().zzb("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.zza.zza.zzau().zze().zza("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzau().zzk().zza("Install Referrer Service disconnected");
    }
}
