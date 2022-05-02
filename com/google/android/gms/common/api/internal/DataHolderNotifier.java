package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {
    private final DataHolder zaa;

    @KeepForSdk
    protected DataHolderNotifier(DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void notifyListener(L l, DataHolder dataHolder);

    @KeepForSdk
    public final void notifyListener(L l) {
        notifyListener(l, this.zaa);
    }

    @KeepForSdk
    public void onNotifyListenerFailed() {
        DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
