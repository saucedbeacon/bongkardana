package com.alibaba.griver.core.extensions;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.base.common.bridge.GriverNetworkPermissionExtension;

public class GriverNetworkPermissionExtensionImpl implements GriverNetworkPermissionExtension {
    public boolean shouldApplyPermission(Page page) {
        return true;
    }
}
