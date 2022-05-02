package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@KeepForSdk
public final class GmsLogger {
    private static final int zza = 15;
    @Nullable
    private static final String zzb = null;
    private final String zzc;
    @Nullable
    private final String zzd;

    public GmsLogger(String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzc = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzd = null;
        } else {
            this.zzd = str2;
        }
    }

    @KeepForSdk
    public final boolean canLogPii() {
        return false;
    }

    public GmsLogger(String str) {
        this(str, (String) null);
    }

    @KeepForSdk
    public final boolean canLog(int i) {
        return Log.isLoggable(this.zzc, i);
    }

    @KeepForSdk
    public final void d(String str, String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void v(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-969548697, oncanceled);
            onCancelLoad.getMin(-969548697, oncanceled);
        }
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void i(String str, String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void w(String str, String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            zza(str2, objArr);
        }
    }

    @KeepForSdk
    public final void e(String str, String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            zza(str2, objArr);
        }
    }

    @KeepForSdk
    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            zza(str2);
            zza(str2);
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2) {
        if (canLogPii()) {
            zza(str2);
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2, Throwable th) {
        if (canLogPii()) {
            zza(str2);
        }
    }

    private final String zza(String str) {
        String str2 = this.zzd;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    private final String zza(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzd;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }
}
