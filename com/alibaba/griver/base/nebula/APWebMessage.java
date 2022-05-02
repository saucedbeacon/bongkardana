package com.alibaba.griver.base.nebula;

import com.alibaba.griver.base.api.APWebMessagePort;

public class APWebMessage {

    /* renamed from: a  reason: collision with root package name */
    private String f10228a;
    private APWebMessagePort[] b;

    public APWebMessage(String str) {
        this.f10228a = str;
    }

    public APWebMessage(String str, APWebMessagePort[] aPWebMessagePortArr) {
        this.f10228a = str;
        this.b = aPWebMessagePortArr;
    }

    public String getData() {
        return this.f10228a;
    }

    public APWebMessagePort[] getPorts() {
        return this.b;
    }
}
