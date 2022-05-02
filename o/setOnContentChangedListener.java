package o;

import id.dana.social.di.module.MyFeedsModule;
import o.b;
import o.getBackButton;

public final class setOnContentChangedListener implements getAdapterPosition<getBackButton.length> {
    private final MyFeedsModule getMax;
    private final b.C0007b<setIconFont> getMin;

    private setOnContentChangedListener(MyFeedsModule myFeedsModule, b.C0007b<setIconFont> bVar) {
        this.getMax = myFeedsModule;
        this.getMin = bVar;
    }

    public static setOnContentChangedListener length(MyFeedsModule myFeedsModule, b.C0007b<setIconFont> bVar) {
        return new setOnContentChangedListener(myFeedsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBackButton.length max = this.getMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
