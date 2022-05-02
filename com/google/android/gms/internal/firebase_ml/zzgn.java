package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class zzgn {
    static final Logger zzye = Logger.getLogger(zzgn.class.getName());
    private static final String[] zzyf;

    /* access modifiers changed from: protected */
    public abstract zzgm zzc(String str, String str2) throws IOException;

    public final zzgh zza(zzgg zzgg) {
        return new zzgh(this, zzgg);
    }

    public boolean zzag(String str) throws IOException {
        return Arrays.binarySearch(zzyf, str) >= 0;
    }

    static {
        String[] strArr = {FirebasePerformance.HttpMethod.DELETE, "GET", "POST", FirebasePerformance.HttpMethod.PUT};
        zzyf = strArr;
        Arrays.sort(strArr);
    }
}
