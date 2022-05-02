package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzih extends AbstractSet<Map.Entry<String, Object>> {
    private final /* synthetic */ zzic zzach;

    zzih(zzic zzic) {
        this.zzach = zzic;
    }

    public final int size() {
        int i = 0;
        for (String zzal : this.zzach.zzwv.zzabn) {
            if (this.zzach.zzwv.zzal(zzal).zzh(this.zzach.object) != null) {
                i++;
            }
        }
        return i;
    }

    public final void clear() {
        for (String zzal : this.zzach.zzwv.zzabn) {
            this.zzach.zzwv.zzal(zzal).zzb(this.zzach.object, (Object) null);
        }
    }

    public final boolean isEmpty() {
        for (String zzal : this.zzach.zzwv.zzabn) {
            if (this.zzach.zzwv.zzal(zzal).zzh(this.zzach.object) != null) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzie(this.zzach);
    }
}
