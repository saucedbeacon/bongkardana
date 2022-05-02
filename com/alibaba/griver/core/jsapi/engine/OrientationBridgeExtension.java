package com.alibaba.griver.core.jsapi.engine;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.proxy.RVScreenOrientationProxy;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;

@Keep
public class OrientationBridgeExtension implements BridgeExtension {
    private static final String PARAM_SCREEN_ORIENTATION = "orientation";
    private static final String TAG = "AriverAPI:OrientationBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getScreenOrientation(@BindingNode(Page.class) Page page) {
        if (page == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        Activity activity = page.getRender().getActivity();
        if (activity == null || activity.isFinishing()) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        String activityGetScreenOrientation = activityGetScreenOrientation(activity);
        if (TextUtils.isEmpty(activityGetScreenOrientation)) {
            return BridgeResponse.newError(3, "get screen orientation return null");
        }
        RVLogger.d(TAG, "getScreenOrientation success ");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put(PARAM_SCREEN_ORIENTATION, (Object) activityGetScreenOrientation);
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setScreenOrientation(@BindingParam({"orientation"}) String str, @BindingParam({"beta"}) boolean z, @BindingNode(Page.class) Page page) {
        if (!z || TextUtils.isEmpty(str)) {
            return BridgeResponse.INVALID_PARAM;
        }
        Activity activity = page.getRender().getActivity();
        if (activity == null || activity.isFinishing()) {
            return BridgeResponse.newError(2, "activity is null");
        }
        boolean screenOrientation = ((RVScreenOrientationProxy) RVProxy.get(RVScreenOrientationProxy.class)).setScreenOrientation(activity, str, page);
        RVLogger.d(TAG, "setScreenOrientation result ".concat(String.valueOf(screenOrientation)));
        if (screenOrientation) {
            return BridgeResponse.SUCCESS;
        }
        return BridgeResponse.INVALID_PARAM;
    }

    private String activityGetScreenOrientation(Activity activity) {
        int i = activity.getResources().getConfiguration().orientation;
        if (i == 1) {
            return RVParams.LONG_PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }
}
