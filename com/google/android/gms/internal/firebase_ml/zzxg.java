package com.google.android.gms.internal.firebase_ml;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzxg extends zzxd<FieldDescriptorType, Object> {
    zzxg(int i) {
        super(i, (zzxg) null);
    }

    public final void zzrv() {
        if (!isImmutable()) {
            for (int i = 0; i < zzuw(); i++) {
                Map.Entry zzdv = zzdv(i);
                if (((zzus) zzdv.getKey()).zzsw()) {
                    zzdv.setValue(Collections.unmodifiableList((List) zzdv.getValue()));
                }
            }
            for (Map.Entry entry : zzux()) {
                if (((zzus) entry.getKey()).zzsw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzrv();
    }
}
