package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class isPrimitive implements getAdapterPosition<appxLoadFailed> {
    private final b.C0007b<toggleAllChecked> getMax;
    private final ApplicationModule length;

    private isPrimitive(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static isPrimitive getMin(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        return new isPrimitive(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
