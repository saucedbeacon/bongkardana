package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zzxa {
    private final ArrayDeque<zztq> zzcdn;

    private zzxa() {
        this.zzcdn = new ArrayDeque<>();
    }

    /* access modifiers changed from: private */
    public final zztq zzc(zztq zztq, zztq zztq2) {
        zzg(zztq);
        zzg(zztq2);
        zztq pop = this.zzcdn.pop();
        while (!this.zzcdn.isEmpty()) {
            pop = new zzwy(this.zzcdn.pop(), pop, (zzwx) null);
        }
        return pop;
    }

    private final void zzg(zztq zztq) {
        while (!zztq.zzsd()) {
            if (zztq instanceof zzwy) {
                zzwy zzwy = (zzwy) zztq;
                zzg(zzwy.zzcdh);
                zztq = zzwy.zzcdi;
            } else {
                String valueOf = String.valueOf(zztq.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzdt = zzdt(zztq.size());
        int i = zzwy.zzcdf[zzdt + 1];
        if (this.zzcdn.isEmpty() || this.zzcdn.peek().size() >= i) {
            this.zzcdn.push(zztq);
            return;
        }
        int i2 = zzwy.zzcdf[zzdt];
        zztq pop = this.zzcdn.pop();
        while (!this.zzcdn.isEmpty() && this.zzcdn.peek().size() < i2) {
            pop = new zzwy(this.zzcdn.pop(), pop, (zzwx) null);
        }
        zzwy zzwy2 = new zzwy(pop, zztq, (zzwx) null);
        while (!this.zzcdn.isEmpty()) {
            if (this.zzcdn.peek().size() >= zzwy.zzcdf[zzdt(zzwy2.size()) + 1]) {
                break;
            }
            zzwy2 = new zzwy(this.zzcdn.pop(), zzwy2, (zzwx) null);
        }
        this.zzcdn.push(zzwy2);
    }

    private static int zzdt(int i) {
        int binarySearch = Arrays.binarySearch(zzwy.zzcdf, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzxa(zzwx zzwx) {
        this();
    }
}
