package com.alibaba.ariver.remotedebug.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.console.DebugConsolePoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.model.WorkerStore;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.core.RVRemoteDebugProxy;
import com.alibaba.ariver.remotedebug.core.a;
import com.alibaba.ariver.remotedebug.worker.b;
import com.alibaba.fastjson.JSONObject;
import id.dana.sendmoney.summary.SummaryActivity;

public class RemoteDebugUtils {
    public static boolean isRemoteDebugMode(Bundle bundle) {
        return SummaryActivity.CHECKED.equalsIgnoreCase(BundleUtils.getString(bundle, RVStartParams.KEY_IS_REMOTE_DEBUG_MODE));
    }

    public static boolean supportRemoteDebugMode(String str) {
        return ((RVRemoteDebugProxy) RVProxy.get(RVRemoteDebugProxy.class)).supportRemoteDebug(str);
    }

    public static String getRemoteDebugUrlForDebug(String str, String str2) {
        String remoteDebugWebSocketUrlForDebug = ((RVRemoteDebugProxy) RVProxy.get(RVRemoteDebugProxy.class)).getRemoteDebugWebSocketUrlForDebug(str, str2);
        if (TextUtils.isEmpty(remoteDebugWebSocketUrlForDebug)) {
            return null;
        }
        RVLogger.d("AriverRemoteDebug:RemoteDebugUtils", "Debug WebSocket url: ".concat(String.valueOf(remoteDebugWebSocketUrlForDebug)));
        StringBuilder sb = new StringBuilder();
        sb.append(remoteDebugWebSocketUrlForDebug);
        sb.append(str2);
        return sb.toString();
    }

    public static boolean remoteDebugByOpenChannel() {
        return "yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(RDConstant.CONFIG_H5_REMOTEDEBUG_USE_OPEN_CHANNEL, (String) null));
    }

    public static void exitRemoteDebug(Page page) {
        b a2 = a(page);
        if (a2 != null) {
            a2.b();
        }
    }

    public static void sendMessageToRemoteDebugOrVConsole(Page page, a aVar, String str) {
        sendMessageToRemoteDebugOrVConsole(page, aVar.getType(), str);
    }

    public static void sendMessageToRemoteDebugOrVConsole(Page page, String str, String str2) {
        if (page == null) {
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", String.format("sendMessageToRemoteDebugOrVConsole [%s] [%s] page is null!", new Object[]{str, str2}));
            return;
        }
        RVLogger.d("AriverRemoteDebug:RemoteDebugUtils", String.format("sendMessageToRemoteDebugOrVConsole [%s] [%s]", new Object[]{str, str2}));
        if (BundleUtils.getBoolean(page.getStartParams(), RDConstant.IS_REMOTE_X, false)) {
            JSONObject a2 = a(str, str2);
            if (page.getRender() != null) {
                RVLogger.d("AriverRemoteDebug:RemoteDebugUtils", "remoteX direct send msg to worker.");
                EngineUtils.sendToRender(page.getRender(), RDConstant.TINY_DEBUG_CONSOLE, a2, (SendToRenderCallback) null);
                return;
            }
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", "remoteX direct send msg to worker fail. render is null.");
        } else if (isRemoteDebugConnected(page)) {
            a(page, str, str2);
        } else {
            App app = (App) page.bubbleFindNode(App.class);
            if (app != null) {
                ExtensionPoint.as(DebugConsolePoint.class).node(app).create().sendMsgToConsoleView(a(str, str2));
            }
        }
    }

    public static boolean isDebugPanelExists(Page page) {
        App app = (App) page.bubbleFindNode(App.class);
        if (app != null) {
            return ExtensionPoint.as(DebugConsolePoint.class).node(app).create().isDebugPanelExists();
        }
        return false;
    }

    private static void a(Page page, String str, String str2) {
        try {
            b a2 = a(page);
            if (a2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                a2.a(sb.toString());
            }
        } catch (Exception e) {
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", "sendMessageToRemoteDebugOrVConsole error.", e);
        }
    }

    public static boolean isRemoteDebugConnected(Page page) {
        try {
            b a2 = a(page);
            if (a2 != null) {
                return a2.a();
            }
            return false;
        } catch (Exception e) {
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", "isRemoteDebugConnected error.", e);
            return false;
        }
    }

    @Nullable
    private static b a(Page page) {
        WorkerStore workerStore = (WorkerStore) page.getData(WorkerStore.class);
        if (workerStore == null) {
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", "getRemoteDebugWorker workerStore is null.");
            return null;
        }
        RVLogger.d("AriverRemoteDebug:RemoteDebugUtils", "getRemoteDebugWorker.....");
        try {
            Worker workerById = page.getRender().getEngine().getEngineRouter().getWorkerById(workerStore.workerId);
            if (workerById instanceof b) {
                return (b) workerById;
            }
        } catch (Exception e) {
            RVLogger.e("AriverRemoteDebug:RemoteDebugUtils", "getRemoteDebugWorker error.", e);
        }
        return null;
    }

    private static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("content", (Object) str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        return jSONObject2;
    }
}
