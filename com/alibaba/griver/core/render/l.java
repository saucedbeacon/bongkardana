package com.alibaba.griver.core.render;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.griver.api.constants.GriverLaunchParams;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.base.nebula.GriverWebViewFlag;
import com.alibaba.griver.base.nebula.H5WebViewChoose;
import com.alibaba.griver.core.webview.k;
import com.uc.webview.export.WebView;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f10353a;

    private l() {
    }

    public static l a() {
        if (f10353a == null) {
            f10353a = new l();
        }
        return f10353a;
    }

    private boolean a(String str, Bundle bundle, boolean z) {
        JSONArray parseArray;
        if (!GriverWebViewFlag.initUcNormal) {
            RVLogger.e("Griver:NXWebViewFactory", "uc init throw exception, so not need init ");
            return true;
        }
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if ((rVConfigService != null && (parseArray = JSONUtils.parseArray(rVConfigService.getConfig("h5_first_init_use_android_webView_biz", ""))) != null && !parseArray.isEmpty() && parseArray.contains(str)) || H5WebViewChoose.useSysWebWillCrash()) {
            return false;
        }
        if (z && rVConfigService != null && "no".equalsIgnoreCase(rVConfigService.getConfig("h5_first_init_use_android_webView_startPage", ""))) {
            return false;
        }
        return true;
    }

    private void a(Context context) {
        H5SplitCompatUtils.doInstall(context);
        H5SplitCompatUtils.doInstall(GriverEnv.getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.griver.base.api.APWebView a(java.lang.String r17, android.content.Context r18, android.os.Bundle r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r6 = r18.getApplicationContext()
            goto L_0x0013
        L_0x0012:
            r6 = r5
        L_0x0013:
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x001c
            int r8 = r17.length()
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            int r6 = o.dispatchOnCancelled.setMin(r6, r8)
            if (r8 == r6) goto L_0x0033
            o.onCanceled r9 = new o.onCanceled
            r10 = 8
            r9.<init>(r8, r6, r10)
            r6 = -604965842(0xffffffffdbf0f42e, float:-1.35644946E17)
            o.onCancelLoad.setMax(r6, r9)
            o.onCancelLoad.getMin(r6, r9)
        L_0x0033:
            long r8 = java.lang.System.currentTimeMillis()
            com.alibaba.griver.base.nebula.WebViewType r6 = com.alibaba.griver.base.nebula.H5WebViewChoose.getWebViewType(r17, r18, r19)
            com.alibaba.fastjson.JSONObject r10 = new com.alibaba.fastjson.JSONObject
            r10.<init>()
            com.alibaba.griver.base.nebula.WebViewType r11 = com.alibaba.griver.base.nebula.WebViewType.THIRD_PARTY
            java.lang.String r12 = "appId"
            java.lang.String r13 = "create android webview failed"
            java.lang.String r14 = "Griver:NXWebViewFactory"
            if (r6 != r11) goto L_0x00ca
            boolean r11 = com.alibaba.griver.base.nebula.GriverWebViewFlag.ucReady
            if (r11 != 0) goto L_0x0064
            boolean r0 = r1.a(r0, r3, r4)
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "uc is not Ready canUseAndroidWebView create android web view "
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)     // Catch:{ all -> 0x005f }
            com.alibaba.griver.core.webview.AndroidWebView r5 = new com.alibaba.griver.core.webview.AndroidWebView     // Catch:{ all -> 0x005f }
            r5.<init>(r2)     // Catch:{ all -> 0x005f }
            goto L_0x00ca
        L_0x005f:
            r0 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r14, r13, r0)
            throw r0
        L_0x0064:
            java.lang.Class<com.alibaba.griver.base.api.NXUcService> r0 = com.alibaba.griver.base.api.NXUcService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            com.alibaba.griver.base.api.NXUcService r0 = (com.alibaba.griver.base.api.NXUcService) r0
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "failed to get uc service"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)
            goto L_0x00ca
        L_0x0074:
            r11 = 1
            java.lang.String r15 = "create uc web view"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r15)     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = r0.createWebView(r2, r11)     // Catch:{ all -> 0x0089 }
            r15 = r0
            com.alibaba.griver.base.api.APWebView r15 = (com.alibaba.griver.base.api.APWebView) r15     // Catch:{ all -> 0x0089 }
            r1.a(r2)     // Catch:{ all -> 0x0086 }
            r5 = r15
            goto L_0x00ca
        L_0x0086:
            r0 = move-exception
            r5 = r15
            goto L_0x008a
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            java.lang.String r7 = "degradeWebView"
            r10.put((java.lang.String) r7, (java.lang.Object) r15)
            java.lang.String r7 = "create uc web view failed"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r14, r7, r0)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder
            r0.<init>()
            java.lang.String r7 = "init uc webview error"
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = r0.message(r7)
            java.lang.String r7 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r3, r12)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = r0.appId(r7)
            java.lang.String r7 = "appVersion"
            java.lang.String r15 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r3, r7)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = r0.version((java.lang.String) r15)
            java.lang.String r7 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r3, r7)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = r0.deployVersion((java.lang.String) r7)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r0 = r0.needAsynAppType(r11)
            java.util.Map r0 = r0.build()
            java.lang.String r7 = "mini_webview_error"
            java.lang.String r11 = "GriverAppContainer"
            com.alibaba.griver.base.common.monitor.GriverMonitor.error(r7, r11, r0)
        L_0x00ca:
            if (r5 != 0) goto L_0x00d8
            boolean r0 = com.alibaba.griver.base.nebula.GriverWebViewFlag.ucReady
            if (r0 != 0) goto L_0x00d8
            com.alibaba.griver.base.nebula.WebViewType r0 = com.alibaba.griver.base.nebula.WebViewType.THIRD_PARTY
            if (r6 != r0) goto L_0x00d8
            r6 = 0
            com.alibaba.griver.base.nebula.H5WebViewChoose.sendUcReceiver(r6)
        L_0x00d8:
            if (r5 != 0) goto L_0x00ee
            java.lang.String r0 = "create android web view"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)     // Catch:{ all -> 0x00e6 }
            com.alibaba.griver.core.webview.AndroidWebView r0 = new com.alibaba.griver.core.webview.AndroidWebView     // Catch:{ all -> 0x00e6 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e6 }
            r5 = r0
            goto L_0x00ee
        L_0x00e6:
            r0 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r14, r13, r0)
            if (r4 != 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            throw r0
        L_0x00ee:
            if (r5 == 0) goto L_0x0106
            java.lang.String r0 = r5.getVersion()
            java.lang.String r2 = "version"
            r10.put((java.lang.String) r2, (java.lang.Object) r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "webview version: "
            java.lang.String r0 = r2.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)
        L_0x0106:
            if (r5 == 0) goto L_0x0119
            com.alibaba.griver.base.nebula.WebViewType r0 = com.alibaba.griver.base.nebula.WebViewType.SYSTEM_BUILD_IN
            com.alibaba.griver.base.nebula.WebViewType r2 = r5.getType()
            if (r0 != r2) goto L_0x0119
            com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r3, r12)
            java.lang.String r0 = "isTinyApp"
            r2 = 0
            com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r3, r0, r2)
        L_0x0119:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r8
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "createWebView elapse "
            java.lang.String r0 = r2.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)
            r1.a(r3, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.render.l.a(java.lang.String, android.content.Context, android.os.Bundle, boolean):com.alibaba.griver.base.api.APWebView");
    }

    private void a(Bundle bundle, APWebView aPWebView) {
        if (!BundleUtils.getBoolean(bundle, RVParams.isH5App, false)) {
            RVLogger.d("Griver:NXWebViewFactory", "mini program not support CONTAINER_BACKGROUND_COLOR field now");
        } else if (BundleUtils.contains(bundle, GriverLaunchParams.CONTAINER_BACKGROUND_COLOR)) {
            int i = BundleUtils.getInt(bundle, GriverLaunchParams.CONTAINER_BACKGROUND_COLOR);
            if (ReflectUtils.classExist("com.uc.webview.export.WebView") && (aPWebView.getView() instanceof WebView) && aPWebView.getView() != null) {
                GriverLogger.d("Griver:NXWebViewFactory", "apWebView.getView() is UC WebView");
                aPWebView.getView().setBackgroundColor(BundleUtils.getInt(bundle, GriverLaunchParams.CONTAINER_BACKGROUND_COLOR));
            }
            if ((aPWebView.getView() instanceof k) && ((k) aPWebView.getView()).getChildAt(0) != null) {
                GriverLogger.d("Griver:NXWebViewFactory", "apWebView.getView() is AndroidWebView");
                ((k) aPWebView.getView()).getChildAt(0).setBackgroundColor(i);
            }
        }
    }
}
