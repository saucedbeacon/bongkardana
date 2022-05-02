package o;

import id.dana.social.contract.share.ShareToFeedsModule;
import o.handleScrollChange;

public final class setRightButtonFont implements getAdapterPosition<handleScrollChange.setMax> {
    private final ShareToFeedsModule setMax;

    private setRightButtonFont(ShareToFeedsModule shareToFeedsModule) {
        this.setMax = shareToFeedsModule;
    }

    public static setRightButtonFont getMax(ShareToFeedsModule shareToFeedsModule) {
        return new setRightButtonFont(shareToFeedsModule);
    }

    public final /* synthetic */ Object get() {
        handleScrollChange.setMax min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
