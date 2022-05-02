package com.alibaba.griver.api.appinfo;

public enum AppType {
    UNKNOWN,
    WEB_H5,
    WEB_TINY,
    WEB_TINY_INNER,
    NATIVE_RN,
    NATIVE_CUBE,
    TINY_GAME;

    public static AppType parse(String str) {
        try {
            return valueOf(str);
        } catch (Throwable unused) {
            return UNKNOWN;
        }
    }

    public final boolean isTiny() {
        return this == WEB_TINY || this == WEB_TINY_INNER || this == NATIVE_CUBE || this == TINY_GAME;
    }

    public final boolean isWeb() {
        return this == WEB_H5 || this == WEB_TINY || this == WEB_TINY_INNER;
    }
}
