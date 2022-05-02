package com.alipay.mobile.security.bio.workspace;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ProtocolConfig {
    private int env = 0;
    private NavPageConfig navigatepage;
    private int ui = 991;
    String version = "1.0";

    public int getEnv() {
        return this.env;
    }

    public void setEnv(int i) {
        this.env = i;
    }

    public NavPageConfig getNavigatepage() {
        return this.navigatepage;
    }

    public void setNavigatepage(NavPageConfig navPageConfig) {
        this.navigatepage = navPageConfig;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1049609728, oncanceled);
            onCancelLoad.getMin(-1049609728, oncanceled);
        }
        this.version = str;
    }

    public int getUi() {
        return this.ui;
    }

    public void setUi(int i) {
        this.ui = i;
    }
}
