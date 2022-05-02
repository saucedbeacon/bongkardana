package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;

public class EventLog extends BaseAppLog {

    /* renamed from: a  reason: collision with root package name */
    private String f9144a;
    private String b;

    private EventLog(Builder builder) {
        super(builder);
        this.f9144a = builder.f9145a;
        this.b = builder.b;
    }

    public String toString() {
        String baseInfo = baseInfo();
        StringBuilder sb = new StringBuilder();
        sb.append(baseInfo);
        sb.append(" ");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.f9144a);
        return sb.toString();
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f9145a = "";
        /* access modifiers changed from: private */
        public String b;

        /* access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.EVENT);
        }

        public Builder setData(String str) {
            this.f9145a = str;
            return getThis();
        }

        public Builder setEventName(String str) {
            this.b = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new EventLog(this);
        }
    }
}
