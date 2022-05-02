package o;

import id.dana.social.contract.share.ShareToFeedsModule;
import o.b;
import o.handleScrollChange;

public final class setRightButtonEnabled implements getAdapterPosition<handleScrollChange.getMin> {
    private final b.C0007b<attachFlagToRightBtn> getMax;
    private final ShareToFeedsModule setMin;

    private setRightButtonEnabled(ShareToFeedsModule shareToFeedsModule, b.C0007b<attachFlagToRightBtn> bVar) {
        this.setMin = shareToFeedsModule;
        this.getMax = bVar;
    }

    public static setRightButtonEnabled setMin(ShareToFeedsModule shareToFeedsModule, b.C0007b<attachFlagToRightBtn> bVar) {
        return new setRightButtonEnabled(shareToFeedsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        handleScrollChange.getMin length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
