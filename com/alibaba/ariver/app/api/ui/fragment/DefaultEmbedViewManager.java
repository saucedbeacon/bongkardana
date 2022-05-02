package com.alibaba.ariver.app.api.ui.fragment;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.EmbedViewProvider;
import com.alibaba.ariver.engine.api.embedview.IEmbedPerformance;
import com.alibaba.ariver.engine.api.embedview.IEmbedPerformanceReporter;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultEmbedViewManager implements IEmbedViewManager {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, IEmbedView> f8957a = new ConcurrentHashMap();
    private final List<IEmbedView> b = new ArrayList();
    private final List<String> c = new ArrayList();
    private Page d;
    final Map<String, Queue<Message>> mMessageQueueMap = new ConcurrentHashMap();
    final Map<String, Queue<Render>> mRenderQueueMap = new ConcurrentHashMap();

    static class Render {
        BridgeCallback callback;
        JSONObject data;

        private Render(JSONObject jSONObject, BridgeCallback bridgeCallback) {
            this.data = jSONObject;
            this.callback = bridgeCallback;
        }
    }

    static class Message {
        String actionType;
        BridgeCallback bridgeCallback;
        JSONObject data;

        private Message(String str, JSONObject jSONObject, BridgeCallback bridgeCallback2) {
            this.actionType = str;
            this.data = jSONObject;
            this.bridgeCallback = bridgeCallback2;
        }
    }

    public DefaultEmbedViewManager(Page page) {
        this.d = page;
    }

    public List<IEmbedView> findAllEmbedView() {
        return this.b;
    }

    public IEmbedView findViewById(String str) {
        return this.f8957a.get(str);
    }

    public void destroyView(String str) {
        IEmbedView remove = this.f8957a.remove(str);
        if (remove != null) {
            remove.onDestroy();
        }
    }

    public synchronized IEmbedView createView(String str, String str2) {
        IEmbedView iEmbedView;
        StringBuilder sb = new StringBuilder("createView for viewId: ");
        sb.append(str);
        sb.append(" type: ");
        sb.append(str2);
        RVLogger.d("AriverApp:DefaultEmbedViewManager", sb.toString());
        iEmbedView = this.f8957a.get(str);
        if (iEmbedView == null) {
            iEmbedView = ((EmbedViewProvider) RVProxy.get(EmbedViewProvider.class)).createEmbedView(str2);
            if (iEmbedView instanceof IEmbedPerformance) {
                a(str2, (IEmbedPerformance) iEmbedView);
            }
            if (TextUtils.equals(str2, "newembedbase")) {
                clearBaseView();
                this.c.add(str);
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.d.getApp().getNodeId());
            hashMap.put(RVConstants.EXTRA_APP_INSTANCE_ID, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.d.getNodeId());
            hashMap.put(RVConstants.EXTRA_PAGE_INSTANCE_ID, sb3.toString());
            hashMap.put(RVConstants.EXTRA_EMBED_VIEW_ID, str);
            iEmbedView.onCreate(hashMap);
            synchronized (this.f8957a) {
                this.f8957a.put(str, iEmbedView);
                this.b.add(iEmbedView);
                Queue<Render> remove = this.mRenderQueueMap.remove(str);
                if (remove != null) {
                    for (Render render : remove) {
                        a(iEmbedView, render.data, render.callback);
                    }
                    remove.clear();
                }
                Queue<Message> remove2 = this.mMessageQueueMap.remove(str);
                if (remove2 != null) {
                    for (Message message : remove2) {
                        a(iEmbedView, message.actionType, message.data, message.bridgeCallback);
                    }
                    remove2.clear();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("elementid", (Object) str);
            EngineUtils.sendToRender(this.d.getRender(), RVEvents.NBCOMPONENT_CANRENDER, jSONObject, (SendToRenderCallback) null);
        }
        return iEmbedView;
    }

    public void dispatchRender(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        synchronized (this.f8957a) {
            IEmbedView findViewById = findViewById(str);
            if (findViewById == null) {
                Queue queue = this.mRenderQueueMap.get(str);
                if (queue == null) {
                    queue = new ArrayBlockingQueue(20);
                    this.mRenderQueueMap.put(str, queue);
                }
                queue.add(new Render(jSONObject, bridgeCallback));
                StringBuilder sb = new StringBuilder("findViewById ");
                sb.append(str);
                sb.append(" null, just add to render queueMap!");
                RVLogger.d("AriverApp:DefaultEmbedViewManager", sb.toString());
                return;
            }
            a(findViewById, jSONObject, bridgeCallback);
        }
    }

    private void a(final IEmbedView iEmbedView, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                try {
                    iEmbedView.onReceivedRender(jSONObject, bridgeCallback);
                } catch (Throwable th) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedRender exception: ".concat(String.valueOf(th))));
                }
            }
        });
    }

    public void dispatchSendMessage(String str, String str2, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        synchronized (this.f8957a) {
            IEmbedView findViewById = findViewById(str);
            if (findViewById == null) {
                Queue queue = this.mMessageQueueMap.get(str);
                if (queue == null) {
                    queue = new ArrayBlockingQueue(20);
                    this.mMessageQueueMap.put(str, queue);
                }
                queue.add(new Message(str2, jSONObject, bridgeCallback));
                StringBuilder sb = new StringBuilder("findViewById ");
                sb.append(str);
                sb.append(" null, just add to message queueMap!");
                RVLogger.d("AriverApp:DefaultEmbedViewManager", sb.toString());
                return;
            }
            a(findViewById, str2, jSONObject, bridgeCallback);
        }
    }

    private void a(IEmbedView iEmbedView, String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        final IEmbedView iEmbedView2 = iEmbedView;
        final String str2 = str;
        final JSONObject jSONObject2 = jSONObject;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                try {
                    iEmbedView2.onReceivedMessage(str2, jSONObject2, bridgeCallback2);
                } catch (Throwable th) {
                    bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedMessage exception: ".concat(String.valueOf(th))));
                }
            }
        });
    }

    private void a(final String str, IEmbedPerformance iEmbedPerformance) {
        final WeakReference weakReference = new WeakReference(this.d);
        final int hashCode = iEmbedPerformance.hashCode();
        iEmbedPerformance.setPerformanceReporter(new IEmbedPerformanceReporter() {
            public void onRenderFinished(long j) {
                try {
                    StringBuilder sb = new StringBuilder("on render finished type=");
                    sb.append(str);
                    sb.append(", obj=");
                    sb.append(hashCode);
                    sb.append(",elapsedRealtime");
                    sb.append(j);
                    RVLogger.d("AriverApp:DefaultEmbedViewManager", sb.toString());
                    Page page = (Page) weakReference.get();
                    if (page != null && !page.isExited() && !page.isDestroyed()) {
                        StringBuilder sb2 = new StringBuilder("embed_view_");
                        sb2.append(str);
                        sb2.append("_");
                        sb2.append(hashCode);
                        ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, sb2.toString(), j);
                    }
                } catch (Throwable th) {
                    RVLogger.e("AriverApp:DefaultEmbedViewManager", " embed view render finished callback error!", th);
                }
            }
        });
    }

    public void clearBaseView() {
        if (!this.f8957a.isEmpty() && !this.c.isEmpty()) {
            for (String next : this.c) {
                if (!TextUtils.isEmpty(next)) {
                    this.f8957a.remove(next);
                    this.b.remove(this.f8957a.get(next));
                }
            }
            this.c.clear();
        }
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        for (IEmbedView onRequestPermissionResult : this.f8957a.values()) {
            onRequestPermissionResult.onRequestPermissionResult(i, strArr, iArr);
        }
    }

    public void releaseViews() {
        for (IEmbedView next : this.f8957a.values()) {
            try {
                next.onDestroy();
            } catch (Throwable th) {
                if (!RVKernelUtils.isDebug()) {
                    StringBuilder sb = new StringBuilder("release view ");
                    sb.append(next.getType());
                    sb.append(" error!");
                    RVLogger.e("AriverApp:DefaultEmbedViewManager", sb.toString(), th);
                } else {
                    throw th;
                }
            }
        }
        this.b.clear();
        this.f8957a.clear();
        this.mRenderQueueMap.clear();
        this.mMessageQueueMap.clear();
    }

    public void triggerPreSnapshot() {
        try {
            if (this.f8957a != null && !this.f8957a.isEmpty()) {
                for (IEmbedView triggerPreSnapshot : this.f8957a.values()) {
                    triggerPreSnapshot.triggerPreSnapshot();
                }
            }
        } catch (Throwable th) {
            RVLogger.e("AriverApp:DefaultEmbedViewManager", "triggerPreSnapshot catch throwable ", th);
        }
    }
}
