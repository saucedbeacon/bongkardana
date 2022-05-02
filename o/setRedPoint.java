package o;

import id.dana.social.di.module.MyFeedsModule;
import o.getBackButton;

public final class setRedPoint implements getAdapterPosition<getBackButton.getMin> {
    private final MyFeedsModule setMin;

    private setRedPoint(MyFeedsModule myFeedsModule) {
        this.setMin = myFeedsModule;
    }

    public static setRedPoint setMax(MyFeedsModule myFeedsModule) {
        return new setRedPoint(myFeedsModule);
    }

    public final /* synthetic */ Object get() {
        getBackButton.getMin min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
