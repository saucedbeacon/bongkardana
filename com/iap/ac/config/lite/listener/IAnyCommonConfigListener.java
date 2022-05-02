package com.iap.ac.config.lite.listener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import org.json.JSONObject;

public interface IAnyCommonConfigListener {
    @WorkerThread
    void onConfigChanged(@Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);
}
