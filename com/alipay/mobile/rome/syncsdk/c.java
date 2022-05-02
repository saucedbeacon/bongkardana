package com.alipay.mobile.rome.syncsdk;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.service.e;
import org.json.JSONException;
import org.json.JSONObject;

final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f9410a;

    c(b bVar) {
        this.f9410a = bVar;
    }

    public final void a(String str) {
        String e = b.f9408a;
        StringBuilder sb = new StringBuilder("onReceivedPacket[ packet=");
        sb.append(str);
        sb.append(" ]");
        com.alipay.mobile.rome.syncsdk.util.c.b(e, sb.toString());
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("appId");
            String optString2 = jSONObject.optString("payload");
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2)) {
                    if (this.f9410a.d == null) {
                        com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onReceivedPacket: [ packetHanlder=null ]");
                        return;
                    } else {
                        this.f9410a.d.a(optString, optString2);
                        return;
                    }
                }
            }
            com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onReceivedPacket: [ appId or appData =null or empty ]");
        } catch (JSONException e2) {
            String e3 = b.f9408a;
            StringBuilder sb2 = new StringBuilder("onReceivedPacket: [ Exception=");
            sb2.append(e2);
            sb2.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d(e3, sb2.toString());
        }
    }

    public final void a(byte[] bArr) {
        com.alipay.mobile.rome.syncsdk.util.c.b(b.f9408a, "onReceivedPacketSync");
        if (this.f9410a.d == null) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onReceivedPacketSync: [ packetHanlder=null ]");
        } else {
            this.f9410a.d.a(bArr);
        }
    }

    public final void a() {
        com.alipay.mobile.rome.syncsdk.util.c.b(b.f9408a, "onLongLinkRegistered ");
        if (this.f9410a.d == null) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onLongLinkRegistered: [ packetHanlder=null ]");
        } else {
            this.f9410a.d.a();
        }
    }

    public final void b() {
        com.alipay.mobile.rome.syncsdk.util.c.b(b.f9408a, "onLongLinkDeviceBinded： ");
        if (this.f9410a.d == null) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onLongLinkDeviceBinded: [ packetHanlder=null ]");
        } else {
            this.f9410a.d.b();
        }
    }

    public final void c() {
        com.alipay.mobile.rome.syncsdk.util.c.b(b.f9408a, "onLongLinkUserBinded： ");
        if (this.f9410a.d == null) {
            com.alipay.mobile.rome.syncsdk.util.c.d(b.f9408a, "onLongLinkUserBinded: [ packetHanlder=null ]");
        } else {
            this.f9410a.d.c();
        }
    }
}
