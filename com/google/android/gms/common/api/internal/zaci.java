package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class zaci<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */
    @Nullable
    public ResultTransform<? super R, ? extends Result> zaa = null;
    /* access modifiers changed from: private */
    @Nullable
    public zaci<? extends Result> zab = null;
    @Nullable
    private volatile ResultCallbacks<? super R> zac = null;
    @Nullable
    private PendingResult<R> zad = null;
    /* access modifiers changed from: private */
    public final Object zae = new Object();
    @Nullable
    private Status zaf = null;
    /* access modifiers changed from: private */
    public final WeakReference<GoogleApiClient> zag;
    /* access modifiers changed from: private */
    public final zack zah;
    private boolean zai = false;

    public zaci(WeakReference<GoogleApiClient> weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zag = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        this.zah = new zack(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zaci<? extends Result> zaci;
        synchronized (this.zae) {
            boolean z = true;
            Preconditions.checkState(this.zaa == null, "Cannot call then() twice.");
            if (this.zac != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = resultTransform;
            zaci = new zaci<>(this.zag);
            this.zab = zaci;
            zab();
        }
        return zaci;
    }

    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zae) {
            boolean z = true;
            Preconditions.checkState(this.zac == null, "Cannot call andFinally() twice.");
            if (this.zaa != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zac = resultCallbacks;
            zab();
        }
    }

    public final void onResult(R r) {
        synchronized (this.zae) {
            if (!r.getStatus().isSuccess()) {
                zaa(r.getStatus());
                zaa((Result) r);
            } else if (this.zaa != null) {
                zabz.zaa().submit(new zacl(this, r));
            } else if (zac()) {
                ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onSuccess(r);
            }
        }
    }

    public final void zaa(PendingResult<?> pendingResult) {
        synchronized (this.zae) {
            this.zad = pendingResult;
            zab();
        }
    }

    @GuardedBy("mSyncToken")
    private final void zab() {
        if (this.zaa != null || this.zac != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zag.get();
            if (!(this.zai || this.zaa == null || googleApiClient == null)) {
                googleApiClient.zaa(this);
                this.zai = true;
            }
            Status status = this.zaf;
            if (status != null) {
                zab(status);
                return;
            }
            PendingResult<R> pendingResult = this.zad;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zaa(Status status) {
        synchronized (this.zae) {
            this.zaf = status;
            zab(status);
        }
    }

    private final void zab(Status status) {
        synchronized (this.zae) {
            if (this.zaa != null) {
                ((zaci) Preconditions.checkNotNull(this.zab)).zaa((Status) Preconditions.checkNotNull(this.zaa.onFailure(status), "onFailure must not return null"));
            } else if (zac()) {
                ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onFailure(status);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa() {
        this.zac = null;
    }

    @GuardedBy("mSyncToken")
    private final boolean zac() {
        return (this.zac == null || ((GoogleApiClient) this.zag.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static void zaa(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }
}
