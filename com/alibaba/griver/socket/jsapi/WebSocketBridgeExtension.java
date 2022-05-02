package com.alibaba.griver.socket.jsapi;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.websocket.WSConstant;
import com.alibaba.ariver.websocket.core.RVWebSocketManager;
import com.alibaba.ariver.websocket.core.WebSocketResultEnum;
import com.alibaba.ariver.websocket.core.WebSocketSession;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.net.HttpHeaders;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.getTabbarModel;

public class WebSocketBridgeExtension implements BridgeExtension, NodeAware<App> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WebSocketBridgeCallback> f9102a = new HashMap();
    private App b;

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    public void onFinalized() {
        WebSocketSession socketSession;
        this.f9102a.clear();
        if (this.b != null && (socketSession = RVWebSocketManager.getInstance().getSocketSession(this.b.getAppId())) != null) {
            socketSession.closeAllSocket();
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void connectSocket(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam({"url"}) String str, @BindingParam({"socketTaskID"}) String str2, @BindingParam({"multiple"}) boolean z, @BindingParam({"protocols"}) JSONArray jSONArray, @BindingParam({"header"}) JSONObject jSONObject, @BindingParam({"fromRemoteDebug"}) boolean z2, @BindingCallback BridgeCallback bridgeCallback) {
        final String userAgent = page.getRender().getUserAgent();
        final App app2 = app;
        final Page page2 = page;
        final String str3 = str;
        final String str4 = str2;
        final boolean z3 = z;
        final JSONArray jSONArray2 = jSONArray;
        final JSONObject jSONObject2 = jSONObject;
        final boolean z4 = z2;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        ExecutorUtils.getScheduledExecutor().execute(new Runnable() {
            public void run() {
                bridgeCallback2.sendBridgeResponse(WebSocketBridgeExtension.this.a(app2, page2, str3, str4, z3, jSONArray2, jSONObject2, z4, userAgent));
            }
        });
    }

    /* access modifiers changed from: private */
    public BridgeResponse a(App app, Page page, String str, String str2, boolean z, JSONArray jSONArray, JSONObject jSONObject, boolean z2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        boolean z3 = z;
        if (z2) {
            StringBuilder sb = new StringBuilder(RDConstant.REMOTE_DEBUG_ID);
            sb.append(app.getAppId());
            str4 = sb.toString();
        } else {
            str4 = app.getAppId();
        }
        String str7 = str4;
        page.getRender().getRenderBridge();
        RVLogger.d("AriverAPIWebSocketBridgeExtension", String.format("enter connectSocket, appId: %s", new Object[]{str7}));
        boolean z4 = z3 && !TextUtils.isEmpty(str2);
        WebSocketSession socketSession = RVWebSocketManager.getInstance().getSocketSession(str7);
        if (socketSession == null) {
            socketSession = RVWebSocketManager.getInstance().createSocketSession(str7);
        } else if (z4 && socketSession.getClientCount() >= 2) {
            return BridgeResponse.newError(3, "exceed each tiny app max socket count");
        }
        if (socketSession.isOpen(str6)) {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", "the already appid has a websocket");
            return BridgeResponse.newError(3, "WebSocket is already existed");
        } else if (TextUtils.isEmpty(str)) {
            return a(WebSocketResultEnum.URL_IS_NULL_MSG);
        } else {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", String.format("url is %s", new Object[]{str5}));
            try {
                String scheme = new URI(str5).getScheme();
                if (TextUtils.isEmpty(scheme)) {
                    RVLogger.d("AriverAPIWebSocketBridgeExtension", String.format("connect fail : %s ", new Object[]{str5}));
                    return a(WebSocketResultEnum.URL_NOT_WELL_FORMAT);
                }
                if (!WSConstant.SCHEME_WS.equalsIgnoreCase(scheme) && !WSConstant.SCHEME_WSS.equalsIgnoreCase(scheme)) {
                    RVLogger.d("AriverAPIWebSocketBridgeExtension", String.format("url error: %s not ws:// or wss://", new Object[]{str5}));
                    return a(WebSocketResultEnum.URL_NOT_WS_OR_WSS);
                }
                RVLogger.d("AriverAPIWebSocketBridgeExtension", String.format("send request ok, url is : %s ,appid: %s", new Object[]{str5, str7}));
                Map<String, String> a2 = a(jSONObject);
                a2.put(HttpHeaders.USER_AGENT, str3);
                a2.remove("referer");
                String a3 = a(jSONArray);
                if (!TextUtils.isEmpty(a3)) {
                    a2.put(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, a3);
                }
                RVLogger.d("AriverAPIWebSocketBridgeExtension", "protocols: ".concat(String.valueOf(a3)));
                try {
                    Page page2 = page;
                    WebSocketBridgeCallback webSocketBridgeCallback = new WebSocketBridgeCallback(page, str6, z3);
                    socketSession.startSocketConnect(str5, str6, a2, webSocketBridgeCallback);
                    Map<String, WebSocketBridgeCallback> map = this.f9102a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str7);
                    sb2.append(str6);
                    map.put(sb2.toString(), webSocketBridgeCallback);
                    return BridgeResponse.SUCCESS;
                } catch (Exception e) {
                    return BridgeResponse.newError(3, e.toString());
                }
            } catch (URISyntaxException e2) {
                RVLogger.e("AriverAPIWebSocketBridgeExtension", (Throwable) e2);
            }
        }
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse sendSocketMessage(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam({"data"}) String str, @BindingParam({"socketTaskID"}) String str2, @BindingParam({"isBuffer"}) boolean z, @BindingParam({"fromRemoteDebug"}) boolean z2) {
        String str3;
        if (z2) {
            StringBuilder sb = new StringBuilder(RDConstant.REMOTE_DEBUG_ID);
            sb.append(app.getAppId());
            str3 = sb.toString();
        } else {
            str3 = app.getAppId();
        }
        WebSocketSession socketSession = RVWebSocketManager.getInstance().getSocketSession(str3);
        if (socketSession == null) {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", "sendSocketMessage error , not exist WebsocketSession");
            return a(WebSocketResultEnum.CANNOT_SEND_UNTIL_CONNECTION_IS_OPEN);
        } else if (!socketSession.isOpen(str2)) {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", "sendSocketMessage error , no websocket connection is established");
            return a(WebSocketResultEnum.CANNOT_SEND_UNTIL_CONNECTION_IS_OPEN);
        } else {
            if (!z2) {
                Map<String, WebSocketBridgeCallback> map = this.f9102a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str2);
                WebSocketBridgeCallback webSocketBridgeCallback = map.get(sb2.toString());
                if (webSocketBridgeCallback == null) {
                    RVLogger.d("AriverAPIWebSocketBridgeExtension", "sendSocketMessage error , no callback!!!");
                    return a(WebSocketResultEnum.UNKNOW_ERROR);
                }
                webSocketBridgeCallback.setPage(page);
            }
            if (str == null) {
                RVLogger.e("AriverAPIWebSocketBridgeExtension", "Cannot send 'null' data to a WebSocket");
                return BridgeResponse.newError(3, "Cannot send 'null' data to a WebSocket");
            }
            if (z) {
                try {
                    socketSession.sendMessage(str2, str.getBytes(getTabbarModel.ENC));
                } catch (Exception e) {
                    RVLogger.e("AriverAPIWebSocketBridgeExtension", "send socket error!", e);
                    StringBuilder sb3 = new StringBuilder("send socket error! ");
                    sb3.append(e.getMessage());
                    return BridgeResponse.newError(3, sb3.toString());
                }
            } else {
                socketSession.sendMessage(str2, str);
            }
            return BridgeResponse.SUCCESS;
        }
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse closeSocket(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam({"socketTaskID"}) String str, @BindingParam({"fromRemoteDebug"}) boolean z) {
        String str2;
        if (z) {
            StringBuilder sb = new StringBuilder(RDConstant.REMOTE_DEBUG_ID);
            sb.append(app.getAppId());
            str2 = sb.toString();
        } else {
            str2 = app.getAppId();
        }
        WebSocketSession socketSession = RVWebSocketManager.getInstance().getSocketSession(str2);
        if (socketSession == null) {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", "closeSocket error , not exist WebsocketSession");
            return BridgeResponse.SUCCESS;
        }
        Map<String, WebSocketBridgeCallback> map = this.f9102a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        if (map.get(sb2.toString()) == null) {
            RVLogger.d("AriverAPIWebSocketBridgeExtension", "sendSocketMessage error , no callback!!!");
            return BridgeResponse.SUCCESS;
        }
        socketSession.closeSocketConnect(str);
        return BridgeResponse.SUCCESS;
    }

    private BridgeResponse a(WebSocketResultEnum webSocketResultEnum) {
        return BridgeResponse.newError(webSocketResultEnum.getErrCode(), webSocketResultEnum.getErrMsg());
    }

    private String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                sb.append(next.toString());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isEmpty()) {
                    for (Map.Entry next : jSONObject.entrySet()) {
                        String str = (String) next.getKey();
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put(str.toLowerCase(), String.valueOf(next.getValue()));
                        }
                    }
                }
            } catch (Exception e) {
                RVLogger.e("AriverAPIWebSocketBridgeExtension", "get header error, exception : ", e);
            }
        }
        return hashMap;
    }

    public void setNode(WeakReference<App> weakReference) {
        this.b = weakReference.get();
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
