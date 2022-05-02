package com.iap.ac.android.acs.multilanguage.callback;

import androidx.annotation.NonNull;
import java.util.Map;

public interface OnFetchCallback {
    void onFetchOnError(@NonNull String str, @NonNull String str2);

    void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map);
}
