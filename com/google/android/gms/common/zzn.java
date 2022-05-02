package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzn extends zzl {
    private final Callable<String> zzb;

    private zzn(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        try {
            return this.zzb.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
