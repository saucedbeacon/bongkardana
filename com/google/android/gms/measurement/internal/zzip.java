package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzip implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzjk zzc;

    zzip(zzjk zzjk, AtomicReference atomicReference, zzp zzp) {
        this.zzc = zzjk;
        this.zza = atomicReference;
        this.zzb = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                if (!this.zzc.zzs.zzd().zzi().zzh()) {
                    this.zzc.zzs.zzau().zzh().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzk().zzE((String) null);
                    this.zzc.zzs.zzd().zze.zzb((String) null);
                    this.zza.set((Object) null);
                    this.zza.notify();
                    return;
                }
                zzed zzM = this.zzc.zzb;
                if (zzM == null) {
                    this.zzc.zzs.zzau().zzb().zza("Failed to get app instance id");
                    this.zza.notify();
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzM.zzl(this.zzb));
                String str = (String) this.zza.get();
                if (str != null) {
                    this.zzc.zzs.zzk().zzE(str);
                    this.zzc.zzs.zzd().zze.zzb(str);
                }
                this.zzc.zzP();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.zzc.zzs.zzau().zzb().zzb("Failed to get app instance id", e);
                    atomicReference = this.zza;
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            }
        }
    }
}
