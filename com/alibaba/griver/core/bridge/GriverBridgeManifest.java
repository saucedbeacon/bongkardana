package com.alibaba.griver.core.bridge;

import androidx.annotation.NonNull;
import java.util.List;

public class GriverBridgeManifest {

    /* renamed from: a  reason: collision with root package name */
    private String f9187a;
    private String b;
    private List<String> c;

    public String getPackageName() {
        return this.f9187a;
    }

    public String getClassName() {
        return this.b;
    }

    public List<String> getActionList() {
        return this.c;
    }

    public void setClassName(String str) {
        this.b = str;
    }

    public void setActionList(List<String> list) {
        this.c = list;
    }

    public GriverBridgeManifest(@NonNull String str, @NonNull List<String> list) {
        this.f9187a = "com.alibaba.griver.outer";
        this.b = str;
        this.c = list;
    }

    public GriverBridgeManifest(@NonNull Class cls, @NonNull List<String> list) {
        if (cls != null) {
            this.f9187a = cls.getPackage().getName();
            this.b = cls.getName();
        }
        this.c = list;
    }
}
