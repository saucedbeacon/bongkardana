package com.mixpanel.android.java_websocket.framing;

import java.nio.ByteBuffer;

public interface Framedata {

    public enum Opcode {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    ByteBuffer getMin();

    boolean length();

    boolean setMax();

    Opcode toFloatRange();
}
