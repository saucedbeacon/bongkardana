package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import sun.misc.Unsafe;

final class zzll<T> implements zzlt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmr.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzli zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkw zzm;
    private final zzmh<?, ?> zzn;
    private final zzjq<?> zzo;
    private final zzln zzp;
    private final zzld zzq;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.measurement.zzli} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.gms.internal.measurement.zzln} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.measurement.zzld} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.measurement.zzjq<?>, com.google.android.gms.internal.measurement.zzjq] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.measurement.zzkw] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.measurement.zzmh<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzll(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzli r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.measurement.zzln r17, com.google.android.gms.internal.measurement.zzkw r18, com.google.android.gms.internal.measurement.zzmh<?, ?> r19, com.google.android.gms.internal.measurement.zzjq<?> r20, com.google.android.gms.internal.measurement.zzld r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.zzc = r3
            r3 = r7
            r0.zzd = r3
            r3 = r8
            r0.zze = r3
            r3 = r9
            r0.zzf = r3
            r3 = r11
            r0.zzi = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.zza(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.zzh = r3
            r3 = r13
            r0.zzj = r3
            r3 = r14
            r0.zzk = r3
            r3 = r15
            r0.zzl = r3
            r3 = r16
            r0.zzp = r3
            r3 = r17
            r0.zzm = r3
            r3 = r18
            r0.zzn = r3
            r0.zzo = r2
            r0.zzg = r1
            r1 = r20
            r0.zzq = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.measurement.zzli, boolean, boolean, int[], int, int, com.google.android.gms.internal.measurement.zzln, com.google.android.gms.internal.measurement.zzkw, com.google.android.gms.internal.measurement.zzmh, com.google.android.gms.internal.measurement.zzjq, com.google.android.gms.internal.measurement.zzld, byte[]):void");
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-163711333, oncanceled);
            onCancelLoad.getMin(-163711333, oncanceled);
        }
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static <T> double zzD(T t, long j) {
        return ((Double) zzmr.zzn(t, j)).doubleValue();
    }

    private static <T> float zzE(T t, long j) {
        return ((Float) zzmr.zzn(t, j)).floatValue();
    }

    private static <T> int zzF(T t, long j) {
        return ((Integer) zzmr.zzn(t, j)).intValue();
    }

    private static <T> long zzG(T t, long j) {
        return ((Long) zzmr.zzn(t, j)).longValue();
    }

    private static <T> boolean zzH(T t, long j) {
        return ((Boolean) zzmr.zzn(t, j)).booleanValue();
    }

    private final boolean zzI(T t, T t2, int i) {
        return zzK(t, i) == zzK(t2, i);
    }

    private final boolean zzJ(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzK(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzK(T t, int i) {
        int zzB = zzB(i);
        long j = (long) (zzB & 1048575);
        if (j != 1048575) {
            return (zzmr.zzd(t, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = (long) (zzA & 1048575);
        switch (zzC(zzA)) {
            case 0:
                return zzmr.zzl(t, j2) != 0.0d;
            case 1:
                return zzmr.zzj(t, j2) != 0.0f;
            case 2:
                return zzmr.zzf(t, j2) != 0;
            case 3:
                return zzmr.zzf(t, j2) != 0;
            case 4:
                return zzmr.zzd(t, j2) != 0;
            case 5:
                return zzmr.zzf(t, j2) != 0;
            case 6:
                return zzmr.zzd(t, j2) != 0;
            case 7:
                return zzmr.zzh(t, j2);
            case 8:
                Object zzn2 = zzmr.zzn(t, j2);
                if (zzn2 instanceof String) {
                    return !((String) zzn2).isEmpty();
                }
                if (zzn2 instanceof zzjd) {
                    return !zzjd.zzb.equals(zzn2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmr.zzn(t, j2) != null;
            case 10:
                return !zzjd.zzb.equals(zzmr.zzn(t, j2));
            case 11:
                return zzmr.zzd(t, j2) != 0;
            case 12:
                return zzmr.zzd(t, j2) != 0;
            case 13:
                return zzmr.zzd(t, j2) != 0;
            case 14:
                return zzmr.zzf(t, j2) != 0;
            case 15:
                return zzmr.zzd(t, j2) != 0;
            case 16:
                return zzmr.zzf(t, j2) != 0;
            case 17:
                return zzmr.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzL(T t, int i) {
        int zzB = zzB(i);
        long j = (long) (1048575 & zzB);
        if (j != 1048575) {
            zzmr.zze(t, j, (1 << (zzB >>> 20)) | zzmr.zzd(t, j));
        }
    }

    private final boolean zzM(T t, int i, int i2) {
        return zzmr.zzd(t, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzN(T t, int i, int i2) {
        zzmr.zze(t, (long) (zzB(i2) & 1048575), i);
    }

    private final int zzO(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzP(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, i2);
    }

    private final int zzQ(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final void zzR(T t, zzjl zzjl) throws IOException {
        int i;
        T t2 = t;
        zzjl zzjl2 = zzjl;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzA = zzA(i3);
                int i6 = this.zzc[i3];
                int zzC = zzC(zzA);
                if (zzC <= 17) {
                    int i7 = this.zzc[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (zzA & i2);
                switch (zzC) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzjl2.zzf(i6, zzmr.zzl(t2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzjl2.zze(i6, zzmr.zzj(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzjl2.zzc(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzjl2.zzh(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzjl2.zzi(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzjl2.zzj(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzjl2.zzk(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzjl2.zzl(i6, zzmr.zzh(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            zzT(i6, unsafe.getObject(t2, j), zzjl2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzjl2.zzr(i6, unsafe.getObject(t2, j), zzv(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzjl2.zzn(i6, (zzjd) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzjl2.zzo(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzjl2.zzg(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzjl2.zzb(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzjl2.zzd(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzjl2.zzp(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzjl2.zzq(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzjl2.zzs(i6, unsafe.getObject(t2, j), zzv(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzlv.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 19:
                        zzlv.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 20:
                        zzlv.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 21:
                        zzlv.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 22:
                        zzlv.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 23:
                        zzlv.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 24:
                        zzlv.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 25:
                        zzlv.zzW(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        continue;
                    case 26:
                        zzlv.zzX(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2);
                        break;
                    case 27:
                        zzlv.zzZ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, zzv(i3));
                        break;
                    case 28:
                        zzlv.zzY(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2);
                        break;
                    case 29:
                        zzlv.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 30:
                        zzlv.zzV(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 31:
                        zzlv.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 32:
                        zzlv.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 33:
                        zzlv.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 34:
                        zzlv.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, false);
                        break;
                    case 35:
                        zzlv.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 36:
                        zzlv.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 37:
                        zzlv.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 38:
                        zzlv.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 39:
                        zzlv.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 40:
                        zzlv.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 41:
                        zzlv.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 42:
                        zzlv.zzW(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 43:
                        zzlv.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 44:
                        zzlv.zzV(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 45:
                        zzlv.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 46:
                        zzlv.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 47:
                        zzlv.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 48:
                        zzlv.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, true);
                        break;
                    case 49:
                        zzlv.zzaa(this.zzc[i3], (List) unsafe.getObject(t2, j), zzjl2, zzv(i3));
                        break;
                    case 50:
                        zzS(zzjl2, i6, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzf(i6, zzD(t2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zze(i6, zzE(t2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzc(i6, zzG(t2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzh(i6, zzG(t2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzi(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzj(i6, zzG(t2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzk(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzl(i6, zzH(t2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzM(t2, i6, i3)) {
                            zzT(i6, unsafe.getObject(t2, j), zzjl2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzr(i6, unsafe.getObject(t2, j), zzv(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzn(i6, (zzjd) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzo(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzg(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzb(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzd(i6, zzG(t2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzp(i6, zzF(t2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzq(i6, zzG(t2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzM(t2, i6, i3)) {
                            zzjl2.zzs(i6, unsafe.getObject(t2, j), zzv(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzmh<?, ?> zzmh = this.zzn;
            zzmh.zzi(zzmh.zzd(t2), zzjl2);
            return;
        }
        this.zzo.zzb(t2);
        throw null;
    }

    private final <K, V> void zzS(zzjl zzjl, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzlb zzlb = (zzlb) zzw(i2);
            throw null;
        }
    }

    private static final void zzT(int i, Object obj, zzjl zzjl) throws IOException {
        if (obj instanceof String) {
            zzjl.zzm(i, (String) obj);
        } else {
            zzjl.zzn(i, (zzjd) obj);
        }
    }

    static zzmi zzf(Object obj) {
        zzkd zzkd = (zzkd) obj;
        zzmi zzmi = zzkd.zzc;
        if (zzmi != zzmi.zza()) {
            return zzmi;
        }
        zzmi zzb2 = zzmi.zzb();
        zzkd.zzc = zzb2;
        return zzb2;
    }

    static <T> zzll<T> zzk(Class<T> cls, zzlf zzlf, zzln zzln, zzkw zzkw, zzmh<?, ?> zzmh, zzjq<?> zzjq, zzld zzld) {
        if (zzlf instanceof zzls) {
            return zzl((zzls) zzlf, zzln, zzkw, zzmh, zzjq, zzld);
        }
        zzme zzme = (zzme) zzlf;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.zzll<T> zzl(com.google.android.gms.internal.measurement.zzls r34, com.google.android.gms.internal.measurement.zzln r35, com.google.android.gms.internal.measurement.zzkw r36, com.google.android.gms.internal.measurement.zzmh<?, ?> r37, com.google.android.gms.internal.measurement.zzjq<?> r38, com.google.android.gms.internal.measurement.zzld r39) {
        /*
            int r0 = r34.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = zza
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r34.zze()
            com.google.android.gms.internal.measurement.zzli r18 = r34.zzb()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzn(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzn(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzn(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zzn(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.measurement.zzll r0 = new com.google.android.gms.internal.measurement.zzll
            r4 = r0
            com.google.android.gms.internal.measurement.zzli r9 = r34.zzb()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzl(com.google.android.gms.internal.measurement.zzls, com.google.android.gms.internal.measurement.zzln, com.google.android.gms.internal.measurement.zzkw, com.google.android.gms.internal.measurement.zzmh, com.google.android.gms.internal.measurement.zzjq, com.google.android.gms.internal.measurement.zzld):com.google.android.gms.internal.measurement.zzll");
    }

    private static Field zzn(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzo(T t, T t2, int i) {
        long zzA = (long) (zzA(i) & 1048575);
        if (zzK(t2, i)) {
            Object zzn2 = zzmr.zzn(t, zzA);
            Object zzn3 = zzmr.zzn(t2, zzA);
            if (zzn2 != null && zzn3 != null) {
                zzmr.zzo(t, zzA, zzkl.zzi(zzn2, zzn3));
                zzL(t, i);
            } else if (zzn3 != null) {
                zzmr.zzo(t, zzA, zzn3);
                zzL(t, i);
            }
        }
    }

    private final void zzp(T t, T t2, int i) {
        int zzA = zzA(i);
        int i2 = this.zzc[i];
        long j = (long) (zzA & 1048575);
        if (zzM(t2, i2, i)) {
            Object zzn2 = zzM(t, i2, i) ? zzmr.zzn(t, j) : null;
            Object zzn3 = zzmr.zzn(t2, j);
            if (zzn2 != null && zzn3 != null) {
                zzmr.zzo(t, j, zzkl.zzi(zzn2, zzn3));
                zzN(t, i2, i);
            } else if (zzn3 != null) {
                zzmr.zzo(t, j, zzn3);
                zzN(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x046b, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b5, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04e0, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e1, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0508, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0515, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0523, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0527, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.zzc
            int r7 = r7.length
            if (r3 >= r7) goto L_0x052b
            int r7 = r14.zzA(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzC(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.zzc
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0519;
                case 1: goto L_0x050b;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04e3;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04c3;
                case 6: goto L_0x04b8;
                case 7: goto L_0x04ab;
                case 8: goto L_0x0481;
                case 9: goto L_0x046f;
                case 10: goto L_0x0453;
                case 11: goto L_0x043f;
                case 12: goto L_0x042b;
                case 13: goto L_0x041f;
                case 14: goto L_0x0413;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0396;
                case 23: goto L_0x038b;
                case 24: goto L_0x0380;
                case 25: goto L_0x0375;
                case 26: goto L_0x036a;
                case 27: goto L_0x035b;
                case 28: goto L_0x034f;
                case 29: goto L_0x0343;
                case 30: goto L_0x0337;
                case 31: goto L_0x032b;
                case 32: goto L_0x031f;
                case 33: goto L_0x0313;
                case 34: goto L_0x0307;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0527
        L_0x0041:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzli r7 = (com.google.android.gms.internal.measurement.zzli) r7
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzE(r8, r7, r9)
            goto L_0x03cc
        L_0x0057:
            boolean r9 = r14.zzM(r15, r8, r3)
            if (r9 == 0) goto L_0x0527
            long r9 = zzG(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
            goto L_0x04e0
        L_0x0071:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = zzF(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x04e0
        L_0x008c:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0523
        L_0x009a:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0515
        L_0x00a8:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = zzF(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzv(r7)
            goto L_0x04e0
        L_0x00be:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = zzF(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x04e0
        L_0x00d4:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjd r7 = (com.google.android.gms.internal.measurement.zzjd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x046b
        L_0x00f0:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzw(r8, r7, r9)
            goto L_0x03cc
        L_0x0104:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.measurement.zzjd r7 = (com.google.android.gms.internal.measurement.zzjd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x046b
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzy(r7)
            goto L_0x04e0
        L_0x0132:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x04b5
        L_0x0140:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0515
        L_0x014e:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0523
        L_0x015c:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = zzF(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzv(r7)
            goto L_0x04e0
        L_0x0172:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = zzG(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
            goto L_0x0508
        L_0x0188:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = zzG(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
            goto L_0x0508
        L_0x019e:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0515
        L_0x01ac:
            boolean r7 = r14.zzM(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0523
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzw(r3)
            com.google.android.gms.internal.measurement.zzld.zza(r8, r7, r9)
            goto L_0x0527
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzz(r8, r7, r9)
            goto L_0x03cc
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzf(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzn(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzr(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzp(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzh(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzl(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzt(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzp(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzr(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzj(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzd(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzb(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzp(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzr(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzu(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
        L_0x0304:
            int r8 = r8 + r9
            goto L_0x04e0
        L_0x0307:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzg(r8, r7, r2)
            goto L_0x03cc
        L_0x0313:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzo(r8, r7, r2)
            goto L_0x03cc
        L_0x031f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzs(r8, r7, r2)
            goto L_0x03cc
        L_0x032b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzq(r8, r7, r2)
            goto L_0x03cc
        L_0x0337:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzi(r8, r7, r2)
            goto L_0x03cc
        L_0x0343:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzm(r8, r7, r2)
            goto L_0x03cc
        L_0x034f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzy(r8, r7)
            goto L_0x03cc
        L_0x035b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzx(r8, r7, r9)
            goto L_0x03cc
        L_0x036a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzv(r8, r7)
            goto L_0x03cc
        L_0x0375:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzu(r8, r7, r2)
            goto L_0x03cc
        L_0x0380:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzq(r8, r7, r2)
            goto L_0x03cc
        L_0x038b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzs(r8, r7, r2)
            goto L_0x03cc
        L_0x0396:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzk(r8, r7, r2)
            goto L_0x03cc
        L_0x03a1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zze(r8, r7, r2)
            goto L_0x03cc
        L_0x03ac:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzc(r8, r7, r2)
            goto L_0x03cc
        L_0x03b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzq(r8, r7, r2)
            goto L_0x03cc
        L_0x03c2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzs(r8, r7, r2)
        L_0x03cc:
            int r4 = r4 + r7
            goto L_0x0527
        L_0x03cf:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzli r7 = (com.google.android.gms.internal.measurement.zzli) r7
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzE(r8, r7, r9)
            goto L_0x03cc
        L_0x03e2:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
            goto L_0x04e0
        L_0x03fa:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x04e0
        L_0x0413:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0523
        L_0x041f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0515
        L_0x042b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzv(r7)
            goto L_0x04e0
        L_0x043f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x04e0
        L_0x0453:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjd r7 = (com.google.android.gms.internal.measurement.zzjd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
        L_0x046b:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04e1
        L_0x046f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlt r9 = r14.zzv(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlv.zzw(r8, r7, r9)
            goto L_0x03cc
        L_0x0481:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r9 == 0) goto L_0x049e
            com.google.android.gms.internal.measurement.zzjd r7 = (com.google.android.gms.internal.measurement.zzjd) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x046b
        L_0x049e:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzy(r7)
            goto L_0x04e0
        L_0x04ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
        L_0x04b5:
            int r7 = r7 + r11
            goto L_0x03cc
        L_0x04b8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0515
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            goto L_0x0523
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzw(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzv(r7)
        L_0x04e0:
            int r8 = r8 + r7
        L_0x04e1:
            int r4 = r4 + r8
            goto L_0x0527
        L_0x04e3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
            goto L_0x0508
        L_0x04f6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
            int r8 = com.google.android.gms.internal.measurement.zzjk.zzx(r9)
        L_0x0508:
            int r7 = r7 + r8
            goto L_0x03cc
        L_0x050b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
        L_0x0515:
            int r7 = r7 + 4
            goto L_0x03cc
        L_0x0519:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjk.zzw(r7)
        L_0x0523:
            int r7 = r7 + 8
            goto L_0x03cc
        L_0x0527:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x052b:
            com.google.android.gms.internal.measurement.zzmh<?, ?> r0 = r14.zzn
            java.lang.Object r1 = r0.zzd(r15)
            int r0 = r0.zzh(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x053b
            return r4
        L_0x053b:
            com.google.android.gms.internal.measurement.zzjq<?> r0 = r14.zzo
            r0.zzb(r15)
            r15 = 0
            goto L_0x0543
        L_0x0542:
            throw r15
        L_0x0543:
            goto L_0x0542
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzq(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzr(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.zzA(r2)
            int r5 = zzC(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.zzjv r4 = com.google.android.gms.internal.measurement.zzjv.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.zzjv r4 = com.google.android.gms.internal.measurement.zzjv.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.zzc
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzli r4 = (com.google.android.gms.internal.measurement.zzli) r4
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzE(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.zzM(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = zzG(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = zzF(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = zzF(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzv(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = zzF(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzw(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzy(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = zzF(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzv(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = zzG(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = zzG(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.zzM(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.lang.Object r5 = r11.zzw(r2)
            com.google.android.gms.internal.measurement.zzld.zza(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzz(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzf(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzn(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzr(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzp(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzh(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzl(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzt(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzp(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzr(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzj(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzd(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzb(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzp(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzr(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzu(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzg(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzo(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzs(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzq(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzi(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzm(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzy(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzx(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzv(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzu(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzq(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzs(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzk(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zze(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzc(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzq(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzs(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzli r4 = (com.google.android.gms.internal.measurement.zzli) r4
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzE(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.zzK(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.measurement.zzmr.zzf(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.zzmr.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.zzmr.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzv(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.zzmr.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            com.google.android.gms.internal.measurement.zzlt r5 = r11.zzv(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlv.zzw(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.zzjd r4 = (com.google.android.gms.internal.measurement.zzjd) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzy(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.zzmr.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjk.zzw(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzv(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.zzmr.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.zzmr.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjk.zzw(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzx(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.zzK(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjk.zzw(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.measurement.zzmh<?, ?> r0 = r11.zzn
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zzh(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzr(java.lang.Object):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0451 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0451 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    private final int zzs(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzir r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzkk r11 = (com.google.android.gms.internal.measurement.zzkk) r11
            boolean r12 = r11.zza()
            if (r12 != 0) goto L_0x0034
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002a
            r12 = 10
            goto L_0x002b
        L_0x002a:
            int r12 = r12 + r12
        L_0x002b:
            com.google.android.gms.internal.measurement.zzkk r11 = r11.zze(r12)
            sun.misc.Unsafe r12 = zzb
            r12.putObject(r1, r9, r11)
        L_0x0034:
            r9 = 5
            r12 = 0
            r10 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e3;
                case 19: goto L_0x0396;
                case 20: goto L_0x0353;
                case 21: goto L_0x0353;
                case 22: goto L_0x0338;
                case 23: goto L_0x02f7;
                case 24: goto L_0x02b6;
                case 25: goto L_0x025c;
                case 26: goto L_0x01a9;
                case 27: goto L_0x018e;
                case 28: goto L_0x0134;
                case 29: goto L_0x0338;
                case 30: goto L_0x00fc;
                case 31: goto L_0x02b6;
                case 32: goto L_0x02f7;
                case 33: goto L_0x00ad;
                case 34: goto L_0x005e;
                case 35: goto L_0x03e3;
                case 36: goto L_0x0396;
                case 37: goto L_0x0353;
                case 38: goto L_0x0353;
                case 39: goto L_0x0338;
                case 40: goto L_0x02f7;
                case 41: goto L_0x02b6;
                case 42: goto L_0x025c;
                case 43: goto L_0x0338;
                case 44: goto L_0x00fc;
                case 45: goto L_0x02b6;
                case 46: goto L_0x02f7;
                case 47: goto L_0x00ad;
                case 48: goto L_0x005e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x0451
            com.google.android.gms.internal.measurement.zzlt r1 = r15.zzv(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzis.zzj(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r11.add(r8)
            goto L_0x042f
        L_0x005e:
            if (r6 != r14) goto L_0x0082
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0069:
            if (r1 >= r2) goto L_0x0079
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjg.zzc(r4)
            r11.zzg(r4)
            goto L_0x0069
        L_0x0079:
            if (r1 != r2) goto L_0x007d
            goto L_0x0452
        L_0x007d:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0082:
            if (r6 != 0) goto L_0x0451
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjg.zzc(r8)
            r11.zzg(r8)
        L_0x0093:
            if (r1 >= r5) goto L_0x00ac
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009e
            goto L_0x00ac
        L_0x009e:
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjg.zzc(r8)
            r11.zzg(r8)
            goto L_0x0093
        L_0x00ac:
            return r1
        L_0x00ad:
            if (r6 != r14) goto L_0x00d1
            com.google.android.gms.internal.measurement.zzke r11 = (com.google.android.gms.internal.measurement.zzke) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b8:
            if (r1 >= r2) goto L_0x00c8
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzb(r4)
            r11.zzh(r4)
            goto L_0x00b8
        L_0x00c8:
            if (r1 != r2) goto L_0x00cc
            goto L_0x0452
        L_0x00cc:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x00d1:
            if (r6 != 0) goto L_0x0451
            com.google.android.gms.internal.measurement.zzke r11 = (com.google.android.gms.internal.measurement.zzke) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzb(r4)
            r11.zzh(r4)
        L_0x00e2:
            if (r1 >= r5) goto L_0x00fb
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00ed
            goto L_0x00fb
        L_0x00ed:
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzb(r4)
            r11.zzh(r4)
            goto L_0x00e2
        L_0x00fb:
            return r1
        L_0x00fc:
            if (r6 != r14) goto L_0x0103
            int r2 = com.google.android.gms.internal.measurement.zzis.zzl(r3, r4, r11, r7)
            goto L_0x0114
        L_0x0103:
            if (r6 != 0) goto L_0x0451
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r11
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzis.zzk(r2, r3, r4, r5, r6, r7)
        L_0x0114:
            com.google.android.gms.internal.measurement.zzkd r1 = (com.google.android.gms.internal.measurement.zzkd) r1
            com.google.android.gms.internal.measurement.zzmi r3 = r1.zzc
            com.google.android.gms.internal.measurement.zzmi r4 = com.google.android.gms.internal.measurement.zzmi.zza()
            if (r3 != r4) goto L_0x011f
            r3 = 0
        L_0x011f:
            com.google.android.gms.internal.measurement.zzkh r4 = r15.zzx(r8)
            com.google.android.gms.internal.measurement.zzmh<?, ?> r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzlv.zzG(r6, r11, r4, r3, r5)
            if (r3 != 0) goto L_0x012f
            goto L_0x027d
        L_0x012f:
            com.google.android.gms.internal.measurement.zzmi r3 = (com.google.android.gms.internal.measurement.zzmi) r3
            r1.zzc = r3
            return r2
        L_0x0134:
            if (r6 != r14) goto L_0x0451
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0189
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0184
            if (r4 != 0) goto L_0x014a
            com.google.android.gms.internal.measurement.zzjd r4 = com.google.android.gms.internal.measurement.zzjd.zzb
            r11.add(r4)
            goto L_0x0152
        L_0x014a:
            com.google.android.gms.internal.measurement.zzjd r6 = com.google.android.gms.internal.measurement.zzjd.zzj(r3, r1, r4)
            r11.add(r6)
        L_0x0151:
            int r1 = r1 + r4
        L_0x0152:
            if (r1 >= r5) goto L_0x0183
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015d
            goto L_0x0183
        L_0x015d:
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0179
            if (r4 != 0) goto L_0x0171
            com.google.android.gms.internal.measurement.zzjd r4 = com.google.android.gms.internal.measurement.zzjd.zzb
            r11.add(r4)
            goto L_0x0152
        L_0x0171:
            com.google.android.gms.internal.measurement.zzjd r6 = com.google.android.gms.internal.measurement.zzjd.zzj(r3, r1, r4)
            r11.add(r6)
            goto L_0x0151
        L_0x0179:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x017e:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x0183:
            return r1
        L_0x0184:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0189:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x018e:
            if (r6 == r14) goto L_0x0192
            goto L_0x0451
        L_0x0192:
            com.google.android.gms.internal.measurement.zzlt r1 = r15.zzv(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r11
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.zzis.zzm(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a9:
            if (r6 != r14) goto L_0x0451
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x01fc
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f7
            if (r6 != 0) goto L_0x01c4
            r11.add(r1)
            goto L_0x01cf
        L_0x01c4:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkl.zza
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01ce:
            int r4 = r4 + r6
        L_0x01cf:
            if (r4 >= r5) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0451
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01f2
            if (r6 != 0) goto L_0x01e7
            r11.add(r1)
            goto L_0x01cf
        L_0x01e7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkl.zza
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01ce
        L_0x01f2:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x01f7:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x01fc:
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0257
            if (r6 != 0) goto L_0x020a
            r11.add(r1)
            goto L_0x021d
        L_0x020a:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zzmw.zzb(r3, r4, r8)
            if (r9 == 0) goto L_0x0252
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkl.zza
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x021c:
            r4 = r8
        L_0x021d:
            if (r4 >= r5) goto L_0x0451
            int r6 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0451
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x024d
            if (r6 != 0) goto L_0x0235
            r11.add(r1)
            goto L_0x021d
        L_0x0235:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zzmw.zzb(r3, r4, r8)
            if (r9 == 0) goto L_0x0248
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkl.zza
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x021c
        L_0x0248:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzf()
            throw r1
        L_0x024d:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x0252:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzf()
            throw r1
        L_0x0257:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zzb()
            throw r1
        L_0x025c:
            r1 = 0
            if (r6 != r14) goto L_0x0285
            com.google.android.gms.internal.measurement.zzit r11 = (com.google.android.gms.internal.measurement.zzit) r11
            int r2 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0268:
            if (r2 >= r4) goto L_0x027b
            int r2 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r2, r7)
            long r5 = r7.zzb
            int r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0276
            r5 = 1
            goto L_0x0277
        L_0x0276:
            r5 = 0
        L_0x0277:
            r11.zzd(r5)
            goto L_0x0268
        L_0x027b:
            if (r2 != r4) goto L_0x0280
        L_0x027d:
            r1 = r2
            goto L_0x0452
        L_0x0280:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0285:
            if (r6 != 0) goto L_0x0451
            com.google.android.gms.internal.measurement.zzit r11 = (com.google.android.gms.internal.measurement.zzit) r11
            int r4 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0295
            r6 = 1
            goto L_0x0296
        L_0x0295:
            r6 = 0
        L_0x0296:
            r11.zzd(r6)
        L_0x0299:
            if (r4 >= r5) goto L_0x02b5
            int r6 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a4
            goto L_0x02b5
        L_0x02a4:
            int r4 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x02b0
            r6 = 1
            goto L_0x02b1
        L_0x02b0:
            r6 = 0
        L_0x02b1:
            r11.zzd(r6)
            goto L_0x0299
        L_0x02b5:
            return r4
        L_0x02b6:
            if (r6 != r14) goto L_0x02d6
            com.google.android.gms.internal.measurement.zzke r11 = (com.google.android.gms.internal.measurement.zzke) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02c1:
            if (r1 >= r2) goto L_0x02cd
            int r4 = com.google.android.gms.internal.measurement.zzis.zzd(r3, r1)
            r11.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02c1
        L_0x02cd:
            if (r1 != r2) goto L_0x02d1
            goto L_0x0452
        L_0x02d1:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x02d6:
            if (r6 != r9) goto L_0x0451
            com.google.android.gms.internal.measurement.zzke r11 = (com.google.android.gms.internal.measurement.zzke) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zzd(r17, r18)
            r11.zzh(r1)
        L_0x02e1:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f6
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ee
            goto L_0x02f6
        L_0x02ee:
            int r1 = com.google.android.gms.internal.measurement.zzis.zzd(r3, r4)
            r11.zzh(r1)
            goto L_0x02e1
        L_0x02f6:
            return r1
        L_0x02f7:
            if (r6 != r14) goto L_0x0317
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0302:
            if (r1 >= r2) goto L_0x030e
            long r4 = com.google.android.gms.internal.measurement.zzis.zze(r3, r1)
            r11.zzg(r4)
            int r1 = r1 + 8
            goto L_0x0302
        L_0x030e:
            if (r1 != r2) goto L_0x0312
            goto L_0x0452
        L_0x0312:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0317:
            if (r6 != r10) goto L_0x0451
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            long r8 = com.google.android.gms.internal.measurement.zzis.zze(r17, r18)
            r11.zzg(r8)
        L_0x0322:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0337
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032f
            goto L_0x0337
        L_0x032f:
            long r8 = com.google.android.gms.internal.measurement.zzis.zze(r3, r4)
            r11.zzg(r8)
            goto L_0x0322
        L_0x0337:
            return r1
        L_0x0338:
            if (r6 != r14) goto L_0x0340
            int r1 = com.google.android.gms.internal.measurement.zzis.zzl(r3, r4, r11, r7)
            goto L_0x0452
        L_0x0340:
            if (r6 == 0) goto L_0x0344
            goto L_0x0451
        L_0x0344:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r11
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.zzis.zzk(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0353:
            if (r6 != r14) goto L_0x0373
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035e:
            if (r1 >= r2) goto L_0x036a
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r1, r7)
            long r4 = r7.zzb
            r11.zzg(r4)
            goto L_0x035e
        L_0x036a:
            if (r1 != r2) goto L_0x036e
            goto L_0x0452
        L_0x036e:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0373:
            if (r6 != 0) goto L_0x0451
            com.google.android.gms.internal.measurement.zzkx r11 = (com.google.android.gms.internal.measurement.zzkx) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r4, r7)
            long r8 = r7.zzb
            r11.zzg(r8)
        L_0x0380:
            if (r1 >= r5) goto L_0x0395
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x038b
            goto L_0x0395
        L_0x038b:
            int r1 = com.google.android.gms.internal.measurement.zzis.zzc(r3, r4, r7)
            long r8 = r7.zzb
            r11.zzg(r8)
            goto L_0x0380
        L_0x0395:
            return r1
        L_0x0396:
            if (r6 != r14) goto L_0x03ba
            com.google.android.gms.internal.measurement.zzjw r11 = (com.google.android.gms.internal.measurement.zzjw) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03a1:
            if (r1 >= r2) goto L_0x03b1
            int r4 = com.google.android.gms.internal.measurement.zzis.zzd(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r11.zzd(r4)
            int r1 = r1 + 4
            goto L_0x03a1
        L_0x03b1:
            if (r1 != r2) goto L_0x03b5
            goto L_0x0452
        L_0x03b5:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x03ba:
            if (r6 != r9) goto L_0x0451
            com.google.android.gms.internal.measurement.zzjw r11 = (com.google.android.gms.internal.measurement.zzjw) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zzd(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.zzd(r1)
        L_0x03c9:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e2
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d6
            goto L_0x03e2
        L_0x03d6:
            int r1 = com.google.android.gms.internal.measurement.zzis.zzd(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.zzd(r1)
            goto L_0x03c9
        L_0x03e2:
            return r1
        L_0x03e3:
            if (r6 != r14) goto L_0x0406
            com.google.android.gms.internal.measurement.zzjm r11 = (com.google.android.gms.internal.measurement.zzjm) r11
            int r1 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ee:
            if (r1 >= r2) goto L_0x03fe
            long r4 = com.google.android.gms.internal.measurement.zzis.zze(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r11.zzd(r4)
            int r1 = r1 + 8
            goto L_0x03ee
        L_0x03fe:
            if (r1 != r2) goto L_0x0401
            goto L_0x0452
        L_0x0401:
            com.google.android.gms.internal.measurement.zzkn r1 = com.google.android.gms.internal.measurement.zzkn.zza()
            throw r1
        L_0x0406:
            if (r6 != r10) goto L_0x0451
            com.google.android.gms.internal.measurement.zzjm r11 = (com.google.android.gms.internal.measurement.zzjm) r11
            long r8 = com.google.android.gms.internal.measurement.zzis.zze(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.zzd(r8)
        L_0x0415:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042e
            int r4 = com.google.android.gms.internal.measurement.zzis.zza(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0422
            goto L_0x042e
        L_0x0422:
            long r8 = com.google.android.gms.internal.measurement.zzis.zze(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.zzd(r8)
            goto L_0x0415
        L_0x042e:
            return r1
        L_0x042f:
            if (r4 >= r5) goto L_0x0450
            int r8 = com.google.android.gms.internal.measurement.zzis.zza(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x043a
            goto L_0x0450
        L_0x043a:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzis.zzj(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r11.add(r8)
            goto L_0x042f
        L_0x0450:
            return r4
        L_0x0451:
            r1 = r4
        L_0x0452:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzir):int");
    }

    private final <K, V> int zzt(T t, byte[] bArr, int i, int i2, int i3, long j, zzir zzir) throws IOException {
        Unsafe unsafe = zzb;
        Object zzw = zzw(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zzlc) object).zze()) {
            zzlc zzc2 = zzlc.zza().zzc();
            zzld.zzb(zzc2, object);
            unsafe.putObject(t, j, zzc2);
        }
        zzlb zzlb = (zzlb) zzw;
        throw null;
    }

    private final int zzu(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzir) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        zzir zzir2 = zzir;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(zzis.zze(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(zzis.zzd(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzc2 = zzis.zzc(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzir2.zzb));
                    unsafe.putInt(t2, j3, i11);
                    return zzc2;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zza2 = zzis.zza(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzir2.zza));
                    unsafe.putInt(t2, j3, i11);
                    return zza2;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(zzis.zze(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(zzis.zzd(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzc3 = zzis.zzc(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(zzir2.zzb != 0));
                    unsafe.putInt(t2, j3, i11);
                    return zzc3;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zza3 = zzis.zza(bArr2, i9, zzir2);
                    int i14 = zzir2.zza;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & C.ENCODING_PCM_A_LAW) == 0 || zzmw.zzb(bArr2, zza3, zza3 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, zza3, i14, zzkl.zza));
                        zza3 += i14;
                    } else {
                        throw zzkn.zzf();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zza3;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzi2 = zzis.zzi(zzv(i13), bArr2, i9, i2, zzir2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, zzir2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzkl.zzi(object, zzir2.zzc));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zzi2;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zzh2 = zzis.zzh(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, zzir2.zzc);
                    unsafe.putInt(t2, j3, i11);
                    return zzh2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zza4 = zzis.zza(bArr2, i9, zzir2);
                    int i15 = zzir2.zza;
                    zzkh zzx = zzx(i13);
                    if (zzx == null || zzx.zza(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        zzf(t).zzh(i10, Long.valueOf((long) i15));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zza5 = zzis.zza(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzjg.zzb(zzir2.zza)));
                    unsafe.putInt(t2, j3, i11);
                    return zza5;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzc4 = zzis.zzc(bArr2, i9, zzir2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzjg.zzc(zzir2.zzb)));
                    unsafe.putInt(t2, j3, i11);
                    return zzc4;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzj2 = zzis.zzj(zzv(i13), bArr, i, i2, (i10 & -8) | 4, zzir);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, zzir2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzkl.zzi(object2, zzir2.zzc));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zzj2;
                }
                break;
        }
        return i9;
    }

    private final zzlt zzv(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlt zzlt = (zzlt) this.zzd[i3];
        if (zzlt != null) {
            return zzlt;
        }
        zzlt zzb2 = zzlq.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzkh zzx(int i) {
        int i2 = i / 3;
        return (zzkh) this.zzd[i2 + i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a8, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f1, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0314, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r20;
        r8 = 1048575;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzy(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x033d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.zzis.zzb(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.zzP(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.zzO(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x0317
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzC(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0213
            int[] r10 = r15.zzc
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x0090
            r23 = r1
            r20 = r2
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0096
        L_0x0090:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x0096:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01da;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01a9;
                case 5: goto L_0x018d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014c;
                case 8: goto L_0x012b;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e7;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00d6;
                case 13: goto L_0x0169;
                case 14: goto L_0x018d;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00a3;
                default: goto L_0x009a;
            }
        L_0x009a:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x020a
        L_0x00a3:
            if (r3 != 0) goto L_0x00bc
            int r17 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjg.zzc(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01d2
        L_0x00bc:
            r13 = r20
            r20 = r33
            goto L_0x0126
        L_0x00c1:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.measurement.zzjg.zzb(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00d6:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00e7:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0126
            int r0 = com.google.android.gms.internal.measurement.zzis.zzh(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x0207
        L_0x00f9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0124
            com.google.android.gms.internal.measurement.zzlt r0 = r15.zzv(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.measurement.zzis.zzi(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x011a:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkl.zzi(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x0124:
            r2 = r34
        L_0x0126:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020a
        L_0x012b:
            r2 = r34
            r13 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r0) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0142
            int r0 = com.google.android.gms.internal.measurement.zzis.zzf(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.measurement.zzis.zzg(r12, r4, r11)
        L_0x0146:
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x014c:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r4, r11)
            long r3 = r11.zzb
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            com.google.android.gms.internal.measurement.zzmr.zzi(r14, r8, r5)
            goto L_0x017d
        L_0x0169:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.measurement.zzis.zzd(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x017d:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x018d:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r22 = com.google.android.gms.internal.measurement.zzis.zze(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0207
        L_0x01a9:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x01bc:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r17 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r4, r11)
            long r4 = r11.zzb
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01d2:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0257
        L_0x01da:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.measurement.zzis.zzd(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmr.zzk(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0207
        L_0x01f1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r0 = com.google.android.gms.internal.measurement.zzis.zze(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmr.zzm(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0207:
            r6 = r6 | r21
            goto L_0x0255
        L_0x020a:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x0317
        L_0x0213:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x026e
            r1 = 2
            if (r3 != r1) goto L_0x0261
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.measurement.zzkk r0 = (com.google.android.gms.internal.measurement.zzkk) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0241
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0239
            r1 = 10
            goto L_0x023a
        L_0x0239:
            int r1 = r1 + r1
        L_0x023a:
            com.google.android.gms.internal.measurement.zzkk r0 = r0.zze(r1)
            r10.putObject(r14, r8, r0)
        L_0x0241:
            r5 = r0
            com.google.android.gms.internal.measurement.zzlt r0 = r15.zzv(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.zzis.zzm(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0255:
            r9 = r10
            r2 = r13
        L_0x0257:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0261:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02f4
        L_0x026e:
            r1 = 49
            if (r0 > r1) goto L_0x02c0
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02be
        L_0x02aa:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x0335
        L_0x02be:
            r2 = r0
            goto L_0x02f5
        L_0x02c0:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02fa
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02f4
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x02f4:
            r2 = r15
        L_0x02f5:
            r6 = r24
            r7 = r25
            goto L_0x0317
        L_0x02fa:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x0317:
            com.google.android.gms.internal.measurement.zzmi r4 = zzf(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzis.zzn(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
        L_0x0335:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x033d:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0350
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0350:
            r1 = r34
            if (r0 != r1) goto L_0x0355
            return r0
        L_0x0355:
            com.google.android.gms.internal.measurement.zzkn r0 = com.google.android.gms.internal.measurement.zzkn.zze()
            goto L_0x035b
        L_0x035a:
            throw r0
        L_0x035b:
            goto L_0x035a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzy(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    private static boolean zzz(Object obj, int i, zzlt zzlt) {
        return zzlt.zzj(zzmr.zzn(obj, (long) (i & 1048575)));
    }

    public final T zza() {
        return ((zzkd) this.zzg).zzl(4, (Object) null, (Object) null);
    }

    public final boolean zzb(T t, T t2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzA = zzA(i);
            long j = (long) (zzA & 1048575);
            switch (zzC(zzA)) {
                case 0:
                    if (zzI(t, t2, i) && Double.doubleToLongBits(zzmr.zzl(t, j)) == Double.doubleToLongBits(zzmr.zzl(t2, j))) {
                        continue;
                    }
                case 1:
                    if (zzI(t, t2, i) && Float.floatToIntBits(zzmr.zzj(t, j)) == Float.floatToIntBits(zzmr.zzj(t2, j))) {
                        continue;
                    }
                case 2:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                case 3:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                case 4:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 5:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                case 6:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 7:
                    if (zzI(t, t2, i) && zzmr.zzh(t, j) == zzmr.zzh(t2, j)) {
                        continue;
                    }
                case 8:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                case 9:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                case 10:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                case 11:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 12:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 13:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 14:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                case 15:
                    if (zzI(t, t2, i) && zzmr.zzd(t, j) == zzmr.zzd(t2, j)) {
                        continue;
                    }
                case 16:
                    if (zzI(t, t2, i) && zzmr.zzf(t, j) == zzmr.zzf(t2, j)) {
                        continue;
                    }
                case 17:
                    if (zzI(t, t2, i) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j));
                    break;
                case 50:
                    z = zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzB = (long) (zzB(i) & 1048575);
                    if (zzmr.zzd(t, zzB) == zzmr.zzd(t2, zzB) && zzlv.zzD(zzmr.zzn(t, j), zzmr.zzn(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzn.zzd(t).equals(this.zzn.zzd(t2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zzb(t);
        this.zzo.zzb(t2);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.zzA(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzC(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzG(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzG(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = zzH(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zzf(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzG(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzF(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzG(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzG(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = zzE(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.zzM(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = zzD(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmr.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmr.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmr.zzn(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.zzmr.zzh(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zzf(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmr.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmr.zzd(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmr.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmr.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.zzmr.zzj(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.zzmr.zzl(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkl.zze(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzmh<?, ?> r0 = r8.zzn
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.measurement.zzjq<?> r0 = r8.zzo
            r0.zzb(r9)
            r9 = 0
            goto L_0x0245
        L_0x0244:
            throw r9
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzc(java.lang.Object):int");
    }

    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzA = zzA(i);
                long j = (long) (1048575 & zzA);
                int i2 = this.zzc[i];
                switch (zzC(zzA)) {
                    case 0:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzm(t, j, zzmr.zzl(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 1:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzk(t, j, zzmr.zzj(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 2:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 3:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 4:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 5:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 6:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 7:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzi(t, j, zzmr.zzh(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 8:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 9:
                        zzo(t, t2, i);
                        break;
                    case 10:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 11:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 12:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 13:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 14:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 15:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zze(t, j, zzmr.zzd(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 16:
                        if (!zzK(t2, i)) {
                            break;
                        } else {
                            zzmr.zzg(t, j, zzmr.zzf(t2, j));
                            zzL(t, i);
                            break;
                        }
                    case 17:
                        zzo(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzm.zzb(t, t2, j);
                        break;
                    case 50:
                        zzlv.zzI(this.zzq, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzM(t2, i2, i)) {
                            break;
                        } else {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzN(t, i2, i);
                            break;
                        }
                    case 60:
                        zzp(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzM(t2, i2, i)) {
                            break;
                        } else {
                            zzmr.zzo(t, j, zzmr.zzn(t2, j));
                            zzN(t, i2, i);
                            break;
                        }
                    case 68:
                        zzp(t, t2, i);
                        break;
                }
            }
            zzlv.zzF(this.zzn, t, t2);
            if (this.zzh) {
                zzlv.zzE(this.zzo, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    public final int zze(T t) {
        return this.zzi ? zzr(t) : zzq(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032e, code lost:
        if (r0 != r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x034a, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0378, code lost:
        if (r0 != r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x039a, code lost:
        if (r0 != r15) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f4, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022b, code lost:
        r5 = r6 | r23;
        r6 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0265, code lost:
        r5 = r6 | r23;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0269, code lost:
        r3 = r8;
        r1 = r11;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0285, code lost:
        r7 = r33;
        r18 = r8;
        r26 = r10;
        r8 = r11;
        r27 = r6;
        r6 = r31;
        r31 = r20;
        r20 = r27;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzg(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzir r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x040b
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.zzis.zzb(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r8
            int r2 = r15.zzP(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.zzO(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r31 = r0
            r2 = r1
            r8 = r4
            r20 = r5
            r26 = r10
            r7 = r11
            r18 = 0
            r25 = -1
            goto L_0x039d
        L_0x0050:
            int[] r3 = r15.zzc
            int r20 = r2 + 1
            r3 = r3[r20]
            int r8 = zzC(r3)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r8 > r0) goto L_0x0298
            int[] r0 = r15.zzc
            int r23 = r2 + 2
            r0 = r0[r23]
            int r23 = r0 >>> 20
            r11 = 1
            int r23 = r11 << r23
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0088
            if (r6 == r11) goto L_0x0081
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0081:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r11 = r0
            goto L_0x0089
        L_0x0088:
            r11 = r6
        L_0x0089:
            r6 = r5
            r0 = 5
            switch(r8) {
                case 0: goto L_0x024b;
                case 1: goto L_0x0231;
                case 2: goto L_0x020e;
                case 3: goto L_0x020e;
                case 4: goto L_0x01f7;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01c0;
                case 7: goto L_0x01a1;
                case 8: goto L_0x017f;
                case 9: goto L_0x0151;
                case 10: goto L_0x013a;
                case 11: goto L_0x01f7;
                case 12: goto L_0x0102;
                case 13: goto L_0x01c0;
                case 14: goto L_0x01d6;
                case 15: goto L_0x00e8;
                case 16: goto L_0x00ba;
                default: goto L_0x008e;
            }
        L_0x008e:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 3
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0285
            com.google.android.gms.internal.measurement.zzlt r0 = r15.zzv(r8)
            int r1 = r20 << 3
            r5 = r1 | 4
            r1 = r30
            r12 = r3
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzis.zzj(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x026f
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x027c
        L_0x00ba:
            if (r7 != 0) goto L_0x00dd
            r12 = r30
            int r7 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r1, r9)
            long r0 = r9.zzb
            long r24 = com.google.android.gms.internal.measurement.zzjg.zzc(r0)
            r8 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r19 = -1
            r2 = r3
            r31 = r11
            r11 = r21
            r8 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            goto L_0x022b
        L_0x00dd:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            goto L_0x01f4
        L_0x00e8:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01f4
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.measurement.zzjg.zzb(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0265
        L_0x0102:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01f4
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.measurement.zzkh r2 = r15.zzx(r8)
            if (r2 == 0) goto L_0x0135
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x0120
            goto L_0x0135
        L_0x0120:
            com.google.android.gms.internal.measurement.zzmi r2 = zzf(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r5 = r6
            r3 = r8
            r1 = r11
            r2 = r20
            r6 = r31
            goto L_0x02e7
        L_0x0135:
            r10.putInt(r14, r3, r1)
            goto L_0x0265
        L_0x013a:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01f4
            int r0 = com.google.android.gms.internal.measurement.zzis.zzh(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0265
        L_0x0151:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01f4
            com.google.android.gms.internal.measurement.zzlt r0 = r15.zzv(r8)
            int r0 = com.google.android.gms.internal.measurement.zzis.zzi(r0, r12, r1, r13, r9)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0170
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0265
        L_0x0170:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkl.zzi(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x0265
        L_0x017f:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 2
            r19 = -1
            if (r7 != r0) goto L_0x01f4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0196
            int r0 = com.google.android.gms.internal.measurement.zzis.zzf(r12, r1, r9)
            goto L_0x019a
        L_0x0196:
            int r0 = com.google.android.gms.internal.measurement.zzis.zzg(r12, r1, r9)
        L_0x019a:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0265
        L_0x01a1:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != 0) goto L_0x01f4
            int r0 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r1, r9)
            long r1 = r9.zzb
            r21 = 0
            int r5 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x01ba
            r1 = 1
            goto L_0x01bb
        L_0x01ba:
            r1 = 0
        L_0x01bb:
            com.google.android.gms.internal.measurement.zzmr.zzi(r14, r3, r1)
            goto L_0x0265
        L_0x01c0:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            if (r7 != r0) goto L_0x01f4
            int r0 = com.google.android.gms.internal.measurement.zzis.zzd(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
            goto L_0x0265
        L_0x01d6:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 1
            r19 = -1
            if (r7 != r0) goto L_0x01f4
            long r21 = com.google.android.gms.internal.measurement.zzis.zze(r12, r1)
            r0 = r10
            r7 = r1
            r1 = r29
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0265
        L_0x01f4:
            r2 = r1
            goto L_0x0285
        L_0x01f7:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != 0) goto L_0x0285
            int r0 = com.google.android.gms.internal.measurement.zzis.zza(r12, r2, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x0265
        L_0x020e:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != 0) goto L_0x0285
            int r7 = com.google.android.gms.internal.measurement.zzis.zzc(r12, r2, r9)
            long r1 = r9.zzb
            r0 = r10
            r21 = r1
            r1 = r29
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
        L_0x022b:
            r5 = r6 | r23
            r6 = r31
            r0 = r7
            goto L_0x0269
        L_0x0231:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0285
            int r0 = com.google.android.gms.internal.measurement.zzis.zzd(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmr.zzk(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x0265
        L_0x024b:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r21
            r0 = 1
            r19 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0285
            long r0 = com.google.android.gms.internal.measurement.zzis.zze(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmr.zzm(r14, r3, r0)
            int r0 = r2 + 8
        L_0x0265:
            r5 = r6 | r23
            r6 = r31
        L_0x0269:
            r3 = r8
            r1 = r11
            r2 = r20
            goto L_0x02e7
        L_0x026f:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkl.zzi(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x027c:
            r5 = r6 | r23
            r12 = r30
            r6 = r31
            r13 = r32
            goto L_0x0269
        L_0x0285:
            r7 = r33
            r18 = r8
            r26 = r10
            r8 = r11
            r25 = -1
            r27 = r6
            r6 = r31
            r31 = r20
            r20 = r27
            goto L_0x039d
        L_0x0298:
            r12 = r3
            r3 = r8
            r4 = r20
            r11 = r21
            r19 = -1
            r8 = r2
            r2 = r1
            r0 = 27
            if (r3 != r0) goto L_0x02fc
            r0 = 2
            if (r7 != r0) goto L_0x02eb
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.measurement.zzkk r0 = (com.google.android.gms.internal.measurement.zzkk) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x02c6
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02be
            r1 = 10
            goto L_0x02bf
        L_0x02be:
            int r1 = r1 + r1
        L_0x02bf:
            com.google.android.gms.internal.measurement.zzkk r0 = r0.zze(r1)
            r10.putObject(r14, r12, r0)
        L_0x02c6:
            r7 = r0
            com.google.android.gms.internal.measurement.zzlt r0 = r15.zzv(r8)
            r1 = r11
            r3 = r2
            r2 = r30
            r12 = r4
            r4 = r32
            r20 = r5
            r5 = r7
            r21 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.zzis.zzm(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r3 = r8
            r2 = r12
            r5 = r20
            r6 = r21
            r12 = r30
        L_0x02e7:
            r11 = r33
            goto L_0x0019
        L_0x02eb:
            r20 = r5
            r21 = r6
            r15 = r2
            r31 = r4
            r18 = r8
            r26 = r10
            r22 = r11
            r25 = -1
            goto L_0x037b
        L_0x02fc:
            r20 = r5
            r21 = r6
            r5 = r2
            r6 = r4
            r0 = 49
            if (r3 > r0) goto L_0x034e
            r4 = r22
            long r1 = (long) r4
            r0 = r28
            r22 = r1
            r1 = r29
            r2 = r30
            r24 = r3
            r3 = r5
            r4 = r32
            r15 = r5
            r5 = r11
            r31 = r6
            r18 = r8
            r19 = r24
            r25 = -1
            r26 = r10
            r9 = r22
            r22 = r11
            r11 = r19
            r14 = r34
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x034a
        L_0x0330:
            r15 = r28
            r14 = r29
            r12 = r30
            r2 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r3 = r18
            r5 = r20
            r6 = r21
            r1 = r22
            r10 = r26
            goto L_0x0019
        L_0x034a:
            r7 = r33
            r2 = r0
            goto L_0x037e
        L_0x034e:
            r19 = r3
            r15 = r5
            r31 = r6
            r18 = r8
            r26 = r10
            r4 = r22
            r25 = -1
            r22 = r11
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x0383
            r0 = 2
            if (r7 != r0) goto L_0x037b
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r12
            r8 = r34
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x034a
            goto L_0x0330
        L_0x037b:
            r7 = r33
            r2 = r15
        L_0x037e:
            r6 = r21
            r8 = r22
            goto L_0x039d
        L_0x0383:
            r0 = r28
            r1 = r29
            r2 = r30
            r8 = r4
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r31
            r10 = r12
            r12 = r18
            r13 = r34
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x034a
            goto L_0x0330
        L_0x039d:
            if (r8 != r7) goto L_0x03ab
            if (r7 == 0) goto L_0x03ab
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r20
            goto L_0x0414
        L_0x03ab:
            r9 = r28
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x03e4
            r10 = r34
            com.google.android.gms.internal.measurement.zzjp r0 = r10.zzd
            com.google.android.gms.internal.measurement.zzjp r1 = com.google.android.gms.internal.measurement.zzjp.zza()
            if (r0 == r1) goto L_0x03df
            com.google.android.gms.internal.measurement.zzli r0 = r9.zzg
            com.google.android.gms.internal.measurement.zzjp r1 = r10.zzd
            r11 = r31
            com.google.android.gms.internal.measurement.zzkb r0 = r1.zzc(r0, r11)
            if (r0 != 0) goto L_0x03d9
            com.google.android.gms.internal.measurement.zzmi r4 = zzf(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzis.zzn(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03f9
        L_0x03d9:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.measurement.zzka r0 = (com.google.android.gms.internal.measurement.zzka) r0
            throw r17
        L_0x03df:
            r12 = r29
            r11 = r31
            goto L_0x03ea
        L_0x03e4:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03ea:
            com.google.android.gms.internal.measurement.zzmi r4 = zzf(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzis.zzn(r0, r1, r2, r3, r4, r5)
        L_0x03f9:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r18
            r5 = r20
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x040b:
            r20 = r5
            r21 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0414:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x041f
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x041f:
            int r3 = r9.zzk
        L_0x0421:
            int r4 = r9.zzl
            if (r3 >= r4) goto L_0x044c
            int[] r4 = r9.zzj
            r4 = r4[r3]
            int[] r5 = r9.zzc
            r5 = r5[r4]
            int r5 = r9.zzA(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmr.zzn(r12, r5)
            if (r5 != 0) goto L_0x043a
            goto L_0x0440
        L_0x043a:
            com.google.android.gms.internal.measurement.zzkh r6 = r9.zzx(r4)
            if (r6 != 0) goto L_0x0443
        L_0x0440:
            int r3 = r3 + 1
            goto L_0x0421
        L_0x0443:
            com.google.android.gms.internal.measurement.zzlc r5 = (com.google.android.gms.internal.measurement.zzlc) r5
            java.lang.Object r0 = r9.zzw(r4)
            com.google.android.gms.internal.measurement.zzlb r0 = (com.google.android.gms.internal.measurement.zzlb) r0
            throw r17
        L_0x044c:
            if (r7 != 0) goto L_0x0458
            r2 = r32
            if (r0 != r2) goto L_0x0453
            goto L_0x045e
        L_0x0453:
            com.google.android.gms.internal.measurement.zzkn r0 = com.google.android.gms.internal.measurement.zzkn.zze()
            throw r0
        L_0x0458:
            r2 = r32
            if (r0 > r2) goto L_0x045f
            if (r1 != r7) goto L_0x045f
        L_0x045e:
            return r0
        L_0x045f:
            com.google.android.gms.internal.measurement.zzkn r0 = com.google.android.gms.internal.measurement.zzkn.zze()
            goto L_0x0465
        L_0x0464:
            throw r0
        L_0x0465:
            goto L_0x0464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzll.zzg(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    public final void zzh(T t, byte[] bArr, int i, int i2, zzir zzir) throws IOException {
        if (this.zzi) {
            zzy(t, bArr, i, i2, zzir);
        } else {
            zzg(t, bArr, i, i2, 0, zzir);
        }
    }

    public final void zzi(T t) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzA = (long) (zzA(this.zzj[i2]) & 1048575);
            Object zzn2 = zzmr.zzn(t, zzA);
            if (zzn2 != null) {
                ((zzlc) zzn2).zzd();
                zzmr.zzo(t, zzA, zzn2);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(t, (long) this.zzj[i]);
            i++;
        }
        this.zzn.zze(t);
        if (this.zzh) {
            this.zzo.zzc(t);
        }
    }

    public final boolean zzj(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzA = zzA(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzA) != 0 && !zzJ(t, i6, i2, i, i10)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(t2, i7, i6) && !zzz(t2, zzA, zzv(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC == 50 && !((zzlc) zzmr.zzn(t2, (long) (zzA & 1048575))).isEmpty()) {
                            zzlb zzlb = (zzlb) zzw(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmr.zzn(t2, (long) (zzA & 1048575));
                if (!list.isEmpty()) {
                    zzlt zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzj(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzJ(t, i6, i2, i, i10) && !zzz(t2, zzA, zzv(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zzb(t2);
        throw null;
    }

    public final void zzm(T t, zzjl zzjl) throws IOException {
        if (!this.zzi) {
            zzR(t, zzjl);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzA = zzA(i);
                int i2 = this.zzc[i];
                switch (zzC(zzA)) {
                    case 0:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzf(i2, zzmr.zzl(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zze(i2, zzmr.zzj(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzc(i2, zzmr.zzf(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzh(i2, zzmr.zzf(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzi(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzj(i2, zzmr.zzf(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzk(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzl(i2, zzmr.zzh(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzT(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzjl);
                            break;
                        }
                    case 9:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzr(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzv(i));
                            break;
                        }
                    case 10:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzn(i2, (zzjd) zzmr.zzn(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzo(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzg(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzb(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzd(i2, zzmr.zzf(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzp(i2, zzmr.zzd(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzq(i2, zzmr.zzf(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzK(t, i)) {
                            break;
                        } else {
                            zzjl.zzs(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzv(i));
                            break;
                        }
                    case 18:
                        zzlv.zzJ(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 19:
                        zzlv.zzK(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 20:
                        zzlv.zzL(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 21:
                        zzlv.zzM(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 22:
                        zzlv.zzQ(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 23:
                        zzlv.zzO(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 24:
                        zzlv.zzT(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 25:
                        zzlv.zzW(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 26:
                        zzlv.zzX(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl);
                        break;
                    case 27:
                        zzlv.zzZ(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, zzv(i));
                        break;
                    case 28:
                        zzlv.zzY(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl);
                        break;
                    case 29:
                        zzlv.zzR(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 30:
                        zzlv.zzV(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 31:
                        zzlv.zzU(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 32:
                        zzlv.zzP(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 33:
                        zzlv.zzS(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 34:
                        zzlv.zzN(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, false);
                        break;
                    case 35:
                        zzlv.zzJ(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 36:
                        zzlv.zzK(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 37:
                        zzlv.zzL(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 38:
                        zzlv.zzM(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 39:
                        zzlv.zzQ(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 40:
                        zzlv.zzO(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 41:
                        zzlv.zzT(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 42:
                        zzlv.zzW(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 43:
                        zzlv.zzR(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 44:
                        zzlv.zzV(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 45:
                        zzlv.zzU(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 46:
                        zzlv.zzP(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 47:
                        zzlv.zzS(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 48:
                        zzlv.zzN(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, true);
                        break;
                    case 49:
                        zzlv.zzaa(this.zzc[i], (List) zzmr.zzn(t, (long) (zzA & 1048575)), zzjl, zzv(i));
                        break;
                    case 50:
                        zzS(zzjl, i2, zzmr.zzn(t, (long) (zzA & 1048575)), i);
                        break;
                    case 51:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzf(i2, zzD(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zze(i2, zzE(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzc(i2, zzG(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzh(i2, zzG(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzi(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzj(i2, zzG(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzk(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzl(i2, zzH(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzT(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzjl);
                            break;
                        }
                    case 60:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzr(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzv(i));
                            break;
                        }
                    case 61:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzn(i2, (zzjd) zzmr.zzn(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzo(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzg(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzb(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzd(i2, zzG(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzp(i2, zzF(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzq(i2, zzG(t, (long) (zzA & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzM(t, i2, i)) {
                            break;
                        } else {
                            zzjl.zzs(i2, zzmr.zzn(t, (long) (zzA & 1048575)), zzv(i));
                            break;
                        }
                }
            }
            zzmh<?, ?> zzmh = this.zzn;
            zzmh.zzi(zzmh.zzd(t), zzjl);
        } else {
            this.zzo.zzb(t);
            throw null;
        }
    }
}
