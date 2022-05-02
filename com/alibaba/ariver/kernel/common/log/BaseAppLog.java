package com.alibaba.ariver.kernel.common.log;

import android.text.TextUtils;

public class BaseAppLog {

    /* renamed from: a  reason: collision with root package name */
    private String f9142a = AppLogger.getBizType();
    private LogType b;
    private String c;
    private String d;
    private String e;

    /* access modifiers changed from: package-private */
    public String getBizType() {
        return this.f9142a;
    }

    /* access modifiers changed from: package-private */
    public LogType getLogType() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public String getParentId() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String getGroupId() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public String getState() {
        return this.e;
    }

    BaseAppLog(Builder builder) {
        this.b = builder.d;
        this.c = builder.f9143a;
        this.d = builder.b;
        this.e = builder.c;
    }

    /* access modifiers changed from: protected */
    public String baseInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9142a);
        sb.append(", ");
        sb.append(this.b.getTypeSting());
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(",");
        if (!TextUtils.isEmpty(this.e)) {
            sb.append(" ");
            sb.append(this.e);
        }
        return sb.toString();
    }

    public String toString() {
        return baseInfo();
    }

    public static abstract class Builder<T extends Builder<T>> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f9143a;
        /* access modifiers changed from: private */
        public String b = "-";
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public LogType d;

        public abstract BaseAppLog build();

        /* access modifiers changed from: protected */
        public abstract T getThis();

        public Builder(LogType logType) {
            this.d = logType;
        }

        public T setParentId(String str) {
            this.f9143a = str;
            return getThis();
        }

        public T setGroupId(String str) {
            this.b = str;
            return getThis();
        }

        public T setState(String str) {
            this.c = str;
            return getThis();
        }
    }
}
