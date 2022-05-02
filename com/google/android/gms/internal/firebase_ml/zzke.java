package com.google.android.gms.internal.firebase_ml;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzke extends zzha {
    @zzim
    private zzjy dominantColors;

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzke) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzke) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzke) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-674930155, oncanceled);
            onCancelLoad.getMin(-674930155, oncanceled);
        }
        return (zzke) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzke) super.clone();
    }
}
