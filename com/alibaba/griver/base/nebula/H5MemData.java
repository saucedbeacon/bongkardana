package com.alibaba.griver.base.nebula;

import com.alibaba.griver.base.api.H5Data;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class H5MemData implements H5Data {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10231a = new HashMap();

    public void set(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-304236461, oncanceled);
            onCancelLoad.getMin(-304236461, oncanceled);
        }
        this.f10231a.put(str, str2);
    }

    public String get(String str) {
        return this.f10231a.get(str);
    }

    public String remove(String str) {
        return this.f10231a.remove(str);
    }

    public boolean has(String str) {
        return this.f10231a.containsKey(str);
    }
}
