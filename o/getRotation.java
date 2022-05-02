package o;

import id.dana.contract.feeds.GlobalFeedsModule;
import o.b;
import o.setTrimPathOffset;

public final class getRotation implements getAdapterPosition<setTrimPathOffset.setMax> {
    private final GlobalFeedsModule getMax;
    private final b.C0007b<getLocalMatrix> setMin;

    private getRotation(GlobalFeedsModule globalFeedsModule, b.C0007b<getLocalMatrix> bVar) {
        this.getMax = globalFeedsModule;
        this.setMin = bVar;
    }

    public static getRotation setMax(GlobalFeedsModule globalFeedsModule, b.C0007b<getLocalMatrix> bVar) {
        return new getRotation(globalFeedsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setTrimPathOffset.setMax max = this.getMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
