package com.alipay.alipaysecuritysdk.apdid.f;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.taobao.dp.DeviceSecuritySDK;
import com.taobao.dp.client.IInitResultListener;
import com.taobao.dp.http.IUrlRequestService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f9260a = "";
    /* access modifiers changed from: private */
    public static volatile boolean b = false;

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            if (e.c(f9260a)) {
                String a2 = com.alipay.alipaysecuritysdk.common.d.a.a(context, "xxxwww_v2", "umidtk");
                f9260a = a2;
                if (e.c(a2)) {
                    String str2 = "";
                    try {
                        str2 = DeviceSecuritySDK.getInstance(context).getSecurityToken();
                    } catch (Throwable th) {
                        b.a("SEC_SDK-apdid", th);
                    }
                    f9260a = a(context, str2);
                }
            }
            str = f9260a;
        }
        return str;
    }

    public static String b(Context context) {
        String str = "";
        try {
            b = false;
            DeviceSecuritySDK.getInstance(context).initAsync(str, 0, (IUrlRequestService) null, new IInitResultListener() {
                public final void onInitFinished(String str, int i) {
                    boolean unused = a.b = true;
                }
            });
            int i = 3000;
            while (!b && i > 0) {
                Thread.sleep(10);
                i -= 10;
            }
            str = DeviceSecuritySDK.getInstance(context).getSecurityToken();
        } catch (Throwable th) {
            b.a("SEC_SDK-apdid", "umid request error", th);
        }
        String a2 = a(context, str);
        if (e.d(a2)) {
            com.alipay.alipaysecuritysdk.common.d.a.a(context, "xxxwww_v2", "umidtk", a2);
            f9260a = a2;
        }
        return a2;
    }

    private static String a(Context context, String str) {
        if (!e.c(str) && !e.a(str, "000000000000000000000000")) {
            return str;
        }
        String a2 = b.a(context);
        return ((a2 == null || !a2.contains("?")) && !e.c(a2)) ? a2 : "";
    }
}
