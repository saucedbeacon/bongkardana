package com.alibaba.griver.core.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.alibaba.griver.base.api.APJsPromptResult;
import com.alibaba.griver.base.api.APJsResult;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.nebula.DynamicProxy;

class f extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private APWebView f10386a;
    private APWebChromeClient b;

    f(APWebView aPWebView, APWebChromeClient aPWebChromeClient) {
        this.f10386a = aPWebView;
        this.b = aPWebChromeClient;
    }

    public void onProgressChanged(WebView webView, int i) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onProgressChanged(this.f10386a, i);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onReceivedTitle(this.f10386a, str);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onReceivedIcon(this.f10386a, bitmap);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onReceivedTouchIconUrl(this.f10386a, str, z);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onShowCustomView(view, (APWebChromeClient.CustomViewCallback) DynamicProxy.dynamicProxy(APWebChromeClient.CustomViewCallback.class, customViewCallback));
        }
    }

    public void onHideCustomView() {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onHideCustomView();
        }
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return this.b.onCreateWindow(this.f10386a, z, z2, message);
    }

    public void onRequestFocus(WebView webView) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onRequestFocus(this.f10386a);
        }
    }

    public void onCloseWindow(WebView webView) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onCloseWindow(this.f10386a);
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsAlert(this.f10386a, str, str2, (APJsResult) DynamicProxy.dynamicProxy(APJsResult.class, jsResult));
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsConfirm(this.f10386a, str, str2, (APJsResult) DynamicProxy.dynamicProxy(APJsResult.class, jsResult));
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.b.onJsPrompt(this.f10386a, str, str2, str3, (APJsPromptResult) DynamicProxy.dynamicProxy(APJsPromptResult.class, jsPromptResult));
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsBeforeUnload(this.f10386a, str, str2, (APJsResult) DynamicProxy.dynamicProxy(APJsResult.class, jsResult));
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onGeolocationPermissionsShowPrompt(str, (GeolocationPermissions.Callback) DynamicProxy.dynamicProxy(GeolocationPermissions.Callback.class, callback));
        }
    }

    public void onGeolocationPermissionsHidePrompt() {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.onGeolocationPermissionsHidePrompt();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        APWebChromeClient aPWebChromeClient = this.b;
        return aPWebChromeClient != null && aPWebChromeClient.onConsoleMessage(new ConsoleMessage(consoleMessage.message(), consoleMessage.sourceId(), consoleMessage.lineNumber(), ConsoleMessage.MessageLevel.valueOf(consoleMessage.messageLevel().name())));
    }

    public Bitmap getDefaultVideoPoster() {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            return aPWebChromeClient.getDefaultVideoPoster();
        }
        return null;
    }

    public View getVideoLoadingProgressView() {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            return aPWebChromeClient.getVideoLoadingProgressView();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.webkit.ValueCallback<java.lang.String[]>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> r3) {
        /*
            r2 = this;
            com.alibaba.griver.base.api.APWebChromeClient r0 = r2.b
            java.lang.Class<android.webkit.ValueCallback> r1 = android.webkit.ValueCallback.class
            java.lang.Object r3 = com.alibaba.griver.base.nebula.DynamicProxy.dynamicProxy(r1, r3)
            android.webkit.ValueCallback r3 = (android.webkit.ValueCallback) r3
            r0.getVisitedHistory(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.webview.f.getVisitedHistory(android.webkit.ValueCallback):void");
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.openFileChooser(valueCallback, str, (String) null);
        }
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            aPWebChromeClient.openFileChooser(valueCallback, str, str2);
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        APWebChromeClient aPWebChromeClient = this.b;
        if (aPWebChromeClient != null) {
            return aPWebChromeClient.onShowFileChooser(valueCallback, fileChooserParams);
        }
        return false;
    }
}
