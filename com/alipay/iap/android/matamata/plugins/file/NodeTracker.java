package com.alipay.iap.android.matamata.plugins.file;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

final class NodeTracker {
    private final Map<String, Object> mObjects = new HashMap();

    NodeTracker() {
    }

    /* access modifiers changed from: protected */
    public final void put(String str, @NonNull Object obj) {
        this.mObjects.put(str, obj);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object get(String str) {
        return this.mObjects.get(str);
    }

    /* access modifiers changed from: protected */
    public final void clear() {
        this.mObjects.clear();
    }
}
