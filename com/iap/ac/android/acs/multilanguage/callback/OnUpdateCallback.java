package com.iap.ac.android.acs.multilanguage.callback;

import androidx.annotation.NonNull;

public interface OnUpdateCallback {
    void onUpdateFinish();

    void onUpdateOnError(@NonNull String str, @NonNull String str2);
}
