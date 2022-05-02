package com.google.firebase.ml.common;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;

final /* synthetic */ class zza implements ComponentFactory {
    static final ComponentFactory zzaxz = new zza();

    private zza() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.setOf(FirebaseModelManager.RemoteModelManagerRegistration.class), componentContainer.setOf(FirebaseModelManager.LocalModelManagerRegistration.class));
    }
}
