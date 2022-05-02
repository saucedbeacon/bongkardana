package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

final class zaai extends zaay {
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaai(zaag zaag, zaaw zaaw, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zaaw);
        this.zaa = connectionProgressReportCallbacks;
    }

    @GuardedBy("mLock")
    public final void zaa() {
        this.zaa.onReportServiceBinding(new ConnectionResult(16, (PendingIntent) null));
    }
}
