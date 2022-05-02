package o;

import id.dana.di.modules.SubMenuModule;
import o.GriverShareExtensionImpl;
import o.b;
import o.captureScreen;

public final class GriverEvents implements getAdapterPosition<captureScreen.length> {
    private final b.C0007b<GriverShareExtensionImpl.AnonymousClass3> length;
    private final SubMenuModule setMax;

    public static captureScreen.length setMin(SubMenuModule subMenuModule, GriverShareExtensionImpl.AnonymousClass3 r1) {
        captureScreen.length min = subMenuModule.getMin(r1);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        captureScreen.length min = this.setMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
