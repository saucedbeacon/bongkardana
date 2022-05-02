package o;

import id.dana.social.di.module.SocialProfileModule;
import o.getRightButtonIconView;

public final class setChoiceMode implements getAdapterPosition<getRightButtonIconView.length> {
    private final SocialProfileModule getMin;

    public static getRightButtonIconView.length getMax(SocialProfileModule socialProfileModule) {
        getRightButtonIconView.length min = socialProfileModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getRightButtonIconView.length min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
