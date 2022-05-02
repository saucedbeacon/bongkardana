package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

final class zzb implements Callable<String> {
    final /* synthetic */ FirebaseAnalytics zza;

    zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Nullable
    public final /* synthetic */ Object call() throws Exception {
        return this.zza.zzb.zzF();
    }
}
