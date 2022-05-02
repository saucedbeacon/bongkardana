package com.ta.audid.a;

import android.content.Context;
import com.ta.audid.g.n;
import java.util.HashMap;
import java.util.Map;

public class g {
    public static Map<String, String> d(Context context) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "1";
        if (f.isEmulator(context)) {
            hashMap.put("S2", str2);
        } else {
            hashMap.put("S2", "0");
        }
        hashMap.put("S3", f.l());
        hashMap.put("S4", f.getBrand());
        hashMap.put("S5", f.getModel());
        hashMap.put("S6", f.m());
        hashMap.put("S7", f.n());
        hashMap.put("S8", f.o());
        hashMap.put("S9", f.p());
        hashMap.put("S10", f.q());
        hashMap.put("S11", f.getBuildID());
        hashMap.put("S12", f.r());
        hashMap.put("S13", f.s());
        hashMap.put("S14", f.t());
        hashMap.put("S15", f.getManufacturer());
        hashMap.put("S16", f.u());
        hashMap.put("S17", f.v());
        hashMap.put("S18", f.w());
        hashMap.put("S19", f.x());
        hashMap.put("S20", f.y());
        hashMap.put("S21", f.z());
        hashMap.put("S22", f.A());
        hashMap.put("S23", f.B());
        hashMap.put("S24", n.Y());
        hashMap.put("S25", n.aa());
        hashMap.put("S26", e.m(context));
        hashMap.put("S27", e.n(context));
        hashMap.put("S28", e.o(context));
        hashMap.put("S29", e.p(context));
        if (e.f(context)) {
            str = str2;
        } else {
            str = "0";
        }
        hashMap.put("S31", str);
        if (!e.g(context)) {
            str2 = "0";
        }
        hashMap.put("S32", str2);
        hashMap.put("S33", c.l(context));
        hashMap.put("S34", c.h(context));
        return hashMap;
    }
}
