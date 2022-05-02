package com.alibaba.griver.device.jsapi.system;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;

public class GetBatteryInfoBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9087a = GetBatteryInfoBridgeExtension.class.getName();
    private IntentFilter b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private volatile boolean c = false;
    /* access modifiers changed from: private */
    public BridgeCallback d;
    private BroadcastReceiver e = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            try {
                int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
                if (intent.getIntExtra("plugged", 0) != 0) {
                    z = true;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseAnalytics.Param.LEVEL, (Object) Integer.valueOf(intExtra));
                jSONObject.put("isCharging", (Object) Boolean.valueOf(z));
                GetBatteryInfoBridgeExtension.this.d.sendBridgeResponse(new BridgeResponse(jSONObject));
            } catch (Throwable unused) {
            }
            GetBatteryInfoBridgeExtension.this.b();
        }
    };

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public void getBatteryInfo(@BindingCallback BridgeCallback bridgeCallback) {
        this.d = bridgeCallback;
        a();
    }

    private void a() {
        try {
            if (!this.c) {
                this.c = true;
                RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
                if (rVEnvironmentService != null) {
                    Application applicationContext = rVEnvironmentService.getApplicationContext();
                    if (applicationContext != null) {
                        applicationContext.registerReceiver(this.e, this.b);
                    } else {
                        RVLogger.d(f9087a, "register battery receiver failed");
                    }
                } else {
                    RVLogger.d(f9087a, "register battery receiver failed");
                }
            }
        } catch (Throwable th) {
            RVLogger.e(f9087a, th);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        Application applicationContext;
        try {
            if (this.c) {
                this.c = false;
                RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
                if (rVEnvironmentService != null && (applicationContext = rVEnvironmentService.getApplicationContext()) != null) {
                    applicationContext.unregisterReceiver(this.e);
                }
            }
        } catch (Throwable th) {
            RVLogger.e(f9087a, th);
        }
    }

    public void onFinalized() {
        this.d = null;
        b();
    }
}
