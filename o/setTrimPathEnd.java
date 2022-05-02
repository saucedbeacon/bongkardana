package o;

import id.dana.contract.exploredana.ExploreDanaModule;
import o.getTrimPathStart;

public final class setTrimPathEnd implements getAdapterPosition<getTrimPathStart.length> {
    private final ExploreDanaModule setMax;

    private setTrimPathEnd(ExploreDanaModule exploreDanaModule) {
        this.setMax = exploreDanaModule;
    }

    public static setTrimPathEnd setMax(ExploreDanaModule exploreDanaModule) {
        return new setTrimPathEnd(exploreDanaModule);
    }

    public final /* synthetic */ Object get() {
        getTrimPathStart.length max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
