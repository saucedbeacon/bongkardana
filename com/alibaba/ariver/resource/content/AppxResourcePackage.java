package com.alibaba.ariver.resource.content;

import android.content.Intent;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.resource.api.ResourceContext;
import o.restorePresenterStates;

public class AppxResourcePackage extends NormalResourcePackage {
    /* access modifiers changed from: protected */
    public boolean canHotUpdate(String str) {
        return false;
    }

    public boolean needWaitForSetup() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean needWaitSetupWhenGet() {
        return true;
    }

    public AppxResourcePackage(ResourceContext resourceContext) {
        super("66666692", resourceContext);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDone() {
        super.onPrepareDone();
        Intent intent = new Intent(RVConstants.ACTION_APPX_PARSED);
        intent.putExtra("appxVersion", version());
        restorePresenterStates.length(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).setMin(intent);
    }
}
