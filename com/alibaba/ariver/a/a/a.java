package com.alibaba.ariver.a.a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.common.bridge.BaseRenderBridgeImpl;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseRenderBridgeImpl {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9949a;
    private static List<String> b = new ArrayList();
    private static List<String> c = new ArrayList();
    private WebView d;

    static {
        StringBuilder sb = new StringBuilder("WebEngine:");
        sb.append(a.class.getSimpleName());
        f9949a = sb.toString();
        b.add("JSPlugin_AlipayH5Share");
        b.add(RVEvents.BEFORE_UNLOAD);
        b.add("message");
        b.add(RVEvents.NBCOMPONENT_CANRENDER);
        c.add(ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY);
        c.add("showUCFailDialog");
        c.add("setKeyboardType");
        c.add("monitorH5Performance");
        c.add("getStartupParams");
    }

    private void a(JSONObject jSONObject) {
        String jSONString = JSON.toJSONString(jSONObject.toJSONString());
        StringBuilder sb = new StringBuilder();
        sb.append("AlipayJSBridge._invokeJS(");
        sb.append(jSONString);
        sb.append(")");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("javascript:(function(){if(typeof AlipayJSBridge === 'object'){");
        sb2.append(obj);
        sb2.append("}})();");
        a(sb2.toString());
        RVLogger.d(f9949a, "jsapi rep:".concat(String.valueOf(obj)));
    }

    public void a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    a.this.b(str);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        try {
            if (!str.startsWith("javascript")) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                this.d.evaluateJavascript(str, (ValueCallback) null);
            } else {
                this.d.loadUrl(str);
            }
        } catch (Throwable th) {
            RVLogger.e(f9949a, "loadUrl exception.", th);
        }
    }

    public void executeSendToRender(final RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback) {
        if (!"yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_postWebOnUi", (String) null))) {
            try {
                a(renderCallContext);
            } catch (Throwable th) {
                RVLogger.e(f9949a, th);
            }
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    try {
                        a.this.a(renderCallContext);
                    } catch (Throwable th) {
                        RVLogger.e(a.f9949a, th);
                    }
                }
            });
        }
    }

    public void a(RenderCallContext renderCallContext) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientId", (Object) renderCallContext.getEventId());
        jSONObject.put("func", (Object) renderCallContext.getAction());
        jSONObject.put("param", (Object) renderCallContext.getParam());
        jSONObject.put("msgType", (Object) renderCallContext.getType());
        jSONObject.put("keepCallback", (Object) Boolean.valueOf(renderCallContext.getKeep()));
        a(jSONObject);
    }
}
