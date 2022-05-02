package o;

import id.dana.di.modules.DanaContactModule;
import o.moveToStart;

public final class processValue implements getAdapterPosition<moveToStart.getMin> {
    private final DanaContactModule getMax;

    public static moveToStart.getMin getMin(DanaContactModule danaContactModule) {
        moveToStart.getMin max = danaContactModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        moveToStart.getMin max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
