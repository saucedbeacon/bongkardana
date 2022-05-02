package com.alibaba.ariver.kernel.ipc.uniform;

public interface IPCCallManager {
    <T> T getIpcProxy(Class<T> cls);

    void setIIPCManager(IIPCManager iIPCManager);

    void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler);
}
