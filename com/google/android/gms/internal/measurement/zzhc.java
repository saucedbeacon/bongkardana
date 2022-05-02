package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzhc {
    public static <V> V zza(zzhd<V> zzhd) {
        long clearCallingIdentity;
        try {
            return zzhd.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = zzhd.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
