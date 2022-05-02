package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;

public final class onMotionEventUp implements getBindingAdapter<TwilioIdentityVerificationActivity> {
    @InjectedFieldSignature("id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.twilioIdentityVerificationPresenter")
    public static void getMin(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, TinyAppBackHomeExtension tinyAppBackHomeExtension) {
        twilioIdentityVerificationActivity.twilioIdentityVerificationPresenter = tinyAppBackHomeExtension;
    }

    @InjectedFieldSignature("id.dana.twilio.identityverification.TwilioIdentityVerificationActivity.twilioMixpanelTracker")
    public static void getMax(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, showTwoWheelDialog showtwowheeldialog) {
        twilioIdentityVerificationActivity.twilioMixpanelTracker = showtwowheeldialog;
    }
}
