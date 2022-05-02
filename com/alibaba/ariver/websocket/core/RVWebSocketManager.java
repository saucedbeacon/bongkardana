package com.alibaba.ariver.websocket.core;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;
import java.util.Map;

public class RVWebSocketManager {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WebSocketSession> f9044a;

    static class Holder {
        static RVWebSocketManager INSTANCE = new RVWebSocketManager();

        private Holder() {
        }
    }

    private RVWebSocketManager() {
        this.f9044a = new HashMap();
    }

    public static RVWebSocketManager getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized WebSocketSession createSocketSession(String str) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.d("AriverWebSocket:RVWebSocketManager", "createSocketSession: socketId is empty.");
            return null;
        }
        WebSocketSession webSocketSession = this.f9044a.get(str);
        if (webSocketSession == null) {
            RVLogger.d("AriverWebSocket:RVWebSocketManager", String.format("getSocketSession: new WebSocketSession id:[%s]", new Object[]{str}));
        } else {
            webSocketSession.closeAllSocket();
            this.f9044a.remove(str);
        }
        WebSocketSession webSocketSession2 = new WebSocketSession(str);
        this.f9044a.put(str, webSocketSession2);
        return webSocketSession2;
    }

    public synchronized WebSocketSession getSocketSession(String str) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.d("AriverWebSocket:RVWebSocketManager", "getSocketSession: socketId is empty.");
            return null;
        }
        return this.f9044a.get(str);
    }
}
