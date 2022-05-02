package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setDateFormat implements getAdapterPosition<getMediaPlaybackRequiresUserGesture> {
    private final ApplicationModule getMax;
    private final b.C0007b<waitForSetup> setMin;

    private setDateFormat(ApplicationModule applicationModule, b.C0007b<waitForSetup> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static setDateFormat setMax(ApplicationModule applicationModule, b.C0007b<waitForSetup> bVar) {
        return new setDateFormat(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getMediaPlaybackRequiresUserGesture min = this.getMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
