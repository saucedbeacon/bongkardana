package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Callable;

final class zzpe implements Callable<Void> {
    private final zzpd zzazu;
    private final String zzazv;
    private final /* synthetic */ zzpc zzazw;

    zzpe(zzpc zzpc, zzpd zzpd, String str) {
        this.zzazw = zzpc;
        this.zzazu = zzpd;
        this.zzazv = str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* renamed from: zznf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void call() {
        /*
            r4 = this;
            java.lang.String r0 = r4.zzazv
            int r1 = r0.hashCode()
            r2 = 97847535(0x5d508ef, float:2.0033705E-35)
            r3 = 1
            if (r1 == r2) goto L_0x001c
            r2 = 710591710(0x2a5ac4de, float:1.9430592E-13)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "OPERATION_LOAD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 0
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "OPERATION_RELEASE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            java.lang.String r1 = "ModelResourceManager"
            if (r0 == 0) goto L_0x0046
            if (r0 == r3) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            com.google.android.gms.internal.firebase_ml.zzpd r0 = r4.zzazu
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.internal.firebase_ml.zzpc.zzaym
            java.lang.String r3 = "Releasing modelResource"
            r2.v(r1, r3)
            r0.release()
            com.google.android.gms.internal.firebase_ml.zzpc r1 = r4.zzazw
            java.util.Set r1 = r1.zzazr
            r1.remove(r0)
            goto L_0x0058
        L_0x0046:
            com.google.android.gms.internal.firebase_ml.zzpd r0 = r4.zzazu
            com.google.android.gms.internal.firebase_ml.zzpc r2 = r4.zzazw     // Catch:{ FirebaseMLException -> 0x004e }
            r2.zzf(r0)     // Catch:{ FirebaseMLException -> 0x004e }
            goto L_0x0058
        L_0x004e:
            r0 = move-exception
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.android.gms.internal.firebase_ml.zzpc.zzaym
            java.lang.String r3 = "Error preloading model resource"
            r2.e(r1, r3, r0)
        L_0x0058:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpe.call():java.lang.Void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpe)) {
            return false;
        }
        zzpe zzpe = (zzpe) obj;
        if (!Objects.equal(this.zzazu, zzpe.zzazu) || !Objects.equal(this.zzazv, zzpe.zzazv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzazu, this.zzazv);
    }
}
