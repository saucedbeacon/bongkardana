package com.alibaba.ariver.ipc.uniform;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCCallManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCContextManager;
import com.alibaba.ariver.kernel.ipc.uniform.LocalCallManager;
import com.alibaba.ariver.kernel.ipc.uniform.ServiceBeanManager;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;

public class IPCContextManagerImpl implements IPCContextManager {

    /* renamed from: a  reason: collision with root package name */
    private IPCCallManager f9003a;
    private ServiceBeanManager b;
    private LocalCallManager c;
    private IIPCManager d;
    private Context e;

    public void init(Context context, IIPCManager iIPCManager) {
        this.e = context;
        this.d = iIPCManager;
        getIpcCallManager().setIIPCManager(this.d);
        IIPCManager iIPCManager2 = this.d;
        if (iIPCManager2 instanceof IPCManagerService) {
            ((IPCManagerService) iIPCManager2).setLocalCallManager(getLocalCallManager());
        }
    }

    public synchronized void resetIIPCManager() {
        RVLogger.d(UniformIpcUtils.TAG, "IPCContextManagerImpl resetIIPCManager !");
        this.d = null;
        getIpcCallManager().setIIPCManager((IIPCManager) null);
        RVLogger.d(UniformIpcUtils.TAG, "IPCContextManagerImpl [resetIIPCManager] reset iIpcManager to null.");
    }

    public IPCCallManager getIpcCallManager() {
        IPCCallManager iPCCallManager = this.f9003a;
        if (iPCCallManager != null) {
            return iPCCallManager;
        }
        synchronized (this) {
            if (this.f9003a != null) {
                IPCCallManager iPCCallManager2 = this.f9003a;
                return iPCCallManager2;
            }
            IPCCallManagerImpl iPCCallManagerImpl = new IPCCallManagerImpl();
            this.f9003a = iPCCallManagerImpl;
            return iPCCallManagerImpl;
        }
    }

    public ServiceBeanManager getServiceBeanManager() {
        ServiceBeanManager serviceBeanManager = this.b;
        if (serviceBeanManager != null) {
            return serviceBeanManager;
        }
        synchronized (this) {
            if (this.b != null) {
                ServiceBeanManager serviceBeanManager2 = this.b;
                return serviceBeanManager2;
            }
            ServiceBeanManagerImpl serviceBeanManagerImpl = new ServiceBeanManagerImpl();
            this.b = serviceBeanManagerImpl;
            return serviceBeanManagerImpl;
        }
    }

    public LocalCallManager getLocalCallManager() {
        LocalCallManager localCallManager = this.c;
        if (localCallManager != null) {
            return localCallManager;
        }
        synchronized (this) {
            if (this.c != null) {
                LocalCallManager localCallManager2 = this.c;
                return localCallManager2;
            }
            LocalCallManagerImpl localCallManagerImpl = new LocalCallManagerImpl(getServiceBeanManager());
            this.c = localCallManagerImpl;
            return localCallManagerImpl;
        }
    }
}
