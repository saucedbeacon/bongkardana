package com.alipay.mobile.rome.syncsdk.transport.connection;

import com.alipay.mobile.rome.syncsdk.transport.connection.proxy.ProxyInfo;

public final class c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f9449a;
    public int b;
    public boolean c = true;
    public String d;
    public ProxyInfo e;
    private int f;

    public c(String str, int i, ProxyInfo proxyInfo) {
        this.f9449a = str;
        this.b = i;
        this.f = 15;
        this.e = proxyInfo;
        proxyInfo.c = 15;
    }
}
