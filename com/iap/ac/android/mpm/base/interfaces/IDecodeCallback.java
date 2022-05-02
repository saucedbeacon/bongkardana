package com.iap.ac.android.mpm.base.interfaces;

import androidx.annotation.WorkerThread;
import com.iap.ac.android.biz.common.model.Result;

public interface IDecodeCallback {
    @WorkerThread
    void dismissLoading();

    @WorkerThread
    void onResult(Result result);

    @WorkerThread
    void showLoading();
}
