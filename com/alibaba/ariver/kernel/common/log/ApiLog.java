package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;

public class ApiLog extends BaseAppLog {
    public static final String API_LOG_STATE_ERROR = "error";
    public static final String API_LOG_STATE_START = "start";
    public static final String API_LOG_STATE_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private String f10097a;
    private String b;
    private Integer c;

    private ApiLog(Builder builder) {
        super(builder);
        this.f10097a = builder.b;
        this.b = builder.f10098a;
        this.c = builder.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.String r0 = r6.baseInfo()
            java.lang.String r1 = r6.getState()
            int r2 = r1.hashCode()
            r3 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0032
            r3 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r2 == r3) goto L_0x0028
            r3 = 109757538(0x68ac462, float:5.219839E-35)
            if (r2 == r3) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.lang.String r2 = "start"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 2
            goto L_0x003d
        L_0x0032:
            java.lang.String r2 = "success"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            java.lang.String r2 = " "
            if (r1 == 0) goto L_0x0077
            if (r1 == r5) goto L_0x0077
            if (r1 == r4) goto L_0x004a
            java.lang.String r0 = super.toString()
            return r0
        L_0x004a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "("
            r1.append(r0)
            java.lang.Integer r0 = r6.c
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = ") "
            r1.append(r0)
            java.lang.String r0 = r6.b
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r6.f10097a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0077:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r6.b
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r6.f10097a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.log.ApiLog.toString():java.lang.String");
    }

    public String getData() {
        return this.f10097a;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f10098a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public Integer c;

        /* access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.API);
        }

        public Builder setApiName(String str) {
            this.f10098a = str;
            return getThis();
        }

        public Builder setData(String str) {
            this.b = str;
            return getThis();
        }

        public Builder setErrCode(int i) {
            this.c = Integer.valueOf(i);
            return getThis();
        }

        public BaseAppLog build() {
            return new ApiLog(this);
        }
    }
}
