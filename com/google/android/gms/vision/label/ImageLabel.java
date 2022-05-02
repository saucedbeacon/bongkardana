package com.google.android.gms.vision.label;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public class ImageLabel {
    private final String label;
    private final String zzdn;
    private final float zzdo;

    public ImageLabel(String str, String str2, float f) {
        this.zzdn = str;
        this.label = str2;
        this.zzdo = f;
    }

    @KeepForSdk
    public String getMid() {
        return this.zzdn;
    }

    @KeepForSdk
    public String getLabel() {
        return this.label;
    }

    @KeepForSdk
    public float getConfidence() {
        return this.zzdo;
    }
}
