package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

final class zaa implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ Activity zaa;
    private final /* synthetic */ Bundle zab;
    private final /* synthetic */ Bundle zac;
    private final /* synthetic */ DeferredLifecycleHelper zad;

    zaa(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }

    public final int zaa() {
        return 0;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zad.zaa.onInflate(this.zaa, this.zab, this.zac);
    }
}
