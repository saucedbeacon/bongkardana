package com.alibaba.ariver.resource.content;

import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ResourcePackagePool {

    /* renamed from: a  reason: collision with root package name */
    private static final ResourcePackagePool f10188a = new ResourcePackagePool();
    private final Map<String, ResourcePackage> b = new ConcurrentHashMap();
    private final Map<String, Integer> c = new ConcurrentHashMap();

    public static ResourcePackagePool getInstance() {
        return f10188a;
    }

    private void a(String str) {
        if (this.c.containsKey(str)) {
            Map<String, Integer> map = this.c;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            return;
        }
        this.c.put(str, 1);
    }

    private boolean b(String str) {
        boolean z = true;
        if (this.c.containsKey(str)) {
            int intValue = this.c.get(str).intValue() - 1;
            this.c.put(str, Integer.valueOf(intValue));
            if (intValue != 0) {
                z = false;
            }
            if (z) {
                this.c.remove(str);
            }
            return z;
        }
        StringBuilder sb = new StringBuilder("cannot detach ");
        sb.append(str);
        sb.append(" because it not attached!");
        RVLogger.w("AriverRes:PackagePool", sb.toString());
        return true;
    }

    public synchronized void attach(ResourcePackage resourcePackage) {
        String appId = resourcePackage.appId();
        if (!this.b.containsKey(appId)) {
            RVLogger.d("AriverRes:PackagePool", "attach resource package: ".concat(String.valueOf(appId)));
            resourcePackage.setup(false);
            this.b.put(appId, resourcePackage);
        }
        a(appId);
    }

    public synchronized ResourcePackage attach(String str, ResourceContext resourceContext) {
        ResourcePackage resourcePackage;
        if (GlobalPackagePool.getInstance().contains(str)) {
            return GlobalPackagePool.getInstance().getPackage(str);
        }
        if (!this.b.containsKey(str)) {
            RVLogger.d("AriverRes:PackagePool", "attach resource package: ".concat(String.valueOf(str)));
            if ("66666692".equalsIgnoreCase(str)) {
                resourcePackage = new AppxResourcePackage(resourceContext);
            } else {
                resourcePackage = new NormalResourcePackage(str, resourceContext);
            }
            resourcePackage.setup(false);
            this.b.put(str, resourcePackage);
        } else {
            resourcePackage = this.b.get(str);
        }
        a(str);
        return resourcePackage;
    }

    public synchronized void detach(String str) {
        if (b(str)) {
            RVLogger.d("AriverRes:PackagePool", "detach resource package: ".concat(String.valueOf(str)));
            ResourcePackage remove = this.b.remove(str);
            if (remove != null) {
                remove.teardown();
            }
        }
    }

    public boolean contains(String str) {
        return this.b.containsKey(str);
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        for (ResourcePackage resourcePackage : this.b.values()) {
            Resource resource = resourcePackage.get(resourceQuery);
            if (resource != null) {
                return resource;
            }
        }
        return null;
    }

    public ResourcePackage getPackage(@NonNull String str) {
        return this.b.get(str);
    }

    public synchronized void removeAll() {
        Set<String> keySet = this.b.keySet();
        if (keySet != null && !keySet.isEmpty()) {
            for (String next : keySet) {
                RVLogger.d("AriverRes:PackagePool", "remove appId = ".concat(String.valueOf(next)));
                ResourcePackage remove = this.b.remove(next);
                if (remove != null) {
                    remove.teardown();
                }
            }
        }
        RVLogger.d("AriverRes:PackagePool", "removeAll");
    }
}
