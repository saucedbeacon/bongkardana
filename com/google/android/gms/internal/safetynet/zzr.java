package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.safetynet.zzk;

final class zzr extends zzk.zze {
    private final /* synthetic */ String zzac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(zzk zzk, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zzac = str;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzi) ((zzx) anyClient).getService()).zza(this.zzaf, this.zzac);
    }
}
