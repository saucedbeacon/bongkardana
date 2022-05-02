package com.alipay.iap.android.f2fpay.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class KeyValueRegistry {
    public static final String QUERY_COUNT = "QUERY_COUNT";
    public static final String QUERY_INTERVAL = "QUERY_INTERVAL";

    /* renamed from: a  reason: collision with root package name */
    private static KeyValueRegistry f9315a;
    private SharedPreferences b;
    private Map<String, KeyValueAccessor> c = new HashMap();

    private KeyValueRegistry() {
    }

    public static KeyValueRegistry getInstance() {
        if (f9315a == null) {
            f9315a = new KeyValueRegistry();
        }
        return f9315a;
    }

    public synchronized KeyValueAccessor accessor(String str) {
        KeyValueAccessor keyValueAccessor;
        keyValueAccessor = this.c.get(str);
        if (keyValueAccessor == null && this.b != null) {
            keyValueAccessor = new KeyValueAccessor(this.b, str);
            this.c.put(str, keyValueAccessor);
        }
        return keyValueAccessor;
    }

    public void initialize(Context context) {
        if (this.b == null) {
            this.b = context.getSharedPreferences("f2fpay_config", 0);
        }
    }
}
