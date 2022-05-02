package com.alipay.b.a;

import com.alipay.b.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.getInterfaceDescriptor;
import o.isInside;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<j> f9297a;

    static {
        ArrayList arrayList = new ArrayList();
        f9297a = arrayList;
        arrayList.add(new l());
        f9297a.add(new d());
        f9297a.add(new c());
        f9297a.add(new h());
        f9297a.add(new b());
        f9297a.add(new a());
        f9297a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        if (a.a(b.getClass())) {
            return getInterfaceDescriptor.setMin(b.toString());
        }
        if (Collection.class.isAssignableFrom(b.getClass())) {
            return new isInside((Collection) (List) b).toString();
        }
        if (Map.class.isAssignableFrom(b.getClass())) {
            return new getInterfaceDescriptor((Map) b).toString();
        }
        StringBuilder sb = new StringBuilder("Unsupported Class : ");
        sb.append(b.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object b(Object obj) {
        Object a2;
        if (obj == null) {
            return null;
        }
        for (j next : f9297a) {
            if (next.a(obj.getClass()) && (a2 = next.a(obj)) != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Unsupported Class : ");
        sb.append(obj.getClass());
        throw new IllegalArgumentException(sb.toString());
    }
}
