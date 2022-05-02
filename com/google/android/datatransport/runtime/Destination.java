package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface Destination {
    @Nullable
    byte[] getExtras();

    @NonNull
    String getName();
}
