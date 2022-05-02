package com.iap.ac.android.biz.acs;

import androidx.annotation.WorkerThread;
import org.json.JSONObject;

public interface IMiniProgramDecodeCallback {
    @WorkerThread
    void dismissLoading();

    @WorkerThread
    void onResult(JSONObject jSONObject);

    @WorkerThread
    void showLoading();
}
