package com.alibaba.griver.base.common.env;

import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.proxy.RVResourceEnviromentProxy;

public class GriverRVResourceEnvProxyImpl implements RVResourceEnviromentProxy {
    public String getConfigVariable() {
        return GriverEnv.getAppName();
    }

    @Nullable
    public String getNewSignPublicKey() {
        return GriverEnv.getVerifyPulickey();
    }

    @Nullable
    public String getLegacySignPublicKey() {
        return GriverEnv.getVerifyPulickey();
    }
}
