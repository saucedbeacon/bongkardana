package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {
    public FirebaseRemoteConfigException(@NonNull String str) {
        super(str);
    }

    public FirebaseRemoteConfigException(@NonNull String str, @Nullable Throwable th) {
        super(str, th);
    }
}
