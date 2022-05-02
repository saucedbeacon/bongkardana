package com.alibaba.griver.core.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.griver.base.api.APWebResourceRequest;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.nebula.H5ResourceCORSUtil;
import com.alibaba.griver.base.nebula.H5Utils;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import o.putByteArrayDDpEx;

class j extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private APWebView f10392a;
    private APWebViewClient b;
    private long c;
    private int d = H5Utils.getUid(GriverEnv.getApplicationContext());

    j(APWebView aPWebView, APWebViewClient aPWebViewClient) {
        this.b = aPWebViewClient;
        this.f10392a = aPWebView;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        APWebViewClient aPWebViewClient = this.b;
        return aPWebViewClient != null && aPWebViewClient.shouldOverrideUrlLoading(this.f10392a, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.b != null) {
            this.c = a();
            this.b.onPageStarted(this.f10392a, str, bitmap);
        }
    }

    private long a() {
        try {
            return TrafficStats.getUidRxBytes(this.d);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.b != null) {
            this.b.onPageFinished(this.f10392a, str, a() - this.c);
        }
    }

    public void onLoadResource(WebView webView, String str) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onLoadResource(this.f10392a, str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            return aPWebViewClient.shouldInterceptRequest(this.f10392a, str);
        }
        return null;
    }

    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String cORSUrl;
        if (this.b == null) {
            return null;
        }
        WebResourceResponse shouldInterceptRequest = this.b.shouldInterceptRequest(this.f10392a, (APWebResourceRequest) new h(webResourceRequest));
        if (shouldInterceptRequest == null) {
            return shouldInterceptRequest;
        }
        String obj = webResourceRequest.getUrl().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("Cache-Control", putByteArrayDDpEx.CACHE_CONTROL_NO_CACHE);
        String pageUrl = this.b.getPageUrl();
        if (!(pageUrl == null || !H5ResourceCORSUtil.needAddHeader(obj) || (cORSUrl = H5ResourceCORSUtil.getCORSUrl(pageUrl)) == null)) {
            hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, cORSUrl);
        }
        String cORSUrl2 = H5ResourceCORSUtil.getCORSUrl(pageUrl);
        if (!hashMap.containsKey(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN) && !TextUtils.isEmpty(obj) && H5Utils.containNebulaAddcors(obj) && !TextUtils.isEmpty(pageUrl) && !TextUtils.isEmpty(cORSUrl2)) {
            hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, cORSUrl2);
        }
        if (!hashMap.containsKey(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN) && H5Utils.addChooseImageCrossOrigin(obj) && !TextUtils.isEmpty(pageUrl) && !TextUtils.isEmpty(cORSUrl2)) {
            hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, cORSUrl2);
        }
        shouldInterceptRequest.setResponseHeaders(hashMap);
        return shouldInterceptRequest;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onReceivedError(this.f10392a, i, str, str2);
        }
    }

    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (this.b != null) {
            this.b.onReceivedHttpError(this.f10392a, webResourceResponse != null ? webResourceResponse.getStatusCode() : 0, webResourceRequest != null ? webResourceRequest.getUrl().toString() : "");
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onFormResubmission(this.f10392a, message, message2);
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.doUpdateVisitedHistory(this.f10392a, str, z);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onReceivedSslError(this.f10392a, new d(sslErrorHandler), new c(0, (SslCertificate) null, sslError));
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onReceivedHttpAuthRequest(this.f10392a, new b(httpAuthHandler), str, str2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        APWebViewClient aPWebViewClient = this.b;
        return aPWebViewClient != null && aPWebViewClient.shouldOverrideKeyEvent(this.f10392a, keyEvent);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        APWebView aPWebView = this.f10392a;
        if (aPWebView != null) {
            this.b.onUnhandledKeyEvent(aPWebView, keyEvent);
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        APWebViewClient aPWebViewClient = this.b;
        if (aPWebViewClient != null) {
            aPWebViewClient.onScaleChanged(this.f10392a, f, f2);
        }
    }
}
