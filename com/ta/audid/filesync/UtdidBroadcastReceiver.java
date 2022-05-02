package com.ta.audid.filesync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ta.audid.c.a;
import com.ta.audid.e.e;
import com.ta.audid.g.j;
import com.ta.audid.g.m;
import org.json.JSONObject;

public class UtdidBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(final Context context, final Intent intent) {
        String str;
        m.d();
        try {
            str = intent.getAction();
        } catch (Exception unused) {
            str = "";
        }
        if ("com.action.utdid".equalsIgnoreCase(str)) {
            j.a().submit(new Runnable() {
                public void run() {
                    String str;
                    String str2;
                    try {
                        String stringExtra = intent.getStringExtra("data");
                        String stringExtra2 = intent.getStringExtra("sign");
                        String d = e.d(stringExtra);
                        JSONObject jSONObject = new JSONObject(d);
                        if (jSONObject.has("utdid")) {
                            str = jSONObject.getString("utdid");
                        } else {
                            str = "";
                        }
                        if (jSONObject.has("appkey")) {
                            jSONObject.getString("appkey");
                        }
                        if (jSONObject.has("appName")) {
                            str2 = jSONObject.getString("appName");
                        } else {
                            str2 = "";
                        }
                        String E = a.a().E();
                        StringBuilder sb = new StringBuilder("currentAppUtdid:");
                        sb.append(E);
                        sb.append(",intentUtdid:");
                        sb.append(str);
                        m.a("", sb.toString());
                        if (!TextUtils.isEmpty(E) && !TextUtils.isEmpty(str) && !E.equals(str)) {
                            String packageName = context.getPackageName();
                            if (!TextUtils.isEmpty(packageName) && packageName.equals(str2)) {
                                String h = com.ta.audid.g.e.h(d);
                                if (!TextUtils.isEmpty(h) && h.equalsIgnoreCase(stringExtra2)) {
                                    a.a().b(str);
                                }
                            }
                        }
                    } catch (Exception e) {
                        m.d("", e);
                    }
                }
            });
        }
    }
}
