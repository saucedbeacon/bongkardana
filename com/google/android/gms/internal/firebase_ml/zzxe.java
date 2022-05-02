package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzxe {
    private static final Class<?> zzcdu = zzve();
    private static final zzxu<?, ?> zzcdv = zzbe(false);
    private static final zzxu<?, ?> zzcdw = zzbe(true);
    private static final zzxu<?, ?> zzcdx = new zzxw();

    public static void zzl(Class<?> cls) {
        Class<?> cls2;
        if (!zzux.class.isAssignableFrom(cls) && (cls2 = zzcdu) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzyn zzyn, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzyn zzyn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zza(i, list);
        }
    }

    public static void zzb(int i, List<zztq> list, zzyn zzyn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zzyn zzyn, zzxc zzxc) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zza(i, list, zzxc);
        }
    }

    public static void zzb(int i, List<?> list, zzyn zzyn, zzxc zzxc) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzyn.zzb(i, list, zzxc);
        }
    }

    static int zzi(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvw) {
            zzvw zzvw = (zzvw) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzz(zzvw.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzz(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzi(list) + (list.size() * zzuh.zzcz(i));
    }

    static int zzj(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvw) {
            zzvw zzvw = (zzvw) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzaa(zzvw.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzaa(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzuh.zzcz(i));
    }

    static int zzk(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvw) {
            zzvw zzvw = (zzvw) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzab(zzvw.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzab(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzuh.zzcz(i));
    }

    static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuy) {
            zzuy zzuy = (zzuy) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzdf(zzuy.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzdf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzuh.zzcz(i));
    }

    static int zzm(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuy) {
            zzuy zzuy = (zzuy) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzda(zzuy.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzda(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzm(list) + (size * zzuh.zzcz(i));
    }

    static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuy) {
            zzuy zzuy = (zzuy) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzdb(zzuy.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzdb(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zzuh.zzcz(i));
    }

    static int zzo(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuy) {
            zzuy zzuy = (zzuy) list;
            i = 0;
            while (i2 < size) {
                i += zzuh.zzdc(zzuy.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzuh.zzdc(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzo(list) + (size * zzuh.zzcz(i));
    }

    static int zzp(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzuh.zzp(i, 0);
    }

    static int zzq(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzuh.zzg(i, 0);
    }

    static int zzr(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzuh.zzb(i, true);
    }

    static int zzc(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzcz = zzuh.zzcz(i) * size;
        if (list instanceof zzvp) {
            zzvp zzvp = (zzvp) list;
            while (i4 < size) {
                Object raw = zzvp.getRaw(i4);
                if (raw instanceof zztq) {
                    i3 = zzuh.zzd((zztq) raw);
                } else {
                    i3 = zzuh.zzci((String) raw);
                }
                zzcz += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zztq) {
                    i2 = zzuh.zzd((zztq) obj);
                } else {
                    i2 = zzuh.zzci((String) obj);
                }
                zzcz += i2;
                i4++;
            }
        }
        return zzcz;
    }

    static int zzc(int i, Object obj, zzxc zzxc) {
        if (obj instanceof zzvn) {
            return zzuh.zza(i, (zzvn) obj);
        }
        return zzuh.zzb(i, (zzwi) obj, zzxc);
    }

    static int zzc(int i, List<?> list, zzxc zzxc) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcz = zzuh.zzcz(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzvn) {
                i2 = zzuh.zza((zzvn) obj);
            } else {
                i2 = zzuh.zza((zzwi) obj, zzxc);
            }
            zzcz += i2;
        }
        return zzcz;
    }

    static int zzd(int i, List<zztq> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcz = size * zzuh.zzcz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzcz += zzuh.zzd(list.get(i2));
        }
        return zzcz;
    }

    static int zzd(int i, List<zzwi> list, zzxc zzxc) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzuh.zzc(i, list.get(i3), zzxc);
        }
        return i2;
    }

    public static zzxu<?, ?> zzvb() {
        return zzcdv;
    }

    public static zzxu<?, ?> zzvc() {
        return zzcdw;
    }

    public static zzxu<?, ?> zzvd() {
        return zzcdx;
    }

    private static zzxu<?, ?> zzbe(boolean z) {
        try {
            Class<?> zzvf = zzvf();
            if (zzvf == null) {
                return null;
            }
            return (zzxu) zzvf.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzve() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzvf() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzf(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzwb zzwb, T t, T t2, long j) {
        zzya.zza((Object) t, j, zzwb.zzd(zzya.zzp(t, j), zzya.zzp(t2, j)));
    }

    static <T, FT extends zzus<FT>> void zza(zzum<FT> zzum, T t, T t2) {
        zzuq<FT> zzo = zzum.zzo(t2);
        if (!zzo.zzbwu.isEmpty()) {
            zzum.zzp(t).zza(zzo);
        }
    }

    static <T, UT, UB> void zza(zzxu<UT, UB> zzxu, T t, T t2) {
        zzxu.zzg(t, zzxu.zzi(zzxu.zzae(t), zzxu.zzae(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzvb zzvb, UB ub, zzxu<UT, UB> zzxu) {
        if (zzvb == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzvb.zzb(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zza(i, intValue, ub, zzxu);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzvb.zzb(intValue2)) {
                    ub = zza(i, intValue2, ub, zzxu);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static <UT, UB> UB zza(int i, int i2, UB ub, zzxu<UT, UB> zzxu) {
        if (ub == null) {
            ub = zzxu.zzvm();
        }
        zzxu.zza(ub, i, (long) i2);
        return ub;
    }
}
