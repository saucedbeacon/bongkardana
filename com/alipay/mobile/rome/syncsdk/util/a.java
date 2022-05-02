package com.alipay.mobile.rome.syncsdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.msync.server.model.MsyncInitMessage;
import java.util.Locale;

public final class a {
    public static MsyncInitMessage a(Context context, String str) {
        MsyncInitMessage msyncInitMessage = new MsyncInitMessage();
        msyncInitMessage.linkVersion = "2.0.0";
        msyncInitMessage.action = str;
        if (TextUtils.equals(str, "unbind")) {
            return msyncInitMessage;
        }
        String str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        String f = com.alipay.mobile.rome.syncsdk.a.a.a().f();
        msyncInitMessage.linkToken = "";
        msyncInitMessage.sessionId = "";
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(f)) {
            msyncInitMessage.linkToken = str2;
            msyncInitMessage.sessionId = f;
        }
        if (TextUtils.equals(str, "bind")) {
            return msyncInitMessage;
        }
        msyncInitMessage.osType = "android";
        msyncInitMessage.network = e.a(context);
        msyncInitMessage.appVersion = com.alipay.mobile.rome.syncsdk.a.a.a().b();
        msyncInitMessage.productId = com.alipay.mobile.rome.syncsdk.a.a.a().c();
        msyncInitMessage.language = Locale.getDefault().getLanguage();
        msyncInitMessage.appId = com.alipay.mobile.rome.syncsdk.a.a.a().d();
        msyncInitMessage.appKey = com.alipay.mobile.rome.syncsdk.a.a.a().g();
        msyncInitMessage.timeStamp = Long.valueOf(System.currentTimeMillis());
        String str3 = com.alipay.mobile.rome.syncsdk.a.a.a().c.authCode;
        String str4 = msyncInitMessage.appKey;
        StringBuilder sb = new StringBuilder();
        sb.append(msyncInitMessage.appKey);
        sb.append(msyncInitMessage.timeStamp);
        msyncInitMessage.signature = g.a(context, str4, str3, sb.toString());
        msyncInitMessage.workspaceId = com.alipay.mobile.rome.syncsdk.a.a.a().c.workspaceId;
        String e = com.alipay.mobile.rome.syncsdk.a.a.a().e();
        msyncInitMessage.deviceId = "";
        if (!TextUtils.isEmpty(e)) {
            msyncInitMessage.deviceId = e;
        }
        msyncInitMessage.network = e.a(context);
        if (!TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().a(context))) {
            msyncInitMessage.linkExtInfo = com.alipay.mobile.rome.syncsdk.a.a.a().a(context);
        } else {
            b a2 = b.a(context);
            String str5 = a2.f9458a;
            String str6 = a2.b;
            String str7 = a2.c;
            msyncInitMessage.imei = str5;
            msyncInitMessage.imsi = str6;
            msyncInitMessage.cKey = str7;
        }
        return msyncInitMessage;
    }
}
