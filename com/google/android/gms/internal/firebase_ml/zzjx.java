package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjx extends zzha {
    @zzim
    private zzjr boundingPoly;
    @zzim
    private Float confidence;
    @zzim
    private String description;
    @zzim
    private String locale;
    @zzim
    private List<zzki> locations;
    @zzim
    private String mid;
    @zzim
    private List<Object> properties;
    @zzim
    private Float score;
    @zzim
    private Float topicality;

    public final zzjr zzid() {
        return this.boundingPoly;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<zzki> getLocations() {
        return this.locations;
    }

    public final String getMid() {
        return this.mid;
    }

    public final Float zzie() {
        return this.score;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzjx) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzjx) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzjx) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzjx) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjx) super.clone();
    }
}
