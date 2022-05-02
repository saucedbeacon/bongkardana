package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.promoquest.activity.MissionListActivity;
import o.setProgressAsync;

public final class setPortrait implements getBindingAdapter<MissionListActivity> {
    @InjectedFieldSignature("id.dana.promoquest.activity.MissionListActivity.presenter")
    public static void getMax(MissionListActivity missionListActivity, setProgressAsync.length length) {
        missionListActivity.presenter = length;
    }
}
