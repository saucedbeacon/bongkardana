package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzaz extends zzaw {
    protected zzaz() {
        this.zza.add(zzbl.APPLY);
        this.zza.add(zzbl.BLOCK);
        this.zza.add(zzbl.BREAK);
        this.zza.add(zzbl.CASE);
        this.zza.add(zzbl.DEFAULT);
        this.zza.add(zzbl.CONTINUE);
        this.zza.add(zzbl.DEFINE_FUNCTION);
        this.zza.add(zzbl.FN);
        this.zza.add(zzbl.IF);
        this.zza.add(zzbl.QUOTE);
        this.zza.add(zzbl.RETURN);
        this.zza.add(zzbl.SWITCH);
        this.zza.add(zzbl.TERNARY);
    }

    private static zzap zzc(zzg zzg, List<zzap> list) {
        zzh.zzb(zzbl.FN.name(), 2, list);
        zzap zza = zzg.zza(list.get(0));
        zzap zza2 = zzg.zza(list.get(1));
        if (zza2 instanceof zzae) {
            List<zzap> zzb = ((zzae) zza2).zzb();
            List<zzap> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzao(zza.zzc(), zzb, arrayList, zzg);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{zza2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        if (r8.equals("continue") == false) goto L_0x012d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r8, com.google.android.gms.internal.measurement.zzg r9, java.util.List<com.google.android.gms.internal.measurement.zzap> r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzh.zze(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0211
            r5 = 15
            if (r0 == r5) goto L_0x0205
            r5 = 25
            if (r0 == r5) goto L_0x0200
            r5 = 41
            if (r0 == r5) goto L_0x01ae
            r5 = 54
            if (r0 == r5) goto L_0x01a8
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0185
            r5 = 19
            if (r0 == r5) goto L_0x0164
            r5 = 20
            if (r0 == r5) goto L_0x0140
            r5 = 60
            if (r0 == r5) goto L_0x008b
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0164;
                default: goto L_0x0039;
            }
        L_0x0039:
            com.google.android.gms.internal.measurement.zzap r8 = super.zzb(r8)
            return r8
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r4, r10)
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzi
            return r8
        L_0x004a:
            com.google.android.gms.internal.measurement.zzg r8 = r9.zzc()
            com.google.android.gms.internal.measurement.zzae r9 = new com.google.android.gms.internal.measurement.zzae
            r9.<init>(r10)
            com.google.android.gms.internal.measurement.zzap r8 = r8.zzb(r9)
            return r8
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            java.lang.Boolean r8 = r8.zze()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0080
            java.lang.Object r8 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            goto L_0x008a
        L_0x0080:
            java.lang.Object r8 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
        L_0x008a:
            return r8
        L_0x008b:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zza(r0)
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zza(r10)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L_0x0138
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L_0x0130
            com.google.android.gms.internal.measurement.zzae r0 = (com.google.android.gms.internal.measurement.zzae) r0
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            r1 = 0
            r2 = 0
        L_0x00c0:
            int r5 = r0.zzh()
            if (r1 >= r5) goto L_0x00fb
            if (r2 != 0) goto L_0x00d9
            com.google.android.gms.internal.measurement.zzap r2 = r0.zzl(r1)
            com.google.android.gms.internal.measurement.zzap r2 = r9.zza(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r2 = 0
            goto L_0x00f8
        L_0x00d9:
            com.google.android.gms.internal.measurement.zzap r2 = r10.zzl(r1)
            com.google.android.gms.internal.measurement.zzap r2 = r9.zza(r2)
            boolean r5 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r5 == 0) goto L_0x00f7
            r8 = r2
            com.google.android.gms.internal.measurement.zzag r8 = (com.google.android.gms.internal.measurement.zzag) r8
            java.lang.String r8 = r8.zzg()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x012c
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            return r8
        L_0x00f7:
            r2 = 1
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00fb:
            int r8 = r0.zzh()
            int r8 = r8 + r3
            int r1 = r10.zzh()
            if (r8 != r1) goto L_0x012d
            int r8 = r0.zzh()
            com.google.android.gms.internal.measurement.zzap r8 = r10.zzl(r8)
            com.google.android.gms.internal.measurement.zzap r2 = r9.zza(r8)
            boolean r8 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r8 == 0) goto L_0x012d
            r8 = r2
            com.google.android.gms.internal.measurement.zzag r8 = (com.google.android.gms.internal.measurement.zzag) r8
            java.lang.String r8 = r8.zzg()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x012c
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            return r2
        L_0x012d:
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            return r8
        L_0x0130:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0138:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0140:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzb(r8, r2, r10)
            com.google.android.gms.internal.measurement.zzap r8 = zzc(r9, r10)
            r10 = r8
            com.google.android.gms.internal.measurement.zzai r10 = (com.google.android.gms.internal.measurement.zzai) r10
            java.lang.String r0 = r10.zzg()
            if (r0 != 0) goto L_0x015c
            java.lang.String r10 = ""
            r9.zze(r10, r8)
            goto L_0x0163
        L_0x015c:
            java.lang.String r10 = r10.zzg()
            r9.zze(r10, r8)
        L_0x0163:
            return r8
        L_0x0164:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x016d
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x0184
        L_0x016d:
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            boolean r10 = r8 instanceof com.google.android.gms.internal.measurement.zzae
            if (r10 == 0) goto L_0x0182
            com.google.android.gms.internal.measurement.zzae r8 = (com.google.android.gms.internal.measurement.zzae) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zzb(r8)
            goto L_0x0184
        L_0x0182:
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
        L_0x0184:
            return r8
        L_0x0185:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x018e
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzj
            goto L_0x01a7
        L_0x018e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            com.google.android.gms.internal.measurement.zzag r9 = new com.google.android.gms.internal.measurement.zzag
            r9.<init>(r6, r8)
            r8 = r9
        L_0x01a7:
            return r8
        L_0x01a8:
            com.google.android.gms.internal.measurement.zzae r8 = new com.google.android.gms.internal.measurement.zzae
            r8.<init>(r10)
            return r8
        L_0x01ae:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zzb(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zza(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01dc
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zza(r10)
            goto L_0x01dd
        L_0x01dc:
            r10 = 0
        L_0x01dd:
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            java.lang.Boolean r8 = r8.zze()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01f0
            com.google.android.gms.internal.measurement.zzae r0 = (com.google.android.gms.internal.measurement.zzae) r0
            com.google.android.gms.internal.measurement.zzap r1 = r9.zzb(r0)
            goto L_0x01f8
        L_0x01f0:
            if (r10 == 0) goto L_0x01f8
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            com.google.android.gms.internal.measurement.zzap r1 = r9.zzb(r10)
        L_0x01f8:
            boolean r8 = r1 instanceof com.google.android.gms.internal.measurement.zzag
            if (r8 == 0) goto L_0x01fd
            return r1
        L_0x01fd:
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzf
            return r8
        L_0x0200:
            com.google.android.gms.internal.measurement.zzap r8 = zzc(r9, r10)
            return r8
        L_0x0205:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r4, r10)
            com.google.android.gms.internal.measurement.zzap r8 = com.google.android.gms.internal.measurement.zzap.zzh
            return r8
        L_0x0211:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.zzh.zza(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.zzap r8 = (com.google.android.gms.internal.measurement.zzap) r8
            com.google.android.gms.internal.measurement.zzap r8 = r9.zza(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r9.zza(r0)
            java.lang.String r0 = r0.zzc()
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.zzap r10 = (com.google.android.gms.internal.measurement.zzap) r10
            com.google.android.gms.internal.measurement.zzap r10 = r9.zza(r10)
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.zzae
            if (r1 == 0) goto L_0x0259
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0251
            com.google.android.gms.internal.measurement.zzae r10 = (com.google.android.gms.internal.measurement.zzae) r10
            java.util.List r10 = r10.zzb()
            com.google.android.gms.internal.measurement.zzap r8 = r8.zzbK(r0, r9, r10)
            return r8
        L_0x0251:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x0259:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            goto L_0x0272
        L_0x0271:
            throw r8
        L_0x0272:
            goto L_0x0271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaz.zza(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }
}
