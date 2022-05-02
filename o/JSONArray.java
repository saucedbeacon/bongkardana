package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney_v2.landing.di.module.SendMoneyLandingModule;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientActivityModule.class, BottomSheetOnBoardingModule.class, DeepLinkModule.class, SendMoneyLandingModule.class, BillerX2BModule.class})
public interface JSONArray {
    void length(RecipientActivity recipientActivity);
}
