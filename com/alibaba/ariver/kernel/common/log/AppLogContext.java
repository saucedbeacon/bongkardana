package com.alibaba.ariver.kernel.common.log;

public class AppLogContext {

    /* renamed from: a  reason: collision with root package name */
    private final PageSource f9141a = new PageSource();
    private String b;

    public String getPageLogToken() {
        return this.b;
    }

    public PageSource getPageSource() {
        return this.f9141a;
    }

    public void setPageLogToken(String str) {
        this.b = str;
    }
}
