package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzha extends zzii implements Cloneable {
    private zzhd zzzb;

    public final void zza(zzhd zzhd) {
        this.zzzb = zzhd;
    }

    public String toString() {
        zzhd zzhd = this.zzzb;
        if (zzhd == null) {
            return super.toString();
        }
        try {
            return zzhd.toString(this);
        } catch (IOException e) {
            throw zzlw.zza(e);
        }
    }

    public final String zzgg() throws IOException {
        zzhd zzhd = this.zzzb;
        if (zzhd != null) {
            return zzhd.zzd(this);
        }
        return super.toString();
    }

    /* renamed from: zzeq */
    public zzha clone() {
        return (zzha) super.clone();
    }

    /* renamed from: zza */
    public zzha zzb(String str, Object obj) {
        return (zzha) super.zzb(str, obj);
    }

    public /* synthetic */ zzii zzer() {
        return (zzha) clone();
    }
}
