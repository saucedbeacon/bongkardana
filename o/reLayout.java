package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.OnBoardingActivity;
import o.getSelectedIndex;

public final class reLayout implements getBindingAdapter<OnBoardingActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.OnBoardingActivity.onBoardingPresenter")
    public static void getMin(OnBoardingActivity onBoardingActivity, getSelectedIndex.length length) {
        onBoardingActivity.onBoardingPresenter = length;
    }
}
