package com.alibaba.ariver.resource.content;

import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalPackagePool {

    /* renamed from: a  reason: collision with root package name */
    private static final GlobalPackagePool f10183a = new GlobalPackagePool();
    private Map<String, ResourcePackage> b = new ConcurrentHashMap();

    public static GlobalPackagePool getInstance() {
        return f10183a;
    }

    public synchronized void add(ResourcePackage resourcePackage) {
        ResourcePackage resourcePackage2 = this.b.get(resourcePackage.appId());
        if (resourcePackage2 != null) {
            resourcePackage2.teardown();
            this.b.remove(resourcePackage2.appId());
            RVLogger.d("AriverRes:GlobalPackagePool", "attach global resource package: ".concat(String.valueOf(resourcePackage2)));
        }
        this.b.put(resourcePackage.appId(), resourcePackage);
        resourcePackage.setup(false);
    }

    public synchronized ResourcePackage add(String str) {
        ResourcePackage resourcePackage;
        try {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Package_globalAdd_.concat(String.valueOf(str)));
            resourcePackage = this.b.get(str);
            if (resourcePackage == null) {
                if ("66666692".equalsIgnoreCase(str)) {
                    resourcePackage = new AppxResourcePackage((ResourceContext) null);
                } else if (RVConstants.TINY_APPX_NG_APPID.equalsIgnoreCase(str)) {
                    resourcePackage = new AppxNgResourcePackage((ResourceContext) null);
                } else {
                    resourcePackage = new GlobalResourcePackage(str);
                }
                this.b.put(resourcePackage.appId(), resourcePackage);
                resourcePackage.setup(false);
                RVLogger.d("AriverRes:GlobalPackagePool", "attach global resource package: ".concat(String.valueOf(resourcePackage)));
            }
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Package_globalAdd_.concat(String.valueOf(str)));
        } catch (Throwable th) {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Package_globalAdd_.concat(String.valueOf(str)));
            throw th;
        }
        return resourcePackage;
    }

    public synchronized boolean contains(String str) {
        return this.b.containsKey(str);
    }

    public synchronized void remove(String str) {
        this.b.remove(str);
    }

    public synchronized ResourcePackage getPackage(@NonNull String str) {
        return this.b.get(str);
    }

    public synchronized Collection<ResourcePackage> getPackages() {
        return new HashSet(this.b.values());
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

    public synchronized void waitForSetup(String str) {
        if (this.b.containsKey(str)) {
            this.b.get(str).waitForSetup();
        }
    }

    public synchronized void removeAll() {
        Set<String> keySet = this.b.keySet();
        if (keySet != null && !keySet.isEmpty()) {
            for (String next : keySet) {
                RVLogger.d("AriverRes:GlobalPackagePool", "remove appId = ".concat(String.valueOf(next)));
                ResourcePackage remove = this.b.remove(next);
                if (remove != null) {
                    remove.teardown();
                }
            }
        }
        RVLogger.d("AriverRes:GlobalPackagePool", "removeAll");
    }
}
