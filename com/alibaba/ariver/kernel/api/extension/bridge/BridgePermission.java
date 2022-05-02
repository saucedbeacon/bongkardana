package com.alibaba.ariver.kernel.api.extension.bridge;

import com.alibaba.ariver.kernel.api.security.Permission;

public class BridgePermission implements Permission {

    /* renamed from: a  reason: collision with root package name */
    private String f10080a;
    private String b;

    public BridgePermission(String str, String str2) {
        this.f10080a = str;
        this.b = str2;
    }

    public String authority() {
        return this.f10080a;
    }

    public String description() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("authority=");
        sb.append(this.f10080a);
        sb.append(",description=");
        sb.append(this.b);
        return sb.toString();
    }
}
