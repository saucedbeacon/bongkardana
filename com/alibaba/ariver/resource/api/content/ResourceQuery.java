package com.alibaba.ariver.resource.api.content;

import com.alibaba.ariver.kernel.common.utils.UrlUtils;

public class ResourceQuery {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10173a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    public String originUrl;
    public String pureUrl;

    public ResourceQuery(String str) {
        this.originUrl = str;
        this.pureUrl = UrlUtils.purifyUrl(str);
    }

    public ResourceQuery setNeedAutoCompleteHost() {
        this.f10173a = true;
        return this;
    }

    public ResourceQuery setCanUseFallback(boolean z) {
        this.b = z;
        return this;
    }

    public ResourceQuery setLanguageAware(boolean z) {
        this.f = z;
        return this;
    }

    public boolean isNeedAutoCompleteHost() {
        return this.f10173a;
    }

    public boolean isCanUseFallback() {
        return this.b;
    }

    public boolean isMainDoc() {
        return this.c;
    }

    public boolean isLanguageAware() {
        return this.f;
    }

    public void setDisableResourcePackage() {
        this.d = true;
    }

    public boolean isDisableResourcePackage() {
        return this.d;
    }

    public void setMainDoc(boolean z) {
        this.c = z;
    }

    public boolean isAppxNgRoute() {
        return this.e;
    }

    public void setAppxNgRoute(boolean z) {
        this.e = z;
    }

    public static ResourceQuery asUrl(String str) {
        return new ResourceQuery(str);
    }
}
