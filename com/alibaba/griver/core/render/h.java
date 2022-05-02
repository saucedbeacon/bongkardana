package com.alibaba.griver.core.render;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.base.api.APDownloadListener;
import com.alibaba.griver.base.api.APHitTestResult;
import com.alibaba.griver.base.api.APWebBackForwardList;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebSettings;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.APWebViewClient;
import com.alibaba.griver.base.api.APWebViewListener;
import com.alibaba.griver.base.api.H5OverScrollListener;
import com.alibaba.griver.base.api.H5ScrollChangedCallback;
import com.alibaba.griver.base.api.IH5EmbedViewJSCallback;
import com.alibaba.griver.base.api.NXH5WebViewAdapter;
import com.alibaba.griver.base.api.NXH5WebViewClientAdapter;
import com.alibaba.griver.base.nebula.WebViewType;
import java.util.Map;

public class h implements NXH5WebViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    private f f10338a;
    private j b;
    private c c;
    private NXH5WebViewClientAdapter d;

    public h(c cVar, f fVar, j jVar) {
        this.f10338a = fVar;
        this.b = jVar;
        this.c = cVar;
    }

    public void a(NXH5WebViewClientAdapter nXH5WebViewClientAdapter) {
        this.d = nXH5WebViewClientAdapter;
    }

    public int getWebViewIndex() {
        return this.f10338a.b();
    }

    public void init(boolean z) {
        this.f10338a.a(z);
    }

    public void setTextSize(int i) {
        this.f10338a.a(i);
    }

    public APWebSettings.TextSize getTextSize(int i) {
        return this.f10338a.b(i);
    }

    public void loadUrl(String str) {
        this.f10338a.loadUrl(str);
    }

    public void execJavaScript4EmbedView(String str, IH5EmbedViewJSCallback iH5EmbedViewJSCallback) {
        this.f10338a.execJavaScript4EmbedView(str, iH5EmbedViewJSCallback);
    }

    public void setH5OverScrollListener(H5OverScrollListener h5OverScrollListener) {
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(h5OverScrollListener);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.f10338a.addJavascriptInterface(obj, str);
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        this.f10338a.setWebContentsDebuggingEnabled(z);
    }

    public void flingScroll(int i, int i2) {
        this.f10338a.flingScroll(i, i2);
    }

    public boolean zoomIn() {
        return this.f10338a.zoomIn();
    }

    public boolean zoomOut() {
        return this.f10338a.zoomOut();
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        this.f10338a.setHorizontalScrollbarOverlay(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        this.f10338a.setVerticalScrollbarOverlay(z);
    }

    public boolean overlayHorizontalScrollbar() {
        return this.f10338a.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.f10338a.overlayVerticalScrollbar();
    }

    public SslCertificate getCertificate() {
        return this.f10338a.getCertificate();
    }

    public void savePassword(String str, String str2, String str3) {
        this.f10338a.savePassword(str, str2, str3);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        this.f10338a.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return this.f10338a.getHttpAuthUsernamePassword(str, str2);
    }

    public void destroy() {
        this.f10338a.destroy();
    }

    public void setNetworkAvailable(boolean z) {
        this.f10338a.setNetworkAvailable(z);
    }

    public APWebBackForwardList saveState(Bundle bundle) {
        return this.f10338a.saveState(bundle);
    }

    public APWebBackForwardList restoreState(Bundle bundle) {
        return this.f10338a.restoreState(bundle);
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.f10338a.loadUrl(str, map);
    }

    public void postUrl(String str, byte[] bArr) {
        this.f10338a.postUrl(str, bArr);
    }

    public void loadData(String str, String str2, String str3) {
        this.f10338a.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f10338a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f10338a.evaluateJavascript(str, valueCallback);
    }

    public void stopLoading() {
        this.f10338a.stopLoading();
    }

    public void reload() {
        this.f10338a.reload();
    }

    public boolean canGoBack() {
        return this.f10338a.canGoBack();
    }

    public void goBack() {
        this.f10338a.goBack();
    }

    public boolean canGoForward() {
        return this.f10338a.canGoForward();
    }

    public void goForward() {
        this.f10338a.goForward();
    }

    public boolean canGoBackOrForward(int i) {
        return this.f10338a.canGoBackOrForward(i);
    }

    public void goBackOrForward(int i) {
        this.f10338a.goBackOrForward(i);
    }

    public boolean pageUp(boolean z) {
        return this.f10338a.pageUp(z);
    }

    public boolean pageDown(boolean z) {
        return this.f10338a.pageDown(z);
    }

    public void setInitialScale(int i) {
        this.f10338a.setInitialScale(i);
    }

    public void invokeZoomPicker() {
        this.f10338a.invokeZoomPicker();
    }

    public String getUrl() {
        return this.f10338a.getUrl();
    }

    public String getOriginalUrl() {
        return this.f10338a.getOriginalUrl();
    }

    public String getTitle() {
        return this.f10338a.getTitle();
    }

    public Bitmap getFavicon() {
        return this.f10338a.getFavicon();
    }

    public int getProgress() {
        return this.f10338a.getProgress();
    }

    public int getContentHeight() {
        return this.f10338a.getContentHeight();
    }

    public int getContentWidth() {
        return this.f10338a.getContentWidth();
    }

    public void onPause() {
        this.f10338a.onPause();
    }

    public void onResume() {
        this.f10338a.onResume();
    }

    public boolean isPaused() {
        return this.f10338a.isPaused();
    }

    public void freeMemory() {
        this.f10338a.freeMemory();
    }

    public void clearCache(boolean z) {
        this.f10338a.clearCache(z);
    }

    public void clearFormData() {
        this.f10338a.clearFormData();
    }

    public void clearHistory() {
        this.f10338a.clearHistory();
    }

    public void clearSslPreferences() {
        this.f10338a.clearSslPreferences();
    }

    public APWebBackForwardList copyBackForwardList() {
        return this.f10338a.copyBackForwardList();
    }

    public void setDownloadListener(APDownloadListener aPDownloadListener) {
        this.f10338a.setDownloadListener(aPDownloadListener);
    }

    public void removeJavascriptInterface(String str) {
        this.f10338a.removeJavascriptInterface(str);
    }

    public void onRelease() {
        f fVar = this.f10338a;
        if (fVar != null) {
            fVar.c();
            this.f10338a = null;
        }
        this.c = null;
        this.b = null;
        this.d = null;
    }

    public APWebSettings getSettings() {
        return this.f10338a.getSettings();
    }

    public APHitTestResult getHitTestResult() {
        return this.f10338a.getHitTestResult();
    }

    public Picture capturePicture() {
        return this.f10338a.capturePicture();
    }

    public void setAPWebViewListener(APWebViewListener aPWebViewListener) {
        this.f10338a.setAPWebViewListener(aPWebViewListener);
    }

    public View getView() {
        return this.f10338a.getView();
    }

    @Nullable
    public WebViewType getType() {
        f fVar = this.f10338a;
        if (fVar == null) {
            return null;
        }
        return fVar.getType();
    }

    public String getVersion() {
        return this.f10338a.getVersion();
    }

    public float getScale() {
        return this.f10338a.getScale();
    }

    public void setScale(float f) {
        this.f10338a.setScale(f);
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.f10338a.setVerticalScrollBarEnabled(z);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.f10338a.setHorizontalScrollBarEnabled(z);
    }

    public void setOnScrollChangedCallback(H5ScrollChangedCallback h5ScrollChangedCallback) {
        this.f10338a.setOnScrollChangedCallback(h5ScrollChangedCallback);
    }

    public int getScrollY() {
        return this.f10338a.getScrollY();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10338a.dispatchKeyEvent(keyEvent);
    }

    public boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i) {
        return this.f10338a.getCurrentPageSnapshot(rect, rect2, bitmap, z, i);
    }

    public Page getH5Page() {
        f fVar = this.f10338a;
        if (fVar == null) {
            return null;
        }
        return fVar.d();
    }

    public APWebView getInternalContentView() {
        return this.f10338a.e();
    }

    public NXH5WebViewClientAdapter getWebViewClient() {
        return this.d;
    }

    public void setWebViewClient(APWebViewClient aPWebViewClient) {
        this.f10338a.setWebViewClient(aPWebViewClient);
    }

    public APWebChromeClient getWebChromeClient() {
        return this.c.c();
    }

    public void setWebChromeClient(APWebChromeClient aPWebChromeClient) {
        this.f10338a.setWebChromeClient(aPWebChromeClient);
    }

    public void getStartupPerformanceStatistics(ValueCallback<String> valueCallback) {
        this.f10338a.getStartupPerformanceStatistics(valueCallback);
    }
}
