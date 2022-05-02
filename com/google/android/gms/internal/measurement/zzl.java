package com.google.android.gms.internal.measurement;

public final class zzl extends zzam {
    private final zzab zzb;

    public zzl(zzab zzab) {
        this.zzb = zzab;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zzbK(java.lang.String r17, com.google.android.gms.internal.measurement.zzg r18, java.util.List<com.google.android.gms.internal.measurement.zzap> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.android.gms.internal.measurement.zzap r1 = super.zzbK(r17, r18, r19)
            return r1
        L_0x0064:
            com.google.android.gms.internal.measurement.zzh.zza(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zza(r1)
            java.lang.String r1 = r1.zzc()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r2 = r2.zza(r3)
            com.google.android.gms.internal.measurement.zzab r3 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r3 = r3.zzc()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzh.zzj(r2)
            r3.zzd(r1, r4)
            return r2
        L_0x008d:
            com.google.android.gms.internal.measurement.zzh.zza(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zza(r1)
            com.google.android.gms.internal.measurement.zzap r2 = zzf
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzap r2 = zzg
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzab r2 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzc()
            java.lang.String r3 = r1.zzc()
            r2.zzc(r3)
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.zzc()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.measurement.zzh.zza(r12, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzc()
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            long r3 = r1.zza()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            com.google.android.gms.internal.measurement.zzh.zza(r10, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzc()
            java.util.Map r1 = r1.zzf()
            com.google.android.gms.internal.measurement.zzam r2 = new com.google.android.gms.internal.measurement.zzam
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzi.zza(r5)
            r2.zzm(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            com.google.android.gms.internal.measurement.zzh.zza(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.zza(r1)
            java.lang.String r1 = r1.zzc()
            com.google.android.gms.internal.measurement.zzab r2 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzc()
            java.lang.Object r1 = r2.zze(r1)
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzi.zza(r1)
            return r1
        L_0x0134:
            com.google.android.gms.internal.measurement.zzh.zza(r13, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzaa r1 = r1.zzc()
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.zzb()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzl.zzbK(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }
}
