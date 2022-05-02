package com.iap.ac.android.d;

import com.iap.ac.android.biz.common.model.http.HttpRequest;
import com.iap.ac.android.biz.common.model.http.HttpResponse;
import com.iap.ac.android.q.a;
import java.util.List;

public class f<T> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f11040a;
    public final HttpRequest b;
    public final List<c> c;

    public f(b bVar, HttpRequest httpRequest, List<c> list) {
        this.f11040a = bVar;
        this.b = httpRequest;
        this.c = list;
    }

    public HttpResponse a() throws Exception {
        List<c> list = this.c;
        HttpRequest httpRequest = this.b;
        if (list.size() <= 0) {
            return this.f11040a.a(this);
        }
        return ((a) list.get(0)).a(new d(list, 1, httpRequest, this));
    }
}
