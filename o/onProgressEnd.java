package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;

public final class onProgressEnd implements getBindingAdapter<TwilioIntroductionActivity> {
    @InjectedFieldSignature("id.dana.twilio.onboarding.TwilioIntroductionActivity.twilioIntroductionPresenter")
    public static void setMin(TwilioIntroductionActivity twilioIntroductionActivity, showBackHome showbackhome) {
        twilioIntroductionActivity.twilioIntroductionPresenter = showbackhome;
    }
}
