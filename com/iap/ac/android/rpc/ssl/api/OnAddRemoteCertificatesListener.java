package com.iap.ac.android.rpc.ssl.api;

import androidx.annotation.WorkerThread;
import com.iap.ac.android.rpc.ssl.task.RemoteCertificateDownloadPinnerException;

public interface OnAddRemoteCertificatesListener {
    @WorkerThread
    void onFailure(RemoteCertificateDownloadPinnerException remoteCertificateDownloadPinnerException);

    @WorkerThread
    void onSuccess();
}
