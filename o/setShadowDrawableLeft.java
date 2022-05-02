package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.challenge.verifypush.VerifyPushChallengeFragment;

public final class setShadowDrawableLeft implements getBindingAdapter<VerifyPushChallengeFragment> {
    @InjectedFieldSignature("id.dana.challenge.verifypush.VerifyPushChallengeFragment.verifyPushLoginPresenter")
    public static void length(VerifyPushChallengeFragment verifyPushChallengeFragment, onPanelDragged onpaneldragged) {
        verifyPushChallengeFragment.verifyPushLoginPresenter = onpaneldragged;
    }

    @InjectedFieldSignature("id.dana.challenge.verifypush.VerifyPushChallengeFragment.twilioMixpanelTracker")
    public static void setMax(VerifyPushChallengeFragment verifyPushChallengeFragment, showTwoWheelDialog showtwowheeldialog) {
        verifyPushChallengeFragment.twilioMixpanelTracker = showtwowheeldialog;
    }
}
