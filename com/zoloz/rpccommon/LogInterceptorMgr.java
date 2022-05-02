package com.zoloz.rpccommon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LogInterceptorMgr implements LogInterceptor {
    private List<LogInterceptor> mInterceptors;

    public static LogInterceptorMgr get() {
        return Holder.MANAGER;
    }

    private LogInterceptorMgr() {
    }

    public void addInterceptor(LogInterceptor logInterceptor) {
        if (this.mInterceptors == null) {
            this.mInterceptors = new ArrayList();
        }
        this.mInterceptors.add(logInterceptor);
    }

    public void removeInterceptor(LogInterceptor logInterceptor) {
        List<LogInterceptor> list = this.mInterceptors;
        if (list != null) {
            list.remove(logInterceptor);
        }
    }

    public void addEvent(String str, HashMap<String, String> hashMap) {
        List<LogInterceptor> list = this.mInterceptors;
        if (list != null) {
            for (LogInterceptor addEvent : list) {
                addEvent.addEvent(str, hashMap);
            }
        }
    }

    static class Holder {
        static final LogInterceptorMgr MANAGER = new LogInterceptorMgr();

        Holder() {
        }
    }
}
