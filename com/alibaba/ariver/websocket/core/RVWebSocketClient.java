package com.alibaba.ariver.websocket.core;

public interface RVWebSocketClient {
    void close();

    void connect();

    void connectWithSSL();

    boolean isOpen();

    void send(String str);

    void send(byte[] bArr);
}
