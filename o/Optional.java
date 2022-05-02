package o;

import id.dana.contract.staticqr.GetStaticQrModule;
import o.OnTouch;

public final class Optional implements getAdapterPosition<OnTouch.length> {
    private final GetStaticQrModule length;

    private Optional(GetStaticQrModule getStaticQrModule) {
        this.length = getStaticQrModule;
    }

    public static Optional getMax(GetStaticQrModule getStaticQrModule) {
        return new Optional(getStaticQrModule);
    }

    public final /* synthetic */ Object get() {
        OnTouch.length max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
