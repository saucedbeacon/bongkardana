package o;

import id.dana.social.di.module.SocialProfileModule;
import o.b;
import o.getRightButtonIconView;

public final class getLastVisiblePosition implements getAdapterPosition<getRightButtonIconView.setMax> {
    private final SocialProfileModule getMin;
    private final b.C0007b<clearTransientStateViews> setMin;

    public static getRightButtonIconView.setMax getMax(SocialProfileModule socialProfileModule, clearTransientStateViews cleartransientstateviews) {
        getRightButtonIconView.setMax min = socialProfileModule.setMin(cleartransientstateviews);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getRightButtonIconView.setMax min = this.getMin.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
