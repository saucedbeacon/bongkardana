package com.alibaba.griver.device.jsapi.screen;

import android.app.Activity;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class ScreenBrightnessBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9083a = ScreenBrightnessBridgeExtension.class.getSimpleName();
    private float b = -1.0f;

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
    public BridgeResponse setScreenBrightness(@BindingParam(floatDefault = -1.0f, value = {"brightness"}) float f, @BindingApiContext ApiContext apiContext) {
        if (f < 0.0f || f > 1.0f) {
            return BridgeResponse.INVALID_PARAM;
        }
        a(f, apiContext);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getScreenBrightness(@BindingApiContext ApiContext apiContext) {
        JSONObject jSONObject = new JSONObject();
        float a2 = a(apiContext);
        RVLogger.d(f9083a, "currentBrightness: ".concat(String.valueOf(a2)));
        jSONObject.put("brightness", (Object) Float.valueOf(a2));
        jSONObject.put("success", (Object) Boolean.TRUE);
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setScreenAutolock(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"actionType"}) String str) {
        Activity activity = apiContext.getActivity();
        if (TextUtils.equals(str, "disable")) {
            activity.getWindow().setFlags(128, 128);
        } else if (TextUtils.equals(str, "enable")) {
            activity.getWindow().clearFlags(128);
        } else {
            GriverLogger.w(f9083a, "set screen on invalid param");
            return BridgeResponse.INVALID_PARAM;
        }
        return BridgeResponse.SUCCESS;
    }

    private void a(float f, ApiContext apiContext) {
        Activity activity = apiContext.getActivity();
        if (activity != null) {
            try {
                String str = f9083a;
                StringBuilder sb = new StringBuilder("value before");
                sb.append(f);
                sb.append(" value after");
                float f2 = f * 255.0f;
                sb.append(f2);
                RVLogger.d(str, sb.toString());
                Window window = apiContext.getActivity().getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                float f3 = f2 / 255.0f;
                this.b = f3;
                attributes.screenBrightness = f3;
                window.setAttributes(attributes);
                Settings.System.putInt(activity.getContentResolver(), "screen_brightness", (int) f2);
            } catch (Exception e) {
                RVLogger.e(f9083a, "exception", e);
            }
        }
    }

    private float a(ApiContext apiContext) {
        float f = this.b;
        if (f != -1.0f) {
            return f;
        }
        try {
            return ((float) Settings.System.getInt(apiContext.getActivity().getContentResolver(), "screen_brightness")) / 255.0f;
        } catch (Exception e) {
            RVLogger.e(f9083a, "exception", e);
            return 0.0f;
        }
    }
}
