package com.google.android.gms.internal.firebase_ml;

public final class zzka extends zzha {
    @zzim
    private Integer maxResults;
    @zzim
    private String model;
    @zzim
    private String type;

    public final zzka zza(Integer num) {
        this.maxResults = num;
        return this;
    }

    public final zzka zzau(String str) {
        this.model = str;
        return this;
    }

    public final zzka zzav(String str) {
        this.type = str;
        return this;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzka) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzka) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzka) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzka) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzka) super.clone();
    }
}
