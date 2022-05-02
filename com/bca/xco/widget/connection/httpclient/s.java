package com.bca.xco.widget.connection.httpclient;

import java.io.IOException;

public enum s {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String e;

    private s(String str) {
        this.e = str;
    }

    public static s a(String str) {
        if (str.equals(HTTP_1_0.e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.e)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.e)) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    public final String toString() {
        return this.e;
    }
}
