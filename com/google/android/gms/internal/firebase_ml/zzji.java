package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzji extends zzfo {
    zzji(zzjh zzjh) {
        super(zzjh);
    }

    /* access modifiers changed from: protected */
    public final void zza(zzfl<?> zzfl) throws IOException {
        super.zza(zzfl);
    }

    static {
        boolean z = zzfe.zzve.intValue() == 1 && zzfe.zzvf.intValue() >= 15;
        Object[] objArr = {zzfe.VERSION};
        if (!z) {
            throw new IllegalStateException(zzlx.zzb("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0-SNAPSHOT of the Cloud Vision API library.", objArr));
        }
    }
}
