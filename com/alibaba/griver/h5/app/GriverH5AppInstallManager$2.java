package com.alibaba.griver.h5.app;

import com.alibaba.griver.api.resource.extensions.GriverCommonResourceProxy;
import java.util.List;

class GriverH5AppInstallManager$2 implements GriverCommonResourceProxy {
    final /* synthetic */ List val$resourceAppIds;

    GriverH5AppInstallManager$2(List list) {
        this.val$resourceAppIds = list;
    }

    public final List<String> getCommonResources() {
        return this.val$resourceAppIds;
    }
}
