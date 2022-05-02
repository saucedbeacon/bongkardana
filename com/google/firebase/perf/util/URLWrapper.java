package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLWrapper {
    private final URL url;

    public URLWrapper(URL url2) {
        this.url = url2;
    }

    public URLConnection openConnection() throws IOException {
        return this.url.openConnection();
    }

    public String toString() {
        return this.url.toString();
    }
}
