package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class deserialze implements getAdapterPosition<shouldApplyPermission> {
    private final ApplicationModule getMax;
    private final b.C0007b<changeTabBarStyle> length;

    private deserialze(ApplicationModule applicationModule, b.C0007b<changeTabBarStyle> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static deserialze getMin(ApplicationModule applicationModule, b.C0007b<changeTabBarStyle> bVar) {
        return new deserialze(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        shouldApplyPermission length2 = this.getMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
