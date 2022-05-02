package com.alipay.a.a.a.a.a;

import com.alipay.a.a.a.a.s;
import com.alipay.b.a.e;
import java.lang.reflect.Type;
import org.json.JSONObject;

public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    public final Object a() {
        try {
            String str = new String(this.b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i != 1000) {
                throw new s(Integer.valueOf(i), jSONObject.optString("tips"));
            } else if (this.f9227a == String.class) {
                return jSONObject.optString("result");
            } else {
                return e.a(jSONObject.optString("result"), this.f9227a);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.b));
            sb.append(":");
            sb.append(e);
            throw new s(10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
