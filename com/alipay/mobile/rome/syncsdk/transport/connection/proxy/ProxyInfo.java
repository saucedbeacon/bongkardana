package com.alipay.mobile.rome.syncsdk.transport.connection.proxy;

import javax.net.SocketFactory;

public final class ProxyInfo {

    /* renamed from: a  reason: collision with root package name */
    public String f9453a;
    public int b;
    public int c = 15;
    public ProxyType d;

    public enum ProxyType {
        NONE,
        HTTP,
        SOCKS
    }

    public ProxyInfo(ProxyType proxyType, String str, int i) {
        this.d = proxyType;
        this.f9453a = str;
        this.b = i;
    }

    public final SocketFactory a() {
        if (this.d == ProxyType.NONE) {
            new a().a(this.c);
            return new a();
        } else if (this.d == ProxyType.HTTP) {
            b bVar = new b(this);
            int i = this.c;
            if (i > 0) {
                bVar.f9455a = i;
            }
            return bVar;
        } else if (this.d != ProxyType.SOCKS) {
            return null;
        } else {
            new a().a(this.c);
            return new a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyInfo [proxyAddress=");
        sb.append(this.f9453a);
        sb.append(", proxyPort=");
        sb.append(this.b);
        sb.append(", proxyType=");
        sb.append(this.d);
        sb.append(", connTimeout=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
