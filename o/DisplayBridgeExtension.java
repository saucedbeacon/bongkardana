package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.promoquest.activity.MissionDetailActivity;
import o.RxWorker;
import o.getDuration;
import o.getWorkerFactory;
import o.isUsed;
import o.setForegroundAsync;

public final class DisplayBridgeExtension implements getBindingAdapter<MissionDetailActivity> {
    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.readLinkPropertiesPresenter")
    public static void getMax(MissionDetailActivity missionDetailActivity, getDuration.length length) {
        missionDetailActivity.readLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.trackPresenter")
    public static void setMin(MissionDetailActivity missionDetailActivity, getWorkerFactory.setMax setmax) {
        missionDetailActivity.trackPresenter = setmax;
    }

    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.redeemQuestPresenter")
    public static void getMax(MissionDetailActivity missionDetailActivity, RxWorker.setMin setmin) {
        missionDetailActivity.redeemQuestPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.missionPresenter")
    public static void getMin(MissionDetailActivity missionDetailActivity, setForegroundAsync.getMin getmin) {
        missionDetailActivity.missionPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.redeemMissionPresenter")
    public static void length(MissionDetailActivity missionDetailActivity, isUsed.length length) {
        missionDetailActivity.redeemMissionPresenter = length;
    }

    @InjectedFieldSignature("id.dana.promoquest.activity.MissionDetailActivity.dynamicUrlWrapper")
    public static void setMin(MissionDetailActivity missionDetailActivity, getShortName getshortname) {
        missionDetailActivity.dynamicUrlWrapper = getshortname;
    }
}
