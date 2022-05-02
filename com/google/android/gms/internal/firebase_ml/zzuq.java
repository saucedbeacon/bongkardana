package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzuq<T extends zzus<T>> {
    private static final zzuq zzbwx = new zzuq(true);
    final zzxd<T, Object> zzbwu;
    private boolean zzbwv;
    private boolean zzbww;

    private zzuq() {
        this.zzbwu = zzxd.zzdu(16);
    }

    private zzuq(boolean z) {
        this(zzxd.zzdu(0));
        zzrv();
    }

    private zzuq(zzxd<T, Object> zzxd) {
        this.zzbwu = zzxd;
        zzrv();
    }

    public static <T extends zzus<T>> zzuq<T> zzss() {
        return zzbwx;
    }

    public final void zzrv() {
        if (!this.zzbwv) {
            this.zzbwu.zzrv();
            this.zzbwv = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzbwv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuq)) {
            return false;
        }
        return this.zzbwu.equals(((zzuq) obj).zzbwu);
    }

    public final int hashCode() {
        return this.zzbwu.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzbww) {
            return new zzvo(this.zzbwu.entrySet().iterator());
        }
        return this.zzbwu.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzbww) {
            return new zzvo(this.zzbwu.zzuy().iterator());
        }
        return this.zzbwu.zzuy().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzbwu.get(t);
        return obj instanceof zzvj ? zzvj.zztv() : obj;
    }

    private final void zza(T t, Object obj) {
        if (!t.zzsw()) {
            zza(t.zzsu(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzsu(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzvj) {
            this.zzbww = true;
        }
        this.zzbwu.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzuz) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzvj) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.firebase_ml.zzyh r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.firebase_ml.zzva.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.firebase_ml.zzup.zzbws
            com.google.android.gms.internal.firebase_ml.zzyo r2 = r2.zzvt()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzwi
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzvj
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzuz
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zztq
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzuq.zza(com.google.android.gms.internal.firebase_ml.zzyh, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzbwu.zzuw(); i++) {
            if (!zzb(this.zzbwu.zzdv(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzb : this.zzbwu.zzux()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzus<T>> boolean zzb(Map.Entry<T, Object> entry) {
        zzus zzus = (zzus) entry.getKey();
        if (zzus.zzsv() == zzyo.MESSAGE) {
            if (zzus.zzsw()) {
                for (zzwi isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzwi) {
                    if (!((zzwi) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzvj) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzuq<T> zzuq) {
        for (int i = 0; i < zzuq.zzbwu.zzuw(); i++) {
            zzc(zzuq.zzbwu.zzdv(i));
        }
        for (Map.Entry<T, Object> zzc : zzuq.zzbwu.zzux()) {
            zzc(zzc);
        }
    }

    private static Object zzr(Object obj) {
        if (obj instanceof zzwn) {
            return ((zzwn) obj).zzun();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        Object obj;
        zzus zzus = (zzus) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzvj) {
            value = zzvj.zztv();
        }
        if (zzus.zzsw()) {
            Object zza = zza(zzus);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzr : (List) value) {
                ((List) zza).add(zzr(zzr));
            }
            this.zzbwu.put(zzus, zza);
        } else if (zzus.zzsv() == zzyo.MESSAGE) {
            Object zza2 = zza(zzus);
            if (zza2 == null) {
                this.zzbwu.put(zzus, zzr(value));
                return;
            }
            if (zza2 instanceof zzwn) {
                obj = zzus.zza((zzwn) zza2, (zzwn) value);
            } else {
                obj = zzus.zza(((zzwi) zza2).zztl(), (zzwi) value).zzte();
            }
            this.zzbwu.put(zzus, obj);
        } else {
            this.zzbwu.put(zzus, zzr(value));
        }
    }

    static void zza(zzuh zzuh, zzyh zzyh, int i, Object obj) throws IOException {
        if (zzyh == zzyh.GROUP) {
            zzwi zzwi = (zzwi) obj;
            zzva.zzf(zzwi);
            zzuh.zzh(i, 3);
            zzwi.zzb(zzuh);
            zzuh.zzh(i, 4);
            return;
        }
        zzuh.zzh(i, zzyh.zzvu());
        switch (zzup.zzbwt[zzyh.ordinal()]) {
            case 1:
                zzuh.zzc(((Double) obj).doubleValue());
                return;
            case 2:
                zzuh.zzq(((Float) obj).floatValue());
                return;
            case 3:
                zzuh.zzw(((Long) obj).longValue());
                return;
            case 4:
                zzuh.zzw(((Long) obj).longValue());
                return;
            case 5:
                zzuh.zzcv(((Integer) obj).intValue());
                return;
            case 6:
                zzuh.zzy(((Long) obj).longValue());
                return;
            case 7:
                zzuh.zzcy(((Integer) obj).intValue());
                return;
            case 8:
                zzuh.zzbb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzwi) obj).zzb(zzuh);
                return;
            case 10:
                zzuh.zzb((zzwi) obj);
                return;
            case 11:
                if (obj instanceof zztq) {
                    zzuh.zzc((zztq) obj);
                    return;
                } else {
                    zzuh.zzch((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zztq) {
                    zzuh.zzc((zztq) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzuh.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zzuh.zzcw(((Integer) obj).intValue());
                return;
            case 14:
                zzuh.zzcy(((Integer) obj).intValue());
                return;
            case 15:
                zzuh.zzy(((Long) obj).longValue());
                return;
            case 16:
                zzuh.zzcx(((Integer) obj).intValue());
                return;
            case 17:
                zzuh.zzx(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzuz) {
                    zzuh.zzcv(((zzuz) obj).zzb());
                    return;
                } else {
                    zzuh.zzcv(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzst() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzbwu.zzuw(); i2++) {
            i += zzd(this.zzbwu.zzdv(i2));
        }
        for (Map.Entry<T, Object> zzd : this.zzbwu.zzux()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        zzus zzus = (zzus) entry.getKey();
        Object value = entry.getValue();
        if (zzus.zzsv() != zzyo.MESSAGE || zzus.zzsw() || zzus.zzsx()) {
            return zzb((zzus<?>) zzus, value);
        }
        if (value instanceof zzvj) {
            return zzuh.zzb(((zzus) entry.getKey()).zzb(), (zzvn) (zzvj) value);
        }
        return zzuh.zzb(((zzus) entry.getKey()).zzb(), (zzwi) value);
    }

    static int zza(zzyh zzyh, int i, Object obj) {
        int zzcz = zzuh.zzcz(i);
        if (zzyh == zzyh.GROUP) {
            zzva.zzf((zzwi) obj);
            zzcz <<= 1;
        }
        return zzcz + zzb(zzyh, obj);
    }

    private static int zzb(zzyh zzyh, Object obj) {
        switch (zzup.zzbwt[zzyh.ordinal()]) {
            case 1:
                return zzuh.zzd(((Double) obj).doubleValue());
            case 2:
                return zzuh.zzr(((Float) obj).floatValue());
            case 3:
                return zzuh.zzz(((Long) obj).longValue());
            case 4:
                return zzuh.zzaa(((Long) obj).longValue());
            case 5:
                return zzuh.zzda(((Integer) obj).intValue());
            case 6:
                return zzuh.zzac(((Long) obj).longValue());
            case 7:
                return zzuh.zzdd(((Integer) obj).intValue());
            case 8:
                return zzuh.zzbc(((Boolean) obj).booleanValue());
            case 9:
                return zzuh.zzd((zzwi) obj);
            case 10:
                if (obj instanceof zzvj) {
                    return zzuh.zza((zzvj) obj);
                }
                return zzuh.zzc((zzwi) obj);
            case 11:
                if (obj instanceof zztq) {
                    return zzuh.zzd((zztq) obj);
                }
                return zzuh.zzci((String) obj);
            case 12:
                if (obj instanceof zztq) {
                    return zzuh.zzd((zztq) obj);
                }
                return zzuh.zzh((byte[]) obj);
            case 13:
                return zzuh.zzdb(((Integer) obj).intValue());
            case 14:
                return zzuh.zzde(((Integer) obj).intValue());
            case 15:
                return zzuh.zzad(((Long) obj).longValue());
            case 16:
                return zzuh.zzdc(((Integer) obj).intValue());
            case 17:
                return zzuh.zzab(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzuz) {
                    return zzuh.zzdf(((zzuz) obj).zzb());
                }
                return zzuh.zzdf(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzus<?> zzus, Object obj) {
        zzyh zzsu = zzus.zzsu();
        int zzb = zzus.zzb();
        if (!zzus.zzsw()) {
            return zza(zzsu, zzb, obj);
        }
        int i = 0;
        if (zzus.zzsx()) {
            for (Object zzb2 : (List) obj) {
                i += zzb(zzsu, zzb2);
            }
            return zzuh.zzcz(zzb) + i + zzuh.zzdi(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzsu, zzb, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzuq zzuq = new zzuq();
        for (int i = 0; i < this.zzbwu.zzuw(); i++) {
            Map.Entry<T, Object> zzdv = this.zzbwu.zzdv(i);
            zzuq.zza((zzus) zzdv.getKey(), zzdv.getValue());
        }
        for (Map.Entry next : this.zzbwu.zzux()) {
            zzuq.zza((zzus) next.getKey(), next.getValue());
        }
        zzuq.zzbww = this.zzbww;
        return zzuq;
    }
}
