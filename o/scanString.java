package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverSecurity;
import o.b;

public final class scanString implements getAdapterPosition<GriverSecurity.AnonymousClass1> {
    private final b.C0007b<setWorkerId> length;
    private final ApplicationModule setMax;

    private scanString(ApplicationModule applicationModule, b.C0007b<setWorkerId> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static scanString length(ApplicationModule applicationModule, b.C0007b<setWorkerId> bVar) {
        return new scanString(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverSecurity.AnonymousClass1 length2 = this.setMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
