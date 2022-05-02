package com.twilio.verify.models;

import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/twilio/verify/models/ChallengeStatus;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Pending", "Approved", "Denied", "Expired", "verify_release"}, k = 1, mv = {1, 1, 16})
public enum ChallengeStatus {
    Pending(F2FPayConstants.OrderStatus.PENDING),
    Approved("approved"),
    Denied(DanaLogConstants.PushPermissionStatus.PUSH_DISABLED),
    Expired("expired");
    
    @NotNull
    private final String value;

    private ChallengeStatus(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
