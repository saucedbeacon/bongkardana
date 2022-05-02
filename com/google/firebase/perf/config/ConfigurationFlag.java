package com.google.firebase.perf.config;

import androidx.annotation.Nullable;

abstract class ConfigurationFlag<T> {
    /* access modifiers changed from: protected */
    public abstract T getDefault();

    /* access modifiers changed from: package-private */
    @Nullable
    public String getDeviceCacheFlag() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String getMetadataFlag() {
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String getRemoteConfigFlag() {
        return null;
    }

    ConfigurationFlag() {
    }
}
