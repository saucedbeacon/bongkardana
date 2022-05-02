package com.facebook.stetho.inspector;

public class MismatchedResponseException extends MessageHandlingException {
    public long mRequestId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MismatchedResponseException(long r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response for request id "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", but no such request is pending"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0)
            r2.mRequestId = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.MismatchedResponseException.<init>(long):void");
    }

    public long getRequestId() {
        return this.mRequestId;
    }
}
