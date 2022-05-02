package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class nextTokenWithChar implements getAdapterPosition<GriverBaseConstants> {
    private final b.C0007b<setTitleColor> getMin;
    private final ApplicationModule length;

    private nextTokenWithChar(ApplicationModule applicationModule, b.C0007b<setTitleColor> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static nextTokenWithChar setMin(ApplicationModule applicationModule, b.C0007b<setTitleColor> bVar) {
        return new nextTokenWithChar(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverBaseConstants length2 = this.length.length(this.getMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
