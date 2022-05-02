package com.alibaba.ariver.integration.proxy.impl;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppExitPoint;
import com.alibaba.ariver.kernel.common.bytebuffer.RVByteBufferManager;

public class CommonAppExitExtension implements AppExitPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppExit(App app) {
        RVByteBufferManager.releaseAllBuffer();
    }
}
