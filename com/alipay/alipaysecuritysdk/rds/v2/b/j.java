package com.alipay.alipaysecuritysdk.rds.v2.b;

import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.rds.v2.b.a.a;
import com.alipay.alipaysecuritysdk.rds.v2.b.a.c;
import com.alipay.alipaysecuritysdk.rds.v2.b.a.d;
import com.alipay.alipaysecuritysdk.rds.v2.face.RDSClient;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9294a = {SecurityConstants.KEY_TEXT, ActionSheetItem.BadgeInfo.TYPE_NUM, "action"};
    public Map<String, Object> b;
    public AtomicInteger c;
    public AtomicInteger d;
    public d e;
    public b f;
    private long g;

    public j() {
        this((byte) 0);
        this.e = new d();
        this.b.put(SecurityConstants.KEY_TEXT, String.valueOf(this.g));
        this.b.put(ActionSheetItem.BadgeInfo.TYPE_NUM, String.valueOf(this.c));
        this.b.put("action", this.e);
    }

    private j(byte b2) {
        this.b = new HashMap();
        this.g = System.currentTimeMillis();
        this.c = new AtomicInteger(0);
        this.d = new AtomicInteger(0);
        this.f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9294a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                    RDSClient.isDebug();
                }
            } else if (obj != null && (obj instanceof b)) {
                try {
                    jSONObject.put(str, ((b) obj).a());
                } catch (JSONException e2) {
                    if (RDSClient.isDebug()) {
                        b.a("SEC_SDK-rds", (Throwable) e2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public final synchronized void a(String str, String str2) {
        String b2 = b(str, str2);
        this.c.incrementAndGet();
        if (this.f != null) {
            if (this.f == null || !(this.f instanceof a)) {
                a aVar = new a(str, str2, b2, this.d.incrementAndGet());
                aVar.c();
                this.e.a(aVar);
                this.f = aVar;
                return;
            }
            this.e.a("", false, 0.0d);
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        String b2 = b(str, str2);
        this.c.incrementAndGet();
        if (this.f != null) {
            if (this.f instanceof com.alipay.alipaysecuritysdk.rds.v2.b.a.b) {
                this.e.a(str3, false, 0.0d);
                return;
            }
            com.alipay.alipaysecuritysdk.rds.v2.b.a.b bVar = new com.alipay.alipaysecuritysdk.rds.v2.b.a.b(str, str2, b2, this.d.incrementAndGet());
            bVar.b(str3);
            this.e.a(bVar);
            this.f = bVar;
        }
    }

    public final synchronized void a(String str, String str2, boolean z) {
        String b2 = b(str, str2);
        this.c.incrementAndGet();
        if (this.f != null) {
            if (this.f instanceof c) {
                this.e.a("", z, 0.0d);
                return;
            }
            c cVar = new c(str, str2, b2, this.d.incrementAndGet());
            cVar.a(z);
            this.e.a(cVar);
            this.f = cVar;
        }
    }

    public static String b(String str, String str2) {
        if (e.c(str)) {
            return "2";
        }
        return e.c(str2) ? "1" : "0";
    }
}
