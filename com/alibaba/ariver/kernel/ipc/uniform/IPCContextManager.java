package com.alibaba.ariver.kernel.ipc.uniform;

import android.content.Context;

public interface IPCContextManager {
    IPCCallManager getIpcCallManager();

    LocalCallManager getLocalCallManager();

    ServiceBeanManager getServiceBeanManager();

    void init(Context context, IIPCManager iIPCManager);

    void resetIIPCManager();
}
