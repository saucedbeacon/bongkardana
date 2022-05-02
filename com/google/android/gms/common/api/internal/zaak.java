package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zam;
import java.lang.ref.WeakReference;

final class zaak extends zad {
    private final WeakReference<zaaf> zaa;

    zaak(zaaf zaaf) {
        this.zaa = new WeakReference<>(zaaf);
    }

    @BinderThread
    public final void zaa(zam zam) {
        zaaf zaaf = (zaaf) this.zaa.get();
        if (zaaf != null) {
            zaaf.zaa.zaa((zaay) new zaan(this, zaaf, zaaf, zam));
        }
    }
}
