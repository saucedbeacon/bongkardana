package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;

@KeepForSdk
public interface RemoteModelManagerInterface<TRemote extends FirebaseRemoteModel> {
    @NonNull
    Task<Void> downloadRemoteModelIfNeeded(@NonNull TRemote tremote);

    boolean registerRemoteModel(@NonNull TRemote tremote);
}
