package com.alipay.plus.android.config.sdk.listener.sectionconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSONObject;

public interface ISectionConfigListener {
    @WorkerThread
    void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);
}
