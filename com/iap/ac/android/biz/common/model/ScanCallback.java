package com.iap.ac.android.biz.common.model;

public interface ScanCallback {
    void onFailure(ScanErrorCode scanErrorCode, String str);

    void onSuccess(String str);
}
