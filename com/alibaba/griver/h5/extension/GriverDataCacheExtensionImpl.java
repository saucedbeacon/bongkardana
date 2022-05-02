package com.alibaba.griver.h5.extension;

import android.text.TextUtils;
import com.alibaba.griver.h5.api.GriverDataCacheExtension;
import java.util.HashMap;
import java.util.Map;

public class GriverDataCacheExtensionImpl implements GriverDataCacheExtension {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10442a = new HashMap();

    public String get(String str) {
        if (!TextUtils.isEmpty(str) && this.f10442a.containsKey(str)) {
            return this.f10442a.get(str);
        }
        return "";
    }

    public void set(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f10442a.put(str, str2);
        }
    }

    public void set(String str, String str2, boolean z) {
        set(str, str2);
    }

    public void remove(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f10442a.remove(str);
        }
    }

    public boolean has(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f10442a.containsKey(str);
    }
}
