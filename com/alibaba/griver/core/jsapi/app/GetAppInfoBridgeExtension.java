package com.alibaba.griver.core.jsapi.app;

import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.core.model.applist.FetchAppListResult;
import com.alibaba.griver.core.model.applist.FetchAppsByKeyWordsRequest;
import com.alibaba.griver.core.rpc.a;
import java.util.List;

@Keep
public class GetAppInfoBridgeExtension implements BridgeExtension {
    private static final String TAG = "AriverApp:GetAppInfoBridgeExtension";

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void fetchAppInfoListByIds(@BindingParam({"appIdList"}) List<String> list, @BindingCallback final BridgeCallback bridgeCallback) {
        GriverLogger.d(TAG, "fetchAppInfoListByIds jsapi has been invoke");
        new a().b(list, new OnRpcResultListener<FetchAppListResult>() {
            public void onResultSuccess(FetchAppListResult fetchAppListResult) {
                StringBuilder sb = new StringBuilder("fetchAppInfoListByIds jsapi has been invoke ");
                sb.append(JSON.toJSONString(fetchAppListResult));
                GriverLogger.d(GetAppInfoBridgeExtension.TAG, sb.toString());
                bridgeCallback.sendJSONResponse(JSONUtils.parseObject(JSON.toJSONString(fetchAppListResult)));
            }

            public void onResultFailed(int i, String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", (Object) Integer.valueOf(i));
                jSONObject.put("errorMessage", (Object) str);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        });
    }

    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void fetchAppInfoListByKeyword(@BindingParam({"keyword"}) String str, @BindingParam({"queryStartIndex"}) Integer num, @BindingParam({"querySize"}) Integer num2, @BindingCallback final BridgeCallback bridgeCallback) {
        RVLogger.d(TAG, "fetchAppInfoListByKeyword jsapi has been invoke");
        new a().a(new FetchAppsByKeyWordsRequest(str, num.intValue(), num2.intValue()), (OnRpcResultListener<FetchAppListResult>) new OnRpcResultListener<FetchAppListResult>() {
            public void onResultSuccess(FetchAppListResult fetchAppListResult) {
                bridgeCallback.sendJSONResponse(JSONUtils.parseObject(JSON.toJSONString(fetchAppListResult)));
            }

            public void onResultFailed(int i, String str) {
                JSONObject jSONObject = new JSONObject();
                if (i == 2) {
                    try {
                        FetchAppListResult fetchAppListResult = (FetchAppListResult) JSON.parseObject(str, FetchAppListResult.class);
                        jSONObject.put("error", (Object) fetchAppListResult.errorCode);
                        jSONObject.put("errorMessage", (Object) fetchAppListResult.errorMessage);
                        jSONObject.put("errorCode", (Object) fetchAppListResult.errorCode);
                        jSONObject.put("success", (Object) Boolean.valueOf(fetchAppListResult.success));
                        jSONObject.put("totalCount", (Object) Integer.valueOf(fetchAppListResult.getTotalCount()));
                    } catch (Exception unused) {
                        jSONObject.put("error", (Object) Integer.valueOf(i));
                        jSONObject.put("errorMessage", (Object) str);
                    }
                } else {
                    jSONObject.put("error", (Object) Integer.valueOf(i));
                    jSONObject.put("errorMessage", (Object) str);
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        });
    }

    public void onInitialized() {
        RVLogger.d(TAG, "onInitialized");
    }

    public void onFinalized() {
        RVLogger.d(TAG, "onFinalized");
    }
}
