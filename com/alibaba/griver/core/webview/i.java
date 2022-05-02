package com.alibaba.griver.core.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.api.APWebSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class i implements APWebSettings {

    /* renamed from: a  reason: collision with root package name */
    private static Method f10390a;
    private WebSettings b;

    public final String getDefaultUserAgent(Context context) {
        return null;
    }

    public final void setEnableFastScroller(boolean z) {
    }

    public final void setPageCacheCapacity(int i) {
    }

    i(WebSettings webSettings) {
        this.b = webSettings;
        if (webSettings != null && Build.VERSION.SDK_INT >= 21) {
            if (f10390a == null) {
                try {
                    f10390a = this.b.getClass().getMethod("setMixedContentMode", new Class[]{Integer.TYPE});
                } catch (NoSuchMethodException e) {
                    RVLogger.e("AndroidWebSettings", "Exception", e);
                }
            }
            Method method = f10390a;
            if (method != null) {
                try {
                    method.invoke(this.b, new Object[]{0});
                } catch (IllegalAccessException e2) {
                    RVLogger.e("AndroidWebSettings", "AndroidWebSettings IllegalAccessException", e2);
                } catch (InvocationTargetException e3) {
                    RVLogger.e("AndroidWebSettings", "AndroidWebSettings InvocationTargetException", e3);
                }
            }
        }
    }

    public final void setSupportZoom(boolean z) {
        this.b.setSupportZoom(z);
    }

    public final boolean supportZoom() {
        return this.b.supportZoom();
    }

    @TargetApi(17)
    public final boolean getMediaPlaybackRequiresUserGesture() {
        if (Build.VERSION.SDK_INT >= 17) {
            return this.b.getMediaPlaybackRequiresUserGesture();
        }
        return false;
    }

    @TargetApi(17)
    public final void setMediaPlaybackRequiresUserGesture(boolean z) {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                this.b.setMediaPlaybackRequiresUserGesture(z);
            } catch (NoSuchMethodError e) {
                RVLogger.e("AndroidWebSettings", "There is no method some models.", e);
            }
        }
    }

    public final boolean getBuiltInZoomControls() {
        return this.b.getBuiltInZoomControls();
    }

    @TargetApi(11)
    public final void setBuiltInZoomControls(boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.setBuiltInZoomControls(z);
        }
    }

    @TargetApi(11)
    public final boolean getDisplayZoomControls() {
        if (Build.VERSION.SDK_INT >= 11) {
            return this.b.getDisplayZoomControls();
        }
        return false;
    }

    @TargetApi(11)
    public final void setDisplayZoomControls(boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.setDisplayZoomControls(z);
        }
    }

    public final boolean getAllowFileAccess() {
        return this.b.getAllowFileAccess();
    }

    public final void setAllowFileAccess(boolean z) {
        this.b.setAllowFileAccess(z);
    }

    @TargetApi(11)
    public final boolean getAllowContentAccess() {
        if (Build.VERSION.SDK_INT >= 11) {
            return this.b.getAllowContentAccess();
        }
        return false;
    }

    @TargetApi(11)
    public final void setAllowContentAccess(boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.b.setAllowContentAccess(z);
        }
    }

    public final boolean getLoadWithOverviewMode() {
        return this.b.getLoadWithOverviewMode();
    }

    public final void setLoadWithOverviewMode(boolean z) {
        this.b.setLoadWithOverviewMode(z);
    }

    public final boolean getSaveFormData() {
        return this.b.getSaveFormData();
    }

    public final void setSaveFormData(boolean z) {
        this.b.setSaveFormData(z);
    }

    public final boolean getSavePassword() {
        return this.b.getSavePassword();
    }

    public final void setSavePassword(boolean z) {
        this.b.setSavePassword(z);
    }

    @TargetApi(14)
    public final int getTextZoom() {
        if (Build.VERSION.SDK_INT >= 14) {
            return this.b.getTextZoom();
        }
        return 10;
    }

    @TargetApi(14)
    public final void setTextZoom(int i) {
        if (Build.VERSION.SDK_INT >= 14) {
            this.b.setTextZoom(i);
        }
    }

    public final APWebSettings.TextSize getTextSize() {
        return APWebSettings.TextSize.valueOf(this.b.getTextSize().name());
    }

    public final void setTextSize(APWebSettings.TextSize textSize) {
        WebSettings.TextSize textSize2;
        int i = AnonymousClass1.f10391a[textSize.ordinal()];
        if (i == 1) {
            textSize2 = WebSettings.TextSize.LARGER;
        } else if (i == 2) {
            textSize2 = WebSettings.TextSize.LARGEST;
        } else if (i == 3) {
            textSize2 = WebSettings.TextSize.NORMAL;
        } else if (i != 4) {
            textSize2 = i != 5 ? null : WebSettings.TextSize.SMALLEST;
        } else {
            textSize2 = WebSettings.TextSize.SMALLER;
        }
        if (textSize2 != null) {
            this.b.setTextSize(textSize2);
        }
    }

    public final APWebSettings.ZoomDensity getDefaultZoom() {
        return APWebSettings.ZoomDensity.valueOf(this.b.getDefaultZoom().name());
    }

    public final boolean getUseWideViewPort() {
        return this.b.getUseWideViewPort();
    }

    public final void setUseWideViewPort(boolean z) {
        this.b.setUseWideViewPort(z);
    }

    public final void setSupportMultipleWindows(boolean z) {
        this.b.setSupportMultipleWindows(z);
    }

    public final boolean supportMultipleWindows() {
        return this.b.supportMultipleWindows();
    }

    public final APWebSettings.LayoutAlgorithm getLayoutAlgorithm() {
        return APWebSettings.LayoutAlgorithm.valueOf(this.b.getLayoutAlgorithm().name());
    }

    @TargetApi(19)
    public final void setLayoutAlgorithm(APWebSettings.LayoutAlgorithm layoutAlgorithm) {
        WebSettings.LayoutAlgorithm layoutAlgorithm2;
        int i = AnonymousClass1.b[layoutAlgorithm.ordinal()];
        if (i == 1) {
            layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
        } else if (i == 2) {
            layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NORMAL;
        } else if (i != 3) {
            layoutAlgorithm2 = (i == 4 && Build.VERSION.SDK_INT >= 19) ? WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING : null;
        } else {
            layoutAlgorithm2 = WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
        }
        if (layoutAlgorithm2 != null) {
            this.b.setLayoutAlgorithm(layoutAlgorithm2);
        }
    }

    public final String getStandardFontFamily() {
        return this.b.getStandardFontFamily();
    }

    public final void setStandardFontFamily(String str) {
        this.b.setStandardFontFamily(str);
    }

    public final String getFixedFontFamily() {
        return this.b.getFixedFontFamily();
    }

    public final void setFixedFontFamily(String str) {
        this.b.setFixedFontFamily(str);
    }

    public final String getSansSerifFontFamily() {
        return this.b.getSansSerifFontFamily();
    }

    public final void setSansSerifFontFamily(String str) {
        this.b.setSansSerifFontFamily(str);
    }

    public final String getSerifFontFamily() {
        return this.b.getSerifFontFamily();
    }

    public final void setSerifFontFamily(String str) {
        this.b.setSerifFontFamily(str);
    }

    public final String getCursiveFontFamily() {
        return this.b.getCursiveFontFamily();
    }

    public final void setCursiveFontFamily(String str) {
        this.b.setCursiveFontFamily(str);
    }

    public final String getFantasyFontFamily() {
        return this.b.getFantasyFontFamily();
    }

    public final void setFantasyFontFamily(String str) {
        this.b.setFantasyFontFamily(str);
    }

    public final int getMinimumFontSize() {
        return this.b.getMinimumFontSize();
    }

    public final void setMinimumFontSize(int i) {
        this.b.setMinimumFontSize(i);
    }

    public final int getMinimumLogicalFontSize() {
        return this.b.getMinimumLogicalFontSize();
    }

    public final void setMinimumLogicalFontSize(int i) {
        this.b.setMinimumLogicalFontSize(i);
    }

    public final int getDefaultFontSize() {
        return this.b.getDefaultFontSize();
    }

    public final void setDefaultFontSize(int i) {
        this.b.setDefaultFontSize(i);
    }

    public final int getDefaultFixedFontSize() {
        return this.b.getDefaultFixedFontSize();
    }

    public final void setDefaultFixedFontSize(int i) {
        this.b.setDefaultFixedFontSize(i);
    }

    public final boolean getLoadsImagesAutomatically() {
        return this.b.getLoadsImagesAutomatically();
    }

    public final void setLoadsImagesAutomatically(boolean z) {
        this.b.setLoadsImagesAutomatically(z);
    }

    public final boolean getBlockNetworkImage() {
        return this.b.getBlockNetworkImage();
    }

    public final void setBlockNetworkImage(boolean z) {
        this.b.setBlockNetworkImage(z);
    }

    public final boolean getJavaScriptEnabled() {
        return this.b.getJavaScriptEnabled();
    }

    public final void setJavaScriptEnabled(boolean z) {
        this.b.setJavaScriptEnabled(z);
    }

    public final void setGeolocationDatabasePath(String str) {
        this.b.setGeolocationDatabasePath(str);
    }

    public final void setAppCacheEnabled(boolean z) {
        this.b.setAppCacheEnabled(z);
    }

    public final void setAppCachePath(String str) {
        this.b.setAppCachePath(str);
    }

    public final boolean getDatabaseEnabled() {
        return this.b.getDatabaseEnabled();
    }

    public final void setDatabaseEnabled(boolean z) {
        this.b.setDatabaseEnabled(z);
    }

    public final boolean getDomStorageEnabled() {
        return this.b.getDomStorageEnabled();
    }

    public final void setDomStorageEnabled(boolean z) {
        this.b.setDomStorageEnabled(z);
    }

    public final String getDatabasePath() {
        return this.b.getDatabasePath();
    }

    public final void setDatabasePath(String str) {
        this.b.setDatabasePath(str);
    }

    public final void setGeolocationEnabled(boolean z) {
        this.b.setGeolocationEnabled(z);
    }

    @TargetApi(16)
    public final boolean getAllowUniversalAccessFromFileURLs() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.b.getAllowUniversalAccessFromFileURLs();
        }
        return false;
    }

    @TargetApi(16)
    public final void setAllowUniversalAccessFromFileURLs(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.b.setAllowUniversalAccessFromFileURLs(z);
        }
    }

    @TargetApi(16)
    public final boolean getAllowFileAccessFromFileURLs() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.b.getAllowFileAccessFromFileURLs();
        }
        return false;
    }

    @TargetApi(16)
    public final void setAllowFileAccessFromFileURLs(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.b.setAllowFileAccessFromFileURLs(z);
        }
    }

    public final APWebSettings.PluginState getPluginState() {
        return APWebSettings.PluginState.valueOf(this.b.getPluginState().name());
    }

    /* renamed from: com.alibaba.griver.core.webview.i$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10391a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        static {
            /*
                com.alibaba.griver.base.api.APWebSettings$PluginState[] r0 = com.alibaba.griver.base.api.APWebSettings.PluginState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                com.alibaba.griver.base.api.APWebSettings$PluginState r2 = com.alibaba.griver.base.api.APWebSettings.PluginState.OFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.griver.base.api.APWebSettings$PluginState r3 = com.alibaba.griver.base.api.APWebSettings.PluginState.ON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.griver.base.api.APWebSettings$PluginState r4 = com.alibaba.griver.base.api.APWebSettings.PluginState.ON_DEMAND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.alibaba.griver.base.api.APWebSettings$LayoutAlgorithm[] r3 = com.alibaba.griver.base.api.APWebSettings.LayoutAlgorithm.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                b = r3
                com.alibaba.griver.base.api.APWebSettings$LayoutAlgorithm r4 = com.alibaba.griver.base.api.APWebSettings.LayoutAlgorithm.NARROW_COLUMNS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.alibaba.griver.base.api.APWebSettings$LayoutAlgorithm r4 = com.alibaba.griver.base.api.APWebSettings.LayoutAlgorithm.NORMAL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.alibaba.griver.base.api.APWebSettings$LayoutAlgorithm r4 = com.alibaba.griver.base.api.APWebSettings.LayoutAlgorithm.SINGLE_COLUMN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.alibaba.griver.base.api.APWebSettings$LayoutAlgorithm r5 = com.alibaba.griver.base.api.APWebSettings.LayoutAlgorithm.TEXT_AUTOSIZING     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                com.alibaba.griver.base.api.APWebSettings$TextSize[] r4 = com.alibaba.griver.base.api.APWebSettings.TextSize.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10391a = r4
                com.alibaba.griver.base.api.APWebSettings$TextSize r5 = com.alibaba.griver.base.api.APWebSettings.TextSize.LARGER     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f10391a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.alibaba.griver.base.api.APWebSettings$TextSize r4 = com.alibaba.griver.base.api.APWebSettings.TextSize.LARGEST     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f10391a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.alibaba.griver.base.api.APWebSettings$TextSize r1 = com.alibaba.griver.base.api.APWebSettings.TextSize.NORMAL     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f10391a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.alibaba.griver.base.api.APWebSettings$TextSize r1 = com.alibaba.griver.base.api.APWebSettings.TextSize.SMALLER     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f10391a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.alibaba.griver.base.api.APWebSettings$TextSize r1 = com.alibaba.griver.base.api.APWebSettings.TextSize.SMALLEST     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.webview.i.AnonymousClass1.<clinit>():void");
        }
    }

    public final void setPluginState(APWebSettings.PluginState pluginState) {
        int i = AnonymousClass1.c[pluginState.ordinal()];
        if (i == 1) {
            this.b.setPluginState(WebSettings.PluginState.OFF);
        } else if (i == 2) {
            this.b.setPluginState(WebSettings.PluginState.ON);
        } else if (i == 3) {
            this.b.setPluginState(WebSettings.PluginState.ON_DEMAND);
        }
    }

    public final boolean getJavaScriptCanOpenWindowsAutomatically() {
        return this.b.getJavaScriptCanOpenWindowsAutomatically();
    }

    public final void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        this.b.setJavaScriptCanOpenWindowsAutomatically(z);
    }

    public final String getDefaultTextEncodingName() {
        return this.b.getDefaultTextEncodingName();
    }

    public final void setDefaultTextEncodingName(String str) {
        this.b.setDefaultTextEncodingName(str);
    }

    public final String getUserAgentString() {
        return this.b.getUserAgentString();
    }

    public final void setUserAgentString(String str) {
        this.b.setUserAgentString(str);
    }

    public final void setNeedInitialFocus(boolean z) {
        this.b.setNeedInitialFocus(z);
    }

    public final int getCacheMode() {
        return this.b.getCacheMode();
    }

    public final void setCacheMode(int i) {
        this.b.setCacheMode(i);
    }
}
