package com.alibaba.griver.core.common.monitor;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.MonitorUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.mpm.interceptor.jsapi.TradePayPlugin;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import o.getTabbarModel;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f10289a;

    static {
        ArrayList arrayList = new ArrayList();
        f10289a = arrayList;
        arrayList.add("tradePay");
        f10289a.add(Constants.JS_API_GET_AUTH_CODE);
        f10289a.add(Constants.JS_API_APPX_RPC);
    }

    public static boolean a(String str) {
        return f10289a.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "monitorKeyAPIResult is invoked ,jsapi name is = "
            r0.<init>(r1)
            java.lang.String r1 = r8.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KeyJSAPIMonitor"
            com.alibaba.griver.base.common.logger.GriverLogger.d(r1, r0)
            java.lang.String r0 = r8.getName()
            int r2 = r0.hashCode()
            r3 = -792868850(0xffffffffd0bdc80e, float:-2.54720369E10)
            r4 = 2
            r5 = 1
            r6 = -1
            r7 = 0
            if (r2 == r3) goto L_0x004a
            r3 = -785307349(0xffffffffd131292b, float:-4.7556243E10)
            if (r2 == r3) goto L_0x0040
            r3 = 1271209124(0x4bc51ca4, float:2.5835848E7)
            if (r2 == r3) goto L_0x0036
            goto L_0x0054
        L_0x0036:
            java.lang.String r2 = "tradePay"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x0040:
            java.lang.String r2 = "getAuthCode"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x004a:
            java.lang.String r2 = "appxrpc"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0054
            r0 = 2
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            if (r0 == 0) goto L_0x009a
            if (r0 == r5) goto L_0x0096
            if (r0 == r4) goto L_0x005c
            goto L_0x0095
        L_0x005c:
            com.alibaba.fastjson.JSONObject r0 = r8.getParams()
            java.lang.String r2 = "requestData"
            com.alibaba.fastjson.JSONArray r0 = r0.getJSONArray(r2)
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r7)
            java.lang.String r2 = "method"
            boolean r3 = r0.containsKey(r2)
            if (r3 != 0) goto L_0x0078
            java.lang.String r8 = "appxrpc jsapi request method is null"
            com.alibaba.griver.base.common.logger.GriverLogger.d(r1, r8)
            return
        L_0x0078:
            java.lang.String r0 = r0.getString(r2)
            int r1 = r0.hashCode()
            r2 = -446948871(0xffffffffe55c19f9, float:-6.4962484E22)
            if (r1 == r2) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            java.lang.String r1 = "getOpenUserInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008f
            r6 = 0
        L_0x008f:
            if (r6 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            d(r8, r9)
        L_0x0095:
            return
        L_0x0096:
            c(r8, r9)
            return
        L_0x009a:
            b(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.common.monitor.b.a(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext, com.alibaba.fastjson.JSONObject):void");
    }

    public static void a(NativeCallContext nativeCallContext) {
        if (nativeCallContext != null && TextUtils.equals("tradePay", nativeCallContext.getName())) {
            b(nativeCallContext);
        }
    }

    private static void b(NativeCallContext nativeCallContext) {
        MonitorMap.Builder c = c(nativeCallContext);
        if (c != null) {
            GriverMonitor.event(GriverMonitorConstants.EVENT_TRADE_PAY_START, "GriverAppContainer", c.build());
        }
    }

    private static void b(NativeCallContext nativeCallContext, JSONObject jSONObject) {
        MonitorMap.Builder c = c(nativeCallContext);
        if (c != null) {
            if (jSONObject.containsKey("error")) {
                c.append("status", "error");
            } else {
                c.append("status", "success");
            }
            try {
                c.append("result", URLEncoder.encode(JSON.toJSONString(jSONObject), getTabbarModel.ENC));
            } catch (Exception e) {
                GriverLogger.e("KeyJSAPIMonitor", "encode result failed", e);
            }
            GriverMonitor.event(GriverMonitorConstants.EVENT_TRADE_PAY, "GriverAppContainer", c.build());
        }
    }

    private static MonitorMap.Builder c(NativeCallContext nativeCallContext) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        Node node = nativeCallContext.getNode();
        if (node instanceof Page) {
            Page page = (Page) node;
            App app = page.getApp();
            builder.appId(app.getAppId()).version(app).url(page.getOriginalURI());
            builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app.getStartParams()));
        } else {
            if (node instanceof App) {
                App app2 = (App) node;
                Page activePage = app2.getActivePage();
                builder.appId(app2.getAppId()).version(app2);
                if (activePage != null) {
                    builder.url(activePage.getOriginalURI());
                }
                builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app2.getStartParams()));
            }
            return null;
        }
        builder.env(GriverEnv.getEnvironment());
        JSONObject params = nativeCallContext.getParams();
        if (params == null) {
            return null;
        }
        String string = params.getString("tradeNO");
        String string2 = params.getString(TradePayPlugin.PAYMENT_URL);
        String string3 = params.getString("orderStr");
        if (!TextUtils.isEmpty(string2)) {
            builder.append("tradeType", TradePayPlugin.PAYMENT_URL).append("tradeInfo", string2);
        } else if (!TextUtils.isEmpty(string3)) {
            builder.append("tradeType", "orderStr").append("tradeInfo", string3);
        } else {
            if (!TextUtils.isEmpty(string)) {
                builder.append("tradeType", "tradeNO").append("tradeInfo", string);
            }
            return null;
        }
        return builder;
    }

    private static void c(NativeCallContext nativeCallContext, JSONObject jSONObject) {
        if (jSONObject != null) {
            StringBuilder sb = new StringBuilder("monitorGetAuthCodeResult is invoked result = ");
            sb.append(JSON.toJSONString(jSONObject));
            GriverLogger.d("KeyJSAPIMonitor", sb.toString());
            MonitorMap.Builder d = d(nativeCallContext);
            if (d != null) {
                if (jSONObject.containsKey("error")) {
                    d.append("status", "error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jSONObject.getIntValue("error"));
                    d.append("errorCode", sb2.toString());
                    d.append("errorMessage", jSONObject.getString("errorMessage"));
                } else {
                    d.append("status", "success");
                }
                GriverMonitor.event("mini_get_auth_code", "GriverAppContainer", d.build());
            }
        }
    }

    private static void d(NativeCallContext nativeCallContext, JSONObject jSONObject) {
        if (jSONObject != null) {
            StringBuilder sb = new StringBuilder("monitorGetOpenUserInfoResult is invoked result = ");
            sb.append(JSON.toJSONString(jSONObject));
            GriverLogger.d("KeyJSAPIMonitor", sb.toString());
            MonitorMap.Builder d = d(nativeCallContext);
            if (d != null) {
                if (jSONObject.containsKey("error")) {
                    d.append("status", "error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jSONObject.getIntValue("error"));
                    d.append("errorCode", sb2.toString());
                    d.append("errorMessage", jSONObject.getString("errorMessage"));
                } else {
                    d.append("status", "success");
                }
                GriverMonitor.event("mini_get_open_user_info", "GriverAppContainer", d.build());
            }
        }
    }

    private static MonitorMap.Builder d(NativeCallContext nativeCallContext) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        Node node = nativeCallContext.getNode();
        if (node instanceof Page) {
            Page page = (Page) node;
            App app = page.getApp();
            builder.appId(app.getAppId()).version(app).url(page.getOriginalURI());
            builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app.getStartParams()));
        } else if (!(node instanceof App)) {
            return null;
        } else {
            App app2 = (App) node;
            Page activePage = app2.getActivePage();
            builder.appId(app2.getAppId()).version(app2);
            if (activePage != null) {
                builder.url(activePage.getOriginalURI());
            }
            builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app2.getStartParams()));
        }
        builder.env(GriverEnv.getEnvironment());
        return builder;
    }
}
