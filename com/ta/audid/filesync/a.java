package com.ta.audid.filesync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ta.audid.e.e;
import java.util.HashMap;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static BroadcastReceiver f9844a;

    /* renamed from: a  reason: collision with other field name */
    private static a f8833a;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f8833a == null) {
                f8833a = new a();
            }
            aVar = f8833a;
        }
        return aVar;
    }

    public void b(Context context) {
        if (f9844a == null && context != null) {
            f9844a = new UtdidBroadcastReceiver();
            context.registerReceiver(f9844a, new IntentFilter("com.action.utdid"));
        }
    }

    public void c(Context context) {
        BroadcastReceiver broadcastReceiver = f9844a;
        if (broadcastReceiver != null && context != null) {
            context.unregisterReceiver(broadcastReceiver);
            f9844a = null;
        }
    }

    public void c(String str) {
        Context context = com.ta.audid.a.a().getContext();
        if (context != null) {
            Intent intent = new Intent("com.action.utdid");
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", str);
            hashMap.put("appkey", com.ta.audid.a.a().getAppkey());
            hashMap.put("appName", context.getPackageName());
            String jSONObject = new JSONObject(hashMap).toString();
            intent.putExtra("data", e.e(jSONObject));
            intent.putExtra("sign", com.ta.audid.g.e.h(jSONObject));
            context.sendBroadcast(intent);
        }
    }
}
