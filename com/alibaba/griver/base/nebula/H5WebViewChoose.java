package com.alibaba.griver.base.nebula;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.UCUtils;
import com.alibaba.griver.core.GriverParam;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import java.util.HashMap;
import java.util.Map;
import o.restorePresenterStates;

public class H5WebViewChoose {
    public static boolean useSysWebWillCrash() {
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if (rVConfigService != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append("#");
            sb.append(Build.MODEL);
            sb.append("#");
            sb.append(Build.VERSION.SDK_INT);
            String obj = sb.toString();
            JSONArray parseArray = JSONUtils.parseArray(rVConfigService.getConfig("h5_first_init_use_android_webView_phone", ""));
            if (parseArray != null && !parseArray.isEmpty()) {
                for (int i = 0; i < parseArray.size(); i++) {
                    if (obj.equalsIgnoreCase(parseArray.getString(i))) {
                        RVLogger.d("H5WebViewFactory", "h5_first_init_use_android_webView_phone contain use uc");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static WebViewType getWebViewType(String str, Context context, Bundle bundle) {
        RVLogger.d("H5WebViewFactory", "getWebViewType bizType ".concat(String.valueOf(str)));
        if (!a(str, bundle) && !useSysWebWillCrash()) {
            return WebViewType.SYSTEM_BUILD_IN;
        }
        RVLogger.d("H5WebViewFactory", "bizType match online config to use uc webview");
        if (UCUtils.UCExist()) {
            return WebViewType.THIRD_PARTY;
        }
        RVLogger.d("H5WebViewFactory", "griver uc module not exists");
        return WebViewType.SYSTEM_BUILD_IN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.alibaba.fastjson.JSONAware} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5 A[EDGE_INSN: B:72:0x00d5->B:57:0x00d5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r10, android.os.Bundle r11) {
        /*
            java.lang.String r0 = "h5_webViewConfig"
            java.lang.String r1 = ""
            java.lang.String r0 = com.alibaba.griver.base.common.config.GriverConfig.getConfig(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "h5_webViewConfig "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "H5WebViewFactory"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r1)
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)
            java.lang.String r1 = "h5_enableExternalWebView"
            java.lang.String r1 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "YES"
            boolean r1 = r3.equalsIgnoreCase(r1)
            goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            r3 = 0
            if (r1 != 0) goto L_0x0034
            return r3
        L_0x0034:
            r1 = 0
            java.lang.String r5 = "h5_externalWebViewUsageRule"
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONObject(r0, r5, r1)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = "h5_externalWebViewSdkVersion"
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONObject(r0, r6, r1)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = "h5_externalWebViewModel"
            com.alibaba.fastjson.JSONArray r7 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r7, r1)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r8 = "h5_externalWebView4UC"
            com.alibaba.fastjson.JSONArray r1 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r8, r1)     // Catch:{ Exception -> 0x004e }
            goto L_0x005f
        L_0x004e:
            r0 = move-exception
            goto L_0x005a
        L_0x0050:
            r0 = move-exception
            r7 = r1
            goto L_0x005a
        L_0x0053:
            r0 = move-exception
            r6 = r1
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            r5 = r1
            r6 = r5
        L_0x0059:
            r7 = r6
        L_0x005a:
            java.lang.String r8 = "exception detail"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r2, r8, r0)
        L_0x005f:
            boolean r11 = a((com.alibaba.fastjson.JSONArray) r1, (android.os.Bundle) r11)
            if (r11 == 0) goto L_0x006c
            java.lang.String r11 = "disable ucwebview by h5_externalWebView4UC"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r11)
            r11 = 0
            goto L_0x006d
        L_0x006c:
            r11 = 1
        L_0x006d:
            if (r11 == 0) goto L_0x00ac
            java.util.HashMap r11 = b(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "min"
            boolean r6 = r11.containsKey(r1)
            java.lang.String r8 = "disable ucwebview by h5_externalWebViewSdkVersion"
            if (r6 == 0) goto L_0x00a8
            java.lang.String r6 = "max"
            boolean r9 = r11.containsKey(r6)
            if (r9 == 0) goto L_0x00a8
            java.lang.Object r1 = r11.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 > r0) goto L_0x00a1
            java.lang.Object r11 = r11.get(r6)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r0 > r11) goto L_0x00a1
            r11 = 1
            goto L_0x00a2
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            if (r11 != 0) goto L_0x00ac
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r8)
            goto L_0x00ac
        L_0x00a8:
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r8)
            r11 = 0
        L_0x00ac:
            if (r11 == 0) goto L_0x00d5
            if (r7 == 0) goto L_0x00d5
            r0 = 0
        L_0x00b1:
            int r1 = r7.size()
            if (r0 >= r1) goto L_0x00d5
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r6 = android.os.Build.MODEL
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = android.os.Build.MODEL
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00d2
            java.lang.String r11 = "disable ucwebview by h5_externalWebViewModel"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r11)
            r11 = 0
            goto L_0x00d5
        L_0x00d2:
            int r0 = r0 + 1
            goto L_0x00b1
        L_0x00d5:
            if (r11 == 0) goto L_0x0107
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0106
            java.util.HashMap r11 = a(r5)
            int r0 = r11.size()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "SYSTEM_BUILD_IN"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = "disable ucwebview by h5_externalWebViewUsageRule"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r10)
            return r3
        L_0x00fb:
            java.lang.String r10 = "THIRDPARTY"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r10)
            return r4
        L_0x0101:
            java.lang.String r10 = "rulesInMap is null, default"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r10)
        L_0x0106:
            return r4
        L_0x0107:
            java.lang.String r10 = "disable ucwebview finally"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.nebula.H5WebViewChoose.a(java.lang.String, android.os.Bundle):boolean");
    }

    private static HashMap<String, String> a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                for (Map.Entry next : jSONObject.entrySet()) {
                    try {
                        hashMap.put(next.getKey(), (String) next.getValue());
                    } catch (ClassCastException e) {
                        RVLogger.e("H5WebViewFactory", "exception detail", e);
                    }
                }
            } catch (Exception e2) {
                RVLogger.e("H5WebViewFactory", "exception detail.", e2);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Integer> b(JSONObject jSONObject) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (jSONObject != null) {
            for (Map.Entry next : jSONObject.entrySet()) {
                hashMap.put(next.getKey(), Integer.valueOf(((Number) next.getValue()).intValue()));
            }
        }
        return hashMap;
    }

    public static void sendUcReceiver(boolean z) {
        restorePresenterStates length = restorePresenterStates.length(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
        Intent intent = new Intent("h5_action_uc_init_finish_completely");
        intent.putExtra("result", z);
        length.setMin(intent);
    }

    public static boolean notNeedInitUc(Bundle bundle) {
        boolean z = getWebViewType(getBizType(bundle), ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), bundle) == WebViewType.THIRD_PARTY;
        StringBuilder sb = new StringBuilder("ucReady ");
        sb.append(GriverWebViewFlag.ucReady);
        sb.append(" useUc ");
        sb.append(z);
        sb.append(" needInitUc ");
        sb.append(GriverWebViewFlag.initUcNormal);
        RVLogger.d("H5WebViewFactory", sb.toString());
        return GriverWebViewFlag.ucReady || !z || !GriverWebViewFlag.initUcNormal;
    }

    public static String getBizType(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = BundleUtils.getString(bundle, "bizType", "");
        if (TextUtils.isEmpty(string)) {
            string = BundleUtils.getString(bundle, GriverParam.PUBLIC_ID, "");
        }
        return TextUtils.isEmpty(string) ? BundleUtils.getString(bundle, "appId") : string;
    }

    private static boolean a(JSONArray jSONArray, Bundle bundle) {
        boolean z;
        JSONArray jSONArray2 = jSONArray;
        Bundle bundle2 = bundle;
        if (jSONArray2 != null && !jSONArray.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append("#");
            sb.append(Build.MODEL);
            sb.append("#");
            sb.append(Build.VERSION.SDK_INT);
            String obj = sb.toString();
            String string = BundleUtils.getString(bundle2, "appId");
            String string2 = BundleUtils.getString(bundle2, "url");
            StringBuilder sb2 = new StringBuilder("disableUcWebView phoneInfo is ");
            sb2.append(obj);
            sb2.append(", appId is ");
            sb2.append(string);
            sb2.append(", entryUrl is ");
            sb2.append(string2);
            RVLogger.d("H5WebViewFactory", sb2.toString());
            StringBuilder sb3 = new StringBuilder("disableUcWebView jsonArray is ");
            sb3.append(jSONArray.toJSONString());
            RVLogger.d("H5WebViewFactory", sb3.toString());
            for (int i = 0; i < jSONArray.size(); i++) {
                RVLogger.d("H5WebViewFactory", "disableUcWebView loop jsonArray round ".concat(String.valueOf(i)));
                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                int size = jSONObject.size();
                if (jSONObject != null) {
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (String next : jSONObject.keySet()) {
                        String string3 = jSONObject.getString(next);
                        if (UIConstants.KEY_PHONE_INFO.equalsIgnoreCase(next)) {
                            z2 = obj.equalsIgnoreCase(string3);
                        }
                        if ("appId".equalsIgnoreCase(next)) {
                            z3 = TextUtils.equals(string, string3);
                        }
                        if ("entryUrl".equalsIgnoreCase(next)) {
                            z4 = TextUtils.equals(string2, string3);
                        }
                    }
                    if (size != 1 || (!z2 && !z3 && !z4)) {
                        if (size == 2) {
                            if (z2 && z3) {
                                StringBuilder sb4 = new StringBuilder("disableUcWebView loop object in round ");
                                sb4.append(i);
                                sb4.append(", pi && ai break");
                                RVLogger.d("H5WebViewFactory", sb4.toString());
                            } else if (z2 && z4) {
                                StringBuilder sb5 = new StringBuilder("disableUcWebView loop object in round ");
                                sb5.append(i);
                                sb5.append(", pi && eu break");
                                RVLogger.d("H5WebViewFactory", sb5.toString());
                            } else if (z3 && z4) {
                                StringBuilder sb6 = new StringBuilder("disableUcWebView loop object in round ");
                                sb6.append(i);
                                sb6.append(", ai && eu break");
                                RVLogger.d("H5WebViewFactory", sb6.toString());
                            }
                        }
                        if (size == 3 && z2 && z3 && z4) {
                            StringBuilder sb7 = new StringBuilder("disableUcWebView loop object in round ");
                            sb7.append(i);
                            sb7.append(", pi && ai && eu break");
                            RVLogger.d("H5WebViewFactory", sb7.toString());
                        }
                    } else {
                        StringBuilder sb8 = new StringBuilder("disableUcWebView loop object in round ");
                        sb8.append(i);
                        sb8.append(", pi || ai || eu break");
                        RVLogger.d("H5WebViewFactory", sb8.toString());
                    }
                    z = true;
                    break;
                }
            }
        }
        z = false;
        RVLogger.d("H5WebViewFactory", "disableUcWebView result ".concat(String.valueOf(z)));
        return z;
    }
}
