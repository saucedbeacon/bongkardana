package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zztq implements Serializable, Iterable<Byte> {
    public static final zztq zzbvs = new zzua(zzva.zzcam);
    private static final zztw zzbvt = (zztn.zzrx() ? new zzud((zztt) null) : new zztu((zztt) null));
    private static final Comparator<zztq> zzbvu = new zzts();
    private int zzagd = 0;

    zztq() {
    }

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: package-private */
    public abstract void zza(zztr zztr) throws IOException;

    /* access modifiers changed from: protected */
    public abstract int zzb(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String zzb(Charset charset);

    /* access modifiers changed from: protected */
    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int zzc(int i, int i2, int i3);

    public abstract byte zzcq(int i);

    /* access modifiers changed from: package-private */
    public abstract byte zzcr(int i);

    public abstract zztq zzf(int i, int i2);

    public abstract boolean zzsb();

    /* access modifiers changed from: protected */
    public abstract int zzsc();

    /* access modifiers changed from: protected */
    public abstract boolean zzsd();

    /* renamed from: zzrz */
    public zztz iterator() {
        return new zztt(this);
    }

    public static zztq zzb(byte[] bArr, int i, int i2) {
        zzd(i, i + i2, bArr.length);
        return new zzua(zzbvt.zzd(bArr, i, i2));
    }

    public static zztq zzcg(String str) {
        return new zzua(str.getBytes(zzva.UTF_8));
    }

    public static zztq zzb(InputStream inputStream) throws IOException {
        zztq zztq;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zztq = null;
            } else {
                zztq = zzb(bArr, 0, i2);
            }
            if (zztq == null) {
                break;
            }
            arrayList.add(zztq);
            i = Math.min(i << 1, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return zzbvs;
        }
        return zza(arrayList.iterator(), size);
    }

    private static zztq zza(Iterator<zztq> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            zztq zza = zza(it, i2);
            zztq zza2 = zza(it, i - i2);
            if (Integer.MAX_VALUE - zza.size() >= zza2.size()) {
                return zzwy.zza(zza, zza2);
            }
            int size = zza.size();
            int size2 = zza2.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Deprecated
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzd(0, i3 + 0, size());
        zzd(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, 0, i2, i3);
        }
    }

    public final String zzsa() {
        return size() == 0 ? "" : zzb(zzva.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzagd;
        if (i == 0) {
            int size = size();
            i = zzc(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzagd = i;
        }
        return i;
    }

    static zzty zzcs(int i) {
        return new zzty(i, (zztt) null);
    }

    /* access modifiers changed from: protected */
    public final int zzse() {
        return this.zzagd;
    }

    static void zzg(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    static int zzd(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
