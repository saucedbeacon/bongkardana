package com.google.android.gms.internal.firebase_ml;

import java.util.Comparator;

final class zzts implements Comparator<zztq> {
    zzts() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zztq zztq = (zztq) obj;
        zztq zztq2 = (zztq) obj2;
        zztz zztz = (zztz) zztq.iterator();
        zztz zztz2 = (zztz) zztq2.iterator();
        while (zztz.hasNext() && zztz2.hasNext()) {
            int compare = Integer.compare(zztq.zzb(zztz.nextByte()), zztq.zzb(zztz2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zztq.size(), zztq2.size());
    }
}
