package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzgu extends ContentObserver {
    zzgu(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzgv.zzk.set(true);
    }
}
