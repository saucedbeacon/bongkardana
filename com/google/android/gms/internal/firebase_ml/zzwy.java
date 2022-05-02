package com.google.android.gms.internal.firebase_ml;

import com.alibaba.wireless.security.SecExceptionCode;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzwy extends zztq {
    static final int[] zzcdf = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, SecExceptionCode.SEC_ERROR_SIGNATURE_INCORRECT_DATA_FILE_DATA, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzcdg;
    /* access modifiers changed from: private */
    public final zztq zzcdh;
    /* access modifiers changed from: private */
    public final zztq zzcdi;
    private final int zzcdj;
    private final int zzcdk;

    private zzwy(zztq zztq, zztq zztq2) {
        this.zzcdh = zztq;
        this.zzcdi = zztq2;
        int size = zztq.size();
        this.zzcdj = size;
        this.zzcdg = size + zztq2.size();
        this.zzcdk = Math.max(zztq.zzsc(), zztq2.zzsc()) + 1;
    }

    static zztq zza(zztq zztq, zztq zztq2) {
        if (zztq2.size() == 0) {
            return zztq;
        }
        if (zztq.size() == 0) {
            return zztq2;
        }
        int size = zztq.size() + zztq2.size();
        if (size < 128) {
            return zzb(zztq, zztq2);
        }
        if (zztq instanceof zzwy) {
            zzwy zzwy = (zzwy) zztq;
            if (zzwy.zzcdi.size() + zztq2.size() < 128) {
                return new zzwy(zzwy.zzcdh, zzb(zzwy.zzcdi, zztq2));
            } else if (zzwy.zzcdh.zzsc() > zzwy.zzcdi.zzsc() && zzwy.zzsc() > zztq2.zzsc()) {
                return new zzwy(zzwy.zzcdh, new zzwy(zzwy.zzcdi, zztq2));
            }
        }
        if (size >= zzcdf[Math.max(zztq.zzsc(), zztq2.zzsc()) + 1]) {
            return new zzwy(zztq, zztq2);
        }
        return new zzxa((zzwx) null).zzc(zztq, zztq2);
    }

    private static zztq zzb(zztq zztq, zztq zztq2) {
        int size = zztq.size();
        int size2 = zztq2.size();
        byte[] bArr = new byte[(size + size2)];
        zztq.zza(bArr, 0, 0, size);
        zztq2.zza(bArr, 0, size, size2);
        return new zzua(bArr);
    }

    public final byte zzcq(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1959045657, oncanceled);
            onCancelLoad.getMin(1959045657, oncanceled);
        }
        zzg(i, this.zzcdg);
        return zzcr(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzcr(int i) {
        int i2 = this.zzcdj;
        if (i < i2) {
            return this.zzcdh.zzcr(i);
        }
        return this.zzcdi.zzcr(i - i2);
    }

    public final int size() {
        return this.zzcdg;
    }

    public final zztz zzrz() {
        return new zzwx(this);
    }

    /* access modifiers changed from: protected */
    public final int zzsc() {
        return this.zzcdk;
    }

    /* access modifiers changed from: protected */
    public final boolean zzsd() {
        return this.zzcdg >= zzcdf[this.zzcdk];
    }

    public final zztq zzf(int i, int i2) {
        int zzd = zzd(i, i2, this.zzcdg);
        if (zzd == 0) {
            return zztq.zzbvs;
        }
        if (zzd == this.zzcdg) {
            return this;
        }
        int i3 = this.zzcdj;
        if (i2 <= i3) {
            return this.zzcdh.zzf(i, i2);
        }
        if (i >= i3) {
            return this.zzcdi.zzf(i - i3, i2 - i3);
        }
        zztq zztq = this.zzcdh;
        return new zzwy(zztq.zzf(i, zztq.size()), this.zzcdi.zzf(0, i2 - this.zzcdj));
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzcdj;
        if (i4 <= i5) {
            this.zzcdh.zzb(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zzcdi.zzb(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzcdh.zzb(bArr, i, i2, i6);
            this.zzcdi.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zztr zztr) throws IOException {
        this.zzcdh.zza(zztr);
        this.zzcdi.zza(zztr);
    }

    /* access modifiers changed from: protected */
    public final String zzb(Charset charset) {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = zzva.zzcam;
        } else {
            byte[] bArr2 = new byte[size];
            zzb(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    public final boolean zzsb() {
        int zzb = this.zzcdh.zzb(0, 0, this.zzcdj);
        zztq zztq = this.zzcdi;
        if (zztq.zzb(zzb, 0, zztq.size()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzcdj;
        if (i4 <= i5) {
            return this.zzcdh.zzb(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzcdi.zzb(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzcdi.zzb(this.zzcdh.zzb(i, i2, i6), 0, i3 - i6);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztq)) {
            return false;
        }
        zztq zztq = (zztq) obj;
        if (this.zzcdg != zztq.size()) {
            return false;
        }
        if (this.zzcdg == 0) {
            return true;
        }
        int zzse = zzse();
        int zzse2 = zztq.zzse();
        if (zzse != 0 && zzse2 != 0 && zzse != zzse2) {
            return false;
        }
        zzwz zzwz = new zzwz(this, (zzwx) null);
        zzub zzub = (zzub) zzwz.next();
        zzwz zzwz2 = new zzwz(zztq, (zzwx) null);
        zzub zzub2 = (zzub) zzwz2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = zzub.size() - i;
            int size2 = zzub2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = zzub.zza(zzub2, i2, min);
            } else {
                z = zzub2.zza(zzub, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzcdg;
            if (i3 < i4) {
                if (min == size) {
                    zzub = (zzub) zzwz.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    zzub2 = (zzub) zzwz2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int zzc(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzcdj;
        if (i4 <= i5) {
            return this.zzcdh.zzc(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzcdi.zzc(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzcdi.zzc(this.zzcdh.zzc(i, i2, i6), 0, i3 - i6);
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* synthetic */ zzwy(zztq zztq, zztq zztq2, zzwx zzwx) {
        this(zztq, zztq2);
    }
}
