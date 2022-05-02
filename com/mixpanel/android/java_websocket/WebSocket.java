package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;

public interface WebSocket {

    public enum READYSTATE {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public enum Role {
        CLIENT,
        SERVER
    }

    void getMax(Framedata framedata);

    InetSocketAddress length();
}
