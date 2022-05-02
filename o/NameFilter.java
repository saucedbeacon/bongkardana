package o;

import id.dana.di.modules.GContainerModule;
import o.b;

public final class NameFilter implements getAdapterPosition<Constants> {
    private final b.C0007b<GriverSwtich> getMin;
    private final GContainerModule setMax;

    private NameFilter(GContainerModule gContainerModule, b.C0007b<GriverSwtich> bVar) {
        this.setMax = gContainerModule;
        this.getMin = bVar;
    }

    public static NameFilter getMin(GContainerModule gContainerModule, b.C0007b<GriverSwtich> bVar) {
        return new NameFilter(gContainerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        Constants max = this.setMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
