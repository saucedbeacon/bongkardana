package o;

import id.dana.di.modules.DanaAppWidgetModule;
import o.ViewBoundsCheck$ViewBounds;
import o.b;

public final class writeWithFieldName implements getAdapterPosition<ViewBoundsCheck$ViewBounds.getMin> {
    private final DanaAppWidgetModule getMax;
    private final b.C0007b<collate> setMax;

    private writeWithFieldName(DanaAppWidgetModule danaAppWidgetModule, b.C0007b<collate> bVar) {
        this.getMax = danaAppWidgetModule;
        this.setMax = bVar;
    }

    public static writeWithFieldName length(DanaAppWidgetModule danaAppWidgetModule, b.C0007b<collate> bVar) {
        return new writeWithFieldName(danaAppWidgetModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ViewBoundsCheck$ViewBounds.getMin min = this.getMax.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
