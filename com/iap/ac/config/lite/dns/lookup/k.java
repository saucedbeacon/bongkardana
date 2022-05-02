package com.iap.ac.config.lite.dns.lookup;

import java.util.ArrayList;
import java.util.List;

public class k extends i {
    private List<byte[]> e;

    protected k() {
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) throws Exception {
        this.e = new ArrayList(2);
        while (aVar.g() > 0) {
            this.e.add(aVar.c());
        }
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList(this.e.size());
        for (byte[] a2 : this.e) {
            arrayList.add(i.a(a2));
        }
        return arrayList;
    }
}
