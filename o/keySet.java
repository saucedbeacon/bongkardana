package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.ImmutableCollection;

public interface keySet {
    @OperationType("alipayplus.mobilewallet.referral.tracker")
    @SignCheck
    ImmutableCollection.AnonymousClass1 getReferralTracker(ImmutableList immutableList);
}
