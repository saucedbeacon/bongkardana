package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class popContext implements getAdapterPosition<setMediaPlaybackRequiresUserGesture> {
    private final b.C0007b<getData> length;
    private final ApplicationModule setMax;

    private popContext(ApplicationModule applicationModule, b.C0007b<getData> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static popContext length(ApplicationModule applicationModule, b.C0007b<getData> bVar) {
        return new popContext(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setMediaPlaybackRequiresUserGesture min = this.setMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
