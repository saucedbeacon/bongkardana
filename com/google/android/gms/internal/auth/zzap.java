package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

abstract class zzap extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzak> {
    public zzap(GoogleApiClient googleApiClient) {
        super((Api<?>) AuthProxy.API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzan zzan) throws RemoteException;

    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzak zzak = (zzak) anyClient;
        zza(zzak.getContext(), (zzan) zzak.getService());
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzaw(status);
    }
}
