package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class zzfq<T> extends zzfl<T> {
    private final Object zzwj;

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase_ml.zzgy] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.firebase_ml.zzfz] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected zzfq(com.google.android.gms.internal.firebase_ml.zzfo r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11, java.lang.Class<T> r12) {
        /*
            r7 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
        L_0x0003:
            r5 = r0
            goto L_0x0026
        L_0x0005:
            com.google.android.gms.internal.firebase_ml.zzgy r1 = new com.google.android.gms.internal.firebase_ml.zzgy
            com.google.android.gms.internal.firebase_ml.zzhd r2 = r8.zzfc()
            r1.<init>(r2, r11)
            com.google.android.gms.internal.firebase_ml.zzis r2 = r8.zzew()
            com.google.android.gms.internal.firebase_ml.zzhf r2 = (com.google.android.gms.internal.firebase_ml.zzhf) r2
            java.util.Set r2 = r2.zzgo()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = "data"
        L_0x0021:
            com.google.android.gms.internal.firebase_ml.zzgy r0 = r1.zzai(r0)
            goto L_0x0003
        L_0x0026:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zzwj = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzfq.<init>(com.google.android.gms.internal.firebase_ml.zzfo, java.lang.String, java.lang.String, java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: zzfd */
    public zzfo zzex() {
        return (zzfo) super.zzex();
    }

    /* renamed from: zzd */
    public zzfq<T> zzb(String str, Object obj) {
        return (zzfq) super.zzb(str, obj);
    }

    public /* synthetic */ zzfl zzc(String str, Object obj) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1921693335, oncanceled);
            onCancelLoad.getMin(-1921693335, oncanceled);
        }
        return (zzfq) zzb(str, obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IOException zzb(zzgj zzgj) {
        return zzfi.zza(((zzfo) zzex()).zzfc(), zzgj);
    }
}
