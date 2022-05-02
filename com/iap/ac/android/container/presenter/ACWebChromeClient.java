package com.iap.ac.android.container.presenter;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.js.ACJSBridge;

public class ACWebChromeClient extends WebChromeClient {
    private static final String TAG = "ACWebChromeClient";
    private ACContainerPresenter containerPresenter;
    private WebView mWebView;

    public ACWebChromeClient(@NonNull WebView webView, @NonNull ACContainerPresenter aCContainerPresenter) {
        this.mWebView = webView;
        this.containerPresenter = aCContainerPresenter;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ACLog.d(TAG, "onProgressChanged: ".concat(String.valueOf(i)));
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        ACLog.d(TAG, "onReceivedTitle: ".concat(String.valueOf(str)));
        ACContainerPresenter aCContainerPresenter = this.containerPresenter;
        if (aCContainerPresenter != null) {
            aCContainerPresenter.setTitle(str);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        StringBuilder sb = new StringBuilder("onConsoleMessage msg: ");
        sb.append(consoleMessage.message());
        ACLog.d(TAG, sb.toString());
        if (consoleMessage.message().startsWith(ACJSBridge.JSAPI_PREFIX)) {
            return ACJSBridge.getInstance().handleMsgFromJs(consoleMessage.message(), this.mWebView, this.containerPresenter);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
