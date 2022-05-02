package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

final class zzfb extends zzez {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzsk;
    private int zzsl;
    private int zzsm;
    private int zzsn;
    private int zzso;

    private zzfb(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzso = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzsm = i;
        this.zzsk = z;
    }

    public final int zzdq() throws IOException {
        if (zzcm()) {
            this.zzsn = 0;
            return 0;
        }
        int zzdt = zzdt();
        this.zzsn = zzdt;
        if ((zzdt >>> 3) != 0) {
            return zzdt;
        }
        throw zzgf.zzfk();
    }

    public final void zzak(int i) throws zzgf {
        if (this.zzsn != i) {
            throw zzgf.zzfl();
        }
    }

    public final boolean zzal(int i) throws IOException {
        int zzdq;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzgf.zzfj();
            }
            while (i3 < 10) {
                if (zzdy() < 0) {
                    i3++;
                }
            }
            throw zzgf.zzfj();
            return true;
        } else if (i2 == 1) {
            zzap(8);
            return true;
        } else if (i2 == 2) {
            zzap(zzdt());
            return true;
        } else if (i2 == 3) {
            do {
                zzdq = zzdq();
                if (zzdq == 0 || !zzal(zzdq)) {
                    zzak(((i >>> 3) << 3) | 4);
                }
                zzdq = zzdq();
                break;
            } while (!zzal(zzdq));
            zzak(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzap(4);
                return true;
            }
            throw zzgf.zzfm();
        }
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzdw());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzdv());
    }

    public final long zzcp() throws IOException {
        return zzdu();
    }

    public final long zzcq() throws IOException {
        return zzdu();
    }

    public final int zzcr() throws IOException {
        return zzdt();
    }

    public final long zzcs() throws IOException {
        return zzdw();
    }

    public final int zzct() throws IOException {
        return zzdv();
    }

    public final boolean zzcu() throws IOException {
        return zzdu() != 0;
    }

    public final String readString() throws IOException {
        int zzdt = zzdt();
        if (zzdt > 0 && zzdt <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzdt, zzga.UTF_8);
            this.pos += zzdt;
            return str;
        } else if (zzdt == 0) {
            return "";
        } else {
            if (zzdt < 0) {
                throw zzgf.zzfi();
            }
            throw zzgf.zzfh();
        }
    }

    public final String zzcv() throws IOException {
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzdt <= i - i2) {
                String zzi = zziw.zzi(this.buffer, i2, zzdt);
                this.pos += zzdt;
                return zzi;
            }
        }
        if (zzdt == 0) {
            return "";
        }
        if (zzdt <= 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }

    public final <T extends zzhf> T zza(zzhq<T> zzhq, zzfk zzfk) throws IOException {
        int zzdt = zzdt();
        if (this.zzsf < this.zzsg) {
            int zzan = zzan(zzdt);
            this.zzsf++;
            T t = (zzhf) zzhq.zza(this, zzfk);
            zzak(0);
            this.zzsf--;
            zzao(zzan);
            return t;
        }
        throw zzgf.zzfn();
    }

    public final zzeo zzcw() throws IOException {
        byte[] bArr;
        int zzdt = zzdt();
        if (zzdt > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzdt <= i - i2) {
                zzeo zzb = zzeo.zzb(this.buffer, i2, zzdt);
                this.pos += zzdt;
                return zzb;
            }
        }
        if (zzdt == 0) {
            return zzeo.zzrx;
        }
        if (zzdt > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzdt <= i3 - i4) {
                int i5 = zzdt + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzeo.zze(bArr);
            }
        }
        if (zzdt > 0) {
            throw zzgf.zzfh();
        } else if (zzdt == 0) {
            bArr = zzga.zzxn;
            return zzeo.zze(bArr);
        } else {
            throw zzgf.zzfi();
        }
    }

    public final int zzcx() throws IOException {
        return zzdt();
    }

    public final int zzcy() throws IOException {
        return zzdt();
    }

    public final int zzcz() throws IOException {
        return zzdv();
    }

    public final long zzda() throws IOException {
        return zzdw();
    }

    public final int zzdb() throws IOException {
        return zzaq(zzdt());
    }

    public final long zzdc() throws IOException {
        return zzd(zzdu());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzdt() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.pos = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.pos = r1
            return r0
        L_0x006b:
            long r0 = r5.zzdr()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdt():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzdu() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.pos
            int r1 = r11.limit
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.pos = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r1 = r1 ^ r3
            r2 = r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r3 = r3 ^ r5
        L_0x006e:
            r2 = r3
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x006e
        L_0x00b3:
            r1 = r0
            goto L_0x006e
        L_0x00b5:
            r11.pos = r1
            return r2
        L_0x00b8:
            long r0 = r11.zzdr()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfb.zzdu():long");
    }

    /* access modifiers changed from: package-private */
    public final long zzdr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzdy = zzdy();
            j |= ((long) (zzdy & Byte.MAX_VALUE)) << i;
            if ((zzdy & 128) == 0) {
                return j;
            }
        }
        throw zzgf.zzfj();
    }

    private final int zzdv() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
        }
        throw zzgf.zzfh();
    }

    private final long zzdw() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzgf.zzfh();
    }

    public final int zzan(int i) throws zzgf {
        if (i >= 0) {
            int zzds = i + zzds();
            int i2 = this.zzso;
            if (zzds <= i2) {
                this.zzso = zzds;
                zzdx();
                return i2;
            }
            throw zzgf.zzfh();
        }
        throw zzgf.zzfi();
    }

    private final void zzdx() {
        int i = this.limit + this.zzsl;
        this.limit = i;
        int i2 = i - this.zzsm;
        int i3 = this.zzso;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzsl = i4;
            this.limit = i - i4;
            return;
        }
        this.zzsl = 0;
    }

    public final void zzao(int i) {
        this.zzso = i;
        zzdx();
    }

    public final boolean zzcm() throws IOException {
        return this.pos == this.limit;
    }

    public final int zzds() {
        return this.pos - this.zzsm;
    }

    private final byte zzdy() throws IOException {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzgf.zzfh();
    }

    public final void zzap(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzgf.zzfi();
        }
        throw zzgf.zzfh();
    }
}
