package o;

import android.app.Application;
import o.b;

public final class PushWindowPoint implements getAdapterPosition<onAppPause> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Application> applicationProvider;

    public PushWindowPoint(b.C0007b<Application> bVar, b.C0007b<AppPausePoint> bVar2) {
        this.applicationProvider = bVar;
        this.amcsManagerProvider = bVar2;
    }

    public final onAppPause get() {
        return newInstance(this.applicationProvider.get(), this.amcsManagerProvider.get());
    }

    public static PushWindowPoint create(b.C0007b<Application> bVar, b.C0007b<AppPausePoint> bVar2) {
        return new PushWindowPoint(bVar, bVar2);
    }

    public static onAppPause newInstance(Application application, AppPausePoint appPausePoint) {
        return new onAppPause(application, appPausePoint);
    }
}
