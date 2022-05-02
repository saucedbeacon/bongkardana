package com.iap.ac.config.lite.listener.sectionconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import org.json.JSONObject;

public interface ISectionConfigListener {
    @WorkerThread
    void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);
}
