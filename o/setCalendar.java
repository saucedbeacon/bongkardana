package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setCalendar implements getAdapterPosition<GriverWhiteScreenStageMonitor> {
    private final ApplicationModule length;
    private final b.C0007b<isRemoteCallExtension> setMin;

    private setCalendar(ApplicationModule applicationModule, b.C0007b<isRemoteCallExtension> bVar) {
        this.length = applicationModule;
        this.setMin = bVar;
    }

    public static setCalendar setMax(ApplicationModule applicationModule, b.C0007b<isRemoteCallExtension> bVar) {
        return new setCalendar(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverWhiteScreenStageMonitor length2 = this.length.length(this.setMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
