package com.alibaba.ariver.websocket.core;

public interface RVWebSocketCallback {
    void onSocketClose();

    void onSocketError(int i, String str);

    void onSocketMessage(String str);

    void onSocketMessage(byte[] bArr);

    void onSocketOpen();
}
