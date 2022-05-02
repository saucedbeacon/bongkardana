package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

final class zan implements Runnable {
    final /* synthetic */ zal zaa;
    private final zak zab;

    zan(zal zal, zak zak) {
        this.zaa = zal;
        this.zab = zak;
    }

    @MainThread
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult zab2 = this.zab.zab();
            if (zab2.hasResolution()) {
                this.zaa.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zaa.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab2.getResolution()), this.zab.zaa(), false), 1);
            } else if (this.zaa.zac.isUserResolvableError(zab2.getErrorCode())) {
                this.zaa.zac.zaa(this.zaa.getActivity(), this.zaa.mLifecycleFragment, zab2.getErrorCode(), 2, this.zaa);
            } else if (zab2.getErrorCode() == 18) {
                this.zaa.zac.zaa(this.zaa.getActivity().getApplicationContext(), (zabk) new zam(this, GoogleApiAvailability.zaa(this.zaa.getActivity(), (DialogInterface.OnCancelListener) this.zaa)));
            } else {
                this.zaa.zaa(zab2, this.zab.zaa());
            }
        }
    }
}
