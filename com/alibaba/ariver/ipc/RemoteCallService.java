package com.alibaba.ariver.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.ipc.uniform.IIPCManager;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;

public class RemoteCallService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private IIPCManager f9000a;

    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public void onCreate() {
        super.onCreate();
        IIPCManager ipcManager = UniformIpcUtils.getIpcManager();
        this.f9000a = ipcManager;
        UniformIpcUtils.init(this, ipcManager);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return (IBinder) this.f9000a;
    }
}
