package com.alibaba.ariver.resource.runtime;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.RefAware;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Keep
public class ResourceContextManager {
    private static final String TAG = "Ariver:ResourceContextManager";
    private static volatile ResourceContextManager instance;
    private final Map<String, RefAware<ResourceContext>> resourceContextMap = new ConcurrentHashMap();

    public static ResourceContextManager getInstance() {
        if (instance == null) {
            synchronized (ResourceContextManager.class) {
                if (instance == null) {
                    instance = new ResourceContextManager();
                }
            }
        }
        return instance;
    }

    @NonNull
    private synchronized RefAware<ResourceContext> getRef(String str) {
        RefAware<ResourceContext> refAware;
        refAware = this.resourceContextMap.get(str);
        if (refAware == null) {
            ResourceContext resourceContext = new ResourceContext();
            resourceContext.setAppId(str);
            RefAware<ResourceContext> refAware2 = new RefAware<>(resourceContext);
            this.resourceContextMap.put(str, refAware2);
            refAware = refAware2;
        }
        return refAware;
    }

    public ResourceContext get(String str) {
        return getRef(str).get();
    }

    /* access modifiers changed from: package-private */
    public ResourceContext onAppLoad(String str) {
        StringBuilder sb = new StringBuilder("onAppLoad ");
        sb.append(str);
        sb.append(" increment ref");
        RVLogger.d(TAG, sb.toString());
        RefAware<ResourceContext> ref = getRef(str);
        ref.incrementRef();
        return ref.get();
    }

    /* access modifiers changed from: package-private */
    public void onAppDestroy(String str) {
        RefAware refAware = this.resourceContextMap.get(str);
        if (refAware != null) {
            boolean decrementRef = refAware.decrementRef();
            StringBuilder sb = new StringBuilder("onAppDestroy ");
            sb.append(str);
            sb.append(" needDestroy ");
            sb.append(decrementRef);
            RVLogger.d(TAG, sb.toString());
            if (decrementRef) {
                this.resourceContextMap.remove(str);
                ((ResourceContext) refAware.get()).releaseResourcePackages();
            }
        }
    }
}
