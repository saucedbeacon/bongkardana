package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.acs.plugin.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4RegionRpc extends Interceptor4rpc {
    private static final String ERROR_CODE_JSAPI_BANNED = "10100";
    private static final String ERROR_CODE_JSAPI_NOT_IMPLEMENTATION = "10103";
    private static final String ERROR_CODE_JSAPI_REFUSE = "10101";
    private static final String ERROR_CODE_JSAPI_SPI_BANNED = "10102";
    private static final String ERROR_CODE_NETWORK_ERROR = "10104";
    private static final String ERROR_CODE_PROXY_SERVER_ERROR = "10105";
    private static final String ERROR_MESSAGE_BANNED = "Region rpc is banned";
    private static final String ERROR_MESSAGE_PSP_NETWORK_ERROR = "PSP server request error";
    private static final String ERROR_MESSAGE_REFUSE = "this app have no permission to use region rpc";
    private static final String ERROR_MESSAGE_SPI_ENABLE = "Common network proxy spi register is disable";
    private static final String ERROR_MESSAGE_SPI_NO_IMPLEMENTATION = "region network proxy spi haven't implementation";
    private static final String KEY_FOR_SERVER_TYPE = "serverType";
    private static final String TAG = "IAPConnect";

    /* access modifiers changed from: protected */
    public String getBizId() {
        return "region_biz";
    }

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (!RegionRPCConfigCenter.INSTANCE.regionRPCEnable()) {
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_REGION_RPC, ERROR_CODE_JSAPI_BANNED, ERROR_MESSAGE_BANNED));
            ACLog.d("IAPConnect", ERROR_MESSAGE_BANNED);
        } else if (!appIdInWhiteList(iAPConnectPluginContext.miniProgramAppID)) {
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_REGION_RPC, ERROR_CODE_JSAPI_REFUSE, ERROR_MESSAGE_REFUSE));
            ACLog.d("IAPConnect", ERROR_MESSAGE_REFUSE);
        } else if (!RegionRPCConfigCenter.INSTANCE.isRegionNetworkProxyEnable()) {
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_REGION_RPC, ERROR_CODE_JSAPI_SPI_BANNED, ERROR_MESSAGE_SPI_ENABLE));
            ACLog.d("IAPConnect", ERROR_MESSAGE_REFUSE);
        } else if (!isRegionNetworkProxyImplementation()) {
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_REGION_RPC, ERROR_CODE_JSAPI_NOT_IMPLEMENTATION, ERROR_MESSAGE_SPI_NO_IMPLEMENTATION));
            ACLog.d("IAPConnect", ERROR_MESSAGE_SPI_NO_IMPLEMENTATION);
        } else {
            super.handle(iAPConnectPluginContext, iAPConnectPluginCallback);
        }
    }

    /* access modifiers changed from: protected */
    public String getRequestData(JSONObject jSONObject) {
        String optString = jSONObject.optString("requestData");
        if (TextUtils.isEmpty(optString)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("requestData");
            if (optJSONArray != null) {
                return appendServerTypeToData(optJSONArray);
            }
            return optString;
        }
        try {
            return appendServerTypeToData(new JSONArray(optString));
        } catch (JSONException e) {
            ACLog.w("IAPConnect", (Throwable) e);
            return optString;
        }
    }

    /* access modifiers changed from: protected */
    public String getNetworkErrorCode(Throwable th) {
        return isProxyError(th) ? ERROR_CODE_PROXY_SERVER_ERROR : ERROR_CODE_NETWORK_ERROR;
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage(Throwable th) {
        if (isProxyError(th)) {
            return ERROR_MESSAGE_PSP_NETWORK_ERROR;
        }
        return super.getErrorMessage(th);
    }

    private boolean isProxyError(Throwable th) {
        return (th instanceof RpcException) && ((RpcException) th).getCode() == 0;
    }

    private String appendServerTypeToData(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject != null) {
                jSONObject.put(KEY_FOR_SERVER_TYPE, 2);
            }
        } catch (JSONException e) {
            ACLog.w("IAPConnect", (Throwable) e);
        }
        return JsonUtils.toJson(jSONArray);
    }

    private boolean appIdInWhiteList(String str) {
        List<Object> regionMiniAppList = RegionRPCConfigCenter.INSTANCE.getRegionMiniAppList();
        if (regionMiniAppList == null) {
            return false;
        }
        for (Object equals : regionMiniAppList) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRegionNetworkProxyImplementation() {
        return HttpTransportFactory.getCreater("region_biz") != null;
    }
}
