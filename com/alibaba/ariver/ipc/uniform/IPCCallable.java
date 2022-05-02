package com.alibaba.ariver.ipc.uniform;

import android.os.DeadObjectException;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCParameter;
import com.alibaba.ariver.kernel.ipc.uniform.IPCResult;
import com.alibaba.ariver.kernel.ipc.uniform.IPCResultDesc;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IPCCallable {

    /* renamed from: a  reason: collision with root package name */
    private IIPCManager f10077a;
    private Lock b = new ReentrantLock();

    public IPCCallable(IIPCManager iIPCManager) {
        this.f10077a = iIPCManager;
    }

    public IPCResult call(IPCParameter iPCParameter) {
        try {
            this.b.lock();
            IPCResult call = this.f10077a.call(iPCParameter);
            this.b.unlock();
            if (call != null) {
                return call;
            }
            throw new IllegalStateException("remote return ipcResult is null!");
        } catch (Exception e) {
            RVLogger.e(UniformIpcUtils.TAG, "IPCCallable call exception!", e);
            IPCResult iPCResult = new IPCResult();
            if (e instanceof DeadObjectException) {
                iPCResult.resultCode = 201;
                iPCResult.resultMsg = IPCResultDesc.DEAD_OBJECT_MSG;
            } else {
                iPCResult.resultCode = 200;
                iPCResult.resultMsg = e.getMessage();
            }
            return iPCResult;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }
}
