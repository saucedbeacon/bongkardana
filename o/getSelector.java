package o;

import id.dana.social.di.module.SocialCommonModule;
import o.getSelectedIndex;

public final class getSelector implements getAdapterPosition<getSelectedIndex.setMax> {
    private final SocialCommonModule setMin;

    private getSelector(SocialCommonModule socialCommonModule) {
        this.setMin = socialCommonModule;
    }

    public static getSelector getMax(SocialCommonModule socialCommonModule) {
        return new getSelector(socialCommonModule);
    }

    public final /* synthetic */ Object get() {
        getSelectedIndex.setMax max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
