package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private static ClassLoader zzb = null;
    private static Integer zzc = null;
    private boolean zzd = false;

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    private static ClassLoader zza() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    protected static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzd;
    }

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.zzd = z;
    }

    @KeepForSdk
    protected static boolean canUnparcelSafely(String str) {
        zza();
        return true;
    }
}
