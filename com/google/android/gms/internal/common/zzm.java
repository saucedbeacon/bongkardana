package com.google.android.gms.internal.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

public final class zzm {
    private static volatile boolean zza = (!zza());
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzb = false;

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @RequiresApi(24)
    @TargetApi(24)
    public static Context zza(Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }
}
