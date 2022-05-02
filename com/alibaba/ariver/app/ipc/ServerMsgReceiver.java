package com.alibaba.ariver.app.ipc;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ServerMsgReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static ServerMsgReceiver f8963a;
    private final Bundle b = new Bundle();
    private final Map<String, List<IpcMessageHandler>> c = new HashMap();

    public static ServerMsgReceiver getInstance() {
        if (f8963a == null) {
            synchronized (ServerMsgReceiver.class) {
                f8963a = new ServerMsgReceiver();
            }
        }
        return f8963a;
    }

    private ServerMsgReceiver() {
        IpcChannelManager.getInstance().registerClientListener(new IpcChannelManager.ClientListener() {
            public void onRegister(long j, IIpcChannel iIpcChannel) {
                RVLogger.d(IpcServerUtils.LOG_TAG, "ServerMsgReceiver onRegister startToken ".concat(String.valueOf(j)));
                IpcServerUtils.flushMessages(j);
            }

            public void onUnRegister(long j) {
                IpcServerUtils.removeToken(j);
            }
        });
    }

    public final void registerBizHandler(String str, IpcMessageHandler ipcMessageHandler) {
        RVLogger.d(IpcServerUtils.LOG_TAG, "ServerMsgReceiver registerBiz: ".concat(String.valueOf(str)));
        synchronized (this.c) {
            List list = this.c.get(str);
            if (list == null) {
                list = new ArrayList();
                this.c.put(str, list);
            }
            list.add(ipcMessageHandler);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unRegisterBizHandler(java.lang.String r5, com.alibaba.ariver.kernel.ipc.IpcMessageHandler r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            int r0 = r5.length()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            int r1 = o.dispatchOnCancelled.setMax(r0)
            if (r0 == r1) goto L_0x001d
            o.onCanceled r2 = new o.onCanceled
            r3 = 1
            r2.<init>(r0, r1, r3)
            r0 = 1807512964(0x6bbc7584, float:4.55666E26)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x001d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ServerMsgReceiver unRegisterBizHandler: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " and "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AriverInt:IpcServer"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)
            if (r6 != 0) goto L_0x003b
            return
        L_0x003b:
            java.util.Map<java.lang.String, java.util.List<com.alibaba.ariver.kernel.ipc.IpcMessageHandler>> r0 = r4.c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<com.alibaba.ariver.kernel.ipc.IpcMessageHandler>> r1 = r4.c     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x005a }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x004a:
            r1.remove(r6)     // Catch:{ all -> 0x005a }
            int r6 = r1.size()     // Catch:{ all -> 0x005a }
            if (r6 != 0) goto L_0x0058
            java.util.Map<java.lang.String, java.util.List<com.alibaba.ariver.kernel.ipc.IpcMessageHandler>> r6 = r4.c     // Catch:{ all -> 0x005a }
            r6.remove(r5)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.ipc.ServerMsgReceiver.unRegisterBizHandler(java.lang.String, com.alibaba.ariver.kernel.ipc.IpcMessageHandler):void");
    }

    public final void handleMessage(IpcMessage ipcMessage) {
        Bundle data = ipcMessage.bizMsg.getData();
        if (data == null) {
            data = this.b;
        }
        data.setClassLoader(ServerMsgReceiver.class.getClassLoader());
        String str = ipcMessage.biz;
        if (TextUtils.isEmpty(str)) {
            RVLogger.e(IpcServerUtils.LOG_TAG, "ServerMsgReceiver biz empty!");
            return;
        }
        synchronized (this.c) {
            List<IpcMessageHandler> list = this.c.get(str);
            if (list != null) {
                for (IpcMessageHandler handleMessage : list) {
                    handleMessage.handleMessage(ipcMessage);
                }
            } else {
                StringBuilder sb = new StringBuilder("ServerMsgReceiver biz ");
                sb.append(str);
                sb.append(" has not register handler");
                RVLogger.w(IpcServerUtils.LOG_TAG, sb.toString());
            }
        }
    }
}
