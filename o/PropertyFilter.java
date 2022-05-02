package o;

import id.dana.di.modules.GContainerModule;

public final class PropertyFilter implements getAdapterPosition<getCancelListeners$core> {
    private final GContainerModule getMin;

    private PropertyFilter(GContainerModule gContainerModule) {
        this.getMin = gContainerModule;
    }

    public static PropertyFilter getMin(GContainerModule gContainerModule) {
        return new PropertyFilter(gContainerModule);
    }

    public final /* synthetic */ Object get() {
        getCancelListeners$core min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
