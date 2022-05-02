package com.bca.xco.widget.connection.httpclient.internal.http2;

import java.io.IOException;

public final class l extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final a f10777a;

    public l(a aVar) {
        super("stream was reset: ".concat(String.valueOf(aVar)));
        this.f10777a = aVar;
    }
}
