package com.alibaba.ariver.kernel.api.security;

import java.util.List;

public interface AccessControlManagement {
    boolean asyncPermissionCheck(Permission permission, Accessor accessor);

    boolean bizPermissionCheck(Permission permission, Accessor accessor);

    Group manageAccessorGroup(Accessor accessor);

    boolean needPermissionCheck(Accessor accessor, List<? extends Guard> list);

    ApiPermissionCheckResult permissionCheck(Permission permission, Accessor accessor);
}
