package com.google.android.gms.internal.common;

import java.io.Serializable;

public final class zzn {
    public static <T> zzo<T> zza(zzo<T> zzo) {
        if ((zzo instanceof zzp) || (zzo instanceof zzq)) {
            return zzo;
        }
        if (zzo instanceof Serializable) {
            return new zzq(zzo);
        }
        return new zzp(zzo);
    }
}
