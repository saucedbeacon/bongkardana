package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zad;

final class zaam implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ zaaf zaa;

    private zaam(zaaf zaaf) {
        this.zaa = zaaf;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(@Nullable Bundle bundle) {
        if (((ClientSettings) Preconditions.checkNotNull(this.zaa.zar)).zae()) {
            this.zaa.zab.lock();
            try {
                zad zaf = this.zaa.zak;
                if (zaf != null) {
                    zaf.zaa(new zaak(this.zaa));
                    this.zaa.zab.unlock();
                }
            } finally {
                this.zaa.zab.unlock();
            }
        } else {
            ((zad) Preconditions.checkNotNull(this.zaa.zak)).zaa(new zaak(this.zaa));
        }
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaa(connectionResult)) {
                this.zaa.zag();
                this.zaa.zae();
            } else {
                this.zaa.zab(connectionResult);
            }
        } finally {
            this.zaa.zab.unlock();
        }
    }

    /* synthetic */ zaam(zaaf zaaf, zaae zaae) {
        this(zaaf);
    }
}
