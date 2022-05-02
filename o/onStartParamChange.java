package o;

import android.app.Application;
import o.b;

public final class onStartParamChange implements getAdapterPosition<VisitUrlPoint> {
    private final b.C0007b<Application> applicationProvider;

    public onStartParamChange(b.C0007b<Application> bVar) {
        this.applicationProvider = bVar;
    }

    public final VisitUrlPoint get() {
        return newInstance(this.applicationProvider.get());
    }

    public static onStartParamChange create(b.C0007b<Application> bVar) {
        return new onStartParamChange(bVar);
    }

    public static VisitUrlPoint newInstance(Application application) {
        return new VisitUrlPoint(application);
    }
}
