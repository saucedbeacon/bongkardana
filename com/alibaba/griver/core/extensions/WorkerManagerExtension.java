package com.alibaba.griver.core.extensions;

import android.content.Context;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.core.GriverParam;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.concurrent.CountDownLatch;

public class WorkerManagerExtension implements AppDestroyPoint, AppStartPoint, EngineInitSuccessPoint, CreateWorkerPoint {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10304a = new Object();
    private boolean b = true;
    private Worker c;
    private CountDownLatch d = new CountDownLatch(1);
    private Throwable e = null;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppStart(App app) {
        a(app);
    }

    private void a(final Node node) {
        final App app = (App) node.bubbleFindNode(App.class);
        if (app == null) {
            RVLogger.w("Griver:WorkerManagerExtension", "prepareWorker but app == null!");
        } else if (AppTypeUtils.TYPE_TINY.equalsIgnoreCase(app.getAppType())) {
            RVLogger.d("Griver:WorkerManagerExtension", "preloadWorker begin schedule");
            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                public void run() {
                    RVLogger.d("Griver:WorkerManagerExtension", "preloadWorker begin inner");
                    WorkerManagerExtension.this.a(app.getAppContext().getContext(), node, (String) null, (String) null);
                }
            });
        }
    }

    public void onInitSuccess() {
        this.d.countDown();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r10, com.alibaba.ariver.kernel.api.node.Node r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable java.lang.String r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f10304a
            monitor-enter(r0)
            java.lang.Throwable r1 = r9.e     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x01a2 }
            return
        L_0x0009:
            java.lang.Class<com.alibaba.ariver.app.api.App> r1 = com.alibaba.ariver.app.api.App.class
            com.alibaba.ariver.kernel.api.node.Node r1 = r11.bubbleFindNode(r1)     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.app.api.App r1 = (com.alibaba.ariver.app.api.App) r1     // Catch:{ all -> 0x01a2 }
            if (r1 != 0) goto L_0x001c
            java.lang.String r10 = "Griver:WorkerManagerExtension"
            java.lang.String r11 = "prepareWorker but app == null!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r10, r11)     // Catch:{ all -> 0x01a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a2 }
            return
        L_0x001c:
            android.os.Bundle r2 = r1.getStartParams()     // Catch:{ all -> 0x01a2 }
            boolean r2 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.isRemoteDebugMode(r2)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r1.getAppId()     // Catch:{ all -> 0x01a2 }
            boolean r2 = com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils.supportRemoteDebugMode(r2)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r1 = "Griver:WorkerManagerExtension"
            java.lang.String r2 = "create RemoteDebugWorker"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.remotedebug.worker.b r1 = new com.alibaba.ariver.remotedebug.worker.b     // Catch:{ all -> 0x01a2 }
            r1.<init>(r10, r11, r12, r13)     // Catch:{ all -> 0x01a2 }
            r9.c = r1     // Catch:{ all -> 0x01a2 }
            r1.setWorkerId(r12)     // Catch:{ all -> 0x01a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a2 }
            return
        L_0x0043:
            java.lang.String r10 = ""
            r11 = 0
            boolean r2 = com.alibaba.griver.base.common.utils.UCUtils.UCExist()     // Catch:{ all -> 0x01a2 }
            r8 = 1
            if (r2 == 0) goto L_0x0057
            com.alibaba.griver.uc.GriverUCProviderImpl r10 = new com.alibaba.griver.uc.GriverUCProviderImpl     // Catch:{ all -> 0x01a2 }
            r10.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r10 = r10.getWebViewCoreSoPath()     // Catch:{ all -> 0x01a2 }
            goto L_0x005f
        L_0x0057:
            java.lang.String r11 = "Griver:WorkerManagerExtension"
            java.lang.String r2 = "prepareWorker forceWebWorker because of uc is not exist!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r11, (java.lang.String) r2)     // Catch:{ all -> 0x01a2 }
            r11 = 1
        L_0x005f:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x009d
            java.lang.String r10 = "Griver:WorkerManagerExtension"
            java.lang.String r2 = "cannot find ucPath, await setupLock!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r10, r2)     // Catch:{ all -> 0x01a2 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01a2 }
            java.util.concurrent.CountDownLatch r10 = r9.d     // Catch:{ InterruptedException -> 0x007c }
            r4 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x007c }
            r10.await(r4, r6)     // Catch:{ InterruptedException -> 0x007c }
            goto L_0x0084
        L_0x007c:
            r10 = move-exception
            java.lang.String r4 = "Griver:WorkerManagerExtension"
            java.lang.String r5 = "await exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r5, r10)     // Catch:{ all -> 0x01a2 }
        L_0x0084:
            java.lang.String r10 = "Griver:WorkerManagerExtension"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            java.lang.String r5 = "await setupLock for "
            r4.<init>(r5)     // Catch:{ all -> 0x01a2 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01a2 }
            long r5 = r5 - r2
            r4.append(r5)     // Catch:{ all -> 0x01a2 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r10, r2)     // Catch:{ all -> 0x01a2 }
            goto L_0x00ac
        L_0x009d:
            java.lang.String r2 = "Griver:WorkerManagerExtension"
            java.lang.String r3 = "get ucPath "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01a2 }
            java.lang.String r10 = r3.concat(r10)     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r10)     // Catch:{ all -> 0x01a2 }
        L_0x00ac:
            if (r13 != 0) goto L_0x00b2
            java.lang.String r13 = com.alibaba.griver.base.common.webview.GriverWebviewSetting.getUserAgent()     // Catch:{ all -> 0x01a2 }
        L_0x00b2:
            r10 = 0
            if (r12 != 0) goto L_0x00cb
            android.os.Bundle r2 = r1.getStartParams()     // Catch:{ all -> 0x01a2 }
            java.lang.String r3 = "onlineHost"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r2, r3, r10)     // Catch:{ all -> 0x01a2 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01a2 }
            if (r3 != 0) goto L_0x00cb
            java.lang.String r12 = "index.worker.js"
            java.lang.String r12 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r2, r12)     // Catch:{ all -> 0x01a2 }
        L_0x00cb:
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x0180
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x00d9
            goto L_0x0180
        L_0x00d9:
            java.lang.String r2 = "h5_workerConfig"
            java.lang.String r3 = ""
            java.lang.String r2 = com.alibaba.griver.base.common.config.GriverInnerConfig.getConfig(r2, r3)     // Catch:{ all -> 0x01a2 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01a2 }
            if (r3 != 0) goto L_0x00fd
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r2)     // Catch:{ all -> 0x01a2 }
            java.lang.String r3 = "h5_force_web_worker"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r2, r3)     // Catch:{ all -> 0x01a2 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01a2 }
            if (r3 != 0) goto L_0x00fd
            java.lang.String r11 = "yes"
            boolean r11 = r11.equalsIgnoreCase(r2)     // Catch:{ all -> 0x01a2 }
        L_0x00fd:
            if (r11 != 0) goto L_0x0143
            java.lang.String r11 = "com.alibaba.ariver.v8worker.V8Worker"
            boolean r11 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r11)     // Catch:{ all -> 0x01a2 }
            if (r11 == 0) goto L_0x0143
            com.alibaba.ariver.engine.api.Worker r11 = r9.c     // Catch:{ all -> 0x0138 }
            if (r11 != 0) goto L_0x014a
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r11 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r11 = r1.getData(r11)     // Catch:{ all -> 0x0138 }
            com.alibaba.ariver.resource.api.models.AppModel r11 = (com.alibaba.ariver.resource.api.models.AppModel) r11     // Catch:{ all -> 0x0138 }
            if (r11 == 0) goto L_0x0125
            com.alibaba.ariver.resource.api.models.AppInfoModel r2 = r11.getAppInfoModel()     // Catch:{ all -> 0x0138 }
            if (r2 == 0) goto L_0x0125
            com.alibaba.ariver.resource.api.models.AppInfoModel r11 = r11.getAppInfoModel()     // Catch:{ all -> 0x0138 }
            java.util.List r11 = r11.getPlugins()     // Catch:{ all -> 0x0138 }
            r5 = r11
            goto L_0x0126
        L_0x0125:
            r5 = r10
        L_0x0126:
            com.alibaba.ariver.v8worker.V8Worker r11 = new com.alibaba.ariver.v8worker.V8Worker     // Catch:{ all -> 0x0138 }
            r6 = 0
            r7 = 0
            r2 = r11
            r3 = r1
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0138 }
            r9.c = r11     // Catch:{ all -> 0x0138 }
            r11.setWorkerId(r12)     // Catch:{ all -> 0x0138 }
            r9.b = r8     // Catch:{ all -> 0x0138 }
            goto L_0x014a
        L_0x0138:
            r11 = move-exception
            java.lang.String r2 = "Griver:WorkerManagerExtension"
            java.lang.String r3 = "prepareWorker exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r2, r3, r11)     // Catch:{ all -> 0x01a2 }
            r9.e = r11     // Catch:{ all -> 0x01a2 }
            goto L_0x014a
        L_0x0143:
            java.lang.String r11 = "Griver:WorkerManagerExtension"
            java.lang.String r2 = "prepareWorker forceWebWorker by config!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r11, (java.lang.String) r2)     // Catch:{ all -> 0x01a2 }
        L_0x014a:
            com.alibaba.ariver.engine.api.Worker r11 = r9.c     // Catch:{ all -> 0x01a2 }
            if (r11 != 0) goto L_0x017e
            java.lang.String r11 = "Griver:WorkerManagerExtension"
            java.lang.String r2 = "degrade to web worker!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r11, r2)     // Catch:{ all -> 0x01a2 }
            com.alibaba.griver.core.worker.a r11 = new com.alibaba.griver.core.worker.a     // Catch:{ all -> 0x016f }
            java.util.concurrent.CountDownLatch r2 = r9.d     // Catch:{ all -> 0x016f }
            r11.<init>(r1, r13, r12, r2)     // Catch:{ all -> 0x016f }
            r9.c = r11     // Catch:{ all -> 0x016f }
            r11.setWorkerId(r12)     // Catch:{ all -> 0x016f }
            java.lang.String r11 = "Griver:WorkerManagerExtension"
            java.lang.String r12 = "degrade to web worker success, clear exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r11, r12)     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.engine.api.Worker r11 = r9.c     // Catch:{ all -> 0x01a2 }
            if (r11 == 0) goto L_0x017e
            r9.e = r10     // Catch:{ all -> 0x01a2 }
            goto L_0x017e
        L_0x016f:
            r11 = move-exception
            java.lang.String r12 = "Griver:WorkerManagerExtension"
            java.lang.String r13 = "degrade to web worker success, clear exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r12, r13)     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.engine.api.Worker r12 = r9.c     // Catch:{ all -> 0x01a2 }
            if (r12 == 0) goto L_0x017d
            r9.e = r10     // Catch:{ all -> 0x01a2 }
        L_0x017d:
            throw r11     // Catch:{ all -> 0x01a2 }
        L_0x017e:
            monitor-exit(r0)     // Catch:{ all -> 0x01a2 }
            return
        L_0x0180:
            java.lang.String r10 = "Griver:WorkerManagerExtension"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = "prepareWorker userAgent "
            r11.<init>(r1)     // Catch:{ all -> 0x01a2 }
            r11.append(r13)     // Catch:{ all -> 0x01a2 }
            java.lang.String r13 = ", workerId "
            r11.append(r13)     // Catch:{ all -> 0x01a2 }
            r11.append(r12)     // Catch:{ all -> 0x01a2 }
            java.lang.String r12 = " !"
            r11.append(r12)     // Catch:{ all -> 0x01a2 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01a2 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r10, r11)     // Catch:{ all -> 0x01a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a2 }
            return
        L_0x01a2:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.extensions.WorkerManagerExtension.a(android.content.Context, com.alibaba.ariver.kernel.api.node.Node, java.lang.String, java.lang.String):void");
    }

    public Worker createWorker(Context context, Node node, String str, String str2) {
        Page page;
        if (node instanceof Page) {
            page = (Page) node;
        } else {
            page = node instanceof App ? ((App) node).getActivePage() : null;
        }
        if (page != null) {
            page.getStartParams().putString(GriverParam.IS_V8_WORKER, this.b ? SummaryActivity.CHECKED : "false");
        }
        a(context, node, str, str2);
        this.c.setRenderReady();
        return this.c;
    }

    public void onAppDestroy(App app) {
        Worker worker = this.c;
        if (worker != null && !worker.isDestroyed()) {
            this.c.destroy();
        }
    }
}
