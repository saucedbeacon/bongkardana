package com.alipay.mobile.rome.syncservice.c;

import android.content.Context;
import com.alipay.mobile.rome.syncservice.model.DownstreamDataRequest;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected String f9468a = getClass().getSimpleName();
    protected int b;
    protected Context c = com.alipay.mobile.rome.syncservice.d.a.f9473a;

    /* access modifiers changed from: protected */
    public abstract T a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract void a(com.alipay.mobile.rome.syncservice.model.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(com.alipay.mobile.rome.syncservice.model.a aVar, DownstreamDataRequest.DataSource dataSource);

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    public abstract com.alipay.mobile.rome.syncservice.model.a b(T t);

    protected a() {
    }

    public void a(DownstreamDataRequest downstreamDataRequest) {
        if (downstreamDataRequest != null) {
            Object a2 = a(downstreamDataRequest.f9477a);
            a(a2);
            com.alipay.mobile.rome.syncservice.model.a b2 = b(a2);
            a(b2);
            a(b2, downstreamDataRequest.b);
        }
    }
}
