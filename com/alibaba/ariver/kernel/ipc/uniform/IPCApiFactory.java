package com.alibaba.ariver.kernel.ipc.uniform;

public final class IPCApiFactory {

    /* renamed from: a  reason: collision with root package name */
    private static IPCContextManager f9153a;
    private static IIPCManager b;

    public static final IIPCManager getIPCManager() {
        return (IIPCManager) Class.forName("com.alibaba.ariver.ipc.uniform.IPCManagerService").newInstance();
    }

    public static final IIPCManager getSingletonIPCManager() {
        IIPCManager iIPCManager = b;
        if (iIPCManager != null) {
            return iIPCManager;
        }
        synchronized (IIPCManager.class) {
            if (b != null) {
                IIPCManager iIPCManager2 = b;
                return iIPCManager2;
            }
            IIPCManager iIPCManager3 = (IIPCManager) Class.forName("com.alibaba.ariver.ipc.uniform.IPCManagerService").newInstance();
            b = iIPCManager3;
            return iIPCManager3;
        }
    }

    public static final IPCContextManager getIPCContextManager() {
        return (IPCContextManager) Class.forName("com.alibaba.ariver.ipc.uniform.IPCContextManagerImpl").newInstance();
    }

    public static final IPCContextManager getSingletonIPCContextManager() {
        IPCContextManager iPCContextManager = f9153a;
        if (iPCContextManager != null) {
            return iPCContextManager;
        }
        synchronized (IPCApiFactory.class) {
            if (f9153a != null) {
                IPCContextManager iPCContextManager2 = f9153a;
                return iPCContextManager2;
            }
            IPCContextManager iPCContextManager3 = (IPCContextManager) Class.forName("com.alibaba.ariver.ipc.uniform.IPCContextManagerImpl").newInstance();
            f9153a = iPCContextManager3;
            return iPCContextManager3;
        }
    }

    public static final ServiceBeanManager getSingletonServiceBeanManager() {
        try {
            return getSingletonIPCContextManager().getServiceBeanManager();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
