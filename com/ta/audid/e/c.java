package com.ta.audid.e;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.ta.audid.a;
import com.ta.audid.a.b;
import com.ta.utdid2.a.a.e;
import java.util.HashMap;
import org.json.JSONObject;

public class c {
    public static String b(String str) {
        Context context = a.a().getContext();
        if (context == null) {
            return "";
        }
        return e.l(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", new Object[]{"audid", a.a().b(), a(str, com.ta.audid.f.e.J(), a.a().getAppkey(), context.getPackageName())}));
    }

    private static String a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("audid", str2);
        hashMap.put("utdid", str);
        hashMap.put("appkey", str3);
        hashMap.put("appName", str4);
        return new JSONObject(e.a(hashMap)).toString();
    }

    public static String c(String str) {
        Context context = a.a().getContext();
        if (context == null) {
            return "";
        }
        return e.l(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", new Object[]{Personalization.ANALYTICS_ORIGIN_PERSONALIZATION, a.a().b(), a(str, a.a().getAppkey(), context.getPackageName())}));
    }

    private static String a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("utdid", str);
        hashMap.put("appkey", str2);
        hashMap.put("appName", str3);
        hashMap.put("fp_info", b.a(a.a().getContext()));
        return new JSONObject(hashMap).toString();
    }
}
