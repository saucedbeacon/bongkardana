package com.alibaba.ariver.resource.content;

import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourceQuery;

public class AppxNgResourcePackage extends NormalResourcePackage {
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

    public AppxNgResourcePackage(ResourceContext resourceContext) {
        super(RVConstants.TINY_APPX_NG_APPID, resourceContext);
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        Resource resource = super.get(resourceQuery);
        if (resourceQuery.pureUrl.startsWith("https://appx-ng/") && resource != null) {
            StringBuilder sb = new StringBuilder("appx-ng get url\t");
            sb.append(resourceQuery.pureUrl);
            sb.append("\t ");
            sb.append(version());
            RVLogger.d("AppxNgResourcePackage", sb.toString());
        }
        return resource;
    }
}
