package com.alibaba.ariver.kernel.api.security;

import java.util.HashMap;
import java.util.Map;

public enum DefaultGroup implements Group {
    INTERNAL("internal", "first party"),
    PARTNER("partner", "second party"),
    EXTERNAL("external", "third party");
    
    private String description;
    private String groupName;
    private Map<String, Permission> permissions;

    private DefaultGroup(String str, String str2) {
        this.groupName = str;
        this.description = str2;
    }

    public final String groupName() {
        return this.groupName;
    }

    public final String description() {
        return this.description;
    }

    public final void assignPermissions(Map<String, ? extends Permission> map) {
        if (this.permissions == null) {
            this.permissions = new HashMap();
        }
        this.permissions.putAll(map);
    }

    public final Map<String, ? extends Permission> permissions() {
        return this.permissions;
    }
}
