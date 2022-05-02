package com.alibaba.griver.core.bridge;

import android.text.TextUtils;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.HashMap;
import java.util.Map;

public class BridgeInterceptorManager {
    private static volatile BridgeInterceptorManager b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, BridgeInterceptor> f9185a = new HashMap();

    private BridgeInterceptorManager() {
    }

    public static BridgeInterceptorManager getInstance() {
        if (b == null) {
            synchronized (BridgeInterceptorManager.class) {
                if (b == null) {
                    b = new BridgeInterceptorManager();
                }
            }
        }
        return b;
    }

    public synchronized void register(String str, BridgeInterceptor bridgeInterceptor) {
        if (!TextUtils.isEmpty(str)) {
            if (bridgeInterceptor != null) {
                this.f9185a.put(str, bridgeInterceptor);
                StringBuilder sb = new StringBuilder("register jsapi interceptor for ");
                sb.append(str);
                sb.append(" success, interceptor: ");
                sb.append(bridgeInterceptor);
                GriverLogger.d("BridgeInterceptorManager", sb.toString());
                return;
            }
        }
        GriverLogger.w("BridgeInterceptorManager", "invalid parameters, return directly");
    }

    public synchronized void unregister(String str) {
        if (TextUtils.isEmpty(str)) {
            GriverLogger.w("BridgeInterceptorManager", "invalid param, unregister jsapi interceptor failed");
            return;
        }
        this.f9185a.remove(str);
        GriverLogger.d("BridgeInterceptorManager", "unregister interceptor for ".concat(String.valueOf(str)));
    }

    public BridgeInterceptor getBridgeInterceptor(String str) {
        return this.f9185a.get(str);
    }
}
