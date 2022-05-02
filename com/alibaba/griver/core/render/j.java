package com.alibaba.griver.core.render;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.api.APWebViewListener;
import com.alibaba.griver.base.api.H5EmbededViewProvider;
import com.alibaba.griver.base.api.H5OverScrollListener;
import com.alibaba.griver.core.ui.GriverPage;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class j implements APWebViewListener {

    /* renamed from: a  reason: collision with root package name */
    private static String f10340a = "Griver:NXAPWebViewListener";
    private boolean b = false;
    private GriverPage c;
    private Page d;
    private H5OverScrollListener e;

    public j(Page page, boolean z) {
        this.c = (GriverPage) page;
        this.d = page;
        this.b = z;
    }

    public void a(H5OverScrollListener h5OverScrollListener) {
        this.e = h5OverScrollListener;
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4) {
        String str = f10340a;
        StringBuilder sb = new StringBuilder("overScrollBy: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        RVLogger.d(str, sb.toString());
        H5OverScrollListener h5OverScrollListener = this.e;
        if (h5OverScrollListener == null) {
            return false;
        }
        h5OverScrollListener.onOverScrolled(i, i2, i3, i4);
        return false;
    }

    public IEmbedViewManager getEmbedViewManager() {
        return this.d.getPageContext().getEmbedViewManager();
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        GriverPage griverPage;
        if (!this.b || ((griverPage = this.c) != null && TextUtils.equals("H5Activity", BundleUtils.getString(griverPage.getStartParams(), "createPageSence")))) {
            RVLogger.d(f10340a, "onDetachedFromWindow in createPageSence");
            GriverPage griverPage2 = this.c;
            if (griverPage2 != null) {
                griverPage2.exit(false);
            }
        }
    }

    public View getEmbedView(int i, int i2, String str, String str2, Map<String, String> map) {
        RVLogger.d(f10340a, "H5WebViewClient getEmbedView");
        GriverPage griverPage = this.c;
        if (griverPage == null) {
            return null;
        }
        griverPage.setContainsEmbedView(true);
        H5EmbededViewProvider embededViewProvider = this.c.getEmbededViewProvider();
        if (embededViewProvider == null) {
            return null;
        }
        View embedView = embededViewProvider.getEmbedView(i, i2, str, str2, map);
        if (embedView != null && embedView.getClass().getName().contains("AdapterTextureMapView")) {
            this.c.setContainsEmbedSurfaceView(true);
        }
        return embedView;
    }

    public void onEmbedViewAttachedToWebView(int i, int i2, String str, String str2, Map<String, String> map) {
        H5EmbededViewProvider embededViewProvider;
        RVLogger.d(f10340a, "H5WebViewClient onEmbedViewAttachedToWebView");
        GriverPage griverPage = this.c;
        if (griverPage != null && (embededViewProvider = griverPage.getEmbededViewProvider()) != null) {
            embededViewProvider.onEmbedViewAttachedToWebView(i, i2, str, str2, map);
        }
    }

    public void onEmbedViewDetachedFromWebView(int i, int i2, String str, String str2, Map<String, String> map) {
        H5EmbededViewProvider embededViewProvider;
        RVLogger.d(f10340a, "H5WebViewClient onEmbedViewDetachedFromWebView");
        GriverPage griverPage = this.c;
        if (griverPage != null && (embededViewProvider = griverPage.getEmbededViewProvider()) != null) {
            embededViewProvider.onEmbedViewDetachedFromWebView(i, i2, str, str2, map);
        }
    }

    public void onEmbedViewDestory(int i, int i2, String str, String str2, Map<String, String> map) {
        H5EmbededViewProvider embededViewProvider;
        RVLogger.d(f10340a, "H5WebViewClient onEmbedViewDestory");
        GriverPage griverPage = this.c;
        if (griverPage != null && (embededViewProvider = griverPage.getEmbededViewProvider()) != null) {
            embededViewProvider.onEmbedViewDestory(i, i2, str, str2, map);
        }
    }

    public void onEmbedViewParamChanged(int i, int i2, String str, String str2, Map<String, String> map, String[] strArr, String[] strArr2) {
        H5EmbededViewProvider embededViewProvider;
        int i3 = i;
        int max = dispatchOnCancelled.setMax(i);
        if (i3 != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(303092047, oncanceled);
            onCancelLoad.getMin(303092047, oncanceled);
        }
        RVLogger.d(f10340a, "H5WebViewClient onEmbedViewParamChanged");
        GriverPage griverPage = this.c;
        if (griverPage != null && (embededViewProvider = griverPage.getEmbededViewProvider()) != null) {
            embededViewProvider.onEmbedViewParamChanged(i, i2, str, str2, map, strArr, strArr2);
        }
    }

    public void onEmbedViewVisibilityChanged(int i, int i2, String str, String str2, Map<String, String> map, int i3) {
        H5EmbededViewProvider embededViewProvider;
        RVLogger.d(f10340a, "H5WebViewClient onEmbedViewVisibilityChanged");
        GriverPage griverPage = this.c;
        if (griverPage != null && (embededViewProvider = griverPage.getEmbededViewProvider()) != null) {
            embededViewProvider.onEmbedViewVisibilityChanged(i, i2, str, str2, map, i3);
        }
    }

    public Bitmap getSnapshot(int i, int i2, String str, String str2, Map<String, String> map) {
        H5EmbededViewProvider embededViewProvider;
        RVLogger.d(f10340a, "H5WebViewClient getSnapshot");
        GriverPage griverPage = this.c;
        if (griverPage == null || (embededViewProvider = griverPage.getEmbededViewProvider()) == null) {
            return null;
        }
        return embededViewProvider.getSnapshot(i, i2, str, str2, map);
    }
}
