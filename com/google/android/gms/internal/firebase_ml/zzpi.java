package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzov;

public final class zzpi implements zzov.zzb {
    private static final GmsLogger zzayb = new GmsLogger("MlStatsLogger", "");
    private final ClearcutLogger zzbab;

    public zzpi(Context context) {
        this.zzbab = ClearcutLogger.anonymousLogger(context, "FIREBASE_ML_SDK");
    }

    public final void zza(zzmn.zzaa zzaa) {
        GmsLogger gmsLogger = zzayb;
        String valueOf = String.valueOf(zzaa);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Logging FirebaseMlSdkLogEvent ");
        sb.append(valueOf);
        gmsLogger.d("MlStatsLogger", sb.toString());
        this.zzbab.newEvent(zzaa.toByteArray()).log();
    }
}
