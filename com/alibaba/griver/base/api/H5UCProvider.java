package com.alibaba.griver.base.api;

import android.content.res.Configuration;
import androidx.annotation.WorkerThread;

public interface H5UCProvider {
    boolean cannotInitUC();

    boolean enableUCCorePreheadInit();

    String getUCCoreDownloadUrl();

    String getUCSdkVersion();

    String getWebViewCoreSoPath();

    @WorkerThread
    boolean isUcUnzipped();

    boolean notifyConfigurationChanged(Configuration configuration);

    void setUCCoreDownloadUrl(String str);
}
