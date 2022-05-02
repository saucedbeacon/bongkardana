package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.json.JSONObject;

public class Interceptor4rpc extends BaseInterceptor {
    private static final String ERROR_CODE = "10";
    private static final String ERROR_MESSAGE = "Network error";
    private static final String PARAM_PACKAGE_GATEWAY = "gateway";
    private static final String PARAM_PACKAGE_HEADERS = "headers";
    private static final String PARAM_PACKAGE_OPERATION_TYPE = "operationType";
    protected static final String PARAM_PACKAGE_REQUEST_DATA = "requestData";
    private static final String TAG = "IAPConnectPlugin";

    /* access modifiers changed from: protected */
    public String getBizId() {
        return "ac_biz";
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage(Throwable th) {
        return ERROR_MESSAGE;
    }

    /* access modifiers changed from: protected */
    public String getNetworkErrorCode(Throwable th) {
        return "10";
    }

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4rpc#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("rpc", "parameter is null"));
            return;
        }
        final String optString = jSONObject.optString("operationType");
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4rpc#handle, operationType is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("rpc", "operationType is empty"));
            return;
        }
        final String requestData = getRequestData(jSONObject);
        final String optString2 = jSONObject.optString(PARAM_PACKAGE_GATEWAY);
        final Map<String, String> json2StringMap = Utils.json2StringMap(jSONObject.optJSONObject(PARAM_PACKAGE_HEADERS));
        final IAPConnectPluginCallback iAPConnectPluginCallback2 = iAPConnectPluginCallback;
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                Interceptor4rpc.this.invokeRpc(optString, requestData, optString2, json2StringMap, iAPConnectPluginCallback2);
            }
        });
    }

    /* access modifiers changed from: private */
    public void invokeRpc(String str, String str2, final String str3, final Map<String, String> map, IAPConnectPluginCallback iAPConnectPluginCallback) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-244783107, oncanceled);
            onCancelLoad.getMin(-244783107, oncanceled);
        }
        StringBuilder sb = new StringBuilder("Interceptor4rpc#invokeRpc, start to send RPC request, operationType: ");
        sb.append(str);
        sb.append(", requestData: ");
        sb.append(str2);
        sb.append(", gateway: ");
        sb.append(str3);
        sb.append(", headers: ");
        sb.append(map);
        ACLog.d("IAPConnectPlugin", sb.toString());
        try {
            String executeRPC = ((SimpleRpcService) RPCProxyHost.getInterfaceProxy(SimpleRpcService.class, getBizId(), new RPCProxyHost.RpcInvocationHandlerListener() {
                public void onBeforeSend(@NonNull RpcRequest rpcRequest) {
                    if (!TextUtils.isEmpty(str3) && !map.isEmpty()) {
                        ACLog.d("IAPConnectPlugin", "Interceptor4rpc#invokeRpc, set gateway and headers to RPC");
                        RpcAppInfo rpcAppInfo = new RpcAppInfo();
                        rpcAppInfo.rpcGateWayUrl = str3;
                        rpcAppInfo.headers = map;
                        rpcRequest.setRpcAppInfo(rpcAppInfo);
                    }
                }
            })).executeRPC(str, str2);
            ACLog.d("IAPConnectPlugin", "Interceptor4rpc#invokeRpc, result: ".concat(String.valueOf(executeRPC)));
            iAPConnectPluginCallback.onResult(new JSONObject(executeRPC));
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Interceptor4rpc#invokeRpc, error: ");
            sb2.append(th.getMessage());
            ACLog.e("IAPConnectPlugin", sb2.toString());
            iAPConnectPluginCallback.onResult(CallbackUtil.getError("rpc", getNetworkErrorCode(th), getErrorMessage(th)));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r4 = r4.optJSONArray("requestData");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getRequestData(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "requestData"
            java.lang.String r1 = r4.optString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0016
            org.json.JSONArray r4 = r4.optJSONArray(r0)
            if (r4 == 0) goto L_0x0016
            java.lang.String r1 = com.iap.ac.android.common.json.JsonUtils.toJson(r4)
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.interceptor.Interceptor4rpc.getRequestData(org.json.JSONObject):java.lang.String");
    }
}
