package com.alibaba.ariver.kernel.ipc;

import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class IpcClientKernelUtils {
    public static final String LOG_TAG = "AriverInt:IpcClient";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<IpcMessage> f9150a = new ArrayList();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void sendMsgToServer(String str, int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int lpid = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getLpid();
        bundle.putBoolean(IpcMessageConstants.EXTRA_FROM_LITE_PROCESS, !ProcessUtils.isMainProcess());
        bundle.putInt(IpcMessageConstants.EXTRA_LPID, lpid);
        obtain.setData(bundle);
        IpcMessage ipcMessage = new IpcMessage();
        ipcMessage.biz = str;
        ipcMessage.bizMsg = obtain;
        ipcMessage.clientId = ProcessUtils.getProcessName();
        ipcMessage.pid = ProcessUtils.getPid();
        ipcMessage.lpid = lpid;
        try {
            synchronized (f9150a) {
                IIpcChannel serverChannel = IpcChannelManager.getInstance().getServerChannel();
                if (serverChannel != null) {
                    serverChannel.sendMessage(ipcMessage);
                } else {
                    a(ipcMessage);
                    RVLogger.w("AriverInt:IpcClient", "sendMsgToServer but cannot find serverProxy!");
                }
            }
        } catch (RemoteException e) {
            RVLogger.w("AriverInt:IpcClient", "sendMsgToServer exception!", e);
        }
    }

    private static void a(IpcMessage ipcMessage) {
        if (!b.getAndSet(true)) {
            RVLogger.d("AriverInt:IpcClient", "registerServerReadyListener");
            IpcChannelManager.getInstance().registerServerReadyListener(new IpcChannelManager.ServerReadyListener() {
                public final void onServerReady() {
                    RVLogger.d("AriverInt:IpcClient", "onServerReady");
                    IIpcChannel serverChannel = IpcChannelManager.getInstance().getServerChannel();
                    if (serverChannel == null) {
                        RVLogger.e("AriverInt:IpcClient", "onServerReady but server channel == null!!");
                        return;
                    }
                    synchronized (IpcClientKernelUtils.f9150a) {
                        for (IpcMessage sendMessage : IpcClientKernelUtils.f9150a) {
                            try {
                                serverChannel.sendMessage(sendMessage);
                            } catch (RemoteException e) {
                                RVLogger.w("AriverInt:IpcClient", "sendMessage to server exception!", e);
                            }
                        }
                    }
                    IpcChannelManager.getInstance().unRegisterServerReadyListener(this);
                }
            });
        }
        f9150a.add(ipcMessage);
    }
}
