package com.alipay.mobile.rome.syncservice.c.a;

import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, a> f9469a = new HashMap();

    public final a a(int i) {
        a aVar = this.f9469a.get(Integer.valueOf(i));
        if (aVar == null) {
            aVar = null;
            if (i == 1001) {
                aVar = new b();
            } else if (i == 4001) {
                aVar = new e();
            } else if (i == 5001) {
                aVar = new f();
            } else if (i == 3001) {
                aVar = new c();
            } else if (i != 3002) {
                c.a("SyncSendOperationFactory", "unknown opcode: ".concat(String.valueOf(i)));
            } else {
                aVar = new d();
            }
            if (aVar != null) {
                this.f9469a.put(Integer.valueOf(i), aVar);
            }
        }
        return aVar;
    }
}
