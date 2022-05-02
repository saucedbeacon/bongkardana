package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getSeeAlso implements getAdapterPosition<getId3> {
    private final b.C0007b<getTypeSting> getMin;
    private final ApplicationModule length;

    private getSeeAlso(ApplicationModule applicationModule, b.C0007b<getTypeSting> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static getSeeAlso setMin(ApplicationModule applicationModule, b.C0007b<getTypeSting> bVar) {
        return new getSeeAlso(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getId3 length2 = this.length.length(this.getMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
