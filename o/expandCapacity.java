package o;

import id.dana.di.modules.HomeReferralModule;
import o.onAction;

public final class expandCapacity implements getAdapterPosition<onAction.length> {
    private final HomeReferralModule getMax;

    private expandCapacity(HomeReferralModule homeReferralModule) {
        this.getMax = homeReferralModule;
    }

    public static expandCapacity getMax(HomeReferralModule homeReferralModule) {
        return new expandCapacity(homeReferralModule);
    }

    public final /* synthetic */ Object get() {
        onAction.length max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
