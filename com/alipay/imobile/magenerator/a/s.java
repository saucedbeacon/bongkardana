package com.alipay.imobile.magenerator.a;

import java.util.Map;

public final class s implements ab {
    public final c a(String str, a aVar, int i, int i2) {
        return a(str, aVar, i, i2, (Map) null);
    }

    public final c a(String str, a aVar, int i, int i2, Map map) {
        ab abVar;
        int i3 = t.f10711a[aVar.ordinal()];
        if (i3 == 1) {
            abVar = new w();
        } else if (i3 == 2) {
            abVar = new h();
        } else {
            throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return abVar.a(str, aVar, i, i2, map);
    }
}
