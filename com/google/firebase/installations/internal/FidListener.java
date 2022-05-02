package com.google.firebase.installations.internal;

import androidx.annotation.NonNull;

public interface FidListener {
    void onFidChanged(@NonNull String str);
}
