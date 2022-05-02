package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class zzuh extends zztr {
    private static final Logger logger = Logger.getLogger(zzuh.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzbwg = zzya.zzvn();
    zzuj zzbwh;

    public static int zzaa(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int zzac(long j) {
        return 8;
    }

    public static int zzad(long j) {
        return 8;
    }

    private static long zzae(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzbc(boolean z) {
        return 1;
    }

    public static int zzd(double d) {
        return 8;
    }

    public static int zzdb(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzdd(int i) {
        return 4;
    }

    public static int zzde(int i) {
        return 4;
    }

    private static int zzdh(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzuh zzg(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public static int zzr(float f) {
        return 4;
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zztq zztq) throws IOException;

    public abstract void zza(int i, zzwi zzwi) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, zzwi zzwi, zzxc zzxc) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zzb(int i, zztq zztq) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(zzwi zzwi) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(zztq zztq) throws IOException;

    public abstract void zzch(String str) throws IOException;

    public abstract void zzcv(int i) throws IOException;

    public abstract void zzcw(int i) throws IOException;

    public abstract void zzcy(int i) throws IOException;

    public abstract void zzd(byte b) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i, int i2) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract int zzsj();

    public abstract void zzw(long j) throws IOException;

    public abstract void zzy(long j) throws IOException;

    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzuh.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzuh() {
    }

    public final void zzk(int i, int i2) throws IOException {
        zzj(i, zzdh(i2));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzae(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzl(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzcx(int i) throws IOException {
        zzcw(zzdh(i));
    }

    static class zzb extends zzuh {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = 0;
                    this.position = 0;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void zzh(int i, int i2) throws IOException {
            zzcw((i << 3) | i2);
        }

        public final void zzi(int i, int i2) throws IOException {
            zzh(i, 0);
            zzcv(i2);
        }

        public final void zzj(int i, int i2) throws IOException {
            zzh(i, 0);
            zzcw(i2);
        }

        public final void zzl(int i, int i2) throws IOException {
            zzh(i, 5);
            zzcy(i2);
        }

        public final void zza(int i, long j) throws IOException {
            zzh(i, 0);
            zzw(j);
        }

        public final void zzc(int i, long j) throws IOException {
            zzh(i, 1);
            zzy(j);
        }

        public final void zza(int i, boolean z) throws IOException {
            zzh(i, 0);
            zzd(z ? (byte) 1 : 0);
        }

        public final void zzb(int i, String str) throws IOException {
            zzh(i, 2);
            zzch(str);
        }

        public final void zza(int i, zztq zztq) throws IOException {
            zzh(i, 2);
            zzc(zztq);
        }

        public final void zzc(zztq zztq) throws IOException {
            zzcw(zztq.size());
            zztq.zza(this);
        }

        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzcw(i2);
            write(bArr, 0, i2);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzwi zzwi, zzxc zzxc) throws IOException {
            zzh(i, 2);
            zztj zztj = (zztj) zzwi;
            int zzrt = zztj.zzrt();
            if (zzrt == -1) {
                zzrt = zzxc.zzaa(zztj);
                zztj.zzcm(zzrt);
            }
            zzcw(zzrt);
            zzxc.zza(zzwi, this.zzbwh);
        }

        public final void zza(int i, zzwi zzwi) throws IOException {
            zzh(1, 3);
            zzj(2, i);
            zzh(3, 2);
            zzb(zzwi);
            zzh(1, 4);
        }

        public final void zzb(int i, zztq zztq) throws IOException {
            zzh(1, 3);
            zzj(2, i);
            zza(3, zztq);
            zzh(1, 4);
        }

        public final void zzb(zzwi zzwi) throws IOException {
            zzcw(zzwi.zzth());
            zzwi.zzb(this);
        }

        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzcv(int i) throws IOException {
            if (i >= 0) {
                zzcw(i);
            } else {
                zzw((long) i);
            }
        }

        public final void zzcw(int i) throws IOException {
            if (!zzuh.zzbwg || zztn.zzrx() || zzsj() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzya.zza(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzya.zza(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    zzya.zza(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                zzya.zza(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    zzya.zza(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                zzya.zza(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    zzya.zza(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                zzya.zza(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                zzya.zza(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void zzcy(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzw(long j) throws IOException {
            if (!zzuh.zzbwg || zzsj() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    zzya.zza(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzya.zza(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void zzy(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zzc(byte[] bArr, int i, int i2) throws IOException {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1476057567, oncanceled);
                onCancelLoad.getMin(-1476057567, oncanceled);
            }
            write(bArr, i, i2);
        }

        public final void zzch(String str) throws IOException {
            int i = this.position;
            try {
                int zzdb = zzdb(str.length() * 3);
                int zzdb2 = zzdb(str.length());
                if (zzdb2 == zzdb) {
                    int i2 = i + zzdb2;
                    this.position = i2;
                    int zza = zzyc.zza(str, this.buffer, i2, zzsj());
                    this.position = i;
                    zzcw((zza - i) - zzdb2);
                    this.position = zza;
                    return;
                }
                zzcw(zzyc.zzb(str));
                this.position = zzyc.zza(str, this.buffer, this.position, zzsj());
            } catch (zzyg e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(e2);
            }
        }

        public final int zzsj() {
            return this.limit - this.position;
        }
    }

    public final void zzx(long j) throws IOException {
        zzw(zzae(j));
    }

    public final void zzq(float f) throws IOException {
        zzcy(Float.floatToRawIntBits(f));
    }

    public final void zzc(double d) throws IOException {
        zzy(Double.doubleToRawLongBits(d));
    }

    public final void zzbb(boolean z) throws IOException {
        zzd(z ? (byte) 1 : 0);
    }

    public static int zzm(int i, int i2) {
        return zzcz(i) + zzda(i2);
    }

    public static int zzn(int i, int i2) {
        return zzcz(i) + zzdb(i2);
    }

    public static int zzo(int i, int i2) {
        return zzcz(i) + zzdb(zzdh(i2));
    }

    public static int zzp(int i, int i2) {
        return zzcz(i) + 4;
    }

    public static int zzq(int i, int i2) {
        return zzcz(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzcz(i) + zzaa(j);
    }

    public static int zze(int i, long j) {
        return zzcz(i) + zzaa(j);
    }

    public static int zzf(int i, long j) {
        return zzcz(i) + zzaa(zzae(j));
    }

    public static int zzg(int i, long j) {
        return zzcz(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzcz(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzcz(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzcz(i) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zzcz(i) + 1;
    }

    public static int zzr(int i, int i2) {
        return zzcz(i) + zzda(i2);
    }

    public static int zzc(int i, String str) {
        return zzcz(i) + zzci(str);
    }

    public static int zzc(int i, zztq zztq) {
        int zzcz = zzcz(i);
        int size = zztq.size();
        return zzcz + zzdb(size) + size;
    }

    public static int zza(int i, zzvn zzvn) {
        int zzcz = zzcz(i);
        int zzth = zzvn.zzth();
        return zzcz + zzdb(zzth) + zzth;
    }

    static int zzb(int i, zzwi zzwi, zzxc zzxc) {
        return zzcz(i) + zza(zzwi, zzxc);
    }

    public static int zzb(int i, zzwi zzwi) {
        return (zzcz(1) << 1) + zzn(2, i) + zzcz(3) + zzc(zzwi);
    }

    public static int zzd(int i, zztq zztq) {
        return (zzcz(1) << 1) + zzn(2, i) + zzc(3, zztq);
    }

    public static int zzb(int i, zzvn zzvn) {
        return (zzcz(1) << 1) + zzn(2, i) + zza(3, zzvn);
    }

    public static int zzcz(int i) {
        return zzdb(i << 3);
    }

    public static int zzda(int i) {
        if (i >= 0) {
            return zzdb(i);
        }
        return 10;
    }

    public static int zzdc(int i) {
        return zzdb(zzdh(i));
    }

    public static int zzz(long j) {
        return zzaa(j);
    }

    public static int zzab(long j) {
        return zzaa(zzae(j));
    }

    public static int zzdf(int i) {
        return zzda(i);
    }

    public static int zzci(String str) {
        int i;
        try {
            i = zzyc.zzb(str);
        } catch (zzyg unused) {
            i = str.getBytes(zzva.UTF_8).length;
        }
        return zzdb(i) + i;
    }

    public static int zza(zzvn zzvn) {
        int zzth = zzvn.zzth();
        return zzdb(zzth) + zzth;
    }

    public static int zzd(zztq zztq) {
        int size = zztq.size();
        return zzdb(size) + size;
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzdb(length) + length;
    }

    public static int zzc(zzwi zzwi) {
        int zzth = zzwi.zzth();
        return zzdb(zzth) + zzth;
    }

    static int zza(zzwi zzwi, zzxc zzxc) {
        zztj zztj = (zztj) zzwi;
        int zzrt = zztj.zzrt();
        if (zzrt == -1) {
            zzrt = zzxc.zzaa(zztj);
            zztj.zzcm(zzrt);
        }
        return zzdb(zzrt) + zzrt;
    }

    static int zzdg(int i) {
        return zzdb(i) + i;
    }

    public final void zzsk() {
        if (zzsj() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzyg zzyg) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzyg);
        byte[] bytes = str.getBytes(zzva.UTF_8);
        try {
            zzcw(bytes.length);
            zzc(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zza(e);
        } catch (zza e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzwi zzwi, zzxc zzxc) {
        int zzcz = zzcz(i) << 1;
        zztj zztj = (zztj) zzwi;
        int zzrt = zztj.zzrt();
        if (zzrt == -1) {
            zzrt = zzxc.zzaa(zztj);
            zztj.zzcm(zzrt);
        }
        return zzcz + zzrt;
    }

    @Deprecated
    public static int zzd(zzwi zzwi) {
        return zzwi.zzth();
    }

    @Deprecated
    public static int zzdi(int i) {
        return zzdb(i);
    }
}
