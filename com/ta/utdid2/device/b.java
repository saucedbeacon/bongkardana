package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.a.a.d;
import com.ta.utdid2.a.a.e;
import java.util.zip.Adler32;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f9858a;
    static final Object d = new Object();

    static long a(a aVar) {
        if (aVar == null) {
            return 0;
        }
        String format = String.format("%s%s%s%s%s", new Object[]{aVar.getUtdid(), aVar.getDeviceId(), Long.valueOf(aVar.b()), aVar.getImsi(), aVar.getImei()});
        if (e.isEmpty(format)) {
            return 0;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(format.getBytes());
        return adler32.getValue();
    }

    private static a a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (d) {
            String value = c.a(context).getValue();
            if (e.isEmpty(value)) {
                return null;
            }
            if (value.endsWith("\n")) {
                value = value.substring(0, value.length() - 1);
            }
            a aVar = new a();
            long currentTimeMillis = System.currentTimeMillis();
            String imei = d.getImei(context);
            String imsi = d.getImsi(context);
            aVar.j(imei);
            aVar.setImei(imei);
            aVar.c(currentTimeMillis);
            aVar.setImsi(imsi);
            aVar.k(value);
            aVar.b(a(aVar));
            return aVar;
        }
    }

    public static synchronized a b(Context context) {
        synchronized (b.class) {
            if (f9858a != null) {
                a aVar = f9858a;
                return aVar;
            } else if (context == null) {
                return null;
            } else {
                a a2 = a(context);
                f9858a = a2;
                return a2;
            }
        }
    }
}
