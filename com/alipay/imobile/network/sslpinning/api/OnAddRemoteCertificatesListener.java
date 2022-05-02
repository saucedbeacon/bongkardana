package com.alipay.imobile.network.sslpinning.api;

import androidx.annotation.WorkerThread;

public interface OnAddRemoteCertificatesListener {
    @WorkerThread
    void onFailure(RemoteCertificateDownloadException remoteCertificateDownloadException);

    @WorkerThread
    void onSuccess();
}
