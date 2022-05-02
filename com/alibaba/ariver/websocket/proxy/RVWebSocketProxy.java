package com.alibaba.ariver.websocket.proxy;

import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.websocket.core.RVWebSocketCallback;
import com.alibaba.ariver.websocket.core.RVWebSocketClient;
import java.util.Map;

public interface RVWebSocketProxy extends Proxiable {
    RVWebSocketClient createWebSocketClient(String str, String str2, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback);
}
