package com.alibaba.griver.core.jsapi.device.network;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.bridge.GriverNetworkPermissionExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.alibaba.griver.base.common.utils.PermissionUtils;

@Keep
public class NetworkBridgeExtension implements BridgeExtension {
    private static final int PERMISSION_REQUEST_CODE = 100;
    private static final String TAG = "NetworkBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @SuppressLint({"NewApi"})
    @ActionFilter
    public void getNetworkType(@BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        if (page.getPageContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        String simpleNetworkType = NetworkUtil.getSimpleNetworkType(page.getPageContext().getActivity());
        String concat = "network_type:".concat(String.valueOf(simpleNetworkType));
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_msg", (Object) concat);
        jSONObject.put("networkType", (Object) simpleNetworkType);
        jSONObject.put("networkAvailable", (Object) Boolean.valueOf(!"fail".equals(simpleNetworkType)));
        final Activity activity = page.getPageContext().getActivity();
        if (!((GriverNetworkPermissionExtension) RVProxy.get(GriverNetworkPermissionExtension.class)).shouldApplyPermission(page) || PermissionUtils.hasPermission("android.permission.READ_PHONE_STATE")) {
            getDetailNetwork(activity, jSONObject, bridgeCallback);
        } else {
            PermissionUtils.requestPermission("android.permission.READ_PHONE_STATE", 100, new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (!PermissionUtils.positivePermissionResult(iArr)) {
                        GriverLogger.w(NetworkBridgeExtension.TAG, "user refuse to grant read phone state permission, can not get network detail");
                    }
                    NetworkBridgeExtension.this.getDetailNetwork(activity, jSONObject, bridgeCallback);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void getDetailNetwork(Context context, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        NetworkUtils.getDetailNetwork(context, new NetworkUtils.NetworkDetailCallback() {
            public void getNetworkType(String str) {
                jSONObject.put("networkInfo", (Object) str);
                bridgeCallback.sendJSONResponse(jSONObject);
            }

            public void getNetworkError(int i, String str) {
                StringBuilder sb = new StringBuilder("get detail network info failed, code: ");
                sb.append(i);
                sb.append(", message: ");
                sb.append(str);
                GriverLogger.w(NetworkBridgeExtension.TAG, sb.toString());
                jSONObject.put("networkInfo", (Object) "UNKNOWN");
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        });
    }
}
