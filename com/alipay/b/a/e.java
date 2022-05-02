package com.alipay.b.a;

import com.alipay.b.b.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import o.getInterfaceDescriptor;
import o.isInside;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static List<i> f9296a;

    static {
        ArrayList arrayList = new ArrayList();
        f9296a = arrayList;
        arrayList.add(new l());
        f9296a.add(new d());
        f9296a.add(new c());
        f9296a.add(new h());
        f9296a.add(new k());
        f9296a.add(new b());
        f9296a.add(new a());
        f9296a.add(new g());
    }

    public static final Object a(String str, Type type) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            return a((Object) new isInside(trim), type);
        }
        if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return a((Object) trim, type);
        }
        return a((Object) new getInterfaceDescriptor(trim), type);
    }

    public static final <T> T a(Object obj, Type type) {
        T a2;
        for (i next : f9296a) {
            if (next.a(a.a(type)) && (a2 = next.a(obj, type)) != null) {
                return a2;
            }
        }
        return null;
    }
}
