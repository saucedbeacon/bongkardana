package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import o.dispatchSaveInstanceState;

public final class zze extends dispatchSaveInstanceState<Void> implements SignInConnectionListener {
    private Semaphore zzbg = new Semaphore(0);
    private Set<GoogleApiClient> zzbh;

    public zze(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzbh = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzf */
    public final Void loadInBackground() {
        int i = 0;
        for (GoogleApiClient maybeSignIn : this.zzbh) {
            if (maybeSignIn.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zzbg.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void onStartLoading() {
        this.zzbg.drainPermits();
        forceLoad();
    }

    public final void onComplete() {
        this.zzbg.release();
    }
}
