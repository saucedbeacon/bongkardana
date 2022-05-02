package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zziw implements Comparator<zzjd> {
    zziw() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjd zzjd = (zzjd) obj;
        zzjd zzjd2 = (zzjd) obj2;
        zziv zziv = new zziv(zzjd);
        zziv zziv2 = new zziv(zzjd2);
        while (zziv.hasNext() && zziv2.hasNext()) {
            int compare = Integer.compare(zziv.zza() & 255, zziv2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzjd.zzc(), zzjd2.zzc());
    }
}
