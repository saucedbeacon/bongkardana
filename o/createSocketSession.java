package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.notification.NotificationActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DeepLinkModule.class})
public interface createSocketSession {
    void getMin(NotificationActivity notificationActivity);
}
