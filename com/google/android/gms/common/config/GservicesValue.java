package com.google.android.gms.common.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    private static zza zzd = null;
    private static int zze = 0;
    private static Context zzf;
    @GuardedBy("lock")
    private static Set<String> zzg;
    protected final String zza;
    protected final T zzb;
    private T zzh = null;

    interface zza {
        Boolean zza(String str, Boolean bool);

        Float zza(String str, Float f);

        Integer zza(String str, Integer num);

        Long zza(String str, Long l);

        String zza(String str, String str2);
    }

    private static boolean zza() {
        synchronized (zzc) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract T zza(String str);

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    protected GservicesValue(String str, T t) {
        this.zza = str;
        this.zzb = t;
    }

    @KeepForSdk
    @VisibleForTesting
    public void override(T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzh = t;
        synchronized (zzc) {
            zza();
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public void resetOverride() {
        this.zzh = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3 = zza(r4.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003b, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0022 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get() {
        /*
            r4 = this;
            T r0 = r4.zzh
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = zzc
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = zzc
            monitor-enter(r2)
            r1 = 0
            zzg = r1     // Catch:{ all -> 0x003c }
            zzf = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r4.zza     // Catch:{ SecurityException -> 0x0022 }
            java.lang.Object r1 = r4.zza(r1)     // Catch:{ SecurityException -> 0x0022 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0020:
            r1 = move-exception
            goto L_0x0038
        L_0x0022:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = r4.zza     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ all -> 0x0033 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0020 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x0033:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0020 }
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0038:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.GservicesValue.get():java.lang.Object");
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z) {
        return new zzb(str, Boolean.valueOf(z));
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l) {
        return new zza(str, l);
    }

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzd(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f) {
        return new zzc(str, f);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }
}
