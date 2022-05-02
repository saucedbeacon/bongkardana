package com.alipay.mobile.verifyidentity.framework.flow;

import com.alipay.mobile.verifyidentity.framework.module.VIModule;

public class NormalFlowController implements IFlowController {
    private VIModule.Callback callback;
    private VIModule module;

    public NormalFlowController(VIModule vIModule, VIModule.Callback callback2) {
        this.module = vIModule;
        this.callback = callback2;
    }

    public void start() {
        VIModule vIModule = this.module;
        if (vIModule != null) {
            vIModule.start(this.callback);
        }
    }
}
