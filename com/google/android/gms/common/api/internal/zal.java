package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference<zak> zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    protected zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();

    /* access modifiers changed from: protected */
    public abstract void zaa(ConnectionResult connectionResult, int i);

    @VisibleForTesting
    zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference<>((Object) null);
        this.zad = new zap(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    public void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, (PendingIntent) null), zaa(this.zab.get()));
        zab();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new zak(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zak zak = this.zab.get();
        if (zak != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zak.zaa());
            bundle.putInt("failed_status", zak.zab().getErrorCode());
            bundle.putParcelable("failed_resolution", zak.zab().getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zak> r0 = r4.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zak r0 = (com.google.android.gms.common.api.internal.zak) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0030
            r6 = 2
            if (r5 == r6) goto L_0x0010
            goto L_0x0060
        L_0x0010:
            com.google.android.gms.common.GoogleApiAvailability r5 = r4.zac
            android.app.Activity r6 = r4.getActivity()
            int r5 = r5.isGooglePlayServicesAvailable(r6)
            if (r5 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r6 = r0.zab()
            int r6 = r6.getErrorCode()
            r7 = 18
            if (r6 != r7) goto L_0x0061
            if (r5 != r7) goto L_0x0061
            return
        L_0x0030:
            r5 = -1
            if (r6 != r5) goto L_0x0034
            goto L_0x0061
        L_0x0034:
            if (r6 != 0) goto L_0x0060
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            r5 = 13
            if (r7 == 0) goto L_0x0043
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L_0x0043:
            com.google.android.gms.common.api.internal.zak r6 = new com.google.android.gms.common.api.internal.zak
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            com.google.android.gms.common.ConnectionResult r3 = r0.zab()
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = zaa(r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zak> r5 = r4.zab
            r5.set(r6)
            r0 = r6
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0067
            r4.zab()
            return
        L_0x0067:
            if (r0 == 0) goto L_0x0074
            com.google.android.gms.common.ConnectionResult r5 = r0.zab()
            int r6 = r0.zaa()
            r4.zaa(r5, r6)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zal.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    /* access modifiers changed from: protected */
    public final void zab() {
        this.zab.set((Object) null);
        zaa();
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        zak zak = new zak(connectionResult, i);
        if (this.zab.compareAndSet((Object) null, zak)) {
            this.zad.post(new zan(this, zak));
        }
    }

    private static int zaa(@Nullable zak zak) {
        if (zak == null) {
            return -1;
        }
        return zak.zaa();
    }
}
