package com.alipay.mobile.rome.syncservice.service;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.rome.longlinkservice.ConnectionListener;
import com.alipay.mobile.rome.longlinkservice.ISyncCallback;
import com.alipay.mobile.rome.longlinkservice.LongLinkAppConfig;
import com.alipay.mobile.rome.longlinkservice.LongLinkSyncService;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;
import com.alipay.mobile.rome.syncsdk.util.AppStatusUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.a.b;
import com.alipay.mobile.rome.syncservice.d.a;

public class LongLinkSyncServiceImpl extends LongLinkSyncService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9482a = false;

    public void initialize(Context context) {
        initialize(context, (LongLinkAppConfig) null);
    }

    public void initialize(Context context, LongLinkAppConfig longLinkAppConfig) {
        if (!this.f9482a) {
            if (context != null) {
                c.b("LongLinkSyncServiceImpl", "initialize");
                this.f9482a = true;
                a.f9473a = context.getApplicationContext();
                if (longLinkAppConfig != null) {
                    com.alipay.mobile.rome.syncsdk.a.a.a().a(longLinkAppConfig);
                }
                com.alipay.mobile.rome.syncservice.a.a.a().a((com.alipay.mobile.rome.syncsdk.a) new com.alipay.mobile.rome.syncservice.b.a(context));
                b.a();
                return;
            }
            throw new NullPointerException("context cannot be null");
        }
    }

    public void registerBiz(String str, ISyncCallback iSyncCallback) {
        if (TextUtils.isEmpty(str) || iSyncCallback == null) {
            c.d("LongLinkSyncServiceImpl", "registerBiz illegal method parameters.");
        } else {
            com.alipay.mobile.rome.syncservice.sync.register.c.a(str, iSyncCallback);
        }
    }

    public synchronized void unregisterBiz(String str) {
        StringBuilder sb = new StringBuilder("unregisterBiz:  [ biz=");
        sb.append(str);
        sb.append(" ]");
        c.b("LongLinkSyncServiceImpl", sb.toString());
        if (!com.alipay.mobile.rome.syncservice.sync.register.c.a(str)) {
            c.d("LongLinkSyncServiceImpl", "unregisterBiz:  [ biz not registered ]");
            return;
        }
        com.alipay.mobile.rome.syncservice.sync.register.c.c(str);
        com.alipay.mobile.rome.syncservice.sync.b.a();
    }

    public void reportMsgReceived(SyncMessage syncMessage) {
        if (syncMessage == null) {
            c.d("LongLinkSyncServiceImpl", "reportMsgReceived: [ syncMessag=null ]");
        } else {
            com.alipay.mobile.rome.syncservice.sync.c.a.a(syncMessage.userId, syncMessage.biz, syncMessage.f9404id);
        }
    }

    public synchronized boolean isConnected() {
        return com.alipay.mobile.rome.syncservice.a.a.a().c();
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        com.alipay.mobile.rome.syncsdk.b bVar = com.alipay.mobile.rome.syncservice.a.a.a().f9465a;
        com.alipay.mobile.rome.syncsdk.b.a(connectionListener);
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        com.alipay.mobile.rome.syncsdk.b bVar = com.alipay.mobile.rome.syncservice.a.a.a().f9465a;
        com.alipay.mobile.rome.syncsdk.b.b(connectionListener);
    }

    public void appToBackground() {
        if (this.f9482a) {
            c.b("LongLinkSyncServiceImpl", "appToBackground: ");
            AppStatusUtils.a(AppStatusUtils.AppStatus.BACKGROUND);
            com.alipay.mobile.rome.syncservice.a.a.a().b();
            com.alipay.mobile.rome.syncservice.a.a.a().e();
            return;
        }
        throw new NullPointerException("You must call method: initialize(Context context); firstly");
    }

    public void appToForeground() {
        if (!this.f9482a) {
            throw new NullPointerException("You must call method: initialize(Context context); firstly");
        } else if (AppStatusUtils.a() != AppStatusUtils.AppStatus.FOREGROUND || !com.alipay.mobile.rome.syncservice.a.a.a().c()) {
            c.b("LongLinkSyncServiceImpl", "appToForeground, then to startLink.");
            AppStatusUtils.a(AppStatusUtils.AppStatus.FOREGROUND);
            com.alipay.mobile.rome.syncservice.a.a.a().b();
            com.alipay.mobile.rome.syncservice.a.a.a().d();
        } else {
            c.b("LongLinkSyncServiceImpl", "App is foreground and sync connected.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateUserInfo(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x000d
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0015
        L_0x000d:
            java.lang.String r0 = "LongLinkSyncServiceImpl"
            java.lang.String r1 = "updateUserInfo[ uid or session is null, user logout.]"
            com.alipay.mobile.rome.syncsdk.util.c.c(r0, r1)     // Catch:{ all -> 0x0041 }
        L_0x0015:
            com.alipay.mobile.rome.syncservice.a.a r0 = com.alipay.mobile.rome.syncservice.a.a.a()     // Catch:{ all -> 0x0041 }
            r0.a(r3, r4)     // Catch:{ all -> 0x0041 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x002e
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            com.alipay.mobile.rome.syncservice.sync.c.a.a()     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return
        L_0x002e:
            com.alipay.mobile.rome.syncservice.sync.b r3 = com.alipay.mobile.rome.syncservice.sync.b.a()     // Catch:{ all -> 0x0041 }
            com.alipay.mobile.rome.syncservice.c.a.g r3 = r3.f9485a     // Catch:{ all -> 0x0041 }
            r4 = 3002(0xbba, float:4.207E-42)
            com.alipay.mobile.rome.syncservice.c.a.a r3 = r3.a(r4)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x003f
            r3.a()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r2)
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.service.LongLinkSyncServiceImpl.updateUserInfo(java.lang.String, java.lang.String):void");
    }
}
