package com.alibaba.griver.api.h5.permission;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface GriverJSAPIPermissionProxy extends Proxiable {
    boolean hasDomainPermission(String str, String str2);
}
