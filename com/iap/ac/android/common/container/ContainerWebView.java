package com.iap.ac.android.common.container;

import android.net.http.SslCertificate;
import java.util.Map;

public interface ContainerWebView {
    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    void clearHistory();

    void clearSslPreferences();

    SslCertificate getCertificate();

    String getOriginalUrl();

    String getTitle();

    String getUrl();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void postUrl(String str, byte[] bArr);

    void reload();

    void stopLoading();
}
