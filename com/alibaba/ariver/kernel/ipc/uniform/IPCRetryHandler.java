package com.alibaba.ariver.kernel.ipc.uniform;

import java.lang.reflect.Method;

public interface IPCRetryHandler {
    boolean retryIPCCall(Method method, Object[] objArr, IPCException iPCException, int i);
}
