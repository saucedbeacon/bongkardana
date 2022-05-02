package com.alipay.alipaysecuritysdk.apdid.b;

import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    String f9252a;
    String b;
    String c;
    private String d;
    private String e;
    private String f;

    public a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("resultType")) {
                this.d = jSONObject.getString("resultType");
            }
            if (jSONObject.has("dynamicTrace")) {
                this.f9252a = jSONObject.getString("dynamicTrace");
            }
            if (jSONObject.has("dynamicNum")) {
                this.b = jSONObject.getString("dynamicNum");
            }
            if (jSONObject.has("dynamicInterval")) {
                this.e = jSONObject.getString("dynamicInterval");
            }
            if (jSONObject.has("aDynamicSwi")) {
                this.f = jSONObject.getString("aDynamicSwi");
            }
        } catch (Exception e2) {
            b.a("SEC_SDK-apdid", (Throwable) e2);
        }
    }

    public final boolean a() {
        if (b() <= 0 || c() < 0) {
            return false;
        }
        if ("mix".equals(this.d) || "dynamic".equals(this.d)) {
            return true;
        }
        return false;
    }

    public final int b() {
        return e.a(this.f, -1);
    }

    public final int c() {
        return e.a(this.e, -1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[resultType:");
        sb.append(this.d);
        sb.append(",dynamicTrace:");
        sb.append(this.f9252a);
        sb.append(",dynamicNum:");
        sb.append(this.b);
        sb.append(",dynamicInterval:");
        sb.append(this.e);
        sb.append(",aDynamicSwi:");
        sb.append(this.f);
        sb.append(",dynamicData:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
