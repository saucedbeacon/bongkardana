package com.alibaba.griver.device.jsapi.system;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.security.GriverSecurity;
import com.alibaba.griver.base.common.utils.DeviceUtils;

public class DeviceInfoBridgeExtension extends SimpleBridgeExtension {
    @ActionFilter
    public void getDeviceInfo(@BindingCallback BridgeCallback bridgeCallback) {
        Application applicationContext = GriverEnv.getApplicationContext();
        String imei = DeviceUtils.getIMEI(applicationContext);
        String mac = DeviceUtils.getMac(applicationContext);
        String androidId = DeviceUtils.getAndroidId(applicationContext);
        String serialNumber = DeviceUtils.getSerialNumber();
        String utdid = DeviceUtils.getUtdid(applicationContext);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imei", (Object) imei);
        jSONObject.put("mac", (Object) mac);
        jSONObject.put("androidId", (Object) androidId);
        jSONObject.put("sn", (Object) serialNumber);
        jSONObject.put("utdid", (Object) utdid);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) GriverSecurity.getInstance().encrypt(jSONObject.toString()));
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject2));
    }

    @ActionFilter
    public void getDeviceID(@BindingCallback BridgeCallback bridgeCallback) {
        String iMEIEncrypt = DeviceUtils.getIMEIEncrypt(GriverEnv.getApplicationContext());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) iMEIEncrypt);
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
    }
}
