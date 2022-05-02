package com.google.firebase.ml.vision;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.ml.vision.automl.FirebaseAutoMLLocalModel;
import com.google.firebase.ml.vision.automl.internal.zzb;

final /* synthetic */ class zzc implements ComponentFactory {
    static final ComponentFactory zzaxz = new zzc();

    private zzc() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager.LocalModelManagerRegistration(FirebaseAutoMLLocalModel.class, componentContainer.getProvider(zzb.class));
    }
}
