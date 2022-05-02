package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

class zzjb extends zzja {
    protected final byte[] zza;

    zzjb(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjd) || zzc() != ((zzjd) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzjb)) {
            return obj.equals(this);
        }
        zzjb zzjb = (zzjb) obj;
        int zzm = zzm();
        int zzm2 = zzjb.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzjb.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc > zzjb.zzc()) {
            int zzc3 = zzjb.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzjb instanceof zzjb)) {
            return zzjb.zze(0, zzc).equals(zze(0, zzc));
        } else {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzjb.zza;
            zzjb.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public int zzd() {
        return 0;
    }

    public final zzjd zze(int i, int i2) {
        int zzn = zzn(0, i2, zzc());
        if (zzn == 0) {
            return zzjd.zzb;
        }
        return new zziy(this.zza, 0, zzn);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zziu zziu) throws IOException {
        ((zzji) zziu).zzp(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzh() {
        return zzmw.zzb(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        return zzkl.zzh(i, this.zza, 0, i3);
    }
}
