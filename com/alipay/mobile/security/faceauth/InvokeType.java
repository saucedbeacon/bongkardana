package com.alipay.mobile.security.faceauth;

import com.alipay.zoloz.toyger.blob.BlobStatic;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;

public enum InvokeType {
    NETWORK("network"),
    SERVER_FAIL("server_fail"),
    INTERRUPT("interrupt"),
    TIMEOUT(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT),
    NORMAL("normal"),
    FAIL("fail"),
    MONITOR(BlobStatic.INVTP_TYPE_MONITOR),
    LIVENESS_FAILED(BlobStatic.INVTP_TYPE_LIVENESS_FAILED),
    ASYNC_UPLOAD(BlobStatic.INVTP_TYPE_ASYNC_UPLOAD),
    VIDEO("video");
    
    public String value;

    private InvokeType(String str) {
        this.value = str;
    }
}
