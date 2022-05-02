package com.google.android.gms.measurement.internal;

import java.util.Map;

final /* synthetic */ class zzhy implements Runnable {
    private final zzhz zza;
    private final int zzb;
    private final Exception zzc;
    private final byte[] zzd;
    private final Map zze;

    zzhy(zzhz zzhz, int i, Exception exc, byte[] bArr, Map map) {
        this.zza = zzhz;
        this.zzb = i;
        this.zzc = exc;
        this.zzd = bArr;
        this.zze = map;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
