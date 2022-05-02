package com.alibaba.ariver.websocket.core;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.websocket.WSConstant;
import com.alibaba.ariver.websocket.proxy.RVWebSocketProxy;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class WebSocketSession {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, RVWebSocketClient> f9045a = new ConcurrentHashMap();
    private String b;

    public WebSocketSession(String str) {
        this.b = str;
    }

    private RVWebSocketClient a(String str, String str2, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        return ((RVWebSocketProxy) RVProxy.get(RVWebSocketProxy.class)).createWebSocketClient(this.b, str2, map, new RVWebSocketCallbackProxy(str, rVWebSocketCallback));
    }

    public void startSocketConnect(String str, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        startSocketConnect(str, "DEFAULT-TASK-ID", map, rVWebSocketCallback);
    }

    public void startSocketConnect(String str, String str2, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(580284770, oncanceled);
            onCancelLoad.getMin(580284770, oncanceled);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "DEFAULT-TASK-ID";
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            RVWebSocketClient a2 = a(str2, str, map, rVWebSocketCallback);
            if (a2 != null) {
                RVLogger.d("AriverWebSocket:WebSocketSession", "startSocketConnect.");
                if (WSConstant.SCHEME_WS.equalsIgnoreCase(scheme)) {
                    a2.connect();
                } else if (WSConstant.SCHEME_WSS.equalsIgnoreCase(scheme)) {
                    a2.connectWithSSL();
                } else {
                    throw new InvalidParameterException(String.format("url error: %s not ws:// or wss://", new Object[]{parse.toString()}));
                }
                this.f9045a.put(str2, a2);
                return;
            }
            RVLogger.d("AriverWebSocket:WebSocketSession", "startSocketConnect createClient is null! taskId: ".concat(String.valueOf(str2)));
            throw new InvalidParameterException("url error: ".concat(String.valueOf(str)));
        }
        throw new InvalidParameterException("url error: ".concat(String.valueOf(str)));
    }

    public void closeSocketConnect() {
        closeSocketConnect("DEFAULT-TASK-ID");
    }

    public void closeSocketConnect(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT-TASK-ID";
        }
        RVWebSocketClient rVWebSocketClient = this.f9045a.get(str);
        if (rVWebSocketClient == null) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "closeSocketConnect client is null. taskId: ".concat(String.valueOf(str)));
            return;
        }
        RVLogger.d("AriverWebSocket:WebSocketSession", "closeSocketConnect.");
        rVWebSocketClient.close();
    }

    public void closeAllSocket() {
        RVLogger.d("AriverWebSocket:WebSocketSession", "closeAllSocket.");
        Iterator<Map.Entry<String, RVWebSocketClient>> it = this.f9045a.entrySet().iterator();
        while (it.hasNext()) {
            RVWebSocketClient rVWebSocketClient = (RVWebSocketClient) it.next().getValue();
            if (rVWebSocketClient != null) {
                rVWebSocketClient.close();
            }
            it.remove();
        }
    }

    public void sendMessage(byte[] bArr) {
        sendMessage("DEFAULT-TASK-ID", bArr);
    }

    public void sendMessage(String str) {
        sendMessage("DEFAULT-TASK-ID", str);
    }

    public void sendMessage(String str, byte[] bArr) {
        if (!isOpen(str)) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage socket has closed!. taskId: ".concat(String.valueOf(str)));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT-TASK-ID";
        }
        RVWebSocketClient rVWebSocketClient = this.f9045a.get(str);
        if (rVWebSocketClient == null) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage client is null. taskId: ".concat(String.valueOf(str)));
            return;
        }
        RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage data:".concat(String.valueOf(bArr)));
        rVWebSocketClient.send(bArr);
    }

    public void sendMessage(String str, String str2) {
        if (!isOpen(str)) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage socket has closed!. taskId: ".concat(String.valueOf(str)));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT-TASK-ID";
        }
        RVWebSocketClient rVWebSocketClient = this.f9045a.get(str);
        if (rVWebSocketClient == null) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage client is null. taskId: ".concat(String.valueOf(str)));
            return;
        }
        RVLogger.d("AriverWebSocket:WebSocketSession", "sendMessage data:".concat(String.valueOf(str2)));
        rVWebSocketClient.send(str2);
    }

    public boolean isOpen() {
        return isOpen("DEFAULT-TASK-ID");
    }

    public boolean isOpen(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "DEFAULT-TASK-ID";
        }
        RVWebSocketClient rVWebSocketClient = this.f9045a.get(str);
        if (rVWebSocketClient == null) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "isOpen client is null. taskId: ".concat(String.valueOf(str)));
            return false;
        }
        boolean isOpen = rVWebSocketClient.isOpen();
        StringBuilder sb = new StringBuilder("isOpen taskId:");
        sb.append(str);
        sb.append(" open:");
        sb.append(isOpen);
        RVLogger.d("AriverWebSocket:WebSocketSession", sb.toString());
        return isOpen;
    }

    public int getClientCount() {
        return this.f9045a.size();
    }

    class RVWebSocketCallbackProxy implements RVWebSocketCallback {
        RVWebSocketCallback mCallback;
        String mTaskId;

        RVWebSocketCallbackProxy(String str, RVWebSocketCallback rVWebSocketCallback) {
            this.mTaskId = str;
            this.mCallback = rVWebSocketCallback;
        }

        public void onSocketOpen() {
            RVLogger.d("AriverWebSocket:WebSocketSession", "RVWebSocketCallbackProxy onSocketOpen");
            RVWebSocketCallback rVWebSocketCallback = this.mCallback;
            if (rVWebSocketCallback != null) {
                rVWebSocketCallback.onSocketOpen();
            }
        }

        public void onSocketClose() {
            RVWebSocketCallback rVWebSocketCallback;
            RVLogger.d("AriverWebSocket:WebSocketSession", "RVWebSocketCallbackProxy onSocketClose");
            if (((RVWebSocketClient) WebSocketSession.this.f9045a.remove(this.mTaskId)) != null && (rVWebSocketCallback = this.mCallback) != null) {
                rVWebSocketCallback.onSocketClose();
            }
        }

        public void onSocketMessage(byte[] bArr) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "RVWebSocketCallbackProxy onSocketMessage message ".concat(String.valueOf(bArr)));
            RVWebSocketCallback rVWebSocketCallback = this.mCallback;
            if (rVWebSocketCallback != null) {
                rVWebSocketCallback.onSocketMessage(bArr);
            }
        }

        public void onSocketMessage(String str) {
            RVLogger.d("AriverWebSocket:WebSocketSession", "RVWebSocketCallbackProxy onSocketMessage message ".concat(String.valueOf(str)));
            RVWebSocketCallback rVWebSocketCallback = this.mCallback;
            if (rVWebSocketCallback != null) {
                rVWebSocketCallback.onSocketMessage(str);
            }
        }

        public void onSocketError(int i, String str) {
            StringBuilder sb = new StringBuilder("RVWebSocketCallbackProxy onSocketError errCode ");
            sb.append(i);
            sb.append(" errMsg:");
            sb.append(str);
            RVLogger.d("AriverWebSocket:WebSocketSession", sb.toString());
            RVWebSocketCallback rVWebSocketCallback = this.mCallback;
            if (rVWebSocketCallback != null) {
                rVWebSocketCallback.onSocketError(i, str);
            }
        }
    }
}
