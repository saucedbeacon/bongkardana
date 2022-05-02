package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.promoquest.views.MissionSummaryView;
import o.getBackgroundExecutor;

public final class exitSession implements getBindingAdapter<MissionSummaryView> {
    @InjectedFieldSignature("id.dana.promoquest.views.MissionSummaryView.missionSummaryPresenter")
    public static void getMin(MissionSummaryView missionSummaryView, getBackgroundExecutor.setMin setmin) {
        missionSummaryView.missionSummaryPresenter = setmin;
    }
}
