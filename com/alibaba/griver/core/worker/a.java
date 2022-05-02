package com.alibaba.griver.core.worker;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.engine.common.worker.BaseWorkerImpl;
import com.alibaba.ariver.kernel.api.track.EventTrackStore;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5CallBack;
import com.alibaba.griver.core.worker.H5Worker;
import java.util.concurrent.CountDownLatch;

public class a extends BaseWorkerImpl {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f10395a = SystemClock.elapsedRealtime();
    /* access modifiers changed from: private */
    public c b;
    private Handler c;

    public String getLogTag() {
        return "GriverWebWorker";
    }

    public a(App app, String str, String str2, CountDownLatch countDownLatch) {
        this.b = new C0070a(app);
        this.c = new Handler(Looper.getMainLooper());
        this.b.a(app.getAppId());
        this.b.b(str2);
        this.b.d(str);
        this.b.a((H5Worker.WorkerReadyListener) new H5Worker.WorkerReadyListener() {
            public void onWorkerReady() {
                a.this.setWorkerReady();
                StringBuilder sb = new StringBuilder("WebWorker create->workerReady cost: ");
                sb.append(SystemClock.elapsedRealtime() - a.this.f10395a);
                RVLogger.d("GriverWebWorker", sb.toString());
            }
        });
        StringBuilder sb = new StringBuilder("WebWorker create->renderReady cost: ");
        sb.append(SystemClock.elapsedRealtime() - this.f10395a);
        RVLogger.d("GriverWebWorker", sb.toString());
    }

    public void tryToInjectStartupParamsAndPushWorker() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void setRenderReady() {
        super.setRenderReady();
        this.b.j();
    }

    public void destroy() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.k();
            this.b = null;
        }
        super.destroy();
    }

    public void postMessage(String str, SendToWorkerCallback sendToWorkerCallback) {
        StringBuilder sb = new StringBuilder("");
        sb.append(System.currentTimeMillis());
        sendMessageToWorker(getAppId(), sb.toString(), str, sendToWorkerCallback);
    }

    public void sendJsonToWorker(JSONObject jSONObject, final SendToWorkerCallback sendToWorkerCallback) {
        if (this.b == null) {
            RVLogger.w("GriverWebWorker", "sendMessageToWorker but worker destroyed!");
            return;
        }
        RVLogger.d("GriverWebWorker", "sendJsonToWorker");
        StringBuilder sb = new StringBuilder("");
        sb.append(System.currentTimeMillis());
        final String obj = sb.toString();
        this.b.a(getAppId(), obj, jSONObject, (H5CallBack) new H5CallBack() {
            public void onCallBack(JSONObject jSONObject) {
                RVLogger.d("GriverWebWorker", "sendJsonToWorker onCallback: ".concat(String.valueOf(jSONObject)));
                a aVar = a.this;
                aVar.sendPushCallBack(jSONObject, aVar.getAppId(), obj, sendToWorkerCallback);
            }
        });
    }

    public Handler getWorkerHandler() {
        return this.c;
    }

    public void sendMessageToWorker(String str, final String str2, String str3, final SendToWorkerCallback sendToWorkerCallback) {
        StringBuilder sb = new StringBuilder("sendMessageToWorker ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        RVLogger.d("GriverWebWorker", sb.toString());
        c cVar = this.b;
        if (cVar == null) {
            RVLogger.w("GriverWebWorker", "sendMessageToWorker but worker destroyed!");
        } else {
            cVar.a(str, str2, str3, (H5CallBack) new H5CallBack() {
                public void onCallBack(JSONObject jSONObject) {
                    RVLogger.d("GriverWebWorker", "sendMessageToWorker onCallback: ".concat(String.valueOf(jSONObject)));
                    a aVar = a.this;
                    aVar.sendPushCallBack(jSONObject, aVar.getAppId(), str2, sendToWorkerCallback);
                }
            });
        }
    }

    /* renamed from: com.alibaba.griver.core.worker.a$a  reason: collision with other inner class name */
    class C0070a extends c {
        private final App n;

        C0070a(App app) {
            this.n = app;
        }

        public b a() {
            return new d(this, this.n);
        }

        public void b() {
            if (a.this.b != null && !a.this.b.f()) {
                a.this.b.a(this.n.getStartParams());
            }
            String d = a.this.b == null ? "" : a.this.b.d();
            RVLogger.e("GriverWebWorker", "detect appx worker version is: ".concat(String.valueOf(d)));
            EventTrackStore eventTrackStore = (EventTrackStore) this.n.getData(EventTrackStore.class, true);
            if (d != null) {
                eventTrackStore.fullLinkAttrMap.put("appxWorkerVersion", d);
            } else {
                eventTrackStore.fullLinkAttrMap.put("appxWorkerVersion", "");
            }
            super.b();
        }
    }
}
