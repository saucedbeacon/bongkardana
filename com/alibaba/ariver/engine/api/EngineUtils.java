package com.alibaba.ariver.engine.api;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.model.WorkerStore;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLogConfigProxy;
import com.alibaba.ariver.kernel.common.log.AppLogUtils;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.log.EventLog;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.rome.longlinkservice.LongLinkMsgConstants;
import com.iap.ac.android.container.constant.ContainerKeys;
import java.util.HashSet;
import java.util.Set;

public class EngineUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f8968a = new HashSet();
    private static final Set<String> b = new HashSet();

    public static String getUserAgentSuffix() {
        return "Ariver/2.22.0.2";
    }

    static {
        f8968a.add("postMessage");
        f8968a.add("message");
        b.add(RVEvents.FIRE_PULL_TO_REFRESH);
        b.add(RVEvents.PULL_INTERCEPT);
        b.add("onShare");
        b.add("promotionClose");
    }

    public static void postOnWorker(Worker worker, Runnable runnable) {
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if ((rVConfigService != null ? "yes".equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("ariver_disable_postOnWorker", "yes")) : true) || Looper.myLooper() == worker.getWorkerHandler().getLooper()) {
            runnable.run();
        } else {
            worker.getWorkerHandler().post(runnable);
        }
    }

    @Nullable
    public static Worker getWorker(RVEngine rVEngine) {
        if (rVEngine.isDestroyed() || rVEngine.getEngineRouter() == null) {
            return null;
        }
        return rVEngine.getEngineRouter().getWorkerById((String) null);
    }

    public static void sendToRender(Render render, String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback) {
        sendToRender(render, (Worker) null, str, jSONObject, sendToRenderCallback);
    }

    public static void sendToRender(Render render, Worker worker, String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback) {
        sendToRender(render, worker, str, jSONObject, sendToRenderCallback, true);
    }

    public static void sendToRender(Render render, Worker worker, String str, @Nullable JSONObject jSONObject, @Nullable final SendToRenderCallback sendToRenderCallback, boolean z) {
        if (render == null) {
            RVLogger.w("AriverEngine:EngineUtils", "sendToRender but render == null!!");
            return;
        }
        if (worker == null) {
            worker = render.getEngine().getEngineRouter().getWorkerById(getWorkerId(render));
        }
        final boolean z2 = false;
        if (worker != null && !f8968a.contains(str)) {
            z2 = !b.contains(str);
            sendPushWorkMessage(render, worker, str, jSONObject, new SendToWorkerCallback() {
                public final void onCallBack(JSONObject jSONObject) {
                    SendToRenderCallback sendToRenderCallback = sendToRenderCallback;
                    if (sendToRenderCallback != null && z2) {
                        sendToRenderCallback.onCallBack(jSONObject);
                    }
                }
            });
        }
        if (render.getRenderBridge() == null) {
            RVLogger.w("AriverEngine:EngineUtils", "sendToRender but render.getRenderBridge == null!!");
            return;
        }
        RenderCallContext.Builder param = RenderCallContext.newBuilder(render).type("call").action(str).param(jSONObject);
        RenderBridge renderBridge = render.getRenderBridge();
        RenderCallContext build = param.build();
        if (z2) {
            sendToRenderCallback = null;
        }
        renderBridge.sendToRender(build, sendToRenderCallback, z);
        a(render, str, jSONObject);
    }

    public static void sendPushWorkMessage(Render render, String str, JSONObject jSONObject, SendToWorkerCallback sendToWorkerCallback) {
        sendPushWorkMessage(render, (Worker) null, str, jSONObject, sendToWorkerCallback);
    }

    public static void sendPushWorkMessage(Render render, Worker worker, String str, JSONObject jSONObject, SendToWorkerCallback sendToWorkerCallback) {
        Worker worker2;
        if (render == null || render.getPage() == null) {
            RVLogger.e("AriverEngine:EngineUtils", "sendPushWorkMessage but render or render.getPage() == null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        final String obj = sb.toString();
        if (worker == null) {
            worker2 = render.getEngine().getEngineRouter().getWorkerById(getWorkerId(render));
        } else {
            worker2 = worker;
        }
        if (worker2 == null) {
            StringBuilder sb2 = new StringBuilder("sendPushWorkerMessage action: ");
            sb2.append(str);
            sb2.append(", param: ");
            sb2.append(jSONObject);
            sb2.append(", but worker == null!");
            RVLogger.w("AriverEngine:EngineUtils", sb2.toString());
            a((String) null, obj, sendToWorkerCallback);
            return;
        }
        final String currentUri = render.getCurrentUri();
        final String renderId = render.getRenderId();
        final Worker worker3 = worker2;
        final SendToWorkerCallback sendToWorkerCallback2 = sendToWorkerCallback;
        final String str2 = str;
        final JSONObject jSONObject2 = jSONObject;
        final Render render2 = render;
        postOnWorker(worker2, new Runnable() {
            public final void run() {
                JSONObject jSONObject = null;
                if (worker3.isDestroyed()) {
                    RVLogger.w("AriverEngine:EngineUtils", "sendPushWorkerMessage but worker destroyed!");
                    EngineUtils.a((String) null, obj, sendToWorkerCallback2);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("func", (Object) str2);
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 != null) {
                    try {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } catch (Throwable th) {
                        RVLogger.e("AriverEngine:EngineUtils", "data is not a jsonobj ", th);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        if (str2.startsWith("syncMessage")) {
                            jSONObject.put("syncMessage", (Object) jSONObject2.getString("data"));
                        }
                        jSONObject2.put("data", (Object) jSONObject);
                    }
                    jSONObject.put("NBPageUrl", (Object) currentUri);
                    jSONObject2.put("param", (Object) jSONObject2);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("NBPageUrl", (Object) currentUri);
                    jSONObject4.put("data", (Object) jSONObject5);
                    jSONObject2.put("param", (Object) jSONObject4);
                }
                jSONObject2.put("viewId", (Object) renderId);
                jSONObject2.put(ContainerKeys.PARAM_PAGE_ID, (Object) Integer.valueOf(render2.getPageId()));
                final JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("handlerName", (Object) LongLinkMsgConstants.MSG_PACKET_CHANNEL_PUSH);
                jSONObject6.put("data", (Object) jSONObject2);
                StringBuilder sb = new StringBuilder(" workerReady: ");
                sb.append(worker3.isWorkerReady());
                RVLogger.d("AriverEngine:EngineUtils", sb.toString());
                if (worker3.isWorkerReady()) {
                    worker3.sendJsonToWorker(jSONObject6, sendToWorkerCallback2);
                } else {
                    worker3.registerWorkerReadyListener(new Worker.WorkerReadyListener() {
                        public void onWorkerReady() {
                            worker3.sendJsonToWorker(jSONObject6, sendToWorkerCallback2);
                        }
                    });
                }
            }
        });
    }

    public static String getWorkerId(Render render) {
        WorkerStore workerStore = (WorkerStore) render.getPage().getData(WorkerStore.class);
        return workerStore != null ? workerStore.workerId : "";
    }

    /* access modifiers changed from: private */
    public static void a(String str, String str2, SendToWorkerCallback sendToWorkerCallback) {
        if (sendToWorkerCallback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (Object) str);
            jSONObject.put("result", (Object) "2");
            jSONObject.put("messageId", (Object) str2);
            sendToWorkerCallback.onCallBack(jSONObject);
        }
    }

    private static void a(Render render, String str, JSONObject jSONObject) {
        String str2;
        RVLogger.d("AriverEngine:EngineUtils", "logEvent");
        try {
            str2 = JSONUtils.toString(jSONObject);
        } catch (Exception e) {
            RVLogger.e("AriverEngine:EngineUtils", "logEvent JSON to string error.", e);
            str2 = "";
        }
        DataNode page = render.getPage();
        if (page != null) {
            Set<String> ignoreEventList = ((AppLogConfigProxy) RVProxy.get(AppLogConfigProxy.class)).getIgnoreEventList();
            if (ignoreEventList == null || !ignoreEventList.contains(str)) {
                AppLogger.log(((EventLog.Builder) ((EventLog.Builder) new EventLog.Builder().setParentId(AppLogUtils.getParentId(page))).setGroupId("-")).setData(str2).setEventName(str).build());
                return;
            }
            RVLogger.d("AriverEngine:EngineUtils", String.format("logEvent Event[%s] ignore.", new Object[]{str}));
        }
    }
}
