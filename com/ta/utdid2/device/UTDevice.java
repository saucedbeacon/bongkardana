package com.ta.utdid2.device;

import android.content.Context;
import com.ta.audid.a;
import com.ta.utdid2.a.a.e;

public class UTDevice {
    @Deprecated
    public static String getUtdid(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        a.a().a(context);
        if (a.a().a()) {
            return v(context);
        }
        a.a().init();
        return com.ta.audid.c.a.a().getUtdid();
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        if (context == null) {
            return "ffffffffffffffffffffffff";
        }
        a.a().a(context);
        if (a.a().a()) {
            return w(context);
        }
        a.a().init();
        return com.ta.audid.c.a.a().C();
    }

    private static String v(Context context) {
        a b = b.b(context);
        return (b == null || e.isEmpty(b.getUtdid())) ? "ffffffffffffffffffffffff" : b.getUtdid();
    }

    private static String w(Context context) {
        String ad = c.a(context).ad();
        return (ad == null || e.isEmpty(ad)) ? "ffffffffffffffffffffffff" : ad;
    }
}
