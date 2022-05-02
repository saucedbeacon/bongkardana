package com.alipay.mobile.rome.syncservice.c;

import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.HashMap;
import java.util.Map;

public class g {
    private static g b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, a<?>> f9472a = new HashMap();

    public static g a() {
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g();
                }
            }
        }
        return b;
    }

    private g() {
    }

    public static a a(int i) {
        if (i == 2001) {
            return new d();
        }
        if (i == 5002) {
            return new e();
        }
        if (i == 8001) {
            return new f();
        }
        c.a("SyncOperationFactory", "unknown opcode: ".concat(String.valueOf(i)));
        return null;
    }
}
