package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.RVProxy;

public class AppLogger {
    private static AppLoggerProxy a() {
        return (AppLoggerProxy) RVProxy.get(AppLoggerProxy.class);
    }

    static String getBizType() {
        return a().getBizType();
    }

    public static void log(BaseAppLog baseAppLog) {
        a().log(baseAppLog);
    }
}
