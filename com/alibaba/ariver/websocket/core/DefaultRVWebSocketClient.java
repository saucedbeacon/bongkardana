package com.alibaba.ariver.websocket.core;

import android.util.Base64;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alipay.android.phone.mobilesdk.socketcraft.api.BasicWebSocketContext;
import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.DefaultMonitorPrinter;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinterFactory;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;

public class DefaultRVWebSocketClient extends BaseWebSocketClient implements WebSocketCallback {
    private static boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    private DefaultWebSocketClient f10215a;

    public DefaultRVWebSocketClient(String str, URI uri, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        super(str, uri.toString(), map, rVWebSocketCallback);
        BasicWebSocketContext basicWebSocketContext = new BasicWebSocketContext();
        basicWebSocketContext.setAttribute(WSContextConstant.BIZ_UNIQUE_ID, str);
        this.f10215a = new DefaultWebSocketClient(uri, map, this, basicWebSocketContext);
    }

    /* access modifiers changed from: protected */
    public void onCreate() {
        if (!b) {
            MonitorPrinterFactory.setMonitorPrinter(new DefaultMonitorPrinter());
            b = true;
        }
    }

    public void connect() {
        this.f10215a.connect();
    }

    public void connectWithSSL() {
        this.f10215a.connectWithSSL();
    }

    public void send(byte[] bArr) {
        RVLogger.d("AriverWebSocket:NXWebSocketClientAdapter", "send bytes: ".concat(String.valueOf(bArr)));
        this.f10215a.send(ByteBuffer.wrap(Base64.decode(bArr, 2)));
    }

    public void send(String str) {
        RVLogger.d("AriverWebSocket:NXWebSocketClientAdapter", "send msg: ".concat(String.valueOf(str)));
        this.f10215a.send(str);
    }

    public void close() {
        if (this.f10215a.isClosing() || this.f10215a.isClosed()) {
            RVLogger.w("AriverWebSocket:NXWebSocketClientAdapter", "close but already closed!");
        } else {
            this.f10215a.close();
        }
    }

    public boolean isOpen() {
        return this.f10215a.isOpen();
    }

    public void onSocketOpen() {
        if (getCallback() != null) {
            getCallback().onSocketOpen();
        }
    }

    public void onSocketClose() {
        if (getCallback() != null) {
            getCallback().onSocketClose();
        }
    }

    public void onSocketMessage(ByteBuffer byteBuffer) {
        if (getCallback() != null) {
            getCallback().onSocketMessage(byteBuffer.array());
        }
    }

    public void onSocketMessage(String str) {
        if (getCallback() != null) {
            getCallback().onSocketMessage(str);
        }
    }

    public void onSocketError(String str) {
        if (getCallback() != null) {
            getCallback().onSocketError(WebSocketResultEnum.getResultEnumByWsMsg(str).getErrCode(), str);
        }
    }
}
