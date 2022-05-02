package com.alibaba.griver.device.jsapi.system;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MemoryWarningBridgeExtension extends SimpleBridgeExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Page f10428a;
    final ComponentCallbacks2 mCallback = new ComponentCallbacks2() {
        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 10 || i == 15) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FirebaseAnalytics.Param.LEVEL, (Object) Integer.valueOf(i));
                jSONObject.put("data", (Object) jSONObject2);
                if (MemoryWarningBridgeExtension.this.f10428a != null) {
                    EngineUtils.sendToRender(MemoryWarningBridgeExtension.this.f10428a.getRender(), "memoryWarning", jSONObject, (SendToRenderCallback) null);
                }
            }
        }
    };
    final Context mContext = GriverEnv.getApplicationContext();

    private void a() {
        b();
        this.mContext.registerComponentCallbacks(this.mCallback);
    }

    private void b() {
        this.mContext.unregisterComponentCallbacks(this.mCallback);
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse startMonitorMemoryWarning(@BindingNode(Page.class) Page page) {
        this.f10428a = page;
        a();
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse stopMonitorMemoryWarning(@BindingNode(Page.class) Page page) {
        b();
        return BridgeResponse.SUCCESS;
    }

    public void onInitialized() {
        super.onInitialized();
        a();
    }

    public void onFinalized() {
        super.onFinalized();
        b();
    }
}
