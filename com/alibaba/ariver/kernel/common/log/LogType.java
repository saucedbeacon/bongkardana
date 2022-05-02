package com.alibaba.ariver.kernel.common.log;

import com.google.common.net.HttpHeaders;

public enum LogType {
    CONNECTION(HttpHeaders.CONNECTION),
    API("API"),
    EVENT("Event"),
    PAGE("Page"),
    WORKER("Worker"),
    APP("Application");
    
    private String mLogType;

    private LogType(String str) {
        this.mLogType = str;
    }

    public final String getTypeSting() {
        return this.mLogType;
    }
}
