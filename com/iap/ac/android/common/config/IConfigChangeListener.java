package com.iap.ac.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

public interface IConfigChangeListener {
    void onConfigChanged(@NonNull String str, @Nullable Object obj);

    void onSectionConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject);
}
