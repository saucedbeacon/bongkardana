package com.alibaba.ariver.resource.content;

import com.alibaba.ariver.resource.api.ResourceContext;

public class GlobalResourcePackage extends NormalResourcePackage {
    public GlobalResourcePackage(String str) {
        super(str, (ResourceContext) null);
    }

    public void teardown() {
        super.teardown();
        GlobalPackagePool.getInstance().remove(this.appId);
    }
}
