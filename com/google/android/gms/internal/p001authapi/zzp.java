package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth-api.zzp  reason: invalid package */
abstract class zzp<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzr> {
    zzp(GoogleApiClient googleApiClient) {
        super((Api<?>) Auth.CREDENTIALS_API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zzc(Context context, zzw zzw) throws DeadObjectException, RemoteException;

    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzr zzr = (zzr) anyClient;
        zzc(zzr.getContext(), (zzw) zzr.getService());
    }
}
