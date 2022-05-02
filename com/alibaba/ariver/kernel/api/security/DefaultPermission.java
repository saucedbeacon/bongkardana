package com.alibaba.ariver.kernel.api.security;

public enum DefaultPermission implements Permission {
    ALL("all", "") {
    };
    
    private String authority;
    private String description;

    private DefaultPermission(String str, String str2) {
        this.authority = str;
        this.description = str2;
    }

    public String authority() {
        return this.authority;
    }

    public String description() {
        return this.description;
    }
}
