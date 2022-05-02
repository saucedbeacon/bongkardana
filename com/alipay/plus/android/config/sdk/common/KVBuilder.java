package com.alipay.plus.android.config.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class KVBuilder {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f9514a = new HashMap();

    private KVBuilder() {
    }

    public static KVBuilder newBuilder() {
        return new KVBuilder();
    }

    public Map<String, String> build() {
        return this.f9514a;
    }

    public KVBuilder put(@NonNull String str, @Nullable Object obj) {
        if (obj != null) {
            this.f9514a.put(str, String.valueOf(obj));
        } else {
            this.f9514a.put(str, "");
        }
        return this;
    }
}
