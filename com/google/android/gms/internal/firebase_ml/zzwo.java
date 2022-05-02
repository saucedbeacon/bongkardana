package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzwo<T> implements zzxc<T> {
    private final zzwi zzccj;
    private final boolean zzcck;
    private final zzxu<?, ?> zzcct;
    private final zzum<?> zzccu;

    private zzwo(zzxu<?, ?> zzxu, zzum<?> zzum, zzwi zzwi) {
        this.zzcct = zzxu;
        this.zzcck = zzum.zze(zzwi);
        this.zzccu = zzum;
        this.zzccj = zzwi;
    }

    static <T> zzwo<T> zza(zzxu<?, ?> zzxu, zzum<?> zzum, zzwi zzwi) {
        return new zzwo<>(zzxu, zzum, zzwi);
    }

    public final T newInstance() {
        return this.zzccj.zztm().zztd();
    }

    public final boolean equals(T t, T t2) {
        if (!this.zzcct.zzae(t).equals(this.zzcct.zzae(t2))) {
            return false;
        }
        if (this.zzcck) {
            return this.zzccu.zzo(t).equals(this.zzccu.zzo(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zzcct.zzae(t).hashCode();
        return this.zzcck ? (hashCode * 53) + this.zzccu.zzo(t).hashCode() : hashCode;
    }

    public final void zze(T t, T t2) {
        zzxe.zza(this.zzcct, t, t2);
        if (this.zzcck) {
            zzxe.zza(this.zzccu, t, t2);
        }
    }

    public final void zza(T t, zzyn zzyn) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzccu.zzo(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzus zzus = (zzus) next.getKey();
            if (zzus.zzsv() != zzyo.MESSAGE || zzus.zzsw() || zzus.zzsx()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzvl) {
                zzyn.zza(zzus.zzb(), (Object) ((zzvl) next).zztx().zzrs());
            } else {
                zzyn.zza(zzus.zzb(), next.getValue());
            }
        }
        zzxu<?, ?> zzxu = this.zzcct;
        zzxu.zzc(zzxu.zzae(t), zzyn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.firebase_ml.zzux$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.firebase_ml.zztp r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase_ml.zzux r0 = (com.google.android.gms.internal.firebase_ml.zzux) r0
            com.google.android.gms.internal.firebase_ml.zzxt r1 = r0.zzbzs
            com.google.android.gms.internal.firebase_ml.zzxt r2 = com.google.android.gms.internal.firebase_ml.zzxt.zzvj()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.firebase_ml.zzxt r1 = com.google.android.gms.internal.firebase_ml.zzxt.zzvk()
            r0.zzbzs = r1
        L_0x0011:
            com.google.android.gms.internal.firebase_ml.zzux$zze r10 = (com.google.android.gms.internal.firebase_ml.zzux.zze) r10
            r10.zztn()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.firebase_ml.zztm.zza(r11, r12, r14)
            int r2 = r14.zzbvp
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.firebase_ml.zzum<?> r12 = r9.zzccu
            com.google.android.gms.internal.firebase_ml.zzuk r0 = r14.zzix
            com.google.android.gms.internal.firebase_ml.zzwi r3 = r9.zzccj
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase_ml.zzux$zzd r0 = (com.google.android.gms.internal.firebase_ml.zzux.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.firebase_ml.zztm.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.firebase_ml.zzxt) r6, (com.google.android.gms.internal.firebase_ml.zztp) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.firebase_ml.zzwt.zzur()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.firebase_ml.zztm.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.firebase_ml.zztp) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.firebase_ml.zztm.zza(r11, r4, r14)
            int r5 = r14.zzbvp
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.firebase_ml.zztm.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzbvr
            com.google.android.gms.internal.firebase_ml.zztq r2 = (com.google.android.gms.internal.firebase_ml.zztq) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.firebase_ml.zzwt.zzur()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.firebase_ml.zztm.zza(r11, r4, r14)
            int r12 = r14.zzbvp
            com.google.android.gms.internal.firebase_ml.zzum<?> r0 = r9.zzccu
            com.google.android.gms.internal.firebase_ml.zzuk r5 = r14.zzix
            com.google.android.gms.internal.firebase_ml.zzwi r6 = r9.zzccj
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase_ml.zzux$zzd r0 = (com.google.android.gms.internal.firebase_ml.zzux.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.firebase_ml.zztm.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.firebase_ml.zztp) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzb((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.firebase_ml.zzvi r10 = com.google.android.gms.internal.firebase_ml.zzvi.zztt()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzwo.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase_ml.zztp):void");
    }

    public final void zzq(T t) {
        this.zzcct.zzq(t);
        this.zzccu.zzq(t);
    }

    public final boolean zzac(T t) {
        return this.zzccu.zzo(t).isInitialized();
    }

    public final int zzaa(T t) {
        zzxu<?, ?> zzxu = this.zzcct;
        int zzaf = zzxu.zzaf(zzxu.zzae(t)) + 0;
        return this.zzcck ? zzaf + this.zzccu.zzo(t).zzst() : zzaf;
    }
}
