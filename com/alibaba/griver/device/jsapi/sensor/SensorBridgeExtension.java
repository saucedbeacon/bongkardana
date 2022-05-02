package com.alibaba.griver.device.jsapi.sensor;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.device.adapter.Callback;

public class SensorBridgeExtension implements BridgeExtension {
    public static final String ON_GYROSCOPE_CHANGE = "gyroscopeChange";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public SensorServiceManager f9085a;

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void watchShake(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        if (jSONObject.containsKey("monitorAccelerometer")) {
            a(jSONObject.getBoolean("monitorAccelerometer").booleanValue(), page, jSONObject);
        } else if (jSONObject.containsKey("monitorCompass")) {
            b(jSONObject.getBoolean("monitorCompass").booleanValue(), page, jSONObject);
        } else if (jSONObject.containsKey("monitorGyroscope")) {
            c(jSONObject.getBoolean("monitorGyroscope").booleanValue(), page, jSONObject);
        } else {
            a(jSONObject, page, bridgeCallback);
        }
    }

    private void a(JSONObject jSONObject, Page page, final BridgeCallback bridgeCallback) {
        this.f9085a.create(-10, page.getPageContext().getActivity(), jSONObject).register(new Callback() {
            public void onTrigger(JSONObject jSONObject, int i) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                SensorBridgeExtension.this.f9085a.unregister(-10);
            }
        });
    }

    private void a(boolean z, final Page page, JSONObject jSONObject) {
        if (z) {
            this.f9085a.create(1, page.getPageContext().getActivity(), jSONObject).register(new Callback() {
                public void onTrigger(JSONObject jSONObject, int i) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", (Object) jSONObject);
                    EngineUtils.sendToRender(page.getRender(), "accelerometerChange", jSONObject2, (SendToRenderCallback) null);
                }
            });
        } else {
            this.f9085a.unregister(1);
        }
    }

    private void b(boolean z, final Page page, JSONObject jSONObject) {
        if (z) {
            this.f9085a.create(2, page.getPageContext().getActivity(), jSONObject).register(new Callback() {
                public void onTrigger(JSONObject jSONObject, int i) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", (Object) jSONObject);
                    EngineUtils.sendToRender(page.getRender(), "compassChange", jSONObject2, (SendToRenderCallback) null);
                }
            });
        } else {
            this.f9085a.unregister(2);
        }
    }

    private void c(boolean z, final Page page, JSONObject jSONObject) {
        if (z) {
            this.f9085a.create(4, page.getPageContext().getActivity(), jSONObject).register(new Callback() {
                public void onTrigger(JSONObject jSONObject, int i) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", (Object) jSONObject);
                    EngineUtils.sendToRender(page.getRender(), SensorBridgeExtension.ON_GYROSCOPE_CHANGE, jSONObject2, (SendToRenderCallback) null);
                }
            });
        } else {
            this.f9085a.unregister(4);
        }
    }

    public void onInitialized() {
        this.f9085a = new SensorServiceManager();
    }

    public void onFinalized() {
        this.f9085a.destroy();
    }
}
