package com.ta.audid.f;

import android.text.TextUtils;
import com.ta.audid.g.m;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f9839a = -1;
    public String g = "";

    public static boolean a(int i) {
        return i >= 0 && i != 10012;
    }

    public static a a(String str) {
        JSONObject jSONObject;
        a aVar = new a();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("code")) {
                aVar.f9839a = jSONObject2.getInt("code");
            }
            if (jSONObject2.has("message")) {
                aVar.g = jSONObject2.getString("message");
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null) {
                if (jSONObject.has("audid")) {
                    String string = jSONObject.getString("audid");
                    if (!TextUtils.isEmpty(string)) {
                        e.d(string);
                    }
                }
                if (jSONObject.has("utdid")) {
                    String string2 = jSONObject.getString("utdid");
                    if (!TextUtils.isEmpty(string2)) {
                        e.a(com.ta.audid.a.a().getContext(), string2);
                        e.e(string2);
                        e.g(string2);
                        com.ta.audid.filesync.a.a().c(string2);
                    }
                }
            }
        } catch (JSONException e) {
            m.d("", e.toString());
        }
        return aVar;
    }
}
