package com.google.android.gms.internal.firebase_ml;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzgo {
    static final Map<Character, zzgr> zzyg = new HashMap();

    private static Map<String, Object> zzb(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : zzid.zzf(obj).entrySet()) {
            Object value = next.getValue();
            if (value != null && !zzid.isNull(value)) {
                linkedHashMap.put((String) next.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0200 A[EDGE_INSN: B:85:0x0200->B:83:0x0200 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15) {
        /*
            java.lang.String r15 = "/"
            boolean r15 = r13.startsWith(r15)
            if (r15 == 0) goto L_0x002e
            com.google.android.gms.internal.firebase_ml.zzfw r15 = new com.google.android.gms.internal.firebase_ml.zzfw
            r15.<init>((java.lang.String) r12)
            r12 = 0
            r15.zzs(r12)
            java.lang.String r12 = r15.zzfg()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r15 = r13.length()
            if (r15 == 0) goto L_0x0028
            java.lang.String r12 = r12.concat(r13)
            goto L_0x0058
        L_0x0028:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            goto L_0x0057
        L_0x002e:
            java.lang.String r15 = "http://"
            boolean r15 = r13.startsWith(r15)
            if (r15 != 0) goto L_0x0057
            java.lang.String r15 = "https://"
            boolean r15 = r13.startsWith(r15)
            if (r15 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r15 = r13.length()
            if (r15 == 0) goto L_0x0052
            java.lang.String r13 = r12.concat(r13)
            goto L_0x0057
        L_0x0052:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
        L_0x0057:
            r12 = r13
        L_0x0058:
            java.util.Map r13 = zzb(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r15 = r12.length()
            r0 = 0
            r1 = 0
        L_0x0067:
            if (r1 >= r15) goto L_0x0200
            r2 = 123(0x7b, float:1.72E-43)
            int r2 = r12.indexOf(r2, r1)
            r3 = -1
            if (r2 != r3) goto L_0x007b
            java.lang.String r12 = r12.substring(r1)
            r14.append(r12)
            goto L_0x0200
        L_0x007b:
            java.lang.String r1 = r12.substring(r1, r2)
            r14.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            int r3 = r2 + 2
            int r1 = r12.indexOf(r1, r3)
            int r3 = r1 + 1
            int r2 = r2 + 1
            java.lang.String r1 = r12.substring(r2, r1)
            java.util.Map<java.lang.Character, com.google.android.gms.internal.firebase_ml.zzgr> r2 = zzyg
            char r4 = r1.charAt(r0)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.firebase_ml.zzgr r2 = (com.google.android.gms.internal.firebase_ml.zzgr) r2
            if (r2 != 0) goto L_0x00a6
            com.google.android.gms.internal.firebase_ml.zzgr r2 = com.google.android.gms.internal.firebase_ml.zzgr.zzyo
        L_0x00a6:
            r4 = 44
            com.google.android.gms.internal.firebase_ml.zzla r4 = com.google.android.gms.internal.firebase_ml.zzla.zza(r4)
            com.google.android.gms.internal.firebase_ml.zzlr r4 = com.google.android.gms.internal.firebase_ml.zzlr.zza((com.google.android.gms.internal.firebase_ml.zzla) r4)
            java.util.List r1 = r4.zza((java.lang.CharSequence) r1)
            java.util.ListIterator r1 = r1.listIterator()
            r4 = 1
            r5 = 1
        L_0x00ba:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x01fd
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "*"
            boolean r7 = r6.endsWith(r7)
            int r8 = r1.nextIndex()
            if (r8 != r4) goto L_0x00d7
            int r8 = r2.zzgd()
            goto L_0x00d8
        L_0x00d7:
            r8 = 0
        L_0x00d8:
            int r9 = r6.length()
            if (r7 == 0) goto L_0x00e0
            int r9 = r9 + -1
        L_0x00e0:
            java.lang.String r6 = r6.substring(r8, r9)
            java.lang.Object r8 = r13.remove(r6)
            if (r8 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x00f4
            java.lang.String r9 = r2.zzgb()
            r14.append(r9)
            goto L_0x00fc
        L_0x00f4:
            java.lang.String r5 = r2.zzga()
            r14.append(r5)
            r5 = 0
        L_0x00fc:
            boolean r9 = r8 instanceof java.util.Iterator
            if (r9 == 0) goto L_0x0108
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.String r6 = zza((java.lang.String) r6, (java.util.Iterator<?>) r8, (boolean) r7, (com.google.android.gms.internal.firebase_ml.zzgr) r2)
            goto L_0x01f8
        L_0x0108:
            boolean r9 = r8 instanceof java.lang.Iterable
            if (r9 != 0) goto L_0x01ec
            java.lang.Class r9 = r8.getClass()
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x0118
            goto L_0x01ec
        L_0x0118:
            java.lang.Class r9 = r8.getClass()
            boolean r9 = r9.isEnum()
            java.lang.String r10 = "%s=%s"
            r11 = 2
            if (r9 == 0) goto L_0x014d
            r7 = r8
            java.lang.Enum r7 = (java.lang.Enum) r7
            com.google.android.gms.internal.firebase_ml.zzij r7 = com.google.android.gms.internal.firebase_ml.zzij.zza((java.lang.Enum<?>) r7)
            java.lang.String r7 = r7.getName()
            if (r7 == 0) goto L_0x014a
            boolean r7 = r2.zzgc()
            if (r7 == 0) goto L_0x0142
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r7[r0] = r6
            r7[r4] = r8
            java.lang.String r8 = java.lang.String.format(r10, r7)
        L_0x0142:
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = com.google.android.gms.internal.firebase_ml.zzjc.zzaq(r6)
        L_0x014a:
            r6 = r8
            goto L_0x01f8
        L_0x014d:
            boolean r9 = com.google.android.gms.internal.firebase_ml.zzid.zzg(r8)
            if (r9 != 0) goto L_0x01c4
            java.util.Map r8 = zzb(r8)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0161
            java.lang.String r6 = ""
            goto L_0x01f8
        L_0x0161:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "="
            java.lang.String r11 = ","
            if (r7 == 0) goto L_0x0171
            java.lang.String r11 = r2.zzgb()
            goto L_0x0182
        L_0x0171:
            boolean r7 = r2.zzgc()
            if (r7 == 0) goto L_0x0181
            java.lang.String r6 = com.google.android.gms.internal.firebase_ml.zzjc.zzaq(r6)
            r9.append(r6)
            r9.append(r10)
        L_0x0181:
            r10 = r11
        L_0x0182:
            java.util.Set r6 = r8.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x018a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01bf
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r2.zzah(r8)
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r2.zzah(r7)
            r9.append(r8)
            r9.append(r10)
            r9.append(r7)
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x018a
            r9.append(r11)
            goto L_0x018a
        L_0x01bf:
            java.lang.String r6 = r9.toString()
            goto L_0x01f8
        L_0x01c4:
            boolean r7 = r2.zzgc()
            if (r7 == 0) goto L_0x01d4
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r7[r0] = r6
            r7[r4] = r8
            java.lang.String r8 = java.lang.String.format(r10, r7)
        L_0x01d4:
            boolean r6 = r2.zzge()
            if (r6 == 0) goto L_0x01e3
            java.lang.String r6 = r8.toString()
            java.lang.String r6 = com.google.android.gms.internal.firebase_ml.zzjc.zzar(r6)
            goto L_0x01f8
        L_0x01e3:
            java.lang.String r6 = r8.toString()
            java.lang.String r6 = com.google.android.gms.internal.firebase_ml.zzjc.zzaq(r6)
            goto L_0x01f8
        L_0x01ec:
            java.lang.Iterable r8 = com.google.android.gms.internal.firebase_ml.zziy.zzi(r8)
            java.util.Iterator r8 = r8.iterator()
            java.lang.String r6 = zza((java.lang.String) r6, (java.util.Iterator<?>) r8, (boolean) r7, (com.google.android.gms.internal.firebase_ml.zzgr) r2)
        L_0x01f8:
            r14.append(r6)
            goto L_0x00ba
        L_0x01fd:
            r1 = r3
            goto L_0x0067
        L_0x0200:
            java.util.Set r12 = r13.entrySet()
            com.google.android.gms.internal.firebase_ml.zzfw.zza(r12, r14)
            java.lang.String r12 = r14.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgo.zza(java.lang.String, java.lang.String, java.lang.Object, boolean):java.lang.String");
    }

    private static String zza(String str, Iterator<?> it, boolean z, zzgr zzgr) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = zzgr.zzgb();
        } else {
            if (zzgr.zzgc()) {
                sb.append(zzjc.zzaq(str));
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && zzgr.zzgc()) {
                sb.append(zzjc.zzaq(str));
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            }
            sb.append(zzgr.zzah(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    static {
        zzgr.values();
    }
}
