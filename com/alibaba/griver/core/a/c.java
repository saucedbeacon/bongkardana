package com.alibaba.griver.core.a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import java.util.Iterator;
import java.util.LinkedList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f9182a = 1;
    private static LinkedList<a> b = new LinkedList<>();
    private static SparseArray<Class> c = new SparseArray<>();
    private static SparseArray<Class> d = new SparseArray<>();
    private static SparseArray<Class> e = new SparseArray<>();
    private static a f = new a();

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static c f9184a = new c();
    }

    private c() {
        f();
    }

    public static final c a() {
        try {
            return a.f9184a;
        } catch (Throwable unused) {
            c unused2 = a.f9184a = new c();
            return a.f9184a;
        }
    }

    public static boolean b() {
        return "YES".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_MP_MULTI_PROCESS_SWITCH));
    }

    public a c() {
        return f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:12|13|14|15|16|17|18|19|20|(2:23|21)|30|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.alibaba.griver.core.a.a r0 = f     // Catch:{ all -> 0x00a5 }
            r0.f()     // Catch:{ all -> 0x00a5 }
            com.alibaba.griver.core.a.a r0 = f     // Catch:{ all -> 0x00a5 }
            r1 = 0
            r0.a((int) r1)     // Catch:{ all -> 0x00a5 }
            boolean r0 = b()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r4)
            return
        L_0x0014:
            boolean r0 = com.alibaba.ariver.kernel.common.utils.ProcessUtils.isMainProcess()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "LiteProcessManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "LiteProcessServerManager must be in main process. "
            r1.<init>(r2)     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)     // Catch:{ all -> 0x00a5 }
            r1.append(r2)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return
        L_0x0038:
            java.lang.String r0 = "mp_app_process_size"
            java.lang.String r0 = com.alibaba.griver.base.common.config.GriverConfig.getConfig(r0)     // Catch:{ all -> 0x00a5 }
            r1 = 1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x004b }
            r2 = 3
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ Exception -> 0x004b }
            f9182a = r0     // Catch:{ Exception -> 0x004b }
            goto L_0x004d
        L_0x004b:
            f9182a = r1     // Catch:{ all -> 0x00a5 }
        L_0x004d:
            java.lang.String r0 = "LiteProcessManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "support "
            r2.<init>(r3)     // Catch:{ all -> 0x00a5 }
            int r3 = f9182a     // Catch:{ all -> 0x00a5 }
            r2.append(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = " process to run mini program"
            r2.append(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ all -> 0x00a5 }
        L_0x0068:
            int r0 = f9182a     // Catch:{ all -> 0x00a5 }
            if (r1 > r0) goto L_0x009c
            com.alibaba.griver.core.a.a r0 = new com.alibaba.griver.core.a.a     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            r0.f()     // Catch:{ all -> 0x00a5 }
            r0.a((int) r1)     // Catch:{ all -> 0x00a5 }
            java.util.LinkedList<com.alibaba.griver.core.a.a> r2 = b     // Catch:{ all -> 0x00a5 }
            r2.add(r0)     // Catch:{ all -> 0x00a5 }
            android.util.SparseArray<java.lang.Class> r0 = c     // Catch:{ all -> 0x00a5 }
            java.lang.Class[] r2 = com.alibaba.griver.core.kernel.ipc.client.IpcMsgClientService.SERVICE_CLASSES     // Catch:{ all -> 0x00a5 }
            int r3 = r1 + -1
            r2 = r2[r3]     // Catch:{ all -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00a5 }
            android.util.SparseArray<java.lang.Class> r0 = d     // Catch:{ all -> 0x00a5 }
            java.lang.Class[] r2 = com.alibaba.griver.core.ui.activity.GriverBaseActivity.ACTIVITY_CLASSES     // Catch:{ all -> 0x00a5 }
            r2 = r2[r3]     // Catch:{ all -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00a5 }
            android.util.SparseArray<java.lang.Class> r0 = e     // Catch:{ all -> 0x00a5 }
            java.lang.Class[] r2 = com.alibaba.griver.core.ui.activity.GriverTransActivity.ACTIVITY_CLASSES     // Catch:{ all -> 0x00a5 }
            r2 = r2[r3]     // Catch:{ all -> 0x00a5 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00a5 }
            int r1 = r1 + 1
            goto L_0x0068
        L_0x009c:
            java.lang.String r0 = "LiteProcessManager"
            java.lang.String r1 = "LiteProcessServerManager init"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x00a9
        L_0x00a8:
            throw r0
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.a.c.f():void");
    }

    private Class<? extends Activity> a(int i, boolean z) {
        return (z ? e : d).get(i);
    }

    public Class<? extends Activity> a(final RVAppRecord rVAppRecord, Intent intent) {
        a b2 = b(rVAppRecord.getAppId());
        if (b2 != null && b2.c() == 1) {
            a(b2.a(), BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false));
        }
        Application applicationContext = GriverEnv.getApplicationContext();
        if (b2 != null && b2.c() == 2) {
            boolean z = BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false);
            intent.addFlags(268435456);
            intent.putExtra("isTransparent", z);
            intent.putExtras(rVAppRecord.getStartParams());
            intent.setClass(applicationContext, a(b2.a(), BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false)));
            applicationContext.startActivity(intent);
            a(b2.a(), BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false));
        }
        if (b2 == null) {
            b2 = e();
        }
        if (b2 == null) {
            RVLogger.d("LiteProcessManager", "all the process are busy.");
            return null;
        }
        b2.c(1);
        b2.a(rVAppRecord.getAppId());
        boolean z2 = BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false);
        intent.addFlags(268435456);
        intent.putExtra("isTransparent", z2);
        intent.putExtras(rVAppRecord.getStartParams());
        intent.setClass(applicationContext, a(b2.a(), BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false)));
        applicationContext.startActivity(intent);
        Intent intent2 = new Intent();
        intent2.setClass(applicationContext, c.get(b2.a()));
        applicationContext.startService(intent2);
        AnonymousClass1 r1 = new ServiceConnection() {
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                RVLogger.d("LiteProcessManager", "onServiceConnected ".concat(String.valueOf(componentName)));
                IpcChannelManager.getInstance().registerClientChannel(rVAppRecord.getStartToken(), IIpcChannel.Stub.asInterface(iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                RVLogger.d("LiteProcessManager", "onServiceDisconnected ".concat(String.valueOf(componentName)));
                IpcChannelManager.getInstance().unRegisterClientChannel(rVAppRecord.getStartToken());
            }
        };
        b2.a((ServiceConnection) r1);
        applicationContext.bindService(intent2, r1, 0);
        return a(b2.a(), BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false));
    }

    public synchronized void a(String str) {
        if (TextUtils.equals(f.e(), str)) {
            a(f);
        } else {
            a(b(str));
        }
    }

    public synchronized void d() {
        a(f);
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.c() == 0) {
                RVLogger.d("LiteProcessManager", "LiteProcessServerManager LiteProcess is already free");
            } else {
                a(next);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.alibaba.griver.core.a.a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0059
            int r0 = r6.c()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0059
        L_0x000a:
            java.lang.String r0 = "LiteProcessManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "closeApp pid == "
            r1.<init>(r2)     // Catch:{ all -> 0x0056 }
            int r2 = r6.b()     // Catch:{ all -> 0x0056 }
            r1.append(r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = ", appId == "
            r1.append(r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = r6.e()     // Catch:{ all -> 0x0056 }
            r1.append(r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = ", state == "
            r1.append(r2)     // Catch:{ all -> 0x0056 }
            int r2 = r6.c()     // Catch:{ all -> 0x0056 }
            r1.append(r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0056 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x0056 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0056 }
            r0.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "prepareAbortReason"
            java.lang.String r2 = "Finish from mStartToken!"
            r0.putString(r1, r2)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r6.e()     // Catch:{ all -> 0x0056 }
            long r2 = r6.d()     // Catch:{ all -> 0x0056 }
            r4 = 4
            com.alibaba.ariver.app.ipc.IpcServerUtils.sendMsgToClient(r1, r2, r4, r0)     // Catch:{ all -> 0x0056 }
            r6.f()     // Catch:{ all -> 0x0056 }
            monitor-exit(r5)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0059:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.a.c.a(com.alibaba.griver.core.a.a):void");
    }

    public synchronized a e() {
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next != null && next.c() == 0) {
                RVLogger.d("LiteProcessManager", "findProcessCanStart TERMINATED ".concat(String.valueOf(next)));
                return next;
            }
        }
        return null;
    }

    @Nullable
    public synchronized a a(int i) {
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.a() == i) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    public synchronized a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (str.equals(next.e())) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            if (r9 != 0) goto L_0x0010
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x002b }
            r9.<init>()     // Catch:{ all -> 0x002b }
        L_0x0010:
            r5 = r9
            com.alibaba.griver.core.a.c r9 = a()     // Catch:{ all -> 0x002b }
            com.alibaba.griver.core.a.a r7 = r9.b(r7)     // Catch:{ all -> 0x002b }
            if (r7 == 0) goto L_0x0029
            java.lang.String r0 = r7.e()     // Catch:{ all -> 0x002b }
            long r1 = r7.d()     // Catch:{ all -> 0x002b }
            java.lang.String r4 = "ipc_griver"
            r3 = r8
            com.alibaba.ariver.app.ipc.IpcServerUtils.sendMsgToClient(r0, r1, r3, r4, r5)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r6)
            return
        L_0x002b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.a.c.a(java.lang.String, int, android.os.Bundle):void");
    }
}
