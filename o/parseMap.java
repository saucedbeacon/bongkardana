package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class parseMap implements getAdapterPosition<H5Utils> {
    private final ApplicationModule getMin;
    private final b.C0007b<isReceivedRemoteReady> setMax;

    private parseMap(ApplicationModule applicationModule, b.C0007b<isReceivedRemoteReady> bVar) {
        this.getMin = applicationModule;
        this.setMax = bVar;
    }

    public static parseMap setMin(ApplicationModule applicationModule, b.C0007b<isReceivedRemoteReady> bVar) {
        return new parseMap(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        H5Utils max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
