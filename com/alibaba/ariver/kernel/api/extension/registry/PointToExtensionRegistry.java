package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.utils.ReflectUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class PointToExtensionRegistry {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Set<Class<? extends Extension>>> f9016a = new ConcurrentHashMap();

    PointToExtensionRegistry() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void registerExtension(Class<? extends Extension> cls) {
        for (Class next : ReflectUtils.collectExtensionPoint(cls, (Set<Class<? extends Extension>>) null)) {
            Set set = this.f9016a.get(next.getName());
            if (set == null) {
                set = new HashSet();
                this.f9016a.put(next.getName(), set);
            }
            set.add(cls);
            ExtensionPoint.invalidateExtensionCache(next);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Collection<Class<? extends Extension>> getExtensionsByPoint(String str) {
        return this.f9016a.get(str);
    }
}
