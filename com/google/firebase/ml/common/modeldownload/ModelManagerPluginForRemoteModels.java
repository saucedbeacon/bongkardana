package com.google.firebase.ml.common.modeldownload;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

@KeepForSdk
public interface ModelManagerPluginForRemoteModels {
    Task<Void> downloadRemoteModelIfNeeded(FirebaseRemoteModel firebaseRemoteModel);

    boolean registerRemoteModel(FirebaseRemoteModel firebaseRemoteModel);
}
