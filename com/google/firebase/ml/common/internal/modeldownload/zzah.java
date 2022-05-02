package com.google.firebase.ml.common.internal.modeldownload;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public final class zzah {
    private final URL url;

    zzah(String str) throws MalformedURLException {
        this.url = new URL(str);
    }

    public final URLConnection openConnection() throws IOException {
        return this.url.openConnection();
    }
}
