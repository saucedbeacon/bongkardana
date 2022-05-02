package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;

public class WorkerLog extends BaseAppLog {
    public static final String WORKER_LOG_STATE_ERROR = "error";
    public static final String WORKER_LOG_STATE_START = "start";
    public static final String WORKER_LOG_STATE_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private String f10103a;
    private String b;
    private String c;
    private Integer d;

    private WorkerLog(Builder builder) {
        super(builder);
        this.f10103a = builder.f10104a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r0 = r7.getState()
            int r1 = r0.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x002f
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r1 == r2) goto L_0x0025
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "start"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "success"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            java.lang.String r1 = " "
            r2 = 3
            if (r0 == 0) goto L_0x0080
            if (r0 == r5) goto L_0x0080
            if (r0 == r4) goto L_0x0048
            java.lang.String r0 = super.toString()
            goto L_0x00ae
        L_0x0048:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = r7.baseInfo()
            r0[r3] = r6
            java.lang.String r3 = r7.f10103a
            r0[r5] = r3
            java.lang.Integer r3 = r7.d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0[r4] = r3
            java.lang.String r3 = r7.b
            r0[r2] = r3
            java.lang.String r2 = "%s %s(%s) %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = r7.c
            if (r2 == 0) goto L_0x00ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r7.c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x00ae
        L_0x0080:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r7.baseInfo()
            r0[r3] = r2
            java.lang.String r2 = r7.f10103a
            r0[r5] = r2
            java.lang.String r2 = r7.b
            r0[r4] = r2
            java.lang.String r2 = "%s %s %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = r7.c
            if (r2 == 0) goto L_0x00ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r7.c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.log.WorkerLog.toString():java.lang.String");
    }

    public String getData() {
        return this.c;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f10104a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public Integer d;

        /* access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.WORKER);
        }

        public Builder setAppId(String str) {
            this.f10104a = str;
            return getThis();
        }

        public Builder setTag(String str) {
            this.b = str;
            return getThis();
        }

        public Builder setDesc(String str) {
            this.c = str;
            return getThis();
        }

        public Builder setErrCode(int i) {
            this.d = Integer.valueOf(i);
            return getThis();
        }

        public BaseAppLog build() {
            return new WorkerLog(this);
        }
    }
}
