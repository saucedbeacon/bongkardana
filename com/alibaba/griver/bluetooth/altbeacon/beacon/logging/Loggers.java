package com.alibaba.griver.bluetooth.altbeacon.beacon.logging;

public final class Loggers {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f10253a = new EmptyLogger();
    private static final Logger b = new VerboseAndroidLogger();
    private static final Logger c = new InfoAndroidLogger();
    private static final Logger d = new WarningAndroidLogger();

    private Loggers() {
    }

    public static Logger empty() {
        return f10253a;
    }

    public static Logger verboseLogger() {
        return b;
    }

    public static Logger infoLogger() {
        return c;
    }

    public static Logger warningLogger() {
        return d;
    }
}
