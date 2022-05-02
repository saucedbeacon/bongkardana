package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzx;
import com.google.android.gms.internal.auth.zzz;

final class zzi extends AccountTransferClient.zzc {
    private final /* synthetic */ zzah zzat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(AccountTransferClient accountTransferClient, zzah zzah) {
        super((zzc) null);
        this.zzat = zzah;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzz zzz) throws RemoteException {
        zzz.zza((zzx) this.zzax, this.zzat);
    }
}
