package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;

public final class zzpy {
    @Nullable
    public static String zzbr(@FirebaseVisionCloudDetectorOptions.ModelType int i) {
        if (i == 1) {
            return "builtin/stable";
        }
        if (i != 2) {
            return null;
        }
        return "builtin/latest";
    }

    public static String zzca(@Nullable String str) {
        return str == null ? "" : str;
    }

    public static float zza(@Nullable Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    private static int zzc(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Nullable
    public static Rect zza(@Nullable zzjr zzjr, float f) {
        if (zzjr == null || zzjr.zzhz() == null || zzjr.zzhz().size() != 4) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (zzks next : zzjr.zzhz()) {
            i3 = Math.min(zzc(next.zzik()), i3);
            i4 = Math.min(zzc(next.zzil()), i4);
            i = Math.max(zzc(next.zzik()), i);
            i2 = Math.max(zzc(next.zzil()), i2);
        }
        return new Rect(Math.round(((float) i3) * f), Math.round(((float) i4) * f), Math.round(((float) i) * f), Math.round(((float) i2) * f));
    }
}
