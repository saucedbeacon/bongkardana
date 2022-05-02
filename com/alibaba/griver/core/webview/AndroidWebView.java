package com.alibaba.griver.core.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
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
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.APDownloadListener;
import com.alibaba.griver.base.api.APHitTestResult;
import com.alibaba.griver.base.api.APWebBackForwardList;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebMessagePort;
import com.alibaba.griver.base.api.APWebSettings;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import com.alibaba.griver.base.api.APWebViewListener;
import com.alibaba.griver.base.api.H5ScrollChangedCallback;
import com.alibaba.griver.base.api.IH5EmbedViewJSCallback;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.alibaba.griver.base.nebula.APWebMessage;
import com.alibaba.griver.base.nebula.H5PatternHelper;
import com.alibaba.griver.base.nebula.WebViewType;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndroidWebView implements APWebView {

    /* renamed from: a  reason: collision with root package name */
    private APWebSettings f9076a;
    private WebView b;
    /* access modifiers changed from: private */
    public APWebViewListener c;
    /* access modifiers changed from: private */
    public H5ScrollChangedCallback d;
    private String e;
    /* access modifiers changed from: private */
    public k f;
    private float g = 1.0f;

    public interface EmbedViewRenderCallback {
        void onError(String str);

        void onRender(String str, String str2, int i, int i2, int i3, int i4);
    }

    public void execJavaScript4EmbedView(String str, IH5EmbedViewJSCallback iH5EmbedViewJSCallback) {
    }

    public boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i) {
        return false;
    }

    public boolean isPaused() {
        return false;
    }

    public AndroidWebView(Context context) {
        b bVar = new b(context);
        this.b = bVar;
        bVar.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return false;
            }
        });
        k kVar = new k(context);
        this.f = kVar;
        kVar.setAndroidWebView(this.b);
        this.b.setBackgroundColor(0);
        this.f9076a = new i(this.b.getSettings());
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                instance.setAcceptThirdPartyCookies(this.b, true);
            } catch (Throwable th) {
                RVLogger.e("AndroidWebView", "setAcceptThirdPartyCookies", th);
            }
        }
        this.f9076a.setSavePassword(false);
    }

    public void a(String str, @Nullable View view, int i, int i2, int i3, int i4) {
        this.f.a(str, view, i, i2, i3, i4);
    }

    public void a(String str) {
        this.f.a(str);
    }

    public void a(String str, @NonNull final EmbedViewRenderCallback embedViewRenderCallback) {
        if (Build.VERSION.SDK_INT > 18) {
            StringBuilder sb = new StringBuilder("document.androidEmbedViewManager.render(\"");
            sb.append(str);
            sb.append("\");");
            evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    if (TextUtils.isEmpty(str)) {
                        embedViewRenderCallback.onError("empty render value!");
                        return;
                    }
                    JSONObject parseObject = JSONUtils.parseObject(str);
                    if (parseObject == null) {
                        embedViewRenderCallback.onError("render value exception: ".concat(String.valueOf(str)));
                        return;
                    }
                    embedViewRenderCallback.onRender(parseObject.getString("elementId"), parseObject.getString("type"), parseObject.getInteger("x").intValue(), parseObject.getInteger("y").intValue(), parseObject.getInteger("width").intValue(), parseObject.getInteger("height").intValue());
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder("sdk incompatible: ");
        sb2.append(Build.VERSION.SDK_INT);
        embedViewRenderCallback.onError(sb2.toString());
    }

    public View getView() {
        return this.f;
    }

    public int getScrollY() {
        return this.b.getScrollY();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.b.dispatchKeyEvent(keyEvent);
    }

    public String getVersion() {
        if (TextUtils.isEmpty(this.e)) {
            String str = "1.1";
            if (Build.VERSION.SDK_INT >= 19) {
                String userAgentString = this.f9076a.getUserAgentString();
                try {
                    Pattern compile = H5PatternHelper.compile("Chrome/\\d+\\.\\d+\\.\\d+\\.\\d+");
                    if (compile != null) {
                        Matcher matcher = compile.matcher(userAgentString);
                        if (matcher.find()) {
                            str = matcher.group(0);
                        }
                    }
                } catch (Throwable th) {
                    RVLogger.e("AndroidWebView", "catch exception ", th);
                }
            }
            this.e = str;
        }
        return this.e;
    }

    public WebViewType getType() {
        return WebViewType.SYSTEM_BUILD_IN;
    }

    public Picture capturePicture() {
        return this.b.capturePicture();
    }

    public void setAPWebViewListener(APWebViewListener aPWebViewListener) {
        this.c = aPWebViewListener;
    }

    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        WebView webView = this.b;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
    }

    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.removeJavascriptInterface(str);
        }
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    public APWebMessagePort[] createWebMessageChannel() {
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        WebMessagePort[] createWebMessageChannel = this.b.createWebMessageChannel();
        return new APWebMessagePort[]{new g(createWebMessageChannel[0]), new g(createWebMessageChannel[1])};
    }

    public void postWebMessage(APWebMessage aPWebMessage, Uri uri) {
        if (Build.VERSION.SDK_INT >= 23) {
            APWebMessagePort[] ports = aPWebMessage.getPorts();
            WebMessagePort[] webMessagePortArr = null;
            if (ports != null) {
                webMessagePortArr = new WebMessagePort[ports.length];
                for (int i = 0; i < ports.length; i++) {
                    webMessagePortArr[i] = ((g) ports[i]).a();
                }
            }
            this.b.postWebMessage(new WebMessage(aPWebMessage.getData(), webMessagePortArr), uri);
        }
    }

    public void flingScroll(int i, int i2) {
        this.b.flingScroll(i, i2);
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
        this.f = null;
    }

    public void setNetworkAvailable(boolean z) {
        this.b.setNetworkAvailable(z);
    }

    public APWebBackForwardList saveState(Bundle bundle) {
        WebBackForwardList saveState = this.b.saveState(bundle);
        if (saveState != null) {
            return new e(saveState);
        }
        return null;
    }

    public APWebBackForwardList restoreState(Bundle bundle) {
        WebBackForwardList restoreState = this.b.restoreState(bundle);
        if (restoreState != null) {
            return new e(restoreState);
        }
        return null;
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.b.loadUrl(str, map);
    }

    public void loadUrl(String str) {
        this.b.loadUrl(str);
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
        if (Build.VERSION.SDK_INT >= 19) {
            this.b.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
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

    public boolean canGoBackOrForward(int i) {
        return this.b.canGoBackOrForward(i);
    }

    public void goBackOrForward(int i) {
        this.b.goBackOrForward(i);
    }

    public boolean pageUp(boolean z) {
        return this.b.pageUp(z);
    }

    public boolean pageDown(boolean z) {
        return this.b.pageDown(z);
    }

    public void setInitialScale(int i) {
        this.b.setInitialScale(i);
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
        RVLogger.w("AndroidWebView", "getContentWidth() is currently not supported yet");
        return 0;
    }

    public void onPause() {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.onPause();
        }
    }

    public void onResume() {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.onResume();
        }
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
        WebBackForwardList copyBackForwardList = this.b.copyBackForwardList();
        if (copyBackForwardList != null) {
            return new e(copyBackForwardList);
        }
        return null;
    }

    public void setWebViewClient(APWebViewClient aPWebViewClient) {
        this.b.setWebViewClient(new j(this, aPWebViewClient));
    }

    public void setDownloadListener(APDownloadListener aPDownloadListener) {
        this.b.setDownloadListener(new a(aPDownloadListener));
    }

    public void setWebChromeClient(APWebChromeClient aPWebChromeClient) {
        this.b.setWebChromeClient(new f(this, aPWebChromeClient));
    }

    public APWebSettings getSettings() {
        return this.f9076a;
    }

    public APHitTestResult getHitTestResult() {
        WebView.HitTestResult hitTestResult = this.b.getHitTestResult();
        if (hitTestResult == null) {
            return null;
        }
        return new a(hitTestResult);
    }

    public float getScale() {
        return this.g;
    }

    public void setScale(float f2) {
        this.g = f2;
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.b.setVerticalScrollBarEnabled(z);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.b.setHorizontalScrollBarEnabled(z);
    }

    public void setOnScrollChangedCallback(H5ScrollChangedCallback h5ScrollChangedCallback) {
        this.d = h5ScrollChangedCallback;
    }

    final class b extends WebView {
        public b(Context context) {
            super(context);
            setTag("H5WebView");
            H5SplitCompatUtils.doInstall(context);
            H5SplitCompatUtils.doInstall(GriverEnv.getApplicationContext());
        }

        /* access modifiers changed from: protected */
        public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            if (i2 >= 0 || i4 != 0 || AndroidWebView.this.c == null) {
                return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
            return AndroidWebView.this.c.overScrollBy(i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (AndroidWebView.this.c != null) {
                AndroidWebView.this.c.onDetachedFromWindow();
            }
        }

        /* access modifiers changed from: protected */
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            if (AndroidWebView.this.f != null) {
                AndroidWebView.this.f.a(i, i2, i3, i4);
            }
            if (AndroidWebView.this.d != null) {
                AndroidWebView.this.d.onScroll(i - i3, i2 - i4);
            } else {
                super.onScrollChanged(i, i2, i3, i4);
            }
        }

        public final boolean requestFocus(int i, Rect rect) {
            GriverLogger.d("AndroidWebView", "requestFocus: ".concat(String.valueOf(i)));
            return super.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, rect);
        }

        public final void dispatchWindowFocusChanged(boolean z) {
            GriverLogger.d("AndroidWebView", "dispatchWindowFocusChanged: ".concat(String.valueOf(z)));
            StringBuilder sb = new StringBuilder("has focus: ");
            sb.append(hasFocus());
            GriverLogger.d("AndroidWebView", sb.toString());
            if (Build.VERSION.SDK_INT >= 28 && z && !hasFocus()) {
                requestFocus();
            }
            super.dispatchWindowFocusChanged(z);
        }
    }

    class a implements APHitTestResult {

        /* renamed from: a  reason: collision with root package name */
        WebView.HitTestResult f10378a;

        a(WebView.HitTestResult hitTestResult) {
            this.f10378a = hitTestResult;
        }

        public String getExtra() {
            return this.f10378a.getExtra();
        }

        public int getType() {
            return this.f10378a.getType();
        }
    }
}
