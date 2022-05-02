package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

class zzua extends zzub {
    protected final byte[] bytes;

    zzua(byte[] bArr) {
        if (bArr != null) {
            this.bytes = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public int zzsf() {
        return 0;
    }

    public byte zzcq(int i) {
        return this.bytes[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzcr(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    public final zztq zzf(int i, int i2) {
        int zzd = zzd(i, i2, size());
        if (zzd == 0) {
            return zztq.zzbvs;
        }
        return new zztx(this.bytes, zzsf() + i, zzd);
    }

    /* access modifiers changed from: protected */
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zztr zztr) throws IOException {
        zztr.zzc(this.bytes, zzsf(), size());
    }

    /* access modifiers changed from: protected */
    public final String zzb(Charset charset) {
        return new String(this.bytes, zzsf(), size(), charset);
    }

    public final boolean zzsb() {
        int zzsf = zzsf();
        return zzyc.zzf(this.bytes, zzsf, size() + zzsf);
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i, int i2, int i3) {
        int zzsf = zzsf() + i2;
        return zzyc.zzb(i, this.bytes, zzsf, i3 + zzsf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztq) || size() != ((zztq) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzua)) {
            return obj.equals(this);
        }
        zzua zzua = (zzua) obj;
        int zzse = zzse();
        int zzse2 = zzua.zzse();
        if (zzse == 0 || zzse2 == 0 || zzse == zzse2) {
            return zza(zzua, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zztq zztq, int i, int i2) {
        if (i2 <= zztq.size()) {
            int i3 = i + i2;
            if (i3 > zztq.size()) {
                int size = zztq.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(zztq instanceof zzua)) {
                return zztq.zzf(i, i3).equals(zzf(0, i2));
            } else {
                zzua zzua = (zzua) zztq;
                byte[] bArr = this.bytes;
                byte[] bArr2 = zzua.bytes;
                int zzsf = zzsf() + i2;
                int zzsf2 = zzsf();
                int zzsf3 = zzua.zzsf() + i;
                while (zzsf2 < zzsf) {
                    if (bArr[zzsf2] != bArr2[zzsf3]) {
                        return false;
                    }
                    zzsf2++;
                    zzsf3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final int zzc(int i, int i2, int i3) {
        return zzva.zza(i, this.bytes, zzsf() + i2, i3);
    }
}
