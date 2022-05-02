package com.alipay.mobile.rome.syncsdk.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.e;

public class LongLinkNetInfoReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f9413a = 0;
    public static volatile boolean b = true;
    private static final String c = LongLinkNetInfoReceiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            boolean b2 = e.b(context);
            b = b2;
            if (!b2) {
                String str = c;
                StringBuilder sb = new StringBuilder("onReceive: [ LongLinkNetInfoReceiver ] [ isNetAvailable=");
                sb.append(b);
                sb.append(" ]");
                c.c(str, sb.toString());
                return;
            }
            f9413a = e.c(context);
            if (com.alipay.mobile.rome.syncsdk.a.c.a()) {
                c.c(c, "onReceive: [ LongLinkNetInfoReceiver ] [ isForceStopped=true ]");
                return;
            }
            a b3 = LongLinkService.b();
            if (b3 == null) {
                c.c(c, "onReceive: [ LongLinkNetInfoReceiver ] [ connManager=null ]");
            } else if (b3.p()) {
                b3.h();
            } else {
                c.a(c, "onReceive: [ LongLinkNetInfoReceiver ] [ isConnected=false - need connect ]");
                if (!com.alipay.mobile.rome.syncsdk.a.c.f()) {
                    com.alipay.mobile.rome.syncsdk.a.c.e();
                }
                b3.c();
            }
        }
    }
}
