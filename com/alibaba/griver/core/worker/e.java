package com.alibaba.griver.core.worker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.alibaba.griver.base.api.APJsPromptResult;
import com.alibaba.griver.base.api.APJsResult;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebView;

public class e implements APWebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private c f10418a;

    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    public View getVideoLoadingProgressView() {
        return null;
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(APWebView aPWebView) {
    }

    public boolean onCreateWindow(APWebView aPWebView, boolean z, boolean z2, Message message) {
        return false;
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(APWebView aPWebView, String str, String str2, APJsResult aPJsResult) {
        return false;
    }

    public boolean onJsBeforeUnload(APWebView aPWebView, String str, String str2, APJsResult aPJsResult) {
        return false;
    }

    public boolean onJsConfirm(APWebView aPWebView, String str, String str2, APJsResult aPJsResult) {
        return false;
    }

    public boolean onJsPrompt(APWebView aPWebView, String str, String str2, String str3, APJsPromptResult aPJsPromptResult) {
        return false;
    }

    public void onProgressChanged(APWebView aPWebView, int i) {
    }

    public void onReceivedIcon(APWebView aPWebView, Bitmap bitmap) {
    }

    public void onReceivedTitle(APWebView aPWebView, String str) {
    }

    public void onReceivedTouchIconUrl(APWebView aPWebView, String str, boolean z) {
    }

    public void onRequestFocus(APWebView aPWebView) {
    }

    public void onShowCustomView(View view, APWebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
    }

    public void openFileChooser(ValueCallback valueCallback, boolean z) {
    }

    public e(c cVar) {
        this.f10418a = cVar;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.f10418a.m().c(consoleMessage.message());
        return false;
    }
}
