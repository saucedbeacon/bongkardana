package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

final class zaj extends Drawable.ConstantState {
    int zaa;
    int zab;

    zaj(@Nullable zaj zaj) {
        if (zaj != null) {
            this.zaa = zaj.zaa;
            this.zab = zaj.zab;
        }
    }

    public final Drawable newDrawable() {
        return new zaf(this);
    }

    public final int getChangingConfigurations() {
        return this.zaa;
    }
}
