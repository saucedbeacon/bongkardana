package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.internal.BackgroundDetector;

final /* synthetic */ class zzpf implements BackgroundDetector.BackgroundStateChangeListener {
    private final zzpc zzazx;

    zzpf(zzpc zzpc) {
        this.zzazx = zzpc;
    }

    public final void onBackgroundStateChanged(boolean z) {
        this.zzazx.zzau(z);
    }
}
