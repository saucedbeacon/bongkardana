package com.facebook.litho;

import o.query;

public class ComponentsReporter {
    private static volatile setMin setMin;

    public enum LogLevel {
        WARNING,
        ERROR,
        FATAL
    }

    public interface setMin {
        void setMin(LogLevel logLevel, String str);
    }

    private ComponentsReporter() {
    }

    public static void setMax(LogLevel logLevel, String str) {
        getMax().setMin(logLevel, str);
    }

    private static setMin getMax() {
        if (setMin == null) {
            synchronized (ComponentsReporter.class) {
                if (setMin == null) {
                    setMin = new query();
                }
            }
        }
        return setMin;
    }
}
