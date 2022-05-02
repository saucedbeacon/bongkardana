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

abstract class zzaq extends BaseImplementation.ApiMethodImpl<ProxyApi.SpatulaHeaderResult, zzak> {
    public zzaq(GoogleApiClient googleApiClient) {
        super((Api<?>) AuthProxy.API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzan zzan) throws RemoteException;

    protected static ProxyApi.SpatulaHeaderResult zzc(Status status) {
        return new zzax(status);
    }

    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzak zzak = (zzak) anyClient;
        zza(zzak.getContext(), (zzan) zzak.getService());
    }

    public /* synthetic */ Result createFailedResult(Status status) {
        return zzc(status);
    }
}
