package o;

import id.dana.contract.feeds.UserFeedsModule;
import o.b;
import o.getScaleY;

public final class getPivotX implements getAdapterPosition<getScaleY.length> {
    private final b.C0007b<getTranslateX> length;
    private final UserFeedsModule setMin;

    private getPivotX(UserFeedsModule userFeedsModule, b.C0007b<getTranslateX> bVar) {
        this.setMin = userFeedsModule;
        this.length = bVar;
    }

    public static getPivotX getMax(UserFeedsModule userFeedsModule, b.C0007b<getTranslateX> bVar) {
        return new getPivotX(userFeedsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getScaleY.length min = this.setMin.setMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
