package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class writeBefore implements getAdapterPosition<dynamicProxy> {
    private final ApplicationModule getMin;
    private final b.C0007b<onFragmentCreate> length;

    private writeBefore(ApplicationModule applicationModule, b.C0007b<onFragmentCreate> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static writeBefore setMin(ApplicationModule applicationModule, b.C0007b<onFragmentCreate> bVar) {
        return new writeBefore(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        dynamicProxy max = this.getMin.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
