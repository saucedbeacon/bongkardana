package o;

import id.dana.contract.exploredana.ExploreDanaModule;
import o.b;
import o.getTrimPathStart;

public final class getTrimPathEnd implements getAdapterPosition<getTrimPathStart.getMax> {
    private final b.C0007b<setFillAlpha> getMin;
    private final ExploreDanaModule setMax;

    public static getTrimPathStart.getMax getMin(ExploreDanaModule exploreDanaModule, setFillAlpha setfillalpha) {
        getTrimPathStart.getMax min = exploreDanaModule.getMin(setfillalpha);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getTrimPathStart.getMax min = this.setMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
