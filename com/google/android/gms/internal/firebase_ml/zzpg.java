package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;

final /* synthetic */ class zzpg implements FirebaseAppLifecycleListener {
    private final String zzazy;

    zzpg(String str) {
        this.zzazy = str;
    }

    public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
        zzph.zza(this.zzazy, str, firebaseOptions);
    }
}
