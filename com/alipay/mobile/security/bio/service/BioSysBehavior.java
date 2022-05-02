package com.alipay.mobile.security.bio.service;

import java.util.HashMap;

public class BioSysBehavior {
    private HashMap<String, String> ext = new HashMap<>();
    private String msg = "";
    private BioSysBehaviorType type = BioSysBehaviorType.EVENT;

    public void addExt(String str, String str2) {
        this.ext.put(str, str2);
    }

    public BioSysBehaviorType getType() {
        return this.type;
    }

    public void setType(BioSysBehaviorType bioSysBehaviorType) {
        this.type = bioSysBehaviorType;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public HashMap<String, String> getExt() {
        return this.ext;
    }
}
