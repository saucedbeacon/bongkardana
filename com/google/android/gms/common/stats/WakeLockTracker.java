package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.zza;
import java.util.Arrays;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@KeepForSdk
public class WakeLockTracker {
    private static WakeLockTracker zza = new WakeLockTracker();
    private static Boolean zzb;
    @VisibleForTesting
    private static boolean zzc = false;

    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i, String str4) {
        Intent intent2 = intent;
        Context context2 = context;
        registerEvent(context2, intent.getStringExtra(LoggingConstants.EXTRA_WAKE_LOCK_KEY), 7, str, str2, str3, i, Arrays.asList(new String[]{str4}));
    }

    @KeepForSdk
    public void registerReleaseEvent(Context context, Intent intent) {
        registerEvent(context, intent.getStringExtra(LoggingConstants.EXTRA_WAKE_LOCK_KEY), 8, (String) null, (String) null, (String) null, 0, (List<String>) null);
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        registerEvent(context, str, i, str2, str3, str4, i2, list, 0);
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(-344125641, oncanceled);
                onCancelLoad.getMin(-344125641, oncanceled);
            }
        }
        if (!zza() || TextUtils.isEmpty(str)) {
            return;
        }
        if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
            WakeLockEvent wakeLockEvent = r1;
            WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, StatsUtils.zza(list), str, SystemClock.elapsedRealtime(), zza.zza(context), str3, StatsUtils.zza(context.getPackageName()), zza.zzb(context), j, str4, false);
            zza(context, wakeLockEvent);
        }
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i, List<String> list, boolean z, long j) {
        if (zza()) {
            Context context2 = context;
            zza(context2, new WakeLockEvent(System.currentTimeMillis(), 16, str, i, StatsUtils.zza(list), (String) null, j, zza.zza(context), str2, StatsUtils.zza(context.getPackageName()), zza.zzb(context), 0, str3, z));
        }
    }

    private static void zza(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(LoggingConstants.zza).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception unused) {
        }
    }

    private static boolean zza() {
        if (zzb == null) {
            zzb = Boolean.FALSE;
        }
        return zzb.booleanValue();
    }
}
