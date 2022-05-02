package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;
import java.io.IOException;
import java.util.Arrays;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzxt {
    private static final zzxt zzceg = new zzxt(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzbvj;
    private int zzbzt;
    private Object[] zzccg;
    private int[] zzceh;

    public static zzxt zzvj() {
        return zzceg;
    }

    static zzxt zzvk() {
        return new zzxt();
    }

    static zzxt zza(zzxt zzxt, zzxt zzxt2) {
        int i = zzxt.count + zzxt2.count;
        int[] copyOf = Arrays.copyOf(zzxt.zzceh, i);
        System.arraycopy(zzxt2.zzceh, 0, copyOf, zzxt.count, zzxt2.count);
        Object[] copyOf2 = Arrays.copyOf(zzxt.zzccg, i);
        System.arraycopy(zzxt2.zzccg, 0, copyOf2, zzxt.count, zzxt2.count);
        return new zzxt(i, copyOf, copyOf2, true);
    }

    private zzxt() {
        this(0, new int[8], new Object[8], true);
    }

    private zzxt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzbzt = -1;
        this.count = i;
        this.zzceh = iArr;
        this.zzccg = objArr;
        this.zzbvj = z;
    }

    public final void zzrv() {
        this.zzbvj = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzyn zzyn) throws IOException {
        if (zzyn.zzsm() == zzux.zzf.zzcak) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzyn.zza(this.zzceh[i] >>> 3, this.zzccg[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzyn.zza(this.zzceh[i2] >>> 3, this.zzccg[i2]);
        }
    }

    public final void zzb(zzyn zzyn) throws IOException {
        if (this.count != 0) {
            if (zzyn.zzsm() == zzux.zzf.zzcaj) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzceh[i], this.zzccg[i], zzyn);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzceh[i2], this.zzccg[i2], zzyn);
            }
        }
    }

    private static void zzb(int i, Object obj, zzyn zzyn) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzyn.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzyn.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzyn.zza(i2, (zztq) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzyn.zzl(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzvi.zzts());
        } else if (zzyn.zzsm() == zzux.zzf.zzcaj) {
            zzyn.zzdj(i2);
            ((zzxt) obj).zzb(zzyn);
            zzyn.zzdk(i2);
        } else {
            zzyn.zzdk(i2);
            ((zzxt) obj).zzb(zzyn);
            zzyn.zzdj(i2);
        }
    }

    public final int zzvl() {
        int i = this.zzbzt;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzuh.zzd(this.zzceh[i3] >>> 3, (zztq) this.zzccg[i3]);
        }
        this.zzbzt = i2;
        return i2;
    }

    public final int zzth() {
        int i;
        int i2 = this.zzbzt;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i5 = this.zzceh[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzuh.zze(i6, ((Long) this.zzccg[i4]).longValue());
            } else if (i7 == 1) {
                i = zzuh.zzg(i6, ((Long) this.zzccg[i4]).longValue());
            } else if (i7 == 2) {
                i = zzuh.zzc(i6, (zztq) this.zzccg[i4]);
            } else if (i7 == 3) {
                i = (zzuh.zzcz(i6) << 1) + ((zzxt) this.zzccg[i4]).zzth();
            } else if (i7 == 5) {
                i = zzuh.zzp(i6, ((Integer) this.zzccg[i4]).intValue());
            } else {
                throw new IllegalStateException(zzvi.zzts());
            }
            i3 += i;
        }
        this.zzbzt = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxt)) {
            return false;
        }
        zzxt zzxt = (zzxt) obj;
        int i = this.count;
        if (i == zzxt.count) {
            int[] iArr = this.zzceh;
            int[] iArr2 = zzxt.zzceh;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzccg;
                Object[] objArr2 = zzxt.zzccg;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzceh;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzccg;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(StringBuilder sb, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(554345026, oncanceled);
            onCancelLoad.getMin(554345026, oncanceled);
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzwj.zza(sb, i, String.valueOf(this.zzceh[i2] >>> 3), this.zzccg[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i, Object obj) {
        if (this.zzbvj) {
            int i2 = this.count;
            if (i2 == this.zzceh.length) {
                int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
                this.zzceh = Arrays.copyOf(this.zzceh, i3);
                this.zzccg = Arrays.copyOf(this.zzccg, i3);
            }
            int[] iArr = this.zzceh;
            int i4 = this.count;
            iArr[i4] = i;
            this.zzccg[i4] = obj;
            this.count = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
