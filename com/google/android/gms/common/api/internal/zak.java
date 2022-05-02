package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

final class zak {
    private final int zaa;
    private final ConnectionResult zab;

    zak(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i;
    }

    /* access modifiers changed from: package-private */
    public final int zaa() {
        return this.zaa;
    }

    /* access modifiers changed from: package-private */
    public final ConnectionResult zab() {
        return this.zab;
    }
}
