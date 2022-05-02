package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.notificationcenter.views.NotificationCenterFragment;
import o.BindView;
import o.GriverManifest;
import o.PdfImageSource;
import o.R;
import o.getCarrierName;
import o.getDuration;
import o.getRunningAnimators;

public final class ContactUtils implements GriverManifest.AnonymousClass22.length {
    private final NotificationCenterFragment setMax;

    public ContactUtils(NotificationCenterFragment notificationCenterFragment) {
        this.setMax = notificationCenterFragment;
    }

    public final void setMin(boolean z) {
        this.setMax.getMin = z;
    }

    /* renamed from: o.ContactUtils$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<NotificationCenterFragment> {
        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.checkoutH5EventPresenter")
        public static void getMax(NotificationCenterFragment notificationCenterFragment, GriverManifest.AnonymousClass22.getMin getmin) {
            notificationCenterFragment.checkoutH5EventPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.playStoreReviewPresenter")
        public static void setMax(NotificationCenterFragment notificationCenterFragment, PdfImageSource.setMin setmin) {
            notificationCenterFragment.playStoreReviewPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.presenter")
        public static void length(NotificationCenterFragment notificationCenterFragment, getCarrierName.length length) {
            notificationCenterFragment.presenter = length;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.dynamicUrlWrapper")
        public static void setMin(NotificationCenterFragment notificationCenterFragment, getShortName getshortname) {
            notificationCenterFragment.dynamicUrlWrapper = getshortname;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.readDeepLinkPropertiesPresenter")
        public static void getMax(NotificationCenterFragment notificationCenterFragment, getDuration.length length) {
            notificationCenterFragment.readDeepLinkPropertiesPresenter = length;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.restoreUrlPresenter")
        public static void setMax(NotificationCenterFragment notificationCenterFragment, BindView.setMin setmin) {
            notificationCenterFragment.restoreUrlPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.scanQrPresenter")
        public static void setMax(NotificationCenterFragment notificationCenterFragment, R.id.getMax getmax) {
            notificationCenterFragment.scanQrPresenter = getmax;
        }

        @InjectedFieldSignature("id.dana.notificationcenter.views.NotificationCenterFragment.featurePresenter")
        public static void getMin(NotificationCenterFragment notificationCenterFragment, getRunningAnimators.setMax setmax) {
            notificationCenterFragment.featurePresenter = setmax;
        }
    }
}
