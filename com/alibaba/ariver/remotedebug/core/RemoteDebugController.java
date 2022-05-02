package com.alibaba.ariver.remotedebug.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.core.state.a;
import com.alibaba.ariver.remotedebug.datachannel.DataChannel;
import com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils;
import com.alibaba.ariver.remotedebug.view.c;
import com.alibaba.ariver.remotedebug.worker.b;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.uitools.POPUIType;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RemoteDebugController implements NetworkUtil.NetworkListener, DataChannel.DataStatusChangedListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f10140a;
    private final String b;
    private final Context c;
    private final String d;
    private final b e;
    private boolean f;
    /* access modifiers changed from: private */
    public c g;
    private App h;

    public interface RemoteDebugExitClickListener {
        void onRemoteDebugExitClick();
    }

    public RemoteDebugController(Context context, b bVar, App app, String str) {
        this.h = app;
        String appId = app.getAppId();
        this.b = appId;
        this.c = context;
        this.d = str;
        this.e = bVar;
        this.f10140a = com.alibaba.ariver.remotedebug.datachannel.b.a(1, appId, this);
        a(app);
    }

    private void a(final App app) {
        final Activity activity = (Activity) app.getAppContext().getContext();
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                c unused = RemoteDebugController.this.g = new c(app, new RemoteDebugExitClickListener() {
                    public void onRemoteDebugExitClick() {
                        RemoteDebugController.this.a();
                    }
                });
                RemoteDebugController.this.g.a(activity);
            }
        });
    }

    public void a(String str, Bundle bundle) {
        String string = BundleUtils.getString(bundle, RVStartParams.KEY_CHANNEL_ID);
        if (TextUtils.isEmpty(string)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "registerWorker...channelId is null");
            return;
        }
        NetworkUtil.addListener(this.c, this);
        final String c2 = c(string);
        final HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.USER_AGENT, str);
        ExecutorUtils.execute(ExecutorType.NORMAL, new Runnable() {
            public void run() {
                try {
                    RemoteDebugController.this.f10140a.connect(c2, hashMap, (JSONObject) null);
                } catch (Exception e) {
                    RVLogger.e("AriverRemoteDebug:RemoteDebugController", "registerWorker connect error! ", e);
                }
            }
        });
    }

    public void a(String str) {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "remoteLoadUrl: ".concat(String.valueOf(str)));
        this.f10140a.send(str);
    }

    public void b(String str) {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "sendMessageToRemoteWorker: ".concat(String.valueOf(str)));
        this.f10140a.send(str);
    }

    public void a() {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "exitRemoteDebug.");
        b(RemoteDebugCommand.CMD_LOCAL_DISCONNECTED);
        this.f10140a.close(POPUIType.TOAST_ERROR, "user_exit_debug");
        NetworkUtil.removeListener(this.c, this);
        this.h.exit();
    }

    public boolean b() {
        StringBuilder sb = new StringBuilder("isRemoteDebugConnected  ");
        sb.append(this.f);
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", sb.toString());
        return this.f;
    }

    private String c(String str) {
        RVRemoteDebugProxy rVRemoteDebugProxy = (RVRemoteDebugProxy) RVProxy.get(RVRemoteDebugProxy.class);
        if (RVKernelUtils.isDebug()) {
            String remoteDebugUrlForDebug = RemoteDebugUtils.getRemoteDebugUrlForDebug(this.b, str);
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "generateRemoteDebugUrl getRemoteDebugUrlForDebug: ".concat(String.valueOf(remoteDebugUrlForDebug)));
            if (!TextUtils.isEmpty(remoteDebugUrlForDebug)) {
                return remoteDebugUrlForDebug;
            }
        }
        String remoteDebugWebSocketUrl = rVRemoteDebugProxy.getRemoteDebugWebSocketUrl(this.b, str);
        if (!TextUtils.isEmpty(remoteDebugWebSocketUrl)) {
            StringBuilder sb = new StringBuilder();
            sb.append(remoteDebugWebSocketUrl);
            sb.append(str);
            String obj = sb.toString();
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "generateRemoteDebugUrl getWebSocketHostUrl from proxy ".concat(String.valueOf(obj)));
            return obj;
        }
        String format = String.format(RDConstant.WEBSOCKET_HOST_URL_OPEN_CHANNEL, new Object[]{str, this.b});
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "generateRemoteDebugUrl getWebSocketHostUrl: ".concat(String.valueOf(format)));
        return format;
    }

    private boolean d(String str) {
        if (str.startsWith(RemoteDebugCommand.CMD_REMOTE_DISCONNECTED)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRemoteDebugMessage CMD_REMOTE_DISCONNECTED");
            this.g.a(a.STATE_REMOTE_DISCONNECTED);
            return true;
        } else if (str.startsWith(RemoteDebugCommand.CMD_HIT_BREAKPOINT)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRemoteDebugMessage CMD_HIT_BREAKPOINT");
            this.g.a(a.STATE_HIT_BREAKPOINT);
            return true;
        } else if (str.startsWith(RemoteDebugCommand.CMD_RELEASE_BREAKPOINT)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRemoteDebugMessage CMD_RELEASE_BREAKPOINT");
            this.g.a(a.STATE_RELEASE_BREAKPOINT);
            return true;
        } else if (str.startsWith(RemoteDebugCommand.CMD_RECV_RENDER_DEBUG)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRemoteDebugMessage CMD_RECV_RENDER_DEBUG");
            return e(str);
        } else if (!str.startsWith(RemoteDebugCommand.CMD_DEBUG_JS)) {
            return false;
        } else {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRemoteDebugMessage CMD_DEBUG_JS");
            return f(str);
        }
    }

    private boolean e(String str) {
        String replaceFirst = str.replaceFirst(RemoteDebugCommand.CMD_RECV_RENDER_DEBUG, "");
        if (TextUtils.isEmpty(replaceFirst)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "handleRecvRenderDebug msgText is empty.");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) replaceFirst);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        return this.e.c().a(jSONObject2, RDConstant.RENDER_DEBUG_MESSAGE);
    }

    private boolean f(String str) {
        JSONObject parseObject = JSONUtils.parseObject(str.replaceFirst(RemoteDebugCommand.CMD_DEBUG_JS, ""));
        if (parseObject == null || parseObject.isEmpty()) {
            return false;
        }
        return this.e.c().b(parseObject, RDConstant.SOCKET_MESSAGE);
    }

    public void onNetworkChanged(NetworkUtil.Network network, NetworkUtil.Network network2) {
        if (network2 == NetworkUtil.Network.NETWORK_NO_CONNECTION) {
            this.g.a(a.STATE_NETWORK_UNAVAILABLE);
        }
    }

    public void onConnectSuccess(String str) {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "onConnectSuccess");
        this.f = true;
        this.f10140a.send(String.format(RemoteDebugCommand.CMD_WORKERID_AND_PLATFORM, new Object[]{this.d, "Android"}));
        this.e.onAlipayJSBridgeReady();
        this.g.a(a.STATE_CONNECTED);
    }

    public void onConnectFailed() {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "onConnectFailed");
        this.f = false;
        this.g.a(a.STATE_CONNECT_FAILED);
    }

    public void onConnectClosed(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1815655237, oncanceled);
            onCancelLoad.getMin(-1815655237, oncanceled);
        }
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "onConnectClosed id:".concat(String.valueOf(str)));
        this.f = false;
    }

    public void onConnectError(String str, int i, String str2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-302138738, oncanceled);
            onCancelLoad.getMin(-302138738, oncanceled);
        }
        StringBuilder sb = new StringBuilder("onConnectClosed id:");
        sb.append(str);
        sb.append(" code: ");
        sb.append(i);
        sb.append(" errorMsg:");
        sb.append(str2);
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", sb.toString());
        this.f = false;
        this.g.a(a.STATE_CONNECT_FAILED);
    }

    public void recv(String str) {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "recv message: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "recv message is empty！");
        } else if (d(str)) {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "recv message handleRemoteDebugMessage");
        } else {
            RVLogger.d("AriverRemoteDebug:RemoteDebugController", "recv message handleMsgFromWorker");
            this.e.c().a(str);
        }
    }

    public void recv(byte[] bArr) {
        RVLogger.d("AriverRemoteDebug:RemoteDebugController", "recv bytes[]");
        recv(new String(bArr));
    }
}
