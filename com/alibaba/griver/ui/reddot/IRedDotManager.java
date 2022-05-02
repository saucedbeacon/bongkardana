package com.alibaba.griver.ui.reddot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IRedDotManager {
    void registerNode(@NonNull String str, @Nullable String str2);

    void removeNode(@NonNull String str);

    void removeStateDidChangeHandler(@NonNull String str);

    void resetState(@NonNull String str, boolean z);

    void setStateDidChangeHandler(@NonNull String str, @NonNull OnStateChangeListener onStateChangeListener);
}
