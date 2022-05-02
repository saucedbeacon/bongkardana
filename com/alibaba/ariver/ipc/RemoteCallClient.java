package com.alibaba.ariver.ipc;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.IPCContextManager;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public class RemoteCallClient {
    private static final String TAG = "AriverKernel:RemoteCall";
    private static boolean hasPrepared = false;
    /* access modifiers changed from: private */
    public static AtomicBoolean ipcInited = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public static IpcCallClientHelper sIpcCallClientHelper = new IpcCallClientHelper();

    public static void bindContext(Context context) {
        if (ProcessUtils.isMainProcess()) {
            StringBuilder sb = new StringBuilder("IpcCallClientHelper bindContext must be in lite process. ");
            sb.append(Log.getStackTraceString(new Throwable()));
            RVLogger.e("AriverKernel:RemoteCall", sb.toString());
            return;
        }
        sIpcCallClientHelper.bindContext(context);
    }

    public static synchronized void prepare() {
        synchronized (RemoteCallClient.class) {
            if (ProcessUtils.isMainProcess()) {
                StringBuilder sb = new StringBuilder("IpcCallClientHelper prepare must be in lite process. ");
                sb.append(Log.getStackTraceString(new Throwable()));
                RVLogger.e("AriverKernel:RemoteCall", sb.toString());
            } else if (!hasPrepared) {
                hasPrepared = true;
                ipcInited.set(false);
                RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper prepare");
                sIpcCallClientHelper.bindService(RemoteCallService.class, new IpcCallConn());
                ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                    public final void run() {
                        RemoteCallClient.sIpcCallClientHelper.bind();
                    }
                });
                RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper prepare finish");
            }
        }
    }

    static class IpcCallConn implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private IIPCManager f8999a = null;

        IpcCallConn() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper onServiceConnected");
            if (iBinder == null) {
                RemoteCallClient.sIpcCallClientHelper.rebind();
                return;
            }
            this.f8999a = IIPCManager.Stub.asInterface(iBinder);
            RemoteCallClient.sIpcCallClientHelper.setBind(true);
            try {
                UniformIpcUtils.init(ProcessUtils.getContext(), this.f8999a);
                StringBuilder sb = new StringBuilder("IpcCallClientHelper init ipcManager ");
                sb.append(this.f8999a);
                RVLogger.d("AriverKernel:RemoteCall", sb.toString());
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("IpcCallClientHelper init error ");
                sb2.append(Log.getStackTraceString(e));
                RVLogger.d("AriverKernel:RemoteCall", sb2.toString());
            }
            RemoteCallClient.ipcInited.set(true);
            synchronized (RemoteCallClient.class) {
                RemoteCallClient.class.notifyAll();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper onServiceDisconnected");
            this.f8999a = null;
            RemoteCallClient.sIpcCallClientHelper.setBind(false);
            RemoteCallClient.sIpcCallClientHelper.rebind();
            RemoteCallClient.ipcInited.set(false);
        }
    }

    private static void waitBindedIfNeed() {
        Class<RemoteCallClient> cls = RemoteCallClient.class;
        IpcCallClientHelper ipcCallClientHelper = sIpcCallClientHelper;
        if (ipcCallClientHelper == null) {
            RVLogger.e("AriverKernel:RemoteCall", "IpcCallClientHelper waitBindedIfNeed but sIpcCallClientHelper is null");
        } else if (!ipcCallClientHelper.isBind()) {
            synchronized (cls) {
                if (!sIpcCallClientHelper.isBind()) {
                    if (!sIpcCallClientHelper.bind()) {
                        RVLogger.e("AriverKernel:RemoteCall", "IpcCallClientHelper bind failed!!!");
                        return;
                    }
                    try {
                        RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper begin wait bind");
                        cls.wait(5000);
                        RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper end wait bind");
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("IpcCallClientHelper wait error ");
                        sb.append(Log.getStackTraceString(e));
                        RVLogger.e("AriverKernel:RemoteCall", sb.toString());
                    }
                }
            }
        }
    }

    private static void waitIpcIfNeed() {
        Class<RemoteCallClient> cls = RemoteCallClient.class;
        if (sIpcCallClientHelper == null) {
            RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper not need waitIpcIfNeed");
        } else if (!ipcInited.get()) {
            synchronized (cls) {
                if (!ipcInited.get()) {
                    try {
                        RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper begin wait ipc");
                        cls.wait();
                        RVLogger.d("AriverKernel:RemoteCall", "IpcCallClientHelper end wait ipc");
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("IpcCallClientHelper wait ipc error ");
                        sb.append(Log.getStackTraceString(e));
                        RVLogger.e("AriverKernel:RemoteCall", sb.toString());
                    }
                }
            }
        }
    }

    @WorkerThread
    public static <T> T getIpcProxy(Class<T> cls) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            IpcCallClientHelper ipcCallClientHelper = sIpcCallClientHelper;
            if (ipcCallClientHelper == null || !ipcCallClientHelper.isBind()) {
                throw new IllegalStateException("IpcCallClientHelper.getIpcProxy should not call on main thread!!!");
            }
            RVLogger.w("AriverKernel:RemoteCall", "IpcCallClientHelper.getIpcProxy should not call on main thread!!!");
        }
        if (!hasPrepared) {
            prepare();
        }
        waitBindedIfNeed();
        waitIpcIfNeed();
        IPCContextManager ipcContextManager = UniformIpcUtils.getIpcContextManager();
        if (ipcContextManager == null || ipcContextManager.getIpcCallManager() == null) {
            return null;
        }
        return ipcContextManager.getIpcCallManager().getIpcProxy(cls);
    }
}
