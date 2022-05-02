package com.google.firebase.ml.vision;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.firebase_ml.zzmb;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.ml.vision.automl.internal.zzb;
import java.util.List;

@KeepForSdk
public class VisionRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return zzmb.zza(Component.builder(FirebaseVision.class).add(Dependency.required(FirebaseApp.class)).factory(zzb.zzaxz).build(), Component.builder(zzb.class).add(Dependency.required(FirebaseApp.class)).factory(zza.zzaxz).build(), Component.intoSetBuilder(FirebaseModelManager.RemoteModelManagerRegistration.class).add(Dependency.requiredProvider(zzb.class)).factory(zzd.zzaxz).build(), Component.intoSetBuilder(FirebaseModelManager.LocalModelManagerRegistration.class).add(Dependency.requiredProvider(zzb.class)).factory(zzc.zzaxz).build());
    }
}
