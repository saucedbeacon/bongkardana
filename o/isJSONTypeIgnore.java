package o;

import id.dana.di.modules.NearbyMeModule;
import o.setTextSpacing;

public final class isJSONTypeIgnore implements getAdapterPosition<setTextSpacing.getMin> {
    private final NearbyMeModule getMax;

    private isJSONTypeIgnore(NearbyMeModule nearbyMeModule) {
        this.getMax = nearbyMeModule;
    }

    public static isJSONTypeIgnore setMin(NearbyMeModule nearbyMeModule) {
        return new isJSONTypeIgnore(nearbyMeModule);
    }

    public final /* synthetic */ Object get() {
        setTextSpacing.getMin max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
