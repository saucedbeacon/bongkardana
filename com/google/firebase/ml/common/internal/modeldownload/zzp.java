package com.google.firebase.ml.common.internal.modeldownload;

import com.google.android.gms.internal.firebase_ml.zzmn;

public enum zzp {
    UNKNOWN,
    BASE,
    AUTOML,
    CUSTOM,
    TRANSLATE;

    public static zzp zzbv(String str) {
        return (zzp) Enum.valueOf(zzp.class, str);
    }

    public final zzmn.zzaf.zza zzno() {
        int i = zzo.zzbak[ordinal()];
        if (i == 1) {
            return zzmn.zzaf.zza.BASE_TRANSLATE;
        }
        if (i == 2) {
            return zzmn.zzaf.zza.CUSTOM;
        }
        if (i != 3) {
            return zzmn.zzaf.zza.TYPE_UNKNOWN;
        }
        return zzmn.zzaf.zza.AUTOML_IMAGE_LABELING;
    }
}
