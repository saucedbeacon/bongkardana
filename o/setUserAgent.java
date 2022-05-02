package o;

import id.dana.di.modules.SplitModule;
import o.sendLocation;

public final class setUserAgent implements getAdapterPosition<sendLocation.setMin> {
    private final SplitModule setMin;

    private setUserAgent(SplitModule splitModule) {
        this.setMin = splitModule;
    }

    public static setUserAgent length(SplitModule splitModule) {
        return new setUserAgent(splitModule);
    }

    public final /* synthetic */ Object get() {
        sendLocation.setMin min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
