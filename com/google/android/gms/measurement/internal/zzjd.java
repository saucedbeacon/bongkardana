package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zzjd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzp zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjk zzf;

    zzjd(zzjk zzjk, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp, boolean z) {
        this.zzf = zzjk;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzp;
        this.zze = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                zzed zzM = this.zzf.zzb;
                if (zzM == null) {
                    this.zzf.zzs.zzau().zzb().zzd("(legacy) Failed to get user properties; not connected to service", (Object) null, this.zzb, this.zzc);
                    this.zza.set(Collections.emptyList());
                    this.zza.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.checkNotNull(this.zzd);
                    this.zza.set(zzM.zzo(this.zzb, this.zzc, this.zze, this.zzd));
                } else {
                    this.zza.set(zzM.zzp((String) null, this.zzb, this.zzc, this.zze));
                }
                this.zzf.zzP();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.zzf.zzs.zzau().zzb().zzd("(legacy) Failed to get user properties; remote exception", (Object) null, this.zzb, e);
                    this.zza.set(Collections.emptyList());
                    atomicReference = this.zza;
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            }
        }
    }
}
