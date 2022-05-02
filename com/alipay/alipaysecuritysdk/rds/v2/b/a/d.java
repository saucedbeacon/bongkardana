package com.alipay.alipaysecuritysdk.rds.v2.b.a;

import com.alipay.alipaysecuritysdk.rds.v2.b.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f9281a;

    public d() {
        this((byte) 0);
    }

    private d(byte b) {
        this.f9281a = new ArrayList();
    }

    public final void a(b bVar) {
        this.f9281a.add(bVar);
    }

    public final synchronized void a(String str, boolean z, double d) {
        b bVar = this.f9281a.get(this.f9281a.size() - 1);
        if (bVar instanceof a) {
            ((a) bVar).b();
        } else if (bVar instanceof b) {
            ((b) bVar).a(str);
        } else if (bVar instanceof c) {
            ((c) bVar).b(z);
        } else if (bVar instanceof f) {
            ((f) bVar).a(d);
        }
        this.f9281a.set(this.f9281a.size() - 1, bVar);
    }

    public final /* synthetic */ Object a() {
        JSONArray jSONArray = new JSONArray();
        if (this.f9281a.size() > 15) {
            List<b> list = this.f9281a;
            this.f9281a = list.subList(list.size() - 15, this.f9281a.size());
        }
        for (b next : this.f9281a) {
            if (next != null && (next instanceof b)) {
                jSONArray.put(next.a());
            }
        }
        return jSONArray;
    }
}
