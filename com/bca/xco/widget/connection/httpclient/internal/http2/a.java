package com.bca.xco.widget.connection.httpclient.internal.http2;

public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    
    public final int g;

    private a(int i) {
        this.g = i;
    }

    public static a a(int i) {
        for (a aVar : values()) {
            if (aVar.g == i) {
                return aVar;
            }
        }
        return null;
    }
}
