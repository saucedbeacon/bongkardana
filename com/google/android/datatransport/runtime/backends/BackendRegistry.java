package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;

public interface BackendRegistry {
    @Nullable
    TransportBackend get(String str);
}
