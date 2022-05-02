package com.alipay.plus.android.config.sdk.listener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSONObject;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;

public interface IAnyCommonConfigListener {
    @WorkerThread
    void onConfigChanged(@Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);
}
