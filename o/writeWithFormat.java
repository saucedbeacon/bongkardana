package o;

import id.dana.di.modules.DanaAppWidgetModule;
import o.ViewBoundsCheck$ViewBounds;

public final class writeWithFormat implements getAdapterPosition<ViewBoundsCheck$ViewBounds.setMin> {
    private final DanaAppWidgetModule getMax;

    private writeWithFormat(DanaAppWidgetModule danaAppWidgetModule) {
        this.getMax = danaAppWidgetModule;
    }

    public static writeWithFormat setMax(DanaAppWidgetModule danaAppWidgetModule) {
        return new writeWithFormat(danaAppWidgetModule);
    }

    public final /* synthetic */ Object get() {
        ViewBoundsCheck$ViewBounds.setMin max = this.getMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
