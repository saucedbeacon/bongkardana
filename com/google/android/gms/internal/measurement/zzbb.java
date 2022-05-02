package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;

public final class zzbb {
    /* JADX WARNING: type inference failed for: r0v124, types: [com.google.android.gms.internal.measurement.zzap] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020c, code lost:
        if (r1 <= r24.zzh()) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020e, code lost:
        r1 = r24.zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0212, code lost:
        r2 = r24.zzh();
        r3 = new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0220, code lost:
        if (r26.size() <= 1) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0222, code lost:
        r4 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.zzh.zzi(r6.zza(r0.get(1)).zzd().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023e, code lost:
        if (r4 <= 0) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0240, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0247, code lost:
        if (r5 >= java.lang.Math.min(r2, r1 + r4)) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0249, code lost:
        r3.zzn(r3.zzh(), r9.zzl(r1));
        r9.zzr(r1);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025f, code lost:
        if (r26.size() <= 2) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0261, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0266, code lost:
        if (r2 >= r26.size()) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0268, code lost:
        r4 = r6.zza(r0.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0274, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0276, code lost:
        r9.zzq((r1 + r2) - 2, r4);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0287, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0288, code lost:
        if (r1 >= r2) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028a, code lost:
        r3.zzn(r3.zzh(), r9.zzl(r1));
        r9.zzn(r1, (com.google.android.gms.internal.measurement.zzap) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029e, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zzc("sort", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ad, code lost:
        if (r24.zzh() >= 2) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b0, code lost:
        r1 = r24.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b8, code lost:
        if (r26.isEmpty() != false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ba, code lost:
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzai) == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c9, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d4, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d6, code lost:
        java.util.Collections.sort(r1, new com.google.android.gms.internal.measurement.zzba(r3, r6));
        r24.zzp();
        r0 = r1.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ea, code lost:
        if (r0.hasNext() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ec, code lost:
        r9.zzn(r2, r0.next());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f9, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fa, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zza("some", 1, r0);
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0311, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzai) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0317, code lost:
        if (r24.zzh() != 0) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031c, code lost:
        r0 = (com.google.android.gms.internal.measurement.zzai) r0;
        r1 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        if (r1.hasNext() == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0328, code lost:
        r2 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0336, code lost:
        if (r9.zzo(r2) == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0362, code lost:
        if (r0.zza(r6, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzap[]{r9.zzl(r2), new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r2)), r9})).zze().booleanValue() == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x036f, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0370, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zzc("slice", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037e, code lost:
        if (r26.isEmpty() == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0386, code lost:
        r1 = (double) r24.zzh();
        r7 = com.google.android.gms.internal.measurement.zzh.zzi(r6.zza(r0.get(0)).zzd().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a4, code lost:
        if (r7 >= 0.0d) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a6, code lost:
        java.lang.Double.isNaN(r1);
        r7 = java.lang.Math.max(r7 + r1, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03af, code lost:
        r7 = java.lang.Math.min(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b8, code lost:
        if (r26.size() != 2) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ba, code lost:
        r5 = com.google.android.gms.internal.measurement.zzh.zzi(r6.zza(r0.get(1)).zzd().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d3, code lost:
        if (r5 >= 0.0d) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d5, code lost:
        java.lang.Double.isNaN(r1);
        r1 = java.lang.Math.max(r1 + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03de, code lost:
        r1 = java.lang.Math.min(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e2, code lost:
        r0 = new com.google.android.gms.internal.measurement.zzae();
        r3 = (int) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03eb, code lost:
        if (((double) r3) >= r1) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ed, code lost:
        r0.zzn(r0.zzh(), r9.zzl(r3));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03fc, code lost:
        r9 = r24;
        com.google.android.gms.internal.measurement.zzh.zza("shift", 0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0408, code lost:
        if (r24.zzh() != 0) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x040d, code lost:
        r0 = r9.zzl(0);
        r9.zzr(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0415, code lost:
        r9 = r24;
        com.google.android.gms.internal.measurement.zzh.zza("reverse", 0, r26);
        r0 = r24.zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0421, code lost:
        if (r0 == 0) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0423, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0426, code lost:
        if (r2 >= (r0 / 2)) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x042c, code lost:
        if (r9.zzo(r2) == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042e, code lost:
        r1 = r9.zzl(r2);
        r9.zzn(r2, (com.google.android.gms.internal.measurement.zzap) null);
        r3 = (r0 - 1) - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x043d, code lost:
        if (r9.zzo(r3) == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x043f, code lost:
        r9.zzn(r2, r9.zzl(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0446, code lost:
        r9.zzn(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0449, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x044c, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0458, code lost:
        return zzb(r24, r25, r26, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0464, code lost:
        return zzb(r24, r25, r26, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0465, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x046f, code lost:
        if (r26.isEmpty() != false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0471, code lost:
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0479, code lost:
        if (r0.hasNext() == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x047b, code lost:
        r9.zzn(r24.zzh(), r6.zza(r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x049b, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r24.zzh()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x049c, code lost:
        r9 = r24;
        com.google.android.gms.internal.measurement.zzh.zza(com.alibaba.ariver.kernel.RVStartParams.BACK_BEHAVIOR_POP, 0, r26);
        r0 = r24.zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a8, code lost:
        if (r0 != 0) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04ad, code lost:
        r0 = r0 - 1;
        r1 = r9.zzl(r0);
        r9.zzr(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b8, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zza("map", 1, r0);
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cf, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d5, code lost:
        if (r24.zzh() != 0) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ea, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04eb, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zzc("lastIndexOf", 2, r0);
        r1 = com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fb, code lost:
        if (r26.isEmpty() != false) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fd, code lost:
        r1 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0508, code lost:
        r7 = (double) (r24.zzh() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0514, code lost:
        if (r26.size() <= 1) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0516, code lost:
        r0 = r6.zza(r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x052c, code lost:
        if (java.lang.Double.isNaN(r0.zzd().doubleValue()) == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x052e, code lost:
        r5 = (double) (r24.zzh() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0536, code lost:
        r5 = com.google.android.gms.internal.measurement.zzh.zzi(r0.zzd().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0542, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0545, code lost:
        if (r7 >= 0.0d) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0547, code lost:
        r5 = (double) r24.zzh();
        java.lang.Double.isNaN(r5);
        r7 = r7 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0552, code lost:
        if (r7 >= 0.0d) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x055e, code lost:
        r0 = (int) java.lang.Math.min((double) r24.zzh(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0568, code lost:
        if (r0 < 0) goto L_0x0589;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x056e, code lost:
        if (r9.zzo(r0) == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0578, code lost:
        if (com.google.android.gms.internal.measurement.zzh.zzf(r9.zzl(r0), r1) == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0586, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0593, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zzc("join", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05a1, code lost:
        if (r24.zzh() != 0) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05aa, code lost:
        if (r26.size() <= 0) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05ac, code lost:
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b9, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzan) != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05bd, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzau) == false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05c0, code lost:
        r0 = r0.zzc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05c5, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05c8, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05d5, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zzc("indexOf", 2, r0);
        r1 = com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05e5, code lost:
        if (r26.isEmpty() != false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05e7, code lost:
        r1 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f7, code lost:
        if (r26.size() <= 1) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05f9, code lost:
        r5 = com.google.android.gms.internal.measurement.zzh.zzi(r6.zza(r0.get(1)).zzd().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0616, code lost:
        if (r5 < ((double) r24.zzh())) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0624, code lost:
        if (r5 >= 0.0d) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0626, code lost:
        r2 = (double) r24.zzh();
        java.lang.Double.isNaN(r2);
        r3 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0631, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0632, code lost:
        r0 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x063a, code lost:
        if (r0.hasNext() == false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x063c, code lost:
        r2 = r0.next().intValue();
        r5 = (double) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0649, code lost:
        if (r5 < r3) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0653, code lost:
        if (com.google.android.gms.internal.measurement.zzh.zzf(r9.zzl(r2), r1) == false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0669, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zza(r21, 1, r0);
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0682, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0688, code lost:
        if (r24.zzi() != 0) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x068d, code lost:
        zzc(r9, r6, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x069b, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x069c, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zza(r22, 1, r0);
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06b5, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x06f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06bb, code lost:
        if (r24.zzi() != 0) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06c3, code lost:
        r2 = r24.zzt();
        r0 = zzc(r9, r6, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, true);
        r1 = new com.google.android.gms.internal.measurement.zzae();
        r0 = r0.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06db, code lost:
        if (r0.hasNext() == false) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06dd, code lost:
        r1.zzn(r1.zzh(), ((com.google.android.gms.internal.measurement.zzae) r2).zzl(r0.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06fd, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06fe, code lost:
        r3 = r24;
        r6 = r25;
        r0 = r26;
        com.google.android.gms.internal.measurement.zzh.zza("every", 1, r0);
        r0 = r6.zza(r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0715, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.zzao) == false) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x071b, code lost:
        if (r24.zzh() != 0) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0732, code lost:
        if (zzc(r3, r6, (com.google.android.gms.internal.measurement.zzao) r0, false, true).zzh() == r24.zzh()) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0036, code lost:
        r2 = r17;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x073f, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0740, code lost:
        r3 = r24;
        r6 = r25;
        r0 = r26;
        r1 = r24.zzt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x074e, code lost:
        if (r26.isEmpty() != false) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0750, code lost:
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0758, code lost:
        if (r0.hasNext() == false) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x075a, code lost:
        r2 = r6.zza(r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0766, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0768, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzae) r1;
        r4 = r3.zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0771, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzae) == false) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0773, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzae) r2;
        r5 = r2.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x077d, code lost:
        if (r5.hasNext() == false) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x077f, code lost:
        r7 = r5.next();
        r3.zzn(r7.intValue() + r4, r2.zzl(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0796, code lost:
        r3.zzn(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07a1, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07a2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return r24.zzt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return zzc(r9, r6, (com.google.android.gms.internal.measurement.zzao) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return new com.google.android.gms.internal.measurement.zzat(r9.zzs(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return new com.google.android.gms.internal.measurement.zzae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return com.google.android.gms.internal.measurement.zzap.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        r2 = r17;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0101, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0112, code lost:
        r17 = r2;
        r21 = "forEach";
        r22 = r4;
        r3 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011e, code lost:
        switch(r0) {
            case 0: goto L_0x0740;
            case 1: goto L_0x06fe;
            case 2: goto L_0x069c;
            case 3: goto L_0x0669;
            case 4: goto L_0x05d5;
            case 5: goto L_0x0593;
            case 6: goto L_0x04eb;
            case 7: goto L_0x04b8;
            case 8: goto L_0x049c;
            case 9: goto L_0x0465;
            case 10: goto L_0x0459;
            case 11: goto L_0x044d;
            case 12: goto L_0x0415;
            case 13: goto L_0x03fc;
            case 14: goto L_0x0370;
            case 15: goto L_0x02fa;
            case 16: goto L_0x029e;
            case 17: goto L_0x01d1;
            case 18: goto L_0x01bb;
            case 19: goto L_0x0129;
            default: goto L_0x0121;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0128, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012d, code lost:
        if (r26.isEmpty() != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012f, code lost:
        r0 = new com.google.android.gms.internal.measurement.zzae();
        r1 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013c, code lost:
        if (r1.hasNext() == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013e, code lost:
        r2 = r25.zza(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014c, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzag) != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        r0.zzn(r0.zzh(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015d, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
        r1 = r0.zzh();
        r2 = r24.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016a, code lost:
        if (r2.hasNext() == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016c, code lost:
        r3 = r2.next();
        r0.zzn(r3.intValue() + r1, r24.zzl(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0185, code lost:
        r9 = r24;
        r24.zzp();
        r1 = r0.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0192, code lost:
        if (r1.hasNext() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0194, code lost:
        r2 = r1.next();
        r9.zzn(r2.intValue(), r0.zzl(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01aa, code lost:
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ba, code lost:
        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf((double) r24.zzh()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bb, code lost:
        com.google.android.gms.internal.measurement.zzh.zza(r17, 0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d0, code lost:
        return new com.google.android.gms.internal.measurement.zzat(r24.zzs(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d1, code lost:
        r9 = r24;
        r6 = r25;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01dc, code lost:
        if (r26.isEmpty() == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e5, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.zzh.zzi(r6.zza(r0.get(0)).zzd().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        if (r1 >= 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fe, code lost:
        r1 = java.lang.Math.max(0, r1 + r24.zzh());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzap zza(java.lang.String r23, com.google.android.gms.internal.measurement.zzae r24, com.google.android.gms.internal.measurement.zzg r25, java.util.List<com.google.android.gms.internal.measurement.zzap> r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            int r4 = r23.hashCode()
            java.lang.String r5 = "indexOf"
            java.lang.String r6 = "reverse"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "shift"
            java.lang.String r9 = "every"
            java.lang.String r10 = "sort"
            java.lang.String r11 = "some"
            java.lang.String r12 = "join"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "map"
            java.lang.String r15 = "lastIndexOf"
            java.lang.String r3 = "forEach"
            java.lang.String r1 = "filter"
            java.lang.String r2 = "toString"
            r16 = -1
            r17 = r2
            r2 = 1
            r18 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            switch(r4) {
                case -1776922004: goto L_0x0104;
                case -1354795244: goto L_0x00f3;
                case -1274492040: goto L_0x00e7;
                case -934873754: goto L_0x00d8;
                case -895859076: goto L_0x00cd;
                case -678635926: goto L_0x00c5;
                case -467511597: goto L_0x00bd;
                case -277637751: goto L_0x00b2;
                case 107868: goto L_0x00aa;
                case 111185: goto L_0x00a1;
                case 3267882: goto L_0x0099;
                case 3452698: goto L_0x008e;
                case 3536116: goto L_0x0085;
                case 3536286: goto L_0x007c;
                case 96891675: goto L_0x006f;
                case 109407362: goto L_0x0065;
                case 109526418: goto L_0x005b;
                case 965561430: goto L_0x004f;
                case 1099846370: goto L_0x0045;
                case 1943291465: goto L_0x003c;
                default: goto L_0x0036;
            }
        L_0x0036:
            r2 = r17
            r4 = r18
            goto L_0x0111
        L_0x003c:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0036
            r0 = 4
            goto L_0x00e2
        L_0x0045:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0036
            r0 = 12
            goto L_0x00e2
        L_0x004f:
            java.lang.String r4 = "reduceRight"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
            r0 = 11
            goto L_0x00e2
        L_0x005b:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0036
            r0 = 14
            goto L_0x00e2
        L_0x0065:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0036
            r0 = 13
            goto L_0x00e2
        L_0x006f:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0036
            r2 = r17
            r4 = r18
            r0 = 1
            goto L_0x0112
        L_0x007c:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0036
            r0 = 16
            goto L_0x00e2
        L_0x0085:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0036
            r0 = 15
            goto L_0x00e2
        L_0x008e:
            java.lang.String r4 = "push"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
            r0 = 9
            goto L_0x00e2
        L_0x0099:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0036
            r0 = 5
            goto L_0x00e2
        L_0x00a1:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0036
            r0 = 8
            goto L_0x00e2
        L_0x00aa:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0036
            r0 = 7
            goto L_0x00e2
        L_0x00b2:
            java.lang.String r4 = "unshift"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
            r0 = 19
            goto L_0x00e2
        L_0x00bd:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x0036
            r0 = 6
            goto L_0x00e2
        L_0x00c5:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0036
            r0 = 3
            goto L_0x00e2
        L_0x00cd:
            java.lang.String r4 = "splice"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
            r0 = 17
            goto L_0x00e2
        L_0x00d8:
            java.lang.String r4 = "reduce"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
            r0 = 10
        L_0x00e2:
            r2 = r17
            r4 = r18
            goto L_0x0112
        L_0x00e7:
            r4 = r18
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0101
            r2 = r17
            r0 = 2
            goto L_0x0112
        L_0x00f3:
            r4 = r18
            java.lang.String r2 = "concat"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0101
            r2 = r17
            r0 = 0
            goto L_0x0112
        L_0x0101:
            r2 = r17
            goto L_0x0111
        L_0x0104:
            r2 = r17
            r4 = r18
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0111
            r0 = 18
            goto L_0x0112
        L_0x0111:
            r0 = -1
        L_0x0112:
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r17 = r2
            java.lang.String r2 = "Callback should be a method"
            r21 = r3
            r22 = r4
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0740;
                case 1: goto L_0x06fe;
                case 2: goto L_0x069c;
                case 3: goto L_0x0669;
                case 4: goto L_0x05d5;
                case 5: goto L_0x0593;
                case 6: goto L_0x04eb;
                case 7: goto L_0x04b8;
                case 8: goto L_0x049c;
                case 9: goto L_0x0465;
                case 10: goto L_0x0459;
                case 11: goto L_0x044d;
                case 12: goto L_0x0415;
                case 13: goto L_0x03fc;
                case 14: goto L_0x0370;
                case 15: goto L_0x02fa;
                case 16: goto L_0x029e;
                case 17: goto L_0x01d1;
                case 18: goto L_0x01bb;
                case 19: goto L_0x0129;
                default: goto L_0x0121;
            }
        L_0x0121:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0129:
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x01aa
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            java.util.Iterator r1 = r26.iterator()
        L_0x0138:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x015e
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            r6 = r25
            com.google.android.gms.internal.measurement.zzap r2 = r6.zza(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r3 != 0) goto L_0x0156
            int r3 = r0.zzh()
            r0.zzn(r3, r2)
            goto L_0x0138
        L_0x0156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x015e:
            int r1 = r0.zzh()
            java.util.Iterator r2 = r24.zzg()
        L_0x0166:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0185
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r24
            com.google.android.gms.internal.measurement.zzap r3 = r9.zzl(r3)
            r0.zzn(r4, r3)
            goto L_0x0166
        L_0x0185:
            r9 = r24
            r24.zzp()
            java.util.Iterator r1 = r0.zzg()
        L_0x018e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ac
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.zzap r2 = r0.zzl(r2)
            r9.zzn(r3, r2)
            goto L_0x018e
        L_0x01aa:
            r9 = r24
        L_0x01ac:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r24.zzh()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x01bb:
            r9 = r24
            r0 = r26
            r1 = r17
            r2 = 0
            com.google.android.gms.internal.measurement.zzh.zza(r1, r2, r0)
            com.google.android.gms.internal.measurement.zzat r0 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = ","
            java.lang.String r1 = r9.zzs(r1)
            r0.<init>(r1)
            return r0
        L_0x01d1:
            r9 = r24
            r6 = r25
            r0 = r26
            r2 = 0
            boolean r1 = r26.isEmpty()
            if (r1 == 0) goto L_0x01e5
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x029d
        L_0x01e5:
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r6.zza(r1)
            java.lang.Double r1 = r1.zzd()
            double r3 = r1.doubleValue()
            double r3 = com.google.android.gms.internal.measurement.zzh.zzi(r3)
            int r1 = (int) r3
            if (r1 >= 0) goto L_0x0208
            int r3 = r24.zzh()
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x0212
        L_0x0208:
            int r2 = r24.zzh()
            if (r1 <= r2) goto L_0x0212
            int r1 = r24.zzh()
        L_0x0212:
            int r2 = r24.zzh()
            com.google.android.gms.internal.measurement.zzae r3 = new com.google.android.gms.internal.measurement.zzae
            r3.<init>()
            int r4 = r26.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0288
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r4 = r6.zza(r4)
            java.lang.Double r4 = r4.zzd()
            double r4 = r4.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.zzh.zzi(r4)
            int r4 = (int) r4
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            if (r4 <= 0) goto L_0x025a
            r5 = r1
        L_0x0241:
            int r7 = r1 + r4
            int r7 = java.lang.Math.min(r2, r7)
            if (r5 >= r7) goto L_0x025a
            com.google.android.gms.internal.measurement.zzap r7 = r9.zzl(r1)
            int r8 = r3.zzh()
            r3.zzn(r8, r7)
            r9.zzr(r1)
            int r5 = r5 + 1
            goto L_0x0241
        L_0x025a:
            int r2 = r26.size()
            r4 = 2
            if (r2 <= r4) goto L_0x029c
            r2 = 2
        L_0x0262:
            int r4 = r26.size()
            if (r2 >= r4) goto L_0x029c
            java.lang.Object r4 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r4 = r6.zza(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzag
            if (r5 != 0) goto L_0x0280
            int r5 = r1 + r2
            int r5 = r5 + -2
            r9.zzq(r5, r4)
            int r2 = r2 + 1
            goto L_0x0262
        L_0x0280:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0288:
            if (r1 >= r2) goto L_0x029c
            com.google.android.gms.internal.measurement.zzap r0 = r9.zzl(r1)
            int r4 = r3.zzh()
            r3.zzn(r4, r0)
            r0 = 0
            r9.zzn(r1, r0)
            int r1 = r1 + 1
            goto L_0x0288
        L_0x029c:
            r0 = r3
        L_0x029d:
            return r0
        L_0x029e:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzc(r10, r1, r0)
            int r1 = r24.zzh()
            r2 = 2
            if (r1 >= r2) goto L_0x02b0
            goto L_0x02f9
        L_0x02b0:
            java.util.List r1 = r24.zzb()
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x02d5
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.zzai
            if (r2 == 0) goto L_0x02cd
            r3 = r0
            com.google.android.gms.internal.measurement.zzai r3 = (com.google.android.gms.internal.measurement.zzai) r3
            goto L_0x02d6
        L_0x02cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            r3 = 0
        L_0x02d6:
            com.google.android.gms.internal.measurement.zzba r0 = new com.google.android.gms.internal.measurement.zzba
            r0.<init>(r3, r6)
            java.util.Collections.sort(r1, r0)
            r24.zzp()
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        L_0x02e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02f9
            int r1 = r2 + 1
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            r9.zzn(r2, r3)
            r2 = r1
            goto L_0x02e6
        L_0x02f9:
            return r9
        L_0x02fa:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zza(r11, r1, r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzai
            if (r1 == 0) goto L_0x036a
            int r1 = r24.zzh()
            if (r1 != 0) goto L_0x031c
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzl
            goto L_0x0369
        L_0x031c:
            com.google.android.gms.internal.measurement.zzai r0 = (com.google.android.gms.internal.measurement.zzai) r0
            java.util.Iterator r1 = r24.zzg()
        L_0x0322:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0367
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r3 = r9.zzo(r2)
            if (r3 == 0) goto L_0x0322
            r3 = 3
            com.google.android.gms.internal.measurement.zzap[] r3 = new com.google.android.gms.internal.measurement.zzap[r3]
            com.google.android.gms.internal.measurement.zzap r4 = r9.zzl(r2)
            r5 = 0
            r3[r5] = r4
            com.google.android.gms.internal.measurement.zzah r4 = new com.google.android.gms.internal.measurement.zzah
            double r7 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            r4.<init>(r2)
            r2 = 1
            r3[r2] = r4
            r2 = 2
            r3[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r3)
            com.google.android.gms.internal.measurement.zzap r2 = r0.zza(r6, r2)
            java.lang.Boolean r2 = r2.zze()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0322
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L_0x0369
        L_0x0367:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzl
        L_0x0369:
            return r0
        L_0x036a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0370:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzc(r7, r1, r0)
            boolean r1 = r26.isEmpty()
            if (r1 == 0) goto L_0x0386
            com.google.android.gms.internal.measurement.zzap r0 = r24.zzt()
            goto L_0x03fb
        L_0x0386:
            int r1 = r24.zzh()
            double r1 = (double) r1
            r5 = 0
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r6.zza(r5)
            java.lang.Double r5 = r5.zzd()
            double r7 = r5.doubleValue()
            double r7 = com.google.android.gms.internal.measurement.zzh.zzi(r7)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x03af
            java.lang.Double.isNaN(r1)
            double r7 = r7 + r1
            double r7 = java.lang.Math.max(r7, r3)
            goto L_0x03b3
        L_0x03af:
            double r7 = java.lang.Math.min(r7, r1)
        L_0x03b3:
            int r5 = r26.size()
            r10 = 2
            if (r5 != r10) goto L_0x03e2
            r5 = 1
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            java.lang.Double r0 = r0.zzd()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zzi(r5)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x03de
            java.lang.Double.isNaN(r1)
            double r1 = r1 + r5
            double r1 = java.lang.Math.max(r1, r3)
            goto L_0x03e2
        L_0x03de:
            double r1 = java.lang.Math.min(r1, r5)
        L_0x03e2:
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            int r3 = (int) r7
        L_0x03e8:
            double r4 = (double) r3
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x03fb
            com.google.android.gms.internal.measurement.zzap r4 = r9.zzl(r3)
            int r5 = r0.zzh()
            r0.zzn(r5, r4)
            int r3 = r3 + 1
            goto L_0x03e8
        L_0x03fb:
            return r0
        L_0x03fc:
            r9 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzh.zza(r8, r1, r0)
            int r0 = r24.zzh()
            if (r0 != 0) goto L_0x040d
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x0414
        L_0x040d:
            com.google.android.gms.internal.measurement.zzap r0 = r9.zzl(r1)
            r9.zzr(r1)
        L_0x0414:
            return r0
        L_0x0415:
            r9 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzh.zza(r6, r1, r0)
            int r0 = r24.zzh()
            if (r0 == 0) goto L_0x044c
            r2 = 0
        L_0x0424:
            int r1 = r0 / 2
            if (r2 >= r1) goto L_0x044c
            boolean r1 = r9.zzo(r2)
            if (r1 == 0) goto L_0x0449
            com.google.android.gms.internal.measurement.zzap r1 = r9.zzl(r2)
            r3 = 0
            r9.zzn(r2, r3)
            int r3 = r0 + -1
            int r3 = r3 - r2
            boolean r4 = r9.zzo(r3)
            if (r4 == 0) goto L_0x0446
            com.google.android.gms.internal.measurement.zzap r4 = r9.zzl(r3)
            r9.zzn(r2, r4)
        L_0x0446:
            r9.zzn(r3, r1)
        L_0x0449:
            int r2 = r2 + 1
            goto L_0x0424
        L_0x044c:
            return r9
        L_0x044d:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzap r0 = zzb(r9, r6, r0, r1)
            return r0
        L_0x0459:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzap r0 = zzb(r9, r6, r0, r1)
            return r0
        L_0x0465:
            r9 = r24
            r6 = r25
            r0 = r26
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x048d
            java.util.Iterator r0 = r26.iterator()
        L_0x0475:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x048d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r6.zza(r1)
            int r2 = r24.zzh()
            r9.zzn(r2, r1)
            goto L_0x0475
        L_0x048d:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            int r1 = r24.zzh()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x049c:
            r9 = r24
            r0 = r26
            r1 = 0
            com.google.android.gms.internal.measurement.zzh.zza(r13, r1, r0)
            int r0 = r24.zzh()
            if (r0 != 0) goto L_0x04ad
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x04b7
        L_0x04ad:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.zzap r1 = r9.zzl(r0)
            r9.zzr(r0)
            r0 = r1
        L_0x04b7:
            return r0
        L_0x04b8:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 0
            r3 = 1
            com.google.android.gms.internal.measurement.zzh.zza(r14, r3, r0)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r1 == 0) goto L_0x04e5
            int r1 = r24.zzh()
            if (r1 != 0) goto L_0x04dd
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x04e4
        L_0x04dd:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            r1 = 0
            com.google.android.gms.internal.measurement.zzae r0 = zzc(r9, r6, r0, r1, r1)
        L_0x04e4:
            return r0
        L_0x04e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x04eb:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzc(r15, r1, r0)
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x0508
            r2 = 0
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r6.zza(r1)
        L_0x0508:
            int r2 = r24.zzh()
            int r2 = r2 + -1
            double r7 = (double) r2
            int r2 = r26.size()
            r5 = 1
            if (r2 <= r5) goto L_0x0550
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            java.lang.Double r2 = r0.zzd()
            double r5 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r5)
            if (r2 == 0) goto L_0x0536
            int r0 = r24.zzh()
            int r0 = r0 + -1
            double r5 = (double) r0
            goto L_0x0542
        L_0x0536:
            java.lang.Double r0 = r0.zzd()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zzi(r5)
        L_0x0542:
            r7 = r5
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0550
            int r0 = r24.zzh()
            double r5 = (double) r0
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
        L_0x0550:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x055e
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            goto L_0x0592
        L_0x055e:
            int r0 = r24.zzh()
            double r2 = (double) r0
            double r2 = java.lang.Math.min(r2, r7)
            int r0 = (int) r2
        L_0x0568:
            if (r0 < 0) goto L_0x0589
            boolean r2 = r9.zzo(r0)
            if (r2 == 0) goto L_0x0586
            com.google.android.gms.internal.measurement.zzap r2 = r9.zzl(r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzh.zzf(r2, r1)
            if (r2 == 0) goto L_0x0586
            com.google.android.gms.internal.measurement.zzah r1 = new com.google.android.gms.internal.measurement.zzah
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            r0 = r1
            goto L_0x0592
        L_0x0586:
            int r0 = r0 + -1
            goto L_0x0568
        L_0x0589:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
        L_0x0592:
            return r0
        L_0x0593:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzc(r12, r1, r0)
            int r1 = r24.zzh()
            if (r1 != 0) goto L_0x05a6
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzm
            goto L_0x05d4
        L_0x05a6:
            int r1 = r26.size()
            if (r1 <= 0) goto L_0x05c8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzan
            if (r1 != 0) goto L_0x05c5
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzau
            if (r1 == 0) goto L_0x05c0
            goto L_0x05c5
        L_0x05c0:
            java.lang.String r0 = r0.zzc()
            goto L_0x05ca
        L_0x05c5:
            java.lang.String r0 = ""
            goto L_0x05ca
        L_0x05c8:
            java.lang.String r0 = ","
        L_0x05ca:
            com.google.android.gms.internal.measurement.zzat r1 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r0 = r9.zzs(r0)
            r1.<init>(r0)
            r0 = r1
        L_0x05d4:
            return r0
        L_0x05d5:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzc(r5, r1, r0)
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x05f2
            r2 = 0
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r6.zza(r1)
        L_0x05f2:
            int r2 = r26.size()
            r5 = 1
            if (r2 <= r5) goto L_0x0632
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            java.lang.Double r0 = r0.zzd()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.zzh.zzi(r5)
            int r0 = r24.zzh()
            double r7 = (double) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0622
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
            goto L_0x0668
        L_0x0622:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0631
            int r0 = r24.zzh()
            double r2 = (double) r0
            java.lang.Double.isNaN(r2)
            double r3 = r2 + r5
            goto L_0x0632
        L_0x0631:
            r3 = r5
        L_0x0632:
            java.util.Iterator r0 = r24.zzg()
        L_0x0636:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x065f
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            double r5 = (double) r2
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0636
            com.google.android.gms.internal.measurement.zzap r2 = r9.zzl(r2)
            boolean r2 = com.google.android.gms.internal.measurement.zzh.zzf(r2, r1)
            if (r2 == 0) goto L_0x0636
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x0668
        L_0x065f:
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = java.lang.Double.valueOf(r19)
            r0.<init>(r1)
        L_0x0668:
            return r0
        L_0x0669:
            r9 = r24
            r6 = r25
            r0 = r26
            r1 = r21
            r3 = 1
            com.google.android.gms.internal.measurement.zzh.zza(r1, r3, r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r1 == 0) goto L_0x0696
            int r1 = r24.zzi()
            if (r1 != 0) goto L_0x068d
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            goto L_0x0695
        L_0x068d:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            r1 = 0
            zzc(r9, r6, r0, r1, r1)
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
        L_0x0695:
            return r0
        L_0x0696:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x069c:
            r9 = r24
            r6 = r25
            r0 = r26
            r3 = r22
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zza(r3, r4, r0)
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r3 == 0) goto L_0x06f8
            int r2 = r24.zzi()
            if (r2 != 0) goto L_0x06c3
            com.google.android.gms.internal.measurement.zzae r0 = new com.google.android.gms.internal.measurement.zzae
            r0.<init>()
            goto L_0x06f7
        L_0x06c3:
            com.google.android.gms.internal.measurement.zzap r2 = r24.zzt()
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            r3 = 0
            com.google.android.gms.internal.measurement.zzae r0 = zzc(r9, r6, r0, r3, r1)
            com.google.android.gms.internal.measurement.zzae r1 = new com.google.android.gms.internal.measurement.zzae
            r1.<init>()
            java.util.Iterator r0 = r0.zzg()
        L_0x06d7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06f6
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r2
            com.google.android.gms.internal.measurement.zzae r4 = (com.google.android.gms.internal.measurement.zzae) r4
            com.google.android.gms.internal.measurement.zzap r3 = r4.zzl(r3)
            int r4 = r1.zzh()
            r1.zzn(r4, r3)
            goto L_0x06d7
        L_0x06f6:
            r0 = r1
        L_0x06f7:
            return r0
        L_0x06f8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x06fe:
            r3 = r24
            r6 = r25
            r0 = r26
            r4 = 1
            com.google.android.gms.internal.measurement.zzh.zza(r9, r4, r0)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r6.zza(r0)
            boolean r5 = r0 instanceof com.google.android.gms.internal.measurement.zzao
            if (r5 == 0) goto L_0x073a
            int r2 = r24.zzh()
            if (r2 != 0) goto L_0x0720
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzk
            goto L_0x0739
        L_0x0720:
            com.google.android.gms.internal.measurement.zzao r0 = (com.google.android.gms.internal.measurement.zzao) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.internal.measurement.zzae r0 = zzc(r3, r6, r0, r2, r1)
            int r0 = r0.zzh()
            int r1 = r24.zzh()
            if (r0 == r1) goto L_0x0737
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzl
            goto L_0x0739
        L_0x0737:
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzk
        L_0x0739:
            return r0
        L_0x073a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0740:
            r3 = r24
            r6 = r25
            r0 = r26
            com.google.android.gms.internal.measurement.zzap r1 = r24.zzt()
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x07a2
            java.util.Iterator r0 = r26.iterator()
        L_0x0754:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07a2
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            com.google.android.gms.internal.measurement.zzap r2 = r6.zza(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzag
            if (r3 != 0) goto L_0x079a
            r3 = r1
            com.google.android.gms.internal.measurement.zzae r3 = (com.google.android.gms.internal.measurement.zzae) r3
            int r4 = r3.zzh()
            boolean r5 = r2 instanceof com.google.android.gms.internal.measurement.zzae
            if (r5 == 0) goto L_0x0796
            com.google.android.gms.internal.measurement.zzae r2 = (com.google.android.gms.internal.measurement.zzae) r2
            java.util.Iterator r5 = r2.zzg()
        L_0x0779:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0754
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            com.google.android.gms.internal.measurement.zzap r7 = r2.zzl(r7)
            int r8 = r8 + r4
            r3.zzn(r8, r7)
            goto L_0x0779
        L_0x0796:
            r3.zzn(r4, r2)
            goto L_0x0754
        L_0x079a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x07a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbb.zza(java.lang.String, com.google.android.gms.internal.measurement.zzae, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.zzap zzb(com.google.android.gms.internal.measurement.zzae r9, com.google.android.gms.internal.measurement.zzg r10, java.util.List<com.google.android.gms.internal.measurement.zzap> r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzb(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.zzh.zzc(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r3 = r10.zza(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzai
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.zzap r11 = (com.google.android.gms.internal.measurement.zzap) r11
            com.google.android.gms.internal.measurement.zzap r11 = r10.zza(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.zzag
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.zzh()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.zzai r3 = (com.google.android.gms.internal.measurement.zzai) r3
            int r4 = r9.zzh()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzap r11 = r9.zzl(r5)
            goto L_0x0095
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0097
            boolean r12 = r9.zzo(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 4
            com.google.android.gms.internal.measurement.zzap[] r12 = new com.google.android.gms.internal.measurement.zzap[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.zzap r11 = r9.zzl(r5)
            r12[r1] = r11
            com.google.android.gms.internal.measurement.zzah r11 = new com.google.android.gms.internal.measurement.zzah
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.zzap r11 = r3.zza(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.zzag
            if (r12 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            goto L_0x00a9
        L_0x00a8:
            throw r9
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbb.zzb(com.google.android.gms.internal.measurement.zzae, com.google.android.gms.internal.measurement.zzg, java.util.List, boolean):com.google.android.gms.internal.measurement.zzap");
    }

    private static zzae zzc(zzae zzae, zzg zzg, zzai zzai, Boolean bool, Boolean bool2) {
        zzae zzae2 = new zzae();
        Iterator<Integer> zzg2 = zzae.zzg();
        while (zzg2.hasNext()) {
            int intValue = zzg2.next().intValue();
            if (zzae.zzo(intValue)) {
                zzap zza = zzai.zza(zzg, Arrays.asList(new zzap[]{zzae.zzl(intValue), new zzah(Double.valueOf((double) intValue)), zzae}));
                if (zza.zze().equals(bool)) {
                    return zzae2;
                }
                if (bool2 == null || zza.zze().equals(bool2)) {
                    zzae2.zzn(intValue, zza);
                }
            }
        }
        return zzae2;
    }
}
