package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzin implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjk zzd;

    zzin(zzjk zzjk, AtomicReference atomicReference, zzp zzp, boolean z) {
        this.zzd = zzjk;
        this.zza = atomicReference;
        this.zzb = zzp;
        this.zzc = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                zzed zzM = this.zzd.zzb;
                if (zzM == null) {
                    this.zzd.zzs.zzau().zzb().zza("Failed to get all user properties; not connected to service");
                    this.zza.notify();
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzM.zzi(this.zzb, this.zzc));
                this.zzd.zzP();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.zzd.zzs.zzau().zzb().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.zza;
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            }
        }
    }
}
