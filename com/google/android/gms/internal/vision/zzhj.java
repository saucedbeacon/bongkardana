package com.google.android.gms.internal.vision;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.vision.zzfy;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import sun.misc.Unsafe;

final class zzhj<T> implements zzhw<T> {
    private static final int[] zzzb = new int[0];
    private static final Unsafe zzzc = zziu.zzhj();
    private final int[] zzzd;
    private final Object[] zzze;
    private final int zzzf;
    private final int zzzg;
    private final zzhf zzzh;
    private final boolean zzzi;
    private final boolean zzzj;
    private final boolean zzzk;
    private final boolean zzzl;
    private final int[] zzzm;
    private final int zzzn;
    private final int zzzo;
    private final zzhn zzzp;
    private final zzgp zzzq;
    private final zzio<?, ?> zzzr;
    private final zzfl<?> zzzs;
    private final zzha zzzt;

    private zzhj(int[] iArr, Object[] objArr, int i, int i2, zzhf zzhf, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
        this.zzzd = iArr;
        this.zzze = objArr;
        this.zzzf = i;
        this.zzzg = i2;
        this.zzzj = zzhf instanceof zzfy;
        this.zzzk = z;
        this.zzzi = zzfl != null && zzfl.zze(zzhf);
        this.zzzl = false;
        this.zzzm = iArr2;
        this.zzzn = i3;
        this.zzzo = i4;
        this.zzzp = zzhn;
        this.zzzq = zzgp;
        this.zzzr = zzio;
        this.zzzs = zzfl;
        this.zzzh = zzhf;
        this.zzzt = zzha;
    }

    private static boolean zzbm(int i) {
        return (i & C.ENCODING_PCM_A_LAW) != 0;
    }

