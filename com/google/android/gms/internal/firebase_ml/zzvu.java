package com.google.android.gms.internal.firebase_ml;

import java.util.Collections;
import java.util.List;

final class zzvu extends zzvs {
    private static final Class<?> zzcbo = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzvu() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzya.zzp(obj, j);
        if (list instanceof zzvp) {
            obj2 = ((zzvp) list).zztz();
        } else if (!zzcbo.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzwu) || !(list instanceof zzvf)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzvf zzvf = (zzvf) list;
                if (zzvf.zzru()) {
                    zzvf.zzrv();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzya.zza(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.firebase_ml.zzvq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.firebase_ml.zzvq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.firebase_ml.zzvq} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void zza(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = zzd(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = zzd(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzvp
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.firebase_ml.zzvq r1 = new com.google.android.gms.internal.firebase_ml.zzvq
            r1.<init>((int) r0)
            goto L_0x0031
        L_0x001c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzwu
            if (r2 == 0) goto L_0x002c
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzvf
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.firebase_ml.zzvf r1 = (com.google.android.gms.internal.firebase_ml.zzvf) r1
            com.google.android.gms.internal.firebase_ml.zzvf r0 = r1.zzcp(r0)
            r1 = r0
            goto L_0x0031
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0031:
            com.google.android.gms.internal.firebase_ml.zzya.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
            goto L_0x0087
        L_0x0035:
            java.lang.Class<?> r2 = zzcbo
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0053
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.firebase_ml.zzya.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
        L_0x0051:
            r1 = r2
            goto L_0x0087
        L_0x0053:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzxv
            if (r2 == 0) goto L_0x006a
            com.google.android.gms.internal.firebase_ml.zzvq r2 = new com.google.android.gms.internal.firebase_ml.zzvq
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.firebase_ml.zzxv r1 = (com.google.android.gms.internal.firebase_ml.zzxv) r1
            r2.addAll(r1)
            com.google.android.gms.internal.firebase_ml.zzya.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
            goto L_0x0051
        L_0x006a:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzwu
            if (r2 == 0) goto L_0x0087
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzvf
            if (r2 == 0) goto L_0x0087
            r2 = r1
            com.google.android.gms.internal.firebase_ml.zzvf r2 = (com.google.android.gms.internal.firebase_ml.zzvf) r2
            boolean r3 = r2.zzru()
            if (r3 != 0) goto L_0x0087
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.firebase_ml.zzvf r1 = r2.zzcp(r1)
            com.google.android.gms.internal.firebase_ml.zzya.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
        L_0x0087:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0096
            if (r2 <= 0) goto L_0x0096
            r1.addAll(r6)
        L_0x0096:
            if (r0 <= 0) goto L_0x0099
            r6 = r1
        L_0x0099:
            com.google.android.gms.internal.firebase_ml.zzya.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvu.zza(java.lang.Object, java.lang.Object, long):void");
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzya.zzp(obj, j);
    }
}
