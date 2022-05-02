package com.alibaba.ariver.websocket.core;

import java.util.Map;

public abstract class BaseWebSocketClient implements RVWebSocketClient {

    /* renamed from: a  reason: collision with root package name */
    private String f10214a;
    private String b;
    private Map<String, String> c;
    private RVWebSocketCallback d;

    /* access modifiers changed from: protected */
    public void onCreate() {
    }

    public BaseWebSocketClient(String str, String str2, Map<String, String> map, RVWebSocketCallback rVWebSocketCallback) {
        onCreate();
        this.f10214a = str;
        this.b = str2;
        this.c = map;
        this.d = rVWebSocketCallback;
    }

    public String getId() {
        return this.f10214a;
    }

    public String getUrl() {
        return this.b;
    }

    public Map<String, String> getHeaders() {
        return this.c;
    }

    public RVWebSocketCallback getCallback() {
        return this.d;
    }
}
