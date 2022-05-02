package o;

import id.dana.di.modules.PinChallengeModule;
import o.isMainThread;

public final class setExtensionImpl implements getAdapterPosition<isMainThread.getMin> {
    private final PinChallengeModule length;

    private setExtensionImpl(PinChallengeModule pinChallengeModule) {
        this.length = pinChallengeModule;
    }

    public static setExtensionImpl setMin(PinChallengeModule pinChallengeModule) {
        return new setExtensionImpl(pinChallengeModule);
    }

    public final /* synthetic */ Object get() {
        isMainThread.getMin min = this.length.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
