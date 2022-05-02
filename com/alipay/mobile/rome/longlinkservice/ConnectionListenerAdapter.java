package com.alipay.mobile.rome.longlinkservice;

public abstract class ConnectionListenerAdapter extends ConnectionListener {
    /* access modifiers changed from: protected */
    public void onConnectFailed(String str) {
    }

    /* access modifiers changed from: protected */
    public void onConnected(long j) {
    }

    /* access modifiers changed from: protected */
    public void onConnecting() {
    }

    /* access modifiers changed from: protected */
    public void onDisconnected() {
    }

    public void onConnectionStateChanged(ConnectionEvent connectionEvent) {
        if (connectionEvent.isConnecting()) {
            onConnecting();
        } else if (connectionEvent.isConnected()) {
            onConnected(((Long) connectionEvent.getExtras()).longValue());
        } else if (connectionEvent.isConnectFailed()) {
            onConnectFailed((String) connectionEvent.getExtras());
        } else if (connectionEvent.isDisconnected()) {
            onDisconnected();
        }
    }
}
