package com.alibaba.griver.api.common.logger;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface GriverLoggerProxy extends Proxiable {
    void d(String str, String str2);

    void debug(String str, String str2);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    boolean isEnable();

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);
}
