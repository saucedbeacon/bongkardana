package com.alipay.android.phone.mobilesdk.socketcraft.api;

import java.util.HashMap;
import java.util.Map;

public class BasicWebSocketContext implements WebSocketContext {
    private Map map;
    private final WebSocketContext parentContext;

    public BasicWebSocketContext() {
        this((WebSocketContext) null);
    }

    public BasicWebSocketContext(WebSocketContext webSocketContext) {
        this.map = null;
        this.parentContext = webSocketContext;
    }

    public Object getAttribute(String str) {
        WebSocketContext webSocketContext;
        if (str != null) {
            Object obj = null;
            Map map2 = this.map;
            if (map2 != null) {
                obj = map2.get(str);
            }
            if (obj != null || (webSocketContext = this.parentContext) == null) {
                return obj;
            }
            return webSocketContext.getAttribute(str);
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public void setAttribute(String str, Object obj) {
        if (str != null) {
            if (this.map == null) {
                this.map = new HashMap();
            }
            this.map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public Object removeAttribute(String str) {
        if (str != null) {
            Map map2 = this.map;
            if (map2 != null) {
                return map2.remove(str);
            }
            return null;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public void clear() {
        Map map2 = this.map;
        if (map2 != null) {
            map2.clear();
        }
        WebSocketContext webSocketContext = this.parentContext;
        if (webSocketContext != null) {
            webSocketContext.clear();
        }
    }
}
