package com.google.android.gms.internal.firebase_ml;

import java.util.List;

public class zzfg extends zzha {
    @zzim
    private int code;
    @zzim
    private List<zza> errors;
    @zzim
    private String message;

    public static class zza extends zzha {
        @zzim
        private String domain;
        @zzim
        private String location;
        @zzim
        private String locationType;
        @zzim
        private String message;
        @zzim
        private String reason;

        public final String getReason() {
            return this.reason;
        }

        public final /* synthetic */ zzha zza(String str, Object obj) {
            return (zza) zzb(str, obj);
        }

        public final /* synthetic */ zzha zzeq() {
            return (zza) clone();
        }

        public final /* synthetic */ zzii zzer() {
            return (zza) clone();
        }

        public final /* synthetic */ zzii zzb(String str, Object obj) {
            return (zza) super.zzb(str, obj);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return (zza) super.clone();
        }
    }

    public final List<zza> zzep() {
        return this.errors;
    }

    public final /* synthetic */ zzha zza(String str, Object obj) {
        return (zzfg) zzb(str, obj);
    }

    public final /* synthetic */ zzha zzeq() {
        return (zzfg) clone();
    }

    public final /* synthetic */ zzii zzer() {
        return (zzfg) clone();
    }

    public final /* synthetic */ zzii zzb(String str, Object obj) {
        return (zzfg) super.zzb(str, obj);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzfg) super.clone();
    }

    static {
        zzid.zzd(zza.class);
    }
}
