package com.iap.ac.android.container.adapter.appcontainer;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.alipay.iap.android.webapp.sdk.app.WebAppListener;
import com.iap.ac.android.common.container.event.IContainerListener;

public class AppContainerWebListener implements WebAppListener {
    private IContainerListener containerListener;

    AppContainerWebListener(@NonNull IContainerListener iContainerListener) {
        this.containerListener = iContainerListener;
    }

    public void onAppCreated(@NonNull Bundle bundle) {
        IContainerListener iContainerListener = this.containerListener;
        if (iContainerListener != null) {
            iContainerListener.onContainerCreated(bundle);
        }
    }

    public void onAppDestroyed(@NonNull Bundle bundle) {
        IContainerListener iContainerListener = this.containerListener;
        if (iContainerListener != null) {
            iContainerListener.onContainerDestroyed(bundle);
        }
    }
}
