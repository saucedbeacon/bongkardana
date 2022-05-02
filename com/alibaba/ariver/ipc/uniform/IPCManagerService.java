package com.alibaba.ariver.ipc.uniform;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCParameter;
import com.alibaba.ariver.kernel.ipc.uniform.IPCResult;
import com.alibaba.ariver.kernel.ipc.uniform.LocalCallManager;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;

public class IPCManagerService extends IIPCManager.Stub {

    /* renamed from: a  reason: collision with root package name */
    private LocalCallManager f9004a;

    public IPCResult call(IPCParameter iPCParameter) {
        StringBuilder sb = new StringBuilder("IPCManagerService IPCParameter=[");
        sb.append(iPCParameter.toString());
        sb.append("]");
        RVLogger.d(UniformIpcUtils.TAG, sb.toString());
        return this.f9004a.call(iPCParameter);
    }

    public void setLocalCallManager(LocalCallManager localCallManager) {
        this.f9004a = localCallManager;
    }
}
