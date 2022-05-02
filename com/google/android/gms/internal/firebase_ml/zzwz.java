package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzwz implements Iterator<zzub> {
    private final ArrayDeque<zzwy> zzcdl;
    private zzub zzcdm;

    private zzwz(zztq zztq) {
        if (zztq instanceof zzwy) {
            zzwy zzwy = (zzwy) zztq;
            ArrayDeque<zzwy> arrayDeque = new ArrayDeque<>(zzwy.zzsc());
            this.zzcdl = arrayDeque;
            arrayDeque.push(zzwy);
            this.zzcdm = zzf(zzwy.zzcdh);
            return;
        }
        this.zzcdl = null;
        this.zzcdm = (zzub) zztq;
    }

    private final zzub zzf(zztq zztq) {
        while (zztq instanceof zzwy) {
            zzwy zzwy = (zzwy) zztq;
            this.zzcdl.push(zzwy);
            zztq = zzwy.zzcdh;
        }
        return (zzub) zztq;
    }

    public final boolean hasNext() {
        return this.zzcdm != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        zzub zzub;
        boolean z;
        zzub zzub2 = this.zzcdm;
        if (zzub2 != null) {
            while (true) {
                ArrayDeque<zzwy> arrayDeque = this.zzcdl;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    zzub = zzf(this.zzcdl.pop().zzcdi);
                    if (zzub.size() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    zzub = null;
                }
            }
            zzub = null;
            this.zzcdm = zzub;
            return zzub2;
        }
        throw new NoSuchElementException();
    }

    /* synthetic */ zzwz(zztq zztq, zzwx zzwx) {
        this(zztq);
    }
}
