package com.google.android.gms.internal.measurement;

import android.os.Build;

public final class zzgw {
    private static volatile boolean zza = (!zza());

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
