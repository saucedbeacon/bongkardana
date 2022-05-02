package com.alibaba.griver.core.embedview;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f10294a;
    private Map<String, a> b = new ConcurrentHashMap();

    private e() {
    }

    public static e a() {
        if (f10294a == null) {
            synchronized (e.class) {
                if (f10294a == null) {
                    f10294a = new e();
                }
            }
        }
        return f10294a;
    }

    public synchronized void a(a aVar) {
        if (aVar != null) {
            String c = aVar.c();
            String a2 = aVar.a();
            String b2 = aVar.b();
            StringBuilder sb = new StringBuilder("addType ");
            sb.append(a2);
            sb.append("/");
            sb.append(b2);
            sb.append("/");
            sb.append(c);
            RVLogger.debug("Griver:NXEmbedViewConfigManager", sb.toString());
            if (this.b.containsKey(c)) {
                RVLogger.d("Griver:NXEmbedViewConfigManager", "addType repeated type ".concat(String.valueOf(c)));
            } else {
                this.b.put(c, aVar);
            }
        }
    }

    public a a(String str) {
        return this.b.get(str);
    }
}
