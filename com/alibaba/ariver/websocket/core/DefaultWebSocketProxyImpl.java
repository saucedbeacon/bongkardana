package com.alibaba.ariver.websocket.core;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.websocket.proxy.RVWebSocketProxy;
import java.net.URI;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class DefaultWebSocketProxyImpl implements RVWebSocketProxy {
    public RVWebSocketClient createWebSocketClient(String str, String str2, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        URI uri;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1346332212, oncanceled);
            onCancelLoad.getMin(1346332212, oncanceled);
        }
        try {
            uri = URI.create(str2);
        } catch (Exception e) {
            RVLogger.e("AriverWebSocket:DefaultWebSocketProxyImpl", "URI create error! url: ".concat(String.valueOf(str2)), e);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return new DefaultRVWebSocketClient(str, uri, map, rVWebSocketCallback);
    }
}
