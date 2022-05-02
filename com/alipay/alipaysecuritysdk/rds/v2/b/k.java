package com.alipay.alipaysecuritysdk.rds.v2.b;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.b.b;
import com.alipay.alipaysecuritysdk.common.collector.a;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.alipay.zoloz.toyger.ToygerService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class k extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9295a = {"appver", "ua", "user", "appname", DictionaryKeys.V2_SDKVER, DictionaryKeys.V2_SDKNAME, ToygerService.KEY_PUBLIC_KEY, "appkey"};
    public Map<String, Object> b;
    public b c;

    public k(Context context, String str, String str2, String str3, String str4, String str5) {
        this();
        byte[] a2 = a.a(context, str5);
        this.b.put("appver", str);
        this.b.put("user", str2);
        this.b.put("appname", str3);
        this.b.put(DictionaryKeys.V2_SDKVER, "1.0.7.20160517");
        this.b.put(DictionaryKeys.V2_SDKNAME, "APRdsSdk");
        this.b.put(ToygerService.KEY_PUBLIC_KEY, b.a(a2));
        this.b.put("appkey", e.c(str4) ? "" : str4);
    }

    private k() {
        this.b = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9295a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            } else if (obj != null && (obj instanceof b)) {
                jSONObject.put(str, ((b) obj).a());
            }
        }
        return jSONObject;
    }
}
