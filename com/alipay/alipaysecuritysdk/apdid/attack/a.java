package com.alipay.alipaysecuritysdk.apdid.attack;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alipay.alipaysecuritysdk.common.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f10647a = 0;
    private Map<String, List<String>> b = new HashMap();

    public a(int i) {
        this.f10647a = i;
    }

    public final void a(String str, String str2) {
        if (!this.b.containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.b.put(str, arrayList);
        } else if (!this.b.get(str).contains(str2)) {
            this.b.get(str).add(str2);
        }
    }

    public final JSONArray a() {
        long j;
        if (this.b.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String next : this.b.keySet()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray(this.b.get(next));
            try {
                byte[] a2 = com.alipay.alipaysecuritysdk.common.e.a.a(next);
                File file = new File(next);
                long j2 = 0;
                if (file.exists()) {
                    j = file.length();
                } else {
                    j = 0;
                }
                File file2 = new File(next);
                if (file2.exists()) {
                    j2 = file2.lastModified() / 1000;
                }
                String b2 = b.b(a2);
                String a3 = b.a(a2);
                jSONObject.put("kind", this.f10647a);
                jSONObject.put("plugin", next);
                jSONObject.put("function", jSONArray2);
                jSONObject.put("md5", b2);
                jSONObject.put("sha1", a3);
                jSONObject.put(GriverMonitorConstants.KEY_SIZE, j);
                jSONObject.put("mtime", j2);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
