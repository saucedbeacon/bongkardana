package com.iap.ac.android.rpc.ssl.task;

public class RemoteCertificateDownloadPinnerException extends Exception {
    private DownloadError error;

    public RemoteCertificateDownloadPinnerException(DownloadError downloadError) {
        this.error = downloadError;
    }

    public RemoteCertificateDownloadPinnerException(DownloadError downloadError, String str) {
        super(str);
        this.error = downloadError;
    }

    public RemoteCertificateDownloadPinnerException(DownloadError downloadError, String str, Throwable th) {
        super(str, th);
        this.error = downloadError;
    }

    public static RemoteCertificateDownloadPinnerException newInstance(DownloadError downloadError, Throwable th) {
        return new RemoteCertificateDownloadPinnerException(downloadError, downloadError.errorMessage, th);
    }

    public DownloadError getError() {
        return this.error;
    }
}
