package com.alibaba.ariver.engine.common.bridge;

import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseRenderBridgeImpl implements RenderBridge {

    /* renamed from: a  reason: collision with root package name */
    private String f10058a;
    private final Map<String, SendToRenderCallback> b = new HashMap();
    private Node c;
    private EventSendInterceptorPoint d;

    public abstract void executeSendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback);

    public BaseRenderBridgeImpl(Node node) {
        StringBuilder sb = new StringBuilder("AriverEngine:");
        sb.append(BaseRenderBridgeImpl.class.getSimpleName());
        this.f10058a = sb.toString();
        this.c = node;
        this.d = ExtensionPoint.as(EventSendInterceptorPoint.class).node(node).useCache(true).defaultValue(Boolean.FALSE).resolve(new ResultResolver<Boolean>() {
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.isEmpty()) {
                    return Boolean.TRUE;
                }
                for (Boolean booleanValue : list) {
                    if (!booleanValue.booleanValue()) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }).create();
    }

    public SendToRenderCallback takeCallback(String str) {
        RVLogger.d(this.f10058a, "try takeCallback: ".concat(String.valueOf(str)));
        return this.b.remove(str);
    }

    public void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback, boolean z) {
        if (!z || !a(renderCallContext.getAction(), renderCallContext.getParam())) {
            if (sendToRenderCallback != null) {
                String str = this.f10058a;
                StringBuilder sb = new StringBuilder("sendToRender ");
                sb.append(renderCallContext.getAction());
                sb.append(" record callback ");
                sb.append(renderCallContext.getEventId());
                RVLogger.d(str, sb.toString());
                this.b.put(renderCallContext.getEventId(), sendToRenderCallback);
            }
            executeSendToRender(renderCallContext, sendToRenderCallback);
            return;
        }
        if (sendToRenderCallback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("prevent", (Object) Boolean.FALSE);
            sendToRenderCallback.onCallBack(jSONObject);
            String str2 = this.f10058a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(renderCallContext.getAction());
            sb2.append(" H5 onCallback for ");
            sb2.append(renderCallContext.getAction());
            sb2.append(" invoke was prevented");
            RVLogger.d(str2, sb2.toString());
        }
        String str3 = this.f10058a;
        StringBuilder sb3 = new StringBuilder("sender");
        sb3.append(this.c.hashCode());
        sb3.append(" send event[");
        sb3.append(renderCallContext.getAction());
        sb3.append("] was intercepted by extension");
        RVLogger.d(str3, sb3.toString());
    }

    public void sendToRender(RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback) {
        sendToRender(renderCallContext, sendToRenderCallback, true);
    }

    private boolean a(String str, JSONObject jSONObject) {
        return this.d.needIntercept(str, jSONObject);
    }

    /* access modifiers changed from: protected */
    public JSONObject warpData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null && jSONObject2.size() == 1) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("data", (Object) jSONObject);
        return jSONObject3;
    }
}
