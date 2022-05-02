package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanLongValue implements getAdapterPosition<appxLoadFailed> {
    private final ApplicationModule getMin;
    private final b.C0007b<toggleAllChecked> length;

    private scanLongValue(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static scanLongValue getMin(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        return new scanLongValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed max = this.getMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
