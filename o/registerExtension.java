package o;

import android.app.Application;
import o.b;

public final class registerExtension implements getAdapterPosition<Plugin> {
    private final b.C0007b<Application> applicationProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;

    public registerExtension(b.C0007b<Application> bVar, b.C0007b<getPerformanceTracker> bVar2) {
        this.applicationProvider = bVar;
        this.deviceInformationProvider = bVar2;
    }

    public final Plugin get() {
        return newInstance(this.applicationProvider.get(), this.deviceInformationProvider.get());
    }

    public static registerExtension create(b.C0007b<Application> bVar, b.C0007b<getPerformanceTracker> bVar2) {
        return new registerExtension(bVar, bVar2);
    }

    public static Plugin newInstance(Application application, getPerformanceTracker getperformancetracker) {
        return new Plugin(application, getperformancetracker);
    }
}
