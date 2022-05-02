package o;

import id.dana.social.di.module.SocialWidgetModule;
import o.b;

public final class getFirstVisiblePosition implements getAdapterPosition<setViewTypeCount> {
    private final b.C0007b<setViewTypeCount> getMin;
    private final SocialWidgetModule setMin;

    public static setViewTypeCount setMax(SocialWidgetModule socialWidgetModule, setViewTypeCount setviewtypecount) {
        setViewTypeCount max = socialWidgetModule.setMax(setviewtypecount);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setViewTypeCount max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
