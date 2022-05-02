package com.iap.ac.android.b;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f9674a;

    public static a a() {
        if (f9674a == null) {
            synchronized (a.class) {
                if (f9674a == null) {
                    f9674a = new a();
                }
            }
        }
        return f9674a;
    }

    public synchronized <T> T a(JSONObject jSONObject, String str, T t) {
        if (jSONObject == null) {
            return t;
        }
        try {
            T t2 = jSONObject.get(str);
            if (t2 != null && t2.getClass() == t.getClass()) {
                StringBuilder sb = new StringBuilder("ConfigCenter, get value from config center success, key: ");
                sb.append(str);
                sb.append(", value: ");
                sb.append(t2);
                ACLog.i(Constants.TAG, sb.toString());
                return t2;
            }
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("getKeyOrDefault exception: ", th, Constants.TAG);
        }
        StringBuilder sb2 = new StringBuilder("ConfigCenter, get value from config center fail, key: ");
        sb2.append(str);
        sb2.append(", use default value.");
        ACLog.e(Constants.TAG, sb2.toString());
        return t;
    }

    public synchronized Map a(JSONObject jSONObject, @NonNull String str, @NonNull Map map) {
        try {
            Map map2 = (Map) JsonUtils.fromJson((JSONObject) a(jSONObject, str, new JSONObject(map)), Map.class);
            if (map2 != null) {
                return map2;
            }
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("getMap exception:", th, Constants.TAG);
        }
        return map;
    }
}
