package o;

import id.dana.challenge.pin.PinChallengeFragment;
import kotlin.jvm.functions.Function1;

public final class isLowRamDevice implements Function1 {
    private final PinChallengeFragment setMin;

    public isLowRamDevice(PinChallengeFragment pinChallengeFragment) {
        this.setMin = pinChallengeFragment;
    }

    public final Object invoke(Object obj) {
        return PinChallengeFragment.length(this.setMin);
    }
}
