package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.notification.NotificationActivity;
import o.BindView;
import o.R;
import o.getDuration;
import o.getRunningAnimators;

public final class hexStringToByteArray implements getBindingAdapter<NotificationActivity> {
    @InjectedFieldSignature("id.dana.notification.NotificationActivity.readDeepLinkPropertiesPresenter")
    public static void setMax(NotificationActivity notificationActivity, getDuration.length length) {
        notificationActivity.readDeepLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.notification.NotificationActivity.restoreUrlPresenter")
    public static void setMin(NotificationActivity notificationActivity, BindView.setMin setmin) {
        notificationActivity.restoreUrlPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.notification.NotificationActivity.scanQrPresenter")
    public static void length(NotificationActivity notificationActivity, R.id.getMax getmax) {
        notificationActivity.scanQrPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.notification.NotificationActivity.featurePresenter")
    public static void setMax(NotificationActivity notificationActivity, getRunningAnimators.setMax setmax) {
        notificationActivity.featurePresenter = setmax;
    }
}
