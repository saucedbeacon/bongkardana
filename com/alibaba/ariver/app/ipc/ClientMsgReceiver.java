package com.alibaba.ariver.app.ipc;

import android.os.Bundle;
import android.os.Message;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.PlaybackStateCompat;

public class ClientMsgReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static ClientMsgReceiver f8961a;
    private static final Map<String, IpcMessageHandler> b = new HashMap();
    private static final PlaybackStateCompat.ShuffleMode<IpcMessageHandler> c = new PlaybackStateCompat.ShuffleMode<>();
    private static final PlaybackStateCompat.ShuffleMode<List<IpcMessage>> d = new PlaybackStateCompat.ShuffleMode<>();

    private ClientMsgReceiver() {
    }

    public static ClientMsgReceiver getInstance() {
        ClientMsgReceiver clientMsgReceiver;
        ClientMsgReceiver clientMsgReceiver2 = f8961a;
        if (clientMsgReceiver2 != null) {
            return clientMsgReceiver2;
        }
        synchronized (ClientMsgReceiver.class) {
            if (f8961a == null) {
                f8961a = new ClientMsgReceiver();
            }
            clientMsgReceiver = f8961a;
        }
        return clientMsgReceiver;
    }

    public void registerAppHandler(App app) {
        long startToken = app.getStartToken();
        IpcMessageHandler msgHandler = app.getMsgHandler();
        RVLogger.d("AriverInt:IpcClient", "registerAppHandler ".concat(String.valueOf(startToken)));
        synchronized (ClientMsgReceiver.class) {
            c.setMax(startToken, msgHandler);
            List<IpcMessage> max = d.getMax(startToken, null);
            if (max != null) {
                for (IpcMessage handleMessage : max) {
                    msgHandler.handleMessage(handleMessage);
                }
            }
            d.getMin(startToken);
        }
    }

    public void unRegisterAppHandler(long j) {
        synchronized (ClientMsgReceiver.class) {
            RVLogger.d("AriverInt:IpcClient", "unRegisterAppHandler ".concat(String.valueOf(j)));
            d.getMin(j);
            c.getMin(j);
        }
    }

    public void registerBizHandler(String str, IpcMessageHandler ipcMessageHandler) {
        synchronized (ClientMsgReceiver.class) {
            b.put(str, ipcMessageHandler);
        }
    }

    public void unRegisterBizHandler(String str) {
        synchronized (ClientMsgReceiver.class) {
            b.remove(str);
        }
    }

    private void a(long j, IpcMessage ipcMessage) {
        synchronized (ClientMsgReceiver.class) {
            List max = d.getMax(j, null);
            if (max == null) {
                max = new ArrayList();
                d.setMax(j, max);
            }
            max.add(ipcMessage);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(com.alibaba.ariver.kernel.ipc.IpcMessage r8) {
        /*
            r7 = this;
            java.lang.Class<com.alibaba.ariver.app.ipc.ClientMsgReceiver> r0 = com.alibaba.ariver.app.ipc.ClientMsgReceiver.class
            android.os.Message r1 = r8.bizMsg
            if (r1 == 0) goto L_0x001b
            android.os.Message r1 = r8.bizMsg
            android.os.Bundle r1 = r1.getData()
            if (r1 == 0) goto L_0x001b
            android.os.Message r1 = r8.bizMsg
            android.os.Bundle r1 = r1.getData()
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r1.setClassLoader(r2)
        L_0x001b:
            java.lang.String r1 = r8.biz
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0024
            return
        L_0x0024:
            android.os.Message r1 = r8.bizMsg
            java.lang.String r2 = r8.biz
            java.lang.String r3 = "AriverMsg_App"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00a2
            android.os.Bundle r2 = r1.getData()
            r3 = -1
            java.lang.String r5 = "startToken"
            long r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getLong(r2, r5, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ClientMsgReceiver handle app message what: "
            r4.<init>(r5)
            int r5 = r1.what
            r4.append(r5)
            java.lang.String r5 = " token: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "AriverInt:IpcClient"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r4)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a1
            monitor-enter(r0)
            int r4 = r1.what     // Catch:{ all -> 0x009e }
            r5 = 6
            if (r4 != r5) goto L_0x006a
            r7.a((long) r2, (android.os.Message) r1)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return
        L_0x006a:
            o.PlaybackStateCompat$ShuffleMode<com.alibaba.ariver.kernel.ipc.IpcMessageHandler> r1 = c     // Catch:{ all -> 0x009e }
            r4 = 0
            java.lang.Object r1 = r1.getMax(r2, r4)     // Catch:{ all -> 0x009e }
            com.alibaba.ariver.kernel.ipc.IpcMessageHandler r1 = (com.alibaba.ariver.kernel.ipc.IpcMessageHandler) r1     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0079
            r1.handleMessage(r8)     // Catch:{ all -> 0x009e }
            goto L_0x009c
        L_0x0079:
            java.lang.String r1 = "AriverInt:IpcClient"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "ClientMsgReceiver handleMessage "
            r4.<init>(r5)     // Catch:{ all -> 0x009e }
            r4.append(r8)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = " with "
            r4.append(r5)     // Catch:{ all -> 0x009e }
            r4.append(r2)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = " add pending!"
            r4.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009e }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r4)     // Catch:{ all -> 0x009e }
            r7.a((long) r2, (com.alibaba.ariver.kernel.ipc.IpcMessage) r8)     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return
        L_0x009e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x00a1:
            return
        L_0x00a2:
            java.util.Map<java.lang.String, com.alibaba.ariver.kernel.ipc.IpcMessageHandler> r0 = b
            java.lang.String r1 = r8.biz
            java.lang.Object r0 = r0.get(r1)
            com.alibaba.ariver.kernel.ipc.IpcMessageHandler r0 = (com.alibaba.ariver.kernel.ipc.IpcMessageHandler) r0
            if (r0 == 0) goto L_0x00b2
            r0.handleMessage(r8)
            return
        L_0x00b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClientMsgReceiver biz "
            r0.<init>(r1)
            java.lang.String r8 = r8.biz
            r0.append(r8)
            java.lang.String r8 = " not registered"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "AriverInt:IpcClient"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.ipc.ClientMsgReceiver.handleMessage(com.alibaba.ariver.kernel.ipc.IpcMessage):void");
    }

    private void a(long j, Message message) {
        RVLogger.d("AriverInt:IpcClient", "quickStartApp! ".concat(String.valueOf(j)));
        final String string = BundleUtils.getString(message.getData(), "appId");
        final Bundle bundle = (Bundle) BundleUtils.getParcelable(message.getData(), "startParams");
        final Bundle bundle2 = (Bundle) BundleUtils.getParcelable(message.getData(), RVConstants.EXTRA_SCENE_PARAMS);
        final long j2 = j;
        ExecutorUtils.runNotOnMain(ExecutorType.URGENT_DISPLAY, new Runnable() {
            public void run() {
                ClientMsgReceiver.this.manualStartApp(j2, string, bundle, bundle2);
                RVLogger.d("AriverInt:IpcClient", "end quickStartApp!");
            }
        });
    }

    public void manualPreCreateApp(long j, String str, Bundle bundle, Bundle bundle2) {
        AppManager appManager = (AppManager) RVProxy.get(AppManager.class);
        synchronized (AppManager.class) {
            if (j > 0) {
                RVLogger.d("AriverInt:IpcClient", "manualPreCreateApp, startToken: ".concat(String.valueOf(j)));
                if (appManager.findAppByToken(j) == null) {
                    appManager.preCreateApp(str, bundle, bundle2);
                }
            }
        }
    }

    public void manualStartApp(long j, String str, Bundle bundle, Bundle bundle2) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_App_manualStartApp);
        AppManager appManager = (AppManager) RVProxy.get(AppManager.class);
        synchronized (AppManager.class) {
            if (j > 0) {
                RVLogger.d("AriverInt:IpcClient", "manualStartApp, startToken: ".concat(String.valueOf(j)));
                App findAppByToken = appManager.findAppByToken(j);
                if (findAppByToken == null || !((AppNode) findAppByToken).isInited()) {
                    findAppByToken = appManager.startApp(str, bundle, bundle2);
                }
                if (findAppByToken != null) {
                    findAppByToken.start();
                }
            }
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_App_manualStartApp);
    }
}
