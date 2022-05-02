package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.NotificationCenterModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.notificationcenter.views.NotificationCenterFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {NotificationCenterModule.class, DeepLinkModule.class, PlayStoreReviewModules.class, CheckoutH5EventModule.class})
public interface WebSocketResultEnum {
    void setMin(NotificationCenterFragment notificationCenterFragment);
}
