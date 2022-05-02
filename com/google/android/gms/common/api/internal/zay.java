package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o.MediaSessionCompat$Token;

public class zay extends zal {
    private final MediaSessionCompat$Token<ApiKey<?>> zad;
    private final GoogleApiManager zae;

    public static void zaa(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = getFragment(activity);
        zay zay = (zay) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zay.class);
        if (zay == null) {
            zay = new zay(fragment, googleApiManager);
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zay.zad.add(apiKey);
        googleApiManager.zaa(zay);
    }

    private zay(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager) {
        this(lifecycleFragment, googleApiManager, GoogleApiAvailability.getInstance());
    }

    @VisibleForTesting
    private zay(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new MediaSessionCompat$Token<>();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public void onStart() {
        super.onStart();
        zad();
    }

    public void onResume() {
        super.onResume();
        zad();
    }

    public void onStop() {
        super.onStop();
        this.zae.zab(this);
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zae.zab(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    public final void zaa() {
        this.zae.zac();
    }

    /* access modifiers changed from: package-private */
    public final MediaSessionCompat$Token<ApiKey<?>> zac() {
        return this.zad;
    }

    private final void zad() {
        if (!this.zad.isEmpty()) {
            this.zae.zaa(this);
        }
    }
}
