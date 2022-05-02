package com.iap.ac.android.d;

import com.iap.ac.android.biz.common.model.http.HttpRequest;
import com.iap.ac.android.biz.common.model.http.HttpResponse;
import com.iap.ac.android.d.c;
import com.iap.ac.android.q.a;
import java.util.List;

public class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f11039a;
    public final int b;
    public final HttpRequest c;
    public final a d;

    public d(List<c> list, int i, HttpRequest httpRequest, a aVar) {
        this.f11039a = list;
        this.b = i;
        this.c = httpRequest;
        this.d = aVar;
    }

    public HttpResponse a(HttpRequest httpRequest) throws Exception {
        if (this.b >= this.f11039a.size()) {
            f fVar = (f) this.d;
            return fVar.f11040a.a(fVar);
        }
        return ((a) this.f11039a.get(this.b)).a(new d(this.f11039a, this.b + 1, httpRequest, this.d));
    }
}
