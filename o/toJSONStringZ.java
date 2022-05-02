package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PushNotificationModule;
import id.dana.notification.DanaFirebaseMessagingService;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PushNotificationModule.class})
public interface toJSONStringZ {
    void getMax(DanaFirebaseMessagingService danaFirebaseMessagingService);
}
