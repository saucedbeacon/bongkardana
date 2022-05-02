package com.alipay.imobile.network.sslpinning.api;

import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.errorcode.IAPException;

public class RemoteCertificateDownloadException extends IAPException {
    public RemoteCertificateDownloadException(IAPError iAPError, String str, Throwable th) {
        super(iAPError, str, th);
    }

    public static RemoteCertificateDownloadException newInstance(IAPError iAPError, Throwable th) {
        return new RemoteCertificateDownloadException(iAPError, iAPError.errorMessage, th);
    }
}
