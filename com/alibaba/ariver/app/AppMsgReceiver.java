package com.alibaba.ariver.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVMonitor;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.bridge.remote.RemoteCallbackPool;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.monitor.ErrId;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.track.Event;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.AppModelInitPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class AppMsgReceiver implements IpcMessageHandler {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public AppNode f9952a;

    public AppMsgReceiver(AppNode appNode) {
        this.f9952a = appNode;
    }

    private void a(EntryInfo entryInfo) {
        if (this.f9952a.getSplashView() != null) {
            this.f9952a.getSplashView().showLoading(entryInfo);
        }
    }

    private void b(EntryInfo entryInfo) {
        if (this.f9952a.getSplashView() != null) {
            this.f9952a.getSplashView().update(entryInfo);
        }
    }

    public void handleMessage(IpcMessage ipcMessage) {
        Page pageByNodeId;
        ResourceContext resourceContext;
        Message message = ipcMessage.bizMsg;
        boolean z = false;
        boolean z2 = message.arg1 == 1;
        StringBuilder sb = new StringBuilder("handle ipc msg: ");
        sb.append(message.what);
        sb.append(" data: ");
        sb.append(message.getData());
        sb.append(" fromPending: ");
        sb.append(z2);
        RVLogger.d("AriverApp:AppMsgReceiver", sb.toString());
        EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(message.getData(), RVConstants.EXTRA_ENTRY_INFO);
        HashMap hashMap = null;
        switch (message.what) {
            case 0:
                boolean z3 = BundleUtils.getBoolean(message.getData(), RVConstants.EXTRA_NEED_WAIT_LOADING_ANIM, false);
                if (entryInfo != null) {
                    this.f9952a.setData(EntryInfo.class, entryInfo);
                }
                this.f9952a.getSceneParams().putBoolean(RVConstants.EXTRA_NEED_WAIT_LOADING_ANIM, z3);
                a(entryInfo);
                return;
            case 1:
                if (entryInfo != null) {
                    this.f9952a.setData(EntryInfo.class, entryInfo);
                }
                b(entryInfo);
                return;
            case 2:
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppMsgReceiver_handleEnterApp);
                this.f9952a.putBooleanValue(RVConstants.EXTRA_RECEIVED_PREPARE_FINISH, true);
                a(message.getData());
                RVTraceUtils.traceEndSection(RVTraceKey.RV_AppMsgReceiver_handleEnterApp);
                return;
            case 3:
                String string = BundleUtils.getString(message.getData(), RVConstants.EXTRA_PREPARE_EXCEPTION_CODE);
                String string2 = BundleUtils.getString(message.getData(), RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE);
                Bundle bundle = message.getData().getBundle(RVConstants.EXTRA_PREPARE_EXCEPTION_EXTRAS);
                StringBuilder sb2 = new StringBuilder("prepareFail client with code: ");
                sb2.append(string);
                sb2.append(", msg: ");
                sb2.append(string2);
                sb2.append(", splashView: ");
                sb2.append(this.f9952a.getSplashView());
                RVLogger.d("AriverApp:AppMsgReceiver", sb2.toString());
                if (this.f9952a.getSplashView() != null) {
                    if (bundle != null) {
                        hashMap = new HashMap();
                        for (String str : bundle.keySet()) {
                            if (str != null) {
                                hashMap.put(str, bundle.getString(str));
                            }
                        }
                    }
                    this.f9952a.getSplashView().showError(string, string2, hashMap);
                }
                ((RVMonitor) RVProxy.get(RVMonitor.class)).error(this.f9952a.getActivePage(), ErrId.RV_TYPE_APP_PREPARE_ERROR, string, string2, (Map<String, Object>) null, (Map<String, Object>) null);
                PrepareData prepareData = (PrepareData) BundleUtils.getParcelable(message.getData(), RVConstants.EXTRA_PREPARE_DATA);
                Event error = ((EventTracker) RVProxy.get(EventTracker.class)).error(this.f9952a, "ResPrepareFail", string);
                if (error != null && prepareData != null) {
                    a(string, prepareData, error);
                    return;
                }
                return;
            case 4:
                RVLogger.d("AriverApp:AppMsgReceiver", "force finish for reason: ".concat(String.valueOf(BundleUtils.getString(message.getData(), RVConstants.EXTRA_PREPARE_ABORT_REASON))));
                this.f9952a.exit();
                return;
            case 5:
                if (this.f9952a.getSplashView() != null) {
                    this.f9952a.getSplashView().exit((SplashView.ExitListener) null);
                    return;
                }
                return;
            case 7:
                JSONObject unmarshallJSONObject = JSONUtils.unmarshallJSONObject(BundleUtils.getByteArray(message.getData(), "data"));
                boolean z4 = BundleUtils.getBoolean(message.getData(), "keepCallback", false);
                SendToNativeCallback callback = RemoteCallbackPool.getInstance().getCallback(BundleUtils.getLong(message.getData(), IpcMessageConstants.EXTRA_NODE_ID), BundleUtils.getString(message.getData(), "clientId"), !z4);
                StringBuilder sb3 = new StringBuilder("SERVER_MSG_REMOTE_API_CALLBACK found callback: ");
                if (callback != null) {
                    z = true;
                }
                sb3.append(z);
                sb3.append(", keepCallback: ");
                sb3.append(z4);
                RVLogger.d("AriverApp:AppMsgReceiver", sb3.toString());
                if (callback != null) {
                    callback.onCallback(unmarshallJSONObject, z4);
                    return;
                }
                return;
            case 8:
                final NativeCallContext nativeCallContext = (NativeCallContext) message.getData().getParcelable(IpcMessageConstants.EXTRA_REMOTE_CALL_CONTEXT);
                boolean z5 = message.getData().getBoolean(IpcMessageConstants.EXTRA_REMOTE_CALL_NEED_PERMISSION, true);
                if (nativeCallContext == null) {
                    RVLogger.w("AriverApp:AppMsgReceiver", "SERVER_MSG_REMOTE_API_CALL callContext == null!!");
                    return;
                }
                Node node = nativeCallContext.getNode();
                if (node != null) {
                    if ((node instanceof App) || (pageByNodeId = this.f9952a.getPageByNodeId(node.getNodeId())) == null) {
                        nativeCallContext.setNode(this.f9952a);
                    } else {
                        nativeCallContext.setNode(pageByNodeId);
                    }
                }
                AnonymousClass1 r2 = new SendToNativeCallback() {
                    public void onCallback(JSONObject jSONObject, boolean z) {
                        Bundle bundle = new Bundle();
                        bundle.putString("clientId", nativeCallContext.getId());
                        bundle.putByteArray(IpcMessageConstants.EXTRA_REMOTE_CALLBACK_DATA, JSONUtils.marshallJSONObject(jSONObject));
                        bundle.putBoolean(IpcMessageConstants.EXTRA_REMOTE_CALLBACK_KEEP, z);
                        IpcClientUtils.sendMsgToServerByApp(AppMsgReceiver.this.f9952a, 7, bundle);
                    }
                };
                if (!this.f9952a.isExited()) {
                    this.f9952a.getEngineProxy().getBridge().sendToNative(nativeCallContext, r2, z5);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", (Object) "remote App already exited!");
                r2.onCallback(jSONObject, false);
                return;
            case 9:
                String string3 = BundleUtils.getString(message.getData(), IpcMessageConstants.EXTRA_EVENT);
                final String string4 = BundleUtils.getString(message.getData(), "clientId");
                AppUtils.sendToApp(this.f9952a, string3, JSONUtils.unmarshallJSONObject(BundleUtils.getByteArray(message.getData(), "data")), new SendToRenderCallback() {
                    public void onCallBack(JSONObject jSONObject) {
                        Bundle bundle = new Bundle();
                        bundle.putString("clientId", string4);
                        IpcClientUtils.sendMsgToServerByApp(AppMsgReceiver.this.f9952a, 7, bundle);
                    }
                });
                return;
            case 10:
                Node child = this.f9952a.getChild(BundleUtils.getLong(message.getData(), IpcMessageConstants.EXTRA_PAGE_NODE_ID));
                if (child instanceof Page) {
                    ((Page) child).exit(false);
                    return;
                }
                return;
            case 11:
                Intent intent = (Intent) BundleUtils.getParcelable(message.getData(), IpcMessageConstants.EXTRA_INTENT);
                RVLogger.d("AriverApp:AppMsgReceiver", "SERVER_MSG_START_ACTIVITY: ".concat(String.valueOf(intent)));
                if (intent == null) {
                    return;
                }
                if (this.f9952a.getActivePage() != null && this.f9952a.getActivePage().getPageContext() != null && this.f9952a.getActivePage().getPageContext().getActivity() != null) {
                    RVLogger.d("AriverApp:AppMsgReceiver", "SERVER_MSG_START_ACTIVITY use activity to start!");
                    this.f9952a.getActivePage().getPageContext().getActivity().startActivityForResult(intent, 1024);
                    return;
                } else if (this.f9952a.getAppContext() != null) {
                    RVLogger.d("AriverApp:AppMsgReceiver", "SERVER_MSG_START_ACTIVITY use context to start!");
                    this.f9952a.getAppContext().getContext().startActivity(intent);
                    return;
                } else {
                    RVLogger.d("AriverApp:AppMsgReceiver", "SERVER_MSG_START_ACTIVITY cannot find activity to start!");
                    return;
                }
            case 12:
                String string5 = BundleUtils.getString(message.getData(), IpcMessageConstants.EXTRA_STUB_NAME);
                long j = BundleUtils.getLong(message.getData(), IpcMessageConstants.EXTRA_STUB_TS);
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                }
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, string5, j);
                return;
            case 13:
                ResourcePackage resourcePackage = GlobalPackagePool.getInstance().getPackage("66666692");
                if (resourcePackage != null) {
                    resourcePackage.reload();
                    return;
                }
                return;
            case 14:
                AppModel appModel = (AppModel) BundleUtils.getParcelable(message.getData(), IpcMessageConstants.EXTRA_FALLBACK_APP_MODEL);
                if (appModel != null && TextUtils.equals(appModel.getAppId(), this.f9952a.getAppId()) && (resourceContext = ResourceContextManager.getInstance().get(this.f9952a.getAppId())) != null) {
                    resourceContext.getOnlineResourceFetcher().startFallback(appModel);
                    return;
                }
                return;
            case 15:
                AppModel appModel2 = (AppModel) BundleUtils.getParcelable(message.getData(), "appInfo");
                if (appModel2 != null) {
                    ExtensionPoint.as(AppModelInitPoint.class).node(this.f9952a).create().onGetAppInfo(appModel2);
                    return;
                }
                return;
            case 16:
                String string6 = BundleUtils.getString(message.getData(), IpcMessageConstants.EXTRA_STUB_NAME);
                String string7 = BundleUtils.getString(message.getData(), IpcMessageConstants.EXTRA_ATTR_VALUE);
                if (!TextUtils.isEmpty(string6) && !TextUtils.isEmpty(string7)) {
                    ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.f9952a, string6, string7);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void a(Bundle bundle) {
        PrepareData prepareData;
        boolean z = BundleUtils.getBoolean(this.f9952a.getSceneParams(), RVConstants.EXTRA_PREPARE_NEED_WAIT_IPC, false);
        RVLogger.d("AriverApp:AppMsgReceiver", "handleEnterApp needWaitIpc: ".concat(String.valueOf(z)));
        Bundle bundle2 = (Bundle) BundleUtils.getParcelable(bundle, "startParams");
        Bundle bundle3 = (Bundle) BundleUtils.getParcelable(bundle, RVConstants.EXTRA_SCENE_PARAMS);
        AppNode appNode = this.f9952a;
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(appNode, appNode.getStartUrl(), PerfId.jumpAppStart, this.f9952a.getSceneParams().getLong(RVConstants.EXTRA_JUMP_APP_START_TIMESTAMP));
        long j = this.f9952a.getSceneParams().getLong(RVConstants.EXTRA_START_ACTIVITY_TIMESTAMP);
        AppNode appNode2 = this.f9952a;
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(appNode2, appNode2.getStartUrl(), PerfId.startActivity, j);
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_StartNebulaActivity, j);
        long j2 = BundleUtils.getLong(bundle3, RVConstants.EXTRA_SETUP_TIMESTAMP);
        AppNode appNode3 = this.f9952a;
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(appNode3, appNode3.getStartUrl(), PerfId.setupStart, j2);
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_SetupStart, j2);
        Event event = null;
        if (z) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_PrepareIPCFinish);
            if (bundle2 != null) {
                RVLogger.d("AriverApp:AppMsgReceiver", "handleEnterApp with new startParam: ".concat(String.valueOf(bundle2)));
                this.f9952a.getStartParams().putAll(bundle2);
            }
            if (bundle3 != null) {
                RVLogger.d("AriverApp:AppMsgReceiver", "handleEnterApp with new sceneParam: ".concat(String.valueOf(bundle3)));
                String string = BundleUtils.getString(bundle3, "appType", "WEB_TINY");
                RVLogger.d("AriverApp:AppMsgReceiver", "handleEnterApp with new appType: ".concat(String.valueOf(string)));
                String configWithProcessCache = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_setNewTypeH5", "yes");
                if ("WEB_H5".equals(string) && "yes".equals(configWithProcessCache)) {
                    this.f9952a.setAppType(string);
                }
                this.f9952a.getSceneParams().putAll(bundle3);
            }
            String configWithProcessCache2 = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_notStartWhenDestroyed", (String) null);
            if (!this.f9952a.isDestroyed() || "NO".equalsIgnoreCase(configWithProcessCache2)) {
                this.f9952a.start();
            } else {
                RVLogger.w("AriverApp:AppMsgReceiver", "app is destroyed");
            }
        }
        long j3 = BundleUtils.getLong(bundle3, RVConstants.EXTRA_SETUP_END_TIMESTAMP, 0);
        if (j3 > 0) {
            event = ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_SetupEnd, j3);
        }
        if (event != null && (prepareData = (PrepareData) BundleUtils.getParcelable(bundle, RVConstants.EXTRA_PREPARE_DATA)) != null) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_Resource_PrepareStart, prepareData.getBeginTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_Resource_PrepareFinish, prepareData.getEndTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).cost(this.f9952a, TrackId.Cost_Resource_Rpc, prepareData.getRequestEndTime() - prepareData.getRequestBeginTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_Rpc_Start, prepareData.getRequestBeginTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f9952a, TrackId.Stub_Rpc_End, prepareData.getRequestEndTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).cost(this.f9952a, TrackId.Cost_Resource_Download, prepareData.getDownloadEndTime() - prepareData.getDownloadTime());
            ((EventTracker) RVProxy.get(EventTracker.class)).cost(this.f9952a, TrackId.Cost_Resource_UnZip, prepareData.getInstallEndTime() - prepareData.getInstallTime());
            a("1", prepareData, event);
        }
    }

    private void a(String str, PrepareData prepareData, Event event) {
        HashMap hashMap = new HashMap();
        hashMap.put("res_errc", str);
        hashMap.put("res_req", prepareData.getRequestMode());
        hashMap.put("res_off", prepareData.getOfflineMode());
        hashMap.put("res_nbu", prepareData.getNbUrl());
        boolean z = true;
        hashMap.put("res_rpc", Boolean.toString(prepareData.getRequestEndTime() > 0));
        if (prepareData.getDownloadEndTime() <= 0) {
            z = false;
        }
        hashMap.put("res_dl", Boolean.toString(z));
        event.setAttrData(hashMap);
    }
}
