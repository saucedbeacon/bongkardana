package com.alibaba.griver.core.render;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebResourceResponse;
import com.alibaba.griver.base.api.APHttpAuthHandler;
import com.alibaba.griver.base.api.APSslErrorHandler;
import com.alibaba.griver.base.api.APWebResourceRequest;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.NXH5WebViewClientAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i implements NXH5WebViewClientAdapter {

    /* renamed from: a  reason: collision with root package name */
    private d f10339a;

    public String getRedirectUrl() {
        return "";
    }

    public String getShareUrl() {
        return "";
    }

    public boolean hasPageStartButNoInterceptRequest() {
        return true;
    }

    public i(d dVar) {
        this.f10339a = dVar;
    }

    public String getPageUrl() {
        return this.f10339a.getPageUrl();
    }

    public boolean shouldOverrideUrlLoading(APWebView aPWebView, String str) {
        return this.f10339a.shouldOverrideUrlLoading(aPWebView, str);
    }

    public void onPageStarted(APWebView aPWebView, String str, Bitmap bitmap) {
        this.f10339a.onPageStarted(aPWebView, str, bitmap);
    }

    public void onPageFinished(APWebView aPWebView, String str, long j) {
        this.f10339a.onPageFinished(aPWebView, str, j);
    }

    public void onLoadResource(APWebView aPWebView, String str) {
        this.f10339a.onLoadResource(aPWebView, str);
    }

    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, APWebResourceRequest aPWebResourceRequest) {
        return this.f10339a.shouldInterceptRequest(aPWebView, aPWebResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, String str) {
        return this.f10339a.shouldInterceptRequest(aPWebView, str);
    }

    public void onTooManyRedirects(APWebView aPWebView, Message message, Message message2) {
        this.f10339a.onTooManyRedirects(aPWebView, message, message2);
    }

    public void onReceivedError(APWebView aPWebView, int i, String str, String str2) {
        this.f10339a.onReceivedError(aPWebView, i, str, str2);
    }

    public void onReceivedHttpError(APWebView aPWebView, int i, String str) {
        this.f10339a.onReceivedHttpError(aPWebView, i, str);
    }

    public boolean shouldInterceptResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        return this.f10339a.shouldInterceptResponse(aPWebView, hashMap);
    }

    public void onWebViewEvent(APWebView aPWebView, int i, Object obj) {
        this.f10339a.onWebViewEvent(aPWebView, i, obj);
    }

    public void onFirstVisuallyRender(APWebView aPWebView) {
        this.f10339a.onFirstVisuallyRender(aPWebView);
    }

    public void onFormResubmission(APWebView aPWebView, Message message, Message message2) {
        this.f10339a.onFormResubmission(aPWebView, message, message2);
    }

    public void doUpdateVisitedHistory(APWebView aPWebView, String str, boolean z) {
        this.f10339a.doUpdateVisitedHistory(aPWebView, str, z);
    }

    public void onReceivedSslError(APWebView aPWebView, APSslErrorHandler aPSslErrorHandler, SslError sslError) {
        this.f10339a.onReceivedSslError(aPWebView, aPSslErrorHandler, sslError);
    }

    public void onReceivedHttpAuthRequest(APWebView aPWebView, APHttpAuthHandler aPHttpAuthHandler, String str, String str2) {
        this.f10339a.onReceivedHttpAuthRequest(aPWebView, aPHttpAuthHandler, str, str2);
    }

    public boolean shouldOverrideKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
        return this.f10339a.shouldOverrideKeyEvent(aPWebView, keyEvent);
    }

    public void onUnhandledKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
        this.f10339a.onUnhandledKeyEvent(aPWebView, keyEvent);
    }

    public void onScaleChanged(APWebView aPWebView, float f, float f2) {
        this.f10339a.onScaleChanged(aPWebView, f, f2);
    }

    public void onReceivedLoginRequest(APWebView aPWebView, String str, String str2, String str3) {
        this.f10339a.onReceivedLoginRequest(aPWebView, str, str2, str2);
    }

    public String getJSBridge() {
        return this.f10339a.getJSBridge();
    }

    public void onResourceResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        this.f10339a.onResourceResponse(aPWebView, hashMap);
    }

    public void onResourceFinishLoad(APWebView aPWebView, String str, long j) {
        this.f10339a.onResourceFinishLoad(aPWebView, str, j);
    }

    public void onReceivedResponseHeader(Map<String, List<String>> map) {
        this.f10339a.onReceivedResponseHeader(map);
    }

    public boolean shouldOverrideUrlLoadingForUC(APWebView aPWebView, String str, int i) {
        return this.f10339a.shouldOverrideUrlLoadingForUC(aPWebView, str, i);
    }

    public Map getRequestMap() {
        return this.f10339a.getRequestMap();
    }
}
