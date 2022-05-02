package com.alibaba.griver.core.render;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.webview.ReleaseWebViewPoint;
import com.alibaba.griver.base.api.APDownloadListener;
import com.alibaba.griver.base.api.APHitTestResult;
import com.alibaba.griver.base.api.APWebBackForwardList;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebMessagePort;
import com.alibaba.griver.base.api.APWebSettings;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import com.alibaba.griver.base.api.APWebViewListener;
import com.alibaba.griver.base.api.APWebViewPerformance;
import com.alibaba.griver.base.api.H5EmbededViewProvider;
import com.alibaba.griver.base.api.H5ScrollChangedCallback;
import com.alibaba.griver.base.api.IH5EmbedViewJSCallback;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5FileUtil;
import com.alibaba.griver.base.nebula.APWebMessage;
import com.alibaba.griver.base.nebula.WebViewType;
import com.alibaba.griver.core.GriverParam;
import com.alibaba.griver.core.ui.GriverPage;
import com.alibaba.griver.core.utils.k;
import com.alibaba.griver.core.webview.extension.GriverWebViewSettingsExtension;
import java.util.Map;
import o.getTabbarModel;

public class f implements APWebView, APWebViewPerformance {

    /* renamed from: a  reason: collision with root package name */
    public static String f9075a = "H5WebView";
    private static int c;
    protected APWebView b;
    private Bundle d;
    private int e = 0;
    private float f = 1.0f;
    private String g;
    private boolean h = false;
    private String i;
    private GriverPage j;
    private Bundle k;
    private long l = -1;
    private String m = null;

    public void setAPWebViewListener(APWebViewListener aPWebViewListener) {
    }

    public f() {
    }

    public f(Activity activity, GriverPage griverPage, Bundle bundle, APWebView aPWebView, APWebViewListener aPWebViewListener) {
        StringBuilder sb = new StringBuilder();
        sb.append(f9075a);
        sb.append(hashCode());
        f9075a = sb.toString();
        this.d = bundle;
        this.j = griverPage;
        Bundle startParams = griverPage.getStartParams();
        this.k = startParams;
        if (BundleUtils.getBoolean(startParams, GriverParam.LONG_ISPRERENDER, false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f9075a);
            sb2.append("_preRender");
            f9075a = sb2.toString();
        }
        String string = BundleUtils.getString(bundle, "bizType");
        this.i = BundleUtils.getString(griverPage.getStartParams(), "appId");
        RVLogger.d(f9075a, "createWebView bizType ".concat(String.valueOf(string)));
        this.b = aPWebView;
        if (aPWebView == null) {
            RVLogger.e(f9075a, "apWebView == null return");
            return;
        }
        if (aPWebViewListener != null) {
            aPWebView.setAPWebViewListener(aPWebViewListener);
        }
        boolean z = BundleUtils.getBoolean(griverPage.getStartParams(), RVParams.LONG_ENABLE_SCROLLBAR, true);
        RVLogger.d(f9075a, "enableScrollBar:".concat(String.valueOf(z)));
        if (!z) {
            this.b.setHorizontalScrollBarEnabled(z);
            this.b.setVerticalScrollBarEnabled(z);
        }
        int i2 = c;
        c = i2 + 1;
        this.e = i2;
    }

