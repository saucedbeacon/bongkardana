package o;

import dagger.Component;
import id.dana.contract.account.FirstTimeModule;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.contract.homeinfo.HomeRevampModule;
import id.dana.contract.notification.PushNotificationModule;
import id.dana.contract.promotion.InterstitialPromotionBannerModule;
import id.dana.contract.user.GetPocketInfoModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.QrisCrossBorderModule;
import id.dana.home.tab.HomeTabFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {HomeRevampModule.class, FirstTimeModule.class, HomeInfoModule.class, GetPocketInfoModule.class, InterstitialPromotionBannerModule.class, DeepLinkModule.class, PushNotificationModule.class, PlayStoreReviewModules.class, CheckoutH5EventModule.class, GlobalNetworkModule.class, QrisCrossBorderModule.class})
public interface getRef {
    void length(HomeTabFragment homeTabFragment);
}
