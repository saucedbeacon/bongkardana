package o;

import id.dana.di.modules.DanaContactModule;
import o.b;
import o.moveToStart;

public final class applyName implements getAdapterPosition<moveToStart.setMin> {
    private final b.C0007b<canChildScrollUp> getMax;
    private final DanaContactModule setMin;

    public static moveToStart.setMin setMax(DanaContactModule danaContactModule, canChildScrollUp canchildscrollup) {
        moveToStart.setMin min = danaContactModule.getMin(canchildscrollup);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        moveToStart.setMin min = this.setMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
