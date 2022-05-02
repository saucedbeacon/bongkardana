package com.alibaba.griver.base.api;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.alibaba.griver.base.nebula.APWebMessage;
import com.alibaba.griver.base.nebula.WebViewType;
import java.util.Map;

public interface APWebView {
    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    Picture capturePicture();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearSslPreferences();

    APWebBackForwardList copyBackForwardList();

    APWebMessagePort[] createWebMessageChannel();

    void destroy();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void execJavaScript4EmbedView(String str, IH5EmbedViewJSCallback iH5EmbedViewJSCallback);

    void flingScroll(int i, int i2);

    void freeMemory();

    SslCertificate getCertificate();

    int getContentHeight();

    int getContentWidth();

    boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i);

    Bitmap getFavicon();

    APHitTestResult getHitTestResult();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    String getOriginalUrl();

    int getProgress();

    float getScale();

    int getScrollY();

    APWebSettings getSettings();

    String getTitle();

    WebViewType getType();

    String getUrl();

    String getVersion();

    View getView();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void invokeZoomPicker();

    boolean isPaused();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void onPause();

    void onResume();

    boolean overlayHorizontalScrollbar();

    boolean overlayVerticalScrollbar();

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void postUrl(String str, byte[] bArr);

    void postWebMessage(APWebMessage aPWebMessage, Uri uri);

    void reload();

    void removeJavascriptInterface(String str);

    APWebBackForwardList restoreState(Bundle bundle);

    void savePassword(String str, String str2, String str3);

    APWebBackForwardList saveState(Bundle bundle);

    void setAPWebViewListener(APWebViewListener aPWebViewListener);

    void setDownloadListener(APDownloadListener aPDownloadListener);

    void setHorizontalScrollBarEnabled(boolean z);

    void setHorizontalScrollbarOverlay(boolean z);

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    void setNetworkAvailable(boolean z);

    void setOnScrollChangedCallback(H5ScrollChangedCallback h5ScrollChangedCallback);

    void setScale(float f);

    void setVerticalScrollBarEnabled(boolean z);

    void setVerticalScrollbarOverlay(boolean z);

    void setWebChromeClient(APWebChromeClient aPWebChromeClient);

    void setWebContentsDebuggingEnabled(boolean z);

    void setWebViewClient(APWebViewClient aPWebViewClient);

    void stopLoading();

    boolean zoomIn();

    boolean zoomOut();
}
