package com.alibaba.ariver.kernel.api.remote.internal;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.remote.IRemoteCaller;
import com.alibaba.ariver.kernel.api.remote.RemoteCallArgs;
import com.alibaba.ariver.kernel.api.remote.RemoteCallResult;
import com.alibaba.ariver.kernel.api.remote.RemoteControlManagement;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import java.lang.reflect.Method;

public class DefaultRemoteController implements RemoteController {

    /* renamed from: a  reason: collision with root package name */
    private RemoteControlManagement f9130a;

    public void bindExtensionManager(ExtensionManager extensionManager) {
    }

    public void setRemoteControlManagement(RemoteControlManagement remoteControlManagement) {
        this.f9130a = remoteControlManagement;
    }

    public synchronized RemoteControlManagement getRemoteControlManagement() {
        if (this.f9130a == null) {
            this.f9130a = createRemoteControlManagement();
        }
        return this.f9130a;
    }

    /* access modifiers changed from: protected */
    public RemoteControlManagement createRemoteControlManagement() {
        return new DefaultRemoteControlManagement();
    }

    public boolean isRemoteCallExtension(Extension extension, Method method) {
        return getRemoteControlManagement().isRemoteExtension(extension, method);
    }

    public RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) {
        IRemoteCaller remoteCallerProxy = getRemoteControlManagement().getRemoteCallerProxy();
        if (remoteCallerProxy != null) {
            return remoteCallerProxy.remoteCall(remoteCallArgs);
        }
        throw new IllegalStateException("RemoteCaller Not Found");
    }
}