    public static String a() {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (!TextUtils.isEmpty(applicationContext.getApplicationInfo().dataDir)) {
            return applicationContext.getApplicationInfo().dataDir;
        }
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).applicationInfo.dataDir;
        } catch (Throwable th) {
            RVLogger.e(f9075a, "exception detail", th);
            return null;
        }
    }

    public int b() {
        return this.e;
    }

    public void a(boolean z) {
        RVLogger.d(f9075a, "initWebView");
        g();
        f();
        b(z);
        if (this.b == null) {
            RVLogger.e(f9075a, "FATAL ERROR, the internal glue apWebView is null!");
        }
        if (GriverEnv.isDebuggable()) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    private void f() {
        GriverPage griverPage = this.j;
        if (griverPage != null && TextUtils.isEmpty(BundleUtils.getString(griverPage.getStartParams(), "url"))) {
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @TargetApi(19)
    private void b(boolean z) {
        RVLogger.d(f9075a, "applyCustomSettings allowAccessFromFileURL ".concat(String.valueOf(z)));
        final APWebSettings settings = getSettings();
        settings.setEnableFastScroller(false);
        settings.setPageCacheCapacity(0);
        settings.setDefaultTextEncodingName(getTabbarModel.ENC);
        settings.setSupportMultipleWindows(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            RVLogger.d(f9075a, "Ignore the exception in AccessibilityInjector when init");
            RVLogger.e(f9075a, "exception detail", e2);
        }
        settings.setDefaultFontSize(16);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(APWebSettings.PluginState.ON);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(z);
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append("/app_h5container");
        String obj = sb.toString();
        H5FileUtil.mkdirs(obj);
        settings.setDatabaseEnabled("yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_ENABLE_WEBVIEW_DATABASE, "NO")));
        if (Build.VERSION.SDK_INT < 19) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("/databases");
            H5FileUtil.mkdirs(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("/databases");
            settings.setDatabasePath(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append("/appcache");
        H5FileUtil.mkdirs(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("/appcache");
        settings.setAppCachePath(sb5.toString());
        settings.setAppCacheEnabled(true);
        settings.getUserAgentString();
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(obj);
        sb6.append("/geolocation");
        H5FileUtil.mkdirs(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(obj);
        sb7.append("/geolocation");
        settings.setGeolocationDatabasePath(sb7.toString());
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (Build.VERSION.SDK_INT >= 11) {
            settings.setDisplayZoomControls(false);
        }
        settings.setAllowFileAccessFromFileURLs(z);
        settings.setAllowUniversalAccessFromFileURLs(z);
        settings.setTextSize(APWebSettings.TextSize.NORMAL);
        if (Build.VERSION.SDK_INT > 10 && Build.VERSION.SDK_INT < 17) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        if (!"no".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_CUSTOM_WEB_SETTINGS, "YES"))) {
            GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                public void run() {
                    try {
                        ((GriverWebViewSettingsExtension) RVProxy.get(GriverWebViewSettingsExtension.class)).customizeWebViewSettings(settings);
                    } catch (Exception e) {
                        GriverLogger.e(f.f9075a, "customize web settings failed", e);
                    }
                }
            });
        }
    }

    private void g() {
        String str;
        APWebSettings settings = getSettings();
        try {
            String userAgentString = settings.getUserAgentString();
            RVLogger.d(f9075a, "origin ua ".concat(String.valueOf(userAgentString)));
            if (userAgentString.contains("UCBS") || !userAgentString.contains("UWS")) {
                str = userAgentString;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(userAgentString);
                sb.append(" UCBS/");
                sb.append(getVersion());
                str = sb.toString();
            }
            this.g = str;
            a(settings, str, userAgentString);
            String str2 = f9075a;
            StringBuilder sb2 = new StringBuilder("set final ua ");
            sb2.append(this.g);
            RVLogger.d(str2, sb2.toString());
        } catch (Exception e2) {
            RVLogger.e(f9075a, "setUserAgent exception", e2);
        }
    }

    private void a(APWebSettings aPWebSettings, String str, String str2) {
        aPWebSettings.setUserAgentString(str);
    }

    @TargetApi(14)
    public void a(int i2) {
        APWebSettings settings = getSettings();
        if (Build.VERSION.SDK_INT >= 14) {
            settings.setTextZoom(i2);
        } else {
            settings.setTextSize(b(i2));
        }
    }

    public APWebSettings.TextSize b(int i2) {
        if (i2 >= 200) {
            return APWebSettings.TextSize.LARGEST;
        }
        if (i2 >= 150) {
            return APWebSettings.TextSize.LARGER;
        }
        if (i2 >= 100) {
            return APWebSettings.TextSize.NORMAL;
        }
        if (i2 >= 75) {
            return APWebSettings.TextSize.SMALLER;
        }
        return APWebSettings.TextSize.NORMAL;
    }

    @TargetApi(19)
    public void loadUrl(final String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("javascript")) {
                this.l = System.currentTimeMillis();
                this.m = str;
            }
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    f.this.a(str, (IH5EmbedViewJSCallback) null);
                }
            });
        }
    }

    public void execJavaScript4EmbedView(final String str, final IH5EmbedViewJSCallback iH5EmbedViewJSCallback) {
        if (!TextUtils.isEmpty(str)) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    f.this.a(str, iH5EmbedViewJSCallback);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ all -> 0x0066, all -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[Catch:{ all -> 0x0066, all -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r6, final com.alibaba.griver.base.api.IH5EmbedViewJSCallback r7) {
        /*
            r5 = this;
            java.lang.String r0 = "javascript"
            boolean r0 = r6.startsWith(r0)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0060
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0066 }
            r1 = 19
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.String r1 = r5.g     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r5.g     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "UCBS"
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.g     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "UWS"
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.g     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "U3"
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            r1 = 0
            if (r2 == 0) goto L_0x0049
            if (r7 != 0) goto L_0x0040
            r5.evaluateJavascript(r6, r1)     // Catch:{ all -> 0x0066 }
            return
        L_0x0040:
            com.alibaba.griver.core.render.f$4 r0 = new com.alibaba.griver.core.render.f$4     // Catch:{ all -> 0x0066 }
            r0.<init>(r7)     // Catch:{ all -> 0x0066 }
            r5.evaluateJavascript(r6, r0)     // Catch:{ all -> 0x0066 }
            return
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            if (r7 != 0) goto L_0x0051
            r5.evaluateJavascript(r6, r1)     // Catch:{ all -> 0x0066 }
            return
        L_0x0051:
            com.alibaba.griver.core.render.f$5 r0 = new com.alibaba.griver.core.render.f$5     // Catch:{ all -> 0x0066 }
            r0.<init>(r7)     // Catch:{ all -> 0x0066 }
            r5.evaluateJavascript(r6, r0)     // Catch:{ all -> 0x0066 }
            return
        L_0x005a:
            com.alibaba.griver.base.api.APWebView r7 = r5.b     // Catch:{ all -> 0x0066 }
            r7.loadUrl(r6)     // Catch:{ all -> 0x0066 }
            return
        L_0x0060:
            com.alibaba.griver.base.api.APWebView r7 = r5.b     // Catch:{ all -> 0x0066 }
            r7.loadUrl(r6)     // Catch:{ all -> 0x0066 }
            return
        L_0x0066:
            r7 = move-exception
            java.lang.String r0 = f9075a
            java.lang.String r1 = "loadUrl exception."
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r1, r7)
            com.alibaba.griver.base.api.APWebView r7 = r5.b     // Catch:{ all -> 0x0074 }
            r7.loadUrl(r6)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r6 = move-exception
            java.lang.String r7 = f9075a
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r7, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.render.f.a(java.lang.String, com.alibaba.griver.base.api.IH5EmbedViewJSCallback):void");
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.b.addJavascriptInterface(obj, str);
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        this.b.setWebContentsDebuggingEnabled(z);
    }

    public void flingScroll(int i2, int i3) {
        this.b.flingScroll(i2, i3);
    }

    public boolean zoomIn() {
        return this.b.zoomIn();
    }

    public boolean zoomOut() {
        return this.b.zoomOut();
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        this.b.setHorizontalScrollbarOverlay(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        this.b.setVerticalScrollbarOverlay(z);
    }

    public boolean overlayHorizontalScrollbar() {
        return this.b.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.b.overlayVerticalScrollbar();
    }

    public SslCertificate getCertificate() {
        return this.b.getCertificate();
    }

    public void savePassword(String str, String str2, String str3) {
        this.b.savePassword(str, str2, str3);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        this.b.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return this.b.getHttpAuthUsernamePassword(str, str2);
    }

    public void destroy() {
        this.b.destroy();
    }

    public void setNetworkAvailable(boolean z) {
        this.b.setNetworkAvailable(z);
    }

    public APWebBackForwardList saveState(Bundle bundle) {
        return this.b.saveState(bundle);
    }

    public APWebBackForwardList restoreState(Bundle bundle) {
        return this.b.restoreState(bundle);
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.l = System.currentTimeMillis();
        this.m = str;
        this.b.loadUrl(str, map);
    }

    public void postUrl(String str, byte[] bArr) {
        this.b.postUrl(str, bArr);
    }

    public void loadData(String str, String str2, String str3) {
        this.b.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.b.evaluateJavascript(str, valueCallback);
    }

    public void stopLoading() {
        this.b.stopLoading();
    }

    public void reload() {
        this.b.reload();
    }

    public boolean canGoBack() {
        return this.b.canGoBack();
    }

    public void goBack() {
        this.b.goBack();
    }

    public boolean canGoForward() {
        return this.b.canGoForward();
    }

    public void goForward() {
        this.b.goForward();
    }

    public boolean canGoBackOrForward(int i2) {
        return this.b.canGoForward();
    }

    public void goBackOrForward(int i2) {
        this.b.goBackOrForward(i2);
    }

    public boolean pageUp(boolean z) {
        return this.b.pageUp(z);
    }

    public boolean pageDown(boolean z) {
        return this.b.pageDown(z);
    }

    public void setInitialScale(int i2) {
        this.b.setInitialScale(i2);
    }

    public void invokeZoomPicker() {
        this.b.invokeZoomPicker();
    }

    public String getUrl() {
        return this.b.getUrl();
    }

    public String getOriginalUrl() {
        return this.b.getOriginalUrl();
    }

    public String getTitle() {
        return this.b.getTitle();
    }

    public Bitmap getFavicon() {
        return this.b.getFavicon();
    }

    public int getProgress() {
        return this.b.getProgress();
    }

    public int getContentHeight() {
        return this.b.getContentHeight();
    }

    public int getContentWidth() {
        return this.b.getContentWidth();
    }

    public APWebMessagePort[] createWebMessageChannel() {
        return this.b.createWebMessageChannel();
    }

    public void postWebMessage(APWebMessage aPWebMessage, Uri uri) {
        this.b.postWebMessage(aPWebMessage, uri);
    }

    public void onPause() {
        this.b.onPause();
        RVLogger.d(f9075a, "H5WebView onWebViewPause");
        GriverPage griverPage = this.j;
        if (griverPage == null) {
            return;
        }
        if (griverPage.ifContainsEmbedView()) {
            H5EmbededViewProvider embededViewProvider = this.j.getEmbededViewProvider();
            if (embededViewProvider != null) {
                embededViewProvider.onWebViewPause();
            }
        } else if (this.j.getEmbedPage() != null) {
            this.j.getEmbedPage().pause();
        }
    }

    public void onResume() {
        this.b.onResume();
        RVLogger.d(f9075a, "H5WebView onWebViewResume");
        GriverPage griverPage = this.j;
        if (!(griverPage == null || griverPage.getEmbedPage() == null)) {
            this.j.getEmbedPage().resume();
        }
        GriverPage griverPage2 = this.j;
        if (griverPage2 == null) {
            return;
        }
        if (griverPage2.ifContainsEmbedView()) {
            H5EmbededViewProvider embededViewProvider = this.j.getEmbededViewProvider();
            if (embededViewProvider != null) {
                embededViewProvider.onWebViewResume();
            }
        } else if (this.j.getEmbedPage() != null) {
            this.j.getEmbedPage().resume();
        }
    }

    public boolean isPaused() {
        return this.b.isPaused();
    }

    public void freeMemory() {
        this.b.freeMemory();
    }

    public void clearCache(boolean z) {
        this.b.clearCache(z);
    }

    public void clearFormData() {
        this.b.clearFormData();
    }

    public void clearHistory() {
        this.b.clearHistory();
    }

    public void clearSslPreferences() {
        this.b.clearSslPreferences();
    }

    public APWebBackForwardList copyBackForwardList() {
        return this.b.copyBackForwardList();
    }

    public void setDownloadListener(APDownloadListener aPDownloadListener) {
        this.b.setDownloadListener(aPDownloadListener);
    }

    public void setWebViewClient(APWebViewClient aPWebViewClient) {
        this.b.setWebViewClient(aPWebViewClient);
    }

    public void setWebChromeClient(APWebChromeClient aPWebChromeClient) {
        this.b.setWebChromeClient(aPWebChromeClient);
    }

    public void removeJavascriptInterface(String str) {
        RVLogger.d(f9075a, "removeJavascriptInterface ".concat(String.valueOf(str)));
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.removeJavascriptInterface(str);
        }
    }

    public void c() {
        if (!this.h) {
            this.h = true;
            RVLogger.d(f9075a, "releaseWebView!");
            ExtensionPoint.as(ReleaseWebViewPoint.class).node(this.j).create().releaseWebView();
            final int i2 = 1000;
            if (ProcessUtils.isMainProcess() && ((k.a(this.k) || BundleUtils.getBoolean(this.k, RVParams.isTinyApp, false)) && !"no".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("h5_webview_release", "")))) {
                i2 = 500;
                RVLogger.d(f9075a, "useSw use 500");
            }
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    f.this.c(i2);
                }
            }, (long) i2);
        }
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        H5EmbededViewProvider embededViewProvider;
        try {
            RVLogger.d(f9075a, "loadBlankPage");
            RVLogger.d(f9075a, "H5WebView onWebViewDestory");
            if (!(this.j == null || !this.j.ifContainsEmbedView() || (embededViewProvider = this.j.getEmbededViewProvider()) == null)) {
                embededViewProvider.onWebViewDestory();
            }
            if (!"yes".equalsIgnoreCase(GriverConfig.getConfig("h5_unableLoadBlankPage", ""))) {
                RVLogger.d(f9075a, "loadBlankPage in UC/System WebView");
                loadUrl(GriverParam.ABOUT_BLANK);
            } else if (this.b == null || WebViewType.SYSTEM_BUILD_IN != this.b.getType()) {
                RVLogger.d(f9075a, "do not loadBlankPage in UCWebView");
            } else {
                RVLogger.d(f9075a, "loadBlankPage in System WebView");
                loadUrl(GriverParam.ABOUT_BLANK);
            }
        } catch (Throwable th) {
            RVLogger.e(f9075a, "loadBlankPage exception.", th);
        }
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                f.this.h();
            }
        }, (long) i2);
    }

    /* access modifiers changed from: private */
    public void h() {
        H5EmbededViewProvider embededViewProvider;
        try {
            RVLogger.d(f9075a, "releaseWebView");
            if (!(this.j == null || !this.j.ifContainsEmbedView() || (embededViewProvider = this.j.getEmbededViewProvider()) == null)) {
                embededViewProvider.releaseView();
            }
            this.j = null;
            View view = this.b.getView();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            view.setVisibility(8);
            view.clearFocus();
            view.clearAnimation();
            setDownloadListener((APDownloadListener) null);
            setWebViewClient((APWebViewClient) null);
            setWebChromeClient((APWebChromeClient) null);
            stopLoading();
            clearHistory();
            clearSslPreferences();
            view.destroyDrawingCache();
            freeMemory();
        } catch (Throwable th) {
            RVLogger.e(f9075a, "releaseWebView exception.", th);
        } finally {
            destroy();
        }
    }

    public APWebSettings getSettings() {
        return this.b.getSettings();
    }

    public APHitTestResult getHitTestResult() {
        return this.b.getHitTestResult();
    }

    public Picture capturePicture() {
        return this.b.capturePicture();
    }

    public View getView() {
        return this.b.getView();
    }

    public WebViewType getType() {
        return this.b.getType();
    }

    public String getVersion() {
        APWebView aPWebView = this.b;
        if (aPWebView == null) {
            return "(Null webview)";
        }
        return aPWebView.getVersion();
    }

    public float getScale() {
        return this.f;
    }

    public void setScale(float f2) {
        this.f = f2;
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.b.setVerticalScrollBarEnabled(z);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.b.setHorizontalScrollBarEnabled(z);
    }

    public void setOnScrollChangedCallback(H5ScrollChangedCallback h5ScrollChangedCallback) {
        this.b.setOnScrollChangedCallback(h5ScrollChangedCallback);
    }

    public int getScrollY() {
        return this.b.getScrollY();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.b.dispatchKeyEvent(keyEvent);
    }

    public boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i2) {
        return this.b.getCurrentPageSnapshot(rect, rect2, bitmap, z, i2);
    }

    public Page d() {
        return this.j;
    }

    public APWebView e() {
        return this.b;
    }

    public void getStartupPerformanceStatistics(ValueCallback<String> valueCallback) {
        APWebView aPWebView = this.b;
        if (aPWebView != null && (aPWebView instanceof APWebViewPerformance)) {
            ((APWebViewPerformance) aPWebView).getStartupPerformanceStatistics(valueCallback);
        }
    }
}
