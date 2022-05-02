package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

final class zaaj extends zaay {
    private final /* synthetic */ ConnectionResult zaa;
    private final /* synthetic */ zaag zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaaj(zaag zaag, zaaw zaaw, ConnectionResult connectionResult) {
        super(zaaw);
        this.zab = zaag;
        this.zaa = connectionResult;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        this.zab.zaa.zab(this.zaa);
    }
}