    static <T> zzhj<T> zza(Class<T> cls, zzhd zzhd, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
        int i;
        char c;
        int[] iArr;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        boolean z;
        int i4;
        zzhu zzhu;
        int i5;
        Class<?> cls2;
        int i6;
        String str;
        int i7;
        int i8;
        char c7;
        char c8;
        Field field;
        int i9;
        char charAt;
        int i10;
        Field field2;
        Field field3;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        char charAt12;
        int i23;
        char charAt13;
        char charAt14;
        zzhd zzhd2 = zzhd;
        if (zzhd2 instanceof zzhu) {
            zzhu zzhu2 = (zzhu) zzhd2;
            char c9 = 0;
            boolean z2 = zzhu2.zzge() == zzfy.zzg.zzxg;
            String zzgn = zzhu2.zzgn();
            int length = zzgn.length();
            char charAt15 = zzgn.charAt(0);
            if (charAt15 >= 55296) {
                char c10 = charAt15 & 8191;
                int i24 = 1;
                int i25 = 13;
                while (true) {
                    i = i24 + 1;
                    charAt14 = zzgn.charAt(i24);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c10 |= (charAt14 & 8191) << i25;
                    i25 += 13;
                    i24 = i;
                }
                charAt15 = c10 | (charAt14 << i25);
            } else {
                i = 1;
            }
            int i26 = i + 1;
            char charAt16 = zzgn.charAt(i);
            if (charAt16 >= 55296) {
                char c11 = charAt16 & 8191;
                int i27 = 13;
                while (true) {
                    i23 = i26 + 1;
                    charAt13 = zzgn.charAt(i26);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c11 |= (charAt13 & 8191) << i27;
                    i27 += 13;
                    i26 = i23;
                }
                charAt16 = c11 | (charAt13 << i27);
                i26 = i23;
            }
            if (charAt16 == 0) {
                iArr = zzzb;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
            } else {
                int i28 = i26 + 1;
                char charAt17 = zzgn.charAt(i26);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i29 = 13;
                    while (true) {
                        i22 = i28 + 1;
                        charAt12 = zzgn.charAt(i28);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c12 |= (charAt12 & 8191) << i29;
                        i29 += 13;
                        i28 = i22;
                    }
                    charAt17 = c12 | (charAt12 << i29);
                    i28 = i22;
                }
                int i30 = i28 + 1;
                char charAt18 = zzgn.charAt(i28);
                if (charAt18 >= 55296) {
                    char c13 = charAt18 & 8191;
                    int i31 = 13;
                    while (true) {
                        i21 = i30 + 1;
                        charAt11 = zzgn.charAt(i30);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c13 |= (charAt11 & 8191) << i31;
                        i31 += 13;
                        i30 = i21;
                    }
                    charAt18 = c13 | (charAt11 << i31);
                    i30 = i21;
                }
                int i32 = i30 + 1;
                c3 = zzgn.charAt(i30);
                if (c3 >= 55296) {
                    char c14 = c3 & 8191;
                    int i33 = 13;
                    while (true) {
                        i20 = i32 + 1;
                        charAt10 = zzgn.charAt(i32);
                        if (charAt10 < 55296) {
                            break;
                        }
                        c14 |= (charAt10 & 8191) << i33;
                        i33 += 13;
                        i32 = i20;
                    }
                    c3 = c14 | (charAt10 << i33);
                    i32 = i20;
                }
                int i34 = i32 + 1;
                char charAt19 = zzgn.charAt(i32);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i35 = 13;
                    while (true) {
                        i19 = i34 + 1;
                        charAt9 = zzgn.charAt(i34);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c15 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i34 = i19;
                    }
                    charAt19 = c15 | (charAt9 << i35);
                    i34 = i19;
                }
                int i36 = i34 + 1;
                c2 = zzgn.charAt(i34);
                if (c2 >= 55296) {
                    char c16 = c2 & 8191;
                    int i37 = 13;
                    while (true) {
                        i18 = i36 + 1;
                        charAt8 = zzgn.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c16 |= (charAt8 & 8191) << i37;
                        i37 += 13;
                        i36 = i18;
                    }
                    c2 = c16 | (charAt8 << i37);
                    i36 = i18;
                }
                int i38 = i36 + 1;
                char charAt20 = zzgn.charAt(i36);
                if (charAt20 >= 55296) {
                    char c17 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        i17 = i38 + 1;
                        charAt7 = zzgn.charAt(i38);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c17 |= (charAt7 & 8191) << i39;
                        i39 += 13;
                        i38 = i17;
                    }
                    charAt20 = c17 | (charAt7 << i39);
                    i38 = i17;
                }
                int i40 = i38 + 1;
                char charAt21 = zzgn.charAt(i38);
                if (charAt21 >= 55296) {
                    char c18 = charAt21 & 8191;
                    int i41 = i40;
                    int i42 = 13;
                    while (true) {
                        i16 = i41 + 1;
                        charAt6 = zzgn.charAt(i41);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c18 |= (charAt6 & 8191) << i42;
                        i42 += 13;
                        i41 = i16;
                    }
                    charAt21 = c18 | (charAt6 << i42);
                    i14 = i16;
                } else {
                    i14 = i40;
                }
                int i43 = i14 + 1;
                char charAt22 = zzgn.charAt(i14);
                if (charAt22 >= 55296) {
                    char c19 = charAt22 & 8191;
                    int i44 = i43;
                    int i45 = 13;
                    while (true) {
                        i15 = i44 + 1;
                        charAt5 = zzgn.charAt(i44);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c19 |= (charAt5 & 8191) << i45;
                        i45 += 13;
                        i44 = i15;
                    }
                    charAt22 = c19 | (charAt5 << i45);
                    i43 = i15;
                }
                int i46 = (charAt17 << 1) + charAt18;
                c4 = charAt19;
                i2 = i46;
                c = charAt22;
                c9 = charAt17;
                i26 = i43;
                char c20 = charAt20;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                c5 = c20;
            }
            Unsafe unsafe = zzzc;
            Object[] zzgo = zzhu2.zzgo();
            Class<?> cls3 = zzhu2.zzgg().getClass();
            int i47 = i26;
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i48 = c + c5;
            char c21 = c;
            int i49 = i47;
            int i50 = i48;
            int i51 = 0;
            int i52 = 0;
            while (i49 < length) {
                int i53 = i49 + 1;
                int charAt23 = zzgn.charAt(i49);
                int i54 = length;
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i53;
                    int i57 = 13;
                    while (true) {
                        i13 = i56 + 1;
                        charAt4 = zzgn.charAt(i56);
                        c6 = c;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i13;
                        c = c6;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i3 = i13;
                } else {
                    c6 = c;
                    i3 = i53;
                }
                int i58 = i3 + 1;
                char charAt24 = zzgn.charAt(i3);
                int i59 = i58;
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i60 = i59;
                    int i61 = 13;
                    while (true) {
                        i12 = i60 + 1;
                        charAt3 = zzgn.charAt(i60);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        c22 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i12;
                        z2 = z;
                    }
                    charAt24 = c22 | (charAt3 << i61);
                    i4 = i12;
                } else {
                    z = z2;
                    i4 = i59;
                }
                char c23 = charAt24 & 255;
                char c24 = c4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i51] = i52;
                    i51++;
                }
                char c25 = c3;
                if (c23 >= '3') {
                    int i62 = i4 + 1;
                    char charAt25 = zzgn.charAt(i4);
                    char c26 = 55296;
                    if (charAt25 >= 55296) {
                        char c27 = charAt25 & 8191;
                        int i63 = 13;
                        while (true) {
                            i11 = i62 + 1;
                            charAt2 = zzgn.charAt(i62);
                            if (charAt2 < c26) {
                                break;
                            }
                            c27 |= (charAt2 & 8191) << i63;
                            i63 += 13;
                            i62 = i11;
                            c26 = 55296;
                        }
                        charAt25 = c27 | (charAt2 << i63);
                        i62 = i11;
                    }
                    int i64 = c23 - '3';
                    int i65 = i62;
                    if (i64 == 9 || i64 == 17) {
                        objArr[((i52 / 3) << 1) + 1] = zzgo[i2];
                        i2++;
                    } else if (i64 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i52 / 3) << 1) + 1] = zzgo[i2];
                        i2++;
                    }
                    int i66 = charAt25 << 1;
                    Object obj = zzgo[i66];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zza(cls3, (String) obj);
                        zzgo[i66] = field2;
                    }
                    zzhu = zzhu2;
                    String str2 = zzgn;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    int i67 = i66 + 1;
                    Object obj2 = zzgo[i67];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zza(cls3, (String) obj2);
                        zzgo[i67] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i65;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    c7 = c9;
                } else {
                    zzhu = zzhu2;
                    String str3 = zzgn;
                    int i68 = i2 + 1;
                    Field zza = zza(cls3, (String) zzgo[i2]);
                    if (c23 == 9 || c23 == 17) {
                        c8 = 1;
                        objArr[((i52 / 3) << 1) + 1] = zza.getType();
                    } else {
                        if (c23 == 27 || c23 == '1') {
                            c8 = 1;
                            i10 = i68 + 1;
                            objArr[((i52 / 3) << 1) + 1] = zzgo[i68];
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i10 = i68 + 1;
                                objArr[((i52 / 3) << 1) + 1] = zzgo[i68];
                            }
                        } else {
                            if (c23 == '2') {
                                int i69 = c21 + 1;
                                iArr[c21] = i52;
                                int i70 = (i52 / 3) << 1;
                                int i71 = i68 + 1;
                                objArr[i70] = zzgo[i68];
                                if ((charAt24 & 2048) != 0) {
                                    i68 = i71 + 1;
                                    objArr[i70 + 1] = zzgo[i71];
                                    c21 = i69;
                                } else {
                                    i68 = i71;
                                    c8 = 1;
                                    c21 = i69;
                                }
                            }
                            c8 = 1;
                        }
                        i68 = i10;
                    }
                    i8 = (int) unsafe.objectFieldOffset(zza);
                    if ((charAt15 & 1) != c8 || c23 > 17) {
                        i5 = i68;
                        c7 = c9;
                        cls2 = cls3;
                        str = str3;
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int i72 = i4 + 1;
                        str = str3;
                        char charAt26 = str.charAt(i4);
                        if (charAt26 >= 55296) {
                            char c28 = charAt26 & 8191;
                            int i73 = 13;
                            while (true) {
                                i9 = i72 + 1;
                                charAt = str.charAt(i72);
                                if (charAt < 55296) {
                                    break;
                                }
                                c28 |= (charAt & 8191) << i73;
                                i73 += 13;
                                i72 = i9;
                            }
                            charAt26 = c28 | (charAt << i73);
                            i72 = i9;
                        }
                        int i74 = (c9 << 1) + (charAt26 / ' ');
                        Object obj3 = zzgo[i74];
                        i5 = i68;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zza(cls3, (String) obj3);
                            zzgo[i74] = field;
                        }
                        c7 = c9;
                        cls2 = cls3;
                        i7 = (int) unsafe.objectFieldOffset(field);
                        i6 = charAt26 % ' ';
                        i4 = i72;
                    }
                    if (c23 >= 18 && c23 <= '1') {
                        iArr[i50] = i8;
                        i50++;
                    }
                }
                int i75 = i52 + 1;
                iArr2[i52] = charAt23;
                int i76 = i75 + 1;
                iArr2[i75] = i8 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? C.ENCODING_PCM_A_LAW : 0) | (c23 << 20);
                i52 = i76 + 1;
                iArr2[i76] = (i6 << 20) | i7;
                c9 = c7;
                zzgn = str;
                i49 = i4;
                cls3 = cls2;
                c4 = c24;
                length = i54;
                c = c6;
                z2 = z;
                c3 = c25;
                i2 = i5;
                zzhu2 = zzhu;
            }
            char c29 = c4;
            boolean z3 = z2;
            return new zzhj(iArr2, objArr, c3, c4, zzhu2.zzgg(), z2, false, iArr, c, i48, zzhn, zzgp, zzio, zzfl, zzha);
        }
        ((zzij) zzhd2).zzge();
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
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

    public final T newInstance() {
        return this.zzzp.newInstance(this.zzzh);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzm(r10, r6) == com.google.android.gms.internal.vision.zziu.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzzd
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzbk(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zzbl(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r10, r4)
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.zziu.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.zzhy.zzd((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.vision.zziu.zzm(r10, r6)
            boolean r5 = com.google.android.gms.internal.vision.zziu.zzm(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.zziu.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.zziu.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.vision.zziu.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.vision.zziu.zzn(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.vision.zziu.zzn(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.vision.zziu.zzo(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.vision.zziu.zzo(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.vision.zzio<?, ?> r0 = r9.zzzr
            java.lang.Object r0 = r0.zzt(r10)
            com.google.android.gms.internal.vision.zzio<?, ?> r2 = r9.zzzr
            java.lang.Object r2 = r2.zzt(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzzi
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.vision.zzfl<?> r0 = r9.zzzs
            com.google.android.gms.internal.vision.zzfp r10 = r0.zzc(r10)
            com.google.android.gms.internal.vision.zzfl<?> r0 = r9.zzzs
            com.google.android.gms.internal.vision.zzfp r11 = r0.zzc(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzzd
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.zzbk(r1)
            int[] r4 = r8.zzzd
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = zzj(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzj((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = zzg(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.zza(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = zzf(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.zziu.zzp(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.vision.zziu.zzm(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzj((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.zziu.zzk(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.zziu.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.vision.zziu.zzn(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.vision.zziu.zzo(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.zzga.zzo(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.zzio<?, ?> r0 = r8.zzzr
            java.lang.Object r0 = r0.zzt(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzzi
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.zzfl<?> r0 = r8.zzzs
            com.google.android.gms.internal.vision.zzfp r9 = r0.zzc(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.hashCode(java.lang.Object):int");
    }

    public final void zzc(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzzd.length; i += 3) {
                int zzbk = zzbk(i);
                long j = (long) (1048575 & zzbk);
                int i2 = this.zzzd[i];
                switch ((zzbk & 267386880) >>> 20) {
                    case 0:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzo(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 1:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzn(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 2:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 3:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 4:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 5:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 6:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 7:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzm(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 8:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzp(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzp(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 11:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 12:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 13:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 14:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 15:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zzb((Object) t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 16:
                        if (!zza(t2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
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
                        this.zzzq.zza(t, t2, j);
                        break;
                    case 50:
                        zzhy.zza(this.zzzt, t, t2, j);
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
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zziu.zza((Object) t, j, zziu.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            if (!this.zzzk) {
                zzhy.zza(this.zzzr, t, t2);
                if (this.zzzi) {
                    zzhy.zza(this.zzzs, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    private final void zza(T t, T t2, int i) {
        long zzbk = (long) (zzbk(i) & 1048575);
        if (zza(t2, i)) {
            Object zzp = zziu.zzp(t, zzbk);
            Object zzp2 = zziu.zzp(t2, zzbk);
            if (zzp != null && zzp2 != null) {
                zziu.zza((Object) t, zzbk, zzga.zza(zzp, zzp2));
                zzb(t, i);
            } else if (zzp2 != null) {
                zziu.zza((Object) t, zzbk, zzp2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzbk = zzbk(i);
        int i2 = this.zzzd[i];
        long j = (long) (zzbk & 1048575);
        if (zza(t2, i2, i)) {
            Object zzp = zziu.zzp(t, j);
            Object zzp2 = zziu.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zziu.zza((Object) t, j, zzga.zza(zzp, zzp2));
                zzb(t, i2, i);
            } else if (zzp2 != null) {
                zziu.zza((Object) t, j, zzp2);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0830, code lost:
        r9 = (r9 + r10) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0909, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0951, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09fb, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a1d, code lost:
        r5 = r5 + 3;
        r9 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzp(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.zzzk
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = zzzc
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.zzzd
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.zzbk(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzzd
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.vision.zzfs r14 = com.google.android.gms.internal.vision.zzfs.DOUBLE_LIST_PACKED
            int r14 = r14.id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.vision.zzfs r14 = com.google.android.gms.internal.vision.zzfs.SINT64_LIST_PACKED
            int r14 = r14.id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzzd
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzhf r5 = (com.google.android.gms.internal.vision.zzhf) r5
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzf((int) r3, (long) r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzk(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzh((int) r3, (long) r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzm(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzn(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzj(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzeo r5 = (com.google.android.gms.internal.vision.zzeo) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (com.google.android.gms.internal.vision.zzeo) r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzc((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.vision.zzhw) r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.zzeo
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.vision.zzeo r5 = (com.google.android.gms.internal.vision.zzeo) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (com.google.android.gms.internal.vision.zzeo) r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzl(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzg((int) r3, (long) r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzi(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zze((int) r3, (long) r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzd((int) r3, (long) r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (float) r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (double) r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.vision.zzha r14 = r0.zzzt
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            java.lang.Object r6 = r0.zzbi(r12)
            int r3 = r14.zzb(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = zze(r1, r5)
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzd(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzs(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzw(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzt(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzv(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzz(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzu(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzr(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzq(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzx(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.zzhy.zzy(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.zzzl
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.vision.zzfe.zzav(r3)
            int r6 = com.google.android.gms.internal.vision.zzfe.zzax(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzq(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzu(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzr(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzt(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzd((int) r3, (java.util.List<com.google.android.gms.internal.vision.zzeo>) r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = zze(r1, r5)
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzc((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.vision.zzhw) r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzc(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzx(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzs(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzp(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzo(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzv(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = zze(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzw(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzhf r5 = (com.google.android.gms.internal.vision.zzhf) r5
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzf((int) r3, (long) r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzk(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzh((int) r3, (long) r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzm(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzn(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzj(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzeo r5 = (com.google.android.gms.internal.vision.zzeo) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (com.google.android.gms.internal.vision.zzeo) r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            com.google.android.gms.internal.vision.zzhw r6 = r0.zzbh(r12)
            int r3 = com.google.android.gms.internal.vision.zzhy.zzc((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.vision.zzhw) r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.zzeo
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.vision.zzeo r5 = (com.google.android.gms.internal.vision.zzeo) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (com.google.android.gms.internal.vision.zzeo) r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzc((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzl(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzg((int) r3, (long) r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.vision.zziu.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzi(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zze((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.zza(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.vision.zziu.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.vision.zzfe.zzd((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (float) r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.zza(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.zzfe.zzb((int) r3, (double) r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.vision.zzio<?, ?> r2 = r0.zzzr
            int r1 = zza(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = zzzc
            r3 = -1
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x04f8:
            int[] r13 = r0.zzzd
            int r13 = r13.length
            if (r5 >= r13) goto L_0x0a24
            int r13 = r0.zzbk(r5)
            int[] r14 = r0.zzzd
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0523
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x0521
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x0521:
            r9 = r11
            goto L_0x0542
        L_0x0523:
            boolean r9 = r0.zzzl
            if (r9 == 0) goto L_0x053f
            com.google.android.gms.internal.vision.zzfs r9 = com.google.android.gms.internal.vision.zzfs.DOUBLE_LIST_PACKED
            int r9 = r9.id()
            if (r4 < r9) goto L_0x053f
            com.google.android.gms.internal.vision.zzfs r9 = com.google.android.gms.internal.vision.zzfs.SINT64_LIST_PACKED
            int r9 = r9.id()
            if (r4 > r9) goto L_0x053f
            int[] r9 = r0.zzzd
            int r10 = r5 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0540
        L_0x053f:
            r9 = 0
        L_0x0540:
            r18 = 0
        L_0x0542:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x0a0e;
                case 1: goto L_0x09fe;
                case 2: goto L_0x09ec;
                case 3: goto L_0x09dc;
                case 4: goto L_0x09cc;
                case 5: goto L_0x09c0;
                case 6: goto L_0x09b4;
                case 7: goto L_0x09aa;
                case 8: goto L_0x098e;
                case 9: goto L_0x097c;
                case 10: goto L_0x096d;
                case 11: goto L_0x0960;
                case 12: goto L_0x0953;
                case 13: goto L_0x0948;
                case 14: goto L_0x093d;
                case 15: goto L_0x0930;
                case 16: goto L_0x0923;
                case 17: goto L_0x0910;
                case 18: goto L_0x08fc;
                case 19: goto L_0x08f0;
                case 20: goto L_0x08e4;
                case 21: goto L_0x08d8;
                case 22: goto L_0x08cc;
                case 23: goto L_0x08c0;
                case 24: goto L_0x08b4;
                case 25: goto L_0x08a8;
                case 26: goto L_0x089d;
                case 27: goto L_0x088e;
                case 28: goto L_0x0882;
                case 29: goto L_0x0875;
                case 30: goto L_0x0868;
                case 31: goto L_0x085b;
                case 32: goto L_0x084e;
                case 33: goto L_0x0841;
                case 34: goto L_0x0834;
                case 35: goto L_0x0814;
                case 36: goto L_0x07f7;
                case 37: goto L_0x07da;
                case 38: goto L_0x07bd;
                case 39: goto L_0x079f;
                case 40: goto L_0x0781;
                case 41: goto L_0x0763;
                case 42: goto L_0x0745;
                case 43: goto L_0x0727;
                case 44: goto L_0x0709;
                case 45: goto L_0x06eb;
                case 46: goto L_0x06cd;
                case 47: goto L_0x06af;
                case 48: goto L_0x0691;
                case 49: goto L_0x0681;
                case 50: goto L_0x0671;
                case 51: goto L_0x0663;
                case 52: goto L_0x0656;
                case 53: goto L_0x0646;
                case 54: goto L_0x0636;
                case 55: goto L_0x0626;
                case 56: goto L_0x0618;
                case 57: goto L_0x060b;
                case 58: goto L_0x05ff;
                case 59: goto L_0x05e1;
                case 60: goto L_0x05cd;
                case 61: goto L_0x05bb;
                case 62: goto L_0x05ab;
                case 63: goto L_0x059b;
                case 64: goto L_0x058e;
                case 65: goto L_0x0580;
                case 66: goto L_0x0570;
                case 67: goto L_0x0560;
                case 68: goto L_0x054a;
                default: goto L_0x0548;
            }
        L_0x0548:
            goto L_0x0908
        L_0x054a:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzhf r4 = (com.google.android.gms.internal.vision.zzhf) r4
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4, r9)
            goto L_0x0907
        L_0x0560:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = zzi(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzf((int) r15, (long) r9)
            goto L_0x0907
        L_0x0570:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzk(r15, r4)
            goto L_0x0907
        L_0x0580:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzfe.zzh((int) r15, (long) r9)
            goto L_0x0907
        L_0x058e:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.vision.zzfe.zzm(r15, r4)
            goto L_0x0951
        L_0x059b:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzn(r15, r4)
            goto L_0x0907
        L_0x05ab:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzj(r15, r4)
            goto L_0x0907
        L_0x05bb:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x0907
        L_0x05cd:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzhy.zzc((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x0907
        L_0x05e1:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.vision.zzeo
            if (r9 == 0) goto L_0x05f7
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x0907
        L_0x05f7:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x05ff:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x060b:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.vision.zzfe.zzl(r15, r4)
            goto L_0x0951
        L_0x0618:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzfe.zzg((int) r15, (long) r9)
            goto L_0x0907
        L_0x0626:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = zzh(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzi(r15, r4)
            goto L_0x0907
        L_0x0636:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = zzi(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zze((int) r15, (long) r9)
            goto L_0x0907
        L_0x0646:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = zzi(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzd((int) r15, (long) r9)
            goto L_0x0907
        L_0x0656:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (float) r4)
            goto L_0x0951
        L_0x0663:
            boolean r4 = r0.zza(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (double) r9)
            goto L_0x0907
        L_0x0671:
            com.google.android.gms.internal.vision.zzha r4 = r0.zzzt
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.zzbi(r5)
            int r4 = r4.zzb(r15, r9, r10)
            goto L_0x0907
        L_0x0681:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzhy.zzd(r15, r4, r9)
            goto L_0x0907
        L_0x0691:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzs(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x06a5
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06a5:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x06af:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzw(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x06c3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06c3:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x06cd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x06e1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06e1:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x06eb:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x06ff
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06ff:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0709:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzt(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x071d
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x071d:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0727:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzv(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x073b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x073b:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0745:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzz(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x0759
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0759:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0763:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x0777
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0777:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0781:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x0795
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0795:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x079f:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzu(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x07b3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07b3:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x07bd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzr(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x07d1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07d1:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x07da:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzq(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x07ee
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07ee:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x07f7:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzx(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x080b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x080b:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
            goto L_0x0830
        L_0x0814:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzy(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.zzzl
            if (r10 == 0) goto L_0x0828
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0828:
            int r9 = com.google.android.gms.internal.vision.zzfe.zzav(r15)
            int r10 = com.google.android.gms.internal.vision.zzfe.zzax(r4)
        L_0x0830:
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0951
        L_0x0834:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzhy.zzq(r15, r4, r9)
            goto L_0x0907
        L_0x0841:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzu(r15, r4, r9)
            goto L_0x0907
        L_0x084e:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r9)
            goto L_0x0907
        L_0x085b:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r9)
            goto L_0x0907
        L_0x0868:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzr(r15, r4, r9)
            goto L_0x0907
        L_0x0875:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzt(r15, r4, r9)
            goto L_0x0907
        L_0x0882:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzd((int) r15, (java.util.List<com.google.android.gms.internal.vision.zzeo>) r4)
            goto L_0x0907
        L_0x088e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzhy.zzc((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x0907
        L_0x089d:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzc(r15, r4)
            goto L_0x0907
        L_0x08a8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzhy.zzx(r15, r4, r9)
            goto L_0x0907
        L_0x08b4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r9)
            goto L_0x0907
        L_0x08c0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r9)
            goto L_0x0907
        L_0x08cc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzs(r15, r4, r9)
            goto L_0x0907
        L_0x08d8:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzp(r15, r4, r9)
            goto L_0x0907
        L_0x08e4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzo(r15, r4, r9)
            goto L_0x0907
        L_0x08f0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzv(r15, r4, r9)
            goto L_0x0907
        L_0x08fc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.zzhy.zzw(r15, r4, r9)
        L_0x0907:
            int r6 = r6 + r4
        L_0x0908:
            r4 = 0
        L_0x0909:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x0a1d
        L_0x0910:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzhf r4 = (com.google.android.gms.internal.vision.zzhf) r4
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc(r15, r4, r9)
            goto L_0x0907
        L_0x0923:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            long r9 = r2.getLong(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzf((int) r15, (long) r9)
            goto L_0x0907
        L_0x0930:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzk(r15, r4)
            goto L_0x0907
        L_0x093d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.vision.zzfe.zzh((int) r15, (long) r9)
            goto L_0x0907
        L_0x0948:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.vision.zzfe.zzm(r15, r4)
        L_0x0951:
            int r6 = r6 + r9
            goto L_0x0908
        L_0x0953:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzn(r15, r4)
            goto L_0x0907
        L_0x0960:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.vision.zzfe.zzj(r15, r4)
            goto L_0x0907
        L_0x096d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x0907
        L_0x097c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r5)
            int r4 = com.google.android.gms.internal.vision.zzhy.zzc((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x0907
        L_0x098e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.vision.zzeo
            if (r9 == 0) goto L_0x09a2
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x0907
        L_0x09a2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x09aa:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.vision.zzfe.zzc((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x09b4:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.vision.zzfe.zzl(r15, r4)
            int r6 = r6 + r9
            goto L_0x0909
        L_0x09c0:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x09fc
            int r9 = com.google.android.gms.internal.vision.zzfe.zzg((int) r15, (long) r13)
            goto L_0x09fb
        L_0x09cc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.vision.zzfe.zzi(r15, r9)
            goto L_0x09fb
        L_0x09dc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.vision.zzfe.zze((int) r15, (long) r9)
            goto L_0x09fb
        L_0x09ec:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.vision.zzfe.zzd((int) r15, (long) r9)
        L_0x09fb:
            int r6 = r6 + r9
        L_0x09fc:
            r9 = 0
            goto L_0x0a0b
        L_0x09fe:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            r9 = 0
            int r10 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (float) r9)
            int r6 = r6 + r10
        L_0x0a0b:
            r10 = 0
            goto L_0x0a1d
        L_0x0a0e:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0a0b
            r10 = 0
            int r15 = com.google.android.gms.internal.vision.zzfe.zzb((int) r15, (double) r10)
            int r6 = r6 + r15
        L_0x0a1d:
            int r5 = r5 + 3
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x04f8
        L_0x0a24:
            com.google.android.gms.internal.vision.zzio<?, ?> r2 = r0.zzzr
            int r2 = zza(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.zzzi
            if (r2 == 0) goto L_0x0a3a
            com.google.android.gms.internal.vision.zzfl<?> r2 = r0.zzzs
            com.google.android.gms.internal.vision.zzfp r1 = r2.zzc(r1)
            int r1 = r1.zzeq()
            int r6 = r6 + r1
        L_0x0a3a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzp(java.lang.Object):int");
    }

    private static <UT, UB> int zza(zzio<UT, UB> zzio, T t) {
        return zzio.zzp(zzio.zzt(t));
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zziu.zzp(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a26  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzjj r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzed()
            int r1 = com.google.android.gms.internal.vision.zzfy.zzg.zzxj
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.vision.zzio<?, ?> r0 = r13.zzzr
            zza(r0, r14, (com.google.android.gms.internal.vision.zzjj) r15)
            boolean r0 = r13.zzzi
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.vision.zzfl<?> r0 = r13.zzzs
            com.google.android.gms.internal.vision.zzfp r0 = r0.zzc(r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.zzzd
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.zzbk(r7)
            int[] r9 = r13.zzzd
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.vision.zzfl<?> r10 = r13.zzzs
            int r10 = r10.zza(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.vision.zzfl<?> r10 = r13.zzzs
            r10.zza((com.google.android.gms.internal.vision.zzjj) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fc;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04ac;
                case 6: goto L_0x049c;
                case 7: goto L_0x048b;
                case 8: goto L_0x047a;
                case 9: goto L_0x0465;
                case 10: goto L_0x0452;
                case 11: goto L_0x0441;
                case 12: goto L_0x0430;
                case 13: goto L_0x041f;
                case 14: goto L_0x040e;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x050b
        L_0x0068:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzp(r9, r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzeo r8 = (com.google.android.gms.internal.vision.zzeo) r8
            r15.zza((int) r9, (com.google.android.gms.internal.vision.zzeo) r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzj(r14, r10)
            r15.zzb((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzh(r9, r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzc(r9, r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zza((int) r9, (long) r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzi(r9, r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzg(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzf(r14, r10)
            r15.zza((int) r9, (double) r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            r13.zza((com.google.android.gms.internal.vision.zzjj) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            com.google.android.gms.internal.vision.zzhy.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zze(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzj(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzg(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzl(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzm(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzi(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzn(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzk(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzf(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzh(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzd(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzc(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zze(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzj(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzg(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzl(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzm(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzi(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzb(r9, r8, r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            com.google.android.gms.internal.vision.zzhy.zza((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zza((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzn(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzk(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzf(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzh(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzd(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzc(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.zzzd
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.zzhy.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zzp(r9, r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzeo r8 = (com.google.android.gms.internal.vision.zzeo) r8
            r15.zza((int) r9, (com.google.android.gms.internal.vision.zzeo) r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            com.google.android.gms.internal.vision.zzhw r10 = r13.zzbh(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.zziu.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.vision.zziu.zzm(r14, r10)
            r15.zzb((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zzh(r9, r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10)
            r15.zzc(r9, r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.zziu.zzk(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10)
            r15.zza((int) r9, (long) r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.zziu.zzl(r14, r10)
            r15.zzi(r9, r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.vision.zziu.zzn(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.zza(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.vision.zziu.zzo(r14, r10)
            r15.zza((int) r9, (double) r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.vision.zzfl<?> r14 = r13.zzzs
            r14.zza((com.google.android.gms.internal.vision.zzjj) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0524
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x050f
        L_0x0524:
            r1 = r3
            goto L_0x050f
        L_0x0526:
            return
        L_0x0527:
            boolean r0 = r13.zzzk
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r13.zzzi
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.vision.zzfl<?> r0 = r13.zzzs
            com.google.android.gms.internal.vision.zzfp r0 = r0.zzc(r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.zzzd
            int r7 = r7.length
            r8 = 0
        L_0x054c:
            if (r8 >= r7) goto L_0x0a24
            int r9 = r13.zzbk(r8)
            int[] r10 = r13.zzzd
            r10 = r10[r8]
        L_0x0556:
            if (r1 == 0) goto L_0x0574
            com.google.android.gms.internal.vision.zzfl<?> r11 = r13.zzzs
            int r11 = r11.zza(r1)
            if (r11 > r10) goto L_0x0574
            com.google.android.gms.internal.vision.zzfl<?> r11 = r13.zzzs
            r11.zza((com.google.android.gms.internal.vision.zzjj) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0572
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0556
        L_0x0572:
            r1 = r3
            goto L_0x0556
        L_0x0574:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a11;
                case 1: goto L_0x0a01;
                case 2: goto L_0x09f1;
                case 3: goto L_0x09e1;
                case 4: goto L_0x09d1;
                case 5: goto L_0x09c1;
                case 6: goto L_0x09b1;
                case 7: goto L_0x09a0;
                case 8: goto L_0x098f;
                case 9: goto L_0x097a;
                case 10: goto L_0x0967;
                case 11: goto L_0x0956;
                case 12: goto L_0x0945;
                case 13: goto L_0x0934;
                case 14: goto L_0x0923;
                case 15: goto L_0x0912;
                case 16: goto L_0x0901;
                case 17: goto L_0x08ec;
                case 18: goto L_0x08db;
                case 19: goto L_0x08ca;
                case 20: goto L_0x08b9;
                case 21: goto L_0x08a8;
                case 22: goto L_0x0897;
                case 23: goto L_0x0886;
                case 24: goto L_0x0875;
                case 25: goto L_0x0864;
                case 26: goto L_0x0853;
                case 27: goto L_0x083e;
                case 28: goto L_0x082d;
                case 29: goto L_0x081c;
                case 30: goto L_0x080b;
                case 31: goto L_0x07fa;
                case 32: goto L_0x07e9;
                case 33: goto L_0x07d8;
                case 34: goto L_0x07c7;
                case 35: goto L_0x07b6;
                case 36: goto L_0x07a5;
                case 37: goto L_0x0794;
                case 38: goto L_0x0783;
                case 39: goto L_0x0772;
                case 40: goto L_0x0761;
                case 41: goto L_0x0750;
                case 42: goto L_0x073f;
                case 43: goto L_0x072e;
                case 44: goto L_0x071d;
                case 45: goto L_0x070c;
                case 46: goto L_0x06fb;
                case 47: goto L_0x06ea;
                case 48: goto L_0x06d9;
                case 49: goto L_0x06c4;
                case 50: goto L_0x06b9;
                case 51: goto L_0x06a8;
                case 52: goto L_0x0697;
                case 53: goto L_0x0686;
                case 54: goto L_0x0675;
                case 55: goto L_0x0664;
                case 56: goto L_0x0653;
                case 57: goto L_0x0642;
                case 58: goto L_0x0631;
                case 59: goto L_0x0620;
                case 60: goto L_0x060b;
                case 61: goto L_0x05f8;
                case 62: goto L_0x05e7;
                case 63: goto L_0x05d6;
                case 64: goto L_0x05c5;
                case 65: goto L_0x05b4;
                case 66: goto L_0x05a3;
                case 67: goto L_0x0592;
                case 68: goto L_0x057d;
                default: goto L_0x057b;
            }
        L_0x057b:
            goto L_0x0a20
        L_0x057d:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x0592:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a20
        L_0x05a3:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a20
        L_0x05b4:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a20
        L_0x05c5:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a20
        L_0x05d6:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzp(r10, r9)
            goto L_0x0a20
        L_0x05e7:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a20
        L_0x05f8:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzeo r9 = (com.google.android.gms.internal.vision.zzeo) r9
            r15.zza((int) r10, (com.google.android.gms.internal.vision.zzeo) r9)
            goto L_0x0a20
        L_0x060b:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x0620:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x0a20
        L_0x0631:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzj(r14, r11)
            r15.zzb((int) r10, (boolean) r9)
            goto L_0x0a20
        L_0x0642:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzh(r10, r9)
            goto L_0x0a20
        L_0x0653:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzc(r10, r11)
            goto L_0x0a20
        L_0x0664:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a20
        L_0x0675:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zza((int) r10, (long) r11)
            goto L_0x0a20
        L_0x0686:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzi(r10, r11)
            goto L_0x0a20
        L_0x0697:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzg(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a20
        L_0x06a8:
            boolean r11 = r13.zza(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzf(r14, r11)
            r15.zza((int) r10, (double) r11)
            goto L_0x0a20
        L_0x06b9:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            r13.zza((com.google.android.gms.internal.vision.zzjj) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0a20
        L_0x06c4:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            com.google.android.gms.internal.vision.zzhy.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x06d9:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zze(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x06ea:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzj(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x06fb:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzg(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x070c:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzl(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x071d:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzm(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x072e:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzi(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x073f:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzn(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x0750:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzk(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x0761:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzf(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x0772:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzh(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x0783:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzd(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x0794:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzc(r10, r9, r15, r4)
            goto L_0x0a20
        L_0x07a5:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r4)
            goto L_0x0a20
        L_0x07b6:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r4)
            goto L_0x0a20
        L_0x07c7:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zze(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x07d8:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzj(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x07e9:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzg(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x07fa:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzl(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x080b:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzm(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x081c:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzi(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x082d:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb(r10, r9, r15)
            goto L_0x0a20
        L_0x083e:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            com.google.android.gms.internal.vision.zzhy.zza((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x0853:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x0a20
        L_0x0864:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzn(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x0875:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzk(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x0886:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzf(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x0897:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzh(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x08a8:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzd(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x08b9:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzc(r10, r9, r15, r5)
            goto L_0x0a20
        L_0x08ca:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r5)
            goto L_0x0a20
        L_0x08db:
            int[] r10 = r13.zzzd
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.vision.zzjj) r15, (boolean) r5)
            goto L_0x0a20
        L_0x08ec:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x0901:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a20
        L_0x0912:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a20
        L_0x0923:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a20
        L_0x0934:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a20
        L_0x0945:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zzp(r10, r9)
            goto L_0x0a20
        L_0x0956:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a20
        L_0x0967:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzeo r9 = (com.google.android.gms.internal.vision.zzeo) r9
            r15.zza((int) r10, (com.google.android.gms.internal.vision.zzeo) r9)
            goto L_0x0a20
        L_0x097a:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            com.google.android.gms.internal.vision.zzhw r11 = r13.zzbh(r8)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzhw) r11)
            goto L_0x0a20
        L_0x098f:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.zziu.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.vision.zzjj) r15)
            goto L_0x0a20
        L_0x09a0:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.vision.zziu.zzm(r14, r11)
            r15.zzb((int) r10, (boolean) r9)
            goto L_0x0a20
        L_0x09b1:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zzh(r10, r9)
            goto L_0x0a20
        L_0x09c1:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11)
            r15.zzc(r10, r11)
            goto L_0x0a20
        L_0x09d1:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.zziu.zzk(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a20
        L_0x09e1:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11)
            r15.zza((int) r10, (long) r11)
            goto L_0x0a20
        L_0x09f1:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.zziu.zzl(r14, r11)
            r15.zzi(r10, r11)
            goto L_0x0a20
        L_0x0a01:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.vision.zziu.zzn(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a20
        L_0x0a11:
            boolean r11 = r13.zza(r14, (int) r8)
            if (r11 == 0) goto L_0x0a20
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.vision.zziu.zzo(r14, r11)
            r15.zza((int) r10, (double) r11)
        L_0x0a20:
            int r8 = r8 + 3
            goto L_0x054c
        L_0x0a24:
            if (r1 == 0) goto L_0x0a3a
            com.google.android.gms.internal.vision.zzfl<?> r2 = r13.zzzs
            r2.zza((com.google.android.gms.internal.vision.zzjj) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a38
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a24
        L_0x0a38:
            r1 = r3
            goto L_0x0a24
        L_0x0a3a:
            com.google.android.gms.internal.vision.zzio<?, ?> r0 = r13.zzzr
            zza(r0, r14, (com.google.android.gms.internal.vision.zzjj) r15)
            return
        L_0x0a40:
            r13.zzb(r14, (com.google.android.gms.internal.vision.zzjj) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.gms.internal.vision.zzjj r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.zzzi
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.vision.zzfl<?> r3 = r0.zzzs
            com.google.android.gms.internal.vision.zzfp r3 = r3.zzc(r1)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.zzzd
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzzc
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x0492
            int r12 = r0.zzbk(r10)
            int[] r13 = r0.zzzd
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.zzzk
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007c
            com.google.android.gms.internal.vision.zzfl<?> r9 = r0.zzzs
            int r9 = r9.zza(r5)
            if (r9 > r14) goto L_0x007c
            com.google.android.gms.internal.vision.zzfl<?> r9 = r0.zzzs
            r9.zza((com.google.android.gms.internal.vision.zzjj) r2, (java.util.Map.Entry<?, ?>) r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x007a:
            r5 = 0
            goto L_0x005e
        L_0x007c:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0483;
                case 1: goto L_0x0477;
                case 2: goto L_0x046b;
                case 3: goto L_0x045f;
                case 4: goto L_0x0453;
                case 5: goto L_0x0447;
                case 6: goto L_0x043b;
                case 7: goto L_0x042f;
                case 8: goto L_0x0423;
                case 9: goto L_0x0412;
                case 10: goto L_0x0403;
                case 11: goto L_0x03f6;
                case 12: goto L_0x03e9;
                case 13: goto L_0x03dc;
                case 14: goto L_0x03cf;
                case 15: goto L_0x03c2;
                case 16: goto L_0x03b5;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0394;
                case 19: goto L_0x0384;
                case 20: goto L_0x0374;
                case 21: goto L_0x0364;
                case 22: goto L_0x0354;
                case 23: goto L_0x0344;
                case 24: goto L_0x0334;
                case 25: goto L_0x0324;
                case 26: goto L_0x0315;
                case 27: goto L_0x0302;
                case 28: goto L_0x02f3;
                case 29: goto L_0x02e3;
                case 30: goto L_0x02d3;
                case 31: goto L_0x02c3;
                case 32: goto L_0x02b3;
                case 33: goto L_0x02a3;
                case 34: goto L_0x0293;
                case 35: goto L_0x0283;
                case 36: goto L_0x0273;
                case 37: goto L_0x0263;
                case 38: goto L_0x0253;
                case 39: goto L_0x0243;
                case 40: goto L_0x0233;
                case 41: goto L_0x0223;
                case 42: goto L_0x0213;
                case 43: goto L_0x0203;
                case 44: goto L_0x01f3;
                case 45: goto L_0x01e3;
                case 46: goto L_0x01d3;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01b3;
                case 49: goto L_0x01a0;
                case 50: goto L_0x0197;
                case 51: goto L_0x0188;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x011f;
                case 59: goto L_0x0110;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ed;
                case 62: goto L_0x00df;
                case 63: goto L_0x00d1;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b5;
                case 66: goto L_0x00a7;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r13 = 0
            goto L_0x048e
        L_0x0087:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x0084
        L_0x0099:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzi(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0084
        L_0x00a7:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x0084
        L_0x00b5:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzi(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0084
        L_0x00c3:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x0084
        L_0x00d1:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zzp(r14, r4)
            goto L_0x0084
        L_0x00df:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0084
        L_0x00ed:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            r2.zza((int) r14, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x0084
        L_0x00fd:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r12)
            r2.zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x0084
        L_0x0110:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzjj) r2)
            goto L_0x0084
        L_0x011f:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            boolean r4 = zzj(r1, r9)
            r2.zzb((int) r14, (boolean) r4)
            goto L_0x0084
        L_0x012e:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zzh(r14, r4)
            goto L_0x0084
        L_0x013d:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzi(r1, r9)
            r2.zzc(r14, r9)
            goto L_0x0084
        L_0x014c:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            int r4 = zzh(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0084
        L_0x015b:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzi(r1, r9)
            r2.zza((int) r14, (long) r9)
            goto L_0x0084
        L_0x016a:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            long r9 = zzi(r1, r9)
            r2.zzi(r14, r9)
            goto L_0x0084
        L_0x0179:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            float r4 = zzg(r1, r9)
            r2.zza((int) r14, (float) r4)
            goto L_0x0084
        L_0x0188:
            boolean r4 = r0.zza(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0084
            double r9 = zzf(r1, r9)
            r2.zza((int) r14, (double) r9)
            goto L_0x0084
        L_0x0197:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.zza((com.google.android.gms.internal.vision.zzjj) r2, (int) r14, (java.lang.Object) r4, (int) r12)
            goto L_0x0084
        L_0x01a0:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhw r10 = r0.zzbh(r12)
            com.google.android.gms.internal.vision.zzhy.zzb((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x0084
        L_0x01b3:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.vision.zzhy.zze(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01c3:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzj(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01d3:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzg(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01e3:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzl(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01f3:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzm(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0203:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzi(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0213:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzn(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0223:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzk(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0233:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzf(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0243:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzh(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0253:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzd(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0263:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzc(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0273:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (boolean) r13)
            goto L_0x0084
        L_0x0283:
            r13 = 1
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (boolean) r13)
            goto L_0x0084
        L_0x0293:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.vision.zzhy.zze(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02a3:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzj(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02b3:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzg(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02c3:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzl(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02d3:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzm(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02e3:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzi(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02f3:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb(r4, r9, r2)
            goto L_0x0084
        L_0x0302:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhw r10 = r0.zzbh(r12)
            com.google.android.gms.internal.vision.zzhy.zza((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (com.google.android.gms.internal.vision.zzhw) r10)
            goto L_0x0084
        L_0x0315:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r4, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.vision.zzjj) r2)
            goto L_0x0084
        L_0x0324:
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.vision.zzhy.zzn(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0334:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzk(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0344:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzf(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0354:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzh(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0364:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzd(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0374:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzc(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0384:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zzb((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (boolean) r13)
            goto L_0x048e
        L_0x0394:
            r13 = 0
            int[] r4 = r0.zzzd
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.zzhy.zza((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.vision.zzjj) r2, (boolean) r13)
            goto L_0x048e
        L_0x03a4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x048e
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x048e
        L_0x03c2:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x048e
        L_0x03cf:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x048e
        L_0x03dc:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x048e
        L_0x03e9:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzp(r14, r4)
            goto L_0x048e
        L_0x03f6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x048e
        L_0x0403:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzeo r4 = (com.google.android.gms.internal.vision.zzeo) r4
            r2.zza((int) r14, (com.google.android.gms.internal.vision.zzeo) r4)
            goto L_0x048e
        L_0x0412:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzhw r9 = r0.zzbh(r12)
            r2.zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzhw) r9)
            goto L_0x048e
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            zza((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzjj) r2)
            goto L_0x048e
        L_0x042f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            boolean r4 = com.google.android.gms.internal.vision.zziu.zzm(r1, r9)
            r2.zzb((int) r14, (boolean) r4)
            goto L_0x048e
        L_0x043b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zzh(r14, r4)
            goto L_0x048e
        L_0x0447:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzc(r14, r9)
            goto L_0x048e
        L_0x0453:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.zze(r14, r4)
            goto L_0x048e
        L_0x045f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zza((int) r14, (long) r9)
            goto L_0x048e
        L_0x046b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zzi(r14, r9)
            goto L_0x048e
        L_0x0477:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            float r4 = com.google.android.gms.internal.vision.zziu.zzn(r1, r9)
            r2.zza((int) r14, (float) r4)
            goto L_0x048e
        L_0x0483:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            double r9 = com.google.android.gms.internal.vision.zziu.zzo(r1, r9)
            r2.zza((int) r14, (double) r9)
        L_0x048e:
            int r10 = r12 + 3
            goto L_0x002b
        L_0x0492:
            if (r5 == 0) goto L_0x04a9
            com.google.android.gms.internal.vision.zzfl<?> r4 = r0.zzzs
            r4.zza((com.google.android.gms.internal.vision.zzjj) r2, (java.util.Map.Entry<?, ?>) r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0492
        L_0x04a7:
            r5 = 0
            goto L_0x0492
        L_0x04a9:
            com.google.android.gms.internal.vision.zzio<?, ?> r3 = r0.zzzr
            zza(r3, r1, (com.google.android.gms.internal.vision.zzjj) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final <K, V> void zza(zzjj zzjj, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzjj.zza(i, this.zzzt.zzo(zzbi(i2)), this.zzzt.zzk(obj));
        }
    }

    private static <UT, UB> void zza(zzio<UT, UB> zzio, T t, zzjj zzjj) throws IOException {
        zzio.zza(zzio.zzt(t), zzjj);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:149|150|(1:152)|153|(5:174|155|(2:158|156)|256|(2:160|264)(1:265))(1:252)) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r8.zza(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x05a0, code lost:
        if (r10 == null) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x05a2, code lost:
        r10 = r8.zzu(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05ab, code lost:
        if (r8.zza(r10, r14) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x05ad, code lost:
        r14 = r12.zzzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05b1, code lost:
        if (r14 < r12.zzzo) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05b3, code lost:
        r10 = zza((java.lang.Object) r13, r12.zzzm[r14], r10, r8);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05be, code lost:
        if (r10 != null) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05c0, code lost:
        r8.zzf(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x059d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r13, com.google.android.gms.internal.vision.zzhv r14, com.google.android.gms.internal.vision.zzfk r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x05dc
            com.google.android.gms.internal.vision.zzio<?, ?> r8 = r12.zzzr
            com.google.android.gms.internal.vision.zzfl<?> r9 = r12.zzzs
            r1 = r0
            r10 = r1
        L_0x0009:
            int r2 = r14.zzcn()     // Catch:{ all -> 0x05c4 }
            int r3 = r12.zzbn(r2)     // Catch:{ all -> 0x05c4 }
            if (r3 >= 0) goto L_0x0077
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002f
            int r14 = r12.zzzn
        L_0x001a:
            int r15 = r12.zzzo
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzzm
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r8.zzf(r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r3 = r12.zzzi     // Catch:{ all -> 0x05c4 }
            if (r3 != 0) goto L_0x0035
            r3 = r0
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.vision.zzhf r3 = r12.zzzh     // Catch:{ all -> 0x05c4 }
            java.lang.Object r2 = r9.zza(r15, r3, r2)     // Catch:{ all -> 0x05c4 }
            r3 = r2
        L_0x003c:
            if (r3 == 0) goto L_0x0051
            if (r1 != 0) goto L_0x0044
            com.google.android.gms.internal.vision.zzfp r1 = r9.zzd(r13)     // Catch:{ all -> 0x05c4 }
        L_0x0044:
            r11 = r1
            r1 = r9
            r2 = r14
            r4 = r15
            r5 = r11
            r6 = r10
            r7 = r8
            java.lang.Object r10 = r1.zza(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05c4 }
            r1 = r11
            goto L_0x0009
        L_0x0051:
            r8.zza(r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x005a
            java.lang.Object r10 = r8.zzu(r13)     // Catch:{ all -> 0x05c4 }
        L_0x005a:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.vision.zzhv) r14)     // Catch:{ all -> 0x05c4 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzzn
        L_0x0062:
            int r15 = r12.zzzo
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.zzzm
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0062
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r8.zzf(r13, r10)
        L_0x0076:
            return
        L_0x0077:
            int r4 = r12.zzbk(r3)     // Catch:{ all -> 0x05c4 }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0390;
                case 27: goto L_0x037e;
                case 28: goto L_0x0370;
                case 29: goto L_0x0362;
                case 30: goto L_0x034d;
                case 31: goto L_0x033f;
                case 32: goto L_0x0331;
                case 33: goto L_0x0323;
                case 34: goto L_0x0315;
                case 35: goto L_0x0307;
                case 36: goto L_0x02f9;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02dd;
                case 39: goto L_0x02cf;
                case 40: goto L_0x02c1;
                case 41: goto L_0x02b3;
                case 42: goto L_0x02a5;
                case 43: goto L_0x0297;
                case 44: goto L_0x0282;
                case 45: goto L_0x0274;
                case 46: goto L_0x0266;
                case 47: goto L_0x0258;
                case 48: goto L_0x024a;
                case 49: goto L_0x0238;
                case 50: goto L_0x01f6;
                case 51: goto L_0x01e4;
                case 52: goto L_0x01d2;
                case 53: goto L_0x01c0;
                case 54: goto L_0x01ae;
                case 55: goto L_0x019c;
                case 56: goto L_0x018a;
                case 57: goto L_0x0178;
                case 58: goto L_0x0166;
                case 59: goto L_0x015e;
                case 60: goto L_0x012d;
                case 61: goto L_0x011f;
                case 62: goto L_0x010d;
                case 63: goto L_0x00e8;
                case 64: goto L_0x00d6;
                case 65: goto L_0x00c4;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a0;
                case 68: goto L_0x008e;
                default: goto L_0x0086;
            }
        L_0x0086:
            if (r10 != 0) goto L_0x0580
            java.lang.Object r10 = r8.zzhd()     // Catch:{ zzgg -> 0x059d }
            goto L_0x0580
        L_0x008e:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r6 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r6 = r14.zzc(r6, r15)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00a0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzdc()     // Catch:{ zzgg -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00b2:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            int r6 = r14.zzdb()     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00c4:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzda()     // Catch:{ zzgg -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00d6:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            int r6 = r14.zzcz()     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00e8:
            int r5 = r14.zzcy()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgd r7 = r12.zzbj(r3)     // Catch:{ zzgg -> 0x059d }
            if (r7 == 0) goto L_0x00ff
            boolean r7 = r7.zzh(r5)     // Catch:{ zzgg -> 0x059d }
            if (r7 == 0) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            java.lang.Object r10 = com.google.android.gms.internal.vision.zzhy.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x00ff:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r6, (java.lang.Object) r4)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x010d:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            int r6 = r14.zzcx()     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x011f:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzeo r6 = r14.zzcw()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x012d:
            boolean r5 = r12.zza(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            if (r5 == 0) goto L_0x0149
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r6 = com.google.android.gms.internal.vision.zziu.zzp(r13, r4)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r7 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r7 = r14.zza(r7, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r6 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0159
        L_0x0149:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r6 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r6 = r14.zza(r6, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
        L_0x0159:
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x015e:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.vision.zzhv) r14)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0166:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            boolean r6 = r14.zzcu()     // Catch:{ zzgg -> 0x059d }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0178:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            int r6 = r14.zzct()     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x018a:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcs()     // Catch:{ zzgg -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x019c:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            int r6 = r14.zzcr()     // Catch:{ zzgg -> 0x059d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x01ae:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcp()     // Catch:{ zzgg -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x01c0:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcq()     // Catch:{ zzgg -> 0x059d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x01d2:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            float r6 = r14.readFloat()     // Catch:{ zzgg -> 0x059d }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x01e4:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzgg -> 0x059d }
            double r6 = r14.readDouble()     // Catch:{ zzgg -> 0x059d }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r2, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x01f6:
            java.lang.Object r2 = r12.zzbi(r3)     // Catch:{ zzgg -> 0x059d }
            int r3 = r12.zzbk(r3)     // Catch:{ zzgg -> 0x059d }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r5 = com.google.android.gms.internal.vision.zziu.zzp(r13, r3)     // Catch:{ zzgg -> 0x059d }
            if (r5 != 0) goto L_0x0210
            com.google.android.gms.internal.vision.zzha r5 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r5 = r5.zzn(r2)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0227
        L_0x0210:
            com.google.android.gms.internal.vision.zzha r6 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            boolean r6 = r6.zzl(r5)     // Catch:{ zzgg -> 0x059d }
            if (r6 == 0) goto L_0x0227
            com.google.android.gms.internal.vision.zzha r6 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r6 = r6.zzn(r2)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzha r7 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            r7.zzb(r6, r5)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r6)     // Catch:{ zzgg -> 0x059d }
            r5 = r6
        L_0x0227:
            com.google.android.gms.internal.vision.zzha r3 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            java.util.Map r3 = r3.zzj(r5)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzha r4 = r12.zzzt     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgy r2 = r4.zzo(r2)     // Catch:{ zzgg -> 0x059d }
            r14.zza(r3, r2, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0238:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r2 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgp r3 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            java.util.List r3 = r3.zza(r13, r4)     // Catch:{ zzgg -> 0x059d }
            r14.zzb(r3, r2, r15)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x024a:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzp(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0258:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzo(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0266:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzn(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0274:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzm(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0282:
            com.google.android.gms.internal.vision.zzgp r5 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzgg -> 0x059d }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzgg -> 0x059d }
            r14.zzl(r4)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgd r3 = r12.zzbj(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.vision.zzhy.zza((int) r2, (java.util.List<java.lang.Integer>) r4, (com.google.android.gms.internal.vision.zzgd) r3, r10, r8)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0297:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzk(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02a5:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzh(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02b3:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzg(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02c1:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzf(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02cf:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zze(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02dd:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzc(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02eb:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzd(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x02f9:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzb(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0307:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zza(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0315:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzp(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0323:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzo(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0331:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzn(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x033f:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzm(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x034d:
            com.google.android.gms.internal.vision.zzgp r5 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzgg -> 0x059d }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzgg -> 0x059d }
            r14.zzl(r4)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgd r3 = r12.zzbj(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.vision.zzhy.zza((int) r2, (java.util.List<java.lang.Integer>) r4, (com.google.android.gms.internal.vision.zzgd) r3, r10, r8)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0362:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzk(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0370:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzj(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x037e:
            com.google.android.gms.internal.vision.zzhw r2 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgp r5 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            java.util.List r3 = r5.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zza(r3, r2, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0390:
            boolean r2 = zzbm(r4)     // Catch:{ zzgg -> 0x059d }
            if (r2 == 0) goto L_0x03a4
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzi(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03a4:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.readStringList(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03b2:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzh(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03c0:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzg(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03ce:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzf(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03dc:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zze(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03ea:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzc(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x03f8:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzd(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0406:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zzb(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0414:
            com.google.android.gms.internal.vision.zzgp r2 = r12.zzzq     // Catch:{ zzgg -> 0x059d }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzgg -> 0x059d }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzgg -> 0x059d }
            r14.zza(r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0422:
            boolean r2 = r12.zza(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            if (r2 == 0) goto L_0x0440
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.vision.zziu.zzp(r13, r4)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r3 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r3 = r14.zzc(r3, r15)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0440:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r2 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = r14.zzc(r2, r15)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0453:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzdc()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0462:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            int r2 = r14.zzdb()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0471:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzda()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0480:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            int r2 = r14.zzcz()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x048f:
            int r5 = r14.zzcy()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzgd r7 = r12.zzbj(r3)     // Catch:{ zzgg -> 0x059d }
            if (r7 == 0) goto L_0x04a6
            boolean r7 = r7.zzh(r5)     // Catch:{ zzgg -> 0x059d }
            if (r7 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r10 = com.google.android.gms.internal.vision.zzhy.zza((int) r2, (int) r5, r10, r8)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x04a6:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r6, (int) r5)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x04b1:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            int r2 = r14.zzcx()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x04c0:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzeo r2 = r14.zzcw()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x04cf:
            boolean r2 = r12.zza(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            if (r2 == 0) goto L_0x04ed
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.vision.zziu.zzp(r13, r4)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r3 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r3 = r14.zza(r3, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x04ed:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zzhw r2 = r12.zzbh(r3)     // Catch:{ zzgg -> 0x059d }
            java.lang.Object r2 = r14.zza(r2, (com.google.android.gms.internal.vision.zzfk) r15)     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (java.lang.Object) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0500:
            r12.zza((java.lang.Object) r13, (int) r4, (com.google.android.gms.internal.vision.zzhv) r14)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0508:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            boolean r2 = r14.zzcu()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (boolean) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0517:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            int r2 = r14.zzct()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0526:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcs()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0535:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            int r2 = r14.zzcr()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zzb((java.lang.Object) r13, (long) r4, (int) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0544:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcp()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0553:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            long r6 = r14.zzcq()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (long) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0562:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            float r2 = r14.readFloat()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (float) r2)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0571:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzgg -> 0x059d }
            double r6 = r14.readDouble()     // Catch:{ zzgg -> 0x059d }
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r13, (long) r4, (double) r6)     // Catch:{ zzgg -> 0x059d }
            r12.zzb(r13, (int) r3)     // Catch:{ zzgg -> 0x059d }
            goto L_0x0009
        L_0x0580:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.vision.zzhv) r14)     // Catch:{ zzgg -> 0x059d }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzzn
        L_0x0588:
            int r15 = r12.zzzo
            if (r14 >= r15) goto L_0x0597
            int[] r15 = r12.zzzm
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0588
        L_0x0597:
            if (r10 == 0) goto L_0x059c
            r8.zzf(r13, r10)
        L_0x059c:
            return
        L_0x059d:
            r8.zza(r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x05a7
            java.lang.Object r2 = r8.zzu(r13)     // Catch:{ all -> 0x05c4 }
            r10 = r2
        L_0x05a7:
            boolean r2 = r8.zza(r10, (com.google.android.gms.internal.vision.zzhv) r14)     // Catch:{ all -> 0x05c4 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzzn
        L_0x05af:
            int r15 = r12.zzzo
            if (r14 >= r15) goto L_0x05be
            int[] r15 = r12.zzzm
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05af
        L_0x05be:
            if (r10 == 0) goto L_0x05c3
            r8.zzf(r13, r10)
        L_0x05c3:
            return
        L_0x05c4:
            r14 = move-exception
            int r15 = r12.zzzn
        L_0x05c7:
            int r0 = r12.zzzo
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.zzzm
            r0 = r0[r15]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r0, r10, r8)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r8.zzf(r13, r10)
        L_0x05db:
            throw r14
        L_0x05dc:
            goto L_0x05de
        L_0x05dd:
            throw r0
        L_0x05de:
            goto L_0x05dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzhv, com.google.android.gms.internal.vision.zzfk):void");
    }

    private static zzip zzq(Object obj) {
        zzfy zzfy = (zzfy) obj;
        zzip zzip = zzfy.zzwj;
        if (zzip != zzip.zzhe()) {
            return zzip;
        }
        zzip zzhf = zzip.zzhf();
        zzfy.zzwj = zzhf;
        return zzhf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(com.google.android.gms.internal.vision.zzhw r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.vision.zzei r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.vision.zzeh.zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.vision.zzei) r10)
            int r8 = r10.zzro
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zze(r9)
            r10.zzrq = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.vision.zzgf r6 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(com.google.android.gms.internal.vision.zzhw, byte[], int, int, com.google.android.gms.internal.vision.zzei):int");
    }

    private static int zza(zzhw zzhw, byte[] bArr, int i, int i2, int i3, zzei zzei) throws IOException {
        zzhj zzhj = (zzhj) zzhw;
        Object newInstance = zzhj.newInstance();
        int zza = zzhj.zza(newInstance, bArr, i, i2, i3, zzei);
        zzhj.zze(newInstance);
        zzei.zzrq = newInstance;
        return zza;
    }

    private static int zza(zzhw<?> zzhw, int i, byte[] bArr, int i2, int i3, zzge<?> zzge, zzei zzei) throws IOException {
        int zza = zza((zzhw) zzhw, bArr, i2, i3, zzei);
        zzge.add(zzei.zzrq);
        while (zza < i3) {
            int zza2 = zzeh.zza(bArr, zza, zzei);
            if (i != zzei.zzro) {
                break;
            }
            zza = zza((zzhw) zzhw, bArr, zza2, i3, zzei);
            zzge.add(zzei.zzrq);
        }
        return zza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.vision.zzjd r4, java.lang.Class<?> r5, com.google.android.gms.internal.vision.zzei r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.vision.zzhk.zzrr
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.vision.zzeh.zzd(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6)
            long r2 = r6.zzrp
            long r2 = com.google.android.gms.internal.vision.zzez.zzd(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzrq = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2, r6)
            int r2 = r6.zzro
            int r2 = com.google.android.gms.internal.vision.zzez.zzaq(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzrq = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.vision.zzhs r4 = com.google.android.gms.internal.vision.zzhs.zzgl()
            com.google.android.gms.internal.vision.zzhw r4 = r4.zzf(r5)
            int r1 = zza((com.google.android.gms.internal.vision.zzhw) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.vision.zzei) r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6)
            long r2 = r6.zzrp
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzrq = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2, r6)
            int r2 = r6.zzro
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzrq = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.vision.zzeh.zzd(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zzrq = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.zzrq = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zzrq = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.vision.zzeh.zzc(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.zzrq = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.vision.zzeh.zze(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r1, r2, r6)
            long r2 = r6.zzrp
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.zzrq = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(byte[], int, int, com.google.android.gms.internal.vision.zzjd, java.lang.Class, com.google.android.gms.internal.vision.zzei):int");
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzei zzei) throws IOException {
        return zzeh.zza(i, bArr, i2, i3, zzq(obj), zzei);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.vision.zzei r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = zzzc
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.vision.zzge r11 = (com.google.android.gms.internal.vision.zzge) r11
            boolean r12 = r11.zzch()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.vision.zzge r11 = r11.zzah(r12)
            sun.misc.Unsafe r12 = zzzc
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.vision.zzhw r1 = r0.zzbh(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.vision.zzhw) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.vision.zzei) r27)
            java.lang.Object r8 = r7.zzrq
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r9 = r7.zzro
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.vision.zzhw) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.vision.zzei) r27)
            java.lang.Object r8 = r7.zzrq
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1, r7)
            long r4 = r7.zzrp
            long r4 = com.google.android.gms.internal.vision.zzez.zzd(r4)
            r11.zzp(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7)
            long r8 = r7.zzrp
            long r8 = com.google.android.gms.internal.vision.zzez.zzd(r8)
            r11.zzp(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7)
            long r8 = r7.zzrp
            long r8 = com.google.android.gms.internal.vision.zzez.zzd(r8)
            r11.zzp(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.vision.zzfz r11 = (com.google.android.gms.internal.vision.zzfz) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r4 = r7.zzro
            int r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4)
            r11.zzbg(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.vision.zzfz r11 = (com.google.android.gms.internal.vision.zzfz) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r4 = r7.zzro
            int r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4)
            r11.zzbg(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r4 = r7.zzro
            int r4 = com.google.android.gms.internal.vision.zzez.zzaq(r4)
            r11.zzbg(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.vision.zzeh.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.vision.zzge<?>) r11, (com.google.android.gms.internal.vision.zzei) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.vision.zzeh.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.vision.zzge<?>) r6, (com.google.android.gms.internal.vision.zzei) r7)
        L_0x0131:
            com.google.android.gms.internal.vision.zzfy r1 = (com.google.android.gms.internal.vision.zzfy) r1
            com.google.android.gms.internal.vision.zzip r3 = r1.zzwj
            com.google.android.gms.internal.vision.zzip r4 = com.google.android.gms.internal.vision.zzip.zzhe()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.vision.zzgd r4 = r0.zzbj(r8)
            com.google.android.gms.internal.vision.zzio<?, ?> r5 = r0.zzzr
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.vision.zzhy.zza((int) r6, (java.util.List<java.lang.Integer>) r11, (com.google.android.gms.internal.vision.zzgd) r4, r3, r5)
            com.google.android.gms.internal.vision.zzip r3 = (com.google.android.gms.internal.vision.zzip) r3
            if (r3 == 0) goto L_0x014e
            r1.zzwj = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r4 = r7.zzro
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.vision.zzeo r4 = com.google.android.gms.internal.vision.zzeo.zzrx
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.vision.zzeo r6 = com.google.android.gms.internal.vision.zzeo.zzb((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r4 = r7.zzro
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.vision.zzeo r4 = com.google.android.gms.internal.vision.zzeo.zzrx
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.vision.zzeo r6 = com.google.android.gms.internal.vision.zzeo.zzb((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.vision.zzhw r1 = r0.zzbh(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = zza((com.google.android.gms.internal.vision.zzhw<?>) r22, (int) r23, (byte[]) r24, (int) r25, (int) r26, (com.google.android.gms.internal.vision.zzge<?>) r27, (com.google.android.gms.internal.vision.zzei) r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r6 = r7.zzro
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.zzga.UTF_8
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r8 = r7.zzro
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r6, r7)
            int r6 = r7.zzro
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.zzga.UTF_8
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r6 = r7.zzro
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.vision.zziw.zzg(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.zzga.UTF_8
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r8 = r7.zzro
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r6, r7)
            int r6 = r7.zzro
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.vision.zziw.zzg(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.zzga.UTF_8
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfp()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfp()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfi()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.vision.zzem r11 = (com.google.android.gms.internal.vision.zzem) r11
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r4 = r7.zzro
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r2, r7)
            long r5 = r7.zzrp
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.addBoolean(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.vision.zzem r11 = (com.google.android.gms.internal.vision.zzem) r11
            int r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7)
            long r8 = r7.zzrp
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.addBoolean(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r8 = r7.zzro
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r6, r7)
            long r8 = r7.zzrp
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.addBoolean(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.vision.zzfz r11 = (com.google.android.gms.internal.vision.zzfz) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1)
            r11.zzbg(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.vision.zzfz r11 = (com.google.android.gms.internal.vision.zzfz) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r18, r19)
            r11.zzbg(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4)
            r11.zzbg(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1)
            r11.zzp(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            long r8 = com.google.android.gms.internal.vision.zzeh.zzb(r18, r19)
            r11.zzp(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4)
            r11.zzp(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.vision.zzeh.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.vision.zzge<?>) r11, (com.google.android.gms.internal.vision.zzei) r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.vision.zzeh.zza((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.vision.zzge<?>) r25, (com.google.android.gms.internal.vision.zzei) r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r1, r7)
            long r4 = r7.zzrp
            r11.zzp(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.vision.zzgt r11 = (com.google.android.gms.internal.vision.zzgt) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7)
            long r8 = r7.zzrp
            r11.zzp(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r7)
            long r8 = r7.zzrp
            r11.zzp(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.vision.zzfv r11 = (com.google.android.gms.internal.vision.zzfv) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.vision.zzeh.zzd(r3, r1)
            r11.zzh(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.vision.zzfv r11 = (com.google.android.gms.internal.vision.zzfv) r11
            float r1 = com.google.android.gms.internal.vision.zzeh.zzd(r18, r19)
            r11.zzh(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.vision.zzeh.zzd(r3, r4)
            r11.zzh(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.vision.zzfh r11 = (com.google.android.gms.internal.vision.zzfh) r11
            int r1 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r7)
            int r2 = r7.zzro
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.vision.zzeh.zzc(r3, r1)
            r11.zzc(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfh()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.vision.zzfh r11 = (com.google.android.gms.internal.vision.zzfh) r11
            double r8 = com.google.android.gms.internal.vision.zzeh.zzc(r18, r19)
            r11.zzc(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.vision.zzeh.zza(r3, r1, r7)
            int r6 = r7.zzro
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.vision.zzeh.zzc(r3, r4)
            r11.zzc(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.vision.zzei r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzzc
            java.lang.Object r12 = r7.zzbi(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.vision.zzha r2 = r7.zzzt
            boolean r2 = r2.zzl(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.vision.zzha r2 = r7.zzzt
            java.lang.Object r2 = r2.zzn(r12)
            com.google.android.gms.internal.vision.zzha r3 = r7.zzzt
            r3.zzb(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.vision.zzha r8 = r7.zzzt
            com.google.android.gms.internal.vision.zzgy r8 = r8.zzo(r12)
            com.google.android.gms.internal.vision.zzha r12 = r7.zzzt
            java.util.Map r12 = r12.zzj(r1)
            int r10 = com.google.android.gms.internal.vision.zzeh.zza(r9, r10, r15)
            int r13 = r15.zzro
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.zzyw
            V r0 = r8.zzgq
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.vision.zzeh.zza((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.vision.zzei) r15)
            int r10 = r15.zzro
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.vision.zzjd r1 = r8.zzyx
            int r1 = r1.zzhp()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.vision.zzjd r4 = r8.zzyx
            V r10 = r8.zzgq
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.vision.zzjd) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.vision.zzei) r6)
            java.lang.Object r0 = r15.zzrq
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.vision.zzjd r1 = r8.zzyv
            int r1 = r1.zzhp()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.vision.zzjd r4 = r8.zzyv
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.vision.zzjd) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.vision.zzei) r6)
            java.lang.Object r14 = r15.zzrq
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.vision.zzeh.zza(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.vision.zzgf r8 = com.google.android.gms.internal.vision.zzgf.zzfo()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.vision.zzgf r8 = com.google.android.gms.internal.vision.zzgf.zzfh()
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.zzei r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzzc
            int[] r7 = r0.zzzd
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.vision.zzhw r2 = r0.zzbh(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = zza((com.google.android.gms.internal.vision.zzhw) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.vision.zzei) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.zzrq
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.zzrq
            java.lang.Object r3 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11)
            long r3 = r11.zzrp
            long r3 = com.google.android.gms.internal.vision.zzez.zzd(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11)
            int r3 = r11.zzro
            int r3 = com.google.android.gms.internal.vision.zzez.zzaq(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11)
            int r4 = r11.zzro
            com.google.android.gms.internal.vision.zzgd r5 = r0.zzbj(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.zzh(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.vision.zzip r1 = zzq(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzb(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zze(r3, r4, r11)
            java.lang.Object r3 = r11.zzrq
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.vision.zzhw r2 = r0.zzbh(r6)
            r5 = r20
            int r2 = zza((com.google.android.gms.internal.vision.zzhw) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.vision.zzei) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.zzrq
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.zzrq
            java.lang.Object r3 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11)
            int r4 = r11.zzro
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.zziw.zzg(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.vision.zzgf r1 = com.google.android.gms.internal.vision.zzgf.zzfp()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.vision.zzga.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11)
            long r3 = r11.zzrp
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.vision.zzeh.zzb(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zza(r3, r4, r11)
            int r3 = r11.zzro
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.zzeh.zzb(r3, r4, r11)
            long r3 = r11.zzrp
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.vision.zzeh.zzd(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.vision.zzeh.zzc(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.zzei):int");
    }

    private final zzhw zzbh(int i) {
        int i2 = (i / 3) << 1;
        zzhw zzhw = (zzhw) this.zzze[i2];
        if (zzhw != null) {
            return zzhw;
        }
        zzhw zzf = zzhs.zzgl().zzf((Class) this.zzze[i2 + 1]);
        this.zzze[i2] = zzf;
        return zzf;
    }

    private final Object zzbi(int i) {
        return this.zzze[(i / 3) << 1];
    }

    private final zzgd zzbj(int i) {
        return (zzgd) this.zzze[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0342, code lost:
        if (r0 == r15) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x038b, code lost:
        if (r0 == r15) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        r12 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0201, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0225, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025d, code lost:
        r6 = r6 | r22;
        r3 = r8;
        r2 = r9;
        r9 = r11;
        r0 = r13;
        r1 = r18;
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0298, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029a, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029c, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
        r3 = r8;
        r2 = r9;
        r9 = r11;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a3, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a7, code lost:
        r19 = r9;
        r26 = r10;
        r2 = r13;
        r9 = r8;
        r8 = r32;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.vision.zzei r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = zzzc
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x03f8
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.vision.zzeh.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.vision.zzei) r9)
            int r3 = r9.zzro
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.zzr(r3, r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.zzbn(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004a
            r18 = r3
            r2 = r4
            r9 = r5
            r26 = r10
            r8 = r11
            r19 = 0
            goto L_0x03b9
        L_0x004a:
            int[] r1 = r15.zzzd
            int r18 = r2 + 1
            r8 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r8 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02b1
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r18
            r5 = -1
            if (r1 == r7) goto L_0x007e
            if (r7 == r5) goto L_0x0078
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0078:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x007e:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x0281;
                case 1: goto L_0x0268;
                case 2: goto L_0x0242;
                case 3: goto L_0x0242;
                case 4: goto L_0x0228;
                case 5: goto L_0x0205;
                case 6: goto L_0x01e8;
                case 7: goto L_0x01c5;
                case 8: goto L_0x019f;
                case 9: goto L_0x0168;
                case 10: goto L_0x014e;
                case 11: goto L_0x0228;
                case 12: goto L_0x011a;
                case 13: goto L_0x01e8;
                case 14: goto L_0x0205;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00d9;
                case 17: goto L_0x0090;
                default: goto L_0x0082;
            }
        L_0x0082:
            r12 = r29
            r11 = r33
            r9 = r2
            r18 = r3
            r13 = r4
            r8 = r19
            r19 = -1
            goto L_0x02a7
        L_0x0090:
            r8 = 3
            if (r0 != r8) goto L_0x00cf
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.vision.zzhw r0 = r15.zzbh(r2)
            r1 = r29
            r9 = r2
            r2 = r4
            r18 = r3
            r3 = r31
            r4 = r8
            r8 = r19
            r19 = -1
            r5 = r33
            int r0 = zza((com.google.android.gms.internal.vision.zzhw) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.vision.zzei) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00ba
            r11 = r33
            java.lang.Object r1 = r11.zzrq
            r10.putObject(r14, r12, r1)
            goto L_0x00c9
        L_0x00ba:
            r11 = r33
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.zzrq
            java.lang.Object r1 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r12, r1)
        L_0x00c9:
            r6 = r6 | r22
            r12 = r29
            goto L_0x029c
        L_0x00cf:
            r11 = r33
            r9 = r2
            r18 = r3
            r8 = r19
            r19 = -1
            goto L_0x00f9
        L_0x00d9:
            r11 = r33
            r9 = r2
            r18 = r3
            r8 = r19
            r19 = -1
            if (r0 != 0) goto L_0x00f9
            r2 = r12
            r12 = r29
            int r13 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4, r11)
            long r0 = r11.zzrp
            long r4 = com.google.android.gms.internal.vision.zzez.zzd(r0)
            r0 = r10
            r1 = r28
            r0.putLong(r1, r2, r4)
            goto L_0x025d
        L_0x00f9:
            r12 = r29
            goto L_0x0225
        L_0x00fd:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            if (r0 != 0) goto L_0x0225
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4, r11)
            int r1 = r11.zzro
            int r1 = com.google.android.gms.internal.vision.zzez.zzaq(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x029a
        L_0x011a:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            if (r0 != 0) goto L_0x0225
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4, r11)
            int r1 = r11.zzro
            com.google.android.gms.internal.vision.zzgd r4 = r15.zzbj(r9)
            if (r4 == 0) goto L_0x0149
            boolean r4 = r4.zzh(r1)
            if (r4 == 0) goto L_0x013b
            goto L_0x0149
        L_0x013b:
            com.google.android.gms.internal.vision.zzip r2 = zzq(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzb(r8, r1)
            goto L_0x029c
        L_0x0149:
            r10.putInt(r14, r2, r1)
            goto L_0x029a
        L_0x014e:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r29
            if (r0 != r1) goto L_0x0225
            int r0 = com.google.android.gms.internal.vision.zzeh.zze(r12, r4, r11)
            java.lang.Object r1 = r11.zzrq
            r10.putObject(r14, r2, r1)
            goto L_0x029a
        L_0x0168:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r29
            if (r0 != r1) goto L_0x019b
            com.google.android.gms.internal.vision.zzhw r0 = r15.zzbh(r9)
            r13 = r31
            int r0 = zza((com.google.android.gms.internal.vision.zzhw) r0, (byte[]) r12, (int) r4, (int) r13, (com.google.android.gms.internal.vision.zzei) r11)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x018c
            java.lang.Object r1 = r11.zzrq
            r10.putObject(r14, r2, r1)
            goto L_0x0201
        L_0x018c:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r11.zzrq
            java.lang.Object r1 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r1, (java.lang.Object) r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0201
        L_0x019b:
            r13 = r31
            goto L_0x0225
        L_0x019f:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r29
            r13 = r31
            if (r0 != r1) goto L_0x0225
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01bb
            int r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r4, r11)
            goto L_0x01bf
        L_0x01bb:
            int r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r4, r11)
        L_0x01bf:
            java.lang.Object r1 = r11.zzrq
            r10.putObject(r14, r2, r1)
            goto L_0x0201
        L_0x01c5:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r31
            if (r0 != 0) goto L_0x0225
            int r0 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4, r11)
            long r4 = r11.zzrp
            r20 = 0
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01e3
            r1 = 1
            goto L_0x01e4
        L_0x01e3:
            r1 = 0
        L_0x01e4:
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (boolean) r1)
            goto L_0x0201
        L_0x01e8:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r31
            if (r0 != r1) goto L_0x0225
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0201:
            r6 = r6 | r22
            goto L_0x029e
        L_0x0205:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r29
            r13 = r31
            if (r0 != r1) goto L_0x0225
            long r20 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r4)
            r0 = r10
            r1 = r28
            r13 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x0298
        L_0x0225:
            r13 = r4
            goto L_0x02a7
        L_0x0228:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r4
            if (r0 != 0) goto L_0x02a7
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r13, r11)
            int r1 = r11.zzro
            r10.putInt(r14, r2, r1)
            goto L_0x029a
        L_0x0242:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r4
            if (r0 != 0) goto L_0x02a7
            int r13 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r13, r11)
            long r4 = r11.zzrp
            r0 = r10
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x025d:
            r6 = r6 | r22
            r3 = r8
            r2 = r9
            r9 = r11
            r0 = r13
            r1 = r18
            r13 = r31
            goto L_0x02a3
        L_0x0268:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r4
            if (r0 != r1) goto L_0x02a7
            float r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r13)
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r13 + 4
            goto L_0x029a
        L_0x0281:
            r11 = r33
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r29
            r13 = r4
            if (r0 != r1) goto L_0x02a7
            double r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r13)
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0298:
            int r0 = r13 + 8
        L_0x029a:
            r6 = r6 | r22
        L_0x029c:
            r13 = r31
        L_0x029e:
            r3 = r8
            r2 = r9
            r9 = r11
            r1 = r18
        L_0x02a3:
            r11 = r32
            goto L_0x0017
        L_0x02a7:
            r19 = r9
            r26 = r10
            r2 = r13
            r9 = r8
            r8 = r32
            goto L_0x03b9
        L_0x02b1:
            r9 = r2
            r18 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r29
            r13 = r4
            r1 = 27
            if (r11 != r1) goto L_0x030d
            r1 = 2
            if (r0 != r1) goto L_0x0300
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.vision.zzge r0 = (com.google.android.gms.internal.vision.zzge) r0
            boolean r1 = r0.zzch()
            if (r1 != 0) goto L_0x02e1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d8
            r1 = 10
            goto L_0x02da
        L_0x02d8:
            int r1 = r1 << 1
        L_0x02da:
            com.google.android.gms.internal.vision.zzge r0 = r0.zzah(r1)
            r10.putObject(r14, r2, r0)
        L_0x02e1:
            r5 = r0
            com.google.android.gms.internal.vision.zzhw r0 = r15.zzbh(r9)
            r1 = r8
            r2 = r29
            r3 = r13
            r4 = r31
            r17 = r6
            r6 = r33
            int r0 = zza((com.google.android.gms.internal.vision.zzhw<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.vision.zzge<?>) r5, (com.google.android.gms.internal.vision.zzei) r6)
            r13 = r31
            r11 = r32
            r3 = r8
            r2 = r9
            r6 = r17
            r1 = r18
            goto L_0x03de
        L_0x0300:
            r17 = r6
            r24 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            r15 = r13
            goto L_0x038e
        L_0x030d:
            r17 = r6
            r1 = 49
            if (r11 > r1) goto L_0x0360
            r6 = r20
            long r5 = (long) r6
            r4 = r0
            r0 = r27
            r1 = r28
            r22 = r2
            r2 = r29
            r3 = r13
            r30 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r18
            r24 = r7
            r7 = r30
            r25 = r8
            r15 = -1
            r8 = r9
            r19 = r9
            r26 = r10
            r9 = r20
            r15 = r32
            r15 = r13
            r12 = r22
            r14 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.vision.zzei) r14)
            if (r0 != r15) goto L_0x0346
            goto L_0x03b5
        L_0x0346:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            r6 = r17
            r1 = r18
            r2 = r19
            r7 = r24
            r3 = r25
            r10 = r26
            goto L_0x0017
        L_0x0360:
            r30 = r0
            r22 = r2
            r24 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            r15 = r13
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x0398
            r7 = r30
            r0 = 2
            if (r7 != r0) goto L_0x038e
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r22
            r8 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.vision.zzei) r8)
            if (r0 != r15) goto L_0x0346
            goto L_0x03b5
        L_0x038e:
            r8 = r32
            r2 = r15
        L_0x0391:
            r6 = r17
            r7 = r24
            r9 = r25
            goto L_0x03b9
        L_0x0398:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r25
            r8 = r6
            r6 = r18
            r9 = r11
            r10 = r22
            r12 = r19
            r13 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.vision.zzei) r13)
            if (r0 != r15) goto L_0x03e2
        L_0x03b5:
            r8 = r32
            r2 = r0
            goto L_0x0391
        L_0x03b9:
            if (r9 != r8) goto L_0x03c1
            if (r8 != 0) goto L_0x03be
            goto L_0x03c1
        L_0x03be:
            r0 = r2
            r3 = r9
            goto L_0x03ff
        L_0x03c1:
            r0 = r9
            r1 = r29
            r3 = r31
            r4 = r28
            r5 = r33
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzei) r5)
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r8
            r3 = r9
            r1 = r18
            r2 = r19
        L_0x03dc:
            r10 = r26
        L_0x03de:
            r9 = r33
            goto L_0x0017
        L_0x03e2:
            r9 = r25
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r3 = r9
            r6 = r17
            r1 = r18
            r2 = r19
            r7 = r24
            goto L_0x03dc
        L_0x03f8:
            r17 = r6
            r24 = r7
            r26 = r10
            r8 = r11
        L_0x03ff:
            r1 = -1
            if (r7 == r1) goto L_0x040b
            long r1 = (long) r7
            r4 = r28
            r5 = r26
            r5.putInt(r4, r1, r6)
            goto L_0x040d
        L_0x040b:
            r4 = r28
        L_0x040d:
            r1 = 0
            r2 = r27
            int r5 = r2.zzzn
        L_0x0412:
            int r6 = r2.zzzo
            if (r5 >= r6) goto L_0x0425
            int[] r6 = r2.zzzm
            r6 = r6[r5]
            com.google.android.gms.internal.vision.zzio<?, ?> r7 = r2.zzzr
            java.lang.Object r1 = r2.zza((java.lang.Object) r4, (int) r6, r1, r7)
            com.google.android.gms.internal.vision.zzip r1 = (com.google.android.gms.internal.vision.zzip) r1
            int r5 = r5 + 1
            goto L_0x0412
        L_0x0425:
            if (r1 == 0) goto L_0x042c
            com.google.android.gms.internal.vision.zzio<?, ?> r5 = r2.zzzr
            r5.zzf(r4, r1)
        L_0x042c:
            if (r8 != 0) goto L_0x0438
            r1 = r31
            if (r0 != r1) goto L_0x0433
            goto L_0x043e
        L_0x0433:
            com.google.android.gms.internal.vision.zzgf r0 = com.google.android.gms.internal.vision.zzgf.zzfo()
            throw r0
        L_0x0438:
            r1 = r31
            if (r0 > r1) goto L_0x043f
            if (r3 != r8) goto L_0x043f
        L_0x043e:
            return r0
        L_0x043f:
            com.google.android.gms.internal.vision.zzgf r0 = com.google.android.gms.internal.vision.zzgf.zzfo()
            goto L_0x0445
        L_0x0444:
            throw r0
        L_0x0445:
            goto L_0x0444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.vision.zzei r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.zzzk
            if (r0 == 0) goto L_0x025b
            sun.misc.Unsafe r9 = zzzc
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0252
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.vision.zzeh.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.vision.zzei) r11)
            int r3 = r11.zzro
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.zzr(r7, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.zzbn(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.zzzd
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11)
            r19 = r1
            long r0 = r11.zzrp
            long r21 = com.google.android.gms.internal.vision.zzez.zzd(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11)
            int r1 = r11.zzro
            int r1 = com.google.android.gms.internal.vision.zzez.zzaq(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11)
            int r1 = r11.zzro
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = com.google.android.gms.internal.vision.zzeh.zze(r12, r8, r11)
            java.lang.Object r1 = r11.zzrq
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            com.google.android.gms.internal.vision.zzhw r0 = r15.zzbh(r4)
            int r0 = zza((com.google.android.gms.internal.vision.zzhw) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.vision.zzei) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.zzrq
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.zzrq
            java.lang.Object r1 = com.google.android.gms.internal.vision.zzga.zza((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.zzrq
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11)
            long r5 = r11.zzrp
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x024f
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.vision.zzeh.zza(r12, r8, r11)
            int r1 = r11.zzro
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = com.google.android.gms.internal.vision.zzeh.zzb(r12, r8, r11)
            long r4 = r11.zzrp
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = com.google.android.gms.internal.vision.zzeh.zzd(r12, r8)
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = com.google.android.gms.internal.vision.zzeh.zzc(r12, r8)
            com.google.android.gms.internal.vision.zziu.zza((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x024f
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.vision.zzge r0 = (com.google.android.gms.internal.vision.zzge) r0
            boolean r3 = r0.zzch()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            com.google.android.gms.internal.vision.zzge r0 = r0.zzah(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            com.google.android.gms.internal.vision.zzhw r0 = r15.zzbh(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = zza((com.google.android.gms.internal.vision.zzhw<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.vision.zzge<?>) r5, (com.google.android.gms.internal.vision.zzei) r6)
            r1 = r7
            r2 = r19
            goto L_0x024f
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.vision.zzei) r14)
            if (r0 != r15) goto L_0x023f
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.vision.zzei) r8)
            if (r0 != r15) goto L_0x023f
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.vision.zzei) r13)
            if (r0 != r15) goto L_0x023f
        L_0x0230:
            r2 = r0
        L_0x0231:
            r0 = r17
            r1 = r29
            r3 = r31
            r4 = r28
            r5 = r32
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.vision.zzei) r5)
        L_0x023f:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x024f:
            r10 = -1
            goto L_0x0017
        L_0x0252:
            r4 = r13
            if (r0 != r4) goto L_0x0256
            return
        L_0x0256:
            com.google.android.gms.internal.vision.zzgf r0 = com.google.android.gms.internal.vision.zzgf.zzfo()
            throw r0
        L_0x025b:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.vision.zzei) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzei):void");
    }

    public final void zze(T t) {
        int i;
        int i2 = this.zzzn;
        while (true) {
            i = this.zzzo;
            if (i2 >= i) {
                break;
            }
            long zzbk = (long) (zzbk(this.zzzm[i2]) & 1048575);
            Object zzp = zziu.zzp(t, zzbk);
            if (zzp != null) {
                zziu.zza((Object) t, zzbk, this.zzzt.zzm(zzp));
            }
            i2++;
        }
        int length = this.zzzm.length;
        while (i < length) {
            this.zzzq.zzb(t, (long) this.zzzm[i]);
            i++;
        }
        this.zzzr.zze(t);
        if (this.zzzi) {
            this.zzzs.zze((Object) t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzio<UT, UB> zzio) {
        zzgd zzbj;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-11604203, oncanceled);
            onCancelLoad.getMin(-11604203, oncanceled);
        }
        int i2 = this.zzzd[i];
        Object zzp = zziu.zzp(obj, (long) (zzbk(i) & 1048575));
        if (zzp == null || (zzbj = zzbj(i)) == null) {
            return ub;
        }
        return zza(i, i2, this.zzzt.zzj(zzp), zzbj, ub, zzio);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzgd zzgd, UB ub, zzio<UT, UB> zzio) {
        zzgy<?, ?> zzo = this.zzzt.zzo(zzbi(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzgd.zzh(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzio.zzhd();
                }
                zzev zzaj = zzeo.zzaj(zzgx.zza(zzo, next.getKey(), next.getValue()));
                try {
                    zzgx.zza(zzaj.zzdp(), zzo, next.getKey(), next.getValue());
                    zzio.zza(ub, i2, zzaj.zzdo());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final boolean zzr(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzzn) {
                return !this.zzzi || this.zzzs.zzc(t).isInitialized();
            }
            int i5 = this.zzzm[i3];
            int i6 = this.zzzd[i5];
            int zzbk = zzbk(i5);
            if (!this.zzzk) {
                int i7 = this.zzzd[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzzc.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & zzbk) != 0) && !zza(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzbk) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza(t, i6, i5) && !zza((Object) t, zzbk, zzbh(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzk = this.zzzt.zzk(zziu.zzp(t, (long) (zzbk & 1048575)));
                            if (!zzk.isEmpty()) {
                                if (this.zzzt.zzo(zzbi(i5)).zzyx.zzho() == zzji.MESSAGE) {
                                    zzhw<?> zzhw = null;
                                    Iterator<?> it = zzk.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzhw == null) {
                                            zzhw = zzhs.zzgl().zzf(next.getClass());
                                        }
                                        if (!zzhw.zzr(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zziu.zzp(t, (long) (zzbk & 1048575));
                if (!list.isEmpty()) {
                    zzhw zzbh = zzbh(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzbh.zzr(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza(t, i5, i4, i) && !zza((Object) t, zzbk, zzbh(i5))) {
                return false;
            }
            i3++;
        }
    }

    private static boolean zza(Object obj, int i, zzhw zzhw) {
        return zzhw.zzr(zziu.zzp(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzjj zzjj) throws IOException {
        if (obj instanceof String) {
            zzjj.zza(i, (String) obj);
        } else {
            zzjj.zza(i, (zzeo) obj);
        }
    }

    private final void zza(Object obj, int i, zzhv zzhv) throws IOException {
        if (zzbm(i)) {
            zziu.zza(obj, (long) (i & 1048575), (Object) zzhv.zzcv());
        } else if (this.zzzj) {
            zziu.zza(obj, (long) (i & 1048575), (Object) zzhv.readString());
        } else {
            zziu.zza(obj, (long) (i & 1048575), (Object) zzhv.zzcw());
        }
    }

    private final int zzbk(int i) {
        return this.zzzd[i + 1];
    }

    private final int zzbl(int i) {
        return this.zzzd[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zziu.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zziu.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zziu.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zziu.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zziu.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzzk) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzzk) {
            int zzbk = zzbk(i);
            long j = (long) (zzbk & 1048575);
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    return zziu.zzo(t, j) != 0.0d;
                case 1:
                    return zziu.zzn(t, j) != 0.0f;
                case 2:
                    return zziu.zzl(t, j) != 0;
                case 3:
                    return zziu.zzl(t, j) != 0;
                case 4:
                    return zziu.zzk(t, j) != 0;
                case 5:
                    return zziu.zzl(t, j) != 0;
                case 6:
                    return zziu.zzk(t, j) != 0;
                case 7:
                    return zziu.zzm(t, j);
                case 8:
                    Object zzp = zziu.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzeo) {
                        return !zzeo.zzrx.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zziu.zzp(t, j) != null;
                case 10:
                    return !zzeo.zzrx.equals(zziu.zzp(t, j));
                case 11:
                    return zziu.zzk(t, j) != 0;
                case 12:
                    return zziu.zzk(t, j) != 0;
                case 13:
                    return zziu.zzk(t, j) != 0;
                case 14:
                    return zziu.zzl(t, j) != 0;
                case 15:
                    return zziu.zzk(t, j) != 0;
                case 16:
                    return zziu.zzl(t, j) != 0;
                case 17:
                    return zziu.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzbl = zzbl(i);
            return (zziu.zzk(t, (long) (zzbl & 1048575)) & (1 << (zzbl >>> 20))) != 0;
        }
    }

    private final void zzb(T t, int i) {
        if (!this.zzzk) {
            int zzbl = zzbl(i);
            long j = (long) (zzbl & 1048575);
            zziu.zzb((Object) t, j, zziu.zzk(t, j) | (1 << (zzbl >>> 20)));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zziu.zzk(t, (long) (zzbl(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zziu.zzb((Object) t, (long) (zzbl(i2) & 1048575), i);
    }

    private final int zzbn(int i) {
        if (i < this.zzzf || i > this.zzzg) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zzzf || i > this.zzzg) {
            return -1;
        }
        return zzs(i, i2);
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzzd.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzzd[i4];
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
}
