package com.alipay.mobile.rome.syncsdk.service.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9424a = g.class.getSimpleName();
    private final a b;
    private String c = null;
    private byte[] d;

    public g(a aVar, byte[] bArr) {
        this.b = aVar;
        this.d = bArr;
    }

    public void run() {
        c.a(f9424a, "SendLinkSyncDataTask: run: ");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        a2.a(8);
        a2.b(0);
        if (!TextUtils.isEmpty(this.c)) {
            a2.a(this.c);
        } else {
            byte[] bArr = this.d;
            if (bArr != null && bArr.length > 0) {
                a2.a(bArr);
            } else {
                return;
            }
        }
        try {
            this.b.k().a(a2);
        } catch (Exception e) {
            String str = f9424a;
            StringBuilder sb = new StringBuilder("sendSyncPacket: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
        }
    }
}
