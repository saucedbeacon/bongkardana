package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

final class zzxw extends zzxu<zzxt, zzxt> {
    zzxw() {
    }

    private static void zza(Object obj, zzxt zzxt) {
        ((zzux) obj).zzbzs = zzxt;
    }

    /* access modifiers changed from: package-private */
    public final void zzq(Object obj) {
        ((zzux) obj).zzbzs.zzrv();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzaa(Object obj) {
        return ((zzxt) obj).zzth();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzaf(Object obj) {
        return ((zzxt) obj).zzvl();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzi(Object obj, Object obj2) {
        zzxt zzxt = (zzxt) obj;
        zzxt zzxt2 = (zzxt) obj2;
        if (zzxt2.equals(zzxt.zzvj())) {
            return zzxt;
        }
        return zzxt.zza(zzxt, zzxt2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, zzyn zzyn) throws IOException {
        ((zzxt) obj).zza(zzyn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzyn zzyn) throws IOException {
        ((zzxt) obj).zzb(zzyn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        zza(obj, (zzxt) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzae(Object obj) {
        return ((zzux) obj).zzbzs;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Object obj, Object obj2) {
        zza(obj, (zzxt) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzvm() {
        return zzxt.zzvk();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zztq zztq) {
        ((zzxt) obj).zzb((i << 3) | 2, (Object) zztq);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzxt) obj).zzb(i << 3, (Object) Long.valueOf(j));
    }
}
