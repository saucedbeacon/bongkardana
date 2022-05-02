package com.google.firebase.ml.vision;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.ml.vision.automl.internal.zzb;

final /* synthetic */ class zza implements ComponentFactory {
    static final ComponentFactory zzaxz = new zza();

    private zza() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new zzb((FirebaseApp) componentContainer.get(FirebaseApp.class));
    }
}
