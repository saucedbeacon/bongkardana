package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

final class zabd implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zaa;

    zabd(GoogleApiManager.zaa zaa2) {
        this.zaa = zaa2;
    }

    public final void run() {
        this.zaa.zam();
    }
}
