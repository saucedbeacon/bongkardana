package com.iap.ac.android.common.container.js.plugin;

import android.text.TextUtils;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.js.AlipayJSAPI;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import id.dana.sendmoney.summary.SummaryActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class BaseJSPlugin {
    private static final String TAG = "BaseJSPlugin";
    private List<String> jsApiList = new ArrayList();
    private HashMap<String, Method> jsMethods = new HashMap<>();

    /* access modifiers changed from: protected */
    public abstract Class<? extends BaseJSPlugin> getJSPluginClass();

    public BaseJSPlugin() {
        addJSAPIMethods();
    }

    public JSONObject onJSEvent(JSBridgeMessageToNative jSBridgeMessageToNative, IContainerPresenter iContainerPresenter, ContainerBridgeContext containerBridgeContext) throws InvocationTargetException, IllegalAccessException {
        HashMap hashMap = new HashMap();
        if (jSBridgeMessageToNative == null || TextUtils.isEmpty(jSBridgeMessageToNative.func)) {
            return setResultFail(hashMap, "jsBridgeMessage is empty");
        }
        Method method = this.jsMethods.get(jSBridgeMessageToNative.func);
        if (method == null) {
            return setResultFail(hashMap, "JSAPI method is null");
        }
        if (containerBridgeContext != null) {
            containerBridgeContext.setToNativeMsg(jSBridgeMessageToNative);
        }
        Object invoke = method.invoke(this, new Object[]{JsonUtils.fromJson(jSBridgeMessageToNative.param, method.getParameterTypes()[0]), iContainerPresenter, containerBridgeContext});
        if (invoke == null) {
            return null;
        }
        try {
            return new JSONObject(JsonUtils.toJson(invoke));
        } catch (Exception e) {
            ACLog.e(TAG, "onJSEvent: convert result to JsonObject error: ", e);
            return setResultFail(hashMap, "Convert result to JsonObject error!");
        }
    }

    public void addJSAPIMethods() {
        for (Method method : getJSPluginClass().getDeclaredMethods()) {
            AlipayJSAPI alipayJSAPI = (AlipayJSAPI) method.getAnnotation(AlipayJSAPI.class);
            if (alipayJSAPI != null) {
                this.jsMethods.put(alipayJSAPI.api(), method);
                this.jsApiList.add(alipayJSAPI.api());
            }
        }
    }

    public void setResultSuccess(Map<String, String> map) {
        map.put("success", SummaryActivity.CHECKED);
        map.put("msg", "success");
    }

    public JSONObject setResultFail(Map<String, String> map, String str) {
        map.put("success", "false");
        map.put("msg", str);
        return new JSONObject(map);
    }

    public boolean checkContainerPresenterExist(Map<String, String> map, IContainerPresenter iContainerPresenter) {
        if (iContainerPresenter != null) {
            return true;
        }
        if (map == null) {
            return false;
        }
        map.put("success", "false");
        map.put("msg", "ACContainer is not running.");
        return false;
    }

    public List<String> getJsApiList() {
        return this.jsApiList;
    }
}
