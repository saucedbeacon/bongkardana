package com.alipay.mobile.rome.syncservice.sync.c;

import com.alipay.mobile.rome.syncsdk.util.c;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    String f9492a;

    public d(String str) {
        this.f9492a = str;
    }

    public final void run() {
        String a2 = c.f9491a;
        StringBuilder sb = new StringBuilder("DispatchBizTask: run [ biz=");
        sb.append(this.f9492a);
        sb.append(" ]");
        c.b(a2, sb.toString());
        a.c(this.f9492a);
    }
}
