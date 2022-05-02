package o;

import id.dana.contract.login.HoldLoginModule;
import o.registerDataSetObserver;

public final class setViewPagerObserver implements getAdapterPosition<registerDataSetObserver.getMin> {
    private final HoldLoginModule setMin;

    private setViewPagerObserver(HoldLoginModule holdLoginModule) {
        this.setMin = holdLoginModule;
    }

    public static setViewPagerObserver setMax(HoldLoginModule holdLoginModule) {
        return new setViewPagerObserver(holdLoginModule);
    }

    public final /* synthetic */ Object get() {
        registerDataSetObserver.getMin max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
