package com.alibaba.ariver.remotedebug.datachannel;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.datachannel.DataChannel;
import com.alibaba.ariver.websocket.core.RVWebSocketCallback;
import com.alibaba.ariver.websocket.core.RVWebSocketManager;
import com.alibaba.ariver.websocket.core.WebSocketSession;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public class c extends a implements RVWebSocketCallback {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10145a;
    private String b;
    private WebSocketSession c;

    public c(String str, DataChannel.DataStatusChangedListener dataStatusChangedListener) {
        super(str, dataStatusChangedListener);
        this.b = RDConstant.REMOTE_DEBUG_ID.concat(String.valueOf(str));
    }

    public void connect(String str, Map<String, String> map, JSONObject jSONObject) {
        RVLogger.d("AriverRemoteDebug:WebSocketDataChannel", "connect...  url: ".concat(String.valueOf(str)));
        if (this.f10145a) {
            RVLogger.d("AriverRemoteDebug:WebSocketDataChannel", "connect...  connecting! url: ".concat(String.valueOf(str)));
            return;
        }
        this.f10145a = true;
        WebSocketSession createSocketSession = RVWebSocketManager.getInstance().createSocketSession(this.b);
        this.c = createSocketSession;
        createSocketSession.startSocketConnect(str, map, this);
    }

    public boolean send(String str) {
        if (!this.f10145a) {
            RVLogger.d("AriverRemoteDebug:WebSocketDataChannel", "send... not connecting!");
            return false;
        }
        RVLogger.d("AriverRemoteDebug:WebSocketDataChannel", "send...  msg: ".concat(String.valueOf(str)));
        WebSocketSession webSocketSession = this.c;
        if (webSocketSession == null) {
            return false;
        }
        webSocketSession.sendMessage(str);
        return true;
    }

    public void close(int i, String str) {
        WebSocketSession webSocketSession = this.c;
        if (webSocketSession != null) {
            webSocketSession.closeSocketConnect(this.b);
        }
        this.f10145a = false;
    }

    public void onSocketOpen() {
        if (a() != null) {
            a().onConnectSuccess(b());
        }
    }

    public void onSocketClose() {
        if (a() != null) {
            a().onConnectClosed(b());
        }
    }

    public void onSocketMessage(byte[] bArr) {
        if (a() != null) {
            a().recv(bArr);
        }
    }

    public void onSocketMessage(String str) {
        if (a() != null) {
            a().recv(str);
        }
    }

    public void onSocketError(int i, String str) {
        if (a() != null) {
            a().onConnectError(b(), i, str);
        }
    }
}
