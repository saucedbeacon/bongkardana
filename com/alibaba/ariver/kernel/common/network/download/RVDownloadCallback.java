package com.alibaba.ariver.kernel.common.network.download;

import androidx.annotation.Nullable;

public interface RVDownloadCallback {
    void onCancel(String str);

    void onFailed(String str, int i, String str2);

    void onFinish(@Nullable String str);

    void onPrepare(String str);

    void onProgress(String str, int i);
}
