package com.google.firebase.ml.common.internal.modeldownload;

import android.net.Uri;
import androidx.annotation.NonNull;

public final class zzy {
    private final String zzbbo;
    /* access modifiers changed from: private */
    public final Uri zzbbp;
    /* access modifiers changed from: private */
    public final String zzbbq;
    private final zzp zzbbr;

    public zzy(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull zzp zzp) {
        this.zzbbo = str;
        this.zzbbp = uri;
        this.zzbbq = str2;
        this.zzbbr = zzp;
    }

    public final String zzob() {
        return this.zzbbo;
    }

    public final String getModelHash() {
        return this.zzbbq;
    }

    public final zzp zzoc() {
        return this.zzbbr;
    }
}
