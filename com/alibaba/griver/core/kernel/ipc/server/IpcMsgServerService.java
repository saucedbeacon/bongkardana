package com.alibaba.griver.core.kernel.ipc.server;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ipc.ServerMsgReceiver;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class IpcMsgServerService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private IIpcChannel f9190a;

    public void onCreate() {
        super.onCreate();
        RVLogger.d("AriverInt:IpcMsgServerService", "onCreate ");
        this.f9190a = new IIpcChannel.Stub() {
            public boolean isFinishing() {
                return false;
            }

            public void sendMessage(IpcMessage ipcMessage) {
                ServerMsgReceiver.getInstance().handleMessage(ipcMessage);
            }
        };
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(560420341, oncanceled);
            onCancelLoad.getMin(560420341, oncanceled);
        }
        RVLogger.d("AriverInt:IpcMsgServerService", "onBind ".concat(String.valueOf(intent)));
        return this.f9190a.asBinder();
    }
}
