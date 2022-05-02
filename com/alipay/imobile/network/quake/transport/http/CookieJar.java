package com.alipay.imobile.network.quake.transport.http;

import java.net.URL;
import java.util.Collections;
import java.util.List;

public interface CookieJar {
    public static final CookieJar NO_COOKIES = new CookieJar() {
        public final List<Cookie> loadForRequest(URL url) {
            return Collections.emptyList();
        }

        public final void saveFromResponse(URL url, List<Cookie> list) {
        }
    };

    List<Cookie> loadForRequest(URL url);

    void saveFromResponse(URL url, List<Cookie> list);
}
