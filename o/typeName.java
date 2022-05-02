package o;

import android.app.Application;
import id.dana.di.modules.ApplicationModule;

public final class typeName implements getAdapterPosition<Application> {
    private final ApplicationModule setMax;

    private typeName(ApplicationModule applicationModule) {
        this.setMax = applicationModule;
    }

    public static typeName getMax(ApplicationModule applicationModule) {
        return new typeName(applicationModule);
    }

    public final /* synthetic */ Object get() {
        Application min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
