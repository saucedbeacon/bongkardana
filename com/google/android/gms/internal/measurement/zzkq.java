package com.google.android.gms.internal.measurement;

public class zzkq {
    private static final zzjp zzb = zzjp.zza();
    protected volatile zzli zza;
    private volatile zzjd zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkq)) {
            return false;
        }
        zzkq zzkq = (zzkq) obj;
        zzli zzli = this.zza;
        zzli zzli2 = zzkq.zza;
        if (zzli == null && zzli2 == null) {
            return zzb().equals(zzkq.zzb());
        }
        if (zzli != null && zzli2 != null) {
            return zzli.equals(zzli2);
        }
        if (zzli != null) {
            zzkq.zzc(zzli.zzbL());
            return zzli.equals(zzkq.zza);
        }
        zzc(zzli2.zzbL());
        return this.zza.equals(zzli2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzjb) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbw();
        }
        return 0;
    }

    public final zzjd zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzjd zzjd = this.zzc;
                return zzjd;
            }
            if (this.zza == null) {
                this.zzc = zzjd.zzb;
            } else {
                this.zzc = this.zza.zzbo();
            }
            zzjd zzjd2 = this.zzc;
            return zzjd2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.measurement.zzli r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzli r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzli r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzkn -> 0x0011 }
            com.google.android.gms.internal.measurement.zzjd r0 = com.google.android.gms.internal.measurement.zzjd.zzb     // Catch:{ zzkn -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzkn -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzjd r2 = com.google.android.gms.internal.measurement.zzjd.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkq.zzc(com.google.android.gms.internal.measurement.zzli):void");
    }
}
