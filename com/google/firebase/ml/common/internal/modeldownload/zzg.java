package com.google.firebase.ml.common.internal.modeldownload;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;

public final class zzg {
    private final zzh zzbaa;

    public zzg(FirebaseApp firebaseApp) {
        this.zzbaa = new zzh(firebaseApp);
    }

    public final void zza(String str, zzp zzp) throws FirebaseMLException {
        this.zzbaa.zza(str, zzp);
    }

    public final boolean zza(zzy zzy) throws FirebaseMLException {
        return this.zzbaa.zzb(zzy.zzob(), zzy.zzoc());
    }

    public final boolean zzb(String str, zzp zzp) throws FirebaseMLException {
        return this.zzbaa.zzb(str, zzp);
    }
}
