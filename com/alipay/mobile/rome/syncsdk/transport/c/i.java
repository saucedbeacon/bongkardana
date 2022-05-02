package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import org.json.JSONException;
import org.json.JSONObject;

public class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9444a = i.class.getSimpleName();
    private final a b;

    public i(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 2;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        try {
            int optInt = new JSONObject(aVar.f()).optInt("reconnectTime");
            String str = f9444a;
            StringBuilder sb = new StringBuilder("processPacket: [ reconnectInterval=");
            sb.append(optInt);
            sb.append(" ]");
            c.a(str, sb.toString());
            b.b(optInt);
        } catch (JSONException e) {
            String str2 = f9444a;
            StringBuilder sb2 = new StringBuilder("processPacket: [ Exception=");
            sb2.append(e);
            sb2.append(" ]");
            c.d(str2, sb2.toString());
        }
        this.b.f();
    }
}
