package com.alibaba.ariver.resource.prepare.steps;

import androidx.annotation.CallSuper;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;

abstract class BasePrepareStep implements PrepareStep {
    String LOG_TAG;

    /* renamed from: a  reason: collision with root package name */
    private boolean f10198a = false;
    RVAppInfoManager appInfoManager;
    private boolean b = false;
    RVResourceManager resourceManager;

    BasePrepareStep() {
    }

    @CallSuper
    public void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        this.appInfoManager = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
        this.resourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
        if (this.appInfoManager == null) {
            throw new PrepareException("0", "ERROR_UNKNOWN with appInfoManager == null");
        } else if (prepareContext == null) {
            throw new PrepareException("0", "ERROR_UNKNOWN with context == null");
        } else if (!this.f10198a) {
            this.f10198a = true;
            StringBuilder sb = new StringBuilder("AriverRes:PrepareStep_");
            sb.append(prepareContext.getAppId());
            sb.append("_");
            sb.append(getType());
            this.LOG_TAG = sb.toString();
        }
    }

    public void finish() {
        this.b = true;
    }

    public boolean isFinished() {
        return this.b;
    }
}
