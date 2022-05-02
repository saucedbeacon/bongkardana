package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class matchFieldHash implements getAdapterPosition<requestPermission> {
    private final ApplicationModule getMin;
    private final b.C0007b<contains> length;

    private matchFieldHash(ApplicationModule applicationModule, b.C0007b<contains> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static matchFieldHash setMax(ApplicationModule applicationModule, b.C0007b<contains> bVar) {
        return new matchFieldHash(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        requestPermission length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
