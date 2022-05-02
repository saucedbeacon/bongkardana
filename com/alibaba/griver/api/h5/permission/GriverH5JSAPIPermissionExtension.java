package com.alibaba.griver.api.h5.permission;

import com.alibaba.griver.api.common.GriverExtension;

public interface GriverH5JSAPIPermissionExtension extends GriverExtension {
    boolean hasPermission(String str, String str2);
}
