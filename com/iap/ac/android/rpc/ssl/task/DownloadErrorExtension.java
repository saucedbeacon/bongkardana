package com.iap.ac.android.rpc.ssl.task;

public class DownloadErrorExtension {
    public static DownloadError createNetworkIAPError() {
        return new DownloadError("AE01015120000002", "Network error occurs");
    }

    public static DownloadError createCertificateParsingError() {
        return new DownloadError("AE01015120000007", "Certificate file parsing failed, is this file encoded in PEM or DER format?");
    }

    public static DownloadError createSQLError() {
        return new DownloadError("AE01015120000008", "SQL Error occurs when the certificate is being saved");
    }
}
