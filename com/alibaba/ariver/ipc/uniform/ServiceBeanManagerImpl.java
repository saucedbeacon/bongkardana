package com.alibaba.ariver.ipc.uniform;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.ServiceBeanManager;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ServiceBeanManagerImpl implements ServiceBeanManager {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f9006a = new ConcurrentHashMap();

    public void register(String str, Object obj) {
        if (this.f9006a.get(str) == null) {
            this.f9006a.put(str, obj);
            StringBuilder sb = new StringBuilder("ServiceBeanManagerImpl ihashcode=[");
            sb.append(hashCode());
            sb.append("]   register className=");
            sb.append(str);
            RVLogger.d(UniformIpcUtils.TAG, sb.toString());
        }
    }

    public void registerAndOverride(String str, Object obj) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-166316969, oncanceled);
            onCancelLoad.getMin(-166316969, oncanceled);
        }
        this.f9006a.put(str, obj);
        StringBuilder sb = new StringBuilder("ServiceBeanManagerImpl ihashcode=[");
        sb.append(hashCode());
        sb.append("]  registerAndOverride className=");
        sb.append(str);
        RVLogger.d(UniformIpcUtils.TAG, sb.toString());
    }

    public void unregister(String str) {
        this.f9006a.remove(str);
        RVLogger.d(UniformIpcUtils.TAG, "ServiceBeanManagerImpl unregister className=".concat(String.valueOf(str)));
    }

    public void unregisterAll() {
        this.f9006a.clear();
        RVLogger.d(UniformIpcUtils.TAG, "ServiceBeanManagerImpl unregisterAll");
    }

    public Object getServiceBean(String str) {
        Object obj = this.f9006a.get(str);
        StringBuilder sb = new StringBuilder("ServiceBeanManagerImpl getServiceBean className=");
        sb.append(str);
        sb.append(",obj is ");
        sb.append(obj == null ? "null" : "not null");
        RVLogger.debug(UniformIpcUtils.TAG, sb.toString());
        return obj;
    }

    public int getServiceBeanCount() {
        return this.f9006a.size();
    }
}
