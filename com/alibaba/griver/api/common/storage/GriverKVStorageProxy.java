package com.alibaba.griver.api.common.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface GriverKVStorageProxy extends Proxiable {
    void clear(String str, String str2);

    String getString(@Nullable String str, @Nullable String str2, @NonNull String str3);

    void putString(@Nullable String str, @Nullable String str2, @NonNull String str3, String str4);

    void remove(@Nullable String str, @Nullable String str2, @NonNull String str3);
}
