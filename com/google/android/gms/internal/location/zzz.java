package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

final class zzz extends zzab {
    private final /* synthetic */ LocationListener zzcl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzz(zzq zzq, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.zzcl = locationListener;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zza((ListenerHolder.ListenerKey<LocationListener>) ListenerHolders.createListenerKey(this.zzcl, LocationListener.class.getSimpleName()), (zzaj) new zzac(this));
    }
}
