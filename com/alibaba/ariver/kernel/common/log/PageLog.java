package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PageLog extends BaseAppLog {
    public static final String PAGE_LOG_STATE_FAIL = "fail";
    public static final String PAGE_LOG_STATE_FINISH = "finish";
    public static final String PAGE_LOG_STATE_START = "start";

    /* renamed from: a  reason: collision with root package name */
    private String f10101a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private PageSource g;

    private PageLog(Builder builder) {
        super(builder);
        this.f10101a = builder.b;
        this.b = builder.f10102a;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.g = builder.g;
        this.f = builder.f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.String r0 = r5.baseInfo()
            java.lang.String r1 = r5.getState()
            int r2 = r1.hashCode()
            r3 = -1274442605(0xffffffffb4098c93, float:-1.281026E-7)
            r4 = 1
            if (r2 == r3) goto L_0x0031
            r3 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r2 == r3) goto L_0x0027
            r3 = 109757538(0x68ac462, float:5.219839E-35)
            if (r2 == r3) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r2 = "start"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 0
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "fail"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 2
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "finish"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            java.lang.String r2 = " "
            java.lang.String r3 = ", "
            if (r1 == 0) goto L_0x0086
            if (r1 == r4) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.f10101a
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r5.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0061:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.f10101a
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r5.d
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0086:
            com.alibaba.ariver.kernel.common.log.PageSource r1 = r5.g
            if (r1 == 0) goto L_0x00d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.f10101a
            r1.append(r0)
            java.lang.String r0 = ", source:"
            r1.append(r0)
            com.alibaba.ariver.kernel.common.log.PageSource r0 = r5.g
            com.alibaba.ariver.kernel.common.log.PageSource$SourceType r0 = r0.sourceType
            java.lang.String r0 = r0.getRaw()
            r1.append(r0)
            java.lang.String r0 = " from "
            r1.append(r0)
            com.alibaba.ariver.kernel.common.log.PageSource r0 = r5.g
            java.lang.String r0 = r0.sourceDesc
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r5.e
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r5.f
            r1.append(r0)
            r1.append(r3)
            com.alibaba.ariver.kernel.common.log.PageSource r0 = r5.g
            java.lang.String r0 = r0.sourcePageAppLogToken
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00f1
        L_0x00d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r5.f10101a
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r5.e
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00f1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.log.PageLog.toString():java.lang.String");
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f10102a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public String d;
        /* access modifiers changed from: private */
        public String e;
        /* access modifiers changed from: private */
        public String f;
        /* access modifiers changed from: private */
        public PageSource g;

        /* access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.PAGE);
        }

        public Builder setUrl(String str) {
            this.b = str;
            return getThis();
        }

        public Builder setErrMsg(String str) {
            this.f10102a = str;
            return getThis();
        }

        public Builder setRefer(String str) {
            this.c = str;
            return getThis();
        }

        public Builder setTitle(String str) {
            this.d = str;
            return getThis();
        }

        public Builder setToken(String str) {
            this.e = str;
            return getThis();
        }

        public Builder setPageSource(PageSource pageSource) {
            this.g = pageSource;
            return getThis();
        }

        public Builder setAppStartSessionToken(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1762548761, oncanceled);
                onCancelLoad.getMin(-1762548761, oncanceled);
            }
            this.f = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new PageLog(this);
        }
    }
}
