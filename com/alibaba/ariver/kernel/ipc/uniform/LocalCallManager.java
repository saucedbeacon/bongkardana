package com.alibaba.ariver.kernel.ipc.uniform;

public interface LocalCallManager {
    IPCResult call(IPCParameter iPCParameter);

    void setLocalCallRetryHandler(LocalCallRetryHandler localCallRetryHandler);
}
