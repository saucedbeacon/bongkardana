package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.DanaContactModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.KycAmlEddModule;
import id.dana.di.modules.KycRenewalModule;
import id.dana.di.modules.MiniProgramModule;
import id.dana.di.modules.PaymentSettingModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.ReferralDialogModule;
import id.dana.di.modules.TncSummaryModules;
import id.dana.di.modules.UserConfigModules;
import id.dana.home.HomeTabActivity;
import id.dana.twilio.onboarding.TwilioIntroductionModule;
import id.dana.twilio.twiliodialog.TwilioDialogModule;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PlayStoreReviewModules.class, DanaContactModule.class, TncSummaryModules.class, UserConfigModules.class, DeepLinkModule.class, KycRenewalModule.class, KycAmlEddModule.class, FaceAuthPopUpConsultationModule.class, GlobalNetworkModule.class, TwilioDialogModule.class, TwilioIntroductionModule.class, MiniProgramModule.class, ReferralDialogModule.class, PaymentSettingModule.class})
public interface onAppLoad {
    void setMax(HomeTabActivity homeTabActivity);
}
