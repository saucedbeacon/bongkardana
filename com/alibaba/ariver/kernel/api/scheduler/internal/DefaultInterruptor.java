package com.alibaba.ariver.kernel.api.scheduler.internal;

import com.alibaba.ariver.kernel.api.scheduler.Interruptor;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class DefaultInterruptor implements Interruptor {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9131a = false;

    public void interrupt() {
        RVLogger.d("AriverKernel:ExtensionInvoker:Interruptor", "interrupt on ".concat(String.valueOf(this)));
        this.f9131a = true;
    }

    public boolean isInterrupted() {
        return this.f9131a;
    }

    public void setInterrupted(boolean z) {
        this.f9131a = z;
    }
}
