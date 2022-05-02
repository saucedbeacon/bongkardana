package com.google.firebase.iid;

import androidx.annotation.NonNull;

@Deprecated
public interface InstanceIdResult {
    @NonNull
    String getId();

    @NonNull
    String getToken();
}
