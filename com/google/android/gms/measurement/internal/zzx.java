package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzes;

final class zzx extends zzw {
    final /* synthetic */ zzy zza;
    private final zzes zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzx(zzy zzy, String str, int i, zzes zzes) {
        super(str, i);
        this.zza = zzy;
        this.zzh = zzes;
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzh.zzb();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzgh r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.zzog.zzb()
            com.google.android.gms.measurement.internal.zzy r0 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            java.lang.String r1 = r10.zzb
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzea.zzX
            boolean r0 = r0.zzn(r1, r2)
            com.google.android.gms.internal.measurement.zzes r1 = r10.zzh
            boolean r1 = r1.zze()
            com.google.android.gms.internal.measurement.zzes r2 = r10.zzh
            boolean r2 = r2.zzf()
            com.google.android.gms.internal.measurement.zzes r3 = r10.zzh
            boolean r3 = r3.zzh()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.zzy r11 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r11 = r11.zzs
            com.google.android.gms.measurement.internal.zzem r11 = r11.zzau()
            com.google.android.gms.measurement.internal.zzek r11 = r11.zzk()
            int r12 = r10.zzc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzes r13 = r10.zzh
            boolean r13 = r13.zza()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzes r13 = r10.zzh
            int r13 = r13.zzb()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.zzc(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.zzes r6 = r10.zzh
            com.google.android.gms.internal.measurement.zzel r6 = r6.zzd()
            boolean r7 = r6.zzf()
            boolean r8 = r13.zzf()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.zzc()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zze()
            com.google.android.gms.measurement.internal.zzy r7 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r7 = r7.zzm()
            java.lang.String r8 = r13.zzc()
            java.lang.String r7 = r7.zze(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.zzb(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.zzg()
            com.google.android.gms.internal.measurement.zzeq r2 = r6.zzd()
            java.lang.Boolean r2 = zzg(r8, r2)
            java.lang.Boolean r2 = zze(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.zzh()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.zzc()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zze()
            com.google.android.gms.measurement.internal.zzy r7 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r7 = r7.zzm()
            java.lang.String r8 = r13.zzc()
            java.lang.String r7 = r7.zze(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.zzb(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.zzi()
            com.google.android.gms.internal.measurement.zzeq r2 = r6.zzd()
            java.lang.Boolean r2 = zzh(r8, r2)
            java.lang.Boolean r2 = zze(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.zzd()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.zza()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.zzc()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zze()
            com.google.android.gms.measurement.internal.zzy r7 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r7 = r7.zzm()
            java.lang.String r8 = r13.zzc()
            java.lang.String r7 = r7.zze(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.zzb(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.zze()
            boolean r8 = com.google.android.gms.measurement.internal.zzkp.zzl(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.zze()
            com.google.android.gms.internal.measurement.zzeq r6 = r6.zzd()
            java.lang.Boolean r2 = zzi(r2, r6)
            java.lang.Boolean r2 = zze(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zze()
            com.google.android.gms.measurement.internal.zzy r7 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r7 = r7.zzm()
            java.lang.String r8 = r13.zzc()
            java.lang.String r7 = r7.zze(r8)
            java.lang.String r8 = r13.zze()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.zzc(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.zze()
            com.google.android.gms.internal.measurement.zzex r6 = r6.zzb()
            com.google.android.gms.measurement.internal.zzy r8 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r8 = r8.zzs
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzau()
            java.lang.Boolean r2 = zzf(r2, r6, r8)
            java.lang.Boolean r2 = zze(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zze()
            com.google.android.gms.measurement.internal.zzy r7 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r7 = r7.zzm()
            java.lang.String r8 = r13.zzc()
            java.lang.String r7 = r7.zze(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.zzb(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.zzy r6 = r10.zza
            com.google.android.gms.measurement.internal.zzfu r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzau()
            com.google.android.gms.measurement.internal.zzek r6 = r6.zzk()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.zzb(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r10.zzd = r4
            if (r3 == 0) goto L_0x01c6
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            return r5
        L_0x01c6:
            if (r14 == 0) goto L_0x01d0
            com.google.android.gms.internal.measurement.zzes r14 = r10.zzh
            boolean r14 = r14.zze()
            if (r14 == 0) goto L_0x01d2
        L_0x01d0:
            r10.zze = r2
        L_0x01d2:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0217
            if (r1 == 0) goto L_0x0217
            boolean r14 = r13.zza()
            if (r14 == 0) goto L_0x0217
            long r13 = r13.zzb()
            if (r11 == 0) goto L_0x01ea
            long r13 = r11.longValue()
        L_0x01ea:
            if (r0 == 0) goto L_0x0202
            com.google.android.gms.internal.measurement.zzes r11 = r10.zzh
            boolean r11 = r11.zze()
            if (r11 == 0) goto L_0x0202
            com.google.android.gms.internal.measurement.zzes r11 = r10.zzh
            boolean r11 = r11.zzf()
            if (r11 != 0) goto L_0x0202
            if (r12 == 0) goto L_0x0202
            long r13 = r12.longValue()
        L_0x0202:
            com.google.android.gms.internal.measurement.zzes r11 = r10.zzh
            boolean r11 = r11.zzf()
            if (r11 == 0) goto L_0x0211
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.zzg = r11
            goto L_0x0217
        L_0x0211:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.zzf = r11
        L_0x0217:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzd(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzgh, boolean):boolean");
    }
}
