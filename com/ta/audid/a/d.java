package com.ta.audid.a;

import android.content.Context;
import android.text.TextUtils;
import com.ta.audid.e.a;
import com.ta.audid.g.k;
import java.util.HashMap;
import java.util.Map;

public class d {
    static Map<String, String> c(Context context) {
        String str;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        String a2 = c.a(context);
        String b = c.b(context);
        if (TextUtils.isEmpty(a2)) {
            a2 = a.F();
        }
        if (TextUtils.isEmpty(b)) {
            b = a.G();
        }
        a(hashMap, "D1", a2);
        a(hashMap, "D2", b);
        a(hashMap, "D3", c.c(context));
        a(hashMap, "D4", c.d());
        a(hashMap, "D5", c.e(context));
        a(hashMap, "D6", c.e());
        a(hashMap, "D7", c.f(context));
        a(hashMap, "D8", c.f());
        a(hashMap, "D9", c.g());
        a(hashMap, "D10", c.g(context));
        hashMap.put("D11", c.h());
        hashMap.put("D12", c.i());
        hashMap.put("D13", c.j());
        hashMap.put("D14", c.i(context));
        hashMap.put("D15", c.j(context));
        hashMap.put("D16", c.k(context));
        hashMap.put("D17", k.u(context));
        String str4 = "1";
        hashMap.put("D18", c.a(context) ? str4 : "0");
        if (c.a(context, 9)) {
            str = str4;
        } else {
            str = "0";
        }
        hashMap.put("D19", str);
        if (c.e(context)) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        hashMap.put("D20", str2);
        if (c.a(context, 4)) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        hashMap.put("D21", str3);
        if (!c.d(context)) {
            str4 = "0";
        }
        hashMap.put("D22", str4);
        return hashMap;
    }

    private static void a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
