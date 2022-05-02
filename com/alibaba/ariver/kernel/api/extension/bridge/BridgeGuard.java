package com.alibaba.ariver.kernel.api.extension.bridge;

import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Permission;

public class BridgeGuard implements Guard {

    /* renamed from: a  reason: collision with root package name */
    private Permission f10079a;

    public BridgeGuard(Permission permission) {
        this.f10079a = permission;
    }

    public Permission permit() {
        return this.f10079a;
    }
}
