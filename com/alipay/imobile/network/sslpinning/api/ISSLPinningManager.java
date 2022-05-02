package com.alipay.imobile.network.sslpinning.api;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

@TargetApi(17)
public interface ISSLPinningManager {
    public static final int PINNING_MODE_CERTIFICATE = 1;
    public static final int PINNING_MODE_NONE = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PinningMode {
    }

    void addAndPersistRemoteCertificates(@NonNull List<String> list, @Nullable OnAddRemoteCertificatesListener onAddRemoteCertificatesListener);

    void addCertificates(@NonNull List<String> list) throws CertificateException, IOException;

    @NonNull
    List<Certificate> getCertificates();

    void setPinningMode(int i);

    void setPresetCertificateFolderPath(@NonNull String str);

    void validateCertificates(@NonNull HttpsURLConnection httpsURLConnection) throws SSLException;
}
