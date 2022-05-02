package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import java.util.concurrent.TimeUnit;

public final class zzqc implements zzok<ResultType, zzqa>, zzpd {
    private final GoogleApiClient zzbgw;
    private final zzqb zzbgy;
    private final /* synthetic */ zzpz zzbgz;

    zzqc(zzpz zzpz, FirebaseApp firebaseApp, boolean z) {
        this.zzbgz = zzpz;
        if (z) {
            GoogleApiClient build = new GoogleApiClient.Builder(firebaseApp.getApplicationContext()).addApi(AuthProxy.API).build();
            this.zzbgw = build;
            build.connect();
        } else {
            this.zzbgw = null;
        }
        this.zzbgy = zzqb.zza(firebaseApp, z, this.zzbgw);
    }

    public final zzpd zzmv() {
        return this;
    }

    @WorkerThread
    public final void zzne() throws FirebaseMLException {
        GoogleApiClient googleApiClient = this.zzbgw;
        if (googleApiClient != null && googleApiClient.blockingConnect(3, TimeUnit.SECONDS) != ConnectionResult.RESULT_SUCCESS) {
            throw new FirebaseMLException("Failed to contact Google Play services", 14);
        }
    }

    public final void release() {
        GoogleApiClient googleApiClient = this.zzbgw;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    @WorkerThread
    public final /* synthetic */ Object zza(zzoo zzoo) throws FirebaseMLException {
        zzqa zzqa = (zzqa) zzoo;
        return this.zzbgz.zza(this.zzbgy.zza(zzqa), zzqa.zzbgr);
    }
}
