package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.PayResult;

public interface IPayCallback {
    void onResult(@NonNull PayResult payResult);
}
