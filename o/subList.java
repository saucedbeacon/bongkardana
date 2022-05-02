package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.ReferralModule;
import id.dana.onboarding.referral.VerifyReferralCodeFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ReferralModule.class})
public interface subList {
    void setMin(VerifyReferralCodeFragment verifyReferralCodeFragment);
}
