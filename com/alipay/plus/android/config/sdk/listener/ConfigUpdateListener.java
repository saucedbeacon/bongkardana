package com.alipay.plus.android.config.sdk.listener;

public interface ConfigUpdateListener {
    void onConfigUpdateFailed(String str, String str2);

    void onConfigUpdateSuccess(long j);
}
