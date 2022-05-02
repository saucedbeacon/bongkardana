package com.alibaba.griver.base.common.bridge;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverNetworkPermissionExtension extends GriverExtension {
    boolean shouldApplyPermission(Page page);
}
