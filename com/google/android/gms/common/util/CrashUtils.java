package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static DropBoxManager zzb = null;
    private static boolean zzc = false;
    private static int zzd = -1;
    @GuardedBy("CrashUtils.class")
    private static int zze = 0;
    @GuardedBy("CrashUtils.class")
    private static int zzf = 0;

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th) {
        return zza(context, th, C.ENCODING_PCM_A_LAW);
    }

    private static boolean zza(Context context, Throwable th, int i) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
