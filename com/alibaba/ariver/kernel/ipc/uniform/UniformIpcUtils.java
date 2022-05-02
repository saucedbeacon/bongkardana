package com.alibaba.ariver.kernel.ipc.uniform;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class UniformIpcUtils {
    public static final String TAG = "AriverKernel:RemoteCall";

    /* renamed from: a  reason: collision with root package name */
    private static IPCContextManager f9154a;
    private static IIPCManager b;

    public static void init(Context context, IIPCManager iIPCManager) {
        IPCContextManager ipcContextManager = getIpcContextManager();
        if (ipcContextManager != null) {
            ipcContextManager.init(context, iIPCManager);
        }
    }

    @Nullable
    public static ServiceBeanManager getServiceBeanManager() {
        IPCContextManager ipcContextManager = getIpcContextManager();
        if (ipcContextManager != null) {
            return ipcContextManager.getServiceBeanManager();
        }
        return null;
    }

    @Nullable
    public static IPCContextManager getIpcContextManager() {
        if (f9154a == null) {
            synchronized (UniformIpcUtils.class) {
                if (f9154a == null) {
                    try {
                        f9154a = IPCApiFactory.getIPCContextManager();
                    } catch (Throwable th) {
                        RVLogger.e(TAG, Log.getStackTraceString(th));
                    }
                }
            }
        }
        return f9154a;
    }

    @Nullable
    public static IIPCManager getIpcManager() {
        if (b == null) {
            synchronized (UniformIpcUtils.class) {
                if (b == null) {
                    try {
                        b = IPCApiFactory.getIPCManager();
                    } catch (Throwable th) {
                        RVLogger.e(TAG, Log.getStackTraceString(th));
                    }
                }
            }
        }
        return b;
    }
}
