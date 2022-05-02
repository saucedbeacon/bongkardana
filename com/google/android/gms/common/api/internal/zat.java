package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zat implements zabn {
    private final /* synthetic */ zas zaa;

    private zat(zas zas) {
        this.zaa = zas;
    }

    public final void zaa(@Nullable Bundle bundle) {
        this.zaa.zam.lock();
        try {
            ConnectionResult unused = this.zaa.zak = ConnectionResult.RESULT_SUCCESS;
            this.zaa.zah();
        } finally {
            this.zaa.zam.unlock();
        }
    }

    public final void zaa(@NonNull ConnectionResult connectionResult) {
        this.zaa.zam.lock();
        try {
            ConnectionResult unused = this.zaa.zak = connectionResult;
            this.zaa.zah();
        } finally {
            this.zaa.zam.unlock();
        }
    }

    public final void zaa(int i, boolean z) {
        this.zaa.zam.lock();
        try {
            if (this.zaa.zal) {
                boolean unused = this.zaa.zal = false;
                this.zaa.zaa(i, z);
                return;
            }
            boolean unused2 = this.zaa.zal = true;
            this.zaa.zad.onConnectionSuspended(i);
            this.zaa.zam.unlock();
        } finally {
            this.zaa.zam.unlock();
        }
    }

    /* synthetic */ zat(zas zas, zar zar) {
        this(zas);
    }
}
