package com.alipay.mobile.security.bio.module;

public class MicroModule {
    private String mZimId;

    public MicroModule() {
    }

    public MicroModule(String str) {
        this.mZimId = str;
    }

    public String getZimId() {
        return this.mZimId;
    }

    public void setZimId(String str) {
        this.mZimId = str;
    }
}
