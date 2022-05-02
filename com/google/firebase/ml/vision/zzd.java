package com.google.firebase.ml.vision;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel;
import com.google.firebase.ml.vision.automl.internal.zzb;

final /* synthetic */ class zzd implements ComponentFactory {
    static final ComponentFactory zzaxz = new zzd();

    private zzd() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseModelManager.RemoteModelManagerRegistration(FirebaseAutoMLRemoteModel.class, componentContainer.getProvider(zzb.class));
    }
}
