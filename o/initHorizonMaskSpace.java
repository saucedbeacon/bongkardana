package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.view.ActivityReactionsBottomSheetDialog;
import o.setLeftButtonFont;

public final class initHorizonMaskSpace implements getBindingAdapter<ActivityReactionsBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.social.view.ActivityReactionsBottomSheetDialog.presenter")
    public static void getMin(ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog, setLeftButtonFont.getMin getmin) {
        activityReactionsBottomSheetDialog.presenter = getmin;
    }
}
