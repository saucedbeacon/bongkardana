package com.alipay.mobile.security.bio.service;

import java.util.HashMap;
import java.util.Map;

public class BioServiceDescription {
    boolean autoDownloadRes = false;
    Class<?> clazz = null;
    protected Map<String, String> extMetaInfo = new HashMap();
    String interfaceName = "";
    boolean isLazy = false;

    public Class<?> getClazz() {
        return this.clazz;
    }

    public void setClazz(Class<?> cls) {
        this.clazz = cls;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    public void setInterfaceName(String str) {
        this.interfaceName = str;
    }

    public boolean isLazy() {
        return this.isLazy;
    }

    public void setLazy(boolean z) {
        this.isLazy = z;
    }

    public boolean isAutoDownloadRes() {
        return this.autoDownloadRes;
    }

    public void setAutoDownloadRes(boolean z) {
        this.autoDownloadRes = z;
    }

    public Map<String, String> getExtMetaInfo() {
        return this.extMetaInfo;
    }

    public void setExtMetaInfo(Map<String, String> map) {
        this.extMetaInfo = map;
    }
}
