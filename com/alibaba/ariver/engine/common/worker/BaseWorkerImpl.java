package com.alibaba.ariver.engine.common.worker;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseWorkerImpl implements Worker {
    public static final String APPX_WORKER_JS_URL = "https://appx/af-appx.worker.min.js";

    /* renamed from: a  reason: collision with root package name */
    private final Object f10063a = new Object();
    private Handler b;
    private int c = 0;
    protected boolean mAlipayJSBridgeReady = false;
    protected String mAppId;
    protected String mAppxVersionInWorker = null;
    protected boolean mDestroyed;
    protected boolean mPreStarted;
    protected volatile boolean mRenderReady = false;
    protected List<RenderReadyListener> mRenderReadyListeners;
    protected Bundle mStartupParams;
    protected String mWorkerId;
    protected volatile boolean mWorkerReady = false;
    protected List<Worker.WorkerReadyListener> mWorkerReadyListeners;

    public interface RenderReadyListener {
        void onRenderReady();
    }

    /* access modifiers changed from: protected */
    public abstract String getLogTag();

    public void loadPlugin(String str) {
    }

    public abstract void sendMessageToWorker(String str, String str2, String str3, SendToWorkerCallback sendToWorkerCallback);

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public void setWorkerId(String str) {
        this.mWorkerId = str;
    }

    public String getWorkerId() {
        return this.mWorkerId;
    }

    public void setAppxVersionInWorker(String str) {
        this.mAppxVersionInWorker = str;
    }

    public String getAppxVersionInWorker() {
        return this.mAppxVersionInWorker;
    }

    public Handler getWorkerHandler() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    StringBuilder sb = new StringBuilder("ariver-post-message-");
                    int i = this.c;
                    this.c = i + 1;
                    sb.append(i);
                    HandlerThread handlerThread = new HandlerThread(sb.toString(), 5);
                    handlerThread.start();
                    this.b = new Handler(handlerThread.getLooper());
                }
            }
        }
        return this.b;
    }

    public boolean isWorkerReady() {
        return this.mWorkerReady;
    }

    public boolean isRenderReady() {
        return this.mRenderReady;
    }

    public void setStartupParams(Bundle bundle) {
        this.mStartupParams = (Bundle) bundle.clone();
    }

    public Bundle getStartupParams() {
        return this.mStartupParams;
    }

    public boolean isPrestarted() {
        return this.mPreStarted;
    }

    public void onAlipayJSBridgeReady() {
        RVLogger.d(getLogTag(), "onAlipayJSBridgeReady");
        this.mAlipayJSBridgeReady = true;
        tryToInjectStartupParamsAndPushWorker();
    }

    public void setWorkerReady() {
        List<Worker.WorkerReadyListener> list;
        RVLogger.e(getLogTag(), "setWorkerReady");
        synchronized (this.f10063a) {
            this.mWorkerReady = true;
            list = this.mWorkerReadyListeners;
            this.mWorkerReadyListeners = null;
        }
        if (list != null) {
            for (Worker.WorkerReadyListener onWorkerReady : list) {
                onWorkerReady.onWorkerReady();
            }
            list.clear();
        }
    }

    public void setRenderReady() {
        List<RenderReadyListener> list;
        RVLogger.e(getLogTag(), "setRenderReady");
        synchronized (this.f10063a) {
            this.mRenderReady = true;
            list = this.mRenderReadyListeners;
            this.mRenderReadyListeners = null;
        }
        if (list != null) {
            for (RenderReadyListener onRenderReady : list) {
                onRenderReady.onRenderReady();
            }
            list.clear();
        }
    }

    public void registerWorkerReadyListener(Worker.WorkerReadyListener workerReadyListener) {
        boolean z;
        synchronized (this.f10063a) {
            if (this.mWorkerReady) {
                z = true;
            } else {
                if (this.mWorkerReadyListeners == null) {
                    this.mWorkerReadyListeners = new ArrayList();
                }
                if (workerReadyListener != null && !this.mWorkerReadyListeners.contains(workerReadyListener)) {
                    this.mWorkerReadyListeners.add(workerReadyListener);
                }
                z = false;
            }
        }
        if (z) {
            workerReadyListener.onWorkerReady();
        }
    }

    public void registerRenderReadyListener(RenderReadyListener renderReadyListener) {
        boolean z;
        synchronized (this.f10063a) {
            if (this.mRenderReady) {
                z = true;
            } else {
                if (this.mRenderReadyListeners == null) {
                    this.mRenderReadyListeners = new ArrayList();
                }
                if (renderReadyListener != null && !this.mRenderReadyListeners.contains(renderReadyListener)) {
                    this.mRenderReadyListeners.add(renderReadyListener);
                }
                z = false;
            }
        }
        if (z) {
            renderReadyListener.onRenderReady();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void destroy() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f10063a
            monitor-enter(r0)
            boolean r1 = r2.mDestroyed     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0009:
            r1 = 1
            r2.mDestroyed = r1     // Catch:{ all -> 0x0020 }
            java.util.List<com.alibaba.ariver.engine.api.Worker$WorkerReadyListener> r1 = r2.mWorkerReadyListeners     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0015
            java.util.List<com.alibaba.ariver.engine.api.Worker$WorkerReadyListener> r1 = r2.mWorkerReadyListeners     // Catch:{ all -> 0x0020 }
            r1.clear()     // Catch:{ all -> 0x0020 }
        L_0x0015:
            java.util.List<com.alibaba.ariver.engine.common.worker.BaseWorkerImpl$RenderReadyListener> r1 = r2.mRenderReadyListeners     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            java.util.List<com.alibaba.ariver.engine.common.worker.BaseWorkerImpl$RenderReadyListener> r1 = r2.mRenderReadyListeners     // Catch:{ all -> 0x0020 }
            r1.clear()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.common.worker.BaseWorkerImpl.destroy():void");
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.f10063a) {
            z = this.mDestroyed;
        }
        return z;
    }

    public void sendPushCallBack(String str, String str2, SendToWorkerCallback sendToWorkerCallback) {
        sendPushCallBack((JSONObject) null, str, str2, sendToWorkerCallback);
    }

    public void sendPushCallBack(@Nullable JSONObject jSONObject, String str, String str2, SendToWorkerCallback sendToWorkerCallback) {
        if (sendToWorkerCallback != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.mWorkerId;
            }
            jSONObject.put("appId", (Object) str);
            jSONObject.put("result", (Object) "0");
            if (TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("");
                sb.append(System.currentTimeMillis());
                str2 = sb.toString();
            }
            jSONObject.put("messageId", (Object) str2);
            String logTag = getLogTag();
            StringBuilder sb2 = new StringBuilder("sendPushCallBack...");
            sb2.append(jSONObject.toJSONString());
            RVLogger.d(logTag, sb2.toString());
            sendToWorkerCallback.onCallBack(jSONObject);
        }
    }

    public void sendMessageToWorker(String str, String str2, String str3) {
        sendMessageToWorker(str, str2, str3, (SendToWorkerCallback) null);
    }

    public void sendJsonToWorker(JSONObject jSONObject, SendToWorkerCallback sendToWorkerCallback) {
        sendMessageToWorker(getAppId(), "", jSONObject == null ? "" : jSONObject.toJSONString(), sendToWorkerCallback);
    }
}
