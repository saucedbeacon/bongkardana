package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.ml.common.modeldownload.FirebaseLocalModel;

@KeepForSdk
public interface LocalModelManagerInterface<TLocal extends FirebaseLocalModel> {
    boolean registerLocalModel(@NonNull TLocal tlocal);
}
