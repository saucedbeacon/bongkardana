package com.alibaba.ariver.engine.common.track;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JsApiStatTrackStore {

    /* renamed from: a  reason: collision with root package name */
    private String f10062a = "";
    private long b;
    private int c;
    private boolean d;
    public final Map<String, Object> jsapiStatMap = new ConcurrentHashMap();

    public static class TinyAppJsApiStatInfo {
        public long callTs;
        public long invokeTs;
        public String name;

        public TinyAppJsApiStatInfo(String str, long j, long j2) {
            this.name = str;
            this.callTs = j;
            this.invokeTs = j2;
        }
    }

    public void clear() {
        this.f10062a = "";
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.jsapiStatMap.clear();
    }

    public void appendJsApiDetail4TinyWithT2(String str, long j, long j2, long j3, long j4) {
        long j5 = j3;
        try {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                this.b = j5;
                sb.append("basetime1:");
                sb.append(j5);
                sb.append("|");
                sb.append("basetime2:");
                sb.append(j4);
                sb.append("|");
            }
            long j6 = j5 - this.b;
            if (j6 <= 5000) {
                if (this.c < 100) {
                    String str2 = str;
                    sb.append(str);
                    sb.append("_");
                    sb.append(j6);
                    sb.append(":");
                    long j7 = j;
                    sb.append(j);
                    sb.append("_");
                    sb.append(j2);
                    sb.append("|");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f10062a);
                    sb2.append(sb.toString());
                    this.f10062a = sb2.toString();
                    this.c++;
                } else if (!this.f10062a.endsWith("__error_too_long__:0")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f10062a);
                    sb3.append("__error_too_long__:0");
                    this.f10062a = sb3.toString();
                }
            }
        } catch (Throwable th) {
            RVLogger.e("JsApiStatTrackStore", "appendJsApiDetail4TinyWithT2 exception", th);
        }
    }

    public String getJsApiDetail4TinyWithT2() {
        if (this.f10062a.length() <= 0 || !this.f10062a.endsWith("|")) {
            return this.f10062a;
        }
        String str = this.f10062a;
        return str.substring(0, str.length() - 1);
    }

    public void setJsApiDetail4TinyWithinT2Uploaded(boolean z) {
        this.d = z;
    }

    public boolean isJsApiDetail4TinyWithinT2Uploaded() {
        return this.d;
    }
}
