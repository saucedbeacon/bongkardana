package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.referral.MyReferralDetailActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DeepLinkModule.class, ReferralTrackerModule.class})
public interface retainAll {
    void getMin(MyReferralDetailActivity myReferralDetailActivity);
}
