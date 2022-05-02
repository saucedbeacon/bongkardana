package com.iap.ac.android.container.js;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.js.AlipayJSAPI;
import com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative;
import com.iap.ac.android.common.container.js.model.JSBridgeMessageToWeb;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.container.utils.ContainerUtils;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.BuildConfig;
import com.iap.ac.android.container.constant.ContainerErrorCode;
import com.iap.ac.android.container.constant.LogEventKeys;
import com.iap.ac.android.container.constant.LogEventName;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import com.iap.ac.android.container.utils.ResourceUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class ACJSBridge {
    private static ACJSBridge INSTANCE = null;
    public static final String JSAPI_PREFIX = "h5container.message: ";
    private static final String JS_PARAM_PARAM = "param";
    public static final String PARAM_MSG = "msg";
    public static final String PARAM_SUCCESS = "success";
    private static final String TAG = "ACJSBridge";
    @VisibleForTesting
    Map<String, BaseJSPlugin> jsPluginMap = new ConcurrentHashMap();
    private Map<Integer, String> rawCache = new HashMap();

    private ACJSBridge() {
        registerJSAPIPlugin(new ACContainerJSPlugin());
    }

    public void registerJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        if (baseJSPlugin != null) {
            for (Method annotation : baseJSPlugin.getClass().getDeclaredMethods()) {
                AlipayJSAPI alipayJSAPI = (AlipayJSAPI) annotation.getAnnotation(AlipayJSAPI.class);
                if (alipayJSAPI != null) {
                    this.jsPluginMap.put(alipayJSAPI.api(), baseJSPlugin);
                }
            }
        }
    }

    public static synchronized ACJSBridge getInstance() {
        ACJSBridge aCJSBridge;
        synchronized (ACJSBridge.class) {
            if (INSTANCE == null) {
                INSTANCE = new ACJSBridge();
            }
            aCJSBridge = INSTANCE;
        }
        return aCJSBridge;
    }

    public void unregisterJSAPIPlugin(BaseJSPlugin baseJSPlugin) {
        if (baseJSPlugin != null) {
            for (Method annotation : baseJSPlugin.getClass().getDeclaredMethods()) {
                AlipayJSAPI alipayJSAPI = (AlipayJSAPI) annotation.getAnnotation(AlipayJSAPI.class);
                if (alipayJSAPI != null) {
                    String api = alipayJSAPI.api();
                    if (this.jsPluginMap.get(api) != null && baseJSPlugin.equals(this.jsPluginMap.get(api))) {
                        this.jsPluginMap.remove(api);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMsgFromJs(java.lang.String r10, android.webkit.WebView r11, com.iap.ac.android.common.container.IContainerPresenter r12) {
        /*
            r9 = this;
            java.lang.String r0 = "param"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "ACJSBridge"
            r3 = 0
            if (r10 == 0) goto L_0x00f1
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x00f1
            java.lang.String r4 = "h5container.message: "
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x0019
            goto L_0x00f1
        L_0x0019:
            if (r11 != 0) goto L_0x001c
            return r3
        L_0x001c:
            r4 = 21
            java.lang.String r10 = r10.substring(r4)
            java.lang.String r4 = r11.getUrl()
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r7 = "handleMsgFromJs message: "
            r6.<init>(r7)     // Catch:{ Exception -> 0x00cb }
            r6.append(r10)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r7 = ", current url: "
            r6.append(r7)     // Catch:{ Exception -> 0x00cb }
            r6.append(r4)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00cb }
            com.iap.ac.android.common.log.ACLog.d(r2, r6)     // Catch:{ Exception -> 0x00cb }
            r6 = 1009(0x3f1, float:1.414E-42)
            java.lang.Class<com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative> r7 = com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative.class
            java.lang.Object r7 = com.iap.ac.android.common.json.JsonUtils.fromJson((java.lang.String) r10, r7)     // Catch:{ Exception -> 0x00bd }
            com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative r7 = (com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative) r7     // Catch:{ Exception -> 0x00bd }
            if (r7 != 0) goto L_0x005f
            java.lang.String r11 = "handleMsgFromJs error: jsBridgeMessage is null!"
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r2, (java.lang.String) r11)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = "jsBridgeMessage is null. message: "
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x00ba }
            r9.reportJsapiError(r4, r1, r6, r11)     // Catch:{ Exception -> 0x00ba }
            return r3
        L_0x005f:
            java.lang.String r5 = r7.func     // Catch:{ Exception -> 0x00ba }
            boolean r5 = r9.hasJSPermission(r5, r4)     // Catch:{ Exception -> 0x00ba }
            r6 = 1
            if (r5 == 0) goto L_0x0083
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ba }
            r5.<init>(r10)     // Catch:{ Exception -> 0x00ba }
            boolean r8 = r5.has(r0)     // Catch:{ Exception -> 0x00ba }
            if (r8 == 0) goto L_0x007f
            boolean r8 = r5.isNull(r0)     // Catch:{ Exception -> 0x00ba }
            if (r8 != 0) goto L_0x007f
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Exception -> 0x00ba }
            r7.param = r0     // Catch:{ Exception -> 0x00ba }
        L_0x007f:
            r9.handelJSAPI(r7, r11, r12)     // Catch:{ Exception -> 0x00ba }
            return r6
        L_0x0083:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = "JS permission denied. JS function: "
            r12.<init>(r0)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = r7.func     // Catch:{ Exception -> 0x00ba }
            r12.append(r0)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00ba }
            com.iap.ac.android.common.log.ACLog.e(r2, r12)     // Catch:{ Exception -> 0x00ba }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00ba }
            r0.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = "success"
            java.lang.String r8 = "false"
            r0.put(r5, r8)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r5 = "msg"
            java.lang.String r8 = "Permission denied!"
            r0.put(r5, r8)     // Catch:{ Exception -> 0x00ba }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ba }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00ba }
            r9.sendBack(r7, r11, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r7.func     // Catch:{ Exception -> 0x00ba }
            r0 = 1011(0x3f3, float:1.417E-42)
            r9.reportJsapiError(r4, r11, r0, r12)     // Catch:{ Exception -> 0x00ba }
            return r6
        L_0x00ba:
            r11 = move-exception
            r5 = r7
            goto L_0x00cc
        L_0x00bd:
            java.lang.String r11 = "message: "
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x00cb }
            r9.reportJsapiError(r4, r1, r6, r11)     // Catch:{ Exception -> 0x00cb }
            return r3
        L_0x00cb:
            r11 = move-exception
        L_0x00cc:
            com.iap.ac.android.common.log.ACLog.e(r2, r10, r11)
            if (r5 != 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r1 = r5.func
        L_0x00d4:
            r12 = 1012(0x3f4, float:1.418E-42)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = "\n "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.reportJsapiError(r4, r1, r12, r10)
        L_0x00f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.js.ACJSBridge.handleMsgFromJs(java.lang.String, android.webkit.WebView, com.iap.ac.android.common.container.IContainerPresenter):boolean");
    }

    private void reportJsapiError(String str, String str2, int i, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("func", str2);
        hashMap.put(LogEventKeys.SDK_VERSION, BuildConfig.VERSION_NAME);
        hashMap.put("status", "F");
        hashMap.put(LogEventKeys.ERROR_CODE, String.valueOf(i));
        hashMap.put(LogEventKeys.ERROR_MSG, str3);
        ACMonitor.logEvent(new LogEvent(LogEventName.JSAPI_CALL, hashMap));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean hasJSPermission(String str, String str2) {
        try {
            JsApiPermissionProvider jsApiPermissionProvider = (JsApiPermissionProvider) ACContainer.INSTANCE.getProvider(JsApiPermissionProvider.class.getName());
            if (jsApiPermissionProvider != null) {
                return jsApiPermissionProvider.hasDomainPermission(str, str2);
            }
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, "check jsapi permission error: ", e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void handelJSAPI(JSBridgeMessageToNative jSBridgeMessageToNative, WebView webView, IContainerPresenter iContainerPresenter) {
        String str;
        if (jSBridgeMessageToNative != null && !TextUtils.isEmpty(jSBridgeMessageToNative.func)) {
            if (webView == null) {
                str = "";
            } else {
                str = webView.getUrl();
            }
            BaseJSPlugin baseJSPlugin = this.jsPluginMap.get(jSBridgeMessageToNative.func);
            HashMap hashMap = new HashMap();
            if (baseJSPlugin == null) {
                hashMap.put("success", "false");
                StringBuilder sb = new StringBuilder("No JSPlugin found for: ");
                sb.append(jSBridgeMessageToNative.func);
                String obj = sb.toString();
                hashMap.put("msg", obj);
                sendBack(jSBridgeMessageToNative, webView, new JSONObject(hashMap));
                reportJsapiError(str, jSBridgeMessageToNative.func, 1008, obj);
                return;
            }
            try {
                JSONObject onJSEvent = baseJSPlugin.onJSEvent(jSBridgeMessageToNative, iContainerPresenter, new ACBridgeContext(webView));
                if (onJSEvent != null) {
                    sendBack(jSBridgeMessageToNative, webView, onJSEvent);
                }
            } catch (Exception e) {
                ACLog.e(TAG, "", e);
                hashMap.put("success", "false");
                String message = e.getMessage();
                if (e instanceof InvocationTargetException) {
                    InvocationTargetException invocationTargetException = (InvocationTargetException) e;
                    if (invocationTargetException.getTargetException() != null) {
                        message = invocationTargetException.getTargetException().getMessage();
                    }
                }
                hashMap.put("msg", message);
                sendBack(jSBridgeMessageToNative, webView, new JSONObject(hashMap));
                reportJsapiError(str, jSBridgeMessageToNative.func, ContainerErrorCode.JS_RUN_FAIL, e.getMessage());
            }
        }
    }

    public void sendBack(JSBridgeMessageToNative jSBridgeMessageToNative, WebView webView, JSONObject jSONObject) {
        if (webView != null && jSBridgeMessageToNative != null) {
            JSBridgeMessageToWeb jSBridgeMessageToWeb = new JSBridgeMessageToWeb(jSBridgeMessageToNative);
            jSBridgeMessageToWeb.param = jSONObject;
            sendMsgToWeb(jSBridgeMessageToWeb, webView);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void sendMsgToWeb(JSBridgeMessageToWeb jSBridgeMessageToWeb, WebView webView) {
        if (jSBridgeMessageToWeb == null || webView == null) {
            ACLog.w(TAG, "sendMsgToWeb error: jsBridgeMessageToWeb or webView is null!");
            return;
        }
        try {
            if (ContainerUtils.isActivityRunning((Activity) webView.getContext())) {
                String json = JsonUtils.toJson(JsonUtils.toJson(jSBridgeMessageToWeb));
                StringBuilder sb = new StringBuilder();
                sb.append("AlipayJSBridge._invokeJS(");
                sb.append(json);
                sb.append(")");
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder("javascript:(function(){if(typeof AlipayJSBridge === 'object'){");
                sb2.append(obj);
                sb2.append("}})();");
                webView.loadUrl(sb2.toString());
                ACLog.d(TAG, "sendBack javascript: ".concat(String.valueOf(obj)));
            }
        } catch (Throwable th) {
            ACLog.e(TAG, "sendMsgToWeb error!", th);
            reportJsapiError(webView.getUrl(), jSBridgeMessageToWeb.func, 1010, th.getMessage());
        }
    }

    public void loadJavascript(int i, Context context, WebView webView) throws IOException {
        String str;
        if (context != null && webView != null) {
            if (TextUtils.isEmpty(this.rawCache.get(Integer.valueOf(i)))) {
                str = ResourceUtils.readRawFromResource(i, context.getResources());
            } else {
                str = this.rawCache.get(Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(str)) {
                webView.loadUrl(RDConstant.JAVASCRIPT_SCHEME.concat(String.valueOf(str)));
                return;
            }
            throw new IOException("Read raw resource fail!");
        }
    }
}
