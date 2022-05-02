package com.alibaba.griver.base.common.account;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.common.account.GriverAccountExtension;

public class GriverAccount {
    public static String getUserId() {
        return a().getUserId();
    }

    private static GriverAccountExtension a() {
        return (GriverAccountExtension) RVProxy.get(GriverAccountExtension.class);
    }
}
