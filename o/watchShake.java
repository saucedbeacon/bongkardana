package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.onboarding.IntroductionActivity;
import o.stopMonitorMemoryWarning;

public final class watchShake implements getBindingAdapter<IntroductionActivity> {
    @InjectedFieldSignature("id.dana.onboarding.IntroductionActivity.deviceInformationProvider")
    public static void length(IntroductionActivity introductionActivity, getPerformanceTracker getperformancetracker) {
        introductionActivity.deviceInformationProvider = getperformancetracker;
    }

    @InjectedFieldSignature("id.dana.onboarding.IntroductionActivity.mixpanelEnablePresenter")
    public static void length(IntroductionActivity introductionActivity, stopMonitorMemoryWarning.getMin getmin) {
        introductionActivity.mixpanelEnablePresenter = getmin;
    }
}
