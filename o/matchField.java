package o;

import id.dana.di.modules.ApplicationModule;
import o.DefaultNativeBridge;
import o.b;

public final class matchField implements getAdapterPosition<isShown> {
    private final b.C0007b<DefaultNativeBridge.AnonymousClass1> getMin;
    private final ApplicationModule length;

    private matchField(ApplicationModule applicationModule, b.C0007b<DefaultNativeBridge.AnonymousClass1> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static matchField getMax(ApplicationModule applicationModule, b.C0007b<DefaultNativeBridge.AnonymousClass1> bVar) {
        return new matchField(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isShown max = this.length.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
