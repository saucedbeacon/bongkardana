package com.alibaba.ariver.kernel.api.remote.internal;

import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.remote.IRemoteCaller;
import com.alibaba.ariver.kernel.api.remote.RemoteControlManagement;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.ipc.RVRemoteCallerProxy;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultRemoteControlManagement implements RemoteControlManagement {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<Method, Boolean>> f9129a = new ConcurrentHashMap();

    public boolean isRemoteExtension(Extension extension, Method method) {
        if (ProcessUtils.isMainProcess()) {
            return false;
        }
        return hasRemoteAnnotation(extension, method);
    }

    /* access modifiers changed from: protected */
    public boolean hasRemoteAnnotation(Extension extension, Method method) {
        Map map = this.f9129a.get(extension.getClass().getName());
        if (map == null) {
            map = new ConcurrentHashMap();
            this.f9129a.put(extension.getClass().getName(), map);
        } else if (map.get(method) != null) {
            return ((Boolean) map.get(method)).booleanValue();
        }
        try {
            if (method.getDeclaringClass().getAnnotation(Remote.class) != null) {
                map.put(method, Boolean.TRUE);
                return true;
            } else if (extension.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes()).getAnnotation(Remote.class) != null) {
                map.put(method, Boolean.TRUE);
                return true;
            } else {
                map.put(method, Boolean.FALSE);
                return false;
            }
        } catch (NoSuchMethodException unused) {
            map.put(method, Boolean.FALSE);
            return false;
        }
    }

    public IRemoteCaller getRemoteCallerProxy() {
        return (IRemoteCaller) ((RVRemoteCallerProxy) RVProxy.get(RVRemoteCallerProxy.class)).getRemoteCaller(IRemoteCaller.class);
    }
}
