package com.alibaba.ariver.engine.api.bridge.store;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class JsAPICallStore {
    public final ConcurrentHashMap<String, AtomicInteger> data = new ConcurrentHashMap<>();
    public final AtomicInteger totalJsapiCount = new AtomicInteger(0);

    public synchronized void append(String str) {
        append(str, 1);
    }

    public synchronized void append(String str, int i) {
        if (this.data.containsKey(str)) {
            this.data.get(str).addAndGet(i);
        } else {
            this.data.put(str, new AtomicInteger(i));
        }
        this.totalJsapiCount.addAndGet(i);
    }

    public synchronized void append(JsAPICallStore jsAPICallStore) {
        for (Map.Entry next : jsAPICallStore.data.entrySet()) {
            append((String) next.getKey(), ((AtomicInteger) next.getValue()).get());
        }
    }
}
