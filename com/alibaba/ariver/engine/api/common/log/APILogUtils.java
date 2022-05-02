package com.alibaba.ariver.engine.api.common.log;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.store.JsAPICallStore;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.alibaba.ariver.kernel.common.log.AppLogConfigProxy;
import com.alibaba.ariver.kernel.common.log.AppLogUtils;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;

public class APILogUtils {

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f10057a = null;
    private static boolean b = false;
    private static Set<String> c;
    private static Set<String> d;

    private static void a() {
        if (!b) {
            AppLogConfigProxy appLogConfigProxy = (AppLogConfigProxy) RVProxy.get(AppLogConfigProxy.class);
            f10057a = appLogConfigProxy.getIgnoreAPIList();
            c = appLogConfigProxy.getIgnoreInputAPIList();
            b = true;
        }
    }

    public static void logApiDispatch(NativeCallContext nativeCallContext) {
        if (nativeCallContext != null) {
            try {
                RVLogger.d("AriverEngine:APILogUtils", "logApiDispatch");
                a();
                String name = nativeCallContext.getName();
                JSONObject params = nativeCallContext.getParams();
                if ("internalAPI".equals(name)) {
                    String string = JSONUtils.getString(params, FirebaseAnalytics.Param.METHOD);
                    if (!TextUtils.isEmpty(string) && a(f10057a, string)) {
                        RVLogger.d("AriverEngine:APILogUtils", String.format("logApiDispatch internalAPI [%s] ignore.", new Object[]{string}));
                        return;
                    }
                }
                if (a(f10057a, name)) {
                    RVLogger.d("AriverEngine:APILogUtils", String.format("logApiDispatch [%s] ignore.", new Object[]{name}));
                    return;
                }
                if (!"internalAPI".equals(name) && (nativeCallContext.getNode() instanceof DataNode)) {
                    ((JsAPICallStore) ((DataNode) nativeCallContext.getNode()).getData(JsAPICallStore.class, true)).append(name);
                }
                ApiLog.Builder apiName = ((ApiLog.Builder) ((ApiLog.Builder) ((ApiLog.Builder) new ApiLog.Builder().setParentId(AppLogUtils.getParentId(nativeCallContext.getNode()))).setGroupId(nativeCallContext.getId())).setState("start")).setApiName(nativeCallContext.getName());
                if (!a(c, name)) {
                    String originalData = nativeCallContext.getOriginalData() != null ? nativeCallContext.getOriginalData() : JSONUtils.toString(params);
                    if (originalData.length() > 500) {
                        originalData = originalData.substring(0, 500);
                    }
                    apiName.setData(originalData);
                } else {
                    RVLogger.d("AriverEngine:APILogUtils", String.format("logApiDispatch [%s] ignore input.", new Object[]{name}));
                }
                AppLogger.log(apiName.build());
            } catch (Exception e) {
                RVLogger.e("AriverEngine:APILogUtils", "onCallDispatch log error", e);
            }
        }
    }

    public static void logApiSendBack(NativeCallContext nativeCallContext, JSONObject jSONObject, String str) {
        if (nativeCallContext != null) {
            try {
                RVLogger.d("AriverEngine:APILogUtils", "logApiSendBack");
                a();
                String name = nativeCallContext.getName();
                if (a(f10057a, name)) {
                    RVLogger.d("AriverEngine:APILogUtils", String.format("logApiSendBack [%s] ignore.", new Object[]{name}));
                    return;
                }
                ApiLog.Builder builder = (ApiLog.Builder) ((ApiLog.Builder) new ApiLog.Builder().setParentId(AppLogUtils.getParentId(nativeCallContext.getNode()))).setApiName(nativeCallContext.getName()).setGroupId(nativeCallContext.getId());
                if (!a(d, name)) {
                    if (str.length() > 500) {
                        str = str.substring(0, 500);
                    }
                    builder.setData(str);
                } else {
                    RVLogger.d("AriverEngine:APILogUtils", String.format("logApiSendBack [%s] ignore output.", new Object[]{name}));
                }
                if (jSONObject != null) {
                    Integer integer = jSONObject.getInteger("error");
                    if (integer == null || integer.intValue() == 0) {
                        builder.setState("success");
                    } else {
                        builder.setState("error");
                        builder.setErrCode(integer.intValue());
                    }
                } else {
                    builder.setState("success");
                }
                AppLogger.log(builder.build());
            } catch (Exception e) {
                RVLogger.e("AriverEngine:APILogUtils", "onSendBack log error", e);
            }
        }
    }

    private static boolean a(Set<String> set, String str) {
        return set != null && set.contains(str);
    }
}
