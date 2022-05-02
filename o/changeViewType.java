package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.service.ServicesActivity;
import o.GriverManifest;
import o.PdfImageSource;
import o.getDuration;
import o.getSelectedIndex;
import o.style;

public final class changeViewType implements getBindingAdapter<ServicesActivity> {
    @InjectedFieldSignature("id.dana.service.ServicesActivity.deviceInformationProvider")
    public static void setMax(ServicesActivity servicesActivity, getPerformanceTracker getperformancetracker) {
        servicesActivity.deviceInformationProvider = getperformancetracker;
    }

    @InjectedFieldSignature("id.dana.service.ServicesActivity.h5EventPresenter")
    public static void length(ServicesActivity servicesActivity, GriverManifest.AnonymousClass22.getMin getmin) {
        servicesActivity.h5EventPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.service.ServicesActivity.playStoreReviewPresenter")
    public static void setMax(ServicesActivity servicesActivity, PdfImageSource.setMin setmin) {
        servicesActivity.playStoreReviewPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.service.ServicesActivity.presenter")
    public static void length(ServicesActivity servicesActivity, style.length length) {
        servicesActivity.presenter = length;
    }

    @InjectedFieldSignature("id.dana.service.ServicesActivity.readLinkPropertiesPresenter")
    public static void setMin(ServicesActivity servicesActivity, getDuration.length length) {
        servicesActivity.readLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.service.ServicesActivity.onBoardingServicePresenter")
    public static void setMin(ServicesActivity servicesActivity, getSelectedIndex.length length) {
        servicesActivity.onBoardingServicePresenter = length;
    }
}
