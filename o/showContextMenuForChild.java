package o;

import id.dana.social.di.module.SocialWidgetModule;
import o.addSubTitleView;

public final class showContextMenuForChild implements getAdapterPosition<addSubTitleView.length> {
    private final SocialWidgetModule length;

    public static addSubTitleView.length setMax(SocialWidgetModule socialWidgetModule) {
        addSubTitleView.length min = socialWidgetModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        addSubTitleView.length min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
