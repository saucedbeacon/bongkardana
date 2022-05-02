package com.alibaba.ariver.remotedebug.worker;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.engine.common.worker.BaseWorkerImpl;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.core.RemoteDebugController;

public class b extends BaseWorkerImpl {

    /* renamed from: a  reason: collision with root package name */
    private final String f10164a;
    private final RemoteDebugController b;
    private final a c;

    public b(Context context, Node node, String str, String str2) {
        App app = (App) node.bubbleFindNode(App.class);
        app.getStartParams();
        this.b = new RemoteDebugController(context, this, app, str);
        this.mStartupParams = app.getStartParams();
        StringBuilder sb = new StringBuilder("AriverRemoteDebug:RemoteDebugWorker:");
        sb.append(app.getAppId());
        this.f10164a = sb.toString();
        this.c = new a(this, app.getEngineProxy().getEngineRouter());
        a(str2, this.mStartupParams);
    }

    public void a(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    public String getLogTag() {
        return this.f10164a;
    }

    public void tryToInjectStartupParamsAndPushWorker() {
        RVLogger.e(this.f10164a, "tryToInjectStartupParamsAndPushWorker");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            RemoteDebugController remoteDebugController = this.b;
            StringBuilder sb = new StringBuilder(RDConstant.JAVASCRIPT_SCHEME);
            sb.append(d());
            remoteDebugController.a(sb.toString());
        } catch (Throwable th) {
            RVLogger.e(this.f10164a, "tryToInjectStartupParamsAndPushWorker error: ", th);
        }
        String str = this.f10164a;
        StringBuilder sb2 = new StringBuilder("tryToInjectStartupParamsAndPushWorker cost = ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.e(str, sb2.toString());
        setWorkerReady();
    }

    public void postMessage(String str, SendToWorkerCallback sendToWorkerCallback) {
        sendMessageToWorker((String) null, (String) null, str, sendToWorkerCallback);
    }

    public void sendMessageToWorker(String str, String str2, String str3, SendToWorkerCallback sendToWorkerCallback) {
        RemoteDebugController remoteDebugController = this.b;
        StringBuilder sb = new StringBuilder(RDConstant.JAVASCRIPT_SCHEME);
        sb.append(b(str3));
        remoteDebugController.b(sb.toString());
        sendPushCallBack(str, str2, sendToWorkerCallback);
    }

    public void a(String str) {
        this.b.b(str);
    }

    public boolean a() {
        RVLogger.d(this.f10164a, "isRemoteDebugConnected.");
        return this.b.b();
    }

    public void b() {
        RVLogger.d(this.f10164a, "exitRemoteDebug");
        this.b.a();
    }

    private String d() {
        String jSONString = BundleUtils.toJSONObject(this.mStartupParams).toJSONString();
        StringBuilder sb = new StringBuilder("__appxStartupParams=");
        sb.append(jSONString);
        sb.append(";var __workerjs=\"self.__appxStartupParams=\" + JSON.stringify(__appxStartupParams) + \";importScripts('");
        sb.append(this.mWorkerId);
        sb.append("');\";worker.postMessage({action:'exec',data:__workerjs});");
        return sb.toString();
    }

    private String b(String str) {
        StringBuilder sb = new StringBuilder("window.worker.postMessage({\"action\":\"callBridge\",\"data\":");
        sb.append(str);
        sb.append("})");
        return sb.toString();
    }

    public a c() {
        return this.c;
    }
}
