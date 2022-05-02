package com.alibaba.ariver.kernel.ipc.uniform;

public interface LocalCallRetryHandler {
    boolean retryLocalCall(IPCParameter iPCParameter, IPCResult iPCResult, ServiceBeanManager serviceBeanManager, int i);
}
