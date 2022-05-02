package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzkt extends zzha {
    @zzim
    private zzjr boundingBox;
    @zzim
    private Float confidence;
    @zzim
    private zzkp property;
    @zzim
    private List<zzkn> symbols;

    public final zzjr zzia() {
        return this.boundingBox;
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final zzkp zzib() {
        return this.property;
    }

    public final List<zzkn> getSymbols() {
        return this.symbols;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzkt) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzkt) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzkt) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzkt) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzkt) super.clone();
    }
}
