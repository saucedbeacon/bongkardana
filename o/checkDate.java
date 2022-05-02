package o;

import android.content.Context;
import id.dana.di.modules.ApplicationModule;
import o.b;

public final class checkDate implements getAdapterPosition<onRelease> {
    private final b.C0007b<Context> getMax;
    private final ApplicationModule setMax;

    private checkDate(ApplicationModule applicationModule, b.C0007b<Context> bVar) {
        this.setMax = applicationModule;
        this.getMax = bVar;
    }

    public static checkDate length(ApplicationModule applicationModule, b.C0007b<Context> bVar) {
        return new checkDate(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onRelease max = this.setMax.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
