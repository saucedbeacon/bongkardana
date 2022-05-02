package o;

import id.dana.contract.feeds.UserFeedsModule;
import o.getScaleY;

public final class getPivotY implements getAdapterPosition<getScaleY.getMin> {
    private final UserFeedsModule getMax;

    private getPivotY(UserFeedsModule userFeedsModule) {
        this.getMax = userFeedsModule;
    }

    public static getPivotY length(UserFeedsModule userFeedsModule) {
        return new getPivotY(userFeedsModule);
    }

    public final /* synthetic */ Object get() {
        getScaleY.getMin length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
