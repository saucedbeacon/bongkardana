package com.alipay.android.phone.mobilesdk.socketcraft.util;

import com.alipay.android.phone.mobilesdk.socketcraft.api.BasicWebSocketContext;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext;

public class WSContextUtil {
    public static final WebSocketContext getInnerWebSocketContext(WebSocketContext webSocketContext) {
        if (webSocketContext != null) {
            Object attribute = webSocketContext.getAttribute(WSContextConstant.INNER_WS_CONTEXT);
            if (attribute != null && (attribute instanceof WebSocketContext)) {
                return (WebSocketContext) attribute;
            }
            synchronized (WSContextUtil.class) {
                Object attribute2 = webSocketContext.getAttribute(WSContextConstant.INNER_WS_CONTEXT);
                if (attribute2 != null) {
                    if (attribute2 instanceof WebSocketContext) {
                        WebSocketContext webSocketContext2 = (WebSocketContext) attribute2;
                        return webSocketContext2;
                    }
                }
                BasicWebSocketContext basicWebSocketContext = new BasicWebSocketContext();
                webSocketContext.setAttribute(WSContextConstant.INNER_WS_CONTEXT, basicWebSocketContext);
                return basicWebSocketContext;
            }
        }
        throw new IllegalArgumentException("webSocketContext parameter can't null");
    }
}
