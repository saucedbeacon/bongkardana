package com.alibaba.griver.core.embedview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f10292a;
    private Map<String, a> b = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f10292a == null) {
            synchronized (b.class) {
                if (f10292a == null) {
                    f10292a = new b();
                }
            }
        }
        return f10292a;
    }

    public a a(String str) {
        return this.b.get(str);
    }
}
