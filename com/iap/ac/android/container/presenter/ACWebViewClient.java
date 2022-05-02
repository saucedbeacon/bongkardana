package com.iap.ac.android.container.presenter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.common.container.constant.ContainerEventAction;
import com.iap.ac.android.common.container.event.ContainerEvent;
import com.iap.ac.android.common.container.provider.ReceivedSslErrorHandler;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.BuildConfig;
import com.iap.ac.android.container.R;
import com.iap.ac.android.container.activity.ACContainerActivity;
import com.iap.ac.android.container.constant.LogEventKeys;
import com.iap.ac.android.container.constant.LogEventName;
import com.iap.ac.android.container.js.ACJSBridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ACWebViewClient extends WebViewClient {
    private static final String TAG = "ACWebViewClient";
    private ACContainerPresenter containerPresenter;
    private ACContainerActivity mContext;
    private WebView mWebView;
    @VisibleForTesting
    Map<String, Long> pageStartTime = new HashMap();

    public ACWebViewClient(@NonNull ACContainerActivity aCContainerActivity, @NonNull WebView webView, @NonNull ACContainerPresenter aCContainerPresenter) {
        this.mContext = aCContainerActivity;
        this.mWebView = webView;
        this.containerPresenter = aCContainerPresenter;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder("onPageStarted: url = ");
        sb.append(str);
        sb.append(", view.getUrl() = ");
        sb.append(webView.getUrl());
        ACLog.d(TAG, sb.toString());
        String url = webView.getUrl();
        this.pageStartTime.put(url, Long.valueOf(System.currentTimeMillis()));
        if (!onPageEvent(url, ContainerEventAction.ACTION_WEB_PAGE_STARTED)) {
            super.onPageStarted(webView, url, bitmap);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        boolean z;
        StringBuilder sb = new StringBuilder("onPageFinished: url = ");
        sb.append(str);
        sb.append(", view.getUrl() = ");
        sb.append(webView.getUrl());
        ACLog.d(TAG, sb.toString());
        String url = webView.getUrl();
        HashMap hashMap = new HashMap();
        try {
            ACJSBridge.getInstance().loadJavascript(R.raw.h5_bridge, this.mContext, this.mWebView);
            z = true;
        } catch (Exception e) {
            ACLog.e(TAG, "loadJavascript error", e);
            z = false;
            if (e instanceof IOException) {
                hashMap.put(LogEventKeys.ERROR_CODE, "1002");
            } else {
                hashMap.put(LogEventKeys.ERROR_CODE, "1006");
            }
            hashMap.put(LogEventKeys.ERROR_MSG, e.getMessage());
        }
        hashMap.put("url", url);
        hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
        if (z) {
            hashMap.put("status", DiskFormatter.TB);
        } else {
            hashMap.put("status", "F");
        }
        ACMonitor.logEvent(new LogEvent(LogEventName.LOAD_JS_BRIDGE, hashMap));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", url);
        hashMap2.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
        ACMonitor.logEvent(new LogEvent(LogEventName.PV, hashMap2));
        Long l = this.pageStartTime.get(url);
        if (l != null && l.longValue() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis() - l.longValue());
            hashMap2.put("duration", sb2.toString());
            LogEvent logEvent = new LogEvent(LogEventName.PAGE_LOAD_SUCCESS, hashMap2);
            this.pageStartTime.remove(url);
            ACMonitor.logEvent(logEvent);
        }
        if (!onPageEvent(url, ContainerEventAction.ACTION_WEB_PAGE_FINISHED)) {
            super.onPageFinished(webView, url);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        reportPageLoadFail(str2, sb.toString());
    }

    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String str = "";
        String obj = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? str : webResourceRequest.getUrl().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(webResourceError.getErrorCode());
        String obj2 = sb.toString();
        if (webResourceError.getDescription() != null) {
            str = webResourceError.getDescription().toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj2);
        sb2.append(": ");
        sb2.append(str);
        reportPageLoadFail(obj, sb2.toString());
    }

    @RequiresApi(api = 21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String obj = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(webResourceResponse.getStatusCode());
        String obj2 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj2);
        sb2.append(": ");
        sb2.append("onReceivedHttpError");
        reportPageLoadFail(obj, sb2.toString());
    }

    private void reportPageLoadFail(String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        Long l = this.pageStartTime.get(str);
        if (l == null || l.longValue() <= 0) {
            str3 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis() - l.longValue());
            str3 = sb.toString();
        }
        hashMap.put("duration", str3);
        this.pageStartTime.remove(str);
        hashMap.put(LogEventKeys.ERROR_CODE, "1007");
        hashMap.put(LogEventKeys.ERROR_MSG, str2);
        hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
        ACMonitor.logEvent(new LogEvent(LogEventName.PAGE_LOAD_FAIL, hashMap));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21 || webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        StringBuilder sb = new StringBuilder("shouldOverrideUrlLoading: url = ");
        sb.append(str);
        sb.append(", view.getUrl() = ");
        sb.append(webView.getUrl());
        ACLog.d(TAG, sb.toString());
        if (TextUtils.isEmpty(str)) {
            ACLog.w(TAG, "shouldOverrideUrlLoading return false because url is empty!");
            return false;
        } else if (!onPageEvent(str, ContainerEventAction.ACTION_WEB_PAGE_SHOULD_OVERRIDE_URL)) {
            try {
                if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file:///android_asset/")) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (this.mContext != null) {
                        this.mContext.startActivity(intent);
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
            ACMonitor.logEvent(new LogEvent(LogEventName.OVERRIDE_URL_LOADING, hashMap));
            return true;
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        ACLog.w(TAG, "onReceivedSslError...");
        if (!handleSslError(webView, sslErrorHandler, sslError)) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    private boolean handleSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        ReceivedSslErrorHandler receivedSslErrorHandler = (ReceivedSslErrorHandler) ACContainer.INSTANCE.getProvider(ReceivedSslErrorHandler.class.getName());
        if (receivedSslErrorHandler == null) {
            return false;
        }
        receivedSslErrorHandler.onReceivedSslError(new ACWebView(webView), new ACSslErrorHandler(sslErrorHandler), sslError);
        return true;
    }

    private boolean onPageEvent(String str, String str2) {
        ContainerEvent containerEvent = new ContainerEvent(str2, this.containerPresenter);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
        } catch (JSONException e) {
            ACLog.e(TAG, "interceptPageEvent: params put url error", e);
        }
        containerEvent.params = jSONObject;
        boolean z = ACContainer.INSTANCE.handleContainerEvent(containerEvent) || ACContainer.INSTANCE.interceptContainerEvent(containerEvent);
        HashMap hashMap = new HashMap();
        hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
        hashMap.put("eventname", str2);
        ACMonitor.logEvent(new LogEvent(LogEventName.EVENT_HANDLED, hashMap));
        return z;
    }
}
