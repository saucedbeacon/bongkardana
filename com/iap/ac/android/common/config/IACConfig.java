package com.iap.ac.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public interface IACConfig {
    void addCommonConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener);

    void addSectionConfigChangeListener(String str, IConfigChangeListener iConfigChangeListener);

    boolean getBoolean(@NonNull String str, boolean z);

    double getDouble(@NonNull String str, double d);

    int getInt(@NonNull String str, int i);

    JSONArray getJSONArrayConfig(@NonNull String str);

    JSONObject getJSONConfig(@NonNull String str);

    long getLong(@NonNull String str, long j);

    JSONObject getSectionConfig(@NonNull String str);

    String getString(@NonNull String str);

    void refreshByKeys(@NonNull String str, @NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback);

    void refreshByKeys(@NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigRefreshCallback configRefreshCallback);

    void refreshConfig(@Nullable Map<String, Object> map, boolean z);

    void removeAllConfigChangeListener();

    void removeConfiChangeListener(IConfigChangeListener iConfigChangeListener);
}
