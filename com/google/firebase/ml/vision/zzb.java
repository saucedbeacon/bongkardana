package com.google.firebase.ml.vision;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final /* synthetic */ class zzb implements ComponentFactory {
    static final ComponentFactory zzaxz = new zzb();

    private zzb() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseVision((FirebaseApp) componentContainer.get(FirebaseApp.class));
    }
}
