package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;

final class zzwv implements zzwg {
    private final int flags;
    private final String info;
    private final Object[] zzccg;
    private final zzwi zzccj;

    zzwv(zzwi zzwi, String str, Object[] objArr) {
        this.zzccj = zzwi;
        this.info = str;
        this.zzccg = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.flags = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzus() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzut() {
        return this.zzccg;
    }

    public final zzwi zzum() {
        return this.zzccj;
    }

    public final int zzuk() {
        return (this.flags & 1) == 1 ? zzux.zzf.zzcag : zzux.zzf.zzcah;
    }

    public final boolean zzul() {
        return (this.flags & 2) == 2;
    }
}
