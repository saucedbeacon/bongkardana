package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjs extends zzha {
    @zzim
    private String blockType;
    @zzim
    private zzjr boundingBox;
    @zzim
    private Float confidence;
    @zzim
    private List<zzkk> paragraphs;
    @zzim
    private zzkp property;

    public final zzjr zzia() {
        return this.boundingBox;
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final List<zzkk> getParagraphs() {
        return this.paragraphs;
    }

    public final zzkp zzib() {
        return this.property;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzjs) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzjs) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzjs) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzjs) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjs) super.clone();
    }
}
