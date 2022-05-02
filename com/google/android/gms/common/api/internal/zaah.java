package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class zaah implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference<zaaf> zaa;
    private final Api<?> zab;
    /* access modifiers changed from: private */
    public final boolean zac;

    public zaah(zaaf zaaf, Api<?> api, boolean z) {
        this.zaa = new WeakReference<>(zaaf);
        this.zab = api;
        this.zac = z;
    }

    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaf zaaf = (zaaf) this.zaa.get();
        if (zaaf != null) {
            Preconditions.checkState(Looper.myLooper() == zaaf.zaa.zad.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaaf.zab.lock();
            try {
                if (zaaf.zab(0)) {
                    if (!connectionResult.isSuccess()) {
                        zaaf.zab(connectionResult, this.zab, this.zac);
                    }
                    if (zaaf.zad()) {
                        zaaf.zae();
                    }
                    zaaf.zab.unlock();
                }
            } finally {
                zaaf.zab.unlock();
            }
        }
    }
}
