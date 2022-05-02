package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.notification.DanaFirebaseMessagingService;
import o.TinyAppHostApduService;

public final class hasFeatureHCE implements getBindingAdapter<DanaFirebaseMessagingService> {
    @InjectedFieldSignature("id.dana.notification.DanaFirebaseMessagingService.pushNotificationPresenter")
    public static void setMax(DanaFirebaseMessagingService danaFirebaseMessagingService, isDecorView isdecorview) {
        danaFirebaseMessagingService.pushNotificationPresenter = isdecorview;
    }

    @InjectedFieldSignature("id.dana.notification.DanaFirebaseMessagingService.notificationDirectorFactory")
    public static void setMax(DanaFirebaseMessagingService danaFirebaseMessagingService, TinyAppHostApduService.AnonymousClass1 r1) {
        danaFirebaseMessagingService.notificationDirectorFactory = r1;
    }
}
