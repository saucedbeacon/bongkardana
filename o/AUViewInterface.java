package o;

import id.dana.social.di.module.ActivityReactionsModule;
import o.AUHorizontalListView;
import o.AUSegment;
import o.b;

public final class AUViewInterface implements getAdapterPosition<AUSegment.TabSwitchListener.getMin> {
    private final b.C0007b<AUHorizontalListView.CheckForKeyLongPress> getMax;
    private final ActivityReactionsModule setMin;

    public static AUSegment.TabSwitchListener.getMin getMin(ActivityReactionsModule activityReactionsModule, AUHorizontalListView.CheckForKeyLongPress checkForKeyLongPress) {
        AUSegment.TabSwitchListener.getMin max = activityReactionsModule.getMax(checkForKeyLongPress);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUSegment.TabSwitchListener.getMin max = this.setMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
