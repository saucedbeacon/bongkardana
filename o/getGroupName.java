package o;

import id.dana.contract.feeds.GlobalFeedsModule;
import o.setTrimPathOffset;

public final class getGroupName implements getAdapterPosition<setTrimPathOffset.setMin> {
    private final GlobalFeedsModule getMax;

    private getGroupName(GlobalFeedsModule globalFeedsModule) {
        this.getMax = globalFeedsModule;
    }

    public static getGroupName getMin(GlobalFeedsModule globalFeedsModule) {
        return new getGroupName(globalFeedsModule);
    }

    public final /* synthetic */ Object get() {
        setTrimPathOffset.setMin length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
