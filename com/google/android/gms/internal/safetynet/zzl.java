package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.safetynet.zzk;

final class zzl extends zzk.zzb {
    private final /* synthetic */ byte[] zzw;
    private final /* synthetic */ String zzx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzl(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        super(googleApiClient);
        this.zzw = bArr;
        this.zzx = str;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzx zzx2 = (zzx) anyClient;
        zzg zzg = this.zzaf;
        byte[] bArr = this.zzw;
        String str = this.zzx;
        if (TextUtils.isEmpty(str)) {
            str = zzx2.zzb("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzi) zzx2.getService()).zza(zzg, bArr, str);
    }
}
