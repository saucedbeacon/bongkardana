package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzlv {
    private static final Class<?> zza;
    private static final zzmh<?, ?> zzb = zzab(false);
    private static final zzmh<?, ?> zzc = zzab(true);
    private static final zzmh<?, ?> zzd = new zzmj();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzmh<?, ?> zzA() {
        return zzb;
    }

    public static zzmh<?, ?> zzB() {
        return zzc;
    }

    public static zzmh<?, ?> zzC() {
        return zzd;
    }

    static boolean zzD(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T, FT extends zzjt<FT>> void zzE(zzjq<FT> zzjq, T t, T t2) {
        zzjq.zzb(t2);
        throw null;
    }

    static <T, UT, UB> void zzF(zzmh<UT, UB> zzmh, T t, T t2) {
        zzmh.zzc(t, zzmh.zzf(zzmh.zzd(t), zzmh.zzd(t2)));
    }

    static <UT, UB> UB zzG(int i, List<Integer> list, zzkh zzkh, UB ub, zzmh<UT, UB> zzmh) {
        if (zzkh == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzkh.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zzH(i, intValue, ub, zzmh);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzkh.zza(intValue2)) {
                    ub = zzH(i, intValue2, ub, zzmh);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zzH(int i, int i2, UB ub, zzmh<UT, UB> zzmh) {
        if (ub == null) {
            ub = zzmh.zzb();
        }
        zzmh.zza(ub, i, (long) i2);
        return ub;
    }

    static <T> void zzI(zzld zzld, T t, T t2, long j) {
        zzmr.zzo(t, j, zzld.zzb(zzmr.zzn(t, j), zzmr.zzn(t2, j)));
    }

    public static void zzJ(int i, List<Double> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzB(i, list, z);
        }
    }

    public static void zzK(int i, List<Float> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzA(i, list, z);
        }
    }

    public static void zzL(int i, List<Long> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzx(i, list, z);
        }
    }

    public static void zzM(int i, List<Long> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzy(i, list, z);
        }
    }

    public static void zzN(int i, List<Long> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzK(i, list, z);
        }
    }

    public static void zzO(int i, List<Long> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzz(i, list, z);
        }
    }

    public static void zzP(int i, List<Long> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzI(i, list, z);
        }
    }

    public static void zzQ(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzv(i, list, z);
        }
    }

    public static void zzR(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzG(i, list, z);
        }
    }

    public static void zzS(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzJ(i, list, z);
        }
    }

    public static void zzT(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzw(i, list, z);
        }
    }

    public static void zzU(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzH(i, list, z);
        }
    }

    public static void zzV(int i, List<Integer> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzC(i, list, z);
        }
    }

    public static void zzW(int i, List<Boolean> list, zzjl zzjl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzD(i, list, z);
        }
    }

    public static void zzX(int i, List<String> list, zzjl zzjl) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzE(i, list);
        }
    }

    public static void zzY(int i, List<zzjd> list, zzjl zzjl) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjl.zzF(i, list);
        }
    }

    public static void zzZ(int i, List<?> list, zzjl zzjl, zzlt zzlt) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzjl.zzr(i, list.get(i2), zzlt);
            }
        }
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzkd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzaa(int i, List<?> list, zzjl zzjl, zzlt zzlt) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzjl.zzs(i, list.get(i2), zzlt);
            }
        }
    }

    private static zzmh<?, ?> zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmh) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkx) {
            zzkx zzkx = (zzkx) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(zzkx.zzc(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjk.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzc(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzb(list) + (list.size() * zzjk.zzu(i));
    }

    static int zzd(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkx) {
            zzkx zzkx = (zzkx) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzx(zzkx.zzc(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjk.zzx(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zze(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzjk.zzu(i));
    }

    static int zzf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkx) {
            zzkx zzkx = (zzkx) list;
            i = 0;
            while (i2 < size) {
                long zzc2 = zzkx.zzc(i2);
                i += zzjk.zzx((zzc2 >> 63) ^ (zzc2 + zzc2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + zzjk.zzx((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzg(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzjk.zzu(i));
    }

    static int zzh(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(zzke.zzg(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjk.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjk.zzu(i));
    }

    static int zzj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzv(zzke.zzg(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjk.zzv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzk(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjk.zzu(i));
    }

    static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i = 0;
            while (i2 < size) {
                i += zzjk.zzw(zzke.zzg(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzjk.zzw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjk.zzu(i));
    }

    static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzke = (zzke) list;
            i = 0;
            while (i2 < size) {
                int zzg = zzke.zzg(i2);
                i += zzjk.zzw((zzg >> 31) ^ (zzg + zzg));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + zzjk.zzw((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zzjk.zzu(i));
    }

    static int zzp(List<?> list) {
        return list.size() * 4;
    }

    static int zzq(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjk.zzw(i << 3) + 4);
    }

    static int zzr(List<?> list) {
        return list.size() * 8;
    }

    static int zzs(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjk.zzw(i << 3) + 8);
    }

    static int zzt(List<?> list) {
        return list.size();
    }

    static int zzu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjk.zzw(i << 3) + 1);
    }

    static int zzv(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = zzjk.zzu(i) * size;
        if (list instanceof zzks) {
            zzks zzks = (zzks) list;
            while (i4 < size) {
                Object zzg = zzks.zzg(i4);
                if (zzg instanceof zzjd) {
                    i3 = zzjk.zzA((zzjd) zzg);
                } else {
                    i3 = zzjk.zzy((String) zzg);
                }
                zzu += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzjd) {
                    i2 = zzjk.zzA((zzjd) obj);
                } else {
                    i2 = zzjk.zzy((String) obj);
                }
                zzu += i2;
                i4++;
            }
        }
        return zzu;
    }

    static int zzw(int i, Object obj, zzlt zzlt) {
        if (!(obj instanceof zzkq)) {
            return zzjk.zzw(i << 3) + zzjk.zzB((zzli) obj, zzlt);
        }
        int zzw = zzjk.zzw(i << 3);
        int zza2 = ((zzkq) obj).zza();
        return zzw + zzjk.zzw(zza2) + zza2;
    }

    static int zzx(int i, List<?> list, zzlt zzlt) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = zzjk.zzu(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzkq) {
                i2 = zzjk.zzz((zzkq) obj);
            } else {
                i2 = zzjk.zzB((zzli) obj, zzlt);
            }
            zzu += i2;
        }
        return zzu;
    }

    static int zzy(int i, List<zzjd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = size * zzjk.zzu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzu += zzjk.zzA(list.get(i2));
        }
        return zzu;
    }

    static int zzz(int i, List<zzli> list, zzlt zzlt) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjk.zzE(i, list.get(i3), zzlt);
        }
        return i2;
    }
}
