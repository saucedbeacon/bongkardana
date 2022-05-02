package com.alibaba.griver.api.common.network;

import androidx.annotation.Nullable;

public interface DownloadCallback {
    void onCancel(String str);

    void onFailed(String str, int i, String str2);

    void onFinish(@Nullable String str);

    void onPrepare(String str);

    void onProgress(String str, int i);
}
