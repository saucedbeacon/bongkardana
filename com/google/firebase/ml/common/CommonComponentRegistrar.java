package com.google.firebase.ml.common;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.firebase_ml.zzmb;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import java.util.List;

@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return zzmb.zza(zzov.zzazj, Component.builder(zzov.zzb.class).add(Dependency.required(Context.class)).factory(zzb.zzaxz).build(), Component.builder(FirebaseModelManager.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(FirebaseModelManager.RemoteModelManagerRegistration.class)).add(Dependency.setOf(FirebaseModelManager.LocalModelManagerRegistration.class)).factory(zza.zzaxz).build());
    }
}
