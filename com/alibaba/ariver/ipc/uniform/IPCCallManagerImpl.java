package com.alibaba.ariver.ipc.uniform;

import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCCallManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCException;
import com.alibaba.ariver.kernel.ipc.uniform.IPCParameter;
import com.alibaba.ariver.kernel.ipc.uniform.IPCResult;
import com.alibaba.ariver.kernel.ipc.uniform.IPCResultDesc;
import com.alibaba.ariver.kernel.ipc.uniform.IPCRetryHandler;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class IPCCallManagerImpl implements IPCCallManager {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public IPCRetryHandler f9002a;
    /* access modifiers changed from: private */
    public IIPCManager b;

    public <T> T getIpcProxy(Class<T> cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new IPCCallProxyHandler());
    }

    public synchronized void setIIPCManager(IIPCManager iIPCManager) {
        this.b = iIPCManager;
        StringBuilder sb = new StringBuilder("IPCCallManagerImpl [setIIPCManager] Finished. ");
        sb.append(iIPCManager == null ? " ipcManager is null" : "");
        RVLogger.d(UniformIpcUtils.TAG, sb.toString());
    }

    public void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler) {
        this.f9002a = iPCRetryHandler;
    }

    class IPCCallProxyHandler implements InvocationHandler {
        private IPCCallProxyHandler() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            return a(method, objArr, 0);
        }

        private Object a(Method method, Object[] objArr, int i) {
            do {
                RVLogger.d(UniformIpcUtils.TAG, "IPCCallManagerImpl IPCCallProxyHandler#invoke");
                if (IPCCallManagerImpl.this.b == null) {
                    RVLogger.d(UniformIpcUtils.TAG, "IPCCallManagerImpl IPCCallProxyHandler#invoke, ipcManager==null.");
                    IPCException iPCException = new IPCException("You must set IIPCManager. example: IPCCallManager#setIIPCManager");
                    iPCException.errorCode = 2;
                    iPCException.errorMsg = IPCResultDesc.IPC_NO_BINDER_MSG;
                    if (IPCCallManagerImpl.this.f9002a == null) {
                        throw iPCException;
                    } else if (!IPCCallManagerImpl.this.f9002a.retryIPCCall(method, objArr, iPCException, i)) {
                        throw iPCException;
                    } else if (IPCCallManagerImpl.this.b == null) {
                        RVLogger.w(UniformIpcUtils.TAG, "IPCCallManagerImpl IPCCallProxyHandler#invoke, retry later, ipcManager still is null.");
                        throw iPCException;
                    }
                }
                Class<?> declaringClass = method.getDeclaringClass();
                Class[] parameterTypes = method.getParameterTypes();
                IPCParameter iPCParameter = new IPCParameter();
                iPCParameter.className = declaringClass.getName();
                iPCParameter.methodName = method.getName();
                iPCParameter.returnType = method.getReturnType().getName();
                iPCParameter.paramTypes = new String[parameterTypes.length];
                if (IPCCallManagerImpl.this.a(parameterTypes)) {
                    iPCParameter.serType = 2;
                    iPCParameter.paramTypes[0] = parameterTypes[0].getName();
                    iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
                    iPCParameter.parcelable = objArr[0];
                } else {
                    IPCCallManagerImpl.this.a(objArr, parameterTypes, iPCParameter);
                }
                StringBuilder sb = new StringBuilder("IPCCallManagerImpl start ipc call. ipcParameter=[");
                sb.append(iPCParameter.toString());
                sb.append("]");
                RVLogger.d(UniformIpcUtils.TAG, sb.toString());
                IPCResult call = new IPCCallable(IPCCallManagerImpl.this.b).call(iPCParameter);
                if (call != null) {
                    try {
                        if (call.resultCode != 0) {
                            throw new IPCException(call.resultCode, call.resultMsg);
                        } else if (method.getGenericReturnType() == Void.TYPE) {
                            return null;
                        } else {
                            if (call.serType == 2) {
                                return call.parcelable;
                            }
                            return ObjSerializUtil.deserializ(call.resultValue, method.getReturnType().getClassLoader());
                        }
                    } catch (IPCException e) {
                        if (IPCCallManagerImpl.this.f9002a == null) {
                            throw e;
                        } else if (!IPCCallManagerImpl.this.f9002a.retryIPCCall(method, objArr, e, i)) {
                            throw e;
                        }
                    }
                } else {
                    throw new IPCException(106, IPCResultDesc.RETURN_IPCRESULT_IS_NULL_MSG);
                }
            } while (!IPCCallManagerImpl.this.f9002a.retryIPCCall(method, objArr, e, i));
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public boolean a(Class<?>[] clsArr) {
        if (r0 == 0) {
            return false;
        }
        if (r0 == 1) {
            return Parcelable.class.isAssignableFrom(clsArr[0]);
        }
        int i = 0;
        for (Class<?> isAssignableFrom : clsArr) {
            if (Parcelable.class.isAssignableFrom(isAssignableFrom)) {
                i++;
            }
        }
        if (i == 0) {
            return false;
        }
        IPCException iPCException = new IPCException("parameter more than one,and not all Serialize,not support");
        iPCException.errorCode = 3;
        iPCException.errorMsg = IPCResultDesc.IPC_PARAMER_ERROR_MSG;
        throw iPCException;
    }

    /* access modifiers changed from: private */
    public void a(Object[] objArr, Class<?>[] clsArr, IPCParameter iPCParameter) {
        for (int i = 0; i < clsArr.length; i++) {
            iPCParameter.paramTypes[i] = clsArr[i].getName();
        }
        if (iPCParameter.paramTypes.length > 0) {
            iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
            for (int i2 = 0; i2 < iPCParameter.paramTypes.length; i2++) {
                iPCParameter.paramValues.add(ObjSerializUtil.serializ(objArr[i2]));
            }
        }
    }
}
