package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;

public final class onResumeFragments implements ComponentFactory {
    private final CrashlyticsRegistrar length;

    public onResumeFragments(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.length = crashlyticsRegistrar;
    }

    public final Object create(ComponentContainer componentContainer) {
        return this.length.buildCrashlytics(componentContainer);
    }
}
