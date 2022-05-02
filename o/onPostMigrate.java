package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.challenge.pin.PinChallengeFragment;
import o.isMainThread;

public final class onPostMigrate implements getBindingAdapter<PinChallengeFragment> {
    @InjectedFieldSignature("id.dana.challenge.pin.PinChallengeFragment.dynamicUrlWrapper")
    public static void getMin(PinChallengeFragment pinChallengeFragment, getShortName getshortname) {
        pinChallengeFragment.dynamicUrlWrapper = getshortname;
    }

    @InjectedFieldSignature("id.dana.challenge.pin.PinChallengeFragment.presenter")
    public static void getMax(PinChallengeFragment pinChallengeFragment, isMainThread.getMax getmax) {
        pinChallengeFragment.presenter = getmax;
    }
}
