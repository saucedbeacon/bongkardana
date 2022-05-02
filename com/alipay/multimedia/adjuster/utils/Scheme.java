package com.alipay.multimedia.adjuster.utils;

import id.dana.contract.payasset.SceneType;
import java.util.Locale;

public enum Scheme {
    HTTP("http"),
    HTTPS("https"),
    FILE("file"),
    CONTENT("content"),
    ASSETS(SceneType.ASSETS),
    DRAWABLE("drawable"),
    UNKNOWN("");
    
    private String scheme;
    private String uriPrefix;

    private Scheme(String str) {
        this.scheme = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("://");
        this.uriPrefix = sb.toString();
    }

    public static Scheme ofUri(String str) {
        if (str != null) {
            for (Scheme scheme2 : values()) {
                if (scheme2.belongsTo(str)) {
                    return scheme2;
                }
            }
        }
        return UNKNOWN;
    }

    private boolean belongsTo(String str) {
        return str.toLowerCase(Locale.US).startsWith(this.uriPrefix);
    }

    public final String wrap(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.uriPrefix);
        sb.append(str);
        return sb.toString();
    }

    public final String crop(String str) {
        if (belongsTo(str)) {
            return str.substring(this.uriPrefix.length());
        }
        throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[]{str, this.scheme}));
    }
}
