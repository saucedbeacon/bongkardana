package o;

import id.dana.social.di.module.ActivityReactionsModule;
import o.AUSegment;

public final class setIconfontFonts implements getAdapterPosition<AUSegment.TabSwitchListener.getMax> {
    private final ActivityReactionsModule setMax;

    public static AUSegment.TabSwitchListener.getMax setMin(ActivityReactionsModule activityReactionsModule) {
        AUSegment.TabSwitchListener.getMax min = activityReactionsModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUSegment.TabSwitchListener.getMax min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
