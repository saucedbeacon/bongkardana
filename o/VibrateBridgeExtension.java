package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.onboarding.referral.VerifyReferralCodeFragment;
import javax.inject.Named;
import o.MemoryWarningBridgeExtension;

public final class VibrateBridgeExtension implements getBindingAdapter<VerifyReferralCodeFragment> {
    @InjectedFieldSignature("id.dana.onboarding.referral.VerifyReferralCodeFragment.verifyReferralCodePresenter")
    @Named("verifyReferralCodePresenter")
    public static void setMin(VerifyReferralCodeFragment verifyReferralCodeFragment, MemoryWarningBridgeExtension.length length) {
        verifyReferralCodeFragment.verifyReferralCodePresenter = length;
    }
}
