package com.alipay.androidinter.safepaylog.api;

import java.util.concurrent.ConcurrentLinkedQueue;

public class LogItem {
    public final ConcurrentLinkedQueue<TemplateInfo> mTemplateInfos = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<TracerInfo> mTraceInfos = new ConcurrentLinkedQueue<>();

    public enum TracerType {
        COUNT,
        EX,
        PERF
    }

    public static class TracerInfo {
        public String mCode;
        public String mMsg;
        public TracerType mTracerType;
        public String mType;

        public TracerInfo(TracerType tracerType, String str, String str2, String str3) {
            this.mTracerType = tracerType;
            this.mType = str;
            this.mCode = str2;
            this.mMsg = str3;
        }
    }

    public static class TemplateInfo {
        public String mNetType;
        public String mUpdateResult;
        public String mUpdateTime;
        public String mUpdateType;
        public String mWinName;

        public TemplateInfo(String str, String str2, String str3, String str4, String str5) {
            this.mWinName = str;
            this.mNetType = str2;
            this.mUpdateType = str3;
            this.mUpdateResult = str4;
            this.mUpdateTime = str5;
        }
    }
}
