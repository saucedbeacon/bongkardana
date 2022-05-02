package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.homereferral.HomeReferralView;
import o.getBackgroundExecutor;
import o.getDuration;
import o.onAction;

public final class APTakePicRsp implements getBindingAdapter<HomeReferralView> {
    @InjectedFieldSignature("id.dana.richview.homereferral.HomeReferralView.readDeepLinkPropertiesPresenter")
    public static void length(HomeReferralView homeReferralView, getDuration.length length) {
        homeReferralView.readDeepLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.richview.homereferral.HomeReferralView.missionSummaryPresenter")
    public static void getMin(HomeReferralView homeReferralView, getBackgroundExecutor.setMin setmin) {
        homeReferralView.missionSummaryPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.richview.homereferral.HomeReferralView.presenter")
    public static void getMax(HomeReferralView homeReferralView, onAction.setMax setmax) {
        homeReferralView.presenter = setmax;
    }
}
