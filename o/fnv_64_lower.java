package o;

import id.dana.di.modules.NewNearbyMeModule;
import o.getOffscreenPageLimit;

public final class fnv_64_lower implements getAdapterPosition<getOffscreenPageLimit.setMax> {
    private final NewNearbyMeModule getMin;

    private fnv_64_lower(NewNearbyMeModule newNearbyMeModule) {
        this.getMin = newNearbyMeModule;
    }

    public static fnv_64_lower getMin(NewNearbyMeModule newNearbyMeModule) {
        return new fnv_64_lower(newNearbyMeModule);
    }

    public final /* synthetic */ Object get() {
        getOffscreenPageLimit.setMax max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
