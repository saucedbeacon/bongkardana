package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zau implements zabn {
    private final /* synthetic */ zas zaa;

    private zau(zas zas) {
        this.zaa = zas;
    }

    public final void zaa(@Nullable Bundle bundle) {
        this.zaa.zam.lock();
        try {
            this.zaa.zaa(bundle);
            ConnectionResult unused = this.zaa.zaj = ConnectionResult.RESULT_SUCCESS;
            this.zaa.zah();
        } finally {
            this.zaa.zam.unlock();
        }
    }

    public final void zaa(@NonNull ConnectionResult connectionResult) {
        this.zaa.zam.lock();
        try {
            ConnectionResult unused = this.zaa.zaj = connectionResult;
            this.zaa.zah();
        } finally {
            this.zaa.zam.unlock();
        }
    }

    public final void zaa(int i, boolean z) {
        this.zaa.zam.lock();
        try {
            if (!this.zaa.zal && this.zaa.zak != null) {
                if (this.zaa.zak.isSuccess()) {
                    boolean unused = this.zaa.zal = true;
                    this.zaa.zae.onConnectionSuspended(i);
                    this.zaa.zam.unlock();
                    return;
                }
            }
            boolean unused2 = this.zaa.zal = false;
            this.zaa.zaa(i, z);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    /* synthetic */ zau(zas zas, zar zar) {
        this(zas);
    }
}
