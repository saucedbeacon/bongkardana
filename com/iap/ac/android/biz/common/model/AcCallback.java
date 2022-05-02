package com.iap.ac.android.biz.common.model;

import com.iap.ac.android.biz.common.model.AcBaseResult;

public interface AcCallback<T extends AcBaseResult> {
    void onResult(T t);
}
