package com.alibaba.griver.core.render;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.permission.api.RVFlag;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.stauts.PageStatus;
import com.alibaba.griver.api.webview.GriverWebViewReceivedErrorExtension;
import com.alibaba.griver.api.webview.H5ErrorCode;
import com.alibaba.griver.api.webview.PageAbnormalPoint;
import com.alibaba.griver.api.webview.PageErrorPoint;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.api.APHttpAuthHandler;
import com.alibaba.griver.base.api.APSslErrorHandler;
import com.alibaba.griver.base.api.APWebResourceRequest;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import com.alibaba.griver.base.api.ShouldLoadUrlPoint;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorManager;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import com.alibaba.griver.base.nebula.H5Utils;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverWhiteScreenStageMonitor;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d extends WebViewClient implements APWebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Page f10323a;
    private long b;
    private String c;
    private Map<String, m> d;
    private boolean e = false;
    private boolean f = false;

    public void doUpdateVisitedHistory(APWebView aPWebView, String str, boolean z) {
    }

    public String getJSBridge() {
        return null;
    }

    public String getPageUrl() {
        return null;
    }

    public Map getRequestMap() {
        return null;
    }

    public void onFirstVisuallyRender(APWebView aPWebView) {
    }

    public void onFormResubmission(APWebView aPWebView, Message message, Message message2) {
    }

    public void onLoadResource(APWebView aPWebView, String str) {
    }

    public void onReceivedHttpAuthRequest(APWebView aPWebView, APHttpAuthHandler aPHttpAuthHandler, String str, String str2) {
    }

    public void onReceivedLoginRequest(APWebView aPWebView, String str, String str2, String str3) {
    }

    public void onReceivedResponseHeader(Map<String, List<String>> map) {
    }

    public void onReceivedSslError(APWebView aPWebView, APSslErrorHandler aPSslErrorHandler, SslError sslError) {
    }

    public void onResourceFinishLoad(APWebView aPWebView, String str, long j) {
    }

    public void onScaleChanged(APWebView aPWebView, float f2, float f3) {
    }

    public void onTooManyRedirects(APWebView aPWebView, Message message, Message message2) {
    }

    public void onUnhandledKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
    }

    public boolean shouldInterceptResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        return false;
    }

    public boolean shouldOverrideKeyEvent(APWebView aPWebView, KeyEvent keyEvent) {
        return false;
    }

    public boolean shouldOverrideUrlLoadingForUC(APWebView aPWebView, String str, int i) {
        return false;
    }

    public d(Page page) {
        this.f10323a = page;
        this.d = new HashMap();
    }

    private boolean a(String str) {
        return ExtensionPoint.as(ShouldLoadUrlPoint.class).node(this.f10323a).defaultValue(Boolean.TRUE).resolve(new ResultResolver<Boolean>() {
            /* renamed from: a */
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.isEmpty()) {
                    return Boolean.TRUE;
                }
                int i = 0;
                while (i < list.size()) {
                    Boolean bool = list.get(i);
                    if (bool == null || bool.booleanValue()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("shouldLoad false in index ");
                        sb.append(i);
                        sb.append(" !!!");
                        RVLogger.w("GriverWebViewClient", sb.toString());
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }).create().shouldLoad((JSONObject) null, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Render render = this.f10323a.getRender();
        if (render instanceof c) {
            ((c) render).a(PageStatus.LOADING);
        }
        ExtensionPoint.as(PageStartedPoint.class).node(this.f10323a).create().onStarted(str);
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(this.f10323a).create().load(ResourceLoadContext.newBuilder().originUrl(webResourceRequest.getUrl().toString()).build());
        if (load != null) {
            RVLogger.d("GriverWebViewClient", "shouldInterceptRequest got resource: ".concat(String.valueOf(load)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(load.getMimeType(), load.getEncoding(), load.getStream());
            if (Build.VERSION.SDK_INT >= 21) {
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, UrlUtils.getCORSUrl(this.f10323a.getPageURI()));
                webResourceResponse.setResponseHeaders(hashMap);
            }
            a(load.getBytes(), webResourceRequest.getUrl());
            return webResourceResponse;
        }
        String obj = webResourceRequest.getUrl().toString();
        if (b(obj)) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.appId(this.f10323a.getApp().getAppId()).version(this.f10323a.getApp()).needAsynAppType(true).pageUrl(this.f10323a.getPageURI()).requestUrl(obj).append(GriverMonitorConstants.KEY_ERROR_TYPE, GriverMonitorConstants.PAGE_ABNORMAL_WHITESCREEN).code("1").message(GriverMonitorConstants.MESSAGE_OFFLINE_RESOURCE_LOST);
            GriverMonitor.error(GriverMonitorConstants.ERROR_PAGE_ABNORMAL, "GriverAppContainer", builder.build());
        }
        m mVar = new m(System.currentTimeMillis(), webResourceRequest.getMethod());
        boolean equals = TextUtils.equals(this.f10323a.getOriginalURI(), webResourceRequest.getUrl().toString());
        if (webResourceRequest.getUrl() != null && equals) {
            this.d.clear();
            mVar.b = true;
        }
        mVar.f10354a = webResourceRequest.getUrl().toString();
        this.d.put(webResourceRequest.getUrl().toString(), mVar);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    private boolean b(String str) {
        if (TextUtils.equals(str, "https://appx/af-appx.min.js")) {
            return true;
        }
        AppModel appModel = (AppModel) this.f10323a.getApp().getData(AppModel.class);
        if (appModel == null || appModel.getAppInfoModel() == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(appModel.getAppInfoModel().getVhost());
        sb.append("/index.html");
        if (!TextUtils.equals(str, sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(appModel.getAppInfoModel().getVhost());
            sb2.append("/index.js");
            if (TextUtils.equals(str, sb2.toString())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        GriverLogger.d("GriverWebViewClient", "page finished: ".concat(String.valueOf(str)));
        Render render = this.f10323a.getRender();
        if (render instanceof c) {
            ((c) render).a(PageStatus.FINISHED);
        }
        ExtensionPoint.as(PageFinishedPoint.class).node(this.f10323a).create().onPageFinished(str);
    }

    public boolean shouldOverrideUrlLoading(APWebView aPWebView, String str) {
        GriverLogger.d("GriverWebViewClient", "should override url loading: ".concat(String.valueOf(str)));
        return !a(str);
    }

    public void onPageStarted(final APWebView aPWebView, String str, Bitmap bitmap) {
        GriverLogger.d("GriverWebViewClient", "page started: ".concat(String.valueOf(str)));
        Render render = this.f10323a.getRender();
        if (render instanceof c) {
            ((c) render).a(PageStatus.LOADING);
        }
        ExtensionPoint.as(PageStartedPoint.class).node(this.f10323a).create().onStarted(str);
        if (!TextUtils.equals(str, "about://blank") && b()) {
            final boolean z = BundleUtils.getBoolean(this.f10323a.getStartParams(), RVParams.isH5App, false);
            int c2 = z ? c() : d();
            GriverLogger.d("GriverWebViewClient", "whitescreen delay: ".concat(String.valueOf(c2)));
            final String str2 = z ? "try {\n  (function (d) {\n    var filteredTagNames = {\n      'IFRAME': 1,\n      'STYLE': 1,\n      'HTML': 1,\n      'BODY': 1,\n      'HEAD': 1,\n      'SCRIPT': 1,\n      'TITLE': 1\n    };\n    if (d.body) {\n      for (var nodes = d.body.childNodes, i = 0; i < nodes.length; i++) {\n        var node = nodes[i];\n        if (node != undefined) {\n          if (node.nodeType == 1 && filteredTagNames[node.tagName] != 1 && node.style.display != 'none') {\n            return '0'\n          } else if (node.nodeType == 3 && node.nodeValue.trim().length > 0) {\n            return '0'\n          }\n        }\n      }\n    }\n    return '1'\n  }(document))\n } catch (err) {}" : "try {\n  (function () {\n    if (location.href.indexOf('#') <= 0) {\n      return {\n        'isDSLError': false,\n        'detail': ''\n      }\n    }\n    var isDSLError = false;\n    if (document.getElementsByClassName('tiny-page').length == 0 || document.getElementsByClassName('tiny-page')[0].childNodes.length == 0) {isDSLError = true}\n    if (!isDSLError) {\n      isDSLError = true;\n      var childNodes = document.getElementsByClassName('tiny-page')[0].childNodes;\n      for (var i = 0; i < childNodes.length; i++) {\n        var $c = childNodes[i];\n        if ($c.childNodes.length > 0 || ($c.offsetWidth > 12 && $c.offsetHeight > 12)) {\n          isDSLError = false;\n          break\n        }\n      }\n    }\n    var testWebView = document.querySelectorAll('param[value=web-view]');\n    if (testWebView && testWebView.length > 0) {isDSLError = false}\n    var isLoading = false;\n    var testLoading = document.querySelectorAll('.a-cp-loading-indicator');\n    if (testLoading && testLoading.length > 0) {\n      isDSLError = false;\n      isLoading = true\n    }\n    return { 'isDSLError': isDSLError, 'isLoading': isLoading, 'detail': '' }\n  })()\n} catch (err) {}";
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    if (d.this.f10323a != null && d.this.f10323a.getApp() != null && !d.this.f10323a.isExited() && !d.this.f10323a.getApp().isExited()) {
                        aPWebView.evaluateJavascript(str2, new ValueCallback<String>() {
                            /* renamed from: a */
                            public void onReceiveValue(String str) {
                                GriverLogger.d("GriverWebViewClient", "whitescreen check result: ".concat(String.valueOf(str)));
                                GriverStageMonitor stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverWhiteScreenStageMonitor.getMonitorToken(d.this.f10323a.getApp(), d.this.f10323a.getPageURI()));
                                if (z) {
                                    if (!TextUtils.equals(str, "\"1\"")) {
                                        GriverLogger.d("GriverWebViewClient", "page is rendered");
                                        if (stageMonitor != null) {
                                            stageMonitor.addParam(GriverMonitorConstants.KEY_RENDERED, SummaryActivity.CHECKED);
                                        }
                                    } else if (stageMonitor != null) {
                                        stageMonitor.addParam("errorCode", "2");
                                        stageMonitor.addParam("errorMessage", GriverMonitorConstants.MESSAGE_WHITE_SCREEN_DOM_ERROR);
                                        stageMonitor.addParam(GriverMonitorConstants.KEY_RENDERED, "false");
                                    }
                                } else if (!JSONUtils.getBoolean(JSONUtils.parseObject(str), "isDSLError", false)) {
                                    GriverLogger.d("GriverWebViewClient", "page is rendered");
                                    if (stageMonitor != null) {
                                        stageMonitor.addParam(GriverMonitorConstants.KEY_RENDERED, SummaryActivity.CHECKED);
                                    }
                                } else if (stageMonitor != null) {
                                    stageMonitor.addParam("errorCode", "2");
                                    stageMonitor.addParam("errorMessage", GriverMonitorConstants.MESSAGE_WHITE_SCREEN_DOM_ERROR);
                                    stageMonitor.addParam(GriverMonitorConstants.KEY_RENDERED, "false");
                                }
                            }
                        });
                    }
                }
            }, (long) (c2 * 1000));
        }
    }

    private boolean b() {
        return JSONUtils.getBoolean(e(), "enable", true);
    }

    private int c() {
        return JSONUtils.getInt(e(), GriverConfigConstants.PARAM_WHITE_SCREEN_H5_THRESHOLD, 10);
    }

    private int d() {
        return JSONUtils.getInt(e(), GriverConfigConstants.PARAM_WHITE_SCREEN_MINI_THRESHOLD, 5);
    }

    private JSONObject e() {
        JSONObject jSONObject;
        try {
            jSONObject = JSON.parseObject(GriverInnerConfig.getConfig(GriverConfigConstants.KEY_WHITE_SCREEN_CONFIG, GriverConfigConstants.DEFAULT_WHITE_SCREEN_CONFIG));
        } catch (Exception e2) {
            GriverLogger.w("GriverWebViewClient", "parse white screen config failed", e2);
            jSONObject = null;
        }
        return jSONObject == null ? JSONUtils.parseObject(GriverConfigConstants.DEFAULT_WHITE_SCREEN_CONFIG) : jSONObject;
    }

    public void onPageFinished(APWebView aPWebView, String str, long j) {
        StringBuilder sb = new StringBuilder("page finished: ");
        sb.append(str);
        sb.append(", pageSize: ");
        sb.append(j);
        sb.append(", progress: ");
        sb.append(aPWebView.getProgress());
        GriverLogger.d("GriverWebViewClient", sb.toString());
        Render render = this.f10323a.getRender();
        if (render instanceof c) {
            ((c) render).a(PageStatus.FINISHED);
        }
        ExtensionPoint.as(PageFinishedPoint.class).node(this.f10323a).create().onPageFinished(str);
    }

    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, APWebResourceRequest aPWebResourceRequest) {
        return a(aPWebView, aPWebResourceRequest.getUrl(), aPWebResourceRequest.getMethod(), aPWebResourceRequest.getRequestHeaders());
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(APWebView aPWebView, String str) {
        return a(aPWebView, H5UrlHelper.parseUrl(str), "GET", (Map<String, String>) null);
    }

    private WebResourceResponse a(APWebView aPWebView, Uri uri, String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("shouldInterceptRequest == ");
        sb.append(uri.toString());
        RVLogger.d("GriverWebViewClient", sb.toString());
        Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(this.f10323a).create().load(ResourceLoadContext.newBuilder().originUrl(uri.toString()).build());
        if (load != null) {
            RVLogger.d("GriverWebViewClient", "shouldInterceptRequest got resource: ".concat(String.valueOf(load)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(load.getMimeType(), load.getEncoding(), load.getStream());
            if (Build.VERSION.SDK_INT >= 21) {
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, UrlUtils.getCORSUrl(this.f10323a.getPageURI()));
                webResourceResponse.setResponseHeaders(hashMap);
            }
            a(load.getBytes(), uri);
            return webResourceResponse;
        }
        m mVar = new m(System.currentTimeMillis(), str);
        if (TextUtils.equals(this.f10323a.getOriginalURI(), uri.toString())) {
            this.d.clear();
            mVar.b = true;
        }
        mVar.f10354a = uri.toString();
        this.d.put(uri.toString(), mVar);
        return null;
    }

    private void a(byte[] bArr, Uri uri) {
        if (bArr != null && MonitorManager.exceedThreshold(GriverMonitorConstants.ERROR_PAGE_SIZE_EXCEPTION, (double) bArr.length)) {
            GriverMonitor.error(GriverMonitorConstants.ERROR_PAGE_SIZE_EXCEPTION, "GriverAppContainer", new MonitorMap.Builder().appId(this.f10323a.getApp().getAppId()).version(this.f10323a.getApp()).url(uri.toString()).pageUrl(this.f10323a.getOriginalURI()).requestUrl(uri.toString()).needAsynAppType(true).size(String.valueOf(bArr.length)).threshold(String.valueOf(MonitorManager.getThreshold(GriverMonitorConstants.ERROR_PAGE_SIZE_EXCEPTION))).build());
        }
    }

    public void onReceivedError(APWebView aPWebView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onReceivedError errorCode ");
        sb.append(i);
        sb.append(" description ");
        sb.append(str);
        sb.append(" failingUrl ");
        sb.append(str2);
        GriverLogger.d("GriverWebViewClient", sb.toString());
        b(str2, String.valueOf(i), str);
        if (i != -97) {
            a(str2, i);
        }
    }

    private void a(String str, int i) {
        if (!TextUtils.equals(str, this.c) || System.currentTimeMillis() - this.b > 500) {
            this.b = System.currentTimeMillis();
            this.c = str;
            a(String.valueOf(i), str, "genericError");
            StringBuilder sb = new StringBuilder("loadErrorPage ");
            sb.append(str);
            sb.append(" statusCode ");
            sb.append(i);
            GriverLogger.d("GriverWebViewClient", sb.toString());
            Page page = this.f10323a;
            if (page != null) {
                if (page.getStartParams() != null) {
                    this.f10323a.getStartParams().putBoolean("dsl_error", true);
                }
                if (!b(str, i)) {
                    ((GriverWebViewReceivedErrorExtension) RVProxy.get(GriverWebViewReceivedErrorExtension.class)).showError(this.f10323a, str, i);
                    return;
                }
                return;
            }
            return;
        }
        GriverLogger.d("GriverWebViewClient", "the same error not load");
    }

    private boolean b(String str, int i) {
        if (i == 403 || i == 404) {
            GriverLogger.d("GriverWebViewClient", "loadErrorPage 404 or 403, return ");
            return true;
        }
        String string = BundleUtils.getString(this.f10323a.getStartParams(), "bizType");
        GriverLogger.d("GriverWebViewClient", "bizType:".concat(String.valueOf(string)));
        if (TextUtils.equals(string, "Advertisement")) {
            try {
                this.f10323a.getPageContext().getPageContainer().getView().setVisibility(8);
            } catch (Exception e2) {
                GriverLogger.w("GriverWebViewClient", "hide advertisement view exception", e2);
            }
            return true;
        } else if (!BundleUtils.getBoolean(this.f10323a.getStartParams(), "tt", false) || BundleUtils.getBoolean(this.f10323a.getStartParams(), RVParams.TRANS_ANIMATE, false)) {
            return false;
        } else {
            GriverLogger.d("GriverWebViewClient", "loadErrorPage in transparent case return directly");
            this.f10323a.getApp().popPage((JSONObject) null);
            return true;
        }
    }

    private void a(String str, String str2, String str3) {
        if (this.f10323a != null) {
            ExtensionPoint.as(PageAbnormalPoint.class).node(this.f10323a).create().pageAbnoraml(str3, str, GriverMonitorConstants.MESSAGE_RECEIVED_PAGE_ERROR);
            ExtensionPoint.as(PageErrorPoint.class).node(this.f10323a).create().onPageError(str2);
        }
    }

    private void b(String str, String str2, String str3) {
        Page page = this.f10323a;
        if (page != null && page.getRender() != null && this.f10323a.getRender().getRenderBridge() != null && !TextUtils.equals(str2, "200") && !TextUtils.equals(str2, "302") && !TextUtils.equals(str2, "304")) {
            StringBuilder sb = new StringBuilder("sendErrorResource:");
            sb.append(str);
            sb.append("  errorCode:");
            sb.append(str2);
            sb.append(" description:");
            sb.append(str3);
            GriverLogger.debug("GriverWebViewClient", sb.toString());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            jSONObject.put("error", (Object) str2);
            jSONObject.put("errorMessage", (Object) str3);
            jSONObject.put("client", (Object) "android");
            new JSONObject().put("data", (Object) jSONObject);
            this.f10323a.getRender().getRenderBridge().sendToRender(new RenderCallContext.Builder(this.f10323a.getRender()).action("h5ResourceLost").param(jSONObject).build(), (SendToRenderCallback) null);
        }
    }

    public void onReceivedHttpError(APWebView aPWebView, int i, String str) {
        Page page;
        StringBuilder sb = new StringBuilder("onReceivedHttpError statusCode : ");
        sb.append(i);
        sb.append(" requestUrl : ");
        sb.append(str);
        GriverLogger.d("GriverWebViewClient", sb.toString());
        if (!TextUtils.isEmpty(str) && (page = this.f10323a) != null) {
            if (!TextUtils.equals(page.getPageURI(), str)) {
                StringBuilder sb2 = new StringBuilder("onReceivedHttpError : ");
                sb2.append(this.f10323a.getPageURI());
                GriverLogger.d("GriverWebViewClient", sb2.toString());
                if (this.d.containsKey(str)) {
                    m remove = this.d.remove(str);
                    if (remove != null) {
                        remove.c = i;
                    }
                    a(remove, "load resource fail");
                    return;
                }
                return;
            }
            a(str, i);
        }
    }

    public void onWebViewEvent(APWebView aPWebView, int i, Object obj) {
        StringBuilder sb = new StringBuilder("onWebViewEvent: ");
        sb.append(i);
        sb.append(", ");
        sb.append(obj);
        GriverLogger.d("GriverWebViewClient", sb.toString());
        if (!(i == 13 || i == 14)) {
            if (i != 16) {
                switch (i) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    case 9:
                        break;
                    default:
                        return;
                }
            }
            a(aPWebView, obj, i);
            return;
        }
        a(obj, i);
    }

    public static boolean a() {
        PowerManager powerManager = (PowerManager) GriverEnv.getApplicationContext().getSystemService("power");
        if (powerManager != null) {
            return powerManager.isScreenOn();
        }
        GriverLogger.d("GriverWebViewClient", "powerManager == null");
        return true;
    }

    private void a(APWebView aPWebView, Object obj, int i) {
        int i2;
        StringBuilder sb = new StringBuilder("onWebViewEvent empty page ");
        sb.append(aPWebView.getUrl());
        GriverLogger.d("GriverWebViewClient", sb.toString());
        try {
            i2 = Integer.parseInt(String.valueOf(obj));
        } catch (Exception e2) {
            GriverLogger.e("GriverWebViewClient", "parse blank time exception", e2);
            i2 = 0;
        }
        GriverLogger.d("GriverWebViewClient", "onWebViewEvent empty page blankTime is ".concat(String.valueOf(i2)));
        if (i2 == 3) {
            this.e = true;
        }
        if (i2 == 6) {
            this.f = true;
            RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
            if ((rVEnvironmentService != null && rVEnvironmentService.isBackgroundRunning()) || !a()) {
                GriverLogger.d("GriverWebViewClient", "activity isBackgroundRunning or screenOff");
                return;
            }
        }
        if (i2 == 9) {
            StringBuilder sb2 = new StringBuilder("onWebViewEvent empty page blankTime 3&6 ");
            sb2.append(this.e);
            sb2.append("&");
            sb2.append(this.f);
            GriverLogger.d("GriverWebViewClient", sb2.toString());
            RVEnvironmentService rVEnvironmentService2 = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
            if ((rVEnvironmentService2 != null && rVEnvironmentService2.isBackgroundRunning()) || !a()) {
                GriverLogger.d("GriverWebViewClient", "activity isBackgroundRunning or screenOff");
            } else if (this.e && this.f && !RVFlag.hasShowLoading) {
                GriverLogger.d("GriverWebViewClient", "onWebViewEvent empty page blankTime is report monitor");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(GriverMonitorConstants.KEY_ERROR_TYPE, (Object) "ucLongRender");
                int i3 = i == 9 ? H5ErrorCode.BLANK_SCREEN_UC_EMPTY_SCREEN : H5ErrorCode.BLANK_SCREEN_UC_BASECOLOR_EMPTY_SCREEN;
                jSONObject.put("errorCode", (Object) Integer.valueOf(i3));
                ExtensionPoint.as(PageAbnormalPoint.class).node(this.f10323a).create().pageAbnoraml("ucLongRender", String.valueOf(i3), GriverMonitorConstants.MESSAGE_UC_EMPTY_PAGE_ERROR);
            }
        }
    }

    private void a(Object obj, int i) {
        if (i == 7) {
            StringBuilder sb = new StringBuilder("first screen t2: ");
            sb.append(SystemClock.elapsedRealtime());
            GriverLogger.d("GriverWebViewClient", sb.toString());
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(this.f10323a.getApp(), this.f10323a.getOriginalURI(), "firstScreen");
        }
    }

    public void onResourceResponse(APWebView aPWebView, HashMap<String, String> hashMap) {
        int parseInt = H5Utils.parseInt(hashMap.get("httpcode"));
        String str = hashMap.get("url");
        StringBuilder sb = new StringBuilder("onResourceResponse statusCode ");
        sb.append(parseInt);
        sb.append(" url ");
        sb.append(str);
        GriverLogger.d("GriverWebViewClient", sb.toString());
        if (this.d.containsKey(str)) {
            m remove = this.d.remove(str);
            if (this.f10323a != null && remove != null) {
                b(str, String.valueOf(parseInt), "");
                remove.d = hashMap.get("mimetype");
                remove.c = parseInt;
                if (remove.b && (parseInt == 301 || parseInt == 302 || parseInt >= 400)) {
                    try {
                        this.f10323a.getPageContext().getLoadingView().dismiss();
                    } catch (Exception unused) {
                        GriverLogger.e("GriverWebViewClient", "hide loading");
                    }
                }
                if (remove.c >= 400) {
                    if (remove.b) {
                        a(String.valueOf(parseInt), remove.f10354a, "genericError");
                    }
                    a(remove, "load resource failed");
                }
            }
        }
    }

    private void a(m mVar, String str) {
        if (this.f10323a != null && mVar != null) {
            try {
                MonitorMap.Builder builder = new MonitorMap.Builder();
                builder.appId(this.f10323a.getApp().getAppId()).version(this.f10323a.getApp()).url(this.f10323a.getOriginalURI()).append("targetUrl", mVar.f10354a).requestUrl(mVar.f10354a).pageUrl(this.f10323a.getOriginalURI()).append(FirebaseAnalytics.Param.METHOD, mVar.e).append("type", mVar.d).code(String.valueOf(mVar.c)).message(str).needAsynAppType(true);
                GriverMonitor.error(GriverMonitorConstants.ERROR_RESOURCES, "GriverAppContainer", builder.build());
            } catch (Exception e2) {
                GriverLogger.e("GriverWebViewClient", "send monitor failed", e2);
            }
        }
    }
}
