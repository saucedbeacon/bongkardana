package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f10981a = new HashMap();

    public final h a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f10981a.entrySet()) {
            hashMap.put((String) next.getKey(), Collections.unmodifiableMap(new HashMap((Map) next.getValue())));
        }
        return new h(Collections.unmodifiableMap(hashMap));
    }

    public final void a(String str, String str2, String str3) {
        if (!this.f10981a.containsKey(str2)) {
            this.f10981a.put(str2, new HashMap());
        }
        this.f10981a.get(str2).put(str, str3);
    }
}
