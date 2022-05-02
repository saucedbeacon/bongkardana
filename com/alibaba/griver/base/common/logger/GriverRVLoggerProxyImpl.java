package com.alibaba.griver.base.common.logger;

import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class GriverRVLoggerProxyImpl implements RVLogger.Proxy {
    public void debug(String str, String str2) {
        GriverLogger.debug(str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        GriverLogger.e(str, str2, th);
    }

    public void w(String str, String str2, Throwable th) {
        GriverLogger.w(str, str2, th);
    }

    public void d(String str, String str2) {
        GriverLogger.d(str, str2);
    }
}
