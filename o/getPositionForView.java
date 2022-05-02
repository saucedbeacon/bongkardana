package o;

import id.dana.social.di.module.SocialWidgetModule;
import o.addSubTitleView;
import o.b;

public final class getPositionForView implements getAdapterPosition<addSubTitleView.getMin> {
    private final b.C0007b<getScrapView> getMax;
    private final SocialWidgetModule setMax;

    public static addSubTitleView.getMin getMax(SocialWidgetModule socialWidgetModule, getScrapView getscrapview) {
        addSubTitleView.getMin min = socialWidgetModule.setMin(getscrapview);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        addSubTitleView.getMin min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
