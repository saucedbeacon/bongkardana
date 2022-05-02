package o;

import id.dana.social.di.module.FriendsFeedsModule;
import o.setLeftButtonText;

public final class ScrollTitleChangeListener implements getAdapterPosition<setLeftButtonText.getMax> {
    private final FriendsFeedsModule getMax;

    private ScrollTitleChangeListener(FriendsFeedsModule friendsFeedsModule) {
        this.getMax = friendsFeedsModule;
    }

    public static ScrollTitleChangeListener length(FriendsFeedsModule friendsFeedsModule) {
        return new ScrollTitleChangeListener(friendsFeedsModule);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonText.getMax min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
