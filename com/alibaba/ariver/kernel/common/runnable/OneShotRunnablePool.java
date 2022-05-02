package com.alibaba.ariver.kernel.common.runnable;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;
import java.util.Map;

public class OneShotRunnablePool {

    /* renamed from: a  reason: collision with root package name */
    private static OneShotRunnablePool f10115a;
    private final Map<String, Runnable> b = new HashMap();

    public static OneShotRunnablePool getInstance() {
        if (f10115a == null) {
            synchronized (OneShotRunnablePool.class) {
                if (f10115a == null) {
                    f10115a = new OneShotRunnablePool();
                }
            }
        }
        return f10115a;
    }

    private OneShotRunnablePool() {
        if (((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_oneShotRunnableWeakRef", false)) {
            OneShotRunnable.sUseWeakRef = true;
            RVLogger.d("AriverKernel:OneShotRunnablePool", "OneShotRunnable.sUseWeakRef true");
        }
    }

    public Runnable obtain(Runnable runnable) {
        return obtain(runnable.getClass().getName(), runnable);
    }

    public Runnable obtain(String str, Runnable runnable) {
        OneShotRunnable oneShotRunnable;
        Runnable runnable2 = this.b.get(str);
        if (runnable2 != null) {
            RVLogger.d("AriverKernel:OneShotRunnablePool", "obtain hit pool ".concat(String.valueOf(str)));
            return runnable2;
        }
        synchronized (this.b) {
            oneShotRunnable = new OneShotRunnable(str, runnable);
            this.b.put(str, oneShotRunnable);
        }
        return oneShotRunnable;
    }
}
