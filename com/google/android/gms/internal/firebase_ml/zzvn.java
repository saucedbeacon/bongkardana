package com.google.android.gms.internal.firebase_ml;

public class zzvn {
    private static final zzuk zzbvk = zzuk.zzso();
    private zztq zzcbf;
    private volatile zzwi zzcbg;
    private volatile zztq zzcbh;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvn)) {
            return false;
        }
        zzvn zzvn = (zzvn) obj;
        zzwi zzwi = this.zzcbg;
        zzwi zzwi2 = zzvn.zzcbg;
        if (zzwi == null && zzwi2 == null) {
            return zzrs().equals(zzvn.zzrs());
        }
        if (zzwi != null && zzwi2 != null) {
            return zzwi.equals(zzwi2);
        }
        if (zzwi != null) {
            return zzwi.equals(zzvn.zzh(zzwi.zztf()));
        }
        return zzh(zzwi2.zztf()).equals(zzwi2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.firebase_ml.zzwi zzh(com.google.android.gms.internal.firebase_ml.zzwi r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase_ml.zzwi r0 = r1.zzcbg
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.firebase_ml.zzwi r0 = r1.zzcbg     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzcbg = r2     // Catch:{ zzvi -> 0x0012 }
            com.google.android.gms.internal.firebase_ml.zztq r0 = com.google.android.gms.internal.firebase_ml.zztq.zzbvs     // Catch:{ zzvi -> 0x0012 }
            r1.zzcbh = r0     // Catch:{ zzvi -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzcbg = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.firebase_ml.zztq r2 = com.google.android.gms.internal.firebase_ml.zztq.zzbvs     // Catch:{ all -> 0x001a }
            r1.zzcbh = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.firebase_ml.zzwi r2 = r1.zzcbg
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvn.zzh(com.google.android.gms.internal.firebase_ml.zzwi):com.google.android.gms.internal.firebase_ml.zzwi");
    }

    public final zzwi zzi(zzwi zzwi) {
        zzwi zzwi2 = this.zzcbg;
        this.zzcbf = null;
        this.zzcbh = null;
        this.zzcbg = zzwi;
        return zzwi2;
    }

    public final int zzth() {
        if (this.zzcbh != null) {
            return this.zzcbh.size();
        }
        if (this.zzcbg != null) {
            return this.zzcbg.zzth();
        }
        return 0;
    }

    public final zztq zzrs() {
        if (this.zzcbh != null) {
            return this.zzcbh;
        }
        synchronized (this) {
            if (this.zzcbh != null) {
                zztq zztq = this.zzcbh;
                return zztq;
            }
            if (this.zzcbg == null) {
                this.zzcbh = zztq.zzbvs;
            } else {
                this.zzcbh = this.zzcbg.zzrs();
            }
            zztq zztq2 = this.zzcbh;
            return zztq2;
        }
    }
}
