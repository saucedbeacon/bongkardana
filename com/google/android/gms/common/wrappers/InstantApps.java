package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean isInstantApp(android.content.Context r3) {
        /*
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = zza     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r2 = zzb     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x001b
            android.content.Context r2 = zza     // Catch:{ all -> 0x004f }
            if (r2 != r1) goto L_0x001b
            java.lang.Boolean r3 = zzb     // Catch:{ all -> 0x004f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)
            return r3
        L_0x001b:
            r2 = 0
            zzb = r2     // Catch:{ all -> 0x004f }
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0033
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ all -> 0x004f }
            boolean r3 = r3.isInstantApp()     // Catch:{ all -> 0x004f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004f }
            zzb = r3     // Catch:{ all -> 0x004f }
            goto L_0x0045
        L_0x0033:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r3.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0041 }
            zzb = r3     // Catch:{ ClassNotFoundException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004f }
            zzb = r3     // Catch:{ all -> 0x004f }
        L_0x0045:
            zza = r1     // Catch:{ all -> 0x004f }
            java.lang.Boolean r3 = zzb     // Catch:{ all -> 0x004f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)
            return r3
        L_0x004f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.wrappers.InstantApps.isInstantApp(android.content.Context):boolean");
    }
}
