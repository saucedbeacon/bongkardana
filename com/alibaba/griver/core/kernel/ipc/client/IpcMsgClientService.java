package com.alibaba.griver.core.kernel.ipc.client;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import java.lang.ref.WeakReference;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class IpcMsgClientService extends Service {
    public static Class[] SERVICE_CLASSES = {Lite1.class, Lite2.class, Lite3.class};

    /* renamed from: a  reason: collision with root package name */
    private IIpcChannel f9189a;

    public static class Lite1 extends IpcMsgClientService {
    }

    public static class Lite2 extends IpcMsgClientService {
    }

    public static class Lite3 extends IpcMsgClientService {
    }

    public void onCreate() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1797683940, oncanceled);
            onCancelLoad.getMin(-1797683940, oncanceled);
        }
        super.onCreate();
        RVLogger.d("AriverInt:IpcMsgClientService", "onCreate");
        this.f9189a = new IIpcChannel.Stub() {
            public void sendMessage(IpcMessage ipcMessage) {
                ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
            }

            public boolean isFinishing() {
                WeakReference<Activity> topActivity = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity();
                return topActivity.get() != null && topActivity.get().isFinishing();
            }
        };
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        RVLogger.d("AriverInt:IpcMsgClientService", "onBind");
        return this.f9189a.asBinder();
    }
}
