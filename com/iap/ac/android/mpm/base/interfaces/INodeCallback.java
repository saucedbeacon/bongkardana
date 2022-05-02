package com.iap.ac.android.mpm.base.interfaces;

import androidx.annotation.NonNull;

public interface INodeCallback<T> {
    void onResult(@NonNull T t);
}
