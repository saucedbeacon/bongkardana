package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzld {
    zzld() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzlc zzlc = (zzlc) obj;
        zzlb zzlb = (zzlb) obj2;
        if (zzlc.isEmpty()) {
            return 0;
        }
        Iterator it = zzlc.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlc zzlc = (zzlc) obj;
        zzlc zzlc2 = (zzlc) obj2;
        if (!zzlc2.isEmpty()) {
            if (!zzlc.zze()) {
                zzlc = zzlc.zzc();
            }
            zzlc.zzb(zzlc2);
        }
        return zzlc;
    }
}
