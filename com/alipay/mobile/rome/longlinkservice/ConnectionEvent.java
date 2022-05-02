package com.alipay.mobile.rome.longlinkservice;

public class ConnectionEvent {

    /* renamed from: a  reason: collision with root package name */
    private Type f9402a;
    private Object b;

    public enum Type {
        Unknown,
        Connecting,
        Connected,
        ConnectFailed,
        Disconnected
    }

    public ConnectionEvent(Type type) {
        this.f9402a = type;
        if (type == null) {
            this.f9402a = Type.ConnectFailed;
        }
    }

    public ConnectionEvent(Type type, Object obj) {
        this.f9402a = type;
        this.b = obj;
        if (type == null) {
            this.f9402a = Type.ConnectFailed;
        }
    }

    public Type getEventType() {
        return this.f9402a;
    }

    public Object getExtras() {
        return this.b;
    }

    public boolean isConnecting() {
        return this.f9402a == Type.Connecting;
    }

    public boolean isConnected() {
        return this.f9402a == Type.Connected;
    }

    public boolean isConnectFailed() {
        return this.f9402a == Type.ConnectFailed;
    }

    public boolean isDisconnected() {
        return this.f9402a == Type.Disconnected;
    }

    public String getConnectionStateName() {
        return this.f9402a.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionEvent{mEventType=");
        sb.append(this.f9402a);
        sb.append(", connectionStateName='");
        sb.append(getConnectionStateName());
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
