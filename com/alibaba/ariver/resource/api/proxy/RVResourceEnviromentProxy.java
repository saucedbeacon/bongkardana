package com.alibaba.ariver.resource.api.proxy;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface RVResourceEnviromentProxy extends Proxiable {
    String getConfigVariable();

    @Nullable
    String getLegacySignPublicKey();

    @Nullable
    String getNewSignPublicKey();
}
