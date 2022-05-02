package com.iap.ac.android.container.adapter.appcontainer;

import android.net.http.SslCertificate;
import androidx.annotation.NonNull;
import com.alipay.mobile.nebula.webview.APWebView;
import com.iap.ac.android.common.container.ContainerWebView;
import java.util.Map;

public class AppContainerWebView implements ContainerWebView {
    private APWebView mWebView;

    AppContainerWebView(@NonNull APWebView aPWebView) {
        this.mWebView = aPWebView;
    }

    public SslCertificate getCertificate() {
        return this.mWebView.getCertificate();
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.mWebView.loadUrl(str, map);
    }

    public void loadUrl(String str) {
        this.mWebView.loadUrl(str);
    }

    public void postUrl(String str, byte[] bArr) {
        this.mWebView.postUrl(str, bArr);
    }

    public void loadData(String str, String str2, String str3) {
        this.mWebView.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.mWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void stopLoading() {
        this.mWebView.stopLoading();
    }

    public void reload() {
        this.mWebView.reload();
    }

    public boolean canGoBack() {
        return this.mWebView.canGoBack();
    }

    public void goBack() {
        this.mWebView.goBack();
    }

    public boolean canGoForward() {
        return this.mWebView.canGoForward();
    }

    public void goForward() {
        this.mWebView.goForward();
    }

    public boolean canGoBackOrForward(int i) {
        return this.mWebView.canGoBackOrForward(i);
    }

    public void goBackOrForward(int i) {
        this.mWebView.goBackOrForward(i);
    }

    public boolean pageUp(boolean z) {
        return this.mWebView.pageUp(z);
    }

    public boolean pageDown(boolean z) {
        return this.mWebView.pageDown(z);
    }

    public String getUrl() {
        return this.mWebView.getUrl();
    }

    public String getOriginalUrl() {
        return this.mWebView.getOriginalUrl();
    }

    public String getTitle() {
        return this.mWebView.getTitle();
    }

    public void clearHistory() {
        this.mWebView.clearHistory();
    }

    public void clearSslPreferences() {
        this.mWebView.clearSslPreferences();
    }
}
