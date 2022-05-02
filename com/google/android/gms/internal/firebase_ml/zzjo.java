package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public final class zzjo extends zzha {
    @zzim
    private List<zzka> features;
    @zzim
    private zzjz image;
    @zzim
    private zzkb imageContext;

    public final zzjo zzb(List<zzka> list) {
        this.features = list;
        return this;
    }

    public final zzjo zza(zzjz zzjz) {
        this.image = zzjz;
        return this;
    }

    public final zzjo zza(zzkb zzkb) {
        this.imageContext = zzkb;
        return this;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzjo) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzjo) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzjo) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzjo) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzjo) super.clone();
    }
}
