package com.alibaba.griver.base.common.logger;

import com.alibaba.griver.api.common.logger.GriverLoggerProxy;
import com.alibaba.griver.base.common.env.GriverEnv;

public class GriverLogcatLogger implements GriverLoggerProxy {
    public boolean isEnable() {
        return GriverEnv.getDebuggable() && GriverEnv.isDebuggable();
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Thread.currentThread().getName());
        sb.append("-");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public void debug(String str, String str2) {
        a(str2);
    }

    public void d(String str, String str2) {
        a(str2);
    }

    public void w(String str, String str2) {
        a(str2);
    }

    public void w(String str, String str2, Throwable th) {
        a(str2);
    }

    public void e(String str, String str2) {
        a(str2);
    }

    public void e(String str, String str2, Throwable th) {
        a(str2);
    }
}
