package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzdn extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdn(zzee zzee, Bundle bundle) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setDefaultEventParameters(this.zza);
    }
}
