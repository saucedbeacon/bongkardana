package com.alibaba.griver.core.common.monitor;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorAnalyticsConfigExtension;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.rpc.BaseGriverNetwork;
import com.alibaba.griver.core.model.amcs.AMCSConfigByKeysRpcRequest;
import com.alibaba.griver.core.model.amcs.AMCSConfigRpcResult;
import com.alibaba.griver.core.rpc.AMCSConfigRpcFacade;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.verifyidentity.base.message.EnvDataConstants;
import com.iap.ac.android.common.instance.InstanceInfo;
import java.util.ArrayList;

public class GriverMonitorAnalyticsConfigExtensionImpl extends BaseGriverNetwork<AMCSConfigRpcFacade> implements GriverMonitorAnalyticsConfigExtension {
    public void syncMonitorConfig(final App app, final String str, final GriverMonitorAnalyticsConfigExtension.GriverMonitorConfigFetchCallback griverMonitorConfigFetchCallback) {
        ExecutorUtils.execute(ExecutorType.NETWORK, new Runnable() {
            public void run() {
                AMCSConfigByKeysRpcRequest aMCSConfigByKeysRpcRequest = new AMCSConfigByKeysRpcRequest();
                ArrayList arrayList = new ArrayList();
                String string = BundleUtils.getString(app.getStartParams(), "_ariver_event");
                if (TextUtils.isEmpty(string)) {
                    arrayList.add("eventConfig");
                } else {
                    arrayList.add(string);
                }
                arrayList.add("mdapControlConfig");
                aMCSConfigByKeysRpcRequest.keys = arrayList;
                aMCSConfigByKeysRpcRequest.appId = app.getAppId();
                aMCSConfigByKeysRpcRequest.addParameters(GriverMonitorAnalyticsConfigExtensionImpl.a(str));
                try {
                    AMCSConfigRpcResult fetchConfigListByKeys = ((AMCSConfigRpcFacade) GriverMonitorAnalyticsConfigExtensionImpl.this.getFacade()).fetchConfigListByKeys(aMCSConfigByKeysRpcRequest);
                    if (fetchConfigListByKeys == null) {
                        griverMonitorConfigFetchCallback.onFetchFailed("", "empty response");
                    } else {
                        griverMonitorConfigFetchCallback.onFetchSuccess(fetchConfigListByKeys.updateKeys);
                    }
                } catch (RpcException e) {
                    GriverLogger.e("GriverMonitorAnalyticsConfigExtensionImpl", "sync config failed", e);
                    griverMonitorConfigFetchCallback.onFetchFailed(String.valueOf(e.getCode()), e.getMessage());
                } catch (Exception e2) {
                    griverMonitorConfigFetchCallback.onFetchFailed("", e2.getMessage());
                }
            }
        });
    }

    public Class<AMCSConfigRpcFacade> getFacadeClass() {
        return AMCSConfigRpcFacade.class;
    }

    /* access modifiers changed from: private */
    public static JSONObject a(String str) {
        String productVersion = GriverEnv.getProductVersion();
        if (TextUtils.isEmpty(productVersion)) {
            productVersion = "1.0";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tinyAppVersion", (Object) str);
        jSONObject.put("utdid", (Object) InstanceInfo.getInstanceId(GriverEnv.getApplicationContext()));
        jSONObject.put("reference", (Object) GriverAccount.getUserId());
        jSONObject.put("mobileModel", (Object) Build.MODEL);
        jSONObject.put("mobileBrand", (Object) Build.BRAND);
        jSONObject.put(EnvDataConstants.MANUFACTURER, (Object) Build.MANUFACTURER);
        jSONObject.put("osVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_CLIENTVERSION, (Object) productVersion);
        jSONObject.put("systemType", (Object) DeviceUtils.PLATFORM_TYPE);
        return jSONObject;
    }
}
