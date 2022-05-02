package com.alibaba.griver.core.proxy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.ariver.engine.BaseEngineImpl;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.base.common.utils.UCUtils;
import com.alibaba.griver.base.nebula.GriverWebViewFlag;
import com.alibaba.griver.base.nebula.H5WebViewChoose;
import com.alibaba.griver.core.bridge.GriverNativeBridge;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.uc.UCSetup;
import java.util.concurrent.CountDownLatch;

public class GriverWebEngineImpl extends BaseEngineImpl {
    public static final String TAG = "GriverEngine:WebViewEngineProxy";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public CountDownLatch f10313a = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public CountDownLatch b = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public UCSetup c;
    private Worker d = null;

    public String getEngineType() {
        return AppTypeUtils.TYPE_TINY;
    }

    public GriverWebEngineImpl(String str, Node node) {
        super(str, node);
        RVLogger.d(TAG, "webview engineProxy constructed,appId=".concat(String.valueOf(str)));
    }

    public void setup(Bundle bundle, Bundle bundle2, final EngineSetupCallback engineSetupCallback) {
        final AnonymousClass1 r4 = new EngineSetupCallback() {
            public void setupResult(boolean z, String str) {
                GriverWebEngineImpl.this.f10313a.countDown();
                engineSetupCallback.setupResult(z, str);
            }
        };
        if (H5WebViewChoose.notNeedInitUc(bundle)) {
            RVLogger.d(TAG, "not need setup kernel,callback ");
            r4.setupResult(true, (String) null);
            return;
        }
        RVLogger.d(TAG, "async setup kernel ");
        if (UCUtils.UCExist()) {
            UCSetup uCSetup = new UCSetup(getApplication(), bundle, new UCSetup.Callback() {
                public void setupResult(boolean z) {
                    UCSetup unused = GriverWebEngineImpl.this.c = null;
                    r4.setupResult(z, (String) null);
                }
            });
            this.c = uCSetup;
            uCSetup.setup();
        }
    }

    public void init(InitParams initParams, final EngineInitCallback engineInitCallback) {
        super.init(initParams, engineInitCallback);
        if (this.f10313a.getCount() == 0) {
            this.b.countDown();
            engineInitCallback.initResult(true, (String) null);
            return;
        }
        ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
            public void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    GriverWebEngineImpl.this.f10313a.await();
                } catch (InterruptedException unused) {
                }
                GriverWebEngineImpl.this.b.countDown();
                StringBuilder sb = new StringBuilder("await setupLock for ");
                sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                RVLogger.d(GriverWebEngineImpl.TAG, sb.toString());
                engineInitCallback.initResult(true, (String) null);
            }
        });
    }

    public boolean isReady() {
        return GriverWebViewFlag.ucReady;
    }

    public Render createRender(Activity activity, Node node, CreateParams createParams) {
        RVLogger.d(TAG, "start create render");
        return new c(this, activity, node, createParams);
    }

    public Worker createWorker(Context context, Node node, String str, String str2) {
        RVLogger.d(TAG, "start create worker");
        Worker createWorker = ExtensionPoint.as(CreateWorkerPoint.class).node(node).create().createWorker(context, node, str, str2);
        this.d = createWorker;
        createWorker.setRenderReady();
        StringBuilder sb = new StringBuilder("end create worker == ");
        sb.append(this.d.getClass().getName());
        RVLogger.d(TAG, sb.toString());
        return this.d;
    }

    public NativeBridge createNativeBridge() {
        return new GriverNativeBridge();
    }

    public String getInstanceId() {
        Worker worker = this.d;
        if (worker == null) {
            return null;
        }
        return worker.getWorkerId();
    }
}
